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

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.aiotml.compilers.builder.Section;
import org.aiotml.compilers.javascript.JSContext;
import org.aiotml.compilers.utils.AiotMLInjector;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.services.AiotMLGrammarAccess;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.FinalState;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.ReturnAction;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;

public class ReactTemplates {
	private static Section renderReturn(Section parent) {
		parent.append("return (");
		Section renderReturn = parent.section("render-return").lines().indent();
		parent.append(");");
		return renderReturn;
	}
	
	private static Pattern aiotMLSection = Pattern.compile("&([^&\\n]+)&");
	
	private static <T extends Action> String parseAsAction(String action, ParserRule rule, EObject parent, ActionBlock block, JSContext jctx) {
		try {
			T parsed = AiotMLInjector.parseString(rule, action);
			if (parsed != null) {
				block.getActions().add(parsed);
				AiotMLInjector.linkFrom(parent);
				StringBuilder builder = new StringBuilder();
				String oldRef = jctx.getContextAnnotation("thisRef");
				jctx.addContextAnnotation("thisRef", "instance.");
				jctx.getCompiler().getThingActionCompiler().generate(parsed, builder, jctx);
				jctx.addContextAnnotation("thisRef", oldRef);
				block.getActions().remove(parsed);
				if (!builder.toString().isEmpty())
					return builder.toString();
			}
		} catch (Exception e) {}
		return null;
	}
	
	private static String parseAsExpression(String expression, AiotMLGrammarAccess grammar, EObject parent, ReturnAction ret, JSContext jctx) {
		try {
			Expression expr = AiotMLInjector.parseString(grammar.getExpressionRule(), expression);
			if (expr != null) {
				ret.setExp(expr);
				AiotMLInjector.linkFrom(parent);
				StringBuilder builder = new StringBuilder();
				String oldRef = jctx.getContextAnnotation("thisRef");
				jctx.addContextAnnotation("thisRef", "instance.");
				jctx.getCompiler().getThingActionCompiler().generate(expr, builder, jctx);
				jctx.addContextAnnotation("thisRef", oldRef);
				ret.setExp(null);
				if (!builder.toString().isEmpty())
					return builder.toString();
			}
		} catch (Exception e) {}
		return null;
	}
	
	private static String parseTemplateAnnotation(AnnotatedElement self, String annotation, EObject parent, ActionBlock block, ReturnAction ret, JSContext jctx) {
		String original = AnnotatedElementHelper.firstAnnotation(self, annotation);
		StringBuffer replaced = new StringBuffer(original.length());
		
		AiotMLGrammarAccess grammar = AiotMLInjector.grammar();
		
		// Find &...& sections
		Matcher m = aiotMLSection.matcher(original);
		while (m.find()) {
			// Found a section
			String aiotML = m.group(1);
			String platform = null;
			
			// Parse as a Send action
			if (platform == null)
				platform = ReactTemplates.<SendAction>parseAsAction(aiotML, grammar.getSendActionRule(), parent, block, jctx);
			
			// Parse as expression
			if (platform == null)
				platform = parseAsExpression(aiotML, grammar, parent, ret, jctx);
			
			if (platform != null) {
				// Insert replacement, and remove any leading or trailing newlines (there should really be none)
				m.appendReplacement(replaced, platform.trim());
			} else {
				// No replacement possible, keep original
				m.appendReplacement(replaced, m.group());
			}
		}
		m.appendTail(replaced);
		
		return replaced.toString();
	}
	
	
	
	
	private static String parseTemplateAnnotation(Thing thing, String annotation, JSContext jctx) {
		// Statements/expressions for Things should have access to the same as in a function
		// Create a temporary function
		Function fun = AiotMLFactory.eINSTANCE.createFunction();
		fun.setName("_ReactTempFunction");
		ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
		fun.setBody(block);
		ReturnAction ret = AiotMLFactory.eINSTANCE.createReturnAction();
		block.getActions().add(ret);
		thing.getFunctions().add(fun);
		// Parse annotation
		String parsed = parseTemplateAnnotation(thing, annotation, fun, block, ret, jctx);
		// Remove temporary function
		thing.getFunctions().remove(fun);
		// Return
		return parsed;
	}
	
	private static String parseTemplateAnnotation(State state, String annotation, JSContext jctx) {
		// Statements/expressions for Things should have access to the same as in an internal transitions
		// Create temporary transition
		InternalTransition tran = AiotMLFactory.eINSTANCE.createInternalTransition();
		tran.setName("_ReactTempInternalTransition");
		ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
		tran.setAction(block);
		ReturnAction ret = AiotMLFactory.eINSTANCE.createReturnAction();
		block.getActions().add(ret);
		state.getInternal().add(tran);
		// Parse annotation
		String parsed = parseTemplateAnnotation(state, annotation, tran, block, ret, jctx);
		// Remove temporary transition
		state.getInternal().remove(tran);
		// Return
		return parsed;
	}
	
