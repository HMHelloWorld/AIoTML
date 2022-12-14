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
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.aiotml.testing.AiotMLTestProvider;
import org.aiotml.testing.AiotMLTestRunner;
import org.aiotml.testing.framework.AiotMLTest;
import org.aiotml.testing.framework.AiotMLTestCase;
import org.aiotml.testing.tests.general.GeneralTest;

@RunWith(AiotMLTestRunner.class)
public class GeneralTests extends AiotMLTestProvider {
	private static String[] compilers = AiotMLTestCase.selectedCompilers();
	
	@Override
	public String[] getCompilers() { return compilers; }
	
	private Description description;

	@Override
	public Collection<AiotMLTest> getTests() {
		Collection<AiotMLTest> tests = new ArrayList<AiotMLTest>();
		
		// Create tests from files
		Collection<File> testFiles = getTestFilesInResourceDir("/tests/General/");
		Pattern categoryNamePattern = Pattern.compile("^.*\\/tests\\/General\\/(.+)\\/(.+)\\.aiotml$");
		
		// Organize the tests into categories
		Map<String, Description> categories = new HashMap<String, Description>();
		
		for (File testFile : testFiles) {
			// Get name and category from filename
			Matcher nameMatcher = categoryNamePattern.matcher(testFile.toURI().toString());
			if (!nameMatcher.matches()) continue;
			
			String testCategory = nameMatcher.group(1);
			String testName = nameMatcher.group(2);
			
			// Create test
			GeneralTest test = new GeneralTest(testFile, testName+" [General."+testCategory+"]", compilers);
			tests.add(test);
			
			// Put it into the given category
			if (!categories.containsKey(testCategory))
				categories.put(testCategory, Description.createSuiteDescription(testCategory, UUID.randomUUID()));
			categories.get(testCategory).addChild(test.getDescription());
		}
		
		// Generate description
		this.description = Description.createSuiteDescription("GeneralTests", UUID.randomUUID());
		for (Description category : categories.values())
			this.description.addChild(category);
		
		return tests;
	}
	
	@Override
	public Description getDescription() { return this.description; }
}
