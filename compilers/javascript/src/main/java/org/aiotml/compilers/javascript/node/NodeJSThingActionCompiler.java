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
package org.aiotml.compilers.javascript.node;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.javascript.JSThingActionCompiler;
import org.aiotml.xtext.aiotML.ErrorAction;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.PrintAction;

/**
 * Created by jakobho on 28.03.2017.
 */
public class NodeJSThingActionCompiler extends JSThingActionCompiler {

  @Override
  public void generate(ErrorAction action, StringBuilder builder, Context ctx) {
	builder.append("((process.stderr && process.stderr.write) || console.log).call(process.stderr, ''");
  	for (Expression msg : action.getMsg()) {
  		builder.append("+");
	    generate(msg, builder, ctx);
	    
  	}
  	builder.append(");\n");
  	if (action.isLine())
  		builder.append("if (process.stderr) process.stderr.write('\\n');\n");
  }

  @Override
  public void generate(PrintAction action, StringBuilder builder, Context ctx) {
	builder.append("((process.stdout && process.stdout.write) || console.log).call(process.stdout, ''");
  	for (Expression msg : action.getMsg()) {
  		builder.append("+");
        generate(msg, builder, ctx);        
  	}
  	builder.append(");\n");
  	if (action.isLine())
  		builder.append("if (process.stdout) process.stdout.write('\\n');\n");
  }
}
