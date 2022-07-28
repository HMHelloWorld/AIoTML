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
package org.aiotml.testing.framework;

import java.io.File;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

import org.junit.internal.runners.model.EachTestNotifier;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.testing.errors.AiotMLCompilationError;
import org.aiotml.testing.errors.AiotMLTestCaseCompilerError;
import org.aiotml.testing.errors.AiotMLTimeoutError;
import org.aiotml.testing.helpers.PlatformHelpers;
import org.aiotml.testing.languages.GoTestCase;
import org.aiotml.testing.languages.JavaTestCase;
import org.aiotml.testing.languages.NodeJSTestCase;
import org.aiotml.testing.languages.PosixMTTestCase;
import org.aiotml.testing.languages.PosixTestCase;
import org.aiotml.testing.utilities.CommandRunner.Output;
import org.aiotml.testing.utilities.TemporaryDirectory;
import org.aiotml.utilities.logging.BufferedLogger;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;

public abstract class AiotMLTestCase implements Describable, Runnable {
	
	private boolean prototype;
	private String id;
	private Description description;
	protected AiotMLTest parent;
	protected AiotMLCompiler compiler;
	
	private RunNotifier notifier;
	
	protected AiotMLTestCase(AiotMLCompiler compiler) {
		this.prototype = true;
		this.compiler = compiler;
		this.id = compiler.getID();
	}
	
	protected AiotMLTestCase(AiotMLTest parent, AiotMLCompiler compiler) {
		this.prototype = false;
		this.compiler = compiler;
		this.id = compiler.getID();
		this.parent = parent;
		
		// Make description - since the Maven Surefire reports doesn't keep the Description tree as Eclipse does - we can use a fake classname to regenerate it later 
		String name = compiler.getClass().getSimpleName().replace("Compiler", "") + " [" + this.parent.name + "]";
		this.description = Description.createTestDescription(this.parent.className, name, UUID.randomUUID());
	}
	
	public String getCompilerId() { return this.id; }
	public AiotMLCompiler getCompiler() { return this.compiler; }
	
	@Override
	public Description getDescription() {
		if (this.prototype) throw new RuntimeException("AiotMLTestCase.getDescription() called on a prototype");
		return description;
	}
	
	/* --- Runnable interface --- */
	public void setNotifier(RunNotifier notifier) { this.notifier = notifier; }
	
	@Override
	public final void run() {
		if (this.prototype) throw new RuntimeException("AiotMLTestCase.run() called on a prototype");
		
		if (this.notifier == null) throw new RuntimeException("No RunNotifier set in TestCase");
		if (this.parent == null) throw new RuntimeException("No parent set in TestCase");
		
		EachTestNotifier not = new EachTestNotifier(this.notifier, this.description);
		
		not.fireTestStarted();
		
		AssertionError error;
		try {
			error = this.runCase();
		} catch (AiotMLTimeoutError e) {
			error = e;
		} catch (InterruptedException e) {
			error = new AiotMLTimeoutError();
		} catch (Exception e) {
			String stackTrace = "";
			for(StackTraceElement el : e.getStackTrace()) {
				stackTrace += "\n\t" + el.toString();
			}	
			error = new AssertionError("Exception while running test case" + stackTrace, e);
		}
		
		if (error != null)
			not.addFailure(error);
		
		not.fireTestFinished();
	}
	
