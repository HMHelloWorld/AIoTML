/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.aiotml.monitor;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.xtext.helpers.ActionHelper;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.Decrement;
import org.aiotml.xtext.aiotML.Increment;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.VariableAssignment;

public class PropertyMonitoring implements MonitoringAspect {
	
	final Thing thing;
	final Property id;
	final Port monitoringPort;
	final Message msg;
	final TypeRef stringTypeRef;
	
	private static int counter = 0;
	
	final StringLiteral empty;

	public PropertyMonitoring(Thing thing, Property id, Port monitoringPort, Message msg, TypeRef stringTypeRef) {
		this.thing = thing;
		this.id = id;
		this.monitoringPort = monitoringPort;
		this.msg = msg;
		this.stringTypeRef = stringTypeRef;
		
		empty = AiotMLFactory.eINSTANCE.createStringLiteral();
		empty.setStringValue("");
	}
	
	@Override
	public void monitor() {
		for(Property p : ThingHelper.allPropertiesInDepth(thing)) {
			if (AnnotatedElementHelper.isDefined(p, "monitoring", "not")) continue;
			if (p.getTypeRef().getCardinality() != null) continue;//FIXME: handle arrays
			
			for(Increment assign : ActionHelper.getAllActions(thing, Increment.class)) {
				if (!(assign.getVar() == p)) continue;
				catchChanges(assign, p);
			}
			
			for(Decrement assign : ActionHelper.getAllActions(thing, Decrement.class)) {
				if (!(assign.getVar() == p)) continue;
				catchChanges(assign, p);
			}
			
			for(VariableAssignment assign : ActionHelper.getAllActions(thing, VariableAssignment.class)) {
				if (!(assign.getProperty() == p)) continue;
				catchChanges(assign, p);
			}

		}
    }

	private void catchChanges(Action assign, Property p) {				
		final ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
    	if (assign.eContainingFeature().getUpperBound() == -1) {//Collection
            final EList list = (EList) assign.eContainer().eGet(assign.eContainingFeature());
            final int index = list.indexOf(assign);
            list.add(index, block);
            list.remove(assign);
        } else {
        	assign.eContainer().eSet(assign.eContainingFeature(), block);
        }
		
		//before
		final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
		lv.setName("old_" + p.getName() + "_" + counter);
		lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
		lv.setReadonly(true);
		final PropertyReference ref = AiotMLFactory.eINSTANCE.createPropertyReference();
		ref.setProperty(p);
		final CastExpression asString = AiotMLFactory.eINSTANCE.createCastExpression();
		asString.setTerm(ref);
		asString.setType(stringTypeRef.getType());
		final PlusExpression plus = AiotMLFactory.eINSTANCE.createPlusExpression();
		plus.setLhs(EcoreUtil.copy(empty));
		plus.setRhs(asString);
		lv.setInit(plus);
		block.getActions().add(lv);
		
		block.getActions().add(assign);
		
		//after
		final LocalVariable lv2 = AiotMLFactory.eINSTANCE.createLocalVariable();
		lv2.setName("new_" + p.getName() + "_" + counter);
		lv2.setTypeRef(EcoreUtil.copy(stringTypeRef));
		lv2.setReadonly(true);
		final PropertyReference ref2 = AiotMLFactory.eINSTANCE.createPropertyReference();
		ref2.setProperty(p);
		final CastExpression asString2 = AiotMLFactory.eINSTANCE.createCastExpression();
		asString2.setTerm(ref2);
		asString2.setType(stringTypeRef.getType());
		final PlusExpression plus2 = AiotMLFactory.eINSTANCE.createPlusExpression();
		plus2.setLhs(EcoreUtil.copy(empty));
		plus2.setRhs(asString2);
		lv2.setInit(plus2);
		block.getActions().add(lv2);
		
		final SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
		send.setMessage(msg);
		send.setPort(monitoringPort);
		final PropertyReference id_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
		id_ref.setProperty(id);
		send.getParameters().add(id_ref);
		final StringLiteral name_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
		name_exp.setStringValue(p.getName());        	
		send.getParameters().add(name_exp);
		final StringLiteral type_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
		type_exp.setStringValue(p.getTypeRef().getType().getName());        	
		send.getParameters().add(type_exp);
		final PropertyReference lv_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
		lv_ref.setProperty(lv);
		send.getParameters().add(lv_ref);
		final PropertyReference lv2_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
		lv2_ref.setProperty(lv2);
		send.getParameters().add(lv2_ref);
		block.getActions().add(send);
		
		counter++;
	}
}
