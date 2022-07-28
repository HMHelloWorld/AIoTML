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
package org.aiotml.testing.errors;

import java.io.File;

public class AiotMLLoadModelError extends AssertionError {
	private static final long serialVersionUID = 1L;
	
	public AiotMLLoadModelError(File aiotmlFile, String stdErr) {
		super(cleanupStdErr(aiotmlFile, stdErr));
	}
	
	private static String cleanupStdErr(File aiotmlFile, String stdErr) {
		// Clean up the output a bit to make it shorter
		String pathPrefix = aiotmlFile.getAbsolutePath().split("test-classes")[0]+"test-classes";
		String uriPrefix = aiotmlFile.toURI().toString().split("test-classes")[0]+"test-classes";
		
		return stdErr.replace(pathPrefix, "").replace(uriPrefix, "");
	}
}
