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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.ActionHelper;
import org.aiotml.xtext.helpers.StateHelper;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.AndExpression;
import org.aiotml.xtext.aiotML.BooleanLiteral;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExpressionGroup;
import org.aiotml.xtext.aiotML.Handler;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.NotExpression;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.Transition;
import org.aiotml.xtext.aiotML.TypeRef;

public class EventMonitoring implements MonitoringAspect {

	final StringLiteral empty;
	final StringLiteral comma;
	
	final Thing thing;
	final Property id;
	final Port monitoringPort;
	final Message sent_msg;
	final Message lost_msg;
	final Message handled_msg;
	final TypeRef stringTypeRef;
	
	private static int counter = 0;

	public EventMonitoring(Thing thing, Property id, Port monitoringPort, Message lost_msg, Message handled_msg, Message sent_msg, TypeRef stringTypeRef) {
		this.thing = thing;
		this.id = id;
		this.monitoringPort = monitoringPort;
		this.lost_msg = lost_msg;
		this.handled_msg = handled_msg;
		this.sent_msg = sent_msg;
		this.stringTypeRef = stringTypeRef;
		
		empty = AiotMLFactory.eINSTANCE.createStringLiteral();
		empty.setStringValue("");
		
		comma = AiotMLFactory.eINSTANCE.createStringLiteral();
		comma.setStringValue(",");
	}
	
	@Override
	public void monitor() {
		logSentMessages(thing);
		logHandledMessages(thing.getBehaviour());
		catchLostMessages(thing.getBehaviour());
	}
	
	private String qName(State s) {
		String qName = s.getName();
		EObject parent = s.eContainer();
		while (parent != null && (parent instanceof State || parent instanceof StateContainer))	{
			if (parent instanceof State) {
				qName = ((State)parent).getName() + "." + qName;
			} else {//StateContainer (Region or Session, CompositeState behind handled as State above)
				qName = ((StateContainer)parent).getName() + ":" + qName;
			}
			parent = parent.eContainer();
		}
		return qName;
	}
	
	private void logSentMessages(Thing root) {
		for(SendAction s : ActionHelper.getAllActions(root, SendAction.class)) {
			
			final ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
	    	if (s.eContainingFeature().getUpperBound() == -1) {//Collection
	            final EList list = (EList) s.eContainer().eGet(s.eContainingFeature());
	            final int index = list.indexOf(s);
	            list.add(index, block);
	            list.remove(s);
	        } else {
	        	s.eContainer().eSet(s.eContainingFeature(), block);
	        }

			//create a readonly local variable for each parameter of s (to avoid side-effects e.g. if a param is a function call)
			List<LocalVariable> lvs = new ArrayList<>();
			for(Expression p : s.getParameters()) {
				final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
				lv.setReadonly(true);
				lv.setTypeRef(EcoreUtil.copy(s.getMessage().getParameters().get(s.getParameters().indexOf(p)).getTypeRef()));
				lv.setName(s.getMessage().getParameters().get(s.getParameters().indexOf(p)).getName() + "_" + counter);
				counter++;
				lv.setInit(EcoreUtil.copy(p));
				lvs.add(lv);
				block.getActions().add(lv);
			}						
			
			//update s to use those local variables instead
			final SendAction updatedSend = AiotMLFactory.eINSTANCE.createSendAction();
			updatedSend.setPort(s.getPort());
			updatedSend.setMessage(s.getMessage());
			for(LocalVariable lv : lvs) {
				final PropertyReference pr = AiotMLFactory.eINSTANCE.createPropertyReference();
				pr.setProperty(lv);
				updatedSend.getParameters().add(pr);
			}
			block.getActions().add(updatedSend);
			
			//send log message, also using those local variables
			final SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
			send.setPort(monitoringPort);
			send.setMessage(sent_msg);
								
			final PropertyReference id_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
			id_ref.setProperty(id);
			send.getParameters().add(id_ref);
			final StringLiteral port_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
			port_exp.setStringValue(s.getPort().getName());        	
			send.getParameters().add(port_exp);
			final StringLiteral m_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
			m_exp.setStringValue(s.getMessage().getName());        	
			send.getParameters().add(m_exp);
			
			if (s.getMessage().getParameters().size() > 0) {
				final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
				lv.setName("params_" + counter);
				counter++;
				lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
				lv.setReadonly(true);
				Expression init = EcoreUtil.copy(empty);							
				for(LocalVariable param : lvs) {
					final PlusExpression concat = AiotMLFactory.eINSTANCE.createPlusExpression();	
					final ExpressionGroup group_name = AiotMLFactory.eINSTANCE.createExpressionGroup();
					final ExpressionGroup group = AiotMLFactory.eINSTANCE.createExpressionGroup();
					final PlusExpression plus_comma = AiotMLFactory.eINSTANCE.createPlusExpression();
					final PlusExpression plus_name = AiotMLFactory.eINSTANCE.createPlusExpression();
					final StringLiteral name = AiotMLFactory.eINSTANCE.createStringLiteral();
					name.setStringValue(s.getMessage().getParameters().get(lvs.indexOf(param)).getName() + "=");
					final CastExpression asString = AiotMLFactory.eINSTANCE.createCastExpression();
					final PropertyReference r_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
					r_ref.setProperty(param);
					asString.setTerm(r_ref);
					asString.setType(stringTypeRef.getType());
					plus_comma.setLhs(asString);
					plus_comma.setRhs(EcoreUtil.copy(comma));
					group.setTerm(plus_comma);
					plus_name.setLhs(name);
					plus_name.setRhs(group);
					group_name.setTerm(plus_name);
					concat.setLhs(init);
					concat.setRhs(group_name);
					init = concat;
				}
				lv.setInit(init);
				block.getActions().add(lv);
			
				final PropertyReference lv_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
				lv_ref.setProperty(lv);
				send.getParameters().add(lv_ref);  
			} else {
				send.getParameters().add(EcoreUtil.copy(empty));
			}
    		
    		
    		block.getActions().add(send);			
		}
	}
	
