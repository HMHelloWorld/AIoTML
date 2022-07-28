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
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.testing.errors.AiotMLLoadModelError;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.utilities.logging.BufferedLogger;

import com.google.common.io.Files;

// A AiotMLTest that loads it's model from a file
public class AiotMLFileTest extends AiotMLTest {
	private static final long serialVersionUID = 1L;
	
	protected File aiotmlFile;
	
	public AiotMLFileTest(File aiotmlFile, String className, String[] compilers) {
		super(null, getNameFromFile(aiotmlFile), className, compilers);
		this.aiotmlFile = aiotmlFile;
	}
	
	private static String getNameFromFile(File aiotmlFile) {
		return Files.getNameWithoutExtension(aiotmlFile.getName());
	}
	
	private static final Object loadLock = new Object();
	
	@Override
	public boolean prepare(RunNotifier notifier) throws InterruptedException {
		// Load the model from the file
		BufferedLogger log = new BufferedLogger();
		synchronized (loadLock) {
			// Since this is not thread-safe, we unfortunately have to do this one at a time
			model = AiotMLCompiler.loadModel(aiotmlFile, log);
		}
		if (log.hasError()) {
			EachTestNotifier not = new EachTestNotifier(notifier, getDescription());
			not.addFailure(new AiotMLLoadModelError(aiotmlFile, log.getError()));
			return false;
		}
		
		return super.prepare(notifier);
	}
}
