/*
 * generated by Xtext 2.10.0
 */
package org.aiotml.xtext.web

import com.google.inject.Guice
import com.google.inject.Injector
import org.eclipse.xtext.util.Modules2
import org.aiotml.xtext.AiotMLRuntimeModule
import org.aiotml.xtext.AiotMLStandaloneSetup
import org.aiotml.xtext.ide.AiotMLIdeModule

/**
 * Initialization support for running Xtext languages in web applications.
 */

class AiotMLWebSetup extends AiotMLStandaloneSetup {
	
	override Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new AiotMLRuntimeModule, new AiotMLIdeModule, new AiotMLWebModule))
	}
	
}
