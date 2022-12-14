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
package org.aiotml.networkplugins.c.arduino;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.compilers.c.CPluginHelper;
import org.aiotml.compilers.spi.NetworkPlugin;
import org.aiotml.compilers.spi.SerializationPlugin;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Protocol;
import org.aiotml.xtext.aiotML.Thing;

/**
 *
 * @author sintef
 */
public class ESP8266WebsocketPlugin extends NetworkPlugin {

    CCompilerContext ctx;

    public String getPluginID() {
        return "ESP8266WebsocketPlugin";
    }

    public List<String> getSupportedProtocols() {
        List<String> res = new ArrayList<>();
        res.add("ws");
        res.add("WS");
        res.add("WebSocket");
        res.add("Websocket");
        return res;
    }

    public List<String> getTargetedLanguages() {
        List<String> res = new ArrayList<>();
        res.add("arduino");
        return res;
    }
    
    public void generateMessageForwarders(StringBuilder builder, StringBuilder headerbuilder, Configuration cfg, Protocol prot) {
            try {
                final SerializationPlugin sp = ctx.getSerializationPlugin(prot);

                for (NetworkPlugin.ThingPortMessage tpm : getMessagesSent(cfg, prot)) {
                    Thing t = tpm.t;
                    Port p = tpm.p;
                    Message m = tpm.m;

                    builder.append("// Forwarding of messages " + prot.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                    builder.append("void forward_" + prot.getName() + "_" + ctx.getSenderName(t, p, m));
                    ctx.appendFormalParameters(t, builder, m);
                    builder.append("{\n");

                    String i = sp.generateSerialization(builder, "forward_buf", m);

                    builder.append("\n//Forwarding with specified function \n");
                    builder.append(prot.getName() + "_forwardMessage(forward_buf, " + i + ");\n");
                    builder.append("}\n\n");

                headerbuilder.append("// Forwarding of messages " + prot.getName() + "::" + t.getName() + "::" + p.getName() + "::" + m.getName() + "\n");
                headerbuilder.append("void forward_" + prot.getName() + "_" + ctx.getSenderName(t, p, m));
                ctx.appendFormalParameters(t, headerbuilder, m);
                headerbuilder.append(";\n");

                }
                
            } catch (UnsupportedEncodingException uee) {
                System.err.println("Could not get serialization plugin... Expect some errors in the generated code");
                uee.printStackTrace();
                return;
            }
        }

    public void generateNetworkLibrary(Configuration cfg, Context ctx, Set<Protocol> protocols) {
        this.ctx = (CCompilerContext) ctx;
        if(protocols.size() > 1) {
            System.out.println("[ERROR] More than one protocol UDP, this is not allowed for ESP8862UDPPlugin");
        } else if(protocols.size() > 0) {
            Protocol protocol = protocols.iterator().next();
            try {
                SerializationPlugin ser = ctx.getSerializationPlugin(protocol);
                Set<ExternalConnector> ecos = this.getExternalConnectors(cfg, protocol);
                if(!ecos.isEmpty()) {
                    String ctemplate = ctx.getTemplateByID("templates/ESP8266WebsocketServerPlugin.c");
                    String htemplate = ctx.getTemplateByID("templates/ESP8266WebsocketServerPlugin.h");


                    String portName = protocol.getName();

                    for (ExternalConnector eco : ecos) {
                        eco.setName(portName);
                    }

                    ctemplate = ctemplate.replace("/*PORT_NAME*/", portName);
                    htemplate = htemplate.replace("/*PORT_NAME*/", portName);


                    Integer remotePort;
                    if (AnnotatedElementHelper.hasAnnotation(protocol, "ws_port")) {
                        remotePort = Integer.parseInt(AnnotatedElementHelper.annotation(protocol, "ws_port").iterator().next());
                    } else {
                        remotePort = 1883;
                    }
                    ctemplate = ctemplate.replace("/*WS_PORT*/", remotePort.toString());

                    String ssid;
                    if (AnnotatedElementHelper.hasAnnotation(protocol, "wifi_ssid")) {
                        ssid = AnnotatedElementHelper.annotation(protocol, "wifi_ssid").iterator().next();
                    } else {
                        ssid = "WIFI_SSID";
                    }
                    ctemplate = ctemplate.replace("/*SSID*/", ssid);

                    String wifiPassword;
                    if (AnnotatedElementHelper.hasAnnotation(protocol, "wifi_password")) {
                        wifiPassword = AnnotatedElementHelper.annotation(protocol, "wifi_password").iterator().next();
                    } else {
                        wifiPassword = "WIFI_PASSWORD";
                    }
                    ctemplate = ctemplate.replace("/*PASSWORD*/", wifiPassword);

                    Set<Message> messages = new HashSet<>();
                    Integer maxMsgSize = 0;
                    for (NetworkPlugin.ThingPortMessage tpm : getMessagesReceived(cfg, protocol)) {
                        Message m = tpm.m;
                        if (m != null)
                            System.out.print("m: " + m.getName());
                        messages.add(m);
                        if (this.ctx.getMessageSerializationSize(m) > maxMsgSize) {
                            maxMsgSize = this.ctx.getMessageSerializationSize(m) - 2;
                        }
                    }

                    ctemplate = ctemplate.replace("/*MAX_MSG_SIZE*/", maxMsgSize.toString());


                    String forward, parserCall;
                    if(AnnotatedElementHelper.isDefined(protocol, "ws_escape_null", "true")) {
                        forward = CPluginHelper.generateNullCharEscaperSend("msg", "size", "buf", "length", portName + "_ESCAPE_CHAR");
                        forward += "     " + portName + "_server.broadcastTXT(buf, length);";

                        parserCall = CPluginHelper.generateNullCharEscaperReceive("payload", "length", "buf", "size", portName + "_ESCAPE_CHAR");
                        parserCall += "     " + portName + "_parser(buf, size);";
                    } else {
                        forward =  "     " + portName + "_server.broadcastTXT(msg, size);";
                        parserCall = "     " + portName + "_parser(payload, length);";
                    }

                    ctemplate = ctemplate.replace("/*FORWARD*/", forward);
                    ctemplate = ctemplate.replace("/*PARSER_CALL*/", parserCall);

                    String escapeByte;
                    if (AnnotatedElementHelper.hasAnnotation(protocol, "ws_escape_byte")) {
                        escapeByte = AnnotatedElementHelper.annotation(protocol, "ws_escape_byte").iterator().next();
                    } else {
                        escapeByte = "125";
                    }
                    ctemplate = ctemplate.replace("/*ESCAPE_CHAR*/", escapeByte);

                    //Connector Instanciation
                    StringBuilder eco_instance = new StringBuilder();
                    eco_instance.append("//Connector");

                    //De Serializer 
                    StringBuilder ParserImplementation = new StringBuilder();
                    ParserImplementation.append("void " + portName + "_parser(byte * msg, uint16_t size) {\n");
                    ser.generateParserBody(ParserImplementation, "msg", "size", messages, portName + "_instance.listener_id");
                    ParserImplementation.append("}\n");

                    ctemplate = ctemplate.replace("/*PARSER*/", ser.generateSubFunctions() + ParserImplementation);

                    //End De Serializer


                    ctemplate = ctemplate.replace("/*INSTANCE_INFORMATION*/", eco_instance);

                    this.ctx.addToInitCode("\n" + portName + "_instance.listener_id = add_instance(&" + portName + "_instance);\n");
                    this.ctx.addToInitCode(portName + "_setup();\n");
                    this.ctx.addToPollCode(portName + "_read();\n");

                    StringBuilder b = new StringBuilder();
                    StringBuilder h = new StringBuilder();
                    generateMessageForwarders(b, h, cfg, protocol);

                    ctemplate += b;
                    htemplate += h;

                    ctx.getBuilder(portName + ".c").append(ctemplate);
                    ctx.getBuilder(portName + ".h").append(htemplate);
                }
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(ESP8266MQTTPlugin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
