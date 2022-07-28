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
package org.aiotml.generator.java;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.impl.Serializer;
import org.aiotml.aiotmltools.AiotMLTool;
import org.aiotml.xtext.AiotMLRuntimeModule;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.formatting2.AiotMLFormatter;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.AiotMLSerializer;
import org.aiotml.xtext.helpers.ToString;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.aiotML.Import;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.validation.TypeChecker;

import com.google.inject.Guice;


public class JavaJSONMQTTGenerator extends AiotMLTool {


    public JavaJSONMQTTGenerator() {
        super();
    }

    @Override
    public String getID() {
        return "javamqttjson";
    }

    @Override
    public String getName() {
        return "AiotML Java generator for messaging JSON over MQTT";
    }

    @Override
    public String getDescription() {
        return "Generate JSON serialization for messages to be sent over MQTT. Java specific.";
    }

    @Override
    public AiotMLTool clone() {
        return new JavaJSONMQTTGenerator();
    }

    @Override
    public void generateAiotMLFrom(AiotMLModel model) {
        System.out.println("[javamqttjson] Processing Model " + model.eResource().getURI().toString() + "\n");
        
        setOutputDirectory(new File(model.eResource().getURI().path()).getParentFile());
        
        // Loop over all the Things
        for (Thing t : AiotMLHelpers.allThings(model)) {
        	// Loop over ports
        	for (Port p : AiotMLHelpers.allPorts(t)) {
        		
        		if (AnnotatedElementHelper.isDefined(p, "external", "javamqttjson")) {
        			System.out.println("[javamqttjson] Generating for Thing: " + t.getName() + " Port: " + p.getName() + "\n");
        			generateAdapterFor(model, t, p);
            	}
        	}
        }
        System.out.println("[javamqttjson] Done. (Model " + model.eResource().getURI().toString() + ")\n");
        writeGeneratedCodeToFiles();
    }
    
    public void generateAdapterFor(AiotMLModel model, Thing t, Port p) {
    	
    	ArrayList<String> additional_parameters = new ArrayList<String>();
    	for (String str :  AnnotatedElementHelper.annotationOrElse(p, "add_mqtt_topic_parameters", "").split("/")) {
    		if (str.trim() != "") additional_parameters.add(str.trim());
    	}
    	
    	if (additional_parameters.isEmpty()) System.out.println("No annotation @add_mqtt_topic_parameters found on port. Existing messages will be reused.\n");
    	else {
    		System.out.print("Found @add_mqtt_topic_parameters on port. " + additional_parameters.size() + " Parameters will be extrated from mqtt topic path: ");
    		for (String s : additional_parameters) System.out.print(s  + " ");
    		System.out.println();
    		System.out.println("New messages and ports including those parameter(s) will be generated.\n");
    		
    		
    		
    		ArrayList<Parameter> params = new ArrayList<Parameter>();
    		
    		Type STRING_TYPE = AiotMLFactory.eINSTANCE.createPrimitiveType();
            STRING_TYPE.setName("String");
    		
    		for (String s : additional_parameters) {
    			Parameter param = AiotMLFactory.eINSTANCE.createParameter();
    			param.setName(s);
    			TypeRef tr = AiotMLFactory.eINSTANCE.createTypeRef();
    			
    			tr.setType(STRING_TYPE);
    			param.setTypeRef(tr);
    			params.add(param);
    		}
    		
    		Set<Message> msgs = new HashSet<Message>();
    		msgs.addAll(p.getReceives());
    		msgs.addAll(p.getSends());
    		
    		Hashtable<Message, Message> copies = new Hashtable<>();
    		
    		for (Message m : msgs) {
    			Message m2 = EcoreUtil2.copy(m);
    			copies.put(m, m2);
    			m2.setName("mqtt_" + m2.getName());
    			for (int i=0; i<params.size(); i++) {
    				m2.getParameters().add(i, EcoreUtil2.copy(params.get(i)));
    			}
    		}
    		
    		Thing msgsFrag = AiotMLFactory.eINSTANCE.createThing();
    		msgsFrag.setName(t.getName() +"_JavaMqttJsonMsgs");
    		
    		msgsFrag.getMessages().addAll(copies.values());
    		 
    		AiotMLModel m2 = AiotMLFactory.eINSTANCE.createAiotMLModel();
    		m2.getTypes().add(msgsFrag);
    		m2.getTypes().add(STRING_TYPE);
    		
    		for(Import im : model.getImports()) {
    			m2.getImports().add(EcoreUtil2.copy(im));
    		}
    		
    		model.eResource().getContents().add(m2);
    		
    		//String  strMsgsFrag= ToString.valueOf(msgsFrag);
    		
    		//Serializer serializer = Guice.createInjector(new AiotMLRuntimeModule()).getInstance(Serializer.class);  

    		//String strMsgsFrag = serializer.serialize(msgsFrag, SaveOptions.newBuilder().noValidation().format().getOptions());
    		
    		String strMsgsFrag = AiotMLSerializerDev.getInstance().toString(msgsFrag);
    		
    		System.out.println(strMsgsFrag);
    		
    	}
    	
    	
    	String imports = "import \"" + model.eResource().getURI().lastSegment() + "\"\n";
    	String thing_name = t.getName() +"_JavaMqttJson_Impl";
    	String thing_includes = t.getName() + ", MQTTAdapterMsgs";
    	
    	StringBuilder subscriptions = new StringBuilder();
    	
    	for (Message m : p.getSends()) {
    		subscriptions.append("\t\tsubscribe_for_message(\""+ m.getName()+"\")\n");	
    	}
    	
    	StringBuilder sendfunctions = new StringBuilder();
    	
    	for (Message m : p.getReceives()) {
    		generate_send_handler(p, m, sendfunctions);
    	}
    	
    	String template = getTemplateByID("javamqttjson/JavaMqttJson.aiotml");
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
    	
    	String genfilename = t.getName() + "JavaMqttJson.aiotml";
    	generatedCode.put(genfilename, builder);
    }

