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
package compilers.go;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.configuration.CfgBuildCompiler;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Configuration;

public class GoCfgBuildCompiler extends CfgBuildCompiler {

	@Override
    public String getDockerBaseImage(Configuration cfg, Context ctx) {
		if(AnnotatedElementHelper.isDefined(cfg, "docker", "perf"))
			return "golang:latest";
        return "golang:alpine";
    }

    @Override
    public String getDockerCMD(Configuration cfg, Context ctx) {
        return "/" + cfg.getName();
    }

    public String getRunScriptRunCommand(Configuration cfg, Context ctx) {
    	return "./" + cfg.getName() + " &\n"
    			+ "PID=$!\n";
    }
    
    @Override
    public String getDockerCfgRunPath(Configuration cfg, Context ctx) {
    	String command = "";    	        		
    	if(!AnnotatedElementHelper.isDefined(cfg, "docker", "perf")) {
        	command += "RUN apk add --no-cache build-base git\n" +
            		"RUN go get github.com/SINTEF-9012/gosm\n" +        			
            		"COPY . .\n" +
            		"RUN go build -ldflags \"-linkmode external -extldflags -static\" -o " + cfg.getName() + " -a *.go && copy " + cfg.getName() + " /" + cfg.getName() + "\n" +
            		"FROM scratch\n" +
        			"COPY --from=0 /" + cfg.getName() + " /" + cfg.getName() + "\n";
    	} else {
    		command += "RUN apt-get update && apt-get install -y build-essential git && rm -rf /var/lib/apt/lists/*\n" +
            		"RUN go get github.com/SINTEF-9012/gosm\n" +        			
            		"COPY . .\n" +
            		"RUN go build -ldflags \"-linkmode external -extldflags -static\" -o " + cfg.getName() + " -a *.go\n";
    	}
    	return command;
    }
	
}
