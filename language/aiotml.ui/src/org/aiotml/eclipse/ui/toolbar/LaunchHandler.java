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
package org.aiotml.eclipse.ui.toolbar;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.aiotml.eclipse.ui.launch.MainTab;

public abstract class LaunchHandler extends AbstractHandler {
	
	private String launchMode;
	private String launchGroup;
	private String command;
	
	public LaunchHandler(String launchMode, String launchGroup, String command) {
		this.launchMode = launchMode;
		this.launchGroup = launchGroup;
		this.command = command;
	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		ILaunchConfiguration configToLaunch = null;
		if ("true".equalsIgnoreCase(event.getParameter(command+".popup"))) {
			// If triggered from the popup-menu, get the selected file
			IFile selectedFile = null;
			ISelection selection = window.getSelectionService().getSelection();
			if (selection instanceof IStructuredSelection) {
				List<?> selectionlist = ((IStructuredSelection)selection).toList();
				for (Object selected : selectionlist) {
					if (selected instanceof IFile) {
						IFile possibleAiotmlFile = (IFile)selected;
						if ("aiotml".equals(possibleAiotmlFile.getFileExtension()))
							selectedFile = possibleAiotmlFile;
					}
				}
				if (selectionlist.size() > 1) {
					MessageDialog.openError(window.getShell(), "Cannot find AiotML configuration", "Multiple files selected");
					return null;
				}
			}
			if (selectedFile == null) {
				MessageDialog.openError(window.getShell(), "Cannot find AiotML configuration", "No .aiotml-file selected");
			} else {
				String compiler = event.getParameter(command+".compiler");
				ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
				ILaunchConfigurationType configType = manager.getLaunchConfigurationType("org.aiotml.eclipse.ui.launchconfiguration");
				try {
					// Check if there already is a launch configuration for this pair of (file, compiler)
					boolean previousFound = false;
					for (ILaunchConfiguration config : manager.getLaunchConfigurations(configType)) {
						// Check if file matches
						IResource[] resources = config.getMappedResources();
						if (resources.length == 1 && resources[0].equals(selectedFile)) {
							// Check if compiler matches
							String usedCompiler = config.getAttribute("org.aiotml.launchconfig.compiler", "");
							if (usedCompiler.equals(compiler)) {
								configToLaunch = config;
								previousFound = true;
								break;
							}
						}
					}
					// If no matching configuration was found, create a new one
					if (!previousFound) {
						ILaunchConfigurationWorkingCopy newConfig = configType.newInstance(null, selectedFile.getName()+" ("+compiler+")");
						MainTab.setConfigurationDefaults(newConfig);
						newConfig.setAttribute("org.aiotml.launchconfig.compiler", compiler);
						newConfig.setMappedResources(new IResource[] { selectedFile });
						configToLaunch = newConfig.doSave();
					}
				} catch (CoreException e) {
					MessageDialog.openError(window.getShell(), "Error launching AiotML", e.getMessage());
					return null;
				}
			}
		}
		// If not started from the popup-menu
		if (configToLaunch == null) {
			// Check if there is a previous launched configuration
			ILaunchConfiguration lastConfig = DebugUITools.getLastLaunch("org.aiotml.eclipse.ui.launchgroup."+launchGroup);
			if (lastConfig != null) {
				configToLaunch = lastConfig;
			}
		}
		
		if (configToLaunch == null) {
			// If no configuration could be found or generated, show the dialog to make a new one manually
			DebugUITools.openLaunchConfigurationDialogOnGroup(window.getShell(), null, "org.aiotml.eclipse.ui.launchgroup."+launchGroup);
		} else {
			// Run the configuration
			DebugUITools.launch(configToLaunch, launchMode);
		}
		return null;
	}
}
