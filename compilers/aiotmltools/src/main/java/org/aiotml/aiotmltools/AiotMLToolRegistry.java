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
package org.aiotml.aiotmltools;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.aiotml.generator.go.GoSONMQTTGenerator;
import org.aiotml.generator.java.JavaJSONMQTTGenerator;
import org.aiotml.generator.javascript.JavaScriptJSONMQTTGenerator;
import org.aiotml.generator.posix.PosixJSONMQTTGenerator;
import org.aiotml.monitor.MonitorGenerator;
/**
 * Created by vassik on 05.04.17.
 */
import org.aiotml.testconfigurationgenerator.TestConfigurationGenerator;

/**
 *
 * @author sintef
 */
public class AiotMLToolRegistry {

    private static AiotMLToolRegistry instance;
    private HashMap<String, AiotMLTool> tools = new HashMap<String, AiotMLTool>();

    public static AiotMLToolRegistry getInstance() {

        if (instance == null) {
            instance = new AiotMLToolRegistry();
            instance.addTool(new TestConfigurationGenerator());
            instance.addTool(new PosixJSONMQTTGenerator());
            instance.addTool(new JavaJSONMQTTGenerator());
            instance.addTool(new JavaScriptJSONMQTTGenerator());
            instance.addTool(new GoSONMQTTGenerator());
            instance.addTool(new MonitorGenerator(false));
            instance.addTool(new MonitorGenerator(true));
        }

        return instance;
    }

    public Set<String> getToolIds() {
        return tools.keySet();
    }

    public Collection<AiotMLTool> getToolPrototypes() {
        return tools.values();
    }

    public void addTool(AiotMLTool t) {
        tools.put(t.getID(), t);
    }

    public AiotMLTool createToolInstanceByName(String id) {
        if (tools.get(id) == null) {
            return null;
        } else {
            return tools.get(id).clone();
        }
    }
}