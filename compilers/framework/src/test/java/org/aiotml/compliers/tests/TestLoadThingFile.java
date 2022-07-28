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
package org.aiotml.compliers.tests;

import static org.junit.Assert.assertFalse;

import java.io.File;

import org.junit.Test;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.xtext.aiotML.AiotMLModel;

public class TestLoadThingFile extends LoadModelTestsCommon {

	@Test
	public void test() {
		// Get the .aiotml file from resources
		File test = new File(this.getClass().getResource("/SimpleFlatModel.aiotml").getFile());
		
		// Load the model
		AiotMLModel model = AiotMLCompiler.loadModel(test);
		assertFalse("Loaded model is not null", model == null);
		
		// Check that the model is correct
		checkSimpleModel(model);
	}
}