	private static String parseTemplateAnnotation(StateContainer sc, String annotation, JSContext jctx) {
		if (sc instanceof CompositeState)
			// Composites have same access as States
			return parseTemplateAnnotation((State)sc, annotation, jctx);
		else
			// Regions and Sessions have same access as their parent CompositeState (which is a State)
			return parseTemplateAnnotation((State)sc.eContainer(), annotation, jctx);
	}
	
	
	public static void configuartionImports(Configuration cfg, Section imports, JSContext jctx) {
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			for (String imp : AnnotatedElementHelper.annotation(cfg, "react_import"))
				imports.append("import "+imp+";");
			for (String req : AnnotatedElementHelper.annotation(cfg, "react_require"))
				imports.append("const "+req+";");
		} else {
			imports.append("import MuiThemeProvider from 'material-ui/styles/MuiThemeProvider';");
			imports.append("import {Card, CardTitle, CardText} from 'material-ui/Card';");
		}
	}
	public static void configurationRender(Configuration cfg, Section render, JSContext jctx) {
		render.append("const configuration = this;");
		
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			if (AnnotatedElementHelper.hasAnnotation(cfg, "templatefun")) {
				StringBuilder builder = render.stringbuilder("template-function");
				builder.append(AnnotatedElementHelper.firstAnnotation(cfg, "templatefun"));
			} else {
				
				Section ret = renderReturn(render);
				if (AnnotatedElementHelper.hasAnnotation(cfg, "template")) {
					StringBuilder builder = ret.stringbuilder("template");
					builder.append(AnnotatedElementHelper.firstAnnotation(cfg, "template"));
				} else {
					// If no custom render is supplied, just render all instances
					ret.append("<React.Fragment>");
					ret.section("instances").lines().indent().append("{configuration.getinstances()}");
					ret.append("</React.Fragment>");
				}
			}
		} else {
			// Default template
			Section ret = renderReturn(render);
			ret.append("<MuiThemeProvider>");
			Section theme = ret.section("mui-theme-provider").lines().indent();
			theme.append("<Card>");
			Section card = theme.section("card").lines().indent();
			card.append("<CardTitle title='"+cfg.getName()+"' subtitle='Configuration'/>");
			card.append("<CardText>");
			Section cardText = card.section("card-text").lines().indent();
			cardText.append("{configuration.getinstances()}");
			card.append("</CardText>");
			theme.append("</Card>");
			ret.append("</MuiThemeProvider>");
		}
	}
	
	
	public static void thingImports(Thing thing, Section imports, JSContext jctx) {
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			for (String imp : AnnotatedElementHelper.annotation(thing, "react_import"))
				imports.append("import "+imp+";");
			for (String req : AnnotatedElementHelper.annotation(thing, "react_require"))
				imports.append("const "+req+";");
		} else {
			imports.append("import {Card, CardTitle, CardText} from 'material-ui/Card';");
			imports.append("import Chip from 'material-ui/Chip';");
		}
	}
	public static void thingRender(Thing thing, Section render, JSContext jctx) {
		render.append("const instance = this;");
		
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			if (AnnotatedElementHelper.hasAnnotation(thing, "templatefun")) {
				StringBuilder builder = render.stringbuilder("template-function");
				builder.append(parseTemplateAnnotation(thing, "templatefun", jctx));
			} else {
				Section ret = renderReturn(render);
				if (AnnotatedElementHelper.hasAnnotation(thing, "template")) {
					StringBuilder builder = ret.stringbuilder("template");
					builder.append(parseTemplateAnnotation(thing, "template", jctx));
				} else {
					// If not template is provided, just render the statemachine
					ret.append("<React.Fragment>");
					ret.section("instances").lines().indent().append("{instance.getstatemachine()}");
					ret.append("</React.Fragment>");
				}
			}
		} else {
			// Default template
			Section ret = renderReturn(render);
			ret.append("<Card>");
			Section card = ret.section("card").lines().indent();
			card.append("<CardTitle title={instance.name+' : "+thing.getName()+"'} subtitle='Thing instance'/>");
			
			card.append("<CardText style={{display: 'flex', flexWrap: 'wrap'}}>");
			Section chipCardText = card.section("card-text").lines().indent();
			Section chipDiv = chipCardText.section("chips").lines().indent();
			for (Property p : thing.getProperties())
				chipDiv.append("<Chip style={{margin:4}}>"+p.getName()+" : {instance."+AiotMLElementHelper.qname(p, "_")+"_var}</Chip>");
			card.append("</CardText>");
			
			card.append("<CardText>");
			card.section("card-text").lines().indent().append("{instance.getstatemachine()}");
			card.append("</CardText>");
			
			if (ThingHelper.hasSession(thing)) {
				card.append("<CardText>");
				card.section("card-text").lines().indent().append("{instance.getsessions()}");
				card.append("</CardText>");
			}
			
			ret.append("</Card>");
		}
	}
	public static void statecontainerRender(StateContainer sc, String type, Section render, JSContext jctx) {
		render.append("const instance = this;");
		
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			boolean renderAlways = AnnotatedElementHelper.annotationOrElse(sc, "render", "active").toLowerCase().equals("always");
			Section body = render.section("body").lines();
			if (!renderAlways)
				body.indent().before("if (state.isactive) {").after("}");
			
			if (AnnotatedElementHelper.hasAnnotation(sc, "templatefun")) {
				StringBuilder builder = body.stringbuilder("template-function");
				builder.append(parseTemplateAnnotation(sc, "templatefun", jctx));
			} else {
				Section ret = renderReturn(body);
				if (AnnotatedElementHelper.hasAnnotation(sc, "template")) {
					StringBuilder builder = ret.stringbuilder("template");
					builder.append(parseTemplateAnnotation(sc, "template", jctx));
				} else {
					// If not template is provided, just render all substates (and regions)
					ret.append("<React.Fragment>");
					ret.section("substates").lines().indent().append("{state.getsubstates()}");
					if (sc instanceof CompositeState) ret.section("regions").lines().indent().append("{state.getregions()}");
					ret.append("</React.Fragment>");
				}
			}
		} else {
			// Default template
			Section ret = renderReturn(render);
			ret.append("<Card style={{backgroundColor: state.isactive ? '#ddd' : '#fff'}}>");
			Section card = ret.section("card").lines().indent();
			card.append("<CardTitle title={state.name} subtitle='"+type+"'/>");
			
			if (sc instanceof CompositeState) {
				card.append("<CardText style={{display: 'flex', flexWrap: 'wrap'}}>");
				Section chipCardText = card.section("card-text").lines().indent();
				Section chipDiv = chipCardText.section("chips").lines().indent();
				for (Property p : ((CompositeState)sc).getProperties())
					chipDiv.append("<Chip style={{margin:4}}>"+p.getName()+" : {instance."+AiotMLElementHelper.qname(p, "_")+"_var}</Chip>");
				card.append("</CardText>");
			}
			
			card.append("<CardText>");
			Section cardText = card.section("card-text").lines().indent();
			cardText.append("{state.getsubstates()}");
			if (sc instanceof CompositeState) cardText.append("{state.getregions()}");
			card.append("</CardText>");
			ret.append("</Card>");
		}
	}
	public static void stateRender(State s, Section render, JSContext jctx) {
		render.append("const instance = this;");
		
		if (jctx.hasContextAnnotation("react-custom-templates")) {
			boolean renderAlways = AnnotatedElementHelper.annotationOrElse(s, "render", "active").toLowerCase().equals("always");
			Section body = render.section("body").lines();
			if (!renderAlways)
				body.indent().before("if (state.isactive) {").after("}");
			
			if (AnnotatedElementHelper.hasAnnotation(s, "templatefun")) {
				StringBuilder builder = body.stringbuilder("template-function");
				builder.append(parseTemplateAnnotation(s, "templatefun", jctx));
			} else {
				Section ret = renderReturn(body);
				if (AnnotatedElementHelper.hasAnnotation(s, "template")) {
					StringBuilder builder = ret.stringbuilder("template");
					builder.append(parseTemplateAnnotation(s, "template", jctx));
				} else {
					// If not template is provided, nothing is rendered
					ret.append("null");
				}
			}
		} else {
			// Default template
			Section propRefs = render.section("property-references").lines();
			Section ret = renderReturn(render);
			
			String type = s instanceof FinalState ? "Final state" : "state";
			
			ret.append("<Card style={{backgroundColor: state.isactive ? '#ddd' : '#fff'}}>");
			Section card = ret.section("card").lines().indent();
			card.append("<CardTitle title={state.name} subtitle='"+type+"'/>");
			
			card.append("<CardText style={{display: 'flex', flexWrap: 'wrap'}}>");
			Section chipCardText = card.section("card-text").lines().indent();
			Section chipDiv = chipCardText.section("chips").lines().indent();
			for (Property p : s.getProperties()) {
				String propName = AiotMLElementHelper.qname(p, "_") + "_var";
				propRefs.append("const "+propName+" = this."+propName+";");
				
				chipDiv.append("<Chip style={{margin:4}}>"+p.getName()+" : {"+propName+"}</Chip>");
			}
			card.append("</CardText>");
			
			ret.append("</Card>");
		}
	}
}
