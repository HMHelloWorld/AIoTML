package org.aiotml.xtext.validation.checks

import org.aiotml.xtext.validation.AiotMLValidatorCheck
import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.aiotML.PrimitiveType
import org.aiotml.xtext.constraints.AiotMLHelpers
import org.aiotml.xtext.aiotML.AiotMLPackage

class Datatypes extends AiotMLValidatorCheck {
	
	@Check(FAST)
	def checkDatatypeUniqueness(PrimitiveType t) {
		val model = AiotMLHelpers.findContainingModel(t)
		val duplicates = AiotMLHelpers.allSimpleTypes(model).filter[ ty | 
			ty instanceof PrimitiveType && ty !== t && ty.name == t.name
		]
		if (duplicates.size > 0) {
			val msg = "Datatype " + t.name + " is duplicated."
			error(msg, model, AiotMLPackage.eINSTANCE.aiotMLModel_Types, model.types.indexOf(t), "duplicate-datatype")
		}
	}
}