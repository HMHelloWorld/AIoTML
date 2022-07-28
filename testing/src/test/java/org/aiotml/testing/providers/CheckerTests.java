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
package org.aiotml.testing.providers;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.aiotml.testing.AiotMLTestProvider;
import org.aiotml.testing.AiotMLTestRunner;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.tests.CheckerTest;
import org.aiotml.testing.tests.general.GeneralTest;

@RunWith(AiotMLTestRunner.class)
public class CheckerTests extends AiotMLTestProvider {
	private static String[] compilers = AiotMLTestCase.selectedCompilers();
	
	@Override
	public String[] getCompilers() { return compilers; }
	
	private Description description;

	@Override
	public Description getDescription() { return description; }

	@Override
	public Collection<AiotMLTest> getTests() {
		Collection<AiotMLTest> tests = new ArrayList<AiotMLTest>();
		
		// Generate description
		description = Description.createSuiteDescription("CheckerTests", UUID.randomUUID());
		
		// Create tests from files
		Collection<File> testFiles = getTestFilesInResourceDir("/tests/Checker/");
		
		for (File testFile : testFiles) {
			String testName = testFile.getName();
			if (testName.lastIndexOf(".") > 0) testName = testName.substring(0, testName.lastIndexOf("."));
			
			CheckerTest test = new CheckerTest(testFile, testName+" [Checker]", compilers);
			tests.add(test);
			
			description.addChild(test.getDescription());
		}
		
		
		return tests;
	}

}
