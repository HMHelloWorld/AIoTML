package org.aiotml.xtext.validation

import org.aiotml.xtext.validation.AbstractAiotMLValidator
import org.eclipse.xtext.validation.EValidatorRegistrar

class AiotMLValidatorCheck extends AbstractAiotMLValidator {
	
	// Stop these other checks from registering with the registrar.
	// Otherwise, the checks are run multiple times, and we get multiple copies of each issue
	override register(EValidatorRegistrar registrar) {}
}