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
package org.aiotml.eclipse.ui.commands;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.action.IContributionItem;
import org.eclipse.ui.actions.CompoundContributionItem;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.IWorkbenchContribution;
import org.eclipse.ui.services.IServiceLocator;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.configuration.CfgExternalConnectorCompiler;
import org.aiotml.compilers.registry.AiotMLCompilerRegistry;

public class DynamicCompilerMenu extends  CompoundContributionItem implements IWorkbenchContribution {
	    
	@Override
	protected IContributionItem[] getContributionItems() {
			
		int index = 0;
		for (AiotMLCompiler c : AiotMLCompilerRegistry.getInstance().getCompilerPrototypes()) {
			index = index + c.getConnectorCompilers().entrySet().size() + 1;
		}
		
		//System.out.println("\t\tindex = " + index);

		IContributionItem[] list = new IContributionItem[index];
		int i=0;
		Map<String, String> parms;
		for (AiotMLCompiler c : AiotMLCompilerRegistry.getInstance().getCompilerPrototypes()) {
			System.out.println("Create menu item for compiler " + c.getName());
			parms = new HashMap<String, String>();
			parms.put("org.aiotml.eclipse.ui.commandParameterCompilerName", c.getID());
			list[i] =  new CommandContributionItem(new CommandContributionItemParameter(serviceLocator, "itemid_"+i, "aiotml.compile", parms, null, null, null, c.getID(), null, c.getDescription(), CommandContributionItem.STYLE_PUSH, null, true));
			i++;
			for (final Map.Entry<String, CfgExternalConnectorCompiler> connectorCompiler : c.getConnectorCompilers().entrySet()) {
				parms = new HashMap<String, String>();
				parms.put("org.aiotml.eclipse.ui.commandParameterCompilerName", c.getID() + "/" + connectorCompiler.getKey());
				//parms.put("org.aiotml.eclipse.ui.commandParameterCompilerConnectorName", connectorCompiler.getKey());
				list[i] =  new CommandContributionItem(new CommandContributionItemParameter(serviceLocator, "itemid_"+i, "aiotml.compile", parms, null, null, null, c.getID() + "/" + connectorCompiler.getKey(), null, connectorCompiler.getKey(), CommandContributionItem.STYLE_PUSH, null, true));
				i++;
			}			
		}

		return list;

	}

	// Service locator to located the handler service.
	private IServiceLocator serviceLocator;

	@Override
	public void initialize(IServiceLocator serviceLocator) {
		this.serviceLocator = serviceLocator;
	}




}
