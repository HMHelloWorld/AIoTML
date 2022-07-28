package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.constraints.AiotMLHelpers
import org.aiotml.xtext.constraints.Types
import org.aiotml.xtext.helpers.TyperHelper
import org.aiotml.xtext.aiotML.Action
import org.aiotml.xtext.aiotML.ConditionalAction
import org.aiotml.xtext.aiotML.Expression
import org.aiotml.xtext.aiotML.ExternExpression
import org.aiotml.xtext.aiotML.LoopAction
import org.aiotml.xtext.validation.AiotMLValidatorCheck
import org.aiotml.xtext.validation.TypeChecker
import org.aiotml.xtext.helpers.AnnotatedElementHelper

class ControlStructures extends AiotMLValidatorCheck {
	
	def checkActionExpression(Action a, Expression e) {
		val actual = TypeChecker.computeTypeOf(e)
		if (actual.equals(Types.BOOLEAN_TYPE)) return;
		val t = AiotMLHelpers.findContainingThing(a);
		if (!AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") && actual.equals(Types.ANY_TYPE)) {
			if (AiotMLHelpers.getAllExpressions(e, typeof(ExternExpression)).size > 0)
				warning("Condition involving extern expressions cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature, "type")
			else
				warning("Condition cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature, "type-cast", "Boolean")
		} else {
			error("Condition is not a Boolean ("+TyperHelper.getBroadType(actual).name+")", a, e.eContainingFeature, "type")
		}
	}
	
	@Check(FAST)
	def checkConditionalAction(ConditionalAction ca) {
		checkActionExpression(ca, ca.condition)
	}
	
	@Check(FAST)
	def checkLoopAction(LoopAction la) {
		checkActionExpression(la, la.condition)
	}
}