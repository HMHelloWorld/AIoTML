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
import org.aiotml.compilers.javascript.JSCfgBuildCompiler;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ObjectType;
import org.aiotml.xtext.aiotML.Thing;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;
import com.eclipsesource.json.WriterConfig;

public class NodeJSCfgBuildCompiler extends JSCfgBuildCompiler {
	@Override
	public void generateBuildScript(Configuration cfg, Context ctx) {
		
		String json = String.join("", readResource("lib/package.json"));
		JsonObject pkg = Json.parse(json).asObject();
		
		String nameKebabCase = cfg.getName().replaceAll("([a-z0-9])([A-Z])", "$1-$2").toLowerCase();
		pkg.set("name", nameKebabCase);
		
		pkg.set("description", AnnotatedElementHelper.annotationOrElse(
				cfg, "nodejs_package_description", nameKebabCase +" configuration generated from AiotML"));
		
		pkg.set("version", AnnotatedElementHelper.annotationOrElse(cfg, "nodejs_package_version", "1.0.0"));
		pkg.set("license", AnnotatedElementHelper.annotationOrElse(cfg, "nodejs_package_license", "Apache-2.0"));
		pkg.set("repository", AnnotatedElementHelper.annotationOrElse(cfg, "nodejs_package_repository", ""));
		
		JsonObject author = pkg.get("author").asObject();
		author.set("name", AnnotatedElementHelper.annotationOrElse(cfg, "nodejs_package_author_name", ""));
		author.set("email", AnnotatedElementHelper.annotationOrElse(cfg, "nodejs_package_author_email", ""));
		
		JsonValue deps = pkg.get("dependencies");
		
		if (AnnotatedElementHelper.hasAnnotation(cfg, "arguments")) {
        	deps.asObject().add("nconf", "^0.8.4");
        }
		
		for (Thing t : ConfigurationHelper.allThings(cfg)) {
            for (String dep : AnnotatedElementHelper.annotation(t, "js_dep")) {
                deps.asObject().add(dep.split(":")[0].trim(), dep.split(":")[1].trim());
            }
        }
        
        for (ObjectType t : ConfigurationHelper.allObjectTypes(cfg)) {
            for (String dep : AnnotatedElementHelper.annotation(t, "js_dep")) {
                deps.asObject().add(dep.split(":")[0].trim(), dep.split(":")[1].trim());
            }
        }
        
        StringBuilder builder = ctx.getBuilder("package.json");
        builder.append(pkg.toString(WriterConfig.PRETTY_PRINT));
	}
	
	@Override
    public String getDockerBaseImage(Configuration cfg, Context ctx) {
		if(!AnnotatedElementHelper.isDefined(cfg, "docker", "perf"))
			return "node:lts-alpine";
		return "node:lts";
    }

    public String getRunScriptRunCommand(Configuration cfg, Context ctx) {
    	return "node --interpreted-frames-native-stack --perf-basic-prof-only-functions --expose-gc main.js &\n"
    			+ "PID=$!\n";
    }
	
    @Override
    public String getDockerCMD(Configuration cfg, Context ctx) {
        return "node\", \"--expose-gc\", \"main.js"; //Param main.js
    }

    @Override
    public String getDockerCfgRunPath(Configuration cfg, Context ctx) {
    	if (AnnotatedElementHelper.isDefined(cfg, "docker", "perf")) {
    		return "COPY . .\n" +
    		"RUN npm install --production\n";
    	}
        return "RUN npm install @steelbreeze/state@8.0.0\n" +
						"FROM node:lts-alpine\n" +
						"COPY --from=0 /node_modules .\n" +
						"COPY package.json package.json\n" +
        		"RUN npm install --production\n" +
        		"COPY . .\n";
    }	
}
