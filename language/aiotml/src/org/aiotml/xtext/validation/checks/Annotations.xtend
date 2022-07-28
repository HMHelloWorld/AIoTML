package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.annotations.AnnotationRegistry
import org.aiotml.xtext.aiotML.AnnotatedElement
import org.aiotml.xtext.aiotML.PlatformAnnotation
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.AiotMLValidatorCheck

class Annotations extends AiotMLValidatorCheck {
	
	@Check(FAST)
	def checkAnnotation(PlatformAnnotation a) {
		val source = a.eContainer as AnnotatedElement
		if (!AnnotationRegistry.annotations.containsKey(a.name)) {
			val msg = "Annotation @" + a.name + " is not registered. Non-registered annotations will be deprecated in a future version."
			warning(msg, source, AiotMLPackage.eINSTANCE.annotatedElement_Annotations, source.annotations.indexOf(a), "unknown-annotation")
			return
		}
		
		val reg_a = AnnotationRegistry.annotations.get(a.name)
		if (!reg_a.check(source, a.value)) {
			val msg = "Annotation @" + a.name + " is invalid. " + reg_a
			warning(msg, source, AiotMLPackage.eINSTANCE.annotatedElement_Annotations, source.annotations.indexOf(a), "invalid-annotation")
			return
		}		
	}
}