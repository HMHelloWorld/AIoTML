/**
 * generated by Xtext 2.10.0
 */
package org.aiotml.xtext.web;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.aiotml.xtext.AiotMLRuntimeModule;
import org.aiotml.xtext.AiotMLStandaloneSetup;
import org.aiotml.xtext.ide.AiotMLIdeModule;
import org.aiotml.xtext.web.AiotMLWebModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages in web applications.
 */
@SuppressWarnings("all")
public class AiotMLWebSetup extends AiotMLStandaloneSetup {
  @Override
  public Injector createInjector() {
    AiotMLRuntimeModule _aiotMLRuntimeModule = new AiotMLRuntimeModule();
    AiotMLIdeModule _aiotMLIdeModule = new AiotMLIdeModule();
    AiotMLWebModule _aiotMLWebModule = new AiotMLWebModule();
    return Guice.createInjector(Modules2.mixin(_aiotMLRuntimeModule, _aiotMLIdeModule, _aiotMLWebModule));
  }
}
