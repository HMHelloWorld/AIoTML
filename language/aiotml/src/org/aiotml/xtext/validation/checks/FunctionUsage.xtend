package org.aiotml.xtext.validation.checks

import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.constraints.AiotMLHelpers
import org.aiotml.xtext.constraints.Types
import org.aiotml.xtext.helpers.ActionHelper
import org.aiotml.xtext.helpers.AnnotatedElementHelper
import org.aiotml.xtext.helpers.FunctionWithMultipleImplem
import org.aiotml.xtext.helpers.ThingHelper
import org.aiotml.xtext.helpers.TyperHelper
import org.aiotml.xtext.helpers.UnimplementedFunction
import org.aiotml.xtext.aiotML.Action
import org.aiotml.xtext.aiotML.ActionBlock
import org.aiotml.xtext.aiotML.ConditionalAction
import org.aiotml.xtext.aiotML.Expression
import org.aiotml.xtext.aiotML.ExternStatement
import org.aiotml.xtext.aiotML.Function
import org.aiotml.xtext.aiotML.FunctionCallExpression
import org.aiotml.xtext.aiotML.FunctionCallStatement
import org.aiotml.xtext.aiotML.LoopAction
import org.aiotml.xtext.aiotML.PropertyReference
import org.aiotml.xtext.aiotML.ReturnAction
import org.aiotml.xtext.aiotML.Thing
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.aiotML.VariableAssignment
import org.aiotml.xtext.validation.AiotMLValidatorCheck
import org.aiotml.xtext.validation.TypeChecker

class FunctionUsage extends AiotMLValidatorCheck {
	
	@Check(FAST)
	def checkThread(Function f) {
		if (AnnotatedElementHelper.isDefined(f, "fork_thread", "true") || AnnotatedElementHelper.hasFlag(f, "fork_thread")) {
			if (f.typeRef !== null && f.typeRef.type !== null) {
				val msg = "Function " + f.name + " forks a thread. It cannot return a result."
				warning(msg, f, AiotMLPackage.eINSTANCE.namedElement_Name, "function-thread-cannot-return", f.name);
			}
		}
	}
	
	@Check(NORMAL)
	def checkUsage(Function f) {
		val thing = AiotMLHelpers.findContainingThing(f)
		//Checks if the containing thing calls the function
		if (ActionHelper.getAllActions(thing, FunctionCallStatement).exists[call | call.function == f || call.function.name == f.name])
			return;
		if (AiotMLHelpers.getAllExpressions(thing, FunctionCallExpression).exists[call | call.function == f || call.function.name == f.name])
			return;			
		
		//if not, check if any thing that includes the function actually calls it
		val isUsedByIncludingThings = ThingHelper.allIncludedThings(thing)
		.exists[included |
			ActionHelper.getAllActions(included, FunctionCallStatement).exists[call | call.function.name == f.name] //we check on names, as included function may call abstract function. Should be fine as long as we do not support overloading...
			|| AiotMLHelpers.getAllExpressions(included, FunctionCallExpression).exists[call | call.function.name == f.name]
		]
		
		if (!isUsedByIncludingThings) {
			val msg = "Function " + f.name + " is never called."
			warning(msg, f, AiotMLPackage.eINSTANCE.namedElement_Name, "function-never-called", f.name);
		}
		
	}

	@Check(FAST)
	def checkConcrete(Thing t) {
		if (t.fragment) return;
		AiotMLHelpers.allFunctions(t).filter[f | f.abstract].forEach[f |
			try {
				ThingHelper.getConcreteFunction(t, f)				
			} catch (UnimplementedFunction e) {
				val origin = AiotMLHelpers.findContainingThing(f)
				if (origin == t)
					error(e.message, f, AiotMLPackage.eINSTANCE.namedElement_Name, "function-not-implemented", f.name)
				else
					error(e.message, t, AiotMLPackage.eINSTANCE.thing_Includes, t.includes.indexOf(origin), "function-not-implemented", f.name)
			} catch (FunctionWithMultipleImplem e) {
				val origin = AiotMLHelpers.findContainingThing(f)
				if (origin == t)
					error(e.message, t, AiotMLPackage.eINSTANCE.namedElement_Name, "function-many-impl", f.name)
				else
					error(e.message, t, AiotMLPackage.eINSTANCE.thing_Includes, t.includes.indexOf(origin), "function-many-impl", f.name)
			}
		]
	}
	
	@Check(FAST)
	def checkAbstract(Function f) {
		var thing = f.eContainer as Thing
		if (!thing.fragment && f.abstract) {
			error("Thing "+thing.name+" is not a fragment, so it cannot contain abstract functions", thing, f.eContainingFeature, thing.functions.indexOf(f), "abstract-function-fragment", f.name)
		}
	}

	@Check(NORMAL)
	def checkParameters(Function f) {
		if (!f.abstract) { // if function is concrete then we check its implementation
			val refs = AiotMLHelpers.getAllExpressions(f, PropertyReference)
			val assigns = ActionHelper.getAllActions(f, VariableAssignment)
			f.parameters.forEach [ p, i |
				// Checks that all params are used			
				val isUsed = refs.exists [ pr | pr.property === p ]
				if (!isUsed) {
					warning("Parameter "+p.name+" is never used", f, AiotMLPackage.eINSTANCE.function_Parameters, i, "parameter-not-used")
				}
				// Checks that no param is re-assigned		
				assigns.forEach [ va |
					if (va.property === p) {
						//FIXME: This probably highlights too much?
						warning("Re-assigning parameter "+p.name+" can have side effects", va.eContainer, va.eContainingFeature, "parameter-reassign")
					}
				]
			]
		}
	}
	
	private def boolean returns(Action a) {
		if (a instanceof ReturnAction)
			return true
		if (a instanceof ActionBlock) {
			val block = a as ActionBlock
			return block.actions.reverseView.exists[aa | returns(aa)]
		}
		if (a instanceof ConditionalAction) {
			val ca = a as ConditionalAction
			return returns(ca.action) && ca.elseAction !== null && returns(ca.elseAction)
		}		
		if (a instanceof LoopAction) {
			val la = a as LoopAction
			return returns(la.action)
		}
		return false
	}
	
	@Check(FAST)
	def checkReturnOnlyInFunction(ReturnAction r) {
		var parent = r.eContainer as EObject
		while (parent !== null && !(parent instanceof Function)) {
			parent = parent.eContainer as EObject
		}
		if (parent === null || ((parent as Function).typeRef === null && r.exp !== null )) {
			val c = r.eContainer.eGet(r.eContainingFeature)
			val msg = "Return action is only allowed in functions with a return type."
			if (c instanceof EList)
				error(msg, r.eContainer, r.eContainingFeature, (c as EList).indexOf(r), "return-not-allowed")
			else
				error(msg, r.eContainer, r.eContainingFeature, "return-not-allowed")			
		}
	}
	
	private def indexOfLastExtern(ActionBlock block) {
		var last = block.actions.findLast[a | a instanceof ExternStatement]
		if (last !== null) {
			return block.actions.indexOf(last)
		}
		return -1
	}
	
	@Check(FAST)
	def checkBlock(ActionBlock block) {
		val f = if(block.eContainer instanceof Function) block.eContainer as Function else null
		if (f === null || f.typeRef === null || f.typeRef.type === null) return;//This check only makes sense for functions that return something		
		val indexOfLastExtern = indexOfLastExtern(block)
		var indexOfFirstReturn = -1
		if (indexOfLastExtern < 0) {
			val firstReturn = block.actions.findFirst[a | returns(a)]
			indexOfFirstReturn = block.actions.indexOf(firstReturn)			
		} else {
			return;
			/*val firstReturnAfter = block.actions.findFirst[a | block.actions.indexOf(a)>indexOfLastExtern && returns(a)]
			indexOfFirstReturn = block.actions.indexOf(firstReturnAfter)*/
		}
		if (indexOfFirstReturn >= 0 && indexOfFirstReturn < block.actions.size - 1) {
			val msg = "The code from here and below is unreachable (the code above will return in any case)"
			error(msg, block, AiotMLPackage.eINSTANCE.actionBlock_Actions, indexOfFirstReturn + 1, "unreachable-code", indexOfFirstReturn.toString)					
		}						
	}

	@Check(FAST)
	def checkReturnType2(Function f) {
		if (!f.abstract && f.typeRef !== null && f.typeRef.type !== null) {
			if (f.body instanceof ReturnAction || (f.body instanceof ConditionalAction && returns(f.body)))
				return;
			if (!returns(f.body)) {
				val actualType = TyperHelper.getBroadType(f.getTypeRef().getType());
				val msg = "Function " + f.name + " must return " + actualType.name + ". Found no return action."				
				error(msg, f, AiotMLPackage.eINSTANCE.namedElement_Name, "missing-return", f.name)
				return;
			}
		}
	}

