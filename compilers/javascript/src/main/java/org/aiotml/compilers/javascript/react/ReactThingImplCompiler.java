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
package org.aiotml.compilers.javascript.react;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.builder.Section;
import org.aiotml.compilers.javascript.JSContext;
import org.aiotml.compilers.javascript.JSSourceBuilder;
import org.aiotml.compilers.javascript.JSSourceBuilder.ES6Class;
import org.aiotml.compilers.javascript.JSSourceBuilder.JSClass;
import org.aiotml.compilers.javascript.JSSourceBuilder.JSFunction;
import org.aiotml.compilers.javascript.JSThingImplCompiler;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Session;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Thing;

public class ReactThingImplCompiler extends JSThingImplCompiler {
	@Override
	protected String getThingPath(Thing thing, JSContext jctx) {
		return "src/"+jctx.firstToUpper(thing.getName())+".js";
	}

	@Override
	protected Section createMainSection(Thing thing, JSSourceBuilder builder, JSContext jctx) {
		// Add imports
		Section imports = builder.section("imports").lines();
		imports.append("import React from 'react';");
		imports.append("import {extendObservable, observable} from 'mobx';");
		imports.append("import {StateJS, Wrapper} from '../lib/Wrappers.js';");
		imports.append("const EventEmitter = require('events').EventEmitter;");
		builder.append("");
		
		ReactTemplates.thingImports(thing, imports, jctx);
		
		Section main = builder.section("main").lines();
		
		builder.append("export default "+jctx.firstToUpper(thing.getName()));
		
		return main;
	}

	@Override
	protected JSClass newThingClass(Thing thing, Section parent, JSContext jctx) {
		ES6Class component = JSSourceBuilder.es6Class(parent, jctx.firstToUpper(thing.getName()));
		
		// Add rendering template
		JSFunction render = component.addMethod("render");
		ReactTemplates.thingRender(thing, render.body(), jctx);
		
		JSFunction statemachine = component.addMethod("getstatemachine");
		statemachine.body().append("return <Wrapper instance={this._statemachine} />;");
		
		if (ThingHelper.hasSession(thing)) {
			JSFunction sessions = component.addMethod("getsessions");
			sessions.addArgument("...names");
			{
				Section body = sessions.body();
				body.append("const result = [];");
				body.append("if (names.length == 0) {");
				Section ifBody = body.section("if").indent().lines();
				ifBody.append("this.forks.forEach((fork, i) => {");
				ifBody.section("forEach").lines().indent().append("result.push(<Wrapper key={fork.name+i} instance={fork}/>);");
				ifBody.append("});");
				body.append("} else {");
				Section elseBody = body.section("else").indent().lines();
				elseBody.append("this.forks.forEach((fork, i) => {");
				Section forBody = elseBody.section("forEach").lines().indent();
				forBody.append("if (fork.name == name) {");
				forBody.section("if").lines().indent().append("result.push(<Wrapper key={fork.name+i} instance={fork}/>);");
				forBody.append("}");
				elseBody.append("});");
				body.append("}");
				body.append("return result;");
			}
		}
		
		return component;
	}
	
	@Override
	protected void generateChildren(Thing thing, Section parent, JSContext jctx) {
		parent.comment("Children");
		parent.append("this.forks = observable.array();");
		parent.append("");
	}
	
	protected void generateProperties(Thing thing, Section parent, JSContext jctx) {
		parent.append("extendObservable(this, {");
		Section properties = parent.section("properties").lines().indent();
		parent.append("});");
		parent.append("");
		
		Section debugProperties = parent.section("debug-properties").lines();
		
		
		for (Property p : ThingHelper.allPropertiesInDepth(thing)) {
		//for (Property p : ThingHelper.allUsedProperties(thing)) { //FIXME: allUsedProperties does not work in some cases where we use includes...
			Section property = properties.section("property");
			if (AnnotatedElementHelper.isDefined(p, "private", "true") || !(p.eContainer() instanceof Thing)) {
				property.append(AiotMLElementHelper.qname(p, "_") + "_var: ");
				Expression initExp = ThingHelper.initExpression(thing, p);
				if (initExp != null)
					jctx.getCompiler().getThingActionCompiler().generate(initExp, property.stringbuilder("initexpression"), jctx);
				else
					property.append("undefined");
				property.append(",");
			} else {
				property.append(AiotMLElementHelper.qname(p, "_") + "_var: " + AiotMLElementHelper.qname(p, "_") + "_var,");
				Section debugProperty = debugProperties.section("property");
				debugProperty.append("this.debug_" + AiotMLElementHelper.qname(p, "_") + "_var = " + AiotMLElementHelper.qname(p, "_") + "_var;");
			}
		}
	}
	
	/* -- Generate templates for states -- */
	@Override
	protected void generateStateMachine(CompositeState sm, Section section, Context ctx) {
		super.generateStateMachine(sm, section, ctx);
		section.append("this._statemachine.template((state) => {");
		Section render = section.section("render").lines().indent();
		ReactTemplates.statecontainerRender(sm, "Statechart", render, (JSContext)ctx);
		section.append("});");
	}
	
	@Override
	protected void generateCompositeState(StateContainer cs, Section section, Context ctx) {
		super.generateCompositeState(cs, section, ctx);
		if (cs instanceof Session) {
			section.append("this._statemachine.template((state) => {");
			Section render = section.section("render").lines().indent();
			ReactTemplates.statecontainerRender(cs, "Session", render, (JSContext)ctx);
			section.append("});");
		} else {
			section.append(AiotMLElementHelper.qname(cs, "_")+".template((state) => {");
			Section render = section.section("render").lines().indent();
			ReactTemplates.statecontainerRender(cs, "Composite state", render, (JSContext)ctx);
			section.append("});");
		}
	}
	
	@Override
	public void generateRegion(StateContainer r, Section section, Context ctx) {
		super.generateRegion(r, section, ctx);
		section.append(AiotMLElementHelper.qname(r, "_")+"_reg.template((state) => {");
		Section render = section.section("render").lines().indent();
		ReactTemplates.statecontainerRender(r, "Region", render, (JSContext)ctx);
		section.append("});");
	}
	
	@Override
	protected void generateAtomicState(State s, Section section, Context ctx) {
		super.generateAtomicState(s, section, ctx);
		section.append(AiotMLElementHelper.qname(s, "_")+".template((state) => {");
		Section render = section.section("render").lines().indent();
		ReactTemplates.stateRender(s, render, (JSContext)ctx);
		section.append("});");
	}
}
