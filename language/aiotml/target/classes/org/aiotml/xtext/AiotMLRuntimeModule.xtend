/*
 * generated by Xtext 2.10.0
 */
package org.aiotml.xtext

import org.eclipse.xtext.conversion.IValueConverterService

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class AiotMLRuntimeModule extends AbstractAiotMLRuntimeModule {
	
    override Class<? extends IValueConverterService> bindIValueConverterService() {
            return AiotMLTerminalConverter;
    }
    
}
