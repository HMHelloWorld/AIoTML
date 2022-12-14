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
package org.aiotml.compilers.cpp.arduino;

import java.io.File;
import java.util.ArrayList;

import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.cpp.CppCompilerContext;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;

/**
 * Created by ffl on 11.06.15.
 */
public class CCompilerContextArduino extends CppCompilerContext {

    public CCompilerContextArduino(AiotMLCompiler c) {
        super(c);
    }

    public boolean sync_fifo() {
        return false;
    }

    public int fifoSize() {
        return 256;
    }

    @Override
    public void writeGeneratedCodeToFiles() {

        // COMBINE ALL THE GENERATED CODE IN A SINGLE PDE FILE

        ArrayList<String> headers = new ArrayList<String>();
        ArrayList<String> modules = new ArrayList<String>();
        String main = getCurrentConfiguration().getName() + "_cfg.c";

        
        for (String filename : generatedCode.keySet()) {
            if (filename.endsWith(".h")) {
            	headers.add(filename);
                //System.out.println("Adding " + filename + " to headers");
            }
            if ((filename.endsWith(".c") || filename.endsWith(".cpp") )&& !filename.equals(main)) {
                modules.add(filename);
                //System.out.println("Adding " + filename + " to modules");
            }
        }

        StringBuilder pde = new StringBuilder();

        for (String f : headers) {
        	pde.append(generatedCode.get(f).toString());
        }

        for (String f : modules) {
        	pde.append(generatedCode.get(f).toString());
        }

        pde.append(generatedCode.get(main).toString());
        //writeTextFile(getCurrentConfiguration().getName() + ".pde", pde.toString());
        writeTextFile(getCurrentConfiguration().getName() + File.separatorChar + getCurrentConfiguration().getName() + ".ino", "#include <stdint.h>\n#include <Arduino.h>\n"+pde.toString());

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
