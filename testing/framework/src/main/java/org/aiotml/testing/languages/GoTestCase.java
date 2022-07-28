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
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.helpers.AiotMLInjector;
import org.aiotml.testing.utilities.CommandRunner;
import org.aiotml.testing.utilities.CommandRunner.Output;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;

import compilers.go.GoCompiler;

public class GoTestCase extends AiotMLTestCase {
	public GoTestCase() {
		super(new GoCompiler());
	}
	
	protected GoTestCase(AiotMLTest parent, AiotMLCompiler compiler) {
		super(parent, compiler);
	}

	@Override
	protected AiotMLTestCase clone(AiotMLTest parent, AiotMLCompiler compiler) {
		return new GoTestCase(parent, compiler);
	}

	@Override
	protected void populateFileDumper(Thing dumper, ActionBlock function, Property path) throws AssertionError {
		PlatformAnnotation ann = AiotMLFactory.eINSTANCE.createPlatformAnnotation();
		ann.setName("go_import");
		ann.setValue("os");
		dumper.getAnnotations().add(ann);
		
		AiotMLInjector.addActions(function,
			// Open the file for writing
			"`file, err := os.OpenFile(`&DumpPath&`, os.O_APPEND|os.O_RDWR, 0666)`",
			"`if err != nil {`",
			"`  panic(err)`",
			"`}`",
			"`defer file.Close()`",
			// Write the character to the file
			"`file.Write([]byte { `&C&` })`"
		);
	}

	@Override
	protected void populateStopExecution(Thing thing, ActionBlock body) throws AssertionError {
		PlatformAnnotation ann = AiotMLFactory.eINSTANCE.createPlatformAnnotation();
		ann.setName("go_import");
		ann.setValue("os");
		thing.getAnnotations().add(ann);
		
		AiotMLInjector.addActions(body,
			"`if Code > 0 {`",
			"`  os.Exit(int(`&Code&`));`",
			"`}`",
			"`state.Runtime.StopWhenInactive()`"
		);
	}

	@Override
	protected Output executePlatformCode(Configuration configuration, File directory) throws AssertionError {
		// Build command with all .go files (*.go doesn't always work)
		String cmd = "go run";
		for (File file : directory.listFiles())
			if (file.getName().endsWith(".go"))
				cmd += " "+file.getName();
		// Run 'go run ...'
		return CommandRunner.executePlatformIndependentCommandIn(directory, cmd);
	}
	

	@Override
	protected void tryRunOnCurrentPlatform() throws AssertionError {
		CommandRunner.executePlatformIndependentCommand("go version", 10).check("go version");
		// TODO: Install gosm library if not present
	}
}
