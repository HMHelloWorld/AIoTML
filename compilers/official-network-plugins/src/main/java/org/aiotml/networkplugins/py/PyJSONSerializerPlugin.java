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

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.aiotml.compilers.spi.SerializationPlugin;
import org.aiotml.networkplugins.js.JSJSONSerializerPlugin;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Protocol;

public class PyJSONSerializerPlugin extends SerializationPlugin {

	public PyJSONSerializerPlugin() {
		super();
	}
	@Override
	public SerializationPlugin clone() {
		return new PyJSONSerializerPlugin();
	}

	@Override
	public String generateSerialization(StringBuilder builder, Protocol prot, Message m, ExternalConnector eco) {
		String bufferName = prot.getName() + "StringProtocol";
        System.out.println("generateSerialization " + bufferName + " : " + m.getName());
        //Serialize message into binary
        builder.append(bufferName + ".prototype." + m.getName() + "ToFormat = function(");
        for(Parameter p : m.getParameters()) {
            if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
                if (m.getParameters().indexOf(p) > 0)
                    builder.append(", ");
                builder.append(p.getName());
            }
        }
        builder.append(") {\n");
        
        
        final String send_cmd = AnnotatedElementHelper.annotationOrElse(prot, "send_cmd", "");

        if(m.getName().equals(send_cmd)) {
			String send_trans_to = AnnotatedElementHelper.annotationOrElse(prot, "send_trans_to", "");
			builder.append("return JSON.stringify({" + send_trans_to + ": {");
			for(Parameter p : m.getParameters()) {
	            if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
	                if (m.getParameters().indexOf(p) > 0)
	                    builder.append(", ");
	                builder.append(p.getName() + " : " + p.getName());
	            }
	        }
		}	
        else {
	        builder.append("return JSON.stringify({" + m.getName() + ": {");
	        for(Parameter p : m.getParameters()) {
	            if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
	                if (m.getParameters().indexOf(p) > 0)
	                    builder.append(", ");
	                builder.append(p.getName() + " : " + p.getName());
	            }
	        }
        }
        
        builder.append("}});\n");
        builder.append("};\n\n");
        return builder.toString();
	}

	@Override
	public String generateSerialization(StringBuilder builder, String bufferName, Message m, ExternalConnector eco) {
		System.out.println("generateSerialization " + bufferName + " : " + m.getName());
        //Serialize message into binary
		builder.append("	");
        builder.append("def "+m.getName() + "ToFormat(self,");
        for(Parameter p : m.getParameters()) {
            if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
                if (m.getParameters().indexOf(p) > 0)
                    builder.append(", ");
                builder.append(p.getName());
            }
        }
        builder.append("):\n");
        builder.append("		");
        builder.append("return json.dumps({'" + m.getName() + "': {");
        for(Parameter p : m.getParameters()) {
            if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
                if (m.getParameters().indexOf(p) > 0)
                    builder.append(", ");
                builder.append("'"+p.getName() + "' : " + p.getName()+"");
            }
        }
        builder.append("}})\n");
        return builder.toString();
	}

	@Override
	public void generateParserBody(StringBuilder builder, String bufferName, String bufferSizeName,
			Set<Message> messages, String sender, ExternalConnector eco) {
        builder.append("	def parse(self, msgStr):\n");
        builder.append("		msg = {}\n");
        builder.append("		parsed = json.loads(msgStr)\n");
        builder.append("		for key in parsed:\n");
        int i = 0;
        for(Message m : messages) {
        	if(i == 0)
        		builder.append("			if key == '" + m.getName() + "':\n");
        	else
        		builder.append("			elif key == '" + m.getName() + "':\n");
        	i++;
        	builder.append("				msg.['_msg'] = '" + m.getName() + "'\n");
            for(Parameter p : m.getParameters()) {
                if(!AnnotatedElementHelper.isDefined(m, "do_not_forward", p.getName())) {
                    builder.append("				msg['" + p.getName() + "'] = parsed['" + m.getName() +  "']['" + p.getName() + "']\n");
                }
            }

        }

        builder.append("		return msg\n");


	}

	@Override
    public String getPluginID() {
        return "PyJSONSerializerPlugin";
    }

    @Override
    public List<String> getTargetedLanguages() {
        List<String> res = new ArrayList<>();
        res.add("python");
        return res;
    }

    @Override
    public List<String> getSupportedFormat() {

        List<String> res = new ArrayList<>();
        res.add("JSON");
        return res;
    }

}