    public void generate_send_handler(Port p, Message m, StringBuilder b) {
    	
    	b.append("\t\tinternal event e:"+p.getName() + "?" + m.getName() + " action do\n");
    	b.append("\t\t\t// Sending for " + p.getName() + "!" + m.getName() + "\n");
    	b.append("\t\t\t`JSONObject json = new JSONObject();\n");
    	for (Parameter param : m.getParameters()) {
    		b.append("\t\t\tjson.put(\""+param.getName()+"\", `&e."+param.getName()+"&`);\n");
    	}
    	b.append("\t\t\t`\n");
    	
    	b.append("\t\t\tpublish_message(\""+ m.getName()+"\", `json.toString().getBytes()`, `json.toString().length()`)\n");
    	
    	b.append("\t\tend\n\n");
    	
    }
    
    public void generate_parsing_msg(Port p, Message m, StringBuilder b) {
    	
    	b.append("\n\t\t\tcase \"" + m.getName() + "\" : {\n");
    	b.append("\t\t\t\t__valid_msg = true;\n");
    	for (Parameter param : m.getParameters()) {
    		String jtype = getJavaType(param.getTypeRef().getType());
    		b.append("\t\t\t\t"+ jtype +" ___" + param.getName() + " = "+getDefaultValue(jtype)+";\n");
    		b.append("\t\t\t\tif (json.has(\"" + param.getName() + "\")) ___" + param.getName() + "= ("+jtype+")json."+getJSONParseMethod(jtype)+"(\""+param.getName()+"\");\n");
    		b.append("\t\t\t\telse {\n\t\t\t\t\t`error \"JSON ERROR: parsing message "+m.getName()+", missing parameter "+param.getName()+"\\n\"`\n\t\t\t\t\t__valid_msg = false;\n\t\t\t\t}\n");
    	}
    	b.append("\t\t\t\tif(__valid_msg)`"+ p.getName() +"!" + m.getName() + "(");
    	for (Parameter param : m.getParameters()) {
    		if (!param.equals(m.getParameters().get(0))) b.append(", ");
    		b.append("`___" + param.getName()+"`");
    	}
    	b.append(")`\n");
    	b.append("\t\t\t\telse {\n");
    	b.append("\t\t\t\t\t`error \"JSON ERROR: error parsing message "+m.getName()+", message has been dropped.\"`\n");
    	b.append("\t\t\t\t}} break;\n");
    }
    
    public String getJSONParseMethod(String javaType) {
    	switch(javaType) {
    	case "boolean":	return "getBoolean";
    	case "byte":
    	case "int":	   return "getInt";
    	case "long":   return "getLong";
    	case "float":
    	case "double": return "getDouble";
    	case "String": return "getString";
    	default: return "get";
    	}
    }
    
    public String getDefaultValue(String javaType) {
    	switch(javaType) {
    	case "boolean":	return "false";
    	case "byte":
    	case "int":	   return "0";
    	case "long":   return "0";
    	case "float":
    	case "double": return "0";
    	case "String": return "null";
    	default: return "null";
    	}
    }
    
    public String getJavaType(Type t) {
        if (AnnotatedElementHelper.hasAnnotation(t, "java_type")) {
            return AnnotatedElementHelper.annotation(t, "java_type").iterator().next();
        } else {
            System.err.println("Warning: Missing annotation java_type for type " + t.getName() + ", using " + t.getName() + " as the Java type.");
            return t.getName();
        }
    }
}