	private static final Object flattenLock = new Object();
	public final AssertionError runCase() throws InterruptedException {
		if (this.prototype) throw new RuntimeException("AiotMLTestCase.run() called on a prototype");
		
		// Make a copy of the test model so that we can modify it without breaking it for other compilers
		AiotMLModel caseModel;
		synchronized (flattenLock) {
			caseModel = AiotMLHelpers.flattenModel(this.parent.model);
		}
		
		try {
			// First of all - check if we can the testcase compiler on the current platform
			tryCurrentPlatform();
			
			// Generate file dumper implementation
			Thing dumper = PlatformHelpers.findFileDumperThing(caseModel);
			if (dumper != null) {
				ActionBlock dumperBody = PlatformHelpers.findFileDumperFunctionBody(caseModel);
				Property dumperPath = PlatformHelpers.findFileDumperPathProperty(caseModel);
				if (dumperBody != null && dumperPath != null)
					populateFileDumper(dumper, dumperBody, dumperPath);
			}
			
			// Generate stop execution function implementations
			Collection<Entry<Thing,ActionBlock>> stopExecutionBodies = PlatformHelpers.findStopExecutionFunctionBodies(caseModel);
			for (Entry<Thing,ActionBlock> body : stopExecutionBodies)
				populateStopExecution(body.getKey(), body.getValue());
			
			// Save the final model that will be used in 'target/test-gen/<Compiler>/<test>.aiotml'
			try {
				File dir = new File("target/test-gen/"+this.id);
				dir.mkdirs();
				File file = new File(dir, this.parent.name+".aiotml");
				synchronized (flattenLock) {
					AiotMLModel saveCopy = AiotMLHelpers.flattenModel(caseModel);
					AiotMLCompiler.saveAsAiotML(saveCopy, file.getAbsolutePath());
				}
			} catch (Throwable t) {} // We don't want this to screw up any testing
			
			// For each configuration
			for (Configuration config : caseModel.getConfigs()) {
				File tempDir = null;
				try {
					// Make a temporary directory to store the generated code while running
					tempDir = TemporaryDirectory.create();
					
					// Generate platform code
					this.compiler.setOutputDirectory(tempDir);
					BufferedLogger buffer = Logger.newBuffered();
					if (!this.compiler.compile(config, buffer)) {
						throw new AiotMLCompilationError(buffer);
					}
					
					// Allow the parent AiotMLTest to possibly modify the contents of the directory
					// TODO: Should we maybe find the matching configuration in the parents model? It doesn't actually know anything about the reference we passed it...
					this.parent.prepareDirectory(this.id, config, tempDir);
					
					// Allow preparing everything, but without actually running the tests
					if (!System.getProperty("noRun", "false").equalsIgnoreCase("true")) {
						// Execute the platform test code
						Output executorResult = executePlatformCode(config, tempDir);
						
						// Allow the parent AiotMLTest to verify whether the test run was successful or not
						// TODO: same as above for the configuration
						this.parent.verifyExecutionResults(this.id, config, tempDir, executorResult);
					}
				} finally {
					TemporaryDirectory.delete(tempDir);
				}
			}
		} catch (AssertionError e) {
			return e;
		}
		
		return null;
	}
	
	
	
	
	
	/* --- Interface to be implemented in actual test case compilers --- */
	protected abstract AiotMLTestCase clone(AiotMLTest parent, AiotMLCompiler compiler);
	
	protected abstract void tryRunOnCurrentPlatform() throws AssertionError;
	
	protected abstract void populateFileDumper(Thing dumper, ActionBlock function, Property path) throws AssertionError;
	
	protected abstract void populateStopExecution(Thing thing, ActionBlock body) throws AssertionError;
	
	protected abstract Output executePlatformCode(Configuration configuration, File directory) throws AssertionError;
	
	
	
	
	/* --- Static list of all test case compilers that is implemented --- */
	private static AiotMLTestCase[] cases = {
		new NodeJSTestCase(),
		new JavaTestCase(),
		new PosixTestCase(),
		new PosixMTTestCase(),
		new GoTestCase(),
		// Add implemented compilers here
	};
	
	private static AiotMLTestCase findFromId(String id) {
		for (AiotMLTestCase cse : cases)
			if (cse.id.equals(id)) return cse;
		throw new RuntimeException("No AiotMLTestCase compiler defined with id '"+id+"'");
	}
	
	public static AiotMLTestCase cloneFromId(String id, AiotMLTest parent) {
		AiotMLTestCase cse = findFromId(id);
		return cse.clone(parent, cse.compiler.clone());
	}
	
	public static String[] allCompilers() {
		String[] result = new String[cases.length];
		for (int i = 0; i < cases.length; i++) {
			result[i] = cases[i].id;
		}
		return result;
	}
	
	public static String[] selectedCompilers() {
		String[] all = allCompilers();
		String compilers = System.getProperty("compilers", "");
		if (compilers.isEmpty())
			return all;
		else {
			Set<String> selected = new HashSet<String>();
			for (String compiler : compilers.split(","))
				for (String comp : all)
					if (comp.equalsIgnoreCase(compiler))
						selected.add(comp);
			return selected.toArray(new String[0]);
		}
	}
	
	
	// Keep track of errors returned from trying to run the testcase compilers on this platform
	// so that we don't spend any time doing that in the actual test execution
	private static Map<String, AssertionError> tryResults = new HashMap<String, AssertionError>();
	
	public static void tryCurrentPlatform(String id) throws AssertionError {
		if (!tryResults.containsKey(id)) {
			try {
				AiotMLTestCase cse = findFromId(id);
				cse.tryRunOnCurrentPlatform();
			} catch (AssertionError e) {
				tryResults.put(id, new AiotMLTestCaseCompilerError(id, e));
			}
		}
		if(tryResults.get(id) != null) throw tryResults.get(id);
	}
	
	public void tryCurrentPlatform() throws AssertionError { tryCurrentPlatform(this.id); }
}
