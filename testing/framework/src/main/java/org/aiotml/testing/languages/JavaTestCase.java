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
import org.aiotml.compilers.java.JavaCompiler;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.helpers.AiotMLInjector;
import org.aiotml.testing.utilities.CommandRunner;
import org.aiotml.testing.utilities.CommandRunner.Output;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Thing;

public class JavaTestCase extends AiotMLTestCase {
	public JavaTestCase() {
		super(new JavaCompiler());
	}
	
	protected JavaTestCase(AiotMLTest parent, AiotMLCompiler compiler) {
		super(parent, compiler);
	}

	@Override
	protected AiotMLTestCase clone(AiotMLTest parent, AiotMLCompiler compiler) {
		return new JavaTestCase(parent, compiler);
	}

	@Override
	protected void populateFileDumper(Thing dumper, ActionBlock function, Property path) throws AssertionError {
		AiotMLInjector.addActions(function,
			"`try {`",
			// Write the byte(s) to the file
			"`  byte[] chars = new byte[] { `&C&` };`",			
			"`  java.io.File file = new java.io.File(`&DumpPath&`);`",
			"`  java.nio.file.Files.write(file.toPath(), chars, java.nio.file.StandardOpenOption.APPEND);`",
			"`} catch (java.lang.Exception e) {}`"
		);
	}

	@Override
	protected void populateStopExecution(Thing thing, ActionBlock body) throws AssertionError {
		AiotMLInjector.addActions(body,
			"`System.exit(`&Code&`);`"
		);
	}

	@Override
	protected Output executePlatformCode(Configuration configuration, File directory) throws AssertionError {
		// Run 'mvn install'
		CommandRunner.executePlatformIndependentCommandIn(directory, "mvn install").check("mvn install");
		
		// Run 'mvn exec:java'
		return CommandRunner.executePlatformIndependentCommandIn(directory, "mvn exec:java");
	}

	@Override
	protected void tryRunOnCurrentPlatform() throws AssertionError {
		// Check that we can run Maven (that should mean that Java is also working)
		CommandRunner.executePlatformIndependentCommand("mvn -v", 10).check("mvn -v");
	}

}