	@Check(FAST)
	def checkReturnType(Function f) {
		if (!f.abstract) { // if function is concrete then we check its implementation
			// Checks return type
			if (f.typeRef !== null && f.typeRef.type !== null) { // non-void function
				ActionHelper.getAllActions(f, ReturnAction).forEach [ ra |
					val actualType = TyperHelper.getBroadType(f.getTypeRef().getType());
					val returnType = TypeChecker.computeTypeOf(ra.getExp());
					val parent = ra.eContainer.eGet(ra.eContainingFeature)
					if (returnType.equals(Types.ERROR_TYPE)) {
						val msg = "Function "+f.name+" should return "+actualType.name+". Found "+returnType.name+"."
						if (parent instanceof EList)
							error(msg, ra.eContainer, ra.eContainingFeature, (parent as EList).indexOf(ra), "type")
						else
							error(msg, ra.eContainer, ra.eContainingFeature ,"type")
					} else if (returnType.equals(Types.ANY_TYPE)) {
						val msg = "Function "+f.name+" should return "+actualType.name+". Found a value/expression that cannot be typed. Consider using a cast (<exp> as <type>)."
						if (parent instanceof EList)
							warning(msg, ra.eContainer, ra.eContainingFeature, (parent as EList).indexOf(ra), "type-cast", f.getTypeRef().getType().name)
						else
							warning(msg, ra.eContainer, ra.eContainingFeature, "type-cast", f.getTypeRef().getType().name)
					} else if (!TyperHelper.isA(returnType, actualType)) {
						val msg = "Function "+f.name+" should return "+actualType.name+". Found "+returnType.name+"."
						if (parent instanceof EList)
							error(msg, ra.eContainer, ra.eContainingFeature, (parent as EList).indexOf(ra), "type")
						else
							error(msg, ra.eContainer, ra.eContainingFeature, "type")
					}
				]
			}
		} 
	}

	@Check(FAST)
	def checkFunctionCallAction(FunctionCallStatement call) {
		val t = AiotMLHelpers.findContainingThing(call);
		val ignore = AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(call.function, "ignore", "type-warning"); 		
		checkFunctionCall(call.function, call.parameters, call, ignore)
	}
	
	@Check(FAST)
	def checkFunctionCallExpression(FunctionCallExpression call) {
		val t = AiotMLHelpers.findContainingThing(call);
		val ignore = AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(call.function, "ignore", "type-warning");
		checkFunctionCall(call.function, call.parameters, call, ignore)
	}	

	def checkFunctionCall(Function function, List<Expression> params, EObject o, boolean ignore) {
		val parent = o.eContainer.eGet(o.eContainingFeature)
		// Check that the function is called with the right number of parameters
		if (function.parameters.size !== params.size) {
			val msg = "Function "+function.name+" is called with a wrong number of arguments. Expected "+function.parameters.size+", called with "+params.size
			if (parent instanceof EList)
				error(msg, o.eContainer, o.eContainingFeature, (parent as EList).indexOf(o) ,"function-call-wrong-parameter-length")
			else
				error(msg, o.eContainer, o.eContainingFeature ,"function-call-wrong-parameter-length")
			return;
		}		
		// Check that the parameters are properly typed
		function.parameters.forEach [ p, i |
			val e = params.get(i);
			val expected = TyperHelper.getBroadType(p.getTypeRef().getType());
			val actual = TypeChecker.computeTypeOf(e);
			if (actual !== null) {
				if (actual.equals(Types.ERROR_TYPE)) {
					val msg = "Function "+function.name+" is called with an erroneous parameter. Expected "+expected.name+", called with "+TyperHelper.getBroadType(actual).name;
					if (parent instanceof EList)
						error(msg, o.eContainer, o.eContainingFeature, (parent as EList).indexOf(o) ,"function-call-wrong-parameter-type")
					else
						error(msg, o.eContainer, o.eContainingFeature ,"function-call-wrong-parameter-type")
				} else if (!ignore && actual.equals(Types.ANY_TYPE)) {
					val msg = "Function "+function.name+" is called with a parameter which cannot be typed. Consider using a cast (<exp> as <type>), or using @ignore \"type-warning\"."
					if (parent instanceof EList)
						warning(msg, o.eContainer, o.eContainingFeature, (parent as EList).indexOf(o) ,"function-call-wrong-parameter-type")
					else
						warning(msg, o.eContainer, o.eContainingFeature ,"function-call-wrong-parameter-type")
				} else if (!TyperHelper.isA(actual, expected)) {
					val msg = "Function "+function.name+" is called with an erroneous parameter. Expected "+expected.name+", called with "+TyperHelper.getBroadType(actual).name;
					if (parent instanceof EList)
						error(msg, o.eContainer, o.eContainingFeature, (parent as EList).indexOf(o) ,"function-call-wrong-parameter-type")
					else
						error(msg, o.eContainer, o.eContainingFeature ,"function-call-wrong-parameter-type")
				}
			}
		]
	}
}
