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
package org.aiotml.networkplugins.py;

import java.io.File;
import java.io.FileOutputStream;
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
import org.aiotml.compilers.spi.NetworkPlugin.ThingPortMessage;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Protocol;

public class PyWSPlugin extends NetworkPlugin {

	@Override
	public String getPluginID() {
		return "PyWSPlugin";
	}

	@Override
	public List<String> getSupportedProtocols() {
		List<String> res = new ArrayList<>();
        res.add("WS");
        res.add("websocket");
        res.add("Websocket");
        return res;
	}

	@Override
	public List<String> getTargetedLanguages() {
		 List<String> res = new ArrayList<>();
	        res.add("python");
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
	@Override
	public void generateNetworkLibrary(Configuration cfg, Context ctx, Set<Protocol> protocols) {
		System.out.println("generateNetworkLibrary " + cfg.getName() + ", " + protocols.size());
		StringBuilder builder;
        for (Protocol prot : protocols) {
            SerializationPlugin sp;
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
                StringBuilder temp = new StringBuilder();
                serializers += sp.generateSerialization(temp, prot.getName() + "StringProtocol", m);
            }

            builder = new StringBuilder();
            messages.clear();
            for (ThingPortMessage tpm : getMessagesReceived(cfg, prot)) {
                addMessage(tpm.m);
            }
            sp.generateParserBody(builder, prot.getName() + "StringProtocol", null, messages, null);
//            final String result = builder.toString().replace("#$SERIALIZERS$#", serializers);

            new WSProtocol(ctx, prot, cfg, builder).generate();
        }
	}
	
	private class WSProtocol {
        Context ctx;
        Protocol prot;
        Configuration cfg;
        StringBuilder serial;
        private List<Port> ports = new ArrayList<Port>();

        public WSProtocol(Context ctx, Protocol prot, Configuration cfg, StringBuilder serial) {
            this.ctx = ctx;
            this.prot = prot;
            this.cfg = cfg;
            this.serial = serial;
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
            String template = ctx.getTemplateByID("templates/PyWSPlugin.py");
            template = template.replace("#$SERIALIZERS$#", "#$SERIALIZERS$#\n"+serial.toString());
//            template = template.replace("/*$FORMAT$*/", prot.getName() + "StringProtocol");
//            template = template.replace("/*$NAME$*/", prot.getName());
            String wsProtocolName = AnnotatedElementHelper.annotationOrElse(prot, "ws_protocol", "");
            if(wsProtocolName.compareTo("") != 0)
                template = template.replace("/*$PROTOCOL$*/", ", \"" + wsProtocolName + "\"");
//            for (ExternalConnector conn : getExternalConnectors(cfg, prot)) {
//                updateMain(ctx, cfg, conn);
//            }
            for(Port p : ports) {
                StringBuilder builder = new StringBuilder();
                builder.append("	def receive_data(self):\n");
                builder.append("		result = self.ws.recv()\n");
                builder.append("		msg = self.parse(result)\n");
                builder.append("		msg['_port'] = '" + p.getName() + "'\n");
//                builder.append("instance._receive(msg);\n");
                
                int k = 0;
                for(Message m : p.getReceives()) {
                	if(k == 0)
                		builder.append("		if msg['_msg'] == ");
                	else
                		builder.append("		elif msg['_msg'] == ");
                	k++;
                	builder.append("'" + m.getName() + "':\n");
                	builder.append("			self.eventq.put(msg)\n");

                }

                template = template.replace("#$DISPATCH$#", "#$DISPATCH$#\n" + builder.toString());
            }
            StringBuilder builder = new StringBuilder();
            for (Port p : ports) {
                for (Message m : p.getSends()) {
                    builder.append("	def send" + m.getName() + "On" + p.getName() + "(self, ");
                    int i = 0;
                    builder.append(m.getName());
//                    for (Parameter pa : m.getParameters()) {
//                        if (i > 0)
//                            builder.append(", ");
//                        builder.append(ctx.protectKeyword(pa.getName()));
//                        i++;
//                    }
                    builder.append(") :\n");
                    builder.append("		self.ws.send(self." + m.getName() + "ToFormat(self, ");
                    i = 0;
                    for (Parameter pa : m.getParameters()) {
                        if (i > 0)
                            builder.append(", ");
//                        builder.append(ctx.protectKeyword(pa.getName()));
                        builder.append(m.getName()  +"['"+ ctx.protectKeyword(pa.getName())+"']");
                        i++;
                    }
                    builder.append(")\n");

                }
            }
            template = template.replace("#$SENDMSGS$#", "#$SENDMSGS$#\n" + builder.toString());
            try {
                final File f = new File(ctx.getOutputDirectory() + "/WSPY.py");
                final OutputStream output = new FileOutputStream(f);
                IOUtils.write(template, output, Charset.forName("UTF-8"));
                IOUtils.closeQuietly(output);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
	}

}