	private void logHandledMessages(CompositeState root) {
		final Map<Port, Map<Message, List<Handler>>> handlers = StateHelper.allMessageHandlers(root);
		for(Map<Message, List<Handler>> e : handlers.values()) {
			for(List<Handler> l : e.values()) {
				for(Handler h : l) {
					final ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
					final SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
					
					send.setPort(monitoringPort);
					send.setMessage(handled_msg);
										
					final PropertyReference id_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
					id_ref.setProperty(id);
					send.getParameters().add(id_ref);
					final StringLiteral source_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					source_exp.setStringValue(qName(((State)h.eContainer())));        	
					send.getParameters().add(source_exp);
					final StringLiteral target_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					if (h instanceof InternalTransition) {
						target_exp.setStringValue("_");
					} else {
						target_exp.setStringValue(qName(((Transition)h).getTarget()));
					}										        	
					send.getParameters().add(target_exp);
					final StringLiteral port_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					final StringLiteral msg_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					Expression params_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					if (h.getEvent() == null) {
						port_exp.setStringValue("_");
						msg_exp.setStringValue("_");
						((StringLiteral)params_exp).setStringValue("_");
					} else {
						final ReceiveMessage rm = (ReceiveMessage)h.getEvent();
						port_exp.setStringValue(rm.getPort().getName());
						msg_exp.setStringValue(rm.getMessage().getName());
						if (rm.getMessage().getParameters().isEmpty()) {
							((StringLiteral)params_exp).setStringValue("_");	
						} else {		
							final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
							lv.setName("params");
							lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
							lv.setReadonly(true);
							Expression init = EcoreUtil.copy(empty);							
							for(Parameter param : rm.getMessage().getParameters()) {
								final PlusExpression concat = AiotMLFactory.eINSTANCE.createPlusExpression();	
								final ExpressionGroup group_name = AiotMLFactory.eINSTANCE.createExpressionGroup();
								final ExpressionGroup group = AiotMLFactory.eINSTANCE.createExpressionGroup();
								final PlusExpression plus_comma = AiotMLFactory.eINSTANCE.createPlusExpression();
								final PlusExpression plus_name = AiotMLFactory.eINSTANCE.createPlusExpression();
								final StringLiteral name = AiotMLFactory.eINSTANCE.createStringLiteral();
								name.setStringValue(param.getName() + "=");
								final EventReference r_ref = AiotMLFactory.eINSTANCE.createEventReference();
								r_ref.setParameter(param);
								r_ref.setReceiveMsg(rm);
								final CastExpression asString = AiotMLFactory.eINSTANCE.createCastExpression();
								asString.setTerm(r_ref);
								asString.setType(stringTypeRef.getType());
								plus_comma.setLhs(asString);
								plus_comma.setRhs(EcoreUtil.copy(comma));
								group.setTerm(plus_comma);
								plus_name.setLhs(name);
								plus_name.setRhs(group);
								group_name.setTerm(plus_name);
								concat.setLhs(init);
								concat.setRhs(group_name);
								init = concat;
							}
							lv.setInit(init);
							block.getActions().add(lv);						
							params_exp = AiotMLFactory.eINSTANCE.createPropertyReference();
			    			((PropertyReference)params_exp).setProperty(lv);			    		
						}
					}
					send.getParameters().add(port_exp);
					send.getParameters().add(msg_exp);
					send.getParameters().add(params_exp);											
					
					block.getActions().add(send);
					if (h.getAction() != null) {
						block.getActions().add(h.getAction());
					}
					h.setAction(block);
				}
			}
		}
	}
	
