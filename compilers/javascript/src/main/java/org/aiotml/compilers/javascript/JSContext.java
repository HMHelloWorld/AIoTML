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

import org.aiotml.compilers.Context;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.builder.SourceBuilder;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Type;

public class JSContext extends Context {	
	public JSContext(AiotMLCompiler compiler) {
		super(compiler);
		// TODO Add reserved keywords
	}
	
	@Override
	protected SourceBuilder newBuilder() {
		return new JSSourceBuilder();
	}
	public JSSourceBuilder getSourceBuilder(String path) {
		// TODO Auto-generated method stub
		return (JSSourceBuilder)super.getSourceBuilder(path);
	}
	
	protected String getDefaultValue(Type type) {
		if (AnnotatedElementHelper.isDefined(type, "js_type", "boolean"))
			return "false";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "int"))
			return "0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "long"))
			return "0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "float"))
			return "0.0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "double"))
			return "0.0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "byte"))
			return "0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "short"))
			return "0";
		else if (AnnotatedElementHelper.isDefined(type, "js_type", "char"))
			return "'\u0000'";
		else
			return "null";
	}
	
}
