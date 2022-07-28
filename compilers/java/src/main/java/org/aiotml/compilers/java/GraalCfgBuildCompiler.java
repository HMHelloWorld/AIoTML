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
package org.aiotml.compilers.java;

import org.aiotml.compilers.Context;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Configuration;

/**
 * Created by bmori on 17.12.2014.
 */
public class GraalCfgBuildCompiler extends JavaCfgBuildCompiler {    

    @Override
    public void generateBuildScript(Configuration cfg, Context ctx) {
        try {
            doGenerate(cfg, ctx, "pomtemplates/graalpom.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String getDockerBaseImage(Configuration cfg, Context ctx) {
    	return "debian:stretch-slim";
    }
    
    @Override
    public String getDockerCMD(Configuration cfg, Context ctx) {
        return "./app";
    }
    
    public String getRunScriptRunCommand(Configuration cfg, Context ctx) {
    	return "./app &\n"
    			+ "PID=$!\n";
    }

    @Override
    public String getDockerCfgRunPath(Configuration cfg, Context ctx) {
        String command = "ENV JAVA_HOME /opt/graalvm\n" + 
        		"ENV GRAALVM_HOME /opt/graalvm\n" + 
        		"ENV NATIVE_IMAGE_CONFIG_FILE $GRAALVM_HOME/native-image.properties\n" + 
        		"ENV PATH /opt/apache-maven/bin:$JAVA_HOME/jre/bin:$GRAALVM_HOME/bin:$PATH\n" + 
        		"# All in one step, to reduce number of layers\n" + 
        		"RUN apt-get update && " + 
        		"    apt-get -y install gcc libc6-dev zlib1g-dev curl && " + 
        		"    curl http://mirror.nbtelecom.com.br/apache/maven/maven-3/3.6.0/binaries/apache-maven-3.6.0-bin.tar.gz -o /tmp/maven.tar.gz && " + 
        		"    tar -zxvf /tmp/maven.tar.gz -C /tmp && " + 
        		"    mv /tmp/apache-maven-3.6.0 /opt/apache-maven && " + 
        		"    curl -L https://github.com/oracle/graal/releases/download/vm-1.0.0-rc16/graalvm-ce-1.0.0-rc16-linux-amd64.tar.gz -o /tmp/graalvm.tar.gz && " + 
        		"    tar -zxvf /tmp/graalvm.tar.gz -C /tmp && " + 
        		"    mv /tmp/graalvm-ce-1.0.0-rc16 /opt/graalvm && " + 
        		"    echo \"JavaArgs = -Xmn512k\" >> $NATIVE_IMAGE_CONFIG_FILE && " + 
        		"    echo \"Args = -H:Kind=EXECUTABLE\" >> $NATIVE_IMAGE_CONFIG_FILE && " + 
        		"    mkdir -p /root/.native-image && " + 
        		"    rm -rf /var/lib/apt/lists/* && " + 
        		"    rm -rf /tmp/*\n" + 
        		"COPY . .\n" + 
        		"RUN curl -L https://github.com/TelluIoT/AiotML/releases/download/1.0.0/mvn_repo_generated.tar.gz -o ./mvn_repo_generated.tar.gz && " + 
        		"    tar -xzf mvn_repo_generated.tar.gz && " + 
        		"    rm mvn_repo_generated.tar.gz && " + 
        		"    mvn install && mv target/org.aiotml.generated.main /app && rm -rf target\n" + 
        		"#FROM scratch\n";
        if(!AnnotatedElementHelper.isDefined(cfg, "docker", "perf")) {
        	command += "FROM debian:stretch-slim\n" + 
        		"COPY --from=0 app /app\n";
        }
        return command;
    }
    
    public String getDockerPerfExtra(Configuration cfg, Context ctx) {
        return "";
    }
    
    public String getRunScriptPerfExtra(Configuration cfg, Context ctx) {
        return "";
    }

}
