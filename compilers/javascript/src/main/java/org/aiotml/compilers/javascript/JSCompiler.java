/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.aiotml.compilers.javascript;

import java.util.LinkedList;
import java.util.List;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.builder.Section;
import org.aiotml.compilers.builder.SourceBuilder;
import org.aiotml.compilers.configuration.CfgBuildCompiler;
import org.aiotml.compilers.configuration.CfgMainGenerator;
import org.aiotml.compilers.thing.ThingActionCompiler;
import org.aiotml.compilers.thing.ThingApiCompiler;
import org.aiotml.compilers.thing.common.NewFSMBasedThingImplCompiler;
import org.aiotml.compilers.utils.OpaqueAiotMLCompiler;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.EnumerationLiteral;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.SubThing;
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.Property;

public abstract class JSCompiler extends OpaqueAiotMLCompiler {

	public JSCompiler(ThingActionCompiler thingActionCompiler, ThingApiCompiler thingApiCompiler,
			CfgMainGenerator mainCompiler, CfgBuildCompiler cfgBuildCompiler, NewFSMBasedThingImplCompiler thingImplCompiler) {
		super(thingActionCompiler, thingApiCompiler, mainCompiler, cfgBuildCompiler, thingImplCompiler);
		this.ctx = new JSContext(this);
	}

	@Override
    public boolean do_call_compiler(Configuration cfg, Logger log, String... options) {
        ctx.addContextAnnotation("thisRef", "this.");
        //new File(ctx.getOutputDirectory() + "/" + cfg.getName()).mkdirs();
        ctx.setCurrentConfiguration(cfg);
        System.out.println("will do compile");
        compile(cfg, AiotMLHelpers.findContainingModel(cfg), true, ctx);
        ctx.getCompiler().getCfgBuildCompiler().generateDockerFile(cfg, ctx);
        ctx.getCompiler().getCfgBuildCompiler().generateBuildScript(cfg, ctx);
        ctx.writeGeneratedCodeToFiles();
        ctx.generateNetworkLibs(cfg);
//        ctx.generateStrategyLibs(cfg);
        return true;
    }
	
	protected void exports(StringBuilder events, String e) {
		events.append("exports." + e + " = " + e + ";\n\n");
	}
	
	protected void generateSubThings(Configuration cfg) {
		
//		subthingsbuilder.append("// This is subthing for agent!\n");
//		subthingsbuilder.append("const util = require('util')\n");
		for(SubThing s : ConfigurationHelper.allSubThings(cfg)) {
			StringBuilder subthingsbuilder = ctx.getBuilder(ctx.firstToUpper(s.getName()) + ".js");	
			subthingsbuilder.append("function " + ctx.firstToUpper(s.getName()) +"()" + "{\n");
			
			for(Property p : s.getProperties()) {
//				if (p.isReadonly()) continue;
//				subthingsbuilder.append("this." + ctx.getVariableName(p) + " = ");
//				System.out.println(ctx.getVariableName(p));
				if (p.getTypeRef().getCardinality() != null || p.getTypeRef().isIsArray()) {
//					subthingsbuilder.append("this." + ctx.getVariableName(p) + " = []");
					subthingsbuilder.append("this." + p.getName() + " = []");
				} else {
//					subthingsbuilder.append("this." + ctx.getVariableName(p) + " = ");
					subthingsbuilder.append("this." + p.getName() + " = ");
					if (p.getInit() != null) {
						ctx.getCompiler().getThingActionCompiler().generate(p.getInit(), subthingsbuilder, ctx);
					} else {
						subthingsbuilder.append(((JSContext)ctx).getDefaultValue(p.getTypeRef().getType()));
					}
				}

				
				subthingsbuilder.append(";\n");
			}
			
			subthingsbuilder.append("}\n");
			subthingsbuilder.append("exports."+ctx.firstToUpper(s.getName())+"="+ctx.firstToUpper(s.getName())+";\n");
		}
		
		
		System.out.println("generate SubThings");
	}
	
	protected void generateEvents(Configuration cfg) {
		StringBuilder events = ctx.getBuilder("events.js");								
		for(Message m : ConfigurationHelper.allMessages(cfg)) {			
			events.append("var " + ctx.firstToUpper(m.getName()) + " = /** @class */ (function () {\n");
			events.append("  function " + ctx.firstToUpper(m.getName()) + "(port,...params) {\n");
			events.append("    this.type = '" + m.getName() + "';\n");
			events.append("    this.port = port;\n");
			StringBuilder params = new StringBuilder();
			for(Parameter p : m.getParameters()) {
				events.append("    this." + p.getName() + " = params[" + m.getParameters().indexOf(p) + "];\n");
				if (m.getParameters().indexOf(p) > 0)
					params.append(" + ', ' + ");
				params.append(p.getName());
			}
			events.append("  }\n\n");
			events.append("  " + ctx.firstToUpper(m.getName()) + ".prototype.is = function (type) {\n");
			events.append("    return this.type === type;\n");
			events.append("  };\n\n");
			events.append("  " + ctx.firstToUpper(m.getName()) + ".prototype.toString = function () {\n");
			events.append("    return 'event ' + this.type + '?' + this.port + '(' + " + params + " + ')';\n");
			events.append("  };\n\n");
			events.append("  return " + ctx.firstToUpper(m.getName()) + ";\n");
			events.append("}());\n");
			exports(events, ctx.firstToUpper(m.getName()));
		}		
	}
	
	abstract protected String getEnumPath(Configuration t, AiotMLModel model, Context ctx);
	protected void generateEnums(Configuration t, AiotMLModel model, Context ctx) {
		List<Enumeration> enums = new LinkedList<Enumeration>();
		
		for (Type ty : AiotMLHelpers.allTypes/*allUsedSimpleTypes*/(model))
            if (ty instanceof Enumeration)
            	enums.add((Enumeration)ty);
		 
		if (!enums.isEmpty()) {
			ctx.addContextAnnotation("hasEnum", "true");
			SourceBuilder builder = ctx.getSourceBuilder(getEnumPath(t, model, ctx));
			
			for (Enumeration e : enums) {
				Section sec = builder.section("enumeration").lines();
				sec.comment("Definition of Enumeration "+e.getName());
				sec.append("const "+e.getName()+"_ENUM = Object.freeze({");
				Section literals = sec.section("literals").lines().indent();
				for (EnumerationLiteral l : e.getLiterals()) {
					Section literal = literals.section("literal");
					literal.append(l.getName().toUpperCase()).append(": ");										
					if (e.getTypeRef() == null) {
						String val = AnnotatedElementHelper.annotationOrElse(l, "enum_val", l.getName());
						try {
							literal.append(Integer.parseInt(val));
						} catch (NumberFormatException ex) {
							literal.append('\'').append(val).append('\'');
						}
					}
					else {
						final StringBuilder temp = new java.lang.StringBuilder();
						ctx.getCompiler().getThingActionCompiler().generate(l.getInit(), temp, ctx);
						literal.append(temp.toString());
					}											
					literal.append(",");
				}
				sec.append("});");
				sec.append("exports."+e.getName()+"_ENUM = "+e.getName()+"_ENUM;");
				sec.append("");
			}
		}
	}

    private void compile(Configuration t, AiotMLModel model, boolean isNode, Context ctx) {
        generateEnums(t, model, ctx);
        generateEvents(t);
        generateSubThings(t);
        
        for (Thing thing : ConfigurationHelper.allThings(t)) {
            ctx.getCompiler().getThingImplCompiler().generateImplementation(thing, ctx);
        }
        ctx.getCompiler().getMainCompiler().generateMainAndInit(t, model, ctx);
    }
}
