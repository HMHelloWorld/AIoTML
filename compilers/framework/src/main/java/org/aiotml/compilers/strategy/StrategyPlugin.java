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
package org.aiotml.compilers.strategy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author sintef
 */

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.compilers.Context;
import org.aiotml.compilers.spi.NetworkPlugin.ThingPortMessage;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Protocol;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.Strategy;
import org.aiotml.xtext.aiotML.StrategyProperty;
import org.aiotml.xtext.helpers.ConfigurationHelper;

public abstract class StrategyPlugin {

	public StrategyPlugin() {}
	
	Set<Strategy> assignedStrategys = new HashSet<>();
	public abstract String getPluginID();

    public abstract List<String> getSupportedStrategys();

    public abstract List<String> getTargetedLanguages();

    public abstract void generateStrategyLibrary(Configuration cfg, Context ctx, Set<Strategy> strategys);

    public void addStrategy(Strategy stra) {
    	assignedStrategys.add(stra);
    }

    public Set<Strategy> getAssignedStrategys() {
        return assignedStrategys;
    }

    public void generateStrategyLibrary(Configuration cfg, Context ctx) {
        generateStrategyLibrary(cfg, ctx, assignedStrategys);
    }
    
    /* Should be overriden if the plugin need to perform
     * some specific checking.
    */


    public String getName() {
        return this.getPluginID() + " plugin's rules";
    }


    public String getDescription() {
        return "Check that " + this.getPluginID() + " plugin can be used.";
    }

    public Set<Thing> getThings(Configuration cfg, Strategy stra) {
        Set<Thing> res = new HashSet<>();


        return res;
    }

    
	
}
