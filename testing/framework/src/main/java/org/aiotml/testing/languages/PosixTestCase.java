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
import org.aiotml.compilers.c.posix.PosixCompiler;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.helpers.AiotMLInjector;
import org.aiotml.testing.utilities.CommandRunner;
import org.aiotml.testing.utilities.CommandRunner.Output;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;

public class PosixTestCase extends AiotMLTestCase {
	public PosixTestCase() {
		super(new PosixCompiler());
	}
	
	// Allow sub-classing this class
	protected PosixTestCase(AiotMLCompiler compiler) {
		super(compiler);
	}
	
	protected PosixTestCase(AiotMLTest parent, AiotMLCompiler compiler) {
		super(parent, compiler);
	}

	@Override
	protected AiotMLTestCase clone(AiotMLTest parent, AiotMLCompiler compiler) {
		return new PosixTestCase(parent, compiler);
	}
	
	private void addHeaders(AnnotatedElement element, String... headers) {
		for (String header : headers) {
			PlatformAnnotation annotation = AiotMLFactory.eINSTANCE.createPlatformAnnotation();
			annotation.setName("c_header");
			annotation.setValue(header);
			element.getAnnotations().add(annotation);
		}
	}

	@Override
	protected void populateFileDumper(Thing dumper, ActionBlock function, Property path) throws AssertionError {
		AiotMLInjector.addActions(function,
			"`int fd = open(`&DumpPath&`, O_APPEND|O_SYNC|O_WRONLY);`",
			"`write(fd, &`&C&`, 1);`",
			"`close(fd);`"
		);
		// Add some includes
		addHeaders(dumper,
			"#include <sys/stat.h>",
			"#include <fcntl.h>",
			"#include <unistd.h>"
		);
	}

	@Override
	protected void populateStopExecution(Thing thing, ActionBlock body) throws AssertionError {
		AiotMLInjector.addActions(body,
			"`exit(`&Code&`);`"
		);
		// Add some includes
		addHeaders(thing,
			"#include <stdlib.h>"
		);
	}

	@Override
	protected Output executePlatformCode(Configuration configuration, File directory) throws AssertionError {
		CommandRunner.executePlatformIndependentCommandIn(directory, "make").check("make");
		return CommandRunner.executePlatformIndependentCommandIn(directory, "./"+configuration.getName());
	}
	

	@Override
	protected void tryRunOnCurrentPlatform() throws AssertionError {
		CommandRunner.executePlatformIndependentCommand("make -v", 10).check("make -v");
		CommandRunner.executePlatformIndependentCommand("gcc -v", 10).check("gcc -v");
	}
}
