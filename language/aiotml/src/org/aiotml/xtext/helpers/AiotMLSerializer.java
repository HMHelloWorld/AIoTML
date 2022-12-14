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
package org.aiotml.xtext.helpers;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.serializer.ISerializer;
import org.aiotml.xtext.AiotMLStandaloneSetup;

import com.google.inject.Inject;

public class AiotMLSerializer {

	// TODO: This Serializer should use the AiotMLFormatter to produce
	// code that is properly pretty printed (same as Ctrl+Shift+F in eclipse
	// and the saving of EMF Resources which actually works).
	// I do not understand why this serializer defaults to OneWhitespaceFormatter
	// See issue #272.
	
	@Inject
	ISerializer serializer;
	
	private static AiotMLSerializer _instance = null;
	
	public static AiotMLSerializer getInstance() {
		if (_instance == null) _instance = new AiotMLSerializer();
		return _instance;
	}
	
	
	private AiotMLSerializer() {
		AiotMLStandaloneSetup setup = new AiotMLStandaloneSetup();
		setup.createInjectorAndDoEMFRegistration();
		setup.createInjector().injectMembers(this);
	}
	
	public String toString(EObject object) {
		return serializer.serialize(object, SaveOptions.newBuilder().format().getOptions());
	}
	
}
