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
package org.aiotml.compilers.javascript.browser;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.javascript.JSCompiler;
import org.aiotml.compilers.javascript.JSThingApiCompiler;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.AiotMLModel;

public class BrowserJSCompiler extends JSCompiler {

	public BrowserJSCompiler() {
		super(
			new BrowserThingActionCompiler(),
			new JSThingApiCompiler(),
			new BrowserJSCfgMainGenerator(),
			new BrowserJSCfgBuildCompiler(),
			new BrowserJSThingImplCompiler()
		);
	}
	
	@Override
	protected void exports(StringBuilder events, String e) {
		events.append("\n\n");
	}

	@Override
	public AiotMLCompiler clone() {
		return new BrowserJSCompiler();
	}

	@Override
	public String getID() {
		return "browser";
	}

	@Override
	public String getName() {
		return "Javascript for Web Browsers";
	}

	@Override
	public String getDescription() {
		return "Generates Javascript code that can run in common Web Browsers.";
	}
	
	@Override
	protected String getEnumPath(Configuration t, AiotMLModel model, Context ctx) {
		return "enums.js";
	}
}
