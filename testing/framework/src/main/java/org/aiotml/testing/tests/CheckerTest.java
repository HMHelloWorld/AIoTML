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
package org.aiotml.testing.tests;

import java.io.File;

import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.runner.notification.RunNotifier;
import org.aiotml.testing.errors.AiotMLCheckerError;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.validation.Checker;

public class CheckerTest extends AiotMLFileTest {
	private static final long serialVersionUID = 1L;

	public CheckerTest(File aiotmlFile, String className, String[] compilers) {
		super(aiotmlFile, className, compilers);
	}
	
	@Override
	public boolean prepare(RunNotifier notifier) throws InterruptedException {
		// The Checker tests doesn't modify the model, so we don't need to flatten it
		this.shouldFlatten = false;
		// Load model from file and run generic preparation
		if (!super.prepare(notifier)) return false;
		
		// Figure out if the checker should fail, and if it is the generic one or the compiler one that should fail
		boolean shouldSucceed = findAnnotation("checker_should_fail", "false");
		boolean compilerChecker = findAnnotation("checker", "compiler");
		
		if (!compilerChecker) {
			// We should try the generic checker
			Checker checker = new Checker();
			checker.validateModel(this.model);
			
			EachTestNotifier not = new EachTestNotifier(notifier, getDescription());
			
			if (shouldSucceed == checker.hasErrors())
				not.addFailure(new AiotMLCheckerError(shouldSucceed, compilerChecker, checker.getErrors()));
			
			for (AiotMLTestCase cse : this.cases)
				notifier.fireTestIgnored(cse.getDescription());
			
		} else {
			// We should try the individual compiler checkers
			for (AiotMLTestCase cse : this.cases) {
				EachTestNotifier not = new EachTestNotifier(notifier, cse.getDescription());
				not.fireTestStarted();
				
				Checker checker = cse.getCompiler().checker;
				checker.validateModel(this.model);
				
				if (shouldSucceed == checker.hasErrors())
					not.addFailure(new AiotMLCheckerError(shouldSucceed, compilerChecker, checker.getErrors()));
				
				not.fireTestFinished();
			}
		}
		
		return true;
	}
	
	@Override
	public boolean shouldRun() {
		// These tests should never be compiled and executed - but maybe the super needs to do something
		return super.shouldRun() && false;
	}
	
	@Override
	public boolean shouldIgnoreCases() {
		// The cases should not be ignored even though they are not run - we will set the result ourself
		return super.shouldIgnoreCases() && false;
	}
	
	private boolean findAnnotation(String name, String value) {
		for (Thing thing : AiotMLHelpers.allThings(this.model))
			if (AnnotatedElementHelper.isDefined(thing, name, value))
				return true;
		for (Configuration configuration : AiotMLHelpers.allConfigurations(this.model))
			if (AnnotatedElementHelper.isDefined(configuration, name, value))
				return true;
		return false;
	}
}
