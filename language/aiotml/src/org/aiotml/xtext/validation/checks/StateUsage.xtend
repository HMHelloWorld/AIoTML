package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.helpers.AnnotatedElementHelper
import org.aiotml.xtext.aiotML.CompositeState
import org.aiotml.xtext.aiotML.FinalState
import org.aiotml.xtext.aiotML.Region
import org.aiotml.xtext.aiotML.Session
import org.aiotml.xtext.aiotML.StateContainer
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.AiotMLValidatorCheck

class StateUsage extends AiotMLValidatorCheck {

	@Check(FAST)
	def chectStateUniqueness(org.aiotml.xtext.aiotML.State s) {
		if (s.eContainer instanceof StateContainer) {
			val c = s.eContainer as StateContainer
			val states = c.substate.filter(
				s2 |
					s2.name == s.name
			)
			if (states.size > 1) {
				val msg = "State " + s.getName() + " is duplicated.";
				error(msg, c, AiotMLPackage.eINSTANCE.stateContainer_Substate, c.substate.indexOf(s),
					"duplicate-state")
			}
		}
	}

	@Check(FAST)
	def checkSessionUniqueness(Session s) {
		val c = s.eContainer as CompositeState
		val sessions = c.session.filter(
			s2 |
				s2.name == s.name
		)
		if (sessions.size > 1) {
			val msg = "Session " + s.getName() + " is duplicated.";
			error(msg, c, AiotMLPackage.eINSTANCE.compositeState_Session, c.substate.indexOf(s), "duplicate-session")
		}
	}

	@Check(FAST)
	def chectRegionUniqueness(Region r) {
		val c = r.eContainer as CompositeState
		val regions = c.region.filter(
			r2 |
				r2.name == r.name
		)
		if (regions.size > 1) {
			val msg = "Region " + r.getName() + " is duplicated.";
			error(msg, c, AiotMLPackage.eINSTANCE.compositeState_Region, c.region.indexOf(r), "duplicate-region")
		}
	}

	@Check(FAST)
	def checkUnreachableState(StateContainer sc) {
		sc.substate.forEach [ s, i |
			if(sc.initial === s) return // initial state might otherwise be unreachable
			val isReachable = sc.substate.exists [ st |
				st.outgoing.exists[t|t.target == s]
			]
			if (!isReachable) {
				warning("State " + s.name + " is unreachable", sc, AiotMLPackage.eINSTANCE.stateContainer_Substate, i,
					"state-unreachable", s.name)
			}
		]
	}

	@Check(FAST)
	def checkSinkState(CompositeState c) {
		if (!c.internal.empty) return;
		if (!c.outgoing.empty) return;
		if (AnnotatedElementHelper.isDefined(c, "ignore", "sink")) return;
		c.substate.forEach [ s, i |
			if (s instanceof CompositeState) return;
			if (!s.internal.empty) return;
			if (!s.outgoing.empty) return;
			if (s instanceof FinalState) return;
			if (AnnotatedElementHelper.isDefined(s, "ignore", "sink")) return;
			warning("State " + s.name + " is a sink state. Consider making it final or use @ignore \"sink\"", s, AiotMLPackage.eINSTANCE.namedElement_Name, "state-sink", s.name)
		]
	}
}
