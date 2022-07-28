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

import java.util.function.Predicate;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.javascript.JSCompiler;
import org.aiotml.compilers.javascript.JSThingApiCompiler;
import org.aiotml.compilers.javascript.browser.BrowserThingActionCompiler;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.CompositeStateHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;

@Deprecated
public class ReactJSCompiler extends JSCompiler {
	
	public ReactJSCompiler() {
		super(new BrowserThingActionCompiler(), new JSThingApiCompiler(), new ReactJSCfgMainGenerator(),
                new ReactJSCfgBuildCompiler(), new ReactThingImplCompiler());
	}
	
	@Override
	public AiotMLCompiler clone() {
		return new ReactJSCompiler();
	}

	@Override
	public String getID() {
		return "reactjs";
	}

	@Override
	public String getName() {
		return "User-interfaces for Web Browsers with React";
	}

	@Override
	public String getDescription() {
		return "Generates Javascript and HTML for Web Browser user-interfaces using React components and JSX templates";
	}
	
	// Check if the default templates should be used
	protected boolean checkRenderTemplates(Configuration cfg) {
		if (AnnotatedElementHelper.hasAnnotation(cfg, "template") || AnnotatedElementHelper.hasAnnotation(cfg, "templatefun")) return true;
		else return ConfigurationHelper.allUsedThings(cfg).stream().anyMatch(new Predicate<Thing>() {
			@Override
			public boolean test(Thing type) {
				if (AnnotatedElementHelper.hasAnnotation(type, "template") || AnnotatedElementHelper.hasAnnotation(type, "templatefun")) return true;
				if (type.getBehaviour() != null) {
					if (CompositeStateHelper.allContainedStateContainers(type.getBehaviour()).stream().anyMatch(new Predicate<StateContainer>() {
						@Override
						public boolean test(StateContainer sc) {
							return AnnotatedElementHelper.hasAnnotation(sc, "template") || AnnotatedElementHelper.hasAnnotation(sc, "templatefun");
						}
					})) return true;
					if (CompositeStateHelper.allContainedStatesIncludingSessions(type.getBehaviour()).stream().anyMatch(new Predicate<State>() {
						@Override
						public boolean test(State s) {
							return AnnotatedElementHelper.hasAnnotation(s, "template") || AnnotatedElementHelper.hasAnnotation(s, "templatefun");
						}
					})) return true;
				}
				return false;
			}
		});
	}

	@Override
	public boolean do_call_compiler(Configuration cfg, Logger log, String... options) {
		if (checkRenderTemplates(cfg)) this.ctx.addContextAnnotation("react-custom-templates", "true");
		
		return super.do_call_compiler(cfg, log, options);
	}

	@Override
	protected String getEnumPath(Configuration t, AiotMLModel model, Context ctx) {
		return "src/enums.js";
	}
}
