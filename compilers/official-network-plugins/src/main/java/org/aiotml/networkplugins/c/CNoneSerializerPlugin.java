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

/**
 *
 * @author sintef
 */
package org.aiotml.networkplugins.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.compilers.spi.SerializationPlugin;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Protocol;

public class CNoneSerializerPlugin extends SerializationPlugin {
    CCompilerContext cctx;

    public CNoneSerializerPlugin() {
        super();
    }

    @Override
    public SerializationPlugin clone() {
        return new CNoneSerializerPlugin();
    }

    @Override
    public void setContext(Context ctx) {
        context = ctx;
        cctx = (CCompilerContext) context;
    }
  //TODO
    @Override
    public String generateSerialization(StringBuilder builder, Protocol prot, Message m, ExternalConnector eco) {
    	return builder.toString();
    }
    @Override
    public String generateSerialization(StringBuilder builder, String bufferName, Message m, ExternalConnector eco) {
        builder.append("CNoneSerializerPlugin() is a dummy serializer whos content not shall be used\n");
        return "Error";
    }

    @Override
    public void generateParserBody(StringBuilder builder, String bufferName, String bufferSizeName, Set<Message> messages, String sender, ExternalConnector eco) {
        builder.append("CNoneSerializerPlugin() is a dummy serializer whos content not shall be used\n");
    }

    @Override
    public String getPluginID() {
        return "CNoneSerializerPlugin";
    }

    @Override
    public List<String> getTargetedLanguages() {

        List<String> res = new ArrayList<>();
        res.add("posix");
        res.add("arduino");
        res.add("sintefboard");
        return res;
    }

    @Override
    public List<String> getSupportedFormat() {

        List<String> res = new ArrayList<>();
        res.add("None");
        return res;
    }

}