	/**
	 * Adds handler in the top state machine for all events.
	 * This will catch all events that are not handled at a lower level
	 */
	private void catchLostMessages(CompositeState root) {
		for(Port p : thing.getPorts()) {
			for(Message m : p.getReceives()) {
				Expression guard = AiotMLFactory.eINSTANCE.createBooleanLiteral();
				((BooleanLiteral) guard).setBoolValue(true);
				for(Handler h : root.getInternal()) {
					if (h.getEvent() instanceof ReceiveMessage) {
						final ReceiveMessage rm = (ReceiveMessage) h.getEvent();
						if (!(rm.getPort() == p) || !(rm.getMessage() == m)) continue;
						if (h.getGuard() == null) { //if there exists a non-guard event for p,m, the event will always be handled (or never lost)
							guard = null;
							break;
						} else {//if there is a guarded event for p,m, it is lost iff guard is false (note: there might be several handlers for the same p,m, hence the guard = guard && !h.guard)
							final ExpressionGroup group = AiotMLFactory.eINSTANCE.createExpressionGroup();
							final AndExpression and = AiotMLFactory.eINSTANCE.createAndExpression();
							and.setLhs(guard);
							final NotExpression not = AiotMLFactory.eINSTANCE.createNotExpression();
							final ExpressionGroup not_group = AiotMLFactory.eINSTANCE.createExpressionGroup();
							not_group.setTerm(EcoreUtil.copy(h.getGuard()));
							not.setTerm(not_group);
							and.setRhs(not);
							group.setTerm(and);
							guard = group;
						}
					}
				}
				
				if (guard != null) {
					final InternalTransition it = AiotMLFactory.eINSTANCE.createInternalTransition();
					final ReceiveMessage rm = AiotMLFactory.eINSTANCE.createReceiveMessage();
					rm.setName("e");
					rm.setPort(p);
					rm.setMessage(m);
					it.setEvent(rm);
					it.setGuard(guard);
					
					//Update the event references in the guard
					for(EventReference ref : AiotMLHelpers.getAllExpressions(guard, EventReference.class)) {
						final Parameter currentParam = ref.getParameter();
						Parameter newParam = null;
						for(Parameter param : m.getParameters()) {
							if (param.getName().equals(currentParam.getName())) {
								newParam = param;
								break;
							}
						}
						ref.setReceiveMsg(rm);
						ref.setParameter(newParam);
					}
					
					final SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
					send.setPort(monitoringPort);
					send.setMessage(lost_msg);
										
					final PropertyReference id_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
					id_ref.setProperty(id);
					send.getParameters().add(id_ref);
					final StringLiteral port_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					port_exp.setStringValue(p.getName());        	
					send.getParameters().add(port_exp);
					final StringLiteral m_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
					m_exp.setStringValue(m.getName());        	
					send.getParameters().add(m_exp);
					
					final ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
					if (m.getParameters().size() > 0) {
						final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
						lv.setName("params");
						lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
						lv.setReadonly(true);
						Expression init = EcoreUtil.copy(empty);							
						for(Parameter param : rm.getMessage().getParameters()) {
							final PlusExpression concat = AiotMLFactory.eINSTANCE.createPlusExpression();	
							final ExpressionGroup group_name = AiotMLFactory.eINSTANCE.createExpressionGroup();
							final ExpressionGroup group = AiotMLFactory.eINSTANCE.createExpressionGroup();
							final PlusExpression plus_comma = AiotMLFactory.eINSTANCE.createPlusExpression();
							final PlusExpression plus_name = AiotMLFactory.eINSTANCE.createPlusExpression();
							final StringLiteral name = AiotMLFactory.eINSTANCE.createStringLiteral();
							name.setStringValue(param.getName() + "=");
							final EventReference r_ref = AiotMLFactory.eINSTANCE.createEventReference();
							r_ref.setParameter(param);
							r_ref.setReceiveMsg(rm);
							final CastExpression asString = AiotMLFactory.eINSTANCE.createCastExpression();
							asString.setTerm(r_ref);
							asString.setType(stringTypeRef.getType());
							plus_comma.setLhs(asString);
							plus_comma.setRhs(EcoreUtil.copy(comma));
							group.setTerm(plus_comma);
							plus_name.setLhs(name);
							plus_name.setRhs(group);
							group_name.setTerm(plus_name);
							concat.setLhs(init);
							concat.setRhs(group_name);
							init = concat;
						}
						lv.setInit(init);
						block.getActions().add(lv);
						final PropertyReference lv_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
						lv_ref.setProperty(lv);
						send.getParameters().add(lv_ref);  
					} else {
						send.getParameters().add(EcoreUtil.copy(empty));
					}
		    		
		    		
		    		block.getActions().add(send);					
					it.setAction(block);										
					root.getInternal().add(it);
				}
			}
		}
	}
	
}
