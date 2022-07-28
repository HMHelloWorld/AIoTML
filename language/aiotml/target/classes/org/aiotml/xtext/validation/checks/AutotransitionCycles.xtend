package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.aiotML.StateContainer
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.Tarjan
import org.aiotml.xtext.validation.AiotMLValidatorCheck

class AutotransitionCycles extends AiotMLValidatorCheck {
	
	@Check(FAST)
	def checkAutotransitionCycles(StateContainer c) {
		val verts = newHashSet()
		verts.addAll(c.substate)
		val tarjan = new Tarjan(null, verts)
		val cycles = tarjan.findStronglyConnectedComponents();
		
		cycles.forEach[ cycle |
			if (cycle !== null && cycle.size > 1) {
				val msg = cycle.join("Auto transition cycle: (",", ",")",[name])
				cycle.forEach[ state |
					error(msg, c, AiotMLPackage.eINSTANCE.stateContainer_Substate, c.substate.indexOf(state), "autotransition-cycle")
				]
			}
		]
	}
}