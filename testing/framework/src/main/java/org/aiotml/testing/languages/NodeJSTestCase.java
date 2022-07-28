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
package org.aiotml.testing.languages;

import java.io.File;

import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.javascript.node.NodeJSCompiler;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.helpers.AiotMLInjector;
import org.aiotml.testing.utilities.CommandRunner;
import org.aiotml.testing.utilities.CommandRunner.Output;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.ObjectType;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;

public class NodeJSTestCase extends AiotMLTestCase {
	public NodeJSTestCase() {
		super(new NodeJSCompiler());
	}
	
	// Allow sub-classing this class
	protected NodeJSTestCase(AiotMLCompiler compiler) {
		super(compiler);
	}
	
	protected NodeJSTestCase(AiotMLTest parent, AiotMLCompiler compiler) {
		super(parent, compiler);
	}

	@Override
	protected AiotMLTestCase clone(AiotMLTest parent, AiotMLCompiler compiler) {
		return new NodeJSTestCase(parent, compiler);
	}

	@Override
	protected void populateFileDumper(Thing dumper, ActionBlock function, Property path) throws AssertionError {
		ObjectType fsType = AiotMLFactory.eINSTANCE.createObjectType();
		fsType.setName("JavaScriptFS");
		AiotMLHelpers.findContainingModel(dumper).getTypes().add(fsType);
		
		AiotMLInjector.addProperties(dumper,
			"property fs : JavaScriptFS = `require('fs')` as JavaScriptFS"
		);
		
		AiotMLInjector.addActions(function,
			"``&fs&`.appendFileSync(`&DumpPath&`,`&C&`);`"
		);
	}

	@Override
	protected void populateStopExecution(Thing thing, ActionBlock body) throws AssertionError {
		AiotMLInjector.addActions(body,
			"`process.exit(`&Code&`);`"
		);
	}

	@Override
	protected Output executePlatformCode(Configuration configuration, File directory) throws AssertionError {
		// Run 'npm install'
		CommandRunner.executePlatformIndependentCommandIn(directory, "npm install").check("npm install");
		
		// Run 'node main.js'
		return CommandRunner.executePlatformIndependentCommandIn(directory, "node main.js");
	}

	@Override
	protected void tryRunOnCurrentPlatform() throws AssertionError {
		// Check that we can run node.js
		CommandRunner.executePlatformIndependentCommand("node -v", 10).check("node -v");
		
		// Check that we can run npm
		CommandRunner.executePlatformIndependentCommand("npm -v", 10).check("npm -v");
		
		// Check that state.js is installed globally
		//CommandRunner.executePlatformIndependentCommand("npm list -g state.js").check("npm list -g state.js");
	}

}
