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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.xtext.helpers.ActionHelper;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExpressionGroup;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ReturnAction;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.TypeRef;

public class FunctionMonitoring implements MonitoringAspect {
	
	final StringLiteral empty;
	final StringLiteral comma;
	final StringLiteral void_;	
	
	final Thing thing;
	final Property id;
	final Port monitoringPort;
	final Message onFunctionCalled;
	final TypeRef stringTypeRef;
	
	public FunctionMonitoring(Thing thing, Property id, Port monitoringPort, Message msg, TypeRef stringTypeRef) {
		this.thing = thing;
		this.id = id;
		this.monitoringPort = monitoringPort;
		this.onFunctionCalled = msg;
		this.stringTypeRef = stringTypeRef;
		
		empty = AiotMLFactory.eINSTANCE.createStringLiteral();
		empty.setStringValue("");
		
		comma = AiotMLFactory.eINSTANCE.createStringLiteral();
		comma.setStringValue(",");
	
		void_ = AiotMLFactory.eINSTANCE.createStringLiteral();
		void_.setStringValue("void_");
	}

	@Override
	public void monitor() {    	
    	for(Function f : thing.getFunctions()) {
    		if (f.isAbstract()) continue;
    		if (AnnotatedElementHelper.isDefined(f, "monitor", "not")) continue;
    		    		        	
        	//Send monitoring message before each return statement (or as the first statement in the function)
        	if (f.getTypeRef() == null) {
        		ActionBlock block;
        		if (f.getBody() instanceof ActionBlock) {
        			block = (ActionBlock) f.getBody();
        		} else {
        			block = AiotMLFactory.eINSTANCE.createActionBlock();
        			block.getActions().add(f.getBody());
        		}        		
        		final Action send = buildSendAction(f, null);        		
        		block.getActions().add(0, send);
        	} else {
        		for(ReturnAction ra : ActionHelper.getAllActions(f, ReturnAction.class)) {
        			ActionBlock block;
        			if (ra.eContainer() instanceof ActionBlock) {
        				block = (ActionBlock) ra.eContainer();
        			} else {
            			block = AiotMLFactory.eINSTANCE.createActionBlock();            			
            			final Object parent = ra.eContainer().eGet(ra.eContainingFeature());
            			if (parent instanceof EList) {
            				EList list = (EList) parent;
            				final int index = list.indexOf(ra);
            				list.add(index, block);
            				list.remove(ra);
            			} else {
            				final EObject o = ra.eContainer();
            				o.eSet(ra.eContainingFeature(), block);
            			}
            			block.getActions().add(ra);
        			}
        			
        			//Assign return expression to a readonly local variable
        			final LocalVariable var_return = AiotMLFactory.eINSTANCE.createLocalVariable();
        			var_return.setName("return_" + ra.eContainer().eContents().indexOf(ra));
        			var_return.setReadonly(true);
        			var_return.setTypeRef(EcoreUtil.copy(f.getTypeRef()));
        			var_return.setInit(EcoreUtil.copy(ra.getExp()));
        			
        			final PropertyReference ref_var = AiotMLFactory.eINSTANCE.createPropertyReference();
                	ref_var.setProperty(var_return);
                	ra.setExp(ref_var);
                	final CastExpression asString = AiotMLFactory.eINSTANCE.createCastExpression();
                	asString.setTerm(EcoreUtil.copy(ref_var));
                	asString.setType(stringTypeRef.getType());
        			
        			final LocalVariable var = AiotMLFactory.eINSTANCE.createLocalVariable();
        			var.setName("return_as_string" + ra.eContainer().eContents().indexOf(ra));
        			var.setReadonly(true);
        			var.setTypeRef(EcoreUtil.copy(stringTypeRef));
        			final PlusExpression string_return = AiotMLFactory.eINSTANCE.createPlusExpression();
        			string_return.setLhs(EcoreUtil.copy(empty));
        			final ExpressionGroup g = AiotMLFactory.eINSTANCE.createExpressionGroup();
        			g.setTerm(EcoreUtil.copy(asString));
        			string_return.setRhs(g);
        			var.setInit(string_return);
        			block.getActions().add(block.getActions().indexOf(ra), var_return);
        			block.getActions().add(block.getActions().indexOf(ra), var);
        				        			     			
            		PropertyReference ref_var_string = AiotMLFactory.eINSTANCE.createPropertyReference();
                	ref_var_string.setProperty(var);
                	
        			final Action send = buildSendAction(f, ref_var_string);        		
            		block.getActions().add(block.getActions().indexOf(ra), send);    		            		
        		}
        		
        	}
    	}
    }


	private Action buildSendAction(Function f, PropertyReference ref_var) {
		final SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
		send.setMessage(onFunctionCalled);
		send.setPort(monitoringPort);
		final PropertyReference id_ref = AiotMLFactory.eINSTANCE.createPropertyReference();
		id_ref.setProperty(id);
		send.getParameters().add(id_ref);
		final StringLiteral name_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
		name_exp.setStringValue(f.getName());        	
		send.getParameters().add(name_exp);
		if (f.getTypeRef() == null) {
			send.getParameters().add(EcoreUtil.copy(void_));
			send.getParameters().add(EcoreUtil.copy(empty));
		} else {
			final StringLiteral type_exp = AiotMLFactory.eINSTANCE.createStringLiteral();
    		type_exp.setStringValue(f.getTypeRef().getType().getName());
			send.getParameters().add(type_exp);
			send.getParameters().add(ref_var);
		}
		
		if (f.getParameters().isEmpty()) {
			send.getParameters().add(EcoreUtil.copy(empty));
			return send;
		} else {//FIXME: this will only work for target languages where we can + strings (all except posix/arduino as of now)
			final LocalVariable lv = AiotMLFactory.eINSTANCE.createLocalVariable();
			lv.setName("params");
			lv.setTypeRef(EcoreUtil.copy(stringTypeRef));
			lv.setReadonly(true);
			Expression init = EcoreUtil.copy(empty);
			final ActionBlock block = AiotMLFactory.eINSTANCE.createActionBlock();
    		block.getActions().add(lv);
			for(Parameter param : f.getParameters()) {
				final PlusExpression concat = AiotMLFactory.eINSTANCE.createPlusExpression();	
				final ExpressionGroup group_name = AiotMLFactory.eINSTANCE.createExpressionGroup();
				final ExpressionGroup group = AiotMLFactory.eINSTANCE.createExpressionGroup();
				final PlusExpression plus_comma = AiotMLFactory.eINSTANCE.createPlusExpression();
				final PlusExpression plus_name = AiotMLFactory.eINSTANCE.createPlusExpression();
				final StringLiteral name = AiotMLFactory.eINSTANCE.createStringLiteral();
				name.setStringValue(param.getName() + "=");
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
    		block.getActions().add(send);
    		return block;
		}
	}
	
}
