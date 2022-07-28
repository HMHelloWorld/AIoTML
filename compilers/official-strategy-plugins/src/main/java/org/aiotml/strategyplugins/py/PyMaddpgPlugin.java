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
package org.aiotml.strategyplugins.py;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.strategy.StrategyPlugin;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Strategy;

public class PyMaddpgPlugin extends StrategyPlugin {

	@Override
	public String getPluginID() {
		return "PyMaddpgPlugin";
	}

	@Override
	public List<String> getSupportedStrategys() {
		List<String> res = new ArrayList<>();
        res.add("maddpg");
        res.add("MADDPG");
        res.add("Maddpg");
        return res;
	}

	@Override
	public List<String> getTargetedLanguages() {
		List<String> res = new ArrayList<>();
        res.add("python");
        return res;
	}

	@Override
	public void generateStrategyLibrary(Configuration cfg, Context ctx, Set<Strategy> strategys) {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		String template = ctx.getTemplateByID("templates/JsOneNETMQTTPlugin.js");
	}

}
