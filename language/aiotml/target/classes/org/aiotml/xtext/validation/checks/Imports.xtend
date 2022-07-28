package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.constraints.AiotMLHelpers
import org.aiotml.xtext.aiotML.AiotMLModel
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.AiotMLValidatorCheck

class Imports extends AiotMLValidatorCheck {
	
	@Check(FAST)
	def checkImports(AiotMLModel model) {
		model.imports.forEach[imp,i|
			try {
				AiotMLHelpers.getModelFromRelativeURI(AiotMLHelpers.findContainingModel(imp), imp.importURI, imp.from)
			} catch (Exception e) {
				error(e.message, model, AiotMLPackage.eINSTANCE.aiotMLModel_Imports, i)
			}
		]
	}
}