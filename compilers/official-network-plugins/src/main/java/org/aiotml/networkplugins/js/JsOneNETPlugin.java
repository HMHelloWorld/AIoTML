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
package org.aiotml.networkplugins.js;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.compilers.Context;
import org.aiotml.compilers.spi.NetworkPlugin;
import org.aiotml.compilers.spi.SerializationPlugin;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.AbstractConnector;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Protocol;

import com.eclipsesource.json.JsonObject;
import org.aiotml.networkplugins.js.JSJSONSerializerPlugin;
public class JsOneNETPlugin extends NetworkPlugin {

    public String getPluginID() {
        return "JsOneNETPlugin";
    }

    public List<String> getSupportedProtocols() {
        List<String> res = new ArrayList<>();
        res.add("OneNET");
        res.add("ONENET");
        res.add("onenet");
        return res;
    }

    public List<String> getTargetedLanguages() {
        List<String> res = new ArrayList<>();
        res.add("nodejs");
        return res;
    }

    final Set<Message> messages = new HashSet<Message>();

    private void addMessage(Message m) {
        boolean contains = false;
        for(Message msg : messages) {
            if (EcoreUtil.equals(msg, m)) {
                contains = true;
                break;
            }
        }
        if (!contains) {
            messages.add(m);
        }
    }

    private void updatePackageJSON(Context ctx, boolean withServer) {
        System.out.println("update package.json");
        try {
            final InputStream input = new FileInputStream(ctx.getOutputDirectory() + "/package.json");
            final List<String> packLines = IOUtils.readLines(input, Charset.forName("UTF-8"));
            String pack = "";
            for (String line : packLines) {
                pack += line + "\n";
            }
            input.close();

            final JsonObject json = JsonObject.readFrom(pack);
            final JsonObject deps = json.get("dependencies").asObject();
            deps.add("mqtt", "^1.11.0");//FIXME: externalize all deps and version into a config file (easier to update)
            if (withServer) {
                deps.add("mosca", "^1.4.0");
                deps.add("redis", "^2.6.1");
                deps.add("redis-server", "^0.0.3");
            }

            final File f = new File(ctx.getOutputDirectory() + "/package.json");
            final OutputStream output = new FileOutputStream(f);
            IOUtils.write(json.toString(), output, Charset.forName("UTF-8"));
            IOUtils.closeQuietly(output);
        } catch (Exception e) {
            System.out.println("\t\t\tERROR");
            e.printStackTrace();
        }
    }

    public void generateNetworkLibrary(Configuration cfg, Context ctx, Set<Protocol> protocols) {
        StringBuilder builder = new StringBuilder();
        boolean deployMQTTServer = false;
        
        for(AbstractConnector c : cfg.getConnectors()) {
            if (AnnotatedElementHelper.hasAnnotation(c, "server")) {
                deployMQTTServer = true;
                break;
            }
        }
        for (Protocol prot : protocols) {
            if (AnnotatedElementHelper.hasAnnotation(prot, "localserver")) {
                deployMQTTServer = true;
            }
            SerializationPlugin sp = null;
            try {
               sp = ctx.getSerializationPlugin(prot);
            } catch (UnsupportedEncodingException uee) {
                System.err.println("Could not get serialization plugin... Expect some errors in the generated code");
                uee.printStackTrace();
                return;
            }


            String serializers = "";
            messages.clear();
            for (ThingPortMessage tpm : getMessagesSent(cfg, prot)) {
                addMessage(tpm.m);
            }

            for(Message m : messages) {
                StringBuilder temp = new StringBuilder();//for (ExternalConnector conn : getExternalConnectors(cfg, prot)) {
                serializers += sp.generateSerialization(temp, prot, m);
            }

            builder = new StringBuilder();
            messages.clear();
            for (ThingPortMessage tpm : getMessagesReceived(cfg, prot)) {
                addMessage(tpm.m);
            }
            String revice_obs = AnnotatedElementHelper.annotationOrElse(prot, "revice_obs", "");
            for(Message m : ConfigurationHelper.allMessages(cfg)) {
            	for(String s : revice_obs.split(","))
            		if(m.getName().equals(s)) {
            			addMessage(m);
            		}
            }
            sp.generateParserBody(builder, prot.getName() + "StringProtocol", null, messages, null);
            final String result = builder.toString().replace("/*$SERIALIZERS$*/", serializers);
            try {
                final File f = new File(ctx.getOutputDirectory() + "/" + prot.getName() + "StringProtocol.js");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(result, output, Charset.forName("UTF-8"));
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
            new WSProtocol(ctx, prot, cfg).generate();
        }
        updatePackageJSON(ctx, deployMQTTServer);
    }

    private class WSProtocol {
        Context ctx;
        Protocol prot;
        Configuration cfg;

        private List<Port> ports = new ArrayList<Port>();

        public WSProtocol(Context ctx, Protocol prot, Configuration cfg) {
            this.ctx = ctx;
            this.prot = prot;
            this.cfg = cfg;
        }

        private void addPort(Port p) {
            boolean contains = false;
            for (Port port : ports) {
                if (EcoreUtil.equals(port, p)) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                ports.add(p);
            }
        }

        public void generate() {
            for (ThingPortMessage tpm : getMessagesSent(cfg, prot)) {
                addPort(tpm.p);
            }
            for (ThingPortMessage tpm : getMessagesReceived(cfg, prot)) {
                addPort(tpm.p);
            }
            String template = ctx.getTemplateByID("templates/JsOneNETMQTTPlugin.js");
            template = template.replace("/*$FORMAT$*/", prot.getName() + "StringProtocol");
            template = template.replace("/*$NAME$*/", prot.getName());
            template = template.replace("/*$MQTTNAME$*/", "MQTT");
            
            final String revice_obs = AnnotatedElementHelper.annotationOrElse(prot, "revice_obs", "");
            final String send_trans_to = AnnotatedElementHelper.annotationOrElse(prot, "send_trans_to", "");
            final String revice_obs_num = AnnotatedElementHelper.annotationOrElse(prot, "revice_obs_num", "");
            final String send_cmd = AnnotatedElementHelper.annotationOrElse(prot, "send_cmd", "");
            final String cmd_indicator = AnnotatedElementHelper.annotationOrElse(prot, "cmd_indicator", "device_type");
            final String APIkey = AnnotatedElementHelper.annotationOrElse(prot, "password", "'RFVyURjjwLBt5wkHLVvPWavTARw='");
            final String device_type = AnnotatedElementHelper.annotationOrElse(prot, "device_type", "agent");
            final String device_num = AnnotatedElementHelper.annotationOrElse(prot, "device_num", "agent");
            final String revice_trans_to = AnnotatedElementHelper.annotationOrElse(prot, "revice_trans_to", "");
            
            /*$var_revice_obs$*/
//            template = template.replace("/*$CMD_Indicator$*/", cmd_indicator);
            template = template.replace("/*$DEVICETYPE$*/", device_type);
            template = template.replace("/*$DEVICENUM$*/", device_num);
            String[] revice_obsList = revice_obs.split(",");
            
            StringBuilder robuilder = new StringBuilder();
            for(String s:revice_obsList) {
            	robuilder.append("var "+s+"List = [];\n");
            }
            template = template.replace("/*$var_revice_obs$*/", robuilder.toString());
            
            for (ExternalConnector conn : getExternalConnectors(cfg, prot)) {
                updateMain(ctx, cfg, conn);
            }
            for(Port p : ports) {
                StringBuilder builder = new StringBuilder();
                //send onenet cmd
                //========
                builder.append("switch(topic) {\n");
                String[] revice_obsArr = revice_obs.split(",");
                for(String s:revice_obsArr) {
                	builder.append("case'"+s+"':\n");
                	String paraString= "";
                	for(Message m : ConfigurationHelper.allMessages(cfg)) {
                		if(m.getName().equals(s)) {
                			Parameter para = m.getParameters().get(0);
                			if(para.getTypeRef().getCardinality() != null)
                				paraString = para.getName()+"[0]";
                			else
                				paraString = para.getName();
                		}
                	}
                	
                	builder.append(s+"List.push(msg."+paraString+");\n");
                	builder.append("break;\n");
                }
                builder.append("default: break;\n}\n");
                //==========
                builder.append("if(");
                int i = 0;
                for(String s:revice_obsArr) {
                	String[] numList = revice_obs_num.split(",");
                	if(i>0)
                		builder.append("&&");
                	builder.append(s+"List.length === "+numList[i]);
                	i++;
                }
                builder.append("){\n");
                for(Message m : p.getReceives()) {
                	if(revice_trans_to.equals(m.getName())) {
                		builder.append("msg._msg = '" + revice_trans_to + "';\n");
                		i = 0;
                		for(Parameter para : m.getParameters()) {
                			builder.append("msg."+para.getName()+" = ");
                			builder.append(revice_obsArr[i]+"List.sort(sortId);\n");
                			i++;
                		}
                		i = 0;
                		for(Parameter para : m.getParameters()) {
                			builder.append(revice_obsArr[i]+"List = [];\n");
                			i++;
                		}
                		
                	}
                		
                }
                template = template.replace("/*$revice_obs$*/", "/*$revice_obs$*/\n" + builder.toString());
                
                //==============
                StringBuilder newbuilder = new StringBuilder();
                newbuilder.append("msg._port = '" + p.getName() + "';\n");
//                builder.append("instance._receive(msg);\n");
//                template = template.replace("/*$DISPATCH$*/", "/*$DISPATCH$*/\n" + builder.toString());
                newbuilder.append("switch(msg._msg) {\n");
                
                for(Message m : p.getReceives()) {
                	newbuilder.append("case" + "'" + m.getName() + "':\n");
                	newbuilder.append("var "+ "outEvent = new events." + ctx.firstToUpper(m.getName()) );
                	newbuilder.append("('" + p.getName() + "'");
                	for(Parameter para : m.getParameters()) {
                		newbuilder.append(", " + "msg."+para.getName());
                	}
                	newbuilder.append(");\n");
                	newbuilder.append("instance._receive(outEvent);\n");
                	newbuilder.append("break;\n");
                }
                newbuilder.append("default: break;\n");
                newbuilder.append("}\n");
                template = template.replace("/*$DISPATCH$*/", "/*$DISPATCH$*/\n" + newbuilder.toString());
            }
            
            //=============================================
            StringBuilder builder = new StringBuilder();
            for (Port p : ports) {
                for (Message m : p.getSends()) {
                	if(send_cmd.equals(m.getName())) {
                		builder.append("MQTT.prototype.receive" + m.getName() + "On" + p.getName() + " = function(");
                		builder.append(m.getName());
                		builder.append(") {\n");
                		builder.append("var deviceList = this.deviceList;\nvar i_var = 0;\n");
                		builder.append("var formatcmd = this.formatter."+m.getName()+"ToFormat;\n");
                		builder.append(m.getName()+"."+m.getParameters().get(0).getName()+".forEach(element=> {\n");
                		builder.append("var sendData = formatcmd(element);\n");
                		builder.append("var deviceid = deviceList[i_var];\n");
                		builder.append("i_var++;\nvar url = 'http://api.heclouds.com/cmds?device_id='+deviceid;\n");
                		builder.append("var options = {\n" + 
                				"            body:sendData,\n" + 
                				"            headers: {\n");
                		builder.append("'api-key':'"+APIkey+"'\n}\n};\n");
                		builder.append("request.post(url, options, function(err, response, body){\r\n" + 
                				"            console.log('send cmd response');\r\n" + 
                				"            console.info(response.body);\r\n" + 
                				"        });\n");
                		builder.append("});\n");
                		builder.append("};\n");
                	}
                	else {
                		builder.append("MQTT.prototype.receive" + m.getName() + "On" + p.getName() + " = function(");
	                    int i = 0;
	                    builder.append(m.getName());
	//                    for (Parameter pa : m.getParameters()) {
	//                        if (i > 0)
	//                            builder.append(", ");
	//                        builder.append(ctx.protectKeyword(pa.getName()));
	//                        i++;
	//                    }
	                    builder.append(") {\n");
	                    builder.append("this.client.publish('" + m.getName()+ "', this.formatter." + m.getName() + "ToFormat(");
	                    i = 0;
	                    for (Parameter pa : m.getParameters()) {
	                        if (i > 0)
	                            builder.append(", ");
	                        builder.append(m.getName() + "." + ctx.protectKeyword(pa.getName()));
	                        i++;
	                    }
	//                    builder.append(ctx.protectKeyword(m.getName())); 
	                    builder.append("), {qos: 0, retain: true}, function(error, packet) {\n" + 
	                    		"    if(error != null){\n" + 
	                    		"      console.log(\"publish error:\",error);\n" + 
	                    		"      console.log(\"packet:\", packet);\r\n" + 
	                    		"    }\n" + 
	                    		"  });\n");
	                    
	                    builder.append("};\n\n");
                	}
                }
            }
            template = template.replace("/*$RECEIVERS$*/", "/*$RECEIVERS$*/\n" + builder.toString());
            try {
                final File f = new File(ctx.getOutputDirectory() + "/OneNETMQTTJS.js");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(template, output, Charset.forName("UTF-8"));
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void updateMain(Context ctx, Configuration cfg, ExternalConnector conn) {
            try {
                final InputStream input = new FileInputStream(ctx.getOutputDirectory() + "/main.js");
                final List<String> packLines = IOUtils.readLines(input);
                String main = "";
                for (String line : packLines) {
                    main += line + "\n";
                }
                input.close();
//                final String url = "mqtt://" + AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "url", "127.0.0.1:1883");
                final String subtopic = AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "subscribe", "''");
                final String pubtopic = AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "publish", "''");
                final String options = "var options = {\n" + 
                		"    host: '183.230.40.39',\n" + 
                		"    port: '6002',\n" + 
                		"    protocol: 'mqtt',\n" + 
                		"    clean: false,\n" + 
                		"	}\n";
                final String clientId = AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "clientId", "'598522053'");
                final String pid = AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "username", "'345509'");
                final String APIkey = AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "password", "'RFVyURjjwLBt5wkHLVvPWavTARw='");
                StringBuilder optionsBuilder = new StringBuilder();
                optionsBuilder.append(options);
                optionsBuilder.append("options.clientId = '" + clientId + "'\n");
                optionsBuilder.append("options.username = '" + pid + "'\n");
                optionsBuilder.append("options.password = '" + APIkey + "'\n");
                main = main.replace("/*$REQUIRE_PLUGINS$*/", "const OneNET = require('./OneNETMQTTJS');\n/*$REQUIRE_PLUGINS$*/\n");
                main = main.replace("/*$PLUGINS$*/", "/*$PLUGINS$*/\n" + 
                optionsBuilder.toString() + "const onenet = new OneNET(\"OneNET\", " + "options" + ", " + subtopic + ", " + pubtopic + ", inst_" + conn.getInst().getName() + ");\n"+
                		"onenet.getOneNETdevices();\n");
                main = main.replace("/*$STOP_PLUGINS$*/", "mqtt._stop();\n/*$STOP_PLUGINS$*/\n");

                StringBuilder builder = new StringBuilder();
                for (Message req : conn.getPort().getSends()) {
                    builder.append("inst_" + conn.getInst().getName() + ".bus.on('" + conn.getPort().getName() + "!" + req.getName() + "', (");
//                    for (Parameter p : req.getParameters()) {
//                    	if (req.getParameters().indexOf(p)>0)
//                    		builder.append(", ");
//                    	builder.append(p.getName());
//                    }                    
                    builder.append(req.getName());
                    builder.append(") => onenet.mqtt.receive" + req.getName() + "On" + conn.getPort().getName() + "(");
//                    for (Parameter p : req.getParameters()) {
//                    	if (req.getParameters().indexOf(p)>0)
//                    		builder.append(", ");
//                    	builder.append(p.getName()+"." + p.getName());
//                    }
                    builder.append(req.getName());
                    builder.append(")");
                    builder.append(");\n");
                }
                main = main.replace("/*$PLUGINS_CONNECTORS$*/", builder.toString() + "\n/*$PLUGINS_CONNECTORS$*/");

                if (AnnotatedElementHelper.hasAnnotation(conn.getProtocol(), "server") || AnnotatedElementHelper.hasAnnotation(conn, "server")) {
                    String template = ctx.getTemplateByID("templates/JsMQTTServer.js");
                    String port = AnnotatedElementHelper.annotationOrElse(conn, "server",  AnnotatedElementHelper.annotationOrElse(conn.getProtocol(), "server", "1883"));
                    try {
                        Integer.parseInt(port);
                    } catch (NumberFormatException e) {
                        System.err.println("port " + port + " is not valid. Using 1883 instead");
                        port = "1883";
                    }
                    template = template.replace("/*$PORT$*/", port);
                    main = main.replace("/*$REQUIRE_PLUGINS$*/", "/*$REQUIRE_PLUGINS$*/\n" + template);
                    main = main.replace("/*$STOP_PLUGINS$*/", "server.close();\n/*$STOP_PLUGINS$*/\n");
                }

                final File f = new File(ctx.getOutputDirectory() + "/main.js");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(main, output, Charset.forName("UTF-8"));
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
