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
package org.aiotml.compilers.c.teensy;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;
public class CCompilerContextTeensy extends CCompilerContext{

	public CCompilerContextTeensy(AiotMLCompiler c) {
		super(c);
	}
	
	@Override
	public int fifoSize() {
		Configuration cfg = getCurrentConfiguration();
		if (AnnotatedElementHelper.hasAnnotation(cfg, "teensy_fifosize"))
			return Integer.parseInt(AnnotatedElementHelper.annotation(cfg, "teensy_fifosize").get(0));
		return 256;
	}
	
	@Override
    public void writeGeneratedCodeToFiles() {

        // COMBINE ALL THE GENERATED CODE IN A SINGLE PDE FILE

        ArrayList<String> headers = new ArrayList<String>();
        ArrayList<String> modules = new ArrayList<String>();
        String main = getCurrentConfiguration().getName() + "_cfg.c";

        StringBuilder mainpart = new StringBuilder();
        
        for (String filename : generatedCode.keySet()) {
            if (filename.endsWith(".h")) {
            	mainpart.append("#include \"" + filename +"\"\n");
                headers.add(filename);
                //System.out.println("Adding " + filename + " to headers");
            }
            if (filename.endsWith(".c") && !filename.equals(main)) {
                modules.add(filename);
                //System.out.println("Adding " + filename + " to modules");
            }
            if(filename.equals("Makefile")) writeTextFile(getCurrentConfiguration().getName() + File.separatorChar + filename, generatedCode.get(filename).toString());
        }

        StringBuilder pde = new StringBuilder();

        for (String f : headers) {
        	writeTextFile(getCurrentConfiguration().getName() + File.separatorChar +"src"+ File.separatorChar + f, headerWrapper(generatedCode.get(f).toString(), f));
            pde.append(generatedCode.get(f).toString());
        }

        for (String f : modules) {
        	writeTextFile(getCurrentConfiguration().getName() + File.separatorChar +"src"+  File.separatorChar + f + "pp","#include \"" +f.substring(0,f.length() - 1)   +"h\"\n"+ generatedCode.get(f).toString());
            pde.append(generatedCode.get(f).toString());
        }

        pde.append(generatedCode.get(main).toString());
        writeTextFile(getCurrentConfiguration().getName() + File.separatorChar +"src"+  File.separatorChar + getCurrentConfiguration().getName() + ".cpp", mainpart.toString() + generatedCode.get(main).toString());
    }
	
	@Override
	public Set<String> getGeneratedSources() {
		String main = getCurrentConfiguration().getName() + "_cfg.c";
		// All the files will be put in 'src/...', and '.c' files will become '.cpp'
		Set<String> sources = new HashSet<String>();
		for (String file : super.getGeneratedSources()) {
			if (file.equals(main)) file = getCurrentConfiguration().getName() + ".cpp";
			if (file.endsWith(".c")) file = file+"pp";
			sources.add("src"+File.separatorChar+file);
		}
		return sources;
	}

    // TODO : generate it in the file constructor
    private String headerWrapper(String header, String filename){
    	String defVar = filename.substring(0,filename.length() - 2) + "_h";
    	return "#ifndef " + defVar + "\n#define "+ defVar +"\n#include \"WProgram.h\"\n" + header + "\n#endif";
    }
    
    @Override
    public void generatePSPollingCode(Configuration cfg, StringBuilder builder) {
        AiotMLModel model = AiotMLHelpers.findContainingModel(cfg);

        // FIXME: Extract the arduino specific part bellow

        Thing arduino_scheduler = null;
        for (Thing t : AiotMLHelpers.allThings(model)) {
            if (t.getName().equals("AiotMLScheduler")) {
                arduino_scheduler = t;
                break;
            }
        }
        if (arduino_scheduler != null) {
            Message poll_msg = null;
            for (Message m : AiotMLHelpers.allMessages(arduino_scheduler)) {
                if (m.getName().equals("poll")) {
                    poll_msg = m;
                    break;
                }
            }

            if (poll_msg != null) {
                // Send a poll message to all components which can receive it
                for (Instance i : ConfigurationHelper.allInstances(cfg)) {
                    for (Port p : AiotMLHelpers.allPorts(i.getType())) {
                        if (p.getReceives().contains(poll_msg)) {
                            builder.append(this.getHandlerName(i.getType(), p, poll_msg) + "(&" + this.getInstanceVarName(i) + ");\n");
                        }
                    }
                }

            }
        }
    }

	
	
}
