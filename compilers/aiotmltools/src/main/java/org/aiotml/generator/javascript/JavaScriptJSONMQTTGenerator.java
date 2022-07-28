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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.aiotml.generator.javascript;

import java.io.File;

import org.aiotml.aiotmltools.AiotMLTool;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;


public class JavaScriptJSONMQTTGenerator extends AiotMLTool {


    public JavaScriptJSONMQTTGenerator() {
        super();
    }

    @Override
    public String getID() {
        return "javascriptmqttjson";
    }

    @Override
    public String getName() {
        return "AiotML JavaScript generator for messaging JSON over MQTT";
    }

    @Override
    public String getDescription() {
        return "Generate JSON serialization for messages to be sent over MQTT. Javascript specific.";
    }

    @Override
    public AiotMLTool clone() {
        return new JavaScriptJSONMQTTGenerator();
    }

    @Override
    public void generateAiotMLFrom(AiotMLModel model) {
        System.out.println("[javascriptmqttjson] Processing Model " + model.eResource().getURI().toString() + "\n");
        
        setOutputDirectory(new File(model.eResource().getURI().path()).getParentFile());
        
        // Loop over all the Things
        for (Thing t : AiotMLHelpers.allThings(model)) {
        	// Loop over ports
        	for (Port p : AiotMLHelpers.allPorts(t)) {
        		
        		if (AnnotatedElementHelper.isDefined(p, "external", "javascriptmqttjson")) {
        			System.out.println("[javascriptmqttjson] Generating for Thing: " + t.getName() + " Port: " + p.getName() + "\n");
        			generateAdapterFor(model, t, p);
            	}
        	}
        }
        System.out.println("[javascriptmqttjson] Done. (Model " + model.eResource().getURI().toString() + ")\n");
        writeGeneratedCodeToFiles();
    }
    
    public void generateAdapterFor(AiotMLModel model, Thing t, Port p) {
    	
    	String imports = "import \"" + model.eResource().getURI().lastSegment() + "\"\n";
    	String thing_name = t.getName() +"_JavaScriptMqttJson_Impl";
    	String thing_includes = t.getName() + ", MQTTAdapterMsgs";
    	
    	StringBuilder subscriptions = new StringBuilder();
    	
    	for (Message m : p.getSends()) {
    		subscriptions.append("\t\tsubscribe_for_message(\""+ m.getName()+"\")\n");	
    	}
    	
    	StringBuilder sendfunctions = new StringBuilder();
    	
    	for (Message m : p.getReceives()) {
    		generate_send_handler(p, m, sendfunctions);
    	}
    	
    	String template = getTemplateByID("javascriptmqttjson/JavaScriptMqttJson.aiotml");
    	template = template.replace("/*IMPORTS*/", imports);
    	template = template.replace("/*THING_NAME*/", thing_name);
    	template = template.replace("/*THING_INCLUDES*/", thing_includes);
    	template = template.replace("/*SUBSCRIBE*/", subscriptions.toString());
    	template = template.replace("/*SEND_HANDLERS*/", sendfunctions.toString());
    	template = template.replace("/*MQTT_PORT_NAME*/", p.getName());
    
    	StringBuilder parsemsgs = new StringBuilder();
    	for (Message m : p.getSends()) {
    		generate_parsing_msg(p, m ,parsemsgs);
    	}
    	template = template.replace("/*PARSEMSG*/", parsemsgs.toString());
    	
    	StringBuilder builder = new StringBuilder(template);
    	
    	String genfilename = t.getName() + "JavaScriptMqttJson.aiotml";
    	generatedCode.put(genfilename, builder);
    }

    public void generate_send_handler(Port p, Message m, StringBuilder b) {
    	b.append("\t\tinternal event e:" + p.getName() + "?" + m.getName() + " action do\n");
    	
    	b.append("\t\t\t// Sending for " + p.getName() + "!" + m.getName() + "\n");
    	b.append("\t\t\t`let json = {};\n");
    	for (Parameter param : m.getParameters()) {
    		b.append("\t\t\tjson." + param.getName() + " = ` & e."+param.getName()+" & `;\n");
    	}
    	b.append("\t\t\tlet payload = JSON.stringify(json);`\n");
    	b.append("\t\t\tpublish_message(\""+ m.getName()+"\", `payload` as Buffer, `payload.length` as UInt32)\n");
    	
    	b.append("\t\tend\n\n");
    }
    
    public void generate_parsing_msg(Port p, Message m, StringBuilder b) {
    	
    	b.append("\n\t\t\tcase '" + m.getName() + "' :\n");
    	b.append("\t\t\t\tvar __valid_msg = true;\n");
    	for (Parameter param : m.getParameters()) {
    		
    		b.append("\t\t\t\tlet ___" + param.getName() + " = json." + param.getName() + ";\n");
    		b.append("\t\t\t\tif(!json.hasOwnProperty('" + param.getName() + "')){\n");
    		b.append("\t\t\t\t\t`error \"JSON ERROR: parsing message "+m.getName()+", missing parameter "+param.getName()+"\\n\"`\n\t\t\t\t\t__valid_msg = false;\n\t\t\t\t}\n");
    	}
    	b.append("\t\t\t\tif(__valid_msg) `"+ p.getName() +"!" + m.getName() + "(");
    	for (Parameter param : m.getParameters()) {
    		if (!param.equals(m.getParameters().get(0))) b.append(", ");
    		b.append("`___" + param.getName()+"` as " + param.getTypeRef().getType().getName());
    	}
    	b.append(")`\n");
    	b.append("break;\n");
    }
    
}
