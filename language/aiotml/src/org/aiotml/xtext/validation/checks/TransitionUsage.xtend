package org.aiotml.xtext.validation.checks

import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.helpers.AiotMLElementHelper
import org.aiotml.xtext.aiotML.InternalTransition
import org.aiotml.xtext.aiotML.ReceiveMessage
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.AiotMLValidatorCheck
import org.aiotml.xtext.aiotML.Transition
import org.aiotml.xtext.constraints.AiotMLHelpers

class TransitionUsage extends AiotMLValidatorCheck {

	@Check(FAST)
	def checkNonDeterministicTransition(org.aiotml.xtext.aiotML.State s) {
		s.outgoing.forEach [ t1 |
			s.outgoing.forEach [ t2 |
				if (t1 !== t2) {
					if (EcoreUtil.equals(t1.event, t2.event) && (t1.guard === null || t2.guard === null)) {
						var event = AiotMLElementHelper.getName(t1.event)
						if (t1.event instanceof ReceiveMessage) {
							val e = t1.event as ReceiveMessage
							event = e.port.name + "?" + e.message.name
						}
						val msg = "Non deterministic behaviour: Two transitions handling " + event +
							", with at least one without a guard";
						error(msg, s, AiotMLPackage.eINSTANCE.state_Outgoing, s.outgoing.indexOf(t1), "nondeterministic-multiple-handlers")
					}
				}
			]
		]
	}

	@Check(FAST)
	def checkGreedyTransition(org.aiotml.xtext.aiotML.State s) {
		val t = s.outgoing.findFirst[t|t.event === null && t.guard === null]
		if (t !== null && s.outgoing.size > 1) {
			val msg = "Transition -> " + t.target.name +
				" with no guard and no event always takes precedence over all the other transitions";
			warning(msg, s, AiotMLPackage.eINSTANCE.state_Outgoing, s.outgoing.indexOf(t), "greedy-transition")
		}

	}
	
	@Check(FAST)
	def checkEmptyAutotransition(Transition t) {
		val source = AiotMLHelpers.findContainingState(t)
		if (t.event === null && t.guard === null && t.target == source) {
			val msg = "Self Transition without guard and without event. Will loop forever.";			
			error(msg, t.eContainer, AiotMLPackage.eINSTANCE.state_Outgoing, (t.eContainer as org.aiotml.xtext.aiotML.State).internal.indexOf(t), "self-transition-loop")
		}
	}
	
	@Check(FAST)
	def checkEmptyInternal(InternalTransition t) {
		if (t.event === null && t.guard === null) {
			val msg = "Internal Transition without guard and without event. Will loop forever.";
			error(msg, t.eContainer, AiotMLPackage.eINSTANCE.state_Internal, (t.eContainer as org.aiotml.xtext.aiotML.State).internal.indexOf(t), "internal-transition-loop")
		}
	}
	
	@Check(FAST)
	def checkInternalWithoutAction(InternalTransition t) {
		if (t.action === null) {
			val msg = "Internal Transition without action, consider removing.";
			warning(msg, t.eContainer, AiotMLPackage.eINSTANCE.state_Internal, (t.eContainer as org.aiotml.xtext.aiotML.State).internal.indexOf(t), "internal-transition-no-action")
		}
	}
}
