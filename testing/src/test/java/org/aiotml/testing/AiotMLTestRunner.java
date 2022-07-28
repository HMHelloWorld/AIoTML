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
package org.aiotml.testing;

import java.util.Collection;
import java.util.concurrent.TimeoutException;

import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;
import org.aiotml.testing.errors.AiotMLTimeoutError;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.utilities.TimeoutThreadPoolExecutor;

public class AiotMLTestRunner extends Runner {
	
	private AiotMLTestProvider provider;
	private String[] compilers;
	private Collection<AiotMLTest> tests;
	private Description description;
	
	public AiotMLTestRunner(Class<? extends AiotMLTestProvider> testClass) {
		try {
			provider = testClass.newInstance();
			
			// Get the compilers that will potentially be used
			compilers = provider.getCompilers();
			
			// Get the test cases to run
			tests = provider.getTests();
			
			// Get the test description
			description = provider.getDescription();
			
		} catch (Exception e) {
			provider = null;
		}
	}
	
	@Override
	public void run(RunNotifier notifier) {
		// Create pool to execute tests
		TimeoutThreadPoolExecutor executor = new TimeoutThreadPoolExecutor();
		
		// Run pre-checks on the testcase compilers so that the tests doesn't have to spend time doing that
		for (String compiler : compilers) {
			try { AiotMLTestCase.tryCurrentPlatform(compiler); }
			catch (AssertionError e) {} // Just keep them for later in the cache
		}
		
		// Find the timeout to use during testing
		int timeout = 30;
		try {
			timeout = Integer.parseUnsignedInt(System.getProperty("timeout", "30"));
		} catch (NumberFormatException e) {}
		
		// There seems to be a bug where the first task submitted is not actually executed?
		executor.submit(new Runnable() { @Override public void run() {}}, 1);
		
		// Submit all the tests
		for (AiotMLTest test : tests) {
			test.setNotifier(notifier);
			executor.submit(test, timeout);
		}
		
		// Wait for all tasks to be completed
		try {
			executor.shutdown(60);
		} catch (InterruptedException | TimeoutException e) {
			EachTestNotifier not = new EachTestNotifier(notifier, description);
			not.addFailure(new AiotMLTimeoutError());
		}
	}

	@Override
	public Description getDescription() { return description; }
}
