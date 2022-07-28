package org.aiotml.xtext.validation.checks

import org.eclipse.xtext.validation.Check
import org.aiotml.xtext.constraints.AiotMLHelpers
import org.aiotml.xtext.aiotML.Configuration
import org.aiotml.xtext.aiotML.Function
import org.aiotml.xtext.aiotML.Instance
import org.aiotml.xtext.aiotML.Message
import org.aiotml.xtext.aiotML.Port
import org.aiotml.xtext.aiotML.Property
import org.aiotml.xtext.aiotML.AiotMLPackage
import org.aiotml.xtext.validation.AiotMLValidatorCheck

class ThingsUsage extends AiotMLValidatorCheck {

	@Check(FAST)
	def checkInstance(Instance i) {
		if (i.type.fragment) {
			val msg = "Instance " + i.getName() + " instantiate thing fragment " + i.getType().getName() +
				". Make thing " + i.getType().getName() + " concrete (not a fragment) if you want to instantiate it.";
			error(msg, i.eContainer, i.eContainingFeature, (i.eContainer as Configuration).instances.indexOf(i), "fragment-instanciation", i.name)
		}
	}
	
	@Check(FAST)
	def checkInstanceUniqueness(Instance i) {
		val cfg = i.eContainer as Configuration
		val instances = cfg.instances.filter(i2 |
			i2.name == i.name
		)
		if (instances.size > 1) {
			val msg = "Instance " + i.getName() + " is duplicated.";
			error(msg, cfg, AiotMLPackage.eINSTANCE.configuration_Instances, cfg.instances.indexOf(i), "duplicate-instance")
		}
	}	

	@Check(FAST)
	def checkPropertyUniqueness(Property p) {
		val thing = AiotMLHelpers.findContainingThing(p)
		val props = AiotMLHelpers.allProperties(thing).filter [ pr |
			pr.name == p.name
		]
		if (props.size > 1) {
			val msg = "Property " + p.getName() + " of Thing " + thing.getName() +
				" is duplicated (possibly from an included thing).";
			error(msg, thing, AiotMLPackage.eINSTANCE.thing_Properties, thing.properties.indexOf(p), "duplicate-property")
		}
	}

	@Check(FAST)
	def checkMessageUniqueness(Message m) {
		val thing = AiotMLHelpers.findContainingThing(m)
		val msgs = AiotMLHelpers.allMessages(thing).filter [ m2 |
			m2.name == m.name
		]
		if (msgs.size > 1) {
			val msg = "Message " + m.getName() + " of Thing " + thing.getName() +
				" is duplicated (possibly from an included thing).";
			error(msg, thing, AiotMLPackage.eINSTANCE.thing_Messages, thing.messages.indexOf(m), "duplicate-message")
		}
	}

	@Check(FAST)
	def checkPortUniqueness(Port p) {
		val thing = AiotMLHelpers.findContainingThing(p)
		val ports = AiotMLHelpers.allPorts(thing).filter [ p2 |
			p2.name == p.name
		]
		if (ports.size > 1) {
			val msg = "Port " + p.getName() + " of Thing " + thing.getName() +
				" is duplicated (possibly from an included thing).";
			error(msg, thing, AiotMLPackage.eINSTANCE.thing_Ports, thing.ports.indexOf(p), "duplicate-port")
		}
	}

	@Check(FAST)
	def checkFunctionUniqueness(Function f) {
		val thing = AiotMLHelpers.findContainingThing(f)
		val funcs = AiotMLHelpers.allFunctions(thing).filter [ f2 |
			f2.abstract == f.abstract && f2.name == f.name
		]
		if (funcs.size > 1) {
			val msg = "Function " + f.getName() + " of Thing " + thing.getName() +
				" is duplicated (possibly from an included thing).";
			error(msg, thing, AiotMLPackage.eINSTANCE.thing_Functions, thing.functions.indexOf(f), "duplicate-function")
		}
	}	
}
