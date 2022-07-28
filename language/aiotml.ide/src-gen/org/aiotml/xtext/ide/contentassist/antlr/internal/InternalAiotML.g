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
grammar InternalAiotML;

options {
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package org.aiotml.xtext.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.aiotml.xtext.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.aiotml.xtext.services.AiotMLGrammarAccess;

}
@parser::members {
	private AiotMLGrammarAccess grammarAccess;

	public void setGrammarAccess(AiotMLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleAiotMLModel
entryRuleAiotMLModel
:
{ before(grammarAccess.getAiotMLModelRule()); }
	 ruleAiotMLModel
{ after(grammarAccess.getAiotMLModelRule()); } 
	 EOF 
;

// Rule AiotMLModel
ruleAiotMLModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getGroup()); }
		(rule__AiotMLModel__Group__0)
		{ after(grammarAccess.getAiotMLModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTemplate
entryRuleTemplate
:
{ before(grammarAccess.getTemplateRule()); }
	 ruleTemplate
{ after(grammarAccess.getTemplateRule()); } 
	 EOF 
;

// Rule Template
ruleTemplate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTemplateAccess().getGroup()); }
		(rule__Template__Group__0)
		{ after(grammarAccess.getTemplateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlatformAnnotation
entryRulePlatformAnnotation
:
{ before(grammarAccess.getPlatformAnnotationRule()); }
	 rulePlatformAnnotation
{ after(grammarAccess.getPlatformAnnotationRule()); } 
	 EOF 
;

// Rule PlatformAnnotation
rulePlatformAnnotation 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getGroup()); }
		(rule__PlatformAnnotation__Group__0)
		{ after(grammarAccess.getPlatformAnnotationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getAlternatives()); }
		(rule__Variable__Alternatives)
		{ after(grammarAccess.getVariableAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeRef
entryRuleTypeRef
:
{ before(grammarAccess.getTypeRefRule()); }
	 ruleTypeRef
{ after(grammarAccess.getTypeRefRule()); } 
	 EOF 
;

// Rule TypeRef
ruleTypeRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeRefAccess().getGroup()); }
		(rule__TypeRef__Group__0)
		{ after(grammarAccess.getTypeRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleType
entryRuleType
:
{ before(grammarAccess.getTypeRule()); }
	 ruleType
{ after(grammarAccess.getTypeRule()); } 
	 EOF 
;

// Rule Type
ruleType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeAccess().getAlternatives()); }
		(rule__Type__Alternatives)
		{ after(grammarAccess.getTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType
:
{ before(grammarAccess.getPrimitiveTypeRule()); }
	 rulePrimitiveType
{ after(grammarAccess.getPrimitiveTypeRule()); } 
	 EOF 
;

// Rule PrimitiveType
rulePrimitiveType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
		(rule__PrimitiveType__Group__0)
		{ after(grammarAccess.getPrimitiveTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleObjectType
entryRuleObjectType
:
{ before(grammarAccess.getObjectTypeRule()); }
	 ruleObjectType
{ after(grammarAccess.getObjectTypeRule()); } 
	 EOF 
;

// Rule ObjectType
ruleObjectType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getObjectTypeAccess().getGroup()); }
		(rule__ObjectType__Group__0)
		{ after(grammarAccess.getObjectTypeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumeration
entryRuleEnumeration
:
{ before(grammarAccess.getEnumerationRule()); }
	 ruleEnumeration
{ after(grammarAccess.getEnumerationRule()); } 
	 EOF 
;

// Rule Enumeration
ruleEnumeration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationAccess().getGroup()); }
		(rule__Enumeration__Group__0)
		{ after(grammarAccess.getEnumerationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral
:
{ before(grammarAccess.getEnumerationLiteralRule()); }
	 ruleEnumerationLiteral
{ after(grammarAccess.getEnumerationLiteralRule()); } 
	 EOF 
;

// Rule EnumerationLiteral
ruleEnumerationLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
		(rule__EnumerationLiteral__Group__0)
		{ after(grammarAccess.getEnumerationLiteralAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTensor
entryRuleTensor
:
{ before(grammarAccess.getTensorRule()); }
	 ruleTensor
{ after(grammarAccess.getTensorRule()); } 
	 EOF 
;

// Rule Tensor
ruleTensor 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTensorAccess().getGroup()); }
		(rule__Tensor__Group__0)
		{ after(grammarAccess.getTensorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLayer
entryRuleLayer
:
{ before(grammarAccess.getLayerRule()); }
	 ruleLayer
{ after(grammarAccess.getLayerRule()); } 
	 EOF 
;

// Rule Layer
ruleLayer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLayerAccess().getGroup()); }
		(rule__Layer__Group__0)
		{ after(grammarAccess.getLayerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getGroup()); }
		(rule__Model__Group__0)
		{ after(grammarAccess.getModelAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModelReference
entryRuleModelReference
:
{ before(grammarAccess.getModelReferenceRule()); }
	 ruleModelReference
{ after(grammarAccess.getModelReferenceRule()); } 
	 EOF 
;

// Rule ModelReference
ruleModelReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelReferenceAccess().getGroup()); }
		(rule__ModelReference__Group__0)
		{ after(grammarAccess.getModelReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStrategy
entryRuleStrategy
:
{ before(grammarAccess.getStrategyRule()); }
	 ruleStrategy
{ after(grammarAccess.getStrategyRule()); } 
	 EOF 
;

// Rule Strategy
ruleStrategy 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStrategyAccess().getGroup()); }
		(rule__Strategy__Group__0)
		{ after(grammarAccess.getStrategyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiAgent
entryRuleMultiAgent
:
{ before(grammarAccess.getMultiAgentRule()); }
	 ruleMultiAgent
{ after(grammarAccess.getMultiAgentRule()); } 
	 EOF 
;

// Rule MultiAgent
ruleMultiAgent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiAgentAccess().getGroup()); }
		(rule__MultiAgent__Group__0)
		{ after(grammarAccess.getMultiAgentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiAgentProperty
entryRuleMultiAgentProperty
:
{ before(grammarAccess.getMultiAgentPropertyRule()); }
	 ruleMultiAgentProperty
{ after(grammarAccess.getMultiAgentPropertyRule()); } 
	 EOF 
;

// Rule MultiAgentProperty
ruleMultiAgentProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiAgentPropertyAccess().getGroup()); }
		(rule__MultiAgentProperty__Group__0)
		{ after(grammarAccess.getMultiAgentPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStrategyProperty
entryRuleStrategyProperty
:
{ before(grammarAccess.getStrategyPropertyRule()); }
	 ruleStrategyProperty
{ after(grammarAccess.getStrategyPropertyRule()); } 
	 EOF 
;

// Rule StrategyProperty
ruleStrategyProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStrategyPropertyAccess().getGroup()); }
		(rule__StrategyProperty__Group__0)
		{ after(grammarAccess.getStrategyPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStrategyAssignment
entryRuleStrategyAssignment
:
{ before(grammarAccess.getStrategyAssignmentRule()); }
	 ruleStrategyAssignment
{ after(grammarAccess.getStrategyAssignmentRule()); } 
	 EOF 
;

// Rule StrategyAssignment
ruleStrategyAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getGroup()); }
		(rule__StrategyAssignment__Group__0)
		{ after(grammarAccess.getStrategyAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleThing
entryRuleThing
:
{ before(grammarAccess.getThingRule()); }
	 ruleThing
{ after(grammarAccess.getThingRule()); } 
	 EOF 
;

// Rule Thing
ruleThing 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getThingAccess().getGroup()); }
		(rule__Thing__Group__0)
		{ after(grammarAccess.getThingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubThing
entryRuleSubThing
:
{ before(grammarAccess.getSubThingRule()); }
	 ruleSubThing
{ after(grammarAccess.getSubThingRule()); } 
	 EOF 
;

// Rule SubThing
ruleSubThing 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubThingAccess().getGroup()); }
		(rule__SubThing__Group__0)
		{ after(grammarAccess.getSubThingAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAgent
entryRuleAgent
:
{ before(grammarAccess.getAgentRule()); }
	 ruleAgent
{ after(grammarAccess.getAgentRule()); } 
	 EOF 
;

// Rule Agent
ruleAgent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAgentAccess().getGroup()); }
		(rule__Agent__Group__0)
		{ after(grammarAccess.getAgentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCproperty
entryRuleCproperty
:
{ before(grammarAccess.getCpropertyRule()); }
	 ruleCproperty
{ after(grammarAccess.getCpropertyRule()); } 
	 EOF 
;

// Rule Cproperty
ruleCproperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCpropertyAccess().getGroup()); }
		(rule__Cproperty__Group__0)
		{ after(grammarAccess.getCpropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyAssign
entryRulePropertyAssign
:
{ before(grammarAccess.getPropertyAssignRule()); }
	 rulePropertyAssign
{ after(grammarAccess.getPropertyAssignRule()); } 
	 EOF 
;

// Rule PropertyAssign
rulePropertyAssign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAssignAccess().getGroup()); }
		(rule__PropertyAssign__Group__0)
		{ after(grammarAccess.getPropertyAssignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProtocol
entryRuleProtocol
:
{ before(grammarAccess.getProtocolRule()); }
	 ruleProtocol
{ after(grammarAccess.getProtocolRule()); } 
	 EOF 
;

// Rule Protocol
ruleProtocol 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProtocolAccess().getGroup()); }
		(rule__Protocol__Group__0)
		{ after(grammarAccess.getProtocolAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunction
entryRuleFunction
:
{ before(grammarAccess.getFunctionRule()); }
	 ruleFunction
{ after(grammarAccess.getFunctionRule()); } 
	 EOF 
;

// Rule Function
ruleFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionAccess().getAlternatives()); }
		(rule__Function__Alternatives)
		{ after(grammarAccess.getFunctionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractFunction
entryRuleAbstractFunction
:
{ before(grammarAccess.getAbstractFunctionRule()); }
	 ruleAbstractFunction
{ after(grammarAccess.getAbstractFunctionRule()); } 
	 EOF 
;

// Rule AbstractFunction
ruleAbstractFunction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getGroup()); }
		(rule__AbstractFunction__Group__0)
		{ after(grammarAccess.getAbstractFunctionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProperty
entryRuleProperty
:
{ before(grammarAccess.getPropertyRule()); }
	 ruleProperty
{ after(grammarAccess.getPropertyRule()); } 
	 EOF 
;

// Rule Property
ruleProperty 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyAccess().getGroup()); }
		(rule__Property__Group__0)
		{ after(grammarAccess.getPropertyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMessage
entryRuleMessage
:
{ before(grammarAccess.getMessageRule()); }
	 ruleMessage
{ after(grammarAccess.getMessageRule()); } 
	 EOF 
;

// Rule Message
ruleMessage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMessageAccess().getGroup()); }
		(rule__Message__Group__0)
		{ after(grammarAccess.getMessageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParameter
entryRuleParameter
:
{ before(grammarAccess.getParameterRule()); }
	 ruleParameter
{ after(grammarAccess.getParameterRule()); } 
	 EOF 
;

// Rule Parameter
ruleParameter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParameterAccess().getGroup()); }
		(rule__Parameter__Group__0)
		{ after(grammarAccess.getParameterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePort
entryRulePort
:
{ before(grammarAccess.getPortRule()); }
	 rulePort
{ after(grammarAccess.getPortRule()); } 
	 EOF 
;

// Rule Port
rulePort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPortAccess().getAlternatives()); }
		(rule__Port__Alternatives)
		{ after(grammarAccess.getPortAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRequiredPort
entryRuleRequiredPort
:
{ before(grammarAccess.getRequiredPortRule()); }
	 ruleRequiredPort
{ after(grammarAccess.getRequiredPortRule()); } 
	 EOF 
;

// Rule RequiredPort
ruleRequiredPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRequiredPortAccess().getGroup()); }
		(rule__RequiredPort__Group__0)
		{ after(grammarAccess.getRequiredPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleProvidedPort
entryRuleProvidedPort
:
{ before(grammarAccess.getProvidedPortRule()); }
	 ruleProvidedPort
{ after(grammarAccess.getProvidedPortRule()); } 
	 EOF 
;

// Rule ProvidedPort
ruleProvidedPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getProvidedPortAccess().getGroup()); }
		(rule__ProvidedPort__Group__0)
		{ after(grammarAccess.getProvidedPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInternalPort
entryRuleInternalPort
:
{ before(grammarAccess.getInternalPortRule()); }
	 ruleInternalPort
{ after(grammarAccess.getInternalPortRule()); } 
	 EOF 
;

// Rule InternalPort
ruleInternalPort 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInternalPortAccess().getGroup()); }
		(rule__InternalPort__Group__0)
		{ after(grammarAccess.getInternalPortAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleState
entryRuleState
:
{ before(grammarAccess.getStateRule()); }
	 ruleState
{ after(grammarAccess.getStateRule()); } 
	 EOF 
;

// Rule State
ruleState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateAccess().getAlternatives()); }
		(rule__State__Alternatives)
		{ after(grammarAccess.getStateAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHandler
entryRuleHandler
:
{ before(grammarAccess.getHandlerRule()); }
	 ruleHandler
{ after(grammarAccess.getHandlerRule()); } 
	 EOF 
;

// Rule Handler
ruleHandler 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHandlerAccess().getAlternatives()); }
		(rule__Handler__Alternatives)
		{ after(grammarAccess.getHandlerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTransition
entryRuleTransition
:
{ before(grammarAccess.getTransitionRule()); }
	 ruleTransition
{ after(grammarAccess.getTransitionRule()); } 
	 EOF 
;

// Rule Transition
ruleTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTransitionAccess().getGroup()); }
		(rule__Transition__Group__0)
		{ after(grammarAccess.getTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInternalTransition
entryRuleInternalTransition
:
{ before(grammarAccess.getInternalTransitionRule()); }
	 ruleInternalTransition
{ after(grammarAccess.getInternalTransitionRule()); } 
	 EOF 
;

// Rule InternalTransition
ruleInternalTransition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getGroup()); }
		(rule__InternalTransition__Group__0)
		{ after(grammarAccess.getInternalTransitionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCompositeState
entryRuleCompositeState
:
{ before(grammarAccess.getCompositeStateRule()); }
	 ruleCompositeState
{ after(grammarAccess.getCompositeStateRule()); } 
	 EOF 
;

// Rule CompositeState
ruleCompositeState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCompositeStateAccess().getGroup()); }
		(rule__CompositeState__Group__0)
		{ after(grammarAccess.getCompositeStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateMachine
entryRuleStateMachine
:
{ before(grammarAccess.getStateMachineRule()); }
	 ruleStateMachine
{ after(grammarAccess.getStateMachineRule()); } 
	 EOF 
;

// Rule StateMachine
ruleStateMachine 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateMachineAccess().getGroup()); }
		(rule__StateMachine__Group__0)
		{ after(grammarAccess.getStateMachineAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSession
entryRuleSession
:
{ before(grammarAccess.getSessionRule()); }
	 ruleSession
{ after(grammarAccess.getSessionRule()); } 
	 EOF 
;

// Rule Session
ruleSession 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSessionAccess().getGroup()); }
		(rule__Session__Group__0)
		{ after(grammarAccess.getSessionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegion
entryRuleRegion
:
{ before(grammarAccess.getRegionRule()); }
	 ruleRegion
{ after(grammarAccess.getRegionRule()); } 
	 EOF 
;

// Rule Region
ruleRegion 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegionAccess().getGroup()); }
		(rule__Region__Group__0)
		{ after(grammarAccess.getRegionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFinalState
entryRuleFinalState
:
{ before(grammarAccess.getFinalStateRule()); }
	 ruleFinalState
{ after(grammarAccess.getFinalStateRule()); } 
	 EOF 
;

// Rule FinalState
ruleFinalState 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFinalStateAccess().getGroup()); }
		(rule__FinalState__Group__0)
		{ after(grammarAccess.getFinalStateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStateContainer
entryRuleStateContainer
:
{ before(grammarAccess.getStateContainerRule()); }
	 ruleStateContainer
{ after(grammarAccess.getStateContainerRule()); } 
	 EOF 
;

// Rule StateContainer
ruleStateContainer 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStateContainerAccess().getAlternatives()); }
		(rule__StateContainer__Alternatives)
		{ after(grammarAccess.getStateContainerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEvent
entryRuleEvent
:
{ before(grammarAccess.getEventRule()); }
	 ruleEvent
{ after(grammarAccess.getEventRule()); } 
	 EOF 
;

// Rule Event
ruleEvent 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventAccess().getReceiveMessageParserRuleCall()); }
		ruleReceiveMessage
		{ after(grammarAccess.getEventAccess().getReceiveMessageParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReceiveMessage
entryRuleReceiveMessage
:
{ before(grammarAccess.getReceiveMessageRule()); }
	 ruleReceiveMessage
{ after(grammarAccess.getReceiveMessageRule()); } 
	 EOF 
;

// Rule ReceiveMessage
ruleReceiveMessage 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReceiveMessageAccess().getGroup()); }
		(rule__ReceiveMessage__Group__0)
		{ after(grammarAccess.getReceiveMessageAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAction
entryRuleAction
:
{ before(grammarAccess.getActionRule()); }
	 ruleAction
{ after(grammarAccess.getActionRule()); } 
	 EOF 
;

// Rule Action
ruleAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionAccess().getAlternatives()); }
		(rule__Action__Alternatives)
		{ after(grammarAccess.getActionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActionBlock
entryRuleActionBlock
:
{ before(grammarAccess.getActionBlockRule()); }
	 ruleActionBlock
{ after(grammarAccess.getActionBlockRule()); } 
	 EOF 
;

// Rule ActionBlock
ruleActionBlock 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActionBlockAccess().getGroup()); }
		(rule__ActionBlock__Group__0)
		{ after(grammarAccess.getActionBlockAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExternStatement
entryRuleExternStatement
:
{ before(grammarAccess.getExternStatementRule()); }
	 ruleExternStatement
{ after(grammarAccess.getExternStatementRule()); } 
	 EOF 
;

// Rule ExternStatement
ruleExternStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExternStatementAccess().getGroup()); }
		(rule__ExternStatement__Group__0)
		{ after(grammarAccess.getExternStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLocalVariable
entryRuleLocalVariable
:
{ before(grammarAccess.getLocalVariableRule()); }
	 ruleLocalVariable
{ after(grammarAccess.getLocalVariableRule()); } 
	 EOF 
;

// Rule LocalVariable
ruleLocalVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLocalVariableAccess().getGroup()); }
		(rule__LocalVariable__Group__0)
		{ after(grammarAccess.getLocalVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSendAction
entryRuleSendAction
:
{ before(grammarAccess.getSendActionRule()); }
	 ruleSendAction
{ after(grammarAccess.getSendActionRule()); } 
	 EOF 
;

// Rule SendAction
ruleSendAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSendActionAccess().getGroup()); }
		(rule__SendAction__Group__0)
		{ after(grammarAccess.getSendActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment
:
{ before(grammarAccess.getVariableAssignmentRule()); }
	 ruleVariableAssignment
{ after(grammarAccess.getVariableAssignmentRule()); } 
	 EOF 
;

// Rule VariableAssignment
ruleVariableAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getGroup()); }
		(rule__VariableAssignment__Group__0)
		{ after(grammarAccess.getVariableAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCpropertyAssignment
entryRuleCpropertyAssignment
:
{ before(grammarAccess.getCpropertyAssignmentRule()); }
	 ruleCpropertyAssignment
{ after(grammarAccess.getCpropertyAssignmentRule()); } 
	 EOF 
;

// Rule CpropertyAssignment
ruleCpropertyAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getGroup()); }
		(rule__CpropertyAssignment__Group__0)
		{ after(grammarAccess.getCpropertyAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStrategyStream
entryRuleStrategyStream
:
{ before(grammarAccess.getStrategyStreamRule()); }
	 ruleStrategyStream
{ after(grammarAccess.getStrategyStreamRule()); } 
	 EOF 
;

// Rule StrategyStream
ruleStrategyStream 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getGroup()); }
		(rule__StrategyStream__Group__0)
		{ after(grammarAccess.getStrategyStreamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDictAssignment
entryRuleDictAssignment
:
{ before(grammarAccess.getDictAssignmentRule()); }
	 ruleDictAssignment
{ after(grammarAccess.getDictAssignmentRule()); } 
	 EOF 
;

// Rule DictAssignment
ruleDictAssignment 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDictAssignmentAccess().getGroup()); }
		(rule__DictAssignment__Group__0)
		{ after(grammarAccess.getDictAssignmentAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleZipEnumerate
entryRuleZipEnumerate
:
{ before(grammarAccess.getZipEnumerateRule()); }
	 ruleZipEnumerate
{ after(grammarAccess.getZipEnumerateRule()); } 
	 EOF 
;

// Rule ZipEnumerate
ruleZipEnumerate 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getGroup()); }
		(rule__ZipEnumerate__Group__0)
		{ after(grammarAccess.getZipEnumerateAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAppend
entryRuleAppend
:
{ before(grammarAccess.getAppendRule()); }
	 ruleAppend
{ after(grammarAccess.getAppendRule()); } 
	 EOF 
;

// Rule Append
ruleAppend 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAppendAccess().getGroup()); }
		(rule__Append__Group__0)
		{ after(grammarAccess.getAppendAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIncrement
entryRuleIncrement
:
{ before(grammarAccess.getIncrementRule()); }
	 ruleIncrement
{ after(grammarAccess.getIncrementRule()); } 
	 EOF 
;

// Rule Increment
ruleIncrement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIncrementAccess().getGroup()); }
		(rule__Increment__Group__0)
		{ after(grammarAccess.getIncrementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecrement
entryRuleDecrement
:
{ before(grammarAccess.getDecrementRule()); }
	 ruleDecrement
{ after(grammarAccess.getDecrementRule()); } 
	 EOF 
;

// Rule Decrement
ruleDecrement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecrementAccess().getGroup()); }
		(rule__Decrement__Group__0)
		{ after(grammarAccess.getDecrementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleForAction
entryRuleForAction
:
{ before(grammarAccess.getForActionRule()); }
	 ruleForAction
{ after(grammarAccess.getForActionRule()); } 
	 EOF 
;

// Rule ForAction
ruleForAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getForActionAccess().getGroup()); }
		(rule__ForAction__Group__0)
		{ after(grammarAccess.getForActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePyforAction
entryRulePyforAction
:
{ before(grammarAccess.getPyforActionRule()); }
	 rulePyforAction
{ after(grammarAccess.getPyforActionRule()); } 
	 EOF 
;

// Rule PyforAction
rulePyforAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPyforActionAccess().getGroup()); }
		(rule__PyforAction__Group__0)
		{ after(grammarAccess.getPyforActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLoopAction
entryRuleLoopAction
:
{ before(grammarAccess.getLoopActionRule()); }
	 ruleLoopAction
{ after(grammarAccess.getLoopActionRule()); } 
	 EOF 
;

// Rule LoopAction
ruleLoopAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLoopActionAccess().getGroup()); }
		(rule__LoopAction__Group__0)
		{ after(grammarAccess.getLoopActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConditionalAction
entryRuleConditionalAction
:
{ before(grammarAccess.getConditionalActionRule()); }
	 ruleConditionalAction
{ after(grammarAccess.getConditionalActionRule()); } 
	 EOF 
;

// Rule ConditionalAction
ruleConditionalAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConditionalActionAccess().getGroup()); }
		(rule__ConditionalAction__Group__0)
		{ after(grammarAccess.getConditionalActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleReturnAction
entryRuleReturnAction
:
{ before(grammarAccess.getReturnActionRule()); }
	 ruleReturnAction
{ after(grammarAccess.getReturnActionRule()); } 
	 EOF 
;

// Rule ReturnAction
ruleReturnAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getReturnActionAccess().getGroup()); }
		(rule__ReturnAction__Group__0)
		{ after(grammarAccess.getReturnActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrintAction
entryRulePrintAction
:
{ before(grammarAccess.getPrintActionRule()); }
	 rulePrintAction
{ after(grammarAccess.getPrintActionRule()); } 
	 EOF 
;

// Rule PrintAction
rulePrintAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrintActionAccess().getGroup()); }
		(rule__PrintAction__Group__0)
		{ after(grammarAccess.getPrintActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleErrorAction
entryRuleErrorAction
:
{ before(grammarAccess.getErrorActionRule()); }
	 ruleErrorAction
{ after(grammarAccess.getErrorActionRule()); } 
	 EOF 
;

// Rule ErrorAction
ruleErrorAction 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getErrorActionAccess().getGroup()); }
		(rule__ErrorAction__Group__0)
		{ after(grammarAccess.getErrorActionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStartSession
entryRuleStartSession
:
{ before(grammarAccess.getStartSessionRule()); }
	 ruleStartSession
{ after(grammarAccess.getStartSessionRule()); } 
	 EOF 
;

// Rule StartSession
ruleStartSession 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStartSessionAccess().getGroup()); }
		(rule__StartSession__Group__0)
		{ after(grammarAccess.getStartSessionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunctionCallStatement
entryRuleFunctionCallStatement
:
{ before(grammarAccess.getFunctionCallStatementRule()); }
	 ruleFunctionCallStatement
{ after(grammarAccess.getFunctionCallStatementRule()); } 
	 EOF 
;

// Rule FunctionCallStatement
ruleFunctionCallStatement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionCallStatementAccess().getGroup()); }
		(rule__FunctionCallStatement__Group__0)
		{ after(grammarAccess.getFunctionCallStatementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); }
		ruleOrExpression
		{ after(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpression
entryRuleOrExpression
:
{ before(grammarAccess.getOrExpressionRule()); }
	 ruleOrExpression
{ after(grammarAccess.getOrExpressionRule()); } 
	 EOF 
;

// Rule OrExpression
ruleOrExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionAccess().getGroup()); }
		(rule__OrExpression__Group__0)
		{ after(grammarAccess.getOrExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpression
entryRuleAndExpression
:
{ before(grammarAccess.getAndExpressionRule()); }
	 ruleAndExpression
{ after(grammarAccess.getAndExpressionRule()); } 
	 EOF 
;

// Rule AndExpression
ruleAndExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionAccess().getGroup()); }
		(rule__AndExpression__Group__0)
		{ after(grammarAccess.getAndExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEquality
entryRuleEquality
:
{ before(grammarAccess.getEqualityRule()); }
	 ruleEquality
{ after(grammarAccess.getEqualityRule()); } 
	 EOF 
;

// Rule Equality
ruleEquality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEqualityAccess().getGroup()); }
		(rule__Equality__Group__0)
		{ after(grammarAccess.getEqualityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparaison
entryRuleComparaison
:
{ before(grammarAccess.getComparaisonRule()); }
	 ruleComparaison
{ after(grammarAccess.getComparaisonRule()); } 
	 EOF 
;

// Rule Comparaison
ruleComparaison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparaisonAccess().getGroup()); }
		(rule__Comparaison__Group__0)
		{ after(grammarAccess.getComparaisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAddition
entryRuleAddition
:
{ before(grammarAccess.getAdditionRule()); }
	 ruleAddition
{ after(grammarAccess.getAdditionRule()); } 
	 EOF 
;

// Rule Addition
ruleAddition 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAdditionAccess().getGroup()); }
		(rule__Addition__Group__0)
		{ after(grammarAccess.getAdditionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMultiplication
entryRuleMultiplication
:
{ before(grammarAccess.getMultiplicationRule()); }
	 ruleMultiplication
{ after(grammarAccess.getMultiplicationRule()); } 
	 EOF 
;

// Rule Multiplication
ruleMultiplication 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup()); }
		(rule__Multiplication__Group__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCastExpression
entryRuleCastExpression
:
{ before(grammarAccess.getCastExpressionRule()); }
	 ruleCastExpression
{ after(grammarAccess.getCastExpressionRule()); } 
	 EOF 
;

// Rule CastExpression
ruleCastExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCastExpressionAccess().getGroup()); }
		(rule__CastExpression__Group__0)
		{ after(grammarAccess.getCastExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayIndexPostfix
entryRuleArrayIndexPostfix
:
{ before(grammarAccess.getArrayIndexPostfixRule()); }
	 ruleArrayIndexPostfix
{ after(grammarAccess.getArrayIndexPostfixRule()); } 
	 EOF 
;

// Rule ArrayIndexPostfix
ruleArrayIndexPostfix 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayIndexPostfixAccess().getGroup()); }
		(rule__ArrayIndexPostfix__Group__0)
		{ after(grammarAccess.getArrayIndexPostfixAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression
:
{ before(grammarAccess.getAtomicExpressionRule()); }
	 ruleAtomicExpression
{ after(grammarAccess.getAtomicExpressionRule()); } 
	 EOF 
;

// Rule AtomicExpression
ruleAtomicExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getAlternatives()); }
		(rule__AtomicExpression__Alternatives)
		{ after(grammarAccess.getAtomicExpressionAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExternExpression
entryRuleExternExpression
:
{ before(grammarAccess.getExternExpressionRule()); }
	 ruleExternExpression
{ after(grammarAccess.getExternExpressionRule()); } 
	 EOF 
;

// Rule ExternExpression
ruleExternExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExternExpressionAccess().getGroup()); }
		(rule__ExternExpression__Group__0)
		{ after(grammarAccess.getExternExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLiteral
entryRuleLiteral
:
{ before(grammarAccess.getLiteralRule()); }
	 ruleLiteral
{ after(grammarAccess.getLiteralRule()); } 
	 EOF 
;

// Rule Literal
ruleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLiteralAccess().getAlternatives()); }
		(rule__Literal__Alternatives)
		{ after(grammarAccess.getLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleArrayInit
entryRuleArrayInit
:
{ before(grammarAccess.getArrayInitRule()); }
	 ruleArrayInit
{ after(grammarAccess.getArrayInitRule()); } 
	 EOF 
;

// Rule ArrayInit
ruleArrayInit 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getArrayInitAccess().getGroup()); }
		(rule__ArrayInit__Group__0)
		{ after(grammarAccess.getArrayInitAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEnumLiteralRef
entryRuleEnumLiteralRef
:
{ before(grammarAccess.getEnumLiteralRefRule()); }
	 ruleEnumLiteralRef
{ after(grammarAccess.getEnumLiteralRefRule()); } 
	 EOF 
;

// Rule EnumLiteralRef
ruleEnumLiteralRef 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEnumLiteralRefAccess().getGroup()); }
		(rule__EnumLiteralRef__Group__0)
		{ after(grammarAccess.getEnumLiteralRefAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleByteLiteral
entryRuleByteLiteral
:
{ before(grammarAccess.getByteLiteralRule()); }
	 ruleByteLiteral
{ after(grammarAccess.getByteLiteralRule()); } 
	 EOF 
;

// Rule ByteLiteral
ruleByteLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getByteLiteralAccess().getByteValueAssignment()); }
		(rule__ByteLiteral__ByteValueAssignment)
		{ after(grammarAccess.getByteLiteralAccess().getByteValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCharLiteral
entryRuleCharLiteral
:
{ before(grammarAccess.getCharLiteralRule()); }
	 ruleCharLiteral
{ after(grammarAccess.getCharLiteralRule()); } 
	 EOF 
;

// Rule CharLiteral
ruleCharLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCharLiteralAccess().getCharValueAssignment()); }
		(rule__CharLiteral__CharValueAssignment)
		{ after(grammarAccess.getCharLiteralAccess().getCharValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral
:
{ before(grammarAccess.getIntegerLiteralRule()); }
	 ruleIntegerLiteral
{ after(grammarAccess.getIntegerLiteralRule()); } 
	 EOF 
;

// Rule IntegerLiteral
ruleIntegerLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getIntValueAssignment()); }
		(rule__IntegerLiteral__IntValueAssignment)
		{ after(grammarAccess.getIntegerLiteralAccess().getIntValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral
:
{ before(grammarAccess.getBooleanLiteralRule()); }
	 ruleBooleanLiteral
{ after(grammarAccess.getBooleanLiteralRule()); } 
	 EOF 
;

// Rule BooleanLiteral
ruleBooleanLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getAlternatives()); }
		(rule__BooleanLiteral__Alternatives)
		{ after(grammarAccess.getBooleanLiteralAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral
:
{ before(grammarAccess.getStringLiteralRule()); }
	 ruleStringLiteral
{ after(grammarAccess.getStringLiteralRule()); } 
	 EOF 
;

// Rule StringLiteral
ruleStringLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringLiteralAccess().getStringValueAssignment()); }
		(rule__StringLiteral__StringValueAssignment)
		{ after(grammarAccess.getStringLiteralAccess().getStringValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral
:
{ before(grammarAccess.getDoubleLiteralRule()); }
	 ruleDoubleLiteral
{ after(grammarAccess.getDoubleLiteralRule()); } 
	 EOF 
;

// Rule DoubleLiteral
ruleDoubleLiteral 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDoubleLiteralAccess().getDoubleValueAssignment()); }
		(rule__DoubleLiteral__DoubleValueAssignment)
		{ after(grammarAccess.getDoubleLiteralAccess().getDoubleValueAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyReference
entryRulePropertyReference
:
{ before(grammarAccess.getPropertyReferenceRule()); }
	 rulePropertyReference
{ after(grammarAccess.getPropertyReferenceRule()); } 
	 EOF 
;

// Rule PropertyReference
rulePropertyReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment()); }
		(rule__PropertyReference__PropertyAssignment)
		{ after(grammarAccess.getPropertyReferenceAccess().getPropertyAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCpropertyReference
entryRuleCpropertyReference
:
{ before(grammarAccess.getCpropertyReferenceRule()); }
	 ruleCpropertyReference
{ after(grammarAccess.getCpropertyReferenceRule()); } 
	 EOF 
;

// Rule CpropertyReference
ruleCpropertyReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCpropertyReferenceAccess().getGroup()); }
		(rule__CpropertyReference__Group__0)
		{ after(grammarAccess.getCpropertyReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEventReference
entryRuleEventReference
:
{ before(grammarAccess.getEventReferenceRule()); }
	 ruleEventReference
{ after(grammarAccess.getEventReferenceRule()); } 
	 EOF 
;

// Rule EventReference
ruleEventReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEventReferenceAccess().getGroup()); }
		(rule__EventReference__Group__0)
		{ after(grammarAccess.getEventReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunctionCallExpression
entryRuleFunctionCallExpression
:
{ before(grammarAccess.getFunctionCallExpressionRule()); }
	 ruleFunctionCallExpression
{ after(grammarAccess.getFunctionCallExpressionRule()); } 
	 EOF 
;

// Rule FunctionCallExpression
ruleFunctionCallExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFunctionCallExpressionAccess().getGroup()); }
		(rule__FunctionCallExpression__Group__0)
		{ after(grammarAccess.getFunctionCallExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConfiguration
entryRuleConfiguration
:
{ before(grammarAccess.getConfigurationRule()); }
	 ruleConfiguration
{ after(grammarAccess.getConfigurationRule()); } 
	 EOF 
;

// Rule Configuration
ruleConfiguration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigurationAccess().getGroup()); }
		(rule__Configuration__Group__0)
		{ after(grammarAccess.getConfigurationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleInstance
entryRuleInstance
:
{ before(grammarAccess.getInstanceRule()); }
	 ruleInstance
{ after(grammarAccess.getInstanceRule()); } 
	 EOF 
;

// Rule Instance
ruleInstance 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getInstanceAccess().getGroup()); }
		(rule__Instance__Group__0)
		{ after(grammarAccess.getInstanceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConfigPropertyAssign
entryRuleConfigPropertyAssign
:
{ before(grammarAccess.getConfigPropertyAssignRule()); }
	 ruleConfigPropertyAssign
{ after(grammarAccess.getConfigPropertyAssignRule()); } 
	 EOF 
;

// Rule ConfigPropertyAssign
ruleConfigPropertyAssign 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getGroup()); }
		(rule__ConfigPropertyAssign__Group__0)
		{ after(grammarAccess.getConfigPropertyAssignAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractConnector
entryRuleAbstractConnector
:
{ before(grammarAccess.getAbstractConnectorRule()); }
	 ruleAbstractConnector
{ after(grammarAccess.getAbstractConnectorRule()); } 
	 EOF 
;

// Rule AbstractConnector
ruleAbstractConnector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractConnectorAccess().getAlternatives()); }
		(rule__AbstractConnector__Alternatives)
		{ after(grammarAccess.getAbstractConnectorAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConnector
entryRuleConnector
:
{ before(grammarAccess.getConnectorRule()); }
	 ruleConnector
{ after(grammarAccess.getConnectorRule()); } 
	 EOF 
;

// Rule Connector
ruleConnector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConnectorAccess().getGroup()); }
		(rule__Connector__Group__0)
		{ after(grammarAccess.getConnectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExternalConnector
entryRuleExternalConnector
:
{ before(grammarAccess.getExternalConnectorRule()); }
	 ruleExternalConnector
{ after(grammarAccess.getExternalConnectorRule()); } 
	 EOF 
;

// Rule ExternalConnector
ruleExternalConnector 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getGroup()); }
		(rule__ExternalConnector__Group__0)
		{ after(grammarAccess.getExternalConnectorAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getTypesAssignment_2_0()); }
		(rule__AiotMLModel__TypesAssignment_2_0)
		{ after(grammarAccess.getAiotMLModelAccess().getTypesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getAiotMLModelAccess().getProtocolsAssignment_2_1()); }
		(rule__AiotMLModel__ProtocolsAssignment_2_1)
		{ after(grammarAccess.getAiotMLModelAccess().getProtocolsAssignment_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getAiotMLModelAccess().getConfigsAssignment_2_2()); }
		(rule__AiotMLModel__ConfigsAssignment_2_2)
		{ after(grammarAccess.getAiotMLModelAccess().getConfigsAssignment_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_0()); }
		(rule__PlatformAnnotation__ValueAssignment_1_0)
		{ after(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_1()); }
		(rule__PlatformAnnotation__ValueAssignment_1_1)
		{ after(grammarAccess.getPlatformAnnotationAccess().getValueAssignment_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getGroup_0()); }
		(rule__Variable__Group_0__0)
		{ after(grammarAccess.getVariableAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getTensorAssignment_1()); }
		(rule__Variable__TensorAssignment_1)
		{ after(grammarAccess.getVariableAccess().getTensorAssignment_1()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getLocalVariableParserRuleCall_2()); }
		ruleLocalVariable
		{ after(grammarAccess.getVariableAccess().getLocalVariableParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getPropertyParserRuleCall_3()); }
		ruleProperty
		{ after(grammarAccess.getVariableAccess().getPropertyParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getParameterParserRuleCall_4()); }
		ruleParameter
		{ after(grammarAccess.getVariableAccess().getParameterParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getCpropertyParserRuleCall_5()); }
		ruleCproperty
		{ after(grammarAccess.getVariableAccess().getCpropertyParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getStrategyPropertyParserRuleCall_6()); }
		ruleStrategyProperty
		{ after(grammarAccess.getVariableAccess().getStrategyPropertyParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getVariableAccess().getMultiAgentPropertyParserRuleCall_7()); }
		ruleMultiAgentProperty
		{ after(grammarAccess.getVariableAccess().getMultiAgentPropertyParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__CardinalityAlternatives_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getCardinalityIntegerLiteralParserRuleCall_1_1_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getTypeRefAccess().getCardinalityIntegerLiteralParserRuleCall_1_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeRefAccess().getCardinalityPropertyReferenceParserRuleCall_1_1_0_1()); }
		rulePropertyReference
		{ after(grammarAccess.getTypeRefAccess().getCardinalityPropertyReferenceParserRuleCall_1_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Type__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
		rulePrimitiveType
		{ after(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getObjectTypeParserRuleCall_1()); }
		ruleObjectType
		{ after(grammarAccess.getTypeAccess().getObjectTypeParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); }
		ruleEnumeration
		{ after(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getThingParserRuleCall_3()); }
		ruleThing
		{ after(grammarAccess.getTypeAccess().getThingParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getSubThingParserRuleCall_4()); }
		ruleSubThing
		{ after(grammarAccess.getTypeAccess().getSubThingParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getModelParserRuleCall_5()); }
		ruleModel
		{ after(grammarAccess.getTypeAccess().getModelParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getStrategyParserRuleCall_6()); }
		ruleStrategy
		{ after(grammarAccess.getTypeAccess().getStrategyParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getTypeAccess().getMultiAgentParserRuleCall_7()); }
		ruleMultiAgent
		{ after(grammarAccess.getTypeAccess().getMultiAgentParserRuleCall_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getGroup_5_0()); }
		(rule__Layer__Group_5_0__0)
		{ after(grammarAccess.getLayerAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getLayerAccess().getNumAssignment_5_1()); }
		(rule__Layer__NumAssignment_5_1)
		{ after(grammarAccess.getLayerAccess().getNumAssignment_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__AfAlternatives_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getAfReluKeyword_10_0_0()); }
		'relu'
		{ after(grammarAccess.getLayerAccess().getAfReluKeyword_10_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getLayerAccess().getAfSigmoidKeyword_10_0_1()); }
		'sigmoid'
		{ after(grammarAccess.getLayerAccess().getAfSigmoidKeyword_10_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getLayerAccess().getAfNoneKeyword_10_0_2()); }
		'None'
		{ after(grammarAccess.getLayerAccess().getAfNoneKeyword_10_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_0()); }
		(rule__Strategy__Group_3_0__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_1()); }
		(rule__Strategy__Group_3_1__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_1()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_2()); }
		(rule__Strategy__Group_3_2__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_2()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_3()); }
		(rule__Strategy__Group_3_3__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_3()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_4()); }
		(rule__Strategy__Group_3_4__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_4()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_5()); }
		(rule__Strategy__Group_3_5__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_5()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_6()); }
		(rule__Strategy__Group_3_6__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_6()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_7()); }
		(rule__Strategy__Group_3_7__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_7()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAccess().getGroup_3_8()); }
		(rule__Strategy__Group_3_8__0)
		{ after(grammarAccess.getStrategyAccess().getGroup_3_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getGroup_5_0()); }
		(rule__StrategyAssignment__Group_5_0__0)
		{ after(grammarAccess.getStrategyAssignmentAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getGroup_5_1()); }
		(rule__StrategyAssignment__Group_5_1__0)
		{ after(grammarAccess.getStrategyAssignmentAccess().getGroup_5_1()); }
	)
	|
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getGroup_5_2()); }
		(rule__StrategyAssignment__Group_5_2__0)
		{ after(grammarAccess.getStrategyAssignmentAccess().getGroup_5_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getMessagesAssignment_6_0()); }
		(rule__Thing__MessagesAssignment_6_0)
		{ after(grammarAccess.getThingAccess().getMessagesAssignment_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getPortsAssignment_6_1()); }
		(rule__Thing__PortsAssignment_6_1)
		{ after(grammarAccess.getThingAccess().getPortsAssignment_6_1()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getPropertiesAssignment_6_2()); }
		(rule__Thing__PropertiesAssignment_6_2)
		{ after(grammarAccess.getThingAccess().getPropertiesAssignment_6_2()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getCpropertiesAssignment_6_3()); }
		(rule__Thing__CpropertiesAssignment_6_3)
		{ after(grammarAccess.getThingAccess().getCpropertiesAssignment_6_3()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getFunctionsAssignment_6_4()); }
		(rule__Thing__FunctionsAssignment_6_4)
		{ after(grammarAccess.getThingAccess().getFunctionsAssignment_6_4()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getAssignAssignment_6_5()); }
		(rule__Thing__AssignAssignment_6_5)
		{ after(grammarAccess.getThingAccess().getAssignAssignment_6_5()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getStrategysAssignment_6_6()); }
		(rule__Thing__StrategysAssignment_6_6)
		{ after(grammarAccess.getThingAccess().getStrategysAssignment_6_6()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getSassignsAssignment_6_7()); }
		(rule__Thing__SassignsAssignment_6_7)
		{ after(grammarAccess.getThingAccess().getSassignsAssignment_6_7()); }
	)
	|
	(
		{ before(grammarAccess.getThingAccess().getMasAssignment_6_8()); }
		(rule__Thing__MasAssignment_6_8)
		{ after(grammarAccess.getThingAccess().getMasAssignment_6_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubThingAccess().getPropertiesAssignment_3_0()); }
		(rule__SubThing__PropertiesAssignment_3_0)
		{ after(grammarAccess.getSubThingAccess().getPropertiesAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubThingAccess().getFunctionsAssignment_3_1()); }
		(rule__SubThing__FunctionsAssignment_3_1)
		{ after(grammarAccess.getSubThingAccess().getFunctionsAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAccess().getTypeRefAssignment_3_0()); }
		(rule__Cproperty__TypeRefAssignment_3_0)
		{ after(grammarAccess.getCpropertyAccess().getTypeRefAssignment_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getCpropertyAccess().getTensorAssignment_3_1()); }
		(rule__Cproperty__TensorAssignment_3_1)
		{ after(grammarAccess.getCpropertyAccess().getTensorAssignment_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getGroup_0()); }
		(rule__Function__Group_0__0)
		{ after(grammarAccess.getFunctionAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getFunctionAccess().getAbstractFunctionParserRuleCall_1()); }
		ruleAbstractFunction
		{ after(grammarAccess.getFunctionAccess().getAbstractFunctionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getGroup_4_0()); }
		(rule__Property__Group_4_0__0)
		{ after(grammarAccess.getPropertyAccess().getGroup_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyAccess().getTensorAssignment_4_1()); }
		(rule__Property__TensorAssignment_4_1)
		{ after(grammarAccess.getPropertyAccess().getTensorAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Port__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_0()); }
		ruleRequiredPort
		{ after(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_1()); }
		ruleProvidedPort
		{ after(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPortAccess().getInternalPortParserRuleCall_2()); }
		ruleInternalPort
		{ after(grammarAccess.getPortAccess().getInternalPortParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Alternatives_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getGroup_6_0()); }
		(rule__RequiredPort__Group_6_0__0)
		{ after(grammarAccess.getRequiredPortAccess().getGroup_6_0()); }
	)
	|
	(
		{ before(grammarAccess.getRequiredPortAccess().getGroup_6_1()); }
		(rule__RequiredPort__Group_6_1__0)
		{ after(grammarAccess.getRequiredPortAccess().getGroup_6_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getGroup_5_0()); }
		(rule__ProvidedPort__Group_5_0__0)
		{ after(grammarAccess.getProvidedPortAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getProvidedPortAccess().getGroup_5_1()); }
		(rule__ProvidedPort__Group_5_1__0)
		{ after(grammarAccess.getProvidedPortAccess().getGroup_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getGroup_5_0()); }
		(rule__InternalPort__Group_5_0__0)
		{ after(grammarAccess.getInternalPortAccess().getGroup_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getInternalPortAccess().getGroup_5_1()); }
		(rule__InternalPort__Group_5_1__0)
		{ after(grammarAccess.getInternalPortAccess().getGroup_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getStateMachineParserRuleCall_0()); }
		ruleStateMachine
		{ after(grammarAccess.getStateAccess().getStateMachineParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1()); }
		ruleFinalState
		{ after(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_2()); }
		ruleCompositeState
		{ after(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getGroup_3()); }
		(rule__State__Group_3__0)
		{ after(grammarAccess.getStateAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Alternatives_3_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getPropertiesAssignment_3_5_2_0()); }
		(rule__State__PropertiesAssignment_3_5_2_0)
		{ after(grammarAccess.getStateAccess().getPropertiesAssignment_3_5_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getInternalAssignment_3_5_2_1()); }
		(rule__State__InternalAssignment_3_5_2_1)
		{ after(grammarAccess.getStateAccess().getInternalAssignment_3_5_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateAccess().getOutgoingAssignment_3_5_2_2()); }
		(rule__State__OutgoingAssignment_3_5_2_2)
		{ after(grammarAccess.getStateAccess().getOutgoingAssignment_3_5_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Handler__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHandlerAccess().getTransitionParserRuleCall_0()); }
		ruleTransition
		{ after(grammarAccess.getHandlerAccess().getTransitionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getHandlerAccess().getInternalTransitionParserRuleCall_1()); }
		ruleInternalTransition
		{ after(grammarAccess.getHandlerAccess().getInternalTransitionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Alternatives_9_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_9_2_0()); }
		(rule__CompositeState__PropertiesAssignment_9_2_0)
		{ after(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_9_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getCompositeStateAccess().getSubstateAssignment_9_2_1()); }
		(rule__CompositeState__SubstateAssignment_9_2_1)
		{ after(grammarAccess.getCompositeStateAccess().getSubstateAssignment_9_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getCompositeStateAccess().getInternalAssignment_9_2_2()); }
		(rule__CompositeState__InternalAssignment_9_2_2)
		{ after(grammarAccess.getCompositeStateAccess().getInternalAssignment_9_2_2()); }
	)
	|
	(
		{ before(grammarAccess.getCompositeStateAccess().getOutgoingAssignment_9_2_3()); }
		(rule__CompositeState__OutgoingAssignment_9_2_3)
		{ after(grammarAccess.getCompositeStateAccess().getOutgoingAssignment_9_2_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Alternatives_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getRegionAssignment_10_0()); }
		(rule__CompositeState__RegionAssignment_10_0)
		{ after(grammarAccess.getCompositeStateAccess().getRegionAssignment_10_0()); }
	)
	|
	(
		{ before(grammarAccess.getCompositeStateAccess().getSessionAssignment_10_1()); }
		(rule__CompositeState__SessionAssignment_10_1)
		{ after(grammarAccess.getCompositeStateAccess().getSessionAssignment_10_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Alternatives_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getPropertiesAssignment_8_2_0()); }
		(rule__StateMachine__PropertiesAssignment_8_2_0)
		{ after(grammarAccess.getStateMachineAccess().getPropertiesAssignment_8_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateMachineAccess().getSubstateAssignment_8_2_1()); }
		(rule__StateMachine__SubstateAssignment_8_2_1)
		{ after(grammarAccess.getStateMachineAccess().getSubstateAssignment_8_2_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateMachineAccess().getInternalAssignment_8_2_2()); }
		(rule__StateMachine__InternalAssignment_8_2_2)
		{ after(grammarAccess.getStateMachineAccess().getInternalAssignment_8_2_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Alternatives_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getRegionAssignment_9_0()); }
		(rule__StateMachine__RegionAssignment_9_0)
		{ after(grammarAccess.getStateMachineAccess().getRegionAssignment_9_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateMachineAccess().getSessionAssignment_9_1()); }
		(rule__StateMachine__SessionAssignment_9_1)
		{ after(grammarAccess.getStateMachineAccess().getSessionAssignment_9_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__MaxInstancesAlternatives_2_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getSessionAccess().getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getSessionAccess().getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1()); }
		rulePropertyReference
		{ after(grammarAccess.getSessionAccess().getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateContainerAccess().getCompositeStateParserRuleCall_0()); }
		ruleCompositeState
		{ after(grammarAccess.getStateContainerAccess().getCompositeStateParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getStateContainerAccess().getRegionParserRuleCall_1()); }
		ruleRegion
		{ after(grammarAccess.getStateContainerAccess().getRegionParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getStateContainerAccess().getSessionParserRuleCall_2()); }
		ruleSession
		{ after(grammarAccess.getStateContainerAccess().getSessionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getStateContainerAccess().getGroup_3()); }
		(rule__StateContainer__Group_3__0)
		{ after(grammarAccess.getStateContainerAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Action__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionAccess().getActionBlockParserRuleCall_0()); }
		ruleActionBlock
		{ after(grammarAccess.getActionAccess().getActionBlockParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getExternStatementParserRuleCall_1()); }
		ruleExternStatement
		{ after(grammarAccess.getActionAccess().getExternStatementParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getSendActionParserRuleCall_2()); }
		ruleSendAction
		{ after(grammarAccess.getActionAccess().getSendActionParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_3()); }
		ruleVariableAssignment
		{ after(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getIncrementParserRuleCall_4()); }
		ruleIncrement
		{ after(grammarAccess.getActionAccess().getIncrementParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getDecrementParserRuleCall_5()); }
		ruleDecrement
		{ after(grammarAccess.getActionAccess().getDecrementParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getLoopActionParserRuleCall_6()); }
		ruleLoopAction
		{ after(grammarAccess.getActionAccess().getLoopActionParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getForActionParserRuleCall_7()); }
		ruleForAction
		{ after(grammarAccess.getActionAccess().getForActionParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getPyforActionParserRuleCall_8()); }
		rulePyforAction
		{ after(grammarAccess.getActionAccess().getPyforActionParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getAppendParserRuleCall_9()); }
		ruleAppend
		{ after(grammarAccess.getActionAccess().getAppendParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getDictAssignmentParserRuleCall_10()); }
		ruleDictAssignment
		{ after(grammarAccess.getActionAccess().getDictAssignmentParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getConditionalActionParserRuleCall_11()); }
		ruleConditionalAction
		{ after(grammarAccess.getActionAccess().getConditionalActionParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getReturnActionParserRuleCall_12()); }
		ruleReturnAction
		{ after(grammarAccess.getActionAccess().getReturnActionParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getPrintActionParserRuleCall_13()); }
		rulePrintAction
		{ after(grammarAccess.getActionAccess().getPrintActionParserRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getErrorActionParserRuleCall_14()); }
		ruleErrorAction
		{ after(grammarAccess.getActionAccess().getErrorActionParserRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getStartSessionParserRuleCall_15()); }
		ruleStartSession
		{ after(grammarAccess.getActionAccess().getStartSessionParserRuleCall_15()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getFunctionCallStatementParserRuleCall_16()); }
		ruleFunctionCallStatement
		{ after(grammarAccess.getActionAccess().getFunctionCallStatementParserRuleCall_16()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getLocalVariableParserRuleCall_17()); }
		ruleLocalVariable
		{ after(grammarAccess.getActionAccess().getLocalVariableParserRuleCall_17()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getCpropertyAssignmentParserRuleCall_18()); }
		ruleCpropertyAssignment
		{ after(grammarAccess.getActionAccess().getCpropertyAssignmentParserRuleCall_18()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getStrategyStreamParserRuleCall_19()); }
		ruleStrategyStream
		{ after(grammarAccess.getActionAccess().getStrategyStreamParserRuleCall_19()); }
	)
	|
	(
		{ before(grammarAccess.getActionAccess().getZipEnumerateParserRuleCall_20()); }
		ruleZipEnumerate
		{ after(grammarAccess.getActionAccess().getZipEnumerateParserRuleCall_20()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getGroup_4_0()); }
		(rule__LocalVariable__Group_4_0__0)
		{ after(grammarAccess.getLocalVariableAccess().getGroup_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getLocalVariableAccess().getTensorAssignment_4_1()); }
		(rule__LocalVariable__TensorAssignment_4_1)
		{ after(grammarAccess.getLocalVariableAccess().getTensorAssignment_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__FnameAlternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getFnameZipKeyword_4_0_0()); }
		'zip'
		{ after(grammarAccess.getZipEnumerateAccess().getFnameZipKeyword_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getZipEnumerateAccess().getFnameEnumerateKeyword_4_0_1()); }
		'enumerate'
		{ after(grammarAccess.getZipEnumerateAccess().getFnameEnumerateKeyword_4_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintActionAccess().getPrintKeyword_0_0()); }
		'print'
		{ after(grammarAccess.getPrintActionAccess().getPrintKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrintActionAccess().getLineAssignment_0_1()); }
		(rule__PrintAction__LineAssignment_0_1)
		{ after(grammarAccess.getPrintActionAccess().getLineAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorActionAccess().getErrorKeyword_0_0()); }
		'error'
		{ after(grammarAccess.getErrorActionAccess().getErrorKeyword_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getErrorActionAccess().getLineAssignment_0_1()); }
		(rule__ErrorAction__LineAssignment_0_1)
		{ after(grammarAccess.getErrorActionAccess().getLineAssignment_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getGroup_1_0()); }
		(rule__Equality__Group_1_0__0)
		{ after(grammarAccess.getEqualityAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getEqualityAccess().getGroup_1_1()); }
		(rule__Equality__Group_1_1__0)
		{ after(grammarAccess.getEqualityAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparaisonAccess().getGroup_1_0()); }
		(rule__Comparaison__Group_1_0__0)
		{ after(grammarAccess.getComparaisonAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparaisonAccess().getGroup_1_1()); }
		(rule__Comparaison__Group_1_1__0)
		{ after(grammarAccess.getComparaisonAccess().getGroup_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getComparaisonAccess().getGroup_1_2()); }
		(rule__Comparaison__Group_1_2__0)
		{ after(grammarAccess.getComparaisonAccess().getGroup_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getComparaisonAccess().getGroup_1_3()); }
		(rule__Comparaison__Group_1_3__0)
		{ after(grammarAccess.getComparaisonAccess().getGroup_1_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getGroup_1_0()); }
		(rule__Addition__Group_1_0__0)
		{ after(grammarAccess.getAdditionAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAdditionAccess().getGroup_1_1()); }
		(rule__Addition__Group_1_1__0)
		{ after(grammarAccess.getAdditionAccess().getGroup_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); }
		(rule__Multiplication__Group_1_0__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup_1_1()); }
		(rule__Multiplication__Group_1_1__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getMultiplicationAccess().getGroup_1_2()); }
		(rule__Multiplication__Group_1_2__0)
		{ after(grammarAccess.getMultiplicationAccess().getGroup_1_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_0()); }
		(rule__Primary__Group_0__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
		(rule__Primary__Group_1__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_2()); }
		(rule__Primary__Group_2__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_2()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getArrayIndexPostfixParserRuleCall_3()); }
		ruleArrayIndexPostfix
		{ after(grammarAccess.getPrimaryAccess().getArrayIndexPostfixParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AtomicExpression__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getExternExpressionParserRuleCall_0()); }
		ruleExternExpression
		{ after(grammarAccess.getAtomicExpressionAccess().getExternExpressionParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_1()); }
		ruleLiteral
		{ after(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getArrayInitParserRuleCall_2()); }
		ruleArrayInit
		{ after(grammarAccess.getAtomicExpressionAccess().getArrayInitParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getPropertyReferenceParserRuleCall_3()); }
		rulePropertyReference
		{ after(grammarAccess.getAtomicExpressionAccess().getPropertyReferenceParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getFunctionCallExpressionParserRuleCall_4()); }
		ruleFunctionCallExpression
		{ after(grammarAccess.getAtomicExpressionAccess().getFunctionCallExpressionParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getEventReferenceParserRuleCall_5()); }
		ruleEventReference
		{ after(grammarAccess.getAtomicExpressionAccess().getEventReferenceParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicExpressionAccess().getCpropertyReferenceParserRuleCall_6()); }
		ruleCpropertyReference
		{ after(grammarAccess.getAtomicExpressionAccess().getCpropertyReferenceParserRuleCall_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Literal__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLiteralAccess().getEnumLiteralRefParserRuleCall_0()); }
		ruleEnumLiteralRef
		{ after(grammarAccess.getLiteralAccess().getEnumLiteralRefParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getByteLiteralParserRuleCall_1()); }
		ruleByteLiteral
		{ after(grammarAccess.getLiteralAccess().getByteLiteralParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); }
		ruleCharLiteral
		{ after(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_3()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4()); }
		ruleBooleanLiteral
		{ after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5()); }
		ruleStringLiteral
		{ after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_6()); }
		ruleDoubleLiteral
		{ after(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getBoolValueAssignment_0()); }
		(rule__BooleanLiteral__BoolValueAssignment_0)
		{ after(grammarAccess.getBooleanLiteralAccess().getBoolValueAssignment_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getGroup_1()); }
		(rule__BooleanLiteral__Group_1__0)
		{ after(grammarAccess.getBooleanLiteralAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getInstancesAssignment_4_0()); }
		(rule__Configuration__InstancesAssignment_4_0)
		{ after(grammarAccess.getConfigurationAccess().getInstancesAssignment_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationAccess().getConnectorsAssignment_4_1()); }
		(rule__Configuration__ConnectorsAssignment_4_1)
		{ after(grammarAccess.getConfigurationAccess().getConnectorsAssignment_4_1()); }
	)
	|
	(
		{ before(grammarAccess.getConfigurationAccess().getPropassignsAssignment_4_2()); }
		(rule__Configuration__PropassignsAssignment_4_2)
		{ after(grammarAccess.getConfigurationAccess().getPropassignsAssignment_4_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractConnector__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractConnectorAccess().getConnectorParserRuleCall_0()); }
		ruleConnector
		{ after(grammarAccess.getAbstractConnectorAccess().getConnectorParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractConnectorAccess().getExternalConnectorParserRuleCall_1()); }
		ruleExternalConnector
		{ after(grammarAccess.getAbstractConnectorAccess().getExternalConnectorParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AiotMLModel__Group__0__Impl
	rule__AiotMLModel__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAiotMLModelAccess().getImportsAssignment_0()); }
	(rule__AiotMLModel__ImportsAssignment_0)*
	{ after(grammarAccess.getAiotMLModelAccess().getImportsAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AiotMLModel__Group__1__Impl
	rule__AiotMLModel__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAiotMLModelAccess().getTemplatesAssignment_1()); }
	(rule__AiotMLModel__TemplatesAssignment_1)*
	{ after(grammarAccess.getAiotMLModelAccess().getTemplatesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AiotMLModel__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAiotMLModelAccess().getAlternatives_2()); }
	(rule__AiotMLModel__Alternatives_2)*
	{ after(grammarAccess.getAiotMLModelAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Template__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Template__Group__0__Impl
	rule__Template__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); }
	'template'
	{ after(grammarAccess.getTemplateAccess().getTemplateKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Template__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTemplateAccess().getPathAssignment_1()); }
	(rule__Template__PathAssignment_1)
	{ after(grammarAccess.getTemplateAccess().getPathAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
	rule__Import__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
	(rule__Import__ImportURIAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportURIAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getGroup_2()); }
	(rule__Import__Group_2__0)?
	{ after(grammarAccess.getImportAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group_2__0__Impl
	rule__Import__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getFromKeyword_2_0()); }
	'from'
	{ after(grammarAccess.getImportAccess().getFromKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getFromAssignment_2_1()); }
	(rule__Import__FromAssignment_2_1)
	{ after(grammarAccess.getImportAccess().getFromAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlatformAnnotation__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlatformAnnotation__Group__0__Impl
	rule__PlatformAnnotation__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); }
	(rule__PlatformAnnotation__NameAssignment_0)
	{ after(grammarAccess.getPlatformAnnotationAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlatformAnnotation__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlatformAnnotationAccess().getAlternatives_1()); }
	(rule__PlatformAnnotation__Alternatives_1)?
	{ after(grammarAccess.getPlatformAnnotationAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Variable__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group_0__0__Impl
	rule__Variable__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getVarKeyword_0_0()); }
	'var'
	{ after(grammarAccess.getVariableAccess().getVarKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group_0__1__Impl
	rule__Variable__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getNameAssignment_0_1()); }
	(rule__Variable__NameAssignment_0_1)
	{ after(grammarAccess.getVariableAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group_0__2__Impl
	rule__Variable__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getColonKeyword_0_2()); }
	':'
	{ after(grammarAccess.getVariableAccess().getColonKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getTypeRefAssignment_0_3()); }
	(rule__Variable__TypeRefAssignment_0_3)
	{ after(grammarAccess.getVariableAccess().getTypeRefAssignment_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group__0__Impl
	rule__TypeRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getTypeAssignment_0()); }
	(rule__TypeRef__TypeAssignment_0)
	{ after(grammarAccess.getTypeRefAccess().getTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getGroup_1()); }
	(rule__TypeRef__Group_1__0)?
	{ after(grammarAccess.getTypeRefAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeRef__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group_1__0__Impl
	rule__TypeRef__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getIsArrayAssignment_1_0()); }
	(rule__TypeRef__IsArrayAssignment_1_0)
	{ after(grammarAccess.getTypeRefAccess().getIsArrayAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group_1__1__Impl
	rule__TypeRef__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getCardinalityAssignment_1_1()); }
	(rule__TypeRef__CardinalityAssignment_1_1)?
	{ after(grammarAccess.getTypeRefAccess().getCardinalityAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeRef__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrimitiveType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__0__Impl
	rule__PrimitiveType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_0()); }
	'datatype'
	{ after(grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__1__Impl
	rule__PrimitiveType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); }
	(rule__PrimitiveType__NameAssignment_1)
	{ after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__2__Impl
	rule__PrimitiveType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getLessThanSignKeyword_2()); }
	('<')
	{ after(grammarAccess.getPrimitiveTypeAccess().getLessThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__3__Impl
	rule__PrimitiveType__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getByteSizeAssignment_3()); }
	(rule__PrimitiveType__ByteSizeAssignment_3)
	{ after(grammarAccess.getPrimitiveTypeAccess().getByteSizeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__4__Impl
	rule__PrimitiveType__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getGreaterThanSignKeyword_4()); }
	'>'
	{ after(grammarAccess.getPrimitiveTypeAccess().getGreaterThanSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__5__Impl
	rule__PrimitiveType__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getAnnotationsAssignment_5()); }
	(rule__PrimitiveType__AnnotationsAssignment_5)*
	{ after(grammarAccess.getPrimitiveTypeAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrimitiveType__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6()); }
	(';')?
	{ after(grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ObjectType__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectType__Group__0__Impl
	rule__ObjectType__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); }
	'object'
	{ after(grammarAccess.getObjectTypeAccess().getObjectKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectType__Group__1__Impl
	rule__ObjectType__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); }
	(rule__ObjectType__NameAssignment_1)
	{ after(grammarAccess.getObjectTypeAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectType__Group__2__Impl
	rule__ObjectType__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectTypeAccess().getAnnotationsAssignment_2()); }
	(rule__ObjectType__AnnotationsAssignment_2)*
	{ after(grammarAccess.getObjectTypeAccess().getAnnotationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ObjectType__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__0__Impl
	rule__Enumeration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); }
	'enumeration'
	{ after(grammarAccess.getEnumerationAccess().getEnumerationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__1__Impl
	rule__Enumeration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getNameAssignment_1()); }
	(rule__Enumeration__NameAssignment_1)
	{ after(grammarAccess.getEnumerationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__2__Impl
	rule__Enumeration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getGroup_2()); }
	(rule__Enumeration__Group_2__0)?
	{ after(grammarAccess.getEnumerationAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__3__Impl
	rule__Enumeration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getAnnotationsAssignment_3()); }
	(rule__Enumeration__AnnotationsAssignment_3)*
	{ after(grammarAccess.getEnumerationAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__4__Impl
	rule__Enumeration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__5__Impl
	rule__Enumeration__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getLiteralsAssignment_5()); }
	(rule__Enumeration__LiteralsAssignment_5)*
	{ after(grammarAccess.getEnumerationAccess().getLiteralsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Enumeration__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group_2__0__Impl
	rule__Enumeration__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getAsKeyword_2_0()); }
	('as')
	{ after(grammarAccess.getEnumerationAccess().getAsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Enumeration__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationAccess().getTypeRefAssignment_2_1()); }
	(rule__Enumeration__TypeRefAssignment_2_1)
	{ after(grammarAccess.getEnumerationAccess().getTypeRefAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group__0__Impl
	rule__EnumerationLiteral__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
	(rule__EnumerationLiteral__NameAssignment_0)
	{ after(grammarAccess.getEnumerationLiteralAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group__1__Impl
	rule__EnumerationLiteral__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); }
	(rule__EnumerationLiteral__Group_1__0)?
	{ after(grammarAccess.getEnumerationLiteralAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getAnnotationsAssignment_2()); }
	(rule__EnumerationLiteral__AnnotationsAssignment_2)*
	{ after(grammarAccess.getEnumerationLiteralAccess().getAnnotationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumerationLiteral__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group_1__0__Impl
	rule__EnumerationLiteral__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); }
	'='
	{ after(grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumerationLiteral__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumerationLiteralAccess().getInitAssignment_1_1()); }
	(rule__EnumerationLiteral__InitAssignment_1_1)
	{ after(grammarAccess.getEnumerationLiteralAccess().getInitAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tensor__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__0__Impl
	rule__Tensor__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getTensorKeyword_0()); }
	'tensor'
	{ after(grammarAccess.getTensorAccess().getTensorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__1__Impl
	rule__Tensor__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getTensorAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__2__Impl
	rule__Tensor__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getDimKeyword_2()); }
	'dim'
	{ after(grammarAccess.getTensorAccess().getDimKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__3__Impl
	rule__Tensor__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getTensorAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__4__Impl
	rule__Tensor__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getTensorAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__5__Impl
	rule__Tensor__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getDimsAssignment_5()); }
	(rule__Tensor__DimsAssignment_5)
	{ after(grammarAccess.getTensorAccess().getDimsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__6__Impl
	rule__Tensor__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getGroup_6()); }
	(rule__Tensor__Group_6__0)*
	{ after(grammarAccess.getTensorAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__7__Impl
	rule__Tensor__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getRightParenthesisKeyword_7()); }
	')'
	{ after(grammarAccess.getTensorAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__8__Impl
	rule__Tensor__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getGroup_8()); }
	(rule__Tensor__Group_8__0)?
	{ after(grammarAccess.getTensorAccess().getGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getRightParenthesisKeyword_9()); }
	')'
	{ after(grammarAccess.getTensorAccess().getRightParenthesisKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tensor__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group_6__0__Impl
	rule__Tensor__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getCommaKeyword_6_0()); }
	','
	{ after(grammarAccess.getTensorAccess().getCommaKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getDimsAssignment_6_1()); }
	(rule__Tensor__DimsAssignment_6_1)
	{ after(grammarAccess.getTensorAccess().getDimsAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Tensor__Group_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group_8__0__Impl
	rule__Tensor__Group_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getCommaKeyword_8_0()); }
	','
	{ after(grammarAccess.getTensorAccess().getCommaKeyword_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Tensor__Group_8__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__Group_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTensorAccess().getDatatypeAssignment_8_1()); }
	(rule__Tensor__DatatypeAssignment_8_1)
	{ after(grammarAccess.getTensorAccess().getDatatypeAssignment_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Layer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__0__Impl
	rule__Layer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getFully_connectedKeyword_0()); }
	'fully_connected'
	{ after(grammarAccess.getLayerAccess().getFully_connectedKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__1__Impl
	rule__Layer__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getLayerAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__2__Impl
	rule__Layer__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getDimKeyword_2()); }
	'dim'
	{ after(grammarAccess.getLayerAccess().getDimKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__3__Impl
	rule__Layer__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getLayerAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__4__Impl
	rule__Layer__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getLeftParenthesisKeyword_4()); }
	'('
	{ after(grammarAccess.getLayerAccess().getLeftParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__5__Impl
	rule__Layer__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getAlternatives_5()); }
	(rule__Layer__Alternatives_5)
	{ after(grammarAccess.getLayerAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__6__Impl
	rule__Layer__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getLayerAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__7__Impl
	rule__Layer__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getCommaKeyword_7()); }
	','
	{ after(grammarAccess.getLayerAccess().getCommaKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__8__Impl
	rule__Layer__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getAfKeyword_8()); }
	'af'
	{ after(grammarAccess.getLayerAccess().getAfKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__9__Impl
	rule__Layer__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getEqualsSignKeyword_9()); }
	'='
	{ after(grammarAccess.getLayerAccess().getEqualsSignKeyword_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getAfAssignment_10()); }
	(rule__Layer__AfAssignment_10)
	{ after(grammarAccess.getLayerAccess().getAfAssignment_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Layer__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group_5_0__0__Impl
	rule__Layer__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getLayernumsAssignment_5_0_0()); }
	(rule__Layer__LayernumsAssignment_5_0_0)
	{ after(grammarAccess.getLayerAccess().getLayernumsAssignment_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group_5_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getGroup_5_0_1()); }
	(rule__Layer__Group_5_0_1__0)*
	{ after(grammarAccess.getLayerAccess().getGroup_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Layer__Group_5_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group_5_0_1__0__Impl
	rule__Layer__Group_5_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getCommaKeyword_5_0_1_0()); }
	','
	{ after(grammarAccess.getLayerAccess().getCommaKeyword_5_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Layer__Group_5_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__Group_5_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLayerAccess().getLayernumsAssignment_5_0_1_1()); }
	(rule__Layer__LayernumsAssignment_5_0_1_1)
	{ after(grammarAccess.getLayerAccess().getLayernumsAssignment_5_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__0__Impl
	rule__Model__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getMlpKeyword_0()); }
	'mlp'
	{ after(grammarAccess.getModelAccess().getMlpKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__1__Impl
	rule__Model__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getNameAssignment_1()); }
	(rule__Model__NameAssignment_1)
	{ after(grammarAccess.getModelAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__2__Impl
	rule__Model__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__3__Impl
	rule__Model__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getInputKeyword_3()); }
	'input'
	{ after(grammarAccess.getModelAccess().getInputKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__4__Impl
	rule__Model__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getGroup_4()); }
	(rule__Model__Group_4__0)*
	{ after(grammarAccess.getModelAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__0__Impl
	rule__Model__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0()); }
	'->>'
	{ after(grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Model__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelAccess().getLayersAssignment_4_1()); }
	(rule__Model__LayersAssignment_4_1)
	{ after(grammarAccess.getModelAccess().getLayersAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModelReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelReference__Group__0__Impl
	rule__ModelReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelReferenceAccess().getUsingKeyword_0()); }
	'using'
	{ after(grammarAccess.getModelReferenceAccess().getUsingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelReference__Group__1__Impl
	rule__ModelReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelReferenceAccess().getMlpKeyword_1()); }
	'mlp'
	{ after(grammarAccess.getModelReferenceAccess().getMlpKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelReference__Group__2__Impl
	rule__ModelReference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelReferenceAccess().getNameAssignment_2()); }
	(rule__ModelReference__NameAssignment_2)
	{ after(grammarAccess.getModelReferenceAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelReference__Group__3__Impl
	rule__ModelReference__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelReferenceAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getModelReferenceAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModelReference__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModelReferenceAccess().getTypeRefAssignment_4()); }
	(rule__ModelReference__TypeRefAssignment_4)
	{ after(grammarAccess.getModelReferenceAccess().getTypeRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__0__Impl
	rule__Strategy__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getModelKeyword_0()); }
	'model'
	{ after(grammarAccess.getStrategyAccess().getModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__1__Impl
	rule__Strategy__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getNameAssignment_1()); }
	(rule__Strategy__NameAssignment_1)
	{ after(grammarAccess.getStrategyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__2__Impl
	rule__Strategy__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__3__Impl
	rule__Strategy__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getAlternatives_3()); }
	(rule__Strategy__Alternatives_3)*
	{ after(grammarAccess.getStrategyAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__4__Impl
	rule__Strategy__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getAnnotationsAssignment_5()); }
	(rule__Strategy__AnnotationsAssignment_5)*
	{ after(grammarAccess.getStrategyAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_0__0__Impl
	rule__Strategy__Group_3_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getInputKeyword_3_0_0()); }
	'input'
	{ after(grammarAccess.getStrategyAccess().getInputKeyword_3_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_0__1__Impl
	rule__Strategy__Group_3_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_0_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getTensorAssignment_3_0_2()); }
	(rule__Strategy__TensorAssignment_3_0_2)
	{ after(grammarAccess.getStrategyAccess().getTensorAssignment_3_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_1__0__Impl
	rule__Strategy__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getOutputKeyword_3_1_0()); }
	'output'
	{ after(grammarAccess.getStrategyAccess().getOutputKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_1__1__Impl
	rule__Strategy__Group_3_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_1_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getTensorAssignment_3_1_2()); }
	(rule__Strategy__TensorAssignment_3_1_2)
	{ after(grammarAccess.getStrategyAccess().getTensorAssignment_3_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_2__0__Impl
	rule__Strategy__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()); }
	'device'
	{ after(grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_2__1__Impl
	rule__Strategy__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_2__2__Impl
	rule__Strategy__Group_3_2__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()); }
	'{'
	{ after(grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_2__3__Impl
	rule__Strategy__Group_3_2__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDevicesAssignment_3_2_3()); }
	(rule__Strategy__DevicesAssignment_3_2_3)*
	{ after(grammarAccess.getStrategyAccess().getDevicesAssignment_3_2_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_2__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_2__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()); }
	'}'
	{ after(grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_3__0__Impl
	rule__Strategy__Group_3_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRewardKeyword_3_3_0()); }
	'reward'
	{ after(grammarAccess.getStrategyAccess().getRewardKeyword_3_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_3__1__Impl
	rule__Strategy__Group_3_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_3_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getTensorAssignment_3_3_2()); }
	(rule__Strategy__TensorAssignment_3_3_2)
	{ after(grammarAccess.getStrategyAccess().getTensorAssignment_3_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__0__Impl
	rule__Strategy__Group_3_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()); }
	'rewards'
	{ after(grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__1__Impl
	rule__Strategy__Group_3_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__2__Impl
	rule__Strategy__Group_3_4__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()); }
	'dim'
	{ after(grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__3__Impl
	rule__Strategy__Group_3_4__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()); }
	'='
	{ after(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__4__Impl
	rule__Strategy__Group_3_4__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()); }
	'('
	{ after(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__5__Impl
	rule__Strategy__Group_3_4__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getGroup_3_4_5()); }
	(rule__Strategy__Group_3_4_5__0)?
	{ after(grammarAccess.getStrategyAccess().getGroup_3_4_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()); }
	')'
	{ after(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_4_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4_5__0__Impl
	rule__Strategy__Group_3_4_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRewdimsAssignment_3_4_5_0()); }
	(rule__Strategy__RewdimsAssignment_3_4_5_0)
	{ after(grammarAccess.getStrategyAccess().getRewdimsAssignment_3_4_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getGroup_3_4_5_1()); }
	(rule__Strategy__Group_3_4_5_1__0)*
	{ after(grammarAccess.getStrategyAccess().getGroup_3_4_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_4_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4_5_1__0__Impl
	rule__Strategy__Group_3_4_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getCommaKeyword_3_4_5_1_0()); }
	','
	{ after(grammarAccess.getStrategyAccess().getCommaKeyword_3_4_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_4_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_4_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRewdimsAssignment_3_4_5_1_1()); }
	(rule__Strategy__RewdimsAssignment_3_4_5_1_1)
	{ after(grammarAccess.getStrategyAccess().getRewdimsAssignment_3_4_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__0__Impl
	rule__Strategy__Group_3_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()); }
	'observation'
	{ after(grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__1__Impl
	rule__Strategy__Group_3_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__2__Impl
	rule__Strategy__Group_3_5__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()); }
	'dim'
	{ after(grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__3__Impl
	rule__Strategy__Group_3_5__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()); }
	'='
	{ after(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__4__Impl
	rule__Strategy__Group_3_5__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()); }
	'('
	{ after(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__5__Impl
	rule__Strategy__Group_3_5__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getGroup_3_5_5()); }
	(rule__Strategy__Group_3_5_5__0)?
	{ after(grammarAccess.getStrategyAccess().getGroup_3_5_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()); }
	')'
	{ after(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_5_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5_5__0__Impl
	rule__Strategy__Group_3_5_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getObsdimsAssignment_3_5_5_0()); }
	(rule__Strategy__ObsdimsAssignment_3_5_5_0)
	{ after(grammarAccess.getStrategyAccess().getObsdimsAssignment_3_5_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getGroup_3_5_5_1()); }
	(rule__Strategy__Group_3_5_5_1__0)*
	{ after(grammarAccess.getStrategyAccess().getGroup_3_5_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_5_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5_5_1__0__Impl
	rule__Strategy__Group_3_5_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getCommaKeyword_3_5_5_1_0()); }
	','
	{ after(grammarAccess.getStrategyAccess().getCommaKeyword_3_5_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_5_5_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_5_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getObsdimsAssignment_3_5_5_1_1()); }
	(rule__Strategy__ObsdimsAssignment_3_5_5_1_1)
	{ after(grammarAccess.getStrategyAccess().getObsdimsAssignment_3_5_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__0__Impl
	rule__Strategy__Group_3_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getAction_spaceKeyword_3_6_0()); }
	'action_space'
	{ after(grammarAccess.getStrategyAccess().getAction_spaceKeyword_3_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__1__Impl
	rule__Strategy__Group_3_6__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_6_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__2__Impl
	rule__Strategy__Group_3_6__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDiscreteKeyword_3_6_2()); }
	'Discrete'
	{ after(grammarAccess.getStrategyAccess().getDiscreteKeyword_3_6_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__3__Impl
	rule__Strategy__Group_3_6__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_6_3()); }
	'('
	{ after(grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_6_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__4__Impl
	rule__Strategy__Group_3_6__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getDimKeyword_3_6_4()); }
	'dim'
	{ after(grammarAccess.getStrategyAccess().getDimKeyword_3_6_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__5__Impl
	rule__Strategy__Group_3_6__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_6_5()); }
	'='
	{ after(grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_6_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__6__Impl
	rule__Strategy__Group_3_6__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getActiondimsAssignment_3_6_6()); }
	(rule__Strategy__ActiondimsAssignment_3_6_6)
	{ after(grammarAccess.getStrategyAccess().getActiondimsAssignment_3_6_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__7__Impl
	rule__Strategy__Group_3_6__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getGroup_3_6_7()); }
	(rule__Strategy__Group_3_6_7__0)*
	{ after(grammarAccess.getStrategyAccess().getGroup_3_6_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_6_8()); }
	')'
	{ after(grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_6_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_6_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6_7__0__Impl
	rule__Strategy__Group_3_6_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getCommaKeyword_3_6_7_0()); }
	','
	{ after(grammarAccess.getStrategyAccess().getCommaKeyword_3_6_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_6_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_6_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getActiondimsAssignment_3_6_7_1()); }
	(rule__Strategy__ActiondimsAssignment_3_6_7_1)
	{ after(grammarAccess.getStrategyAccess().getActiondimsAssignment_3_6_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_7__0__Impl
	rule__Strategy__Group_3_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getP_functionKeyword_3_7_0()); }
	'p_function'
	{ after(grammarAccess.getStrategyAccess().getP_functionKeyword_3_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_7__1__Impl
	rule__Strategy__Group_3_7__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_7_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_7__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_7__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_7__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getPmodelAssignment_3_7_2()); }
	(rule__Strategy__PmodelAssignment_3_7_2)
	{ after(grammarAccess.getStrategyAccess().getPmodelAssignment_3_7_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Strategy__Group_3_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_8__0__Impl
	rule__Strategy__Group_3_8__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_8__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getQ_functionKeyword_3_8_0()); }
	'q_function'
	{ after(grammarAccess.getStrategyAccess().getQ_functionKeyword_3_8_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_8__1__Impl
	rule__Strategy__Group_3_8__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_8__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getColonKeyword_3_8_1()); }
	':'
	{ after(grammarAccess.getStrategyAccess().getColonKeyword_3_8_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Strategy__Group_3_8__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__Group_3_8__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAccess().getQmodelAssignment_3_8_2()); }
	(rule__Strategy__QmodelAssignment_3_8_2)
	{ after(grammarAccess.getStrategyAccess().getQmodelAssignment_3_8_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiAgent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__0__Impl
	rule__MultiAgent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getStrategyKeyword_0()); }
	'strategy'
	{ after(grammarAccess.getMultiAgentAccess().getStrategyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__1__Impl
	rule__MultiAgent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getNameAssignment_1()); }
	(rule__MultiAgent__NameAssignment_1)
	{ after(grammarAccess.getMultiAgentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__2__Impl
	rule__MultiAgent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getMultiAgentAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__3__Impl
	rule__MultiAgent__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getAgentsAssignment_3()); }
	(rule__MultiAgent__AgentsAssignment_3)*
	{ after(grammarAccess.getMultiAgentAccess().getAgentsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__4__Impl
	rule__MultiAgent__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getMultiAgentAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgent__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentAccess().getAnnotationsAssignment_5()); }
	(rule__MultiAgent__AnnotationsAssignment_5)*
	{ after(grammarAccess.getMultiAgentAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MultiAgentProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgentProperty__Group__0__Impl
	rule__MultiAgentProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentPropertyAccess().getUsingKeyword_0()); }
	'using'
	{ after(grammarAccess.getMultiAgentPropertyAccess().getUsingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgentProperty__Group__1__Impl
	rule__MultiAgentProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentPropertyAccess().getStrategyKeyword_1()); }
	'strategy'
	{ after(grammarAccess.getMultiAgentPropertyAccess().getStrategyKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgentProperty__Group__2__Impl
	rule__MultiAgentProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentPropertyAccess().getNameAssignment_2()); }
	(rule__MultiAgentProperty__NameAssignment_2)
	{ after(grammarAccess.getMultiAgentPropertyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgentProperty__Group__3__Impl
	rule__MultiAgentProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentPropertyAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getMultiAgentPropertyAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MultiAgentProperty__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiAgentPropertyAccess().getTypeRefAssignment_4()); }
	(rule__MultiAgentProperty__TypeRefAssignment_4)
	{ after(grammarAccess.getMultiAgentPropertyAccess().getTypeRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyProperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyProperty__Group__0__Impl
	rule__StrategyProperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyPropertyAccess().getUsingKeyword_0()); }
	'using'
	{ after(grammarAccess.getStrategyPropertyAccess().getUsingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyProperty__Group__1__Impl
	rule__StrategyProperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyPropertyAccess().getModelKeyword_1()); }
	'model'
	{ after(grammarAccess.getStrategyPropertyAccess().getModelKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyProperty__Group__2__Impl
	rule__StrategyProperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyPropertyAccess().getNameAssignment_2()); }
	(rule__StrategyProperty__NameAssignment_2)
	{ after(grammarAccess.getStrategyPropertyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyProperty__Group__3__Impl
	rule__StrategyProperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyPropertyAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getStrategyPropertyAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyProperty__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyPropertyAccess().getTypeRefAssignment_4()); }
	(rule__StrategyProperty__TypeRefAssignment_4)
	{ after(grammarAccess.getStrategyPropertyAccess().getTypeRefAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__0__Impl
	rule__StrategyAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getBindKeyword_0()); }
	'bind'
	{ after(grammarAccess.getStrategyAssignmentAccess().getBindKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__1__Impl
	rule__StrategyAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getStrategyAssignment_1()); }
	(rule__StrategyAssignment__StrategyAssignment_1)
	{ after(grammarAccess.getStrategyAssignmentAccess().getStrategyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__2__Impl
	rule__StrategyAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__3__Impl
	rule__StrategyAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getAgentAssignment_3()); }
	(rule__StrategyAssignment__AgentAssignment_3)
	{ after(grammarAccess.getStrategyAssignmentAccess().getAgentAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__4__Impl
	rule__StrategyAssignment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_4()); }
	'.'
	{ after(grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getAlternatives_5()); }
	(rule__StrategyAssignment__Alternatives_5)
	{ after(grammarAccess.getStrategyAssignmentAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyAssignment__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_0__0__Impl
	rule__StrategyAssignment__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getRewardKeyword_5_0_0()); }
	'reward'
	{ after(grammarAccess.getStrategyAssignmentAccess().getRewardKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_0__1__Impl
	rule__StrategyAssignment__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_0_1()); }
	'='
	{ after(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionAssignment_5_0_2()); }
	(rule__StrategyAssignment__RbindFunctionAssignment_5_0_2)
	{ after(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionAssignment_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyAssignment__Group_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_1__0__Impl
	rule__StrategyAssignment__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getInputKeyword_5_1_0()); }
	'input'
	{ after(grammarAccess.getStrategyAssignmentAccess().getInputKeyword_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_1__1__Impl
	rule__StrategyAssignment__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_1_1()); }
	'='
	{ after(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionAssignment_5_1_2()); }
	(rule__StrategyAssignment__IbindFunctionAssignment_5_1_2)
	{ after(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionAssignment_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyAssignment__Group_5_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_2__0__Impl
	rule__StrategyAssignment__Group_5_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getOutputKeyword_5_2_0()); }
	'output'
	{ after(grammarAccess.getStrategyAssignmentAccess().getOutputKeyword_5_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_2__1__Impl
	rule__StrategyAssignment__Group_5_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_2_1()); }
	'='
	{ after(grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyAssignment__Group_5_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__Group_5_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyAssignmentAccess().getObindFunctionAssignment_5_2_2()); }
	(rule__StrategyAssignment__ObindFunctionAssignment_5_2_2)
	{ after(grammarAccess.getStrategyAssignmentAccess().getObindFunctionAssignment_5_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Thing__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__0__Impl
	rule__Thing__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getThingKeyword_0()); }
	'thing'
	{ after(grammarAccess.getThingAccess().getThingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__1__Impl
	rule__Thing__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getFragmentAssignment_1()); }
	(rule__Thing__FragmentAssignment_1)?
	{ after(grammarAccess.getThingAccess().getFragmentAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__2__Impl
	rule__Thing__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getNameAssignment_2()); }
	(rule__Thing__NameAssignment_2)
	{ after(grammarAccess.getThingAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__3__Impl
	rule__Thing__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getGroup_3()); }
	(rule__Thing__Group_3__0)?
	{ after(grammarAccess.getThingAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__4__Impl
	rule__Thing__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getAnnotationsAssignment_4()); }
	(rule__Thing__AnnotationsAssignment_4)*
	{ after(grammarAccess.getThingAccess().getAnnotationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__5__Impl
	rule__Thing__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__6__Impl
	rule__Thing__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getAlternatives_6()); }
	(rule__Thing__Alternatives_6)*
	{ after(grammarAccess.getThingAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__7__Impl
	rule__Thing__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getBehaviourAssignment_7()); }
	(rule__Thing__BehaviourAssignment_7)?
	{ after(grammarAccess.getThingAccess().getBehaviourAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getThingAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Thing__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group_3__0__Impl
	rule__Thing__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getIncludesKeyword_3_0()); }
	'includes'
	{ after(grammarAccess.getThingAccess().getIncludesKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group_3__1__Impl
	rule__Thing__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getIncludesAssignment_3_1()); }
	(rule__Thing__IncludesAssignment_3_1)
	{ after(grammarAccess.getThingAccess().getIncludesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getGroup_3_2()); }
	(rule__Thing__Group_3_2__0)*
	{ after(grammarAccess.getThingAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Thing__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group_3_2__0__Impl
	rule__Thing__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getCommaKeyword_3_2_0()); }
	','
	{ after(grammarAccess.getThingAccess().getCommaKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Thing__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getThingAccess().getIncludesAssignment_3_2_1()); }
	(rule__Thing__IncludesAssignment_3_2_1)
	{ after(grammarAccess.getThingAccess().getIncludesAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SubThing__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubThing__Group__0__Impl
	rule__SubThing__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubThingAccess().getSubthingKeyword_0()); }
	'subthing'
	{ after(grammarAccess.getSubThingAccess().getSubthingKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubThing__Group__1__Impl
	rule__SubThing__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubThingAccess().getNameAssignment_1()); }
	(rule__SubThing__NameAssignment_1)
	{ after(grammarAccess.getSubThingAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubThing__Group__2__Impl
	rule__SubThing__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubThingAccess().getLeftCurlyBracketKeyword_2()); }
	'{'
	{ after(grammarAccess.getSubThingAccess().getLeftCurlyBracketKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubThing__Group__3__Impl
	rule__SubThing__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubThingAccess().getAlternatives_3()); }
	(rule__SubThing__Alternatives_3)*
	{ after(grammarAccess.getSubThingAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SubThing__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSubThingAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getSubThingAccess().getRightCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Agent__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__0__Impl
	rule__Agent__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getAgentKeyword_0()); }
	'agent'
	{ after(grammarAccess.getAgentAccess().getAgentKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__1__Impl
	rule__Agent__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getNameAssignment_1()); }
	(rule__Agent__NameAssignment_1)
	{ after(grammarAccess.getAgentAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__2__Impl
	rule__Agent__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getGroup_2()); }
	(rule__Agent__Group_2__0)?
	{ after(grammarAccess.getAgentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getAmodelAssignment_3()); }
	(rule__Agent__AmodelAssignment_3)
	{ after(grammarAccess.getAgentAccess().getAmodelAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Agent__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group_2__0__Impl
	rule__Agent__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getLeftSquareBracketKeyword_2_0()); }
	'['
	{ after(grammarAccess.getAgentAccess().getLeftSquareBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group_2__1__Impl
	rule__Agent__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getCardinalityAssignment_2_1()); }
	(rule__Agent__CardinalityAssignment_2_1)?
	{ after(grammarAccess.getAgentAccess().getCardinalityAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Agent__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAgentAccess().getRightSquareBracketKeyword_2_2()); }
	']'
	{ after(grammarAccess.getAgentAccess().getRightSquareBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cproperty__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cproperty__Group__0__Impl
	rule__Cproperty__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAccess().getCpropertyKeyword_0()); }
	'cproperty'
	{ after(grammarAccess.getCpropertyAccess().getCpropertyKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cproperty__Group__1__Impl
	rule__Cproperty__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAccess().getNameAssignment_1()); }
	(rule__Cproperty__NameAssignment_1)
	{ after(grammarAccess.getCpropertyAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cproperty__Group__2__Impl
	rule__Cproperty__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getCpropertyAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cproperty__Group__3__Impl
	rule__Cproperty__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAccess().getAlternatives_3()); }
	(rule__Cproperty__Alternatives_3)
	{ after(grammarAccess.getCpropertyAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cproperty__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAccess().getAnnotationsAssignment_4()); }
	(rule__Cproperty__AnnotationsAssignment_4)*
	{ after(grammarAccess.getCpropertyAccess().getAnnotationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyAssign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__0__Impl
	rule__PropertyAssign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getSetKeyword_0()); }
	'set'
	{ after(grammarAccess.getPropertyAssignAccess().getSetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__1__Impl
	rule__PropertyAssign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getPropertyAssignment_1()); }
	(rule__PropertyAssign__PropertyAssignment_1)
	{ after(grammarAccess.getPropertyAssignAccess().getPropertyAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__2__Impl
	rule__PropertyAssign__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getGroup_2()); }
	(rule__PropertyAssign__Group_2__0)?
	{ after(grammarAccess.getPropertyAssignAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__3__Impl
	rule__PropertyAssign__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getPropertyAssignAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__4__Impl
	rule__PropertyAssign__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getInitAssignment_4()); }
	(rule__PropertyAssign__InitAssignment_4)
	{ after(grammarAccess.getPropertyAssignAccess().getInitAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getAnnotationsAssignment_5()); }
	(rule__PropertyAssign__AnnotationsAssignment_5)*
	{ after(grammarAccess.getPropertyAssignAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PropertyAssign__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group_2__0__Impl
	rule__PropertyAssign__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getLeftSquareBracketKeyword_2_0()); }
	('[')
	{ after(grammarAccess.getPropertyAssignAccess().getLeftSquareBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group_2__1__Impl
	rule__PropertyAssign__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getIndexAssignment_2_1()); }
	(rule__PropertyAssign__IndexAssignment_2_1)
	{ after(grammarAccess.getPropertyAssignAccess().getIndexAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PropertyAssign__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAssignAccess().getRightSquareBracketKeyword_2_2()); }
	']'
	{ after(grammarAccess.getPropertyAssignAccess().getRightSquareBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Protocol__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocol__Group__0__Impl
	rule__Protocol__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); }
	'protocol'
	{ after(grammarAccess.getProtocolAccess().getProtocolKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocol__Group__1__Impl
	rule__Protocol__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolAccess().getNameAssignment_1()); }
	(rule__Protocol__NameAssignment_1)
	{ after(grammarAccess.getProtocolAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocol__Group__2__Impl
	rule__Protocol__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolAccess().getAnnotationsAssignment_2()); }
	(rule__Protocol__AnnotationsAssignment_2)*
	{ after(grammarAccess.getProtocolAccess().getAnnotationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Protocol__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProtocolAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getProtocolAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__0__Impl
	rule__Function__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getFunctionKeyword_0_0()); }
	'function'
	{ after(grammarAccess.getFunctionAccess().getFunctionKeyword_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__1__Impl
	rule__Function__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getNameAssignment_0_1()); }
	(rule__Function__NameAssignment_0_1)
	{ after(grammarAccess.getFunctionAccess().getNameAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__2__Impl
	rule__Function__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2()); }
	'('
	{ after(grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__3__Impl
	rule__Function__Group_0__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_0_3()); }
	(rule__Function__Group_0_3__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__4__Impl
	rule__Function__Group_0__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4()); }
	')'
	{ after(grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__5__Impl
	rule__Function__Group_0__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_0_5()); }
	(rule__Function__Group_0_5__0)?
	{ after(grammarAccess.getFunctionAccess().getGroup_0_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__6__Impl
	rule__Function__Group_0__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_0_6()); }
	(rule__Function__Group_0_6__0)*
	{ after(grammarAccess.getFunctionAccess().getGroup_0_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__7__Impl
	rule__Function__Group_0__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getAnnotationsAssignment_0_7()); }
	(rule__Function__AnnotationsAssignment_0_7)*
	{ after(grammarAccess.getFunctionAccess().getAnnotationsAssignment_0_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getBodyAssignment_0_8()); }
	(rule__Function__BodyAssignment_0_8)
	{ after(grammarAccess.getFunctionAccess().getBodyAssignment_0_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_0_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_3__0__Impl
	rule__Function__Group_0_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_0()); }
	(rule__Function__ParametersAssignment_0_3_0)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getGroup_0_3_1()); }
	(rule__Function__Group_0_3_1__0)*
	{ after(grammarAccess.getFunctionAccess().getGroup_0_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_0_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_3_1__0__Impl
	rule__Function__Group_0_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getCommaKeyword_0_3_1_0()); }
	','
	{ after(grammarAccess.getFunctionAccess().getCommaKeyword_0_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_1_1()); }
	(rule__Function__ParametersAssignment_0_3_1_1)
	{ after(grammarAccess.getFunctionAccess().getParametersAssignment_0_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_0_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_5__0__Impl
	rule__Function__Group_0_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getColonKeyword_0_5_0()); }
	':'
	{ after(grammarAccess.getFunctionAccess().getColonKeyword_0_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getTypeRefAssignment_0_5_1()); }
	(rule__Function__TypeRefAssignment_0_5_1)
	{ after(grammarAccess.getFunctionAccess().getTypeRefAssignment_0_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Function__Group_0_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_6__0__Impl
	rule__Function__Group_0_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getCommaKeyword_0_6_0()); }
	','
	{ after(grammarAccess.getFunctionAccess().getCommaKeyword_0_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Function__Group_0_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__Group_0_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionAccess().getExtraTypeRefAssignment_0_6_1()); }
	(rule__Function__ExtraTypeRefAssignment_0_6_1)
	{ after(grammarAccess.getFunctionAccess().getExtraTypeRefAssignment_0_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractFunction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__0__Impl
	rule__AbstractFunction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getAbstractAssignment_0()); }
	(rule__AbstractFunction__AbstractAssignment_0)
	{ after(grammarAccess.getAbstractFunctionAccess().getAbstractAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__1__Impl
	rule__AbstractFunction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getFunctionKeyword_1()); }
	'function'
	{ after(grammarAccess.getAbstractFunctionAccess().getFunctionKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__2__Impl
	rule__AbstractFunction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getNameAssignment_2()); }
	(rule__AbstractFunction__NameAssignment_2)
	{ after(grammarAccess.getAbstractFunctionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__3__Impl
	rule__AbstractFunction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getAbstractFunctionAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__4__Impl
	rule__AbstractFunction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getGroup_4()); }
	(rule__AbstractFunction__Group_4__0)?
	{ after(grammarAccess.getAbstractFunctionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__5__Impl
	rule__AbstractFunction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getAbstractFunctionAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__6__Impl
	rule__AbstractFunction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getGroup_6()); }
	(rule__AbstractFunction__Group_6__0)?
	{ after(grammarAccess.getAbstractFunctionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getAnnotationsAssignment_7()); }
	(rule__AbstractFunction__AnnotationsAssignment_7)*
	{ after(grammarAccess.getAbstractFunctionAccess().getAnnotationsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractFunction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_4__0__Impl
	rule__AbstractFunction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_0()); }
	(rule__AbstractFunction__ParametersAssignment_4_0)
	{ after(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getGroup_4_1()); }
	(rule__AbstractFunction__Group_4_1__0)*
	{ after(grammarAccess.getAbstractFunctionAccess().getGroup_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractFunction__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_4_1__0__Impl
	rule__AbstractFunction__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getCommaKeyword_4_1_0()); }
	','
	{ after(grammarAccess.getAbstractFunctionAccess().getCommaKeyword_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_1_1()); }
	(rule__AbstractFunction__ParametersAssignment_4_1_1)
	{ after(grammarAccess.getAbstractFunctionAccess().getParametersAssignment_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AbstractFunction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_6__0__Impl
	rule__AbstractFunction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getColonKeyword_6_0()); }
	':'
	{ after(grammarAccess.getAbstractFunctionAccess().getColonKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AbstractFunction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAbstractFunctionAccess().getTypeRefAssignment_6_1()); }
	(rule__AbstractFunction__TypeRefAssignment_6_1)
	{ after(grammarAccess.getAbstractFunctionAccess().getTypeRefAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__0__Impl
	rule__Property__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getReadonlyAssignment_0()); }
	(rule__Property__ReadonlyAssignment_0)?
	{ after(grammarAccess.getPropertyAccess().getReadonlyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__1__Impl
	rule__Property__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); }
	'property'
	{ after(grammarAccess.getPropertyAccess().getPropertyKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__2__Impl
	rule__Property__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getNameAssignment_2()); }
	(rule__Property__NameAssignment_2)
	{ after(grammarAccess.getPropertyAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__3__Impl
	rule__Property__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getPropertyAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__4__Impl
	rule__Property__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getAlternatives_4()); }
	(rule__Property__Alternatives_4)
	{ after(grammarAccess.getPropertyAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getAnnotationsAssignment_5()); }
	(rule__Property__AnnotationsAssignment_5)*
	{ after(grammarAccess.getPropertyAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group_4_0__0__Impl
	rule__Property__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getTypeRefAssignment_4_0_0()); }
	(rule__Property__TypeRefAssignment_4_0_0)
	{ after(grammarAccess.getPropertyAccess().getTypeRefAssignment_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getGroup_4_0_1()); }
	(rule__Property__Group_4_0_1__0)?
	{ after(grammarAccess.getPropertyAccess().getGroup_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Property__Group_4_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group_4_0_1__0__Impl
	rule__Property__Group_4_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0_1_0()); }
	'='
	{ after(grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Property__Group_4_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__Group_4_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPropertyAccess().getInitAssignment_4_0_1_1()); }
	(rule__Property__InitAssignment_4_0_1_1)
	{ after(grammarAccess.getPropertyAccess().getInitAssignment_4_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__0__Impl
	rule__Message__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getMessageKeyword_0()); }
	'message'
	{ after(grammarAccess.getMessageAccess().getMessageKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__1__Impl
	rule__Message__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getNameAssignment_1()); }
	(rule__Message__NameAssignment_1)
	{ after(grammarAccess.getMessageAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__2__Impl
	rule__Message__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__3__Impl
	rule__Message__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getGroup_3()); }
	(rule__Message__Group_3__0)?
	{ after(grammarAccess.getMessageAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__4__Impl
	rule__Message__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getRightParenthesisKeyword_4()); }
	')'
	{ after(grammarAccess.getMessageAccess().getRightParenthesisKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__5__Impl
	rule__Message__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getAnnotationsAssignment_5()); }
	(rule__Message__AnnotationsAssignment_5)*
	{ after(grammarAccess.getMessageAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getSemicolonKeyword_6()); }
	(';')?
	{ after(grammarAccess.getMessageAccess().getSemicolonKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group_3__0__Impl
	rule__Message__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getParametersAssignment_3_0()); }
	(rule__Message__ParametersAssignment_3_0)
	{ after(grammarAccess.getMessageAccess().getParametersAssignment_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getGroup_3_1()); }
	(rule__Message__Group_3_1__0)*
	{ after(grammarAccess.getMessageAccess().getGroup_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Message__Group_3_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group_3_1__0__Impl
	rule__Message__Group_3_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getCommaKeyword_3_1_0()); }
	','
	{ after(grammarAccess.getMessageAccess().getCommaKeyword_3_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Message__Group_3_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__Group_3_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMessageAccess().getParametersAssignment_3_1_1()); }
	(rule__Message__ParametersAssignment_3_1_1)
	{ after(grammarAccess.getMessageAccess().getParametersAssignment_3_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Parameter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__0__Impl
	rule__Parameter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getNameAssignment_0()); }
	(rule__Parameter__NameAssignment_0)
	{ after(grammarAccess.getParameterAccess().getNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__1__Impl
	rule__Parameter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getParameterAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__2__Impl
	rule__Parameter__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getTypeRefAssignment_2()); }
	(rule__Parameter__TypeRefAssignment_2)
	{ after(grammarAccess.getParameterAccess().getTypeRefAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Parameter__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParameterAccess().getAnnotationsAssignment_3()); }
	(rule__Parameter__AnnotationsAssignment_3)*
	{ after(grammarAccess.getParameterAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__0__Impl
	rule__RequiredPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getOptionalAssignment_0()); }
	(rule__RequiredPort__OptionalAssignment_0)?
	{ after(grammarAccess.getRequiredPortAccess().getOptionalAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__1__Impl
	rule__RequiredPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getRequiredKeyword_1()); }
	'required'
	{ after(grammarAccess.getRequiredPortAccess().getRequiredKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__2__Impl
	rule__RequiredPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getPortKeyword_2()); }
	'port'
	{ after(grammarAccess.getRequiredPortAccess().getPortKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__3__Impl
	rule__RequiredPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getNameAssignment_3()); }
	(rule__RequiredPort__NameAssignment_3)
	{ after(grammarAccess.getRequiredPortAccess().getNameAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__4__Impl
	rule__RequiredPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getAnnotationsAssignment_4()); }
	(rule__RequiredPort__AnnotationsAssignment_4)*
	{ after(grammarAccess.getRequiredPortAccess().getAnnotationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__5__Impl
	rule__RequiredPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getLeftCurlyBracketKeyword_5()); }
	'{'
	{ after(grammarAccess.getRequiredPortAccess().getLeftCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__6__Impl
	rule__RequiredPort__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getAlternatives_6()); }
	(rule__RequiredPort__Alternatives_6)*
	{ after(grammarAccess.getRequiredPortAccess().getAlternatives_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getRequiredPortAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredPort__Group_6_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_0__0__Impl
	rule__RequiredPort__Group_6_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getSendsKeyword_6_0_0()); }
	'sends'
	{ after(grammarAccess.getRequiredPortAccess().getSendsKeyword_6_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_0__1__Impl
	rule__RequiredPort__Group_6_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_1()); }
	(rule__RequiredPort__SendsAssignment_6_0_1)
	{ after(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getGroup_6_0_2()); }
	(rule__RequiredPort__Group_6_0_2__0)*
	{ after(grammarAccess.getRequiredPortAccess().getGroup_6_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredPort__Group_6_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_0_2__0__Impl
	rule__RequiredPort__Group_6_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getCommaKeyword_6_0_2_0()); }
	','
	{ after(grammarAccess.getRequiredPortAccess().getCommaKeyword_6_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_2_1()); }
	(rule__RequiredPort__SendsAssignment_6_0_2_1)
	{ after(grammarAccess.getRequiredPortAccess().getSendsAssignment_6_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredPort__Group_6_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_1__0__Impl
	rule__RequiredPort__Group_6_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getReceivesKeyword_6_1_0()); }
	'receives'
	{ after(grammarAccess.getRequiredPortAccess().getReceivesKeyword_6_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_1__1__Impl
	rule__RequiredPort__Group_6_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_1()); }
	(rule__RequiredPort__ReceivesAssignment_6_1_1)
	{ after(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getGroup_6_1_2()); }
	(rule__RequiredPort__Group_6_1_2__0)*
	{ after(grammarAccess.getRequiredPortAccess().getGroup_6_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RequiredPort__Group_6_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_1_2__0__Impl
	rule__RequiredPort__Group_6_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getCommaKeyword_6_1_2_0()); }
	','
	{ after(grammarAccess.getRequiredPortAccess().getCommaKeyword_6_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RequiredPort__Group_6_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__Group_6_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_2_1()); }
	(rule__RequiredPort__ReceivesAssignment_6_1_2_1)
	{ after(grammarAccess.getRequiredPortAccess().getReceivesAssignment_6_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__0__Impl
	rule__ProvidedPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getProvidedKeyword_0()); }
	'provided'
	{ after(grammarAccess.getProvidedPortAccess().getProvidedKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__1__Impl
	rule__ProvidedPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getPortKeyword_1()); }
	'port'
	{ after(grammarAccess.getProvidedPortAccess().getPortKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__2__Impl
	rule__ProvidedPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getNameAssignment_2()); }
	(rule__ProvidedPort__NameAssignment_2)
	{ after(grammarAccess.getProvidedPortAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__3__Impl
	rule__ProvidedPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getAnnotationsAssignment_3()); }
	(rule__ProvidedPort__AnnotationsAssignment_3)*
	{ after(grammarAccess.getProvidedPortAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__4__Impl
	rule__ProvidedPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getProvidedPortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__5__Impl
	rule__ProvidedPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getAlternatives_5()); }
	(rule__ProvidedPort__Alternatives_5)*
	{ after(grammarAccess.getProvidedPortAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getProvidedPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedPort__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_0__0__Impl
	rule__ProvidedPort__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getSendsKeyword_5_0_0()); }
	'sends'
	{ after(grammarAccess.getProvidedPortAccess().getSendsKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_0__1__Impl
	rule__ProvidedPort__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_1()); }
	(rule__ProvidedPort__SendsAssignment_5_0_1)
	{ after(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getGroup_5_0_2()); }
	(rule__ProvidedPort__Group_5_0_2__0)*
	{ after(grammarAccess.getProvidedPortAccess().getGroup_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedPort__Group_5_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_0_2__0__Impl
	rule__ProvidedPort__Group_5_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getCommaKeyword_5_0_2_0()); }
	','
	{ after(grammarAccess.getProvidedPortAccess().getCommaKeyword_5_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_2_1()); }
	(rule__ProvidedPort__SendsAssignment_5_0_2_1)
	{ after(grammarAccess.getProvidedPortAccess().getSendsAssignment_5_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedPort__Group_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_1__0__Impl
	rule__ProvidedPort__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getReceivesKeyword_5_1_0()); }
	'receives'
	{ after(grammarAccess.getProvidedPortAccess().getReceivesKeyword_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_1__1__Impl
	rule__ProvidedPort__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_1()); }
	(rule__ProvidedPort__ReceivesAssignment_5_1_1)
	{ after(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getGroup_5_1_2()); }
	(rule__ProvidedPort__Group_5_1_2__0)*
	{ after(grammarAccess.getProvidedPortAccess().getGroup_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ProvidedPort__Group_5_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_1_2__0__Impl
	rule__ProvidedPort__Group_5_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getCommaKeyword_5_1_2_0()); }
	','
	{ after(grammarAccess.getProvidedPortAccess().getCommaKeyword_5_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ProvidedPort__Group_5_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__Group_5_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_2_1()); }
	(rule__ProvidedPort__ReceivesAssignment_5_1_2_1)
	{ after(grammarAccess.getProvidedPortAccess().getReceivesAssignment_5_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalPort__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__0__Impl
	rule__InternalPort__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getInternalKeyword_0()); }
	'internal'
	{ after(grammarAccess.getInternalPortAccess().getInternalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__1__Impl
	rule__InternalPort__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getPortKeyword_1()); }
	'port'
	{ after(grammarAccess.getInternalPortAccess().getPortKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__2__Impl
	rule__InternalPort__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getNameAssignment_2()); }
	(rule__InternalPort__NameAssignment_2)
	{ after(grammarAccess.getInternalPortAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__3__Impl
	rule__InternalPort__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getAnnotationsAssignment_3()); }
	(rule__InternalPort__AnnotationsAssignment_3)*
	{ after(grammarAccess.getInternalPortAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__4__Impl
	rule__InternalPort__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getInternalPortAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__5__Impl
	rule__InternalPort__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getAlternatives_5()); }
	(rule__InternalPort__Alternatives_5)*
	{ after(grammarAccess.getInternalPortAccess().getAlternatives_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getInternalPortAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalPort__Group_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_0__0__Impl
	rule__InternalPort__Group_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getSendsKeyword_5_0_0()); }
	'sends'
	{ after(grammarAccess.getInternalPortAccess().getSendsKeyword_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_0__1__Impl
	rule__InternalPort__Group_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_1()); }
	(rule__InternalPort__SendsAssignment_5_0_1)
	{ after(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getGroup_5_0_2()); }
	(rule__InternalPort__Group_5_0_2__0)*
	{ after(grammarAccess.getInternalPortAccess().getGroup_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalPort__Group_5_0_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_0_2__0__Impl
	rule__InternalPort__Group_5_0_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getCommaKeyword_5_0_2_0()); }
	','
	{ after(grammarAccess.getInternalPortAccess().getCommaKeyword_5_0_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_0_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_0_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_2_1()); }
	(rule__InternalPort__SendsAssignment_5_0_2_1)
	{ after(grammarAccess.getInternalPortAccess().getSendsAssignment_5_0_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalPort__Group_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_1__0__Impl
	rule__InternalPort__Group_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getReceivesKeyword_5_1_0()); }
	'receives'
	{ after(grammarAccess.getInternalPortAccess().getReceivesKeyword_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_1__1__Impl
	rule__InternalPort__Group_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_1()); }
	(rule__InternalPort__ReceivesAssignment_5_1_1)
	{ after(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getGroup_5_1_2()); }
	(rule__InternalPort__Group_5_1_2__0)*
	{ after(grammarAccess.getInternalPortAccess().getGroup_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalPort__Group_5_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_1_2__0__Impl
	rule__InternalPort__Group_5_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getCommaKeyword_5_1_2_0()); }
	','
	{ after(grammarAccess.getInternalPortAccess().getCommaKeyword_5_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalPort__Group_5_1_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__Group_5_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_2_1()); }
	(rule__InternalPort__ReceivesAssignment_5_1_2_1)
	{ after(grammarAccess.getInternalPortAccess().getReceivesAssignment_5_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__0__Impl
	rule__State__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getStateKeyword_3_0()); }
	'state'
	{ after(grammarAccess.getStateAccess().getStateKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__1__Impl
	rule__State__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getNameAssignment_3_1()); }
	(rule__State__NameAssignment_3_1)
	{ after(grammarAccess.getStateAccess().getNameAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__2__Impl
	rule__State__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getAnnotationsAssignment_3_2()); }
	(rule__State__AnnotationsAssignment_3_2)*
	{ after(grammarAccess.getStateAccess().getAnnotationsAssignment_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__3__Impl
	rule__State__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_3()); }
	'{'
	{ after(grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__4__Impl
	rule__State__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getPropertiesAssignment_3_4()); }
	(rule__State__PropertiesAssignment_3_4)*
	{ after(grammarAccess.getStateAccess().getPropertiesAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__5__Impl
	rule__State__Group_3__6
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getUnorderedGroup_3_5()); }
	(rule__State__UnorderedGroup_3_5)
	{ after(grammarAccess.getStateAccess().getUnorderedGroup_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_6()); }
	'}'
	{ after(grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3_5_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_0__0__Impl
	rule__State__Group_3_5_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOnKeyword_3_5_0_0()); }
	'on'
	{ after(grammarAccess.getStateAccess().getOnKeyword_3_5_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_0__1__Impl
	rule__State__Group_3_5_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getEntryKeyword_3_5_0_1()); }
	'entry'
	{ after(grammarAccess.getStateAccess().getEntryKeyword_3_5_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getEntryAssignment_3_5_0_2()); }
	(rule__State__EntryAssignment_3_5_0_2)
	{ after(grammarAccess.getStateAccess().getEntryAssignment_3_5_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__Group_3_5_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_1__0__Impl
	rule__State__Group_3_5_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getOnKeyword_3_5_1_0()); }
	'on'
	{ after(grammarAccess.getStateAccess().getOnKeyword_3_5_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_1__1__Impl
	rule__State__Group_3_5_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getExitKeyword_3_5_1_1()); }
	'exit'
	{ after(grammarAccess.getStateAccess().getExitKeyword_3_5_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__Group_3_5_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__State__Group_3_5_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateAccess().getExitAssignment_3_5_1_2()); }
	(rule__State__ExitAssignment_3_5_1_2)
	{ after(grammarAccess.getStateAccess().getExitAssignment_3_5_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__0__Impl
	rule__Transition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
	'transition'
	{ after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__1__Impl
	rule__Transition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getNameAssignment_1()); }
	(rule__Transition__NameAssignment_1)?
	{ after(grammarAccess.getTransitionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__2__Impl
	rule__Transition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
	'->'
	{ after(grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__3__Impl
	rule__Transition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getTargetAssignment_3()); }
	(rule__Transition__TargetAssignment_3)
	{ after(grammarAccess.getTransitionAccess().getTargetAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__4__Impl
	rule__Transition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getAnnotationsAssignment_4()); }
	(rule__Transition__AnnotationsAssignment_4)*
	{ after(grammarAccess.getTransitionAccess().getAnnotationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__5__Impl
	rule__Transition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_5()); }
	(rule__Transition__Group_5__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__6__Impl
	rule__Transition__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_6()); }
	(rule__Transition__Group_6__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGroup_7()); }
	(rule__Transition__Group_7__0)?
	{ after(grammarAccess.getTransitionAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_5__0__Impl
	rule__Transition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getEventKeyword_5_0()); }
	'event'
	{ after(grammarAccess.getTransitionAccess().getEventKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getEventAssignment_5_1()); }
	(rule__Transition__EventAssignment_5_1)
	{ after(grammarAccess.getTransitionAccess().getEventAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_6__0__Impl
	rule__Transition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); }
	'guard'
	{ after(grammarAccess.getTransitionAccess().getGuardKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); }
	(rule__Transition__GuardAssignment_6_1)
	{ after(grammarAccess.getTransitionAccess().getGuardAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Transition__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_7__0__Impl
	rule__Transition__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getActionKeyword_7_0()); }
	'action'
	{ after(grammarAccess.getTransitionAccess().getActionKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Transition__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTransitionAccess().getActionAssignment_7_1()); }
	(rule__Transition__ActionAssignment_7_1)
	{ after(grammarAccess.getTransitionAccess().getActionAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalTransition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__0__Impl
	rule__InternalTransition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getInternalTransitionAction_0()); }
	()
	{ after(grammarAccess.getInternalTransitionAccess().getInternalTransitionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__1__Impl
	rule__InternalTransition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getInternalKeyword_1()); }
	'internal'
	{ after(grammarAccess.getInternalTransitionAccess().getInternalKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__2__Impl
	rule__InternalTransition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getNameAssignment_2()); }
	(rule__InternalTransition__NameAssignment_2)?
	{ after(grammarAccess.getInternalTransitionAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__3__Impl
	rule__InternalTransition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getAnnotationsAssignment_3()); }
	(rule__InternalTransition__AnnotationsAssignment_3)*
	{ after(grammarAccess.getInternalTransitionAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__4__Impl
	rule__InternalTransition__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getGroup_4()); }
	(rule__InternalTransition__Group_4__0)?
	{ after(grammarAccess.getInternalTransitionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__5__Impl
	rule__InternalTransition__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getGroup_5()); }
	(rule__InternalTransition__Group_5__0)?
	{ after(grammarAccess.getInternalTransitionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getGroup_6()); }
	(rule__InternalTransition__Group_6__0)?
	{ after(grammarAccess.getInternalTransitionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalTransition__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_4__0__Impl
	rule__InternalTransition__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getEventKeyword_4_0()); }
	'event'
	{ after(grammarAccess.getInternalTransitionAccess().getEventKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getEventAssignment_4_1()); }
	(rule__InternalTransition__EventAssignment_4_1)
	{ after(grammarAccess.getInternalTransitionAccess().getEventAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalTransition__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_5__0__Impl
	rule__InternalTransition__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getGuardKeyword_5_0()); }
	'guard'
	{ after(grammarAccess.getInternalTransitionAccess().getGuardKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getGuardAssignment_5_1()); }
	(rule__InternalTransition__GuardAssignment_5_1)
	{ after(grammarAccess.getInternalTransitionAccess().getGuardAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__InternalTransition__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_6__0__Impl
	rule__InternalTransition__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getActionKeyword_6_0()); }
	'action'
	{ after(grammarAccess.getInternalTransitionAccess().getActionKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__InternalTransition__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInternalTransitionAccess().getActionAssignment_6_1()); }
	(rule__InternalTransition__ActionAssignment_6_1)
	{ after(grammarAccess.getInternalTransitionAccess().getActionAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeState__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__0__Impl
	rule__CompositeState__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getCompositeKeyword_0()); }
	'composite'
	{ after(grammarAccess.getCompositeStateAccess().getCompositeKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__1__Impl
	rule__CompositeState__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getStateKeyword_1()); }
	'state'
	{ after(grammarAccess.getCompositeStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__2__Impl
	rule__CompositeState__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getNameAssignment_2()); }
	(rule__CompositeState__NameAssignment_2)
	{ after(grammarAccess.getCompositeStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__3__Impl
	rule__CompositeState__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getInitKeyword_3()); }
	'init'
	{ after(grammarAccess.getCompositeStateAccess().getInitKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__4__Impl
	rule__CompositeState__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getInitialAssignment_4()); }
	(rule__CompositeState__InitialAssignment_4)
	{ after(grammarAccess.getCompositeStateAccess().getInitialAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__5__Impl
	rule__CompositeState__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getGroup_5()); }
	(rule__CompositeState__Group_5__0)?
	{ after(grammarAccess.getCompositeStateAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__6__Impl
	rule__CompositeState__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getAnnotationsAssignment_6()); }
	(rule__CompositeState__AnnotationsAssignment_6)*
	{ after(grammarAccess.getCompositeStateAccess().getAnnotationsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__7__Impl
	rule__CompositeState__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_7()); }
	'{'
	{ after(grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__8__Impl
	rule__CompositeState__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_8()); }
	(rule__CompositeState__PropertiesAssignment_8)*
	{ after(grammarAccess.getCompositeStateAccess().getPropertiesAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__9__Impl
	rule__CompositeState__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9()); }
	(rule__CompositeState__UnorderedGroup_9)
	{ after(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__10__Impl
	rule__CompositeState__Group__11
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getAlternatives_10()); }
	(rule__CompositeState__Alternatives_10)*
	{ after(grammarAccess.getCompositeStateAccess().getAlternatives_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__11
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group__11__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group__11__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_11()); }
	'}'
	{ after(grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_11()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeState__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_5__0__Impl
	rule__CompositeState__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getKeepsKeyword_5_0()); }
	'keeps'
	{ after(grammarAccess.getCompositeStateAccess().getKeepsKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getHistoryAssignment_5_1()); }
	(rule__CompositeState__HistoryAssignment_5_1)
	{ after(grammarAccess.getCompositeStateAccess().getHistoryAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeState__Group_9_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_0__0__Impl
	rule__CompositeState__Group_9_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getOnKeyword_9_0_0()); }
	'on'
	{ after(grammarAccess.getCompositeStateAccess().getOnKeyword_9_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_0__1__Impl
	rule__CompositeState__Group_9_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getEntryKeyword_9_0_1()); }
	'entry'
	{ after(grammarAccess.getCompositeStateAccess().getEntryKeyword_9_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getEntryAssignment_9_0_2()); }
	(rule__CompositeState__EntryAssignment_9_0_2)
	{ after(grammarAccess.getCompositeStateAccess().getEntryAssignment_9_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeState__Group_9_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_1__0__Impl
	rule__CompositeState__Group_9_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getOnKeyword_9_1_0()); }
	'on'
	{ after(grammarAccess.getCompositeStateAccess().getOnKeyword_9_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_1__1__Impl
	rule__CompositeState__Group_9_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getExitKeyword_9_1_1()); }
	'exit'
	{ after(grammarAccess.getCompositeStateAccess().getExitKeyword_9_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__Group_9_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__Group_9_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCompositeStateAccess().getExitAssignment_9_1_2()); }
	(rule__CompositeState__ExitAssignment_9_1_2)
	{ after(grammarAccess.getCompositeStateAccess().getExitAssignment_9_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__0__Impl
	rule__StateMachine__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getStatechartKeyword_0()); }
	'statechart'
	{ after(grammarAccess.getStateMachineAccess().getStatechartKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__1__Impl
	rule__StateMachine__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); }
	(rule__StateMachine__NameAssignment_1)?
	{ after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__2__Impl
	rule__StateMachine__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getInitKeyword_2()); }
	'init'
	{ after(grammarAccess.getStateMachineAccess().getInitKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__3__Impl
	rule__StateMachine__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getInitialAssignment_3()); }
	(rule__StateMachine__InitialAssignment_3)
	{ after(grammarAccess.getStateMachineAccess().getInitialAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__4__Impl
	rule__StateMachine__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getGroup_4()); }
	(rule__StateMachine__Group_4__0)?
	{ after(grammarAccess.getStateMachineAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__5__Impl
	rule__StateMachine__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getAnnotationsAssignment_5()); }
	(rule__StateMachine__AnnotationsAssignment_5)*
	{ after(grammarAccess.getStateMachineAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__6__Impl
	rule__StateMachine__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__7__Impl
	rule__StateMachine__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getPropertiesAssignment_7()); }
	(rule__StateMachine__PropertiesAssignment_7)*
	{ after(grammarAccess.getStateMachineAccess().getPropertiesAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__8__Impl
	rule__StateMachine__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getUnorderedGroup_8()); }
	(rule__StateMachine__UnorderedGroup_8)
	{ after(grammarAccess.getStateMachineAccess().getUnorderedGroup_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__9__Impl
	rule__StateMachine__Group__10
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getAlternatives_9()); }
	(rule__StateMachine__Alternatives_9)*
	{ after(grammarAccess.getStateMachineAccess().getAlternatives_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__10
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group__10__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group__10__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); }
	'}'
	{ after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_4__0__Impl
	rule__StateMachine__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getKeepsKeyword_4_0()); }
	'keeps'
	{ after(grammarAccess.getStateMachineAccess().getKeepsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getHistoryAssignment_4_1()); }
	(rule__StateMachine__HistoryAssignment_4_1)
	{ after(grammarAccess.getStateMachineAccess().getHistoryAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group_8_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_0__0__Impl
	rule__StateMachine__Group_8_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getOnKeyword_8_0_0()); }
	'on'
	{ after(grammarAccess.getStateMachineAccess().getOnKeyword_8_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_0__1__Impl
	rule__StateMachine__Group_8_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getEntryKeyword_8_0_1()); }
	'entry'
	{ after(grammarAccess.getStateMachineAccess().getEntryKeyword_8_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getEntryAssignment_8_0_2()); }
	(rule__StateMachine__EntryAssignment_8_0_2)
	{ after(grammarAccess.getStateMachineAccess().getEntryAssignment_8_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__Group_8_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_1__0__Impl
	rule__StateMachine__Group_8_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getOnKeyword_8_1_0()); }
	'on'
	{ after(grammarAccess.getStateMachineAccess().getOnKeyword_8_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_1__1__Impl
	rule__StateMachine__Group_8_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getExitKeyword_8_1_1()); }
	'exit'
	{ after(grammarAccess.getStateMachineAccess().getExitKeyword_8_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__Group_8_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__Group_8_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateMachineAccess().getExitAssignment_8_1_2()); }
	(rule__StateMachine__ExitAssignment_8_1_2)
	{ after(grammarAccess.getStateMachineAccess().getExitAssignment_8_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Session__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__0__Impl
	rule__Session__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getSessionKeyword_0()); }
	'session'
	{ after(grammarAccess.getSessionAccess().getSessionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__1__Impl
	rule__Session__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getNameAssignment_1()); }
	(rule__Session__NameAssignment_1)
	{ after(grammarAccess.getSessionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__2__Impl
	rule__Session__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getGroup_2()); }
	(rule__Session__Group_2__0)?
	{ after(grammarAccess.getSessionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__3__Impl
	rule__Session__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getInitKeyword_3()); }
	'init'
	{ after(grammarAccess.getSessionAccess().getInitKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__4__Impl
	rule__Session__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getInitialAssignment_4()); }
	(rule__Session__InitialAssignment_4)
	{ after(grammarAccess.getSessionAccess().getInitialAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__5__Impl
	rule__Session__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getAnnotationsAssignment_5()); }
	(rule__Session__AnnotationsAssignment_5)*
	{ after(grammarAccess.getSessionAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__6__Impl
	rule__Session__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__7__Impl
	rule__Session__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getSubstateAssignment_7()); }
	(rule__Session__SubstateAssignment_7)*
	{ after(grammarAccess.getSessionAccess().getSubstateAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Session__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group_2__0__Impl
	rule__Session__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getLessThanSignKeyword_2_0()); }
	'<'
	{ after(grammarAccess.getSessionAccess().getLessThanSignKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group_2__1__Impl
	rule__Session__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getMaxInstancesAssignment_2_1()); }
	(rule__Session__MaxInstancesAssignment_2_1)
	{ after(grammarAccess.getSessionAccess().getMaxInstancesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Session__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSessionAccess().getGreaterThanSignKeyword_2_2()); }
	'>'
	{ after(grammarAccess.getSessionAccess().getGreaterThanSignKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Region__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__0__Impl
	rule__Region__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getRegionKeyword_0()); }
	'region'
	{ after(grammarAccess.getRegionAccess().getRegionKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__1__Impl
	rule__Region__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getNameAssignment_1()); }
	(rule__Region__NameAssignment_1)?
	{ after(grammarAccess.getRegionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__2__Impl
	rule__Region__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getInitKeyword_2()); }
	'init'
	{ after(grammarAccess.getRegionAccess().getInitKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__3__Impl
	rule__Region__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getInitialAssignment_3()); }
	(rule__Region__InitialAssignment_3)
	{ after(grammarAccess.getRegionAccess().getInitialAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__4__Impl
	rule__Region__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getGroup_4()); }
	(rule__Region__Group_4__0)?
	{ after(grammarAccess.getRegionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__5__Impl
	rule__Region__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getAnnotationsAssignment_5()); }
	(rule__Region__AnnotationsAssignment_5)*
	{ after(grammarAccess.getRegionAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__6__Impl
	rule__Region__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__7__Impl
	rule__Region__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getSubstateAssignment_7()); }
	(rule__Region__SubstateAssignment_7)*
	{ after(grammarAccess.getRegionAccess().getSubstateAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_8()); }
	'}'
	{ after(grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Region__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group_4__0__Impl
	rule__Region__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getKeepsKeyword_4_0()); }
	'keeps'
	{ after(grammarAccess.getRegionAccess().getKeepsKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Region__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRegionAccess().getHistoryAssignment_4_1()); }
	(rule__Region__HistoryAssignment_4_1)
	{ after(grammarAccess.getRegionAccess().getHistoryAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FinalState__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__0__Impl
	rule__FinalState__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getFinalKeyword_0()); }
	'final'
	{ after(grammarAccess.getFinalStateAccess().getFinalKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__1__Impl
	rule__FinalState__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getStateKeyword_1()); }
	'state'
	{ after(grammarAccess.getFinalStateAccess().getStateKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__2__Impl
	rule__FinalState__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getNameAssignment_2()); }
	(rule__FinalState__NameAssignment_2)
	{ after(grammarAccess.getFinalStateAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__3__Impl
	rule__FinalState__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getAnnotationsAssignment_3()); }
	(rule__FinalState__AnnotationsAssignment_3)*
	{ after(grammarAccess.getFinalStateAccess().getAnnotationsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__4__Impl
	rule__FinalState__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getLeftCurlyBracketKeyword_4()); }
	'{'
	{ after(grammarAccess.getFinalStateAccess().getLeftCurlyBracketKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__5__Impl
	rule__FinalState__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getGroup_5()); }
	(rule__FinalState__Group_5__0)?
	{ after(grammarAccess.getFinalStateAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getRightCurlyBracketKeyword_6()); }
	'}'
	{ after(grammarAccess.getFinalStateAccess().getRightCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FinalState__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group_5__0__Impl
	rule__FinalState__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getOnKeyword_5_0()); }
	'on'
	{ after(grammarAccess.getFinalStateAccess().getOnKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group_5__1__Impl
	rule__FinalState__Group_5__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getEntryKeyword_5_1()); }
	'entry'
	{ after(grammarAccess.getFinalStateAccess().getEntryKeyword_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FinalState__Group_5__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__Group_5__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFinalStateAccess().getEntryAssignment_5_2()); }
	(rule__FinalState__EntryAssignment_5_2)
	{ after(grammarAccess.getFinalStateAccess().getEntryAssignment_5_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateContainer__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__0__Impl
	rule__StateContainer__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getKeepsKeyword_3_0()); }
	'keeps'
	{ after(grammarAccess.getStateContainerAccess().getKeepsKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__1__Impl
	rule__StateContainer__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getInitialAssignment_3_1()); }
	(rule__StateContainer__InitialAssignment_3_1)
	{ after(grammarAccess.getStateContainerAccess().getInitialAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__2__Impl
	rule__StateContainer__Group_3__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getGroup_3_2()); }
	(rule__StateContainer__Group_3_2__0)?
	{ after(grammarAccess.getStateContainerAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__3__Impl
	rule__StateContainer__Group_3__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getLeftCurlyBracketKeyword_3_3()); }
	'{'
	{ after(grammarAccess.getStateContainerAccess().getLeftCurlyBracketKeyword_3_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__4__Impl
	rule__StateContainer__Group_3__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getSubstateAssignment_3_4()); }
	(rule__StateContainer__SubstateAssignment_3_4)*
	{ after(grammarAccess.getStateContainerAccess().getSubstateAssignment_3_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getRightCurlyBracketKeyword_3_5()); }
	'}'
	{ after(grammarAccess.getStateContainerAccess().getRightCurlyBracketKeyword_3_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StateContainer__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3_2__0__Impl
	rule__StateContainer__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getKeepsKeyword_3_2_0()); }
	'keeps'
	{ after(grammarAccess.getStateContainerAccess().getKeepsKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateContainer__Group_3_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStateContainerAccess().getHistoryAssignment_3_2_1()); }
	(rule__StateContainer__HistoryAssignment_3_2_1)
	{ after(grammarAccess.getStateContainerAccess().getHistoryAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReceiveMessage__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group__0__Impl
	rule__ReceiveMessage__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getGroup_0()); }
	(rule__ReceiveMessage__Group_0__0)?
	{ after(grammarAccess.getReceiveMessageAccess().getGroup_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group__1__Impl
	rule__ReceiveMessage__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getPortAssignment_1()); }
	(rule__ReceiveMessage__PortAssignment_1)
	{ after(grammarAccess.getReceiveMessageAccess().getPortAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group__2__Impl
	rule__ReceiveMessage__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getQuestionMarkKeyword_2()); }
	'?'
	{ after(grammarAccess.getReceiveMessageAccess().getQuestionMarkKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getMessageAssignment_3()); }
	(rule__ReceiveMessage__MessageAssignment_3)
	{ after(grammarAccess.getReceiveMessageAccess().getMessageAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReceiveMessage__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group_0__0__Impl
	rule__ReceiveMessage__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getNameAssignment_0_0()); }
	(rule__ReceiveMessage__NameAssignment_0_0)
	{ after(grammarAccess.getReceiveMessageAccess().getNameAssignment_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReceiveMessage__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReceiveMessageAccess().getColonKeyword_0_1()); }
	':'
	{ after(grammarAccess.getReceiveMessageAccess().getColonKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActionBlock__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActionBlock__Group__0__Impl
	rule__ActionBlock__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionBlockAccess().getActionBlockAction_0()); }
	()
	{ after(grammarAccess.getActionBlockAccess().getActionBlockAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActionBlock__Group__1__Impl
	rule__ActionBlock__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionBlockAccess().getDoKeyword_1()); }
	'do'
	{ after(grammarAccess.getActionBlockAccess().getDoKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActionBlock__Group__2__Impl
	rule__ActionBlock__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionBlockAccess().getActionsAssignment_2()); }
	(rule__ActionBlock__ActionsAssignment_2)*
	{ after(grammarAccess.getActionBlockAccess().getActionsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActionBlock__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActionBlockAccess().getEndKeyword_3()); }
	'end'
	{ after(grammarAccess.getActionBlockAccess().getEndKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternStatement__Group__0__Impl
	rule__ExternStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternStatementAccess().getStatementAssignment_0()); }
	(rule__ExternStatement__StatementAssignment_0)
	{ after(grammarAccess.getExternStatementAccess().getStatementAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternStatement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternStatementAccess().getGroup_1()); }
	(rule__ExternStatement__Group_1__0)*
	{ after(grammarAccess.getExternStatementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternStatement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternStatement__Group_1__0__Impl
	rule__ExternStatement__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternStatementAccess().getAmpersandKeyword_1_0()); }
	'&'
	{ after(grammarAccess.getExternStatementAccess().getAmpersandKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternStatement__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternStatementAccess().getSegmentsAssignment_1_1()); }
	(rule__ExternStatement__SegmentsAssignment_1_1)
	{ after(grammarAccess.getExternStatementAccess().getSegmentsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalVariable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__0__Impl
	rule__LocalVariable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getReadonlyAssignment_0()); }
	(rule__LocalVariable__ReadonlyAssignment_0)?
	{ after(grammarAccess.getLocalVariableAccess().getReadonlyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__1__Impl
	rule__LocalVariable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getVarKeyword_1()); }
	'var'
	{ after(grammarAccess.getLocalVariableAccess().getVarKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__2__Impl
	rule__LocalVariable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getNameAssignment_2()); }
	(rule__LocalVariable__NameAssignment_2)
	{ after(grammarAccess.getLocalVariableAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__3__Impl
	rule__LocalVariable__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getColonKeyword_3()); }
	':'
	{ after(grammarAccess.getLocalVariableAccess().getColonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__4__Impl
	rule__LocalVariable__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getAlternatives_4()); }
	(rule__LocalVariable__Alternatives_4)
	{ after(grammarAccess.getLocalVariableAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getAnnotationsAssignment_5()); }
	(rule__LocalVariable__AnnotationsAssignment_5)*
	{ after(grammarAccess.getLocalVariableAccess().getAnnotationsAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalVariable__Group_4_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group_4_0__0__Impl
	rule__LocalVariable__Group_4_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getTypeRefAssignment_4_0_0()); }
	(rule__LocalVariable__TypeRefAssignment_4_0_0)
	{ after(grammarAccess.getLocalVariableAccess().getTypeRefAssignment_4_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group_4_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getGroup_4_0_1()); }
	(rule__LocalVariable__Group_4_0_1__0)?
	{ after(grammarAccess.getLocalVariableAccess().getGroup_4_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LocalVariable__Group_4_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group_4_0_1__0__Impl
	rule__LocalVariable__Group_4_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_4_0_1_0()); }
	'='
	{ after(grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_4_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LocalVariable__Group_4_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__Group_4_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLocalVariableAccess().getInitAssignment_4_0_1_1()); }
	(rule__LocalVariable__InitAssignment_4_0_1_1)
	{ after(grammarAccess.getLocalVariableAccess().getInitAssignment_4_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SendAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__0__Impl
	rule__SendAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getPortAssignment_0()); }
	(rule__SendAction__PortAssignment_0)
	{ after(grammarAccess.getSendActionAccess().getPortAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__1__Impl
	rule__SendAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getExclamationMarkKeyword_1()); }
	'!'
	{ after(grammarAccess.getSendActionAccess().getExclamationMarkKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__2__Impl
	rule__SendAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getMessageAssignment_2()); }
	(rule__SendAction__MessageAssignment_2)
	{ after(grammarAccess.getSendActionAccess().getMessageAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__3__Impl
	rule__SendAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getSendActionAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__4__Impl
	rule__SendAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getGroup_4()); }
	(rule__SendAction__Group_4__0)?
	{ after(grammarAccess.getSendActionAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getSendActionAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SendAction__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group_4__0__Impl
	rule__SendAction__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getParametersAssignment_4_0()); }
	(rule__SendAction__ParametersAssignment_4_0)
	{ after(grammarAccess.getSendActionAccess().getParametersAssignment_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getGroup_4_1()); }
	(rule__SendAction__Group_4_1__0)*
	{ after(grammarAccess.getSendActionAccess().getGroup_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SendAction__Group_4_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group_4_1__0__Impl
	rule__SendAction__Group_4_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getCommaKeyword_4_1_0()); }
	','
	{ after(grammarAccess.getSendActionAccess().getCommaKeyword_4_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SendAction__Group_4_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__Group_4_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSendActionAccess().getParametersAssignment_4_1_1()); }
	(rule__SendAction__ParametersAssignment_4_1_1)
	{ after(grammarAccess.getSendActionAccess().getParametersAssignment_4_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group__0__Impl
	rule__VariableAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getPropertyAssignment_0()); }
	(rule__VariableAssignment__PropertyAssignment_0)
	{ after(grammarAccess.getVariableAssignmentAccess().getPropertyAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group__1__Impl
	rule__VariableAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getGroup_1()); }
	(rule__VariableAssignment__Group_1__0)?
	{ after(grammarAccess.getVariableAssignmentAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group__2__Impl
	rule__VariableAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getGroup_2()); }
	(rule__VariableAssignment__Group_2__0)*
	{ after(grammarAccess.getVariableAssignmentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group__3__Impl
	rule__VariableAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_3()); }
	'='
	{ after(grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_4()); }
	(rule__VariableAssignment__ExpressionAssignment_4)
	{ after(grammarAccess.getVariableAssignmentAccess().getExpressionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableAssignment__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_1__0__Impl
	rule__VariableAssignment__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_1_0()); }
	('[')
	{ after(grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_1__1__Impl
	rule__VariableAssignment__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getIndexAssignment_1_1()); }
	(rule__VariableAssignment__IndexAssignment_1_1)
	{ after(grammarAccess.getVariableAssignmentAccess().getIndexAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableAssignment__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2__0__Impl
	rule__VariableAssignment__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getVariableAssignmentAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2__1__Impl
	rule__VariableAssignment__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getExtraPropertyAssignment_2_1()); }
	(rule__VariableAssignment__ExtraPropertyAssignment_2_1)
	{ after(grammarAccess.getVariableAssignmentAccess().getExtraPropertyAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getGroup_2_2()); }
	(rule__VariableAssignment__Group_2_2__0)?
	{ after(grammarAccess.getVariableAssignmentAccess().getGroup_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__VariableAssignment__Group_2_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2_2__0__Impl
	rule__VariableAssignment__Group_2_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_2_2_0()); }
	('[')
	{ after(grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_2_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2_2__1__Impl
	rule__VariableAssignment__Group_2_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getExtraIndexAssignment_2_2_1()); }
	(rule__VariableAssignment__ExtraIndexAssignment_2_2_1)
	{ after(grammarAccess.getVariableAssignmentAccess().getExtraIndexAssignment_2_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__VariableAssignment__Group_2_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__Group_2_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_2_2_2()); }
	']'
	{ after(grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_2_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__0__Impl
	rule__CpropertyAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getCpropertyAssignmentAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__1__Impl
	rule__CpropertyAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getCpropertysAssignment_1()); }
	(rule__CpropertyAssignment__CpropertysAssignment_1)
	{ after(grammarAccess.getCpropertyAssignmentAccess().getCpropertysAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__2__Impl
	rule__CpropertyAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getGroup_2()); }
	(rule__CpropertyAssignment__Group_2__0)?
	{ after(grammarAccess.getCpropertyAssignmentAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__3__Impl
	rule__CpropertyAssignment__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getGroup_3()); }
	(rule__CpropertyAssignment__Group_3__0)?
	{ after(grammarAccess.getCpropertyAssignmentAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__4__Impl
	rule__CpropertyAssignment__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getEqualsSignKeyword_4()); }
	'='
	{ after(grammarAccess.getCpropertyAssignmentAccess().getEqualsSignKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getExpressionAssignment_5()); }
	(rule__CpropertyAssignment__ExpressionAssignment_5)
	{ after(grammarAccess.getCpropertyAssignmentAccess().getExpressionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyAssignment__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_2__0__Impl
	rule__CpropertyAssignment__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_2_0()); }
	('[')
	{ after(grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_2__1__Impl
	rule__CpropertyAssignment__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getCindexAssignment_2_1()); }
	(rule__CpropertyAssignment__CindexAssignment_2_1)
	{ after(grammarAccess.getCpropertyAssignmentAccess().getCindexAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_2_2()); }
	']'
	{ after(grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyAssignment__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3__0__Impl
	rule__CpropertyAssignment__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getFullStopKeyword_3_0()); }
	'.'
	{ after(grammarAccess.getCpropertyAssignmentAccess().getFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3__1__Impl
	rule__CpropertyAssignment__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getPropertyAssignment_3_1()); }
	(rule__CpropertyAssignment__PropertyAssignment_3_1)
	{ after(grammarAccess.getCpropertyAssignmentAccess().getPropertyAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getGroup_3_2()); }
	(rule__CpropertyAssignment__Group_3_2__0)?
	{ after(grammarAccess.getCpropertyAssignmentAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyAssignment__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3_2__0__Impl
	rule__CpropertyAssignment__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_3_2_0()); }
	('[')
	{ after(grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3_2__1__Impl
	rule__CpropertyAssignment__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getPindexAssignment_3_2_1()); }
	(rule__CpropertyAssignment__PindexAssignment_3_2_1)
	{ after(grammarAccess.getCpropertyAssignmentAccess().getPindexAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyAssignment__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_3_2_2()); }
	']'
	{ after(grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyStream__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__0__Impl
	rule__StrategyStream__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getStreamKeyword_0()); }
	'stream'
	{ after(grammarAccess.getStrategyStreamAccess().getStreamKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__1__Impl
	rule__StrategyStream__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getInputsAssignment_1()); }
	(rule__StrategyStream__InputsAssignment_1)
	{ after(grammarAccess.getStrategyStreamAccess().getInputsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__2__Impl
	rule__StrategyStream__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getGroup_2()); }
	(rule__StrategyStream__Group_2__0)*
	{ after(grammarAccess.getStrategyStreamAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__3__Impl
	rule__StrategyStream__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_3()); }
	'>>'
	{ after(grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__4__Impl
	rule__StrategyStream__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getStrategyAssignment_4()); }
	(rule__StrategyStream__StrategyAssignment_4)
	{ after(grammarAccess.getStrategyStreamAccess().getStrategyAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__5__Impl
	rule__StrategyStream__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_5()); }
	'>>'
	{ after(grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__6__Impl
	rule__StrategyStream__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getOutputsAssignment_6()); }
	(rule__StrategyStream__OutputsAssignment_6)
	{ after(grammarAccess.getStrategyStreamAccess().getOutputsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getGroup_7()); }
	(rule__StrategyStream__Group_7__0)*
	{ after(grammarAccess.getStrategyStreamAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyStream__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group_2__0__Impl
	rule__StrategyStream__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getStrategyStreamAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getInputsAssignment_2_1()); }
	(rule__StrategyStream__InputsAssignment_2_1)
	{ after(grammarAccess.getStrategyStreamAccess().getInputsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StrategyStream__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group_7__0__Impl
	rule__StrategyStream__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getStrategyStreamAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StrategyStream__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStrategyStreamAccess().getOutputsAssignment_7_1()); }
	(rule__StrategyStream__OutputsAssignment_7_1)
	{ after(grammarAccess.getStrategyStreamAccess().getOutputsAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DictAssignment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group__0__Impl
	rule__DictAssignment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getDictAssignment_0()); }
	(rule__DictAssignment__DictAssignment_0)
	{ after(grammarAccess.getDictAssignmentAccess().getDictAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group__1__Impl
	rule__DictAssignment__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getGroup_1()); }
	(rule__DictAssignment__Group_1__0)*
	{ after(grammarAccess.getDictAssignmentAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group__2__Impl
	rule__DictAssignment__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getDictAssignmentAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getVarAssignment_3()); }
	(rule__DictAssignment__VarAssignment_3)
	{ after(grammarAccess.getDictAssignmentAccess().getVarAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DictAssignment__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group_1__0__Impl
	rule__DictAssignment__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getLeftSquareBracketKeyword_1_0()); }
	'['
	{ after(grammarAccess.getDictAssignmentAccess().getLeftSquareBracketKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group_1__1__Impl
	rule__DictAssignment__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getElementsAssignment_1_1()); }
	(rule__DictAssignment__ElementsAssignment_1_1)
	{ after(grammarAccess.getDictAssignmentAccess().getElementsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DictAssignment__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDictAssignmentAccess().getRightSquareBracketKeyword_1_2()); }
	']'
	{ after(grammarAccess.getDictAssignmentAccess().getRightSquareBracketKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ZipEnumerate__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__0__Impl
	rule__ZipEnumerate__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getForKeyword_0()); }
	'for'
	{ after(grammarAccess.getZipEnumerateAccess().getForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__1__Impl
	rule__ZipEnumerate__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getVarsAssignment_1()); }
	(rule__ZipEnumerate__VarsAssignment_1)
	{ after(grammarAccess.getZipEnumerateAccess().getVarsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__2__Impl
	rule__ZipEnumerate__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getGroup_2()); }
	(rule__ZipEnumerate__Group_2__0)*
	{ after(grammarAccess.getZipEnumerateAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__3__Impl
	rule__ZipEnumerate__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getInKeyword_3()); }
	'in'
	{ after(grammarAccess.getZipEnumerateAccess().getInKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__4__Impl
	rule__ZipEnumerate__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getFnameAssignment_4()); }
	(rule__ZipEnumerate__FnameAssignment_4)
	{ after(grammarAccess.getZipEnumerateAccess().getFnameAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__5__Impl
	rule__ZipEnumerate__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getLeftParenthesisKeyword_5()); }
	'('
	{ after(grammarAccess.getZipEnumerateAccess().getLeftParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__6__Impl
	rule__ZipEnumerate__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getSetsAssignment_6()); }
	(rule__ZipEnumerate__SetsAssignment_6)
	{ after(grammarAccess.getZipEnumerateAccess().getSetsAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__7__Impl
	rule__ZipEnumerate__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getGroup_7()); }
	(rule__ZipEnumerate__Group_7__0)*
	{ after(grammarAccess.getZipEnumerateAccess().getGroup_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__8__Impl
	rule__ZipEnumerate__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getRightParenthesisKeyword_8()); }
	')'
	{ after(grammarAccess.getZipEnumerateAccess().getRightParenthesisKeyword_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getActionAssignment_9()); }
	(rule__ZipEnumerate__ActionAssignment_9)
	{ after(grammarAccess.getZipEnumerateAccess().getActionAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ZipEnumerate__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group_2__0__Impl
	rule__ZipEnumerate__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getZipEnumerateAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getVarsAssignment_2_1()); }
	(rule__ZipEnumerate__VarsAssignment_2_1)
	{ after(grammarAccess.getZipEnumerateAccess().getVarsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ZipEnumerate__Group_7__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group_7__0__Impl
	rule__ZipEnumerate__Group_7__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_7__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getCommaKeyword_7_0()); }
	','
	{ after(grammarAccess.getZipEnumerateAccess().getCommaKeyword_7_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_7__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ZipEnumerate__Group_7__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__Group_7__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getZipEnumerateAccess().getSetsAssignment_7_1()); }
	(rule__ZipEnumerate__SetsAssignment_7_1)
	{ after(grammarAccess.getZipEnumerateAccess().getSetsAssignment_7_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Append__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__0__Impl
	rule__Append__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getPythonlistAssignment_0()); }
	(rule__Append__PythonlistAssignment_0)
	{ after(grammarAccess.getAppendAccess().getPythonlistAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__1__Impl
	rule__Append__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getAppendAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__2__Impl
	rule__Append__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getAppendKeyword_2()); }
	'append'
	{ after(grammarAccess.getAppendAccess().getAppendKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__3__Impl
	rule__Append__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getLeftParenthesisKeyword_3()); }
	'('
	{ after(grammarAccess.getAppendAccess().getLeftParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__4__Impl
	rule__Append__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getElementAssignment_4()); }
	(rule__Append__ElementAssignment_4)
	{ after(grammarAccess.getAppendAccess().getElementAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Append__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAppendAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getAppendAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Increment__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Increment__Group__0__Impl
	rule__Increment__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Increment__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIncrementAccess().getVarAssignment_0()); }
	(rule__Increment__VarAssignment_0)
	{ after(grammarAccess.getIncrementAccess().getVarAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Increment__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Increment__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Increment__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIncrementAccess().getPlusSignPlusSignKeyword_1()); }
	'++'
	{ after(grammarAccess.getIncrementAccess().getPlusSignPlusSignKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decrement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decrement__Group__0__Impl
	rule__Decrement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decrement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecrementAccess().getVarAssignment_0()); }
	(rule__Decrement__VarAssignment_0)
	{ after(grammarAccess.getDecrementAccess().getVarAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decrement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decrement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decrement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecrementAccess().getHyphenMinusHyphenMinusKeyword_1()); }
	'--'
	{ after(grammarAccess.getDecrementAccess().getHyphenMinusHyphenMinusKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__0__Impl
	rule__ForAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getForKeyword_0()); }
	'for'
	{ after(grammarAccess.getForActionAccess().getForKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__1__Impl
	rule__ForAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getForActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__2__Impl
	rule__ForAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getVariableAssignment_2()); }
	(rule__ForAction__VariableAssignment_2)
	{ after(grammarAccess.getForActionAccess().getVariableAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__3__Impl
	rule__ForAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getGroup_3()); }
	(rule__ForAction__Group_3__0)?
	{ after(grammarAccess.getForActionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__4__Impl
	rule__ForAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getInKeyword_4()); }
	'in'
	{ after(grammarAccess.getForActionAccess().getInKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__5__Impl
	rule__ForAction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getArrayAssignment_5()); }
	(rule__ForAction__ArrayAssignment_5)
	{ after(grammarAccess.getForActionAccess().getArrayAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__6__Impl
	rule__ForAction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getRightParenthesisKeyword_6()); }
	')'
	{ after(grammarAccess.getForActionAccess().getRightParenthesisKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getActionAssignment_7()); }
	(rule__ForAction__ActionAssignment_7)
	{ after(grammarAccess.getForActionAccess().getActionAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ForAction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group_3__0__Impl
	rule__ForAction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getForActionAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ForAction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getForActionAccess().getIndexAssignment_3_1()); }
	(rule__ForAction__IndexAssignment_3_1)
	{ after(grammarAccess.getForActionAccess().getIndexAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PyforAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__0__Impl
	rule__PyforAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getExforKeyword_0()); }
	'exfor'
	{ after(grammarAccess.getPyforActionAccess().getExforKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__1__Impl
	rule__PyforAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getPyforActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__2__Impl
	rule__PyforAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getVariablesAssignment_2()); }
	(rule__PyforAction__VariablesAssignment_2)
	{ after(grammarAccess.getPyforActionAccess().getVariablesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__3__Impl
	rule__PyforAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getGroup_3()); }
	(rule__PyforAction__Group_3__0)*
	{ after(grammarAccess.getPyforActionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__4__Impl
	rule__PyforAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getInKeyword_4()); }
	'in'
	{ after(grammarAccess.getPyforActionAccess().getInKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__5__Impl
	rule__PyforAction__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getArraysAssignment_5()); }
	(rule__PyforAction__ArraysAssignment_5)
	{ after(grammarAccess.getPyforActionAccess().getArraysAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__6__Impl
	rule__PyforAction__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getGroup_6()); }
	(rule__PyforAction__Group_6__0)*
	{ after(grammarAccess.getPyforActionAccess().getGroup_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__7__Impl
	rule__PyforAction__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getRightParenthesisKeyword_7()); }
	')'
	{ after(grammarAccess.getPyforActionAccess().getRightParenthesisKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group__8__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getActionAssignment_8()); }
	(rule__PyforAction__ActionAssignment_8)
	{ after(grammarAccess.getPyforActionAccess().getActionAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PyforAction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group_3__0__Impl
	rule__PyforAction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getPyforActionAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getVariablesAssignment_3_1()); }
	(rule__PyforAction__VariablesAssignment_3_1)
	{ after(grammarAccess.getPyforActionAccess().getVariablesAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PyforAction__Group_6__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group_6__0__Impl
	rule__PyforAction__Group_6__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_6__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getCommaKeyword_6_0()); }
	','
	{ after(grammarAccess.getPyforActionAccess().getCommaKeyword_6_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_6__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PyforAction__Group_6__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__Group_6__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPyforActionAccess().getArraysAssignment_6_1()); }
	(rule__PyforAction__ArraysAssignment_6_1)
	{ after(grammarAccess.getPyforActionAccess().getArraysAssignment_6_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LoopAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopAction__Group__0__Impl
	rule__LoopAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopActionAccess().getWhileKeyword_0()); }
	'while'
	{ after(grammarAccess.getLoopActionAccess().getWhileKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopAction__Group__1__Impl
	rule__LoopAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getLoopActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopAction__Group__2__Impl
	rule__LoopAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopActionAccess().getConditionAssignment_2()); }
	(rule__LoopAction__ConditionAssignment_2)
	{ after(grammarAccess.getLoopActionAccess().getConditionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopAction__Group__3__Impl
	rule__LoopAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopActionAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getLoopActionAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LoopAction__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLoopActionAccess().getActionAssignment_4()); }
	(rule__LoopAction__ActionAssignment_4)
	{ after(grammarAccess.getLoopActionAccess().getActionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__0__Impl
	rule__ConditionalAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getIfKeyword_0()); }
	'if'
	{ after(grammarAccess.getConditionalActionAccess().getIfKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__1__Impl
	rule__ConditionalAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__2__Impl
	rule__ConditionalAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getConditionAssignment_2()); }
	(rule__ConditionalAction__ConditionAssignment_2)
	{ after(grammarAccess.getConditionalActionAccess().getConditionAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__3__Impl
	rule__ConditionalAction__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__4__Impl
	rule__ConditionalAction__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getActionAssignment_4()); }
	(rule__ConditionalAction__ActionAssignment_4)
	{ after(grammarAccess.getConditionalActionAccess().getActionAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getGroup_5()); }
	(rule__ConditionalAction__Group_5__0)?
	{ after(grammarAccess.getConditionalActionAccess().getGroup_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConditionalAction__Group_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group_5__0__Impl
	rule__ConditionalAction__Group_5__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group_5__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getElseKeyword_5_0()); }
	('else')
	{ after(grammarAccess.getConditionalActionAccess().getElseKeyword_5_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConditionalAction__Group_5__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__Group_5__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConditionalActionAccess().getElseActionAssignment_5_1()); }
	(rule__ConditionalAction__ElseActionAssignment_5_1)
	{ after(grammarAccess.getConditionalActionAccess().getElseActionAssignment_5_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReturnAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group__0__Impl
	rule__ReturnAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getReturnActionAction_0()); }
	()
	{ after(grammarAccess.getReturnActionAccess().getReturnActionAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group__1__Impl
	rule__ReturnAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getReturnKeyword_1()); }
	'return'
	{ after(grammarAccess.getReturnActionAccess().getReturnKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group__2__Impl
	rule__ReturnAction__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getExpAssignment_2()); }
	(rule__ReturnAction__ExpAssignment_2)?
	{ after(grammarAccess.getReturnActionAccess().getExpAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getGroup_3()); }
	(rule__ReturnAction__Group_3__0)*
	{ after(grammarAccess.getReturnActionAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ReturnAction__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group_3__0__Impl
	rule__ReturnAction__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getCommaKeyword_3_0()); }
	','
	{ after(grammarAccess.getReturnActionAccess().getCommaKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ReturnAction__Group_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getReturnActionAccess().getExtraExpAssignment_3_1()); }
	(rule__ReturnAction__ExtraExpAssignment_3_1)
	{ after(grammarAccess.getReturnActionAccess().getExtraExpAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrintAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintAction__Group__0__Impl
	rule__PrintAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintActionAccess().getAlternatives_0()); }
	(rule__PrintAction__Alternatives_0)
	{ after(grammarAccess.getPrintActionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintAction__Group__1__Impl
	rule__PrintAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintActionAccess().getMsgAssignment_1()); }
	(rule__PrintAction__MsgAssignment_1)
	{ after(grammarAccess.getPrintActionAccess().getMsgAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintAction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintActionAccess().getGroup_2()); }
	(rule__PrintAction__Group_2__0)*
	{ after(grammarAccess.getPrintActionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PrintAction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintAction__Group_2__0__Impl
	rule__PrintAction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintActionAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getPrintActionAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PrintAction__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrintActionAccess().getMsgAssignment_2_1()); }
	(rule__PrintAction__MsgAssignment_2_1)
	{ after(grammarAccess.getPrintActionAccess().getMsgAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ErrorAction__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ErrorAction__Group__0__Impl
	rule__ErrorAction__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorActionAccess().getAlternatives_0()); }
	(rule__ErrorAction__Alternatives_0)
	{ after(grammarAccess.getErrorActionAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ErrorAction__Group__1__Impl
	rule__ErrorAction__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorActionAccess().getMsgAssignment_1()); }
	(rule__ErrorAction__MsgAssignment_1)
	{ after(grammarAccess.getErrorActionAccess().getMsgAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ErrorAction__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorActionAccess().getGroup_2()); }
	(rule__ErrorAction__Group_2__0)*
	{ after(grammarAccess.getErrorActionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ErrorAction__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ErrorAction__Group_2__0__Impl
	rule__ErrorAction__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorActionAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getErrorActionAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ErrorAction__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getErrorActionAccess().getMsgAssignment_2_1()); }
	(rule__ErrorAction__MsgAssignment_2_1)
	{ after(grammarAccess.getErrorActionAccess().getMsgAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StartSession__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartSession__Group__0__Impl
	rule__StartSession__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StartSession__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartSessionAccess().getForkKeyword_0()); }
	'fork'
	{ after(grammarAccess.getStartSessionAccess().getForkKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartSession__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StartSession__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StartSession__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStartSessionAccess().getSessionAssignment_1()); }
	(rule__StartSession__SessionAssignment_1)
	{ after(grammarAccess.getStartSessionAccess().getSessionAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallStatement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group__0__Impl
	rule__FunctionCallStatement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getFunctionAssignment_0()); }
	(rule__FunctionCallStatement__FunctionAssignment_0)
	{ after(grammarAccess.getFunctionCallStatementAccess().getFunctionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group__1__Impl
	rule__FunctionCallStatement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getFunctionCallStatementAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group__2__Impl
	rule__FunctionCallStatement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getGroup_2()); }
	(rule__FunctionCallStatement__Group_2__0)?
	{ after(grammarAccess.getFunctionCallStatementAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getFunctionCallStatementAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallStatement__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group_2__0__Impl
	rule__FunctionCallStatement__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_0()); }
	(rule__FunctionCallStatement__ParametersAssignment_2_0)
	{ after(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getGroup_2_1()); }
	(rule__FunctionCallStatement__Group_2_1__0)*
	{ after(grammarAccess.getFunctionCallStatementAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallStatement__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group_2_1__0__Impl
	rule__FunctionCallStatement__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getFunctionCallStatementAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallStatement__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_1_1()); }
	(rule__FunctionCallStatement__ParametersAssignment_2_1_1)
	{ after(grammarAccess.getFunctionCallStatementAccess().getParametersAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__0__Impl
	rule__OrExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
	ruleAndExpression
	{ after(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getGroup_1()); }
	(rule__OrExpression__Group_1__0)*
	{ after(grammarAccess.getOrExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__0__Impl
	rule__OrExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__1__Impl
	rule__OrExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); }
	'or'
	{ after(grammarAccess.getOrExpressionAccess().getOrKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); }
	(rule__OrExpression__RhsAssignment_1_2)
	{ after(grammarAccess.getOrExpressionAccess().getRhsAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__0__Impl
	rule__AndExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getEqualityParserRuleCall_0()); }
	ruleEquality
	{ after(grammarAccess.getAndExpressionAccess().getEqualityParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getGroup_1()); }
	(rule__AndExpression__Group_1__0)*
	{ after(grammarAccess.getAndExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__0__Impl
	rule__AndExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__1__Impl
	rule__AndExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); }
	'and'
	{ after(grammarAccess.getAndExpressionAccess().getAndKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpression__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); }
	(rule__AndExpression__RhsAssignment_1_2)
	{ after(grammarAccess.getAndExpressionAccess().getRhsAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group__0__Impl
	rule__Equality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getComparaisonParserRuleCall_0()); }
	ruleComparaison
	{ after(grammarAccess.getEqualityAccess().getComparaisonParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getAlternatives_1()); }
	(rule__Equality__Alternatives_1)*
	{ after(grammarAccess.getEqualityAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_0__0__Impl
	rule__Equality__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0()); }
	()
	{ after(grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_0__1__Impl
	rule__Equality__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1()); }
	'=='
	{ after(grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getRhsAssignment_1_0_2()); }
	(rule__Equality__RhsAssignment_1_0_2)
	{ after(grammarAccess.getEqualityAccess().getRhsAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Equality__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_1__0__Impl
	rule__Equality__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0()); }
	()
	{ after(grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_1__1__Impl
	rule__Equality__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); }
	'!='
	{ after(grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Equality__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEqualityAccess().getRhsAssignment_1_1_2()); }
	(rule__Equality__RhsAssignment_1_1_2)
	{ after(grammarAccess.getEqualityAccess().getRhsAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparaison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group__0__Impl
	rule__Comparaison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getAdditionParserRuleCall_0()); }
	ruleAddition
	{ after(grammarAccess.getComparaisonAccess().getAdditionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getAlternatives_1()); }
	(rule__Comparaison__Alternatives_1)*
	{ after(grammarAccess.getComparaisonAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparaison__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_0__0__Impl
	rule__Comparaison__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0()); }
	()
	{ after(grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_0__1__Impl
	rule__Comparaison__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getGreaterThanSignKeyword_1_0_1()); }
	'>'
	{ after(grammarAccess.getComparaisonAccess().getGreaterThanSignKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getRhsAssignment_1_0_2()); }
	(rule__Comparaison__RhsAssignment_1_0_2)
	{ after(grammarAccess.getComparaisonAccess().getRhsAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparaison__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_1__0__Impl
	rule__Comparaison__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0()); }
	()
	{ after(grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_1__1__Impl
	rule__Comparaison__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getLessThanSignKeyword_1_1_1()); }
	'<'
	{ after(grammarAccess.getComparaisonAccess().getLessThanSignKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getRhsAssignment_1_1_2()); }
	(rule__Comparaison__RhsAssignment_1_1_2)
	{ after(grammarAccess.getComparaisonAccess().getRhsAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparaison__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_2__0__Impl
	rule__Comparaison__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0()); }
	()
	{ after(grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_2__1__Impl
	rule__Comparaison__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); }
	'>='
	{ after(grammarAccess.getComparaisonAccess().getGreaterThanSignEqualsSignKeyword_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getRhsAssignment_1_2_2()); }
	(rule__Comparaison__RhsAssignment_1_2_2)
	{ after(grammarAccess.getComparaisonAccess().getRhsAssignment_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Comparaison__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_3__0__Impl
	rule__Comparaison__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0()); }
	()
	{ after(grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_3__1__Impl
	rule__Comparaison__Group_1_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getLessThanSignEqualsSignKeyword_1_3_1()); }
	'<='
	{ after(grammarAccess.getComparaisonAccess().getLessThanSignEqualsSignKeyword_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Comparaison__Group_1_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__Group_1_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getComparaisonAccess().getRhsAssignment_1_3_2()); }
	(rule__Comparaison__RhsAssignment_1_3_2)
	{ after(grammarAccess.getComparaisonAccess().getRhsAssignment_1_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__0__Impl
	rule__Addition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); }
	ruleMultiplication
	{ after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getAlternatives_1()); }
	(rule__Addition__Alternatives_1)*
	{ after(grammarAccess.getAdditionAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0__0__Impl
	rule__Addition__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0()); }
	()
	{ after(grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0__1__Impl
	rule__Addition__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1()); }
	'+'
	{ after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getRhsAssignment_1_0_2()); }
	(rule__Addition__RhsAssignment_1_0_2)
	{ after(grammarAccess.getAdditionAccess().getRhsAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Addition__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_1__0__Impl
	rule__Addition__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0()); }
	()
	{ after(grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_1__1__Impl
	rule__Addition__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); }
	'-'
	{ after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Addition__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAdditionAccess().getRhsAssignment_1_1_2()); }
	(rule__Addition__RhsAssignment_1_1_2)
	{ after(grammarAccess.getAdditionAccess().getRhsAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__0__Impl
	rule__Multiplication__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getCastExpressionParserRuleCall_0()); }
	ruleCastExpression
	{ after(grammarAccess.getMultiplicationAccess().getCastExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getAlternatives_1()); }
	(rule__Multiplication__Alternatives_1)*
	{ after(grammarAccess.getMultiplicationAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0__0__Impl
	rule__Multiplication__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0__1__Impl
	rule__Multiplication__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1()); }
	'*'
	{ after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_0_2()); }
	(rule__Multiplication__RhsAssignment_1_0_2)
	{ after(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_1__0__Impl
	rule__Multiplication__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_1__1__Impl
	rule__Multiplication__Group_1_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); }
	'/'
	{ after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_1_2()); }
	(rule__Multiplication__RhsAssignment_1_1_2)
	{ after(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Multiplication__Group_1_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_2__0__Impl
	rule__Multiplication__Group_1_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0()); }
	()
	{ after(grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_2__1__Impl
	rule__Multiplication__Group_1_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_2_1()); }
	'%'
	{ after(grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Multiplication__Group_1_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__Group_1_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2_2()); }
	(rule__Multiplication__RhsAssignment_1_2_2)
	{ after(grammarAccess.getMultiplicationAccess().getRhsAssignment_1_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CastExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group__0__Impl
	rule__CastExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getCastExpressionAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getGroup_1()); }
	(rule__CastExpression__Group_1__0)?
	{ after(grammarAccess.getCastExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CastExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1__0__Impl
	rule__CastExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getCastExpressionTermAction_1_0()); }
	()
	{ after(grammarAccess.getCastExpressionAccess().getCastExpressionTermAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1__1__Impl
	rule__CastExpression__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getAsKeyword_1_1()); }
	'as'
	{ after(grammarAccess.getCastExpressionAccess().getAsKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1__2__Impl
	rule__CastExpression__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getTypeAssignment_1_2()); }
	(rule__CastExpression__TypeAssignment_1_2)
	{ after(grammarAccess.getCastExpressionAccess().getTypeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getGroup_1_3()); }
	(rule__CastExpression__Group_1_3__0)?
	{ after(grammarAccess.getCastExpressionAccess().getGroup_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CastExpression__Group_1_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1_3__0__Impl
	rule__CastExpression__Group_1_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getIsArrayAssignment_1_3_0()); }
	(rule__CastExpression__IsArrayAssignment_1_3_0)
	{ after(grammarAccess.getCastExpressionAccess().getIsArrayAssignment_1_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CastExpression__Group_1_3__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__Group_1_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCastExpressionAccess().getRightSquareBracketKeyword_1_3_1()); }
	']'
	{ after(grammarAccess.getCastExpressionAccess().getRightSquareBracketKeyword_1_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__0__Impl
	rule__Primary__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpressionGroupAction_0_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getExpressionGroupAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__1__Impl
	rule__Primary__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__2__Impl
	rule__Primary__Group_0__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getTermAssignment_0_2()); }
	(rule__Primary__TermAssignment_0_2)
	{ after(grammarAccess.getPrimaryAccess().getTermAssignment_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_0__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_0__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getNotExpressionAction_1_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getNotExpressionAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__1__Impl
	rule__Primary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getNotKeyword_1_1()); }
	'not'
	{ after(grammarAccess.getPrimaryAccess().getNotKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getTermAssignment_1_2()); }
	(rule__Primary__TermAssignment_1_2)
	{ after(grammarAccess.getPrimaryAccess().getTermAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__0__Impl
	rule__Primary__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); }
	()
	{ after(grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__1__Impl
	rule__Primary__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); }
	'-'
	{ after(grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getTermAssignment_2_2()); }
	(rule__Primary__TermAssignment_2_2)
	{ after(grammarAccess.getPrimaryAccess().getTermAssignment_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayIndexPostfix__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group__0__Impl
	rule__ArrayIndexPostfix__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getAtomicExpressionParserRuleCall_0()); }
	ruleAtomicExpression
	{ after(grammarAccess.getArrayIndexPostfixAccess().getAtomicExpressionParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getGroup_1()); }
	(rule__ArrayIndexPostfix__Group_1__0)?
	{ after(grammarAccess.getArrayIndexPostfixAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayIndexPostfix__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group_1__0__Impl
	rule__ArrayIndexPostfix__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0()); }
	()
	{ after(grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group_1__1__Impl
	rule__ArrayIndexPostfix__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getLeftSquareBracketKeyword_1_1()); }
	'['
	{ after(grammarAccess.getArrayIndexPostfixAccess().getLeftSquareBracketKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group_1__2__Impl
	rule__ArrayIndexPostfix__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getIndexAssignment_1_2()); }
	(rule__ArrayIndexPostfix__IndexAssignment_1_2)
	{ after(grammarAccess.getArrayIndexPostfixAccess().getIndexAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayIndexPostfix__Group_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayIndexPostfixAccess().getRightSquareBracketKeyword_1_3()); }
	']'
	{ after(grammarAccess.getArrayIndexPostfixAccess().getRightSquareBracketKeyword_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternExpression__Group__0__Impl
	rule__ExternExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternExpressionAccess().getExpressionAssignment_0()); }
	(rule__ExternExpression__ExpressionAssignment_0)
	{ after(grammarAccess.getExternExpressionAccess().getExpressionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternExpression__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternExpressionAccess().getGroup_1()); }
	(rule__ExternExpression__Group_1__0)*
	{ after(grammarAccess.getExternExpressionAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternExpression__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternExpression__Group_1__0__Impl
	rule__ExternExpression__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0()); }
	'&'
	{ after(grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternExpression__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternExpressionAccess().getSegmentsAssignment_1_1()); }
	(rule__ExternExpression__SegmentsAssignment_1_1)
	{ after(grammarAccess.getExternExpressionAccess().getSegmentsAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayInit__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group__0__Impl
	rule__ArrayInit__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getLeftCurlyBracketKeyword_0()); }
	'{'
	{ after(grammarAccess.getArrayInitAccess().getLeftCurlyBracketKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group__1__Impl
	rule__ArrayInit__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getValuesAssignment_1()); }
	(rule__ArrayInit__ValuesAssignment_1)
	{ after(grammarAccess.getArrayInitAccess().getValuesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group__2__Impl
	rule__ArrayInit__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getGroup_2()); }
	(rule__ArrayInit__Group_2__0)*
	{ after(grammarAccess.getArrayInitAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getRightCurlyBracketKeyword_3()); }
	'}'
	{ after(grammarAccess.getArrayInitAccess().getRightCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ArrayInit__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group_2__0__Impl
	rule__ArrayInit__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getArrayInitAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ArrayInit__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getArrayInitAccess().getValuesAssignment_2_1()); }
	(rule__ArrayInit__ValuesAssignment_2_1)
	{ after(grammarAccess.getArrayInitAccess().getValuesAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EnumLiteralRef__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralRef__Group__0__Impl
	rule__EnumLiteralRef__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralRefAccess().getEnumAssignment_0()); }
	(rule__EnumLiteralRef__EnumAssignment_0)
	{ after(grammarAccess.getEnumLiteralRefAccess().getEnumAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralRef__Group__1__Impl
	rule__EnumLiteralRef__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralRefAccess().getColonKeyword_1()); }
	':'
	{ after(grammarAccess.getEnumLiteralRefAccess().getColonKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EnumLiteralRef__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEnumLiteralRefAccess().getLiteralAssignment_2()); }
	(rule__EnumLiteralRef__LiteralAssignment_2)
	{ after(grammarAccess.getEnumLiteralRefAccess().getLiteralAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanLiteral__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group_1__0__Impl
	rule__BooleanLiteral__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0()); }
	()
	{ after(grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanLiteral__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
	'false'
	{ after(grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group__0__Impl
	rule__CpropertyReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getEntityKeyword_0()); }
	'entity'
	{ after(grammarAccess.getCpropertyReferenceAccess().getEntityKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group__1__Impl
	rule__CpropertyReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getCpropertysAssignment_1()); }
	(rule__CpropertyReference__CpropertysAssignment_1)
	{ after(grammarAccess.getCpropertyReferenceAccess().getCpropertysAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group__2__Impl
	rule__CpropertyReference__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getGroup_2()); }
	(rule__CpropertyReference__Group_2__0)?
	{ after(grammarAccess.getCpropertyReferenceAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getGroup_3()); }
	(rule__CpropertyReference__Group_3__0)?
	{ after(grammarAccess.getCpropertyReferenceAccess().getGroup_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyReference__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_2__0__Impl
	rule__CpropertyReference__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_2_0()); }
	('[')
	{ after(grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_2__1__Impl
	rule__CpropertyReference__Group_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getCindexAssignment_2_1()); }
	(rule__CpropertyReference__CindexAssignment_2_1)
	{ after(grammarAccess.getCpropertyReferenceAccess().getCindexAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_2_2()); }
	']'
	{ after(grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyReference__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3__0__Impl
	rule__CpropertyReference__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getFullStopKeyword_3_0()); }
	'.'
	{ after(grammarAccess.getCpropertyReferenceAccess().getFullStopKeyword_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3__1__Impl
	rule__CpropertyReference__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getPropertyAssignment_3_1()); }
	(rule__CpropertyReference__PropertyAssignment_3_1)
	{ after(grammarAccess.getCpropertyReferenceAccess().getPropertyAssignment_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getGroup_3_2()); }
	(rule__CpropertyReference__Group_3_2__0)?
	{ after(grammarAccess.getCpropertyReferenceAccess().getGroup_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CpropertyReference__Group_3_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3_2__0__Impl
	rule__CpropertyReference__Group_3_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_3_2_0()); }
	('[')
	{ after(grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_3_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3_2__1__Impl
	rule__CpropertyReference__Group_3_2__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getPindexAssignment_3_2_1()); }
	(rule__CpropertyReference__PindexAssignment_3_2_1)
	{ after(grammarAccess.getCpropertyReferenceAccess().getPindexAssignment_3_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3_2__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CpropertyReference__Group_3_2__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__Group_3_2__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_3_2_2()); }
	']'
	{ after(grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_3_2_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EventReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventReference__Group__0__Impl
	rule__EventReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventReferenceAccess().getReceiveMsgAssignment_0()); }
	(rule__EventReference__ReceiveMsgAssignment_0)
	{ after(grammarAccess.getEventReferenceAccess().getReceiveMsgAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventReference__Group__1__Impl
	rule__EventReference__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventReferenceAccess().getFullStopKeyword_1()); }
	'.'
	{ after(grammarAccess.getEventReferenceAccess().getFullStopKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EventReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEventReferenceAccess().getParameterAssignment_2()); }
	(rule__EventReference__ParameterAssignment_2)
	{ after(grammarAccess.getEventReferenceAccess().getParameterAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group__0__Impl
	rule__FunctionCallExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_0()); }
	(rule__FunctionCallExpression__FunctionAssignment_0)
	{ after(grammarAccess.getFunctionCallExpressionAccess().getFunctionAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group__1__Impl
	rule__FunctionCallExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_1()); }
	'('
	{ after(grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group__2__Impl
	rule__FunctionCallExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getGroup_2()); }
	(rule__FunctionCallExpression__Group_2__0)?
	{ after(grammarAccess.getFunctionCallExpressionAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_3()); }
	')'
	{ after(grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallExpression__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group_2__0__Impl
	rule__FunctionCallExpression__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_0()); }
	(rule__FunctionCallExpression__ParametersAssignment_2_0)
	{ after(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getGroup_2_1()); }
	(rule__FunctionCallExpression__Group_2_1__0)*
	{ after(grammarAccess.getFunctionCallExpressionAccess().getGroup_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FunctionCallExpression__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group_2_1__0__Impl
	rule__FunctionCallExpression__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_2_1_0()); }
	','
	{ after(grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FunctionCallExpression__Group_2_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_1_1()); }
	(rule__FunctionCallExpression__ParametersAssignment_2_1_1)
	{ after(grammarAccess.getFunctionCallExpressionAccess().getParametersAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Configuration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__0__Impl
	rule__Configuration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); }
	'configuration'
	{ after(grammarAccess.getConfigurationAccess().getConfigurationKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__1__Impl
	rule__Configuration__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getNameAssignment_1()); }
	(rule__Configuration__NameAssignment_1)
	{ after(grammarAccess.getConfigurationAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__2__Impl
	rule__Configuration__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getAnnotationsAssignment_2()); }
	(rule__Configuration__AnnotationsAssignment_2)*
	{ after(grammarAccess.getConfigurationAccess().getAnnotationsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__3__Impl
	rule__Configuration__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__4__Impl
	rule__Configuration__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getAlternatives_4()); }
	(rule__Configuration__Alternatives_4)*
	{ after(grammarAccess.getConfigurationAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Configuration__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); }
	'}'
	{ after(grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Instance__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instance__Group__0__Impl
	rule__Instance__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); }
	'instance'
	{ after(grammarAccess.getInstanceAccess().getInstanceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instance__Group__1__Impl
	rule__Instance__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceAccess().getNameAssignment_1()); }
	(rule__Instance__NameAssignment_1)
	{ after(grammarAccess.getInstanceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instance__Group__2__Impl
	rule__Instance__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceAccess().getColonKeyword_2()); }
	':'
	{ after(grammarAccess.getInstanceAccess().getColonKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instance__Group__3__Impl
	rule__Instance__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceAccess().getTypeAssignment_3()); }
	(rule__Instance__TypeAssignment_3)
	{ after(grammarAccess.getInstanceAccess().getTypeAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Instance__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getInstanceAccess().getAnnotationsAssignment_4()); }
	(rule__Instance__AnnotationsAssignment_4)*
	{ after(grammarAccess.getInstanceAccess().getAnnotationsAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigPropertyAssign__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__0__Impl
	rule__ConfigPropertyAssign__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getSetKeyword_0()); }
	'set'
	{ after(grammarAccess.getConfigPropertyAssignAccess().getSetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__1__Impl
	rule__ConfigPropertyAssign__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getInstanceAssignment_1()); }
	(rule__ConfigPropertyAssign__InstanceAssignment_1)
	{ after(grammarAccess.getConfigPropertyAssignAccess().getInstanceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__2__Impl
	rule__ConfigPropertyAssign__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getFullStopKeyword_2()); }
	'.'
	{ after(grammarAccess.getConfigPropertyAssignAccess().getFullStopKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__3__Impl
	rule__ConfigPropertyAssign__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getPropertyAssignment_3()); }
	(rule__ConfigPropertyAssign__PropertyAssignment_3)
	{ after(grammarAccess.getConfigPropertyAssignAccess().getPropertyAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__4__Impl
	rule__ConfigPropertyAssign__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getGroup_4()); }
	(rule__ConfigPropertyAssign__Group_4__0)?
	{ after(grammarAccess.getConfigPropertyAssignAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__5__Impl
	rule__ConfigPropertyAssign__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getEqualsSignKeyword_5()); }
	'='
	{ after(grammarAccess.getConfigPropertyAssignAccess().getEqualsSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__6__Impl
	rule__ConfigPropertyAssign__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getInitAssignment_6()); }
	(rule__ConfigPropertyAssign__InitAssignment_6)
	{ after(grammarAccess.getConfigPropertyAssignAccess().getInitAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsAssignment_7()); }
	(rule__ConfigPropertyAssign__AnnotationsAssignment_7)*
	{ after(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConfigPropertyAssign__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group_4__0__Impl
	rule__ConfigPropertyAssign__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getLeftSquareBracketKeyword_4_0()); }
	('[')
	{ after(grammarAccess.getConfigPropertyAssignAccess().getLeftSquareBracketKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group_4__1__Impl
	rule__ConfigPropertyAssign__Group_4__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getIndexAssignment_4_1()); }
	(rule__ConfigPropertyAssign__IndexAssignment_4_1)
	{ after(grammarAccess.getConfigPropertyAssignAccess().getIndexAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group_4__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConfigPropertyAssign__Group_4__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__Group_4__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConfigPropertyAssignAccess().getRightSquareBracketKeyword_4_2()); }
	']'
	{ after(grammarAccess.getConfigPropertyAssignAccess().getRightSquareBracketKeyword_4_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Connector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__0__Impl
	rule__Connector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }
	'connector'
	{ after(grammarAccess.getConnectorAccess().getConnectorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__1__Impl
	rule__Connector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getNameAssignment_1()); }
	(rule__Connector__NameAssignment_1)?
	{ after(grammarAccess.getConnectorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__2__Impl
	rule__Connector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getCliAssignment_2()); }
	(rule__Connector__CliAssignment_2)
	{ after(grammarAccess.getConnectorAccess().getCliAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__3__Impl
	rule__Connector__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getFullStopKeyword_3()); }
	'.'
	{ after(grammarAccess.getConnectorAccess().getFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__4__Impl
	rule__Connector__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getRequiredAssignment_4()); }
	(rule__Connector__RequiredAssignment_4)
	{ after(grammarAccess.getConnectorAccess().getRequiredAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__5__Impl
	rule__Connector__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_5()); }
	'=>'
	{ after(grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__6__Impl
	rule__Connector__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getSrvAssignment_6()); }
	(rule__Connector__SrvAssignment_6)
	{ after(grammarAccess.getConnectorAccess().getSrvAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__7__Impl
	rule__Connector__Group__8
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getFullStopKeyword_7()); }
	'.'
	{ after(grammarAccess.getConnectorAccess().getFullStopKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__8
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__8__Impl
	rule__Connector__Group__9
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__8__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getProvidedAssignment_8()); }
	(rule__Connector__ProvidedAssignment_8)
	{ after(grammarAccess.getConnectorAccess().getProvidedAssignment_8()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__9
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Connector__Group__9__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__Group__9__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConnectorAccess().getAnnotationsAssignment_9()); }
	(rule__Connector__AnnotationsAssignment_9)*
	{ after(grammarAccess.getConnectorAccess().getAnnotationsAssignment_9()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExternalConnector__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__0__Impl
	rule__ExternalConnector__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getConnectorKeyword_0()); }
	'connector'
	{ after(grammarAccess.getExternalConnectorAccess().getConnectorKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__1__Impl
	rule__ExternalConnector__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getNameAssignment_1()); }
	(rule__ExternalConnector__NameAssignment_1)?
	{ after(grammarAccess.getExternalConnectorAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__2__Impl
	rule__ExternalConnector__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getInstAssignment_2()); }
	(rule__ExternalConnector__InstAssignment_2)
	{ after(grammarAccess.getExternalConnectorAccess().getInstAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__3__Impl
	rule__ExternalConnector__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getFullStopKeyword_3()); }
	'.'
	{ after(grammarAccess.getExternalConnectorAccess().getFullStopKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__4__Impl
	rule__ExternalConnector__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getPortAssignment_4()); }
	(rule__ExternalConnector__PortAssignment_4)
	{ after(grammarAccess.getExternalConnectorAccess().getPortAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__5__Impl
	rule__ExternalConnector__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getOverKeyword_5()); }
	'over'
	{ after(grammarAccess.getExternalConnectorAccess().getOverKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__6__Impl
	rule__ExternalConnector__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getProtocolAssignment_6()); }
	(rule__ExternalConnector__ProtocolAssignment_6)
	{ after(grammarAccess.getExternalConnectorAccess().getProtocolAssignment_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExternalConnector__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExternalConnectorAccess().getAnnotationsAssignment_7()); }
	(rule__ExternalConnector__AnnotationsAssignment_7)*
	{ after(grammarAccess.getExternalConnectorAccess().getAnnotationsAssignment_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__State__UnorderedGroup_3_5
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
	}
:
	rule__State__UnorderedGroup_3_5__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
	restoreStackSize(stackSize);
}

rule__State__UnorderedGroup_3_5__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getStateAccess().getGroup_3_5_0()); }
					(rule__State__Group_3_5_0__0)
					{ after(grammarAccess.getStateAccess().getGroup_3_5_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getStateAccess().getGroup_3_5_1()); }
					(rule__State__Group_3_5_1__0)
					{ after(grammarAccess.getStateAccess().getGroup_3_5_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getStateAccess().getAlternatives_3_5_2()); }
						(rule__State__Alternatives_3_5_2)
						{ after(grammarAccess.getStateAccess().getAlternatives_3_5_2()); }
					)
					(
						{ before(grammarAccess.getStateAccess().getAlternatives_3_5_2()); }
						((rule__State__Alternatives_3_5_2)=>rule__State__Alternatives_3_5_2)*
						{ after(grammarAccess.getStateAccess().getAlternatives_3_5_2()); }
					)
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
	restoreStackSize(stackSize);
}

rule__State__UnorderedGroup_3_5__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__UnorderedGroup_3_5__Impl
	rule__State__UnorderedGroup_3_5__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__State__UnorderedGroup_3_5__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__UnorderedGroup_3_5__Impl
	rule__State__UnorderedGroup_3_5__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__State__UnorderedGroup_3_5__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__State__UnorderedGroup_3_5__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__CompositeState__UnorderedGroup_9
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
	}
:
	rule__CompositeState__UnorderedGroup_9__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
	restoreStackSize(stackSize);
}

rule__CompositeState__UnorderedGroup_9__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCompositeStateAccess().getGroup_9_0()); }
					(rule__CompositeState__Group_9_0__0)
					{ after(grammarAccess.getCompositeStateAccess().getGroup_9_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getCompositeStateAccess().getGroup_9_1()); }
					(rule__CompositeState__Group_9_1__0)
					{ after(grammarAccess.getCompositeStateAccess().getGroup_9_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getCompositeStateAccess().getAlternatives_9_2()); }
						(rule__CompositeState__Alternatives_9_2)
						{ after(grammarAccess.getCompositeStateAccess().getAlternatives_9_2()); }
					)
					(
						{ before(grammarAccess.getCompositeStateAccess().getAlternatives_9_2()); }
						((rule__CompositeState__Alternatives_9_2)=>rule__CompositeState__Alternatives_9_2)*
						{ after(grammarAccess.getCompositeStateAccess().getAlternatives_9_2()); }
					)
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
	restoreStackSize(stackSize);
}

rule__CompositeState__UnorderedGroup_9__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__UnorderedGroup_9__Impl
	rule__CompositeState__UnorderedGroup_9__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__UnorderedGroup_9__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__UnorderedGroup_9__Impl
	rule__CompositeState__UnorderedGroup_9__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__UnorderedGroup_9__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CompositeState__UnorderedGroup_9__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__StateMachine__UnorderedGroup_8
	@init {
		int stackSize = keepStackSize();
		getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
	}
:
	rule__StateMachine__UnorderedGroup_8__0
	?
;
finally {
	getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}

rule__StateMachine__UnorderedGroup_8__Impl
	@init {
		int stackSize = keepStackSize();
		boolean selected = false;
	}
:
		(
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getStateMachineAccess().getGroup_8_0()); }
					(rule__StateMachine__Group_8_0__0)
					{ after(grammarAccess.getStateMachineAccess().getGroup_8_0()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1);
				}
				{
					selected = true;
				}
				(
					{ before(grammarAccess.getStateMachineAccess().getGroup_8_1()); }
					(rule__StateMachine__Group_8_1__0)
					{ after(grammarAccess.getStateMachineAccess().getGroup_8_1()); }
				)
			)
		)|
		( 
			{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2)}?=>(
				{
					getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2);
				}
				{
					selected = true;
				}
				(
					(
						{ before(grammarAccess.getStateMachineAccess().getAlternatives_8_2()); }
						(rule__StateMachine__Alternatives_8_2)
						{ after(grammarAccess.getStateMachineAccess().getAlternatives_8_2()); }
					)
					(
						{ before(grammarAccess.getStateMachineAccess().getAlternatives_8_2()); }
						((rule__StateMachine__Alternatives_8_2)=>rule__StateMachine__Alternatives_8_2)*
						{ after(grammarAccess.getStateMachineAccess().getAlternatives_8_2()); }
					)
				)
			)
		)
		)
;
finally {
	if (selected)
		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
	restoreStackSize(stackSize);
}

rule__StateMachine__UnorderedGroup_8__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__UnorderedGroup_8__Impl
	rule__StateMachine__UnorderedGroup_8__1?
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__UnorderedGroup_8__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__UnorderedGroup_8__Impl
	rule__StateMachine__UnorderedGroup_8__2?
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__UnorderedGroup_8__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StateMachine__UnorderedGroup_8__Impl
;
finally {
	restoreStackSize(stackSize);
}


rule__AiotMLModel__ImportsAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getImportsImportParserRuleCall_0_0()); }
		ruleImport
		{ after(grammarAccess.getAiotMLModelAccess().getImportsImportParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__TemplatesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getTemplatesTemplateParserRuleCall_1_0()); }
		ruleTemplate
		{ after(grammarAccess.getAiotMLModelAccess().getTemplatesTemplateParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__TypesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getTypesTypeParserRuleCall_2_0_0()); }
		ruleType
		{ after(grammarAccess.getAiotMLModelAccess().getTypesTypeParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__ProtocolsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getProtocolsProtocolParserRuleCall_2_1_0()); }
		ruleProtocol
		{ after(grammarAccess.getAiotMLModelAccess().getProtocolsProtocolParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AiotMLModel__ConfigsAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAiotMLModelAccess().getConfigsConfigurationParserRuleCall_2_2_0()); }
		ruleConfiguration
		{ after(grammarAccess.getAiotMLModelAccess().getConfigsConfigurationParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Template__PathAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTemplateAccess().getPathSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTemplateAccess().getPathSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportURIAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__FromAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getFromIDTerminalRuleCall_2_1_0()); }
		RULE_ID
		{ after(grammarAccess.getImportAccess().getFromIDTerminalRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); }
		RULE_ANNOTATION_ID
		{ after(grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__ValueAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_0_0()); }
		RULE_EXTERN
		{ after(grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlatformAnnotation__ValueAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__TypeRefAssignment_0_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getTypeRefTypeRefParserRuleCall_0_3_0()); }
		ruleTypeRef
		{ after(grammarAccess.getVariableAccess().getTypeRefTypeRefParserRuleCall_0_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__TensorAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getTensorTensorParserRuleCall_1_0()); }
		ruleTensor
		{ after(grammarAccess.getVariableAccess().getTensorTensorParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__TypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTypeRefAccess().getTypeTypeIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__IsArrayAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); }
		(
			{ before(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); }
			'['
			{ after(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); }
		)
		{ after(grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeRef__CardinalityAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeRefAccess().getCardinalityAlternatives_1_1_0()); }
		(rule__TypeRef__CardinalityAlternatives_1_1_0)
		{ after(grammarAccess.getTypeRefAccess().getCardinalityAlternatives_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__ByteSizeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getByteSizeINTTerminalRuleCall_3_0()); }
		RULE_INT
		{ after(grammarAccess.getPrimitiveTypeAccess().getByteSizeINTTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrimitiveType__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimitiveTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getPrimitiveTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ObjectType__AnnotationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getObjectTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getObjectTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__TypeRefAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getTypeRefTypeRefParserRuleCall_2_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getEnumerationAccess().getTypeRefTypeRefParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getEnumerationAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Enumeration__LiteralsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0()); }
		ruleEnumerationLiteral
		{ after(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__InitAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getInitLiteralParserRuleCall_1_1_0()); }
		ruleLiteral
		{ after(grammarAccess.getEnumerationLiteralAccess().getInitLiteralParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumerationLiteral__AnnotationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumerationLiteralAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getEnumerationLiteralAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__DimsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_5_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__DimsAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_6_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Tensor__DatatypeAssignment_8_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTensorAccess().getDatatypeIDTerminalRuleCall_8_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTensorAccess().getDatatypeIDTerminalRuleCall_8_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__LayernumsAssignment_5_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__LayernumsAssignment_5_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__NumAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getNumNoneKeyword_5_1_0()); }
		(
			{ before(grammarAccess.getLayerAccess().getNumNoneKeyword_5_1_0()); }
			'None'
			{ after(grammarAccess.getLayerAccess().getNumNoneKeyword_5_1_0()); }
		)
		{ after(grammarAccess.getLayerAccess().getNumNoneKeyword_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Layer__AfAssignment_10
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLayerAccess().getAfAlternatives_10_0()); }
		(rule__Layer__AfAlternatives_10_0)
		{ after(grammarAccess.getLayerAccess().getAfAlternatives_10_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Model__LayersAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getLayersLayerParserRuleCall_4_1_0()); }
		ruleLayer
		{ after(grammarAccess.getModelAccess().getLayersLayerParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelReference__TypeRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelReferenceAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
		ruleTypeRef
		{ after(grammarAccess.getModelReferenceAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__TensorAssignment_3_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_0_2_0()); }
		ruleTensor
		{ after(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__TensorAssignment_3_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_1_2_0()); }
		ruleTensor
		{ after(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__DevicesAssignment_3_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getDevicesCpropertyParserRuleCall_3_2_3_0()); }
		ruleCproperty
		{ after(grammarAccess.getStrategyAccess().getDevicesCpropertyParserRuleCall_3_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__TensorAssignment_3_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_3_2_0()); }
		ruleTensor
		{ after(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__RewdimsAssignment_3_4_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__RewdimsAssignment_3_4_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__ObsdimsAssignment_3_5_5_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__ObsdimsAssignment_3_5_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__ActiondimsAssignment_3_6_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_6_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__ActiondimsAssignment_3_6_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__PmodelAssignment_3_7_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getPmodelModelReferenceParserRuleCall_3_7_2_0()); }
		ruleModelReference
		{ after(grammarAccess.getStrategyAccess().getPmodelModelReferenceParserRuleCall_3_7_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__QmodelAssignment_3_8_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getQmodelModelReferenceParserRuleCall_3_8_2_0()); }
		ruleModelReference
		{ after(grammarAccess.getStrategyAccess().getQmodelModelReferenceParserRuleCall_3_8_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Strategy__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getStrategyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiAgentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMultiAgentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__AgentsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiAgentAccess().getAgentsAgentParserRuleCall_3_0()); }
		ruleAgent
		{ after(grammarAccess.getMultiAgentAccess().getAgentsAgentParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgent__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiAgentAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getMultiAgentAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiAgentPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getMultiAgentPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MultiAgentProperty__TypeRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiAgentPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
		ruleTypeRef
		{ after(grammarAccess.getMultiAgentPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getStrategyPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyProperty__TypeRefAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
		ruleTypeRef
		{ after(grammarAccess.getStrategyPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__StrategyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getStrategyVariableCrossReference_1_0()); }
		(
			{ before(grammarAccess.getStrategyAssignmentAccess().getStrategyVariableIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyAssignmentAccess().getStrategyVariableIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getStrategyAssignmentAccess().getStrategyVariableCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__AgentAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getAgentAgentCrossReference_3_0()); }
		(
			{ before(grammarAccess.getStrategyAssignmentAccess().getAgentAgentIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyAssignmentAccess().getAgentAgentIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getStrategyAssignmentAccess().getAgentAgentCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__RbindFunctionAssignment_5_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionPropertyCrossReference_5_0_2_0()); }
		(
			{ before(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionPropertyIDTerminalRuleCall_5_0_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionPropertyIDTerminalRuleCall_5_0_2_0_1()); }
		)
		{ after(grammarAccess.getStrategyAssignmentAccess().getRbindFunctionPropertyCrossReference_5_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__IbindFunctionAssignment_5_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionPropertyCrossReference_5_1_2_0()); }
		(
			{ before(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionPropertyIDTerminalRuleCall_5_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionPropertyIDTerminalRuleCall_5_1_2_0_1()); }
		)
		{ after(grammarAccess.getStrategyAssignmentAccess().getIbindFunctionPropertyCrossReference_5_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyAssignment__ObindFunctionAssignment_5_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyAssignmentAccess().getObindFunctionPropertyCrossReference_5_2_2_0()); }
		(
			{ before(grammarAccess.getStrategyAssignmentAccess().getObindFunctionPropertyIDTerminalRuleCall_5_2_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyAssignmentAccess().getObindFunctionPropertyIDTerminalRuleCall_5_2_2_0_1()); }
		)
		{ after(grammarAccess.getStrategyAssignmentAccess().getObindFunctionPropertyCrossReference_5_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__FragmentAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0()); }
		(
			{ before(grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0()); }
			'fragment'
			{ after(grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0()); }
		)
		{ after(grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getThingAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__IncludesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getIncludesThingCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getThingAccess().getIncludesThingIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getThingAccess().getIncludesThingIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getThingAccess().getIncludesThingCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__IncludesAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getIncludesThingCrossReference_3_2_1_0()); }
		(
			{ before(grammarAccess.getThingAccess().getIncludesThingIDTerminalRuleCall_3_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getThingAccess().getIncludesThingIDTerminalRuleCall_3_2_1_0_1()); }
		)
		{ after(grammarAccess.getThingAccess().getIncludesThingCrossReference_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__AnnotationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__MessagesAssignment_6_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getMessagesMessageParserRuleCall_6_0_0()); }
		ruleMessage
		{ after(grammarAccess.getThingAccess().getMessagesMessageParserRuleCall_6_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__PortsAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getPortsPortParserRuleCall_6_1_0()); }
		rulePort
		{ after(grammarAccess.getThingAccess().getPortsPortParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__PropertiesAssignment_6_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getPropertiesPropertyParserRuleCall_6_2_0()); }
		ruleProperty
		{ after(grammarAccess.getThingAccess().getPropertiesPropertyParserRuleCall_6_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__CpropertiesAssignment_6_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getCpropertiesCpropertyParserRuleCall_6_3_0()); }
		ruleCproperty
		{ after(grammarAccess.getThingAccess().getCpropertiesCpropertyParserRuleCall_6_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__FunctionsAssignment_6_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getFunctionsFunctionParserRuleCall_6_4_0()); }
		ruleFunction
		{ after(grammarAccess.getThingAccess().getFunctionsFunctionParserRuleCall_6_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__AssignAssignment_6_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getAssignPropertyAssignParserRuleCall_6_5_0()); }
		rulePropertyAssign
		{ after(grammarAccess.getThingAccess().getAssignPropertyAssignParserRuleCall_6_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__StrategysAssignment_6_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getStrategysStrategyPropertyParserRuleCall_6_6_0()); }
		ruleStrategyProperty
		{ after(grammarAccess.getThingAccess().getStrategysStrategyPropertyParserRuleCall_6_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__SassignsAssignment_6_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getSassignsStrategyAssignmentParserRuleCall_6_7_0()); }
		ruleStrategyAssignment
		{ after(grammarAccess.getThingAccess().getSassignsStrategyAssignmentParserRuleCall_6_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__MasAssignment_6_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getMasMultiAgentPropertyParserRuleCall_6_8_0()); }
		ruleMultiAgentProperty
		{ after(grammarAccess.getThingAccess().getMasMultiAgentPropertyParserRuleCall_6_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Thing__BehaviourAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getThingAccess().getBehaviourStateMachineParserRuleCall_7_0()); }
		ruleStateMachine
		{ after(grammarAccess.getThingAccess().getBehaviourStateMachineParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubThingAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSubThingAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__PropertiesAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubThingAccess().getPropertiesPropertyParserRuleCall_3_0_0()); }
		ruleProperty
		{ after(grammarAccess.getSubThingAccess().getPropertiesPropertyParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubThing__FunctionsAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubThingAccess().getFunctionsFunctionParserRuleCall_3_1_0()); }
		ruleFunction
		{ after(grammarAccess.getSubThingAccess().getFunctionsFunctionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__CardinalityAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getCardinalityIntegerLiteralParserRuleCall_2_1_0()); }
		ruleIntegerLiteral
		{ after(grammarAccess.getAgentAccess().getCardinalityIntegerLiteralParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Agent__AmodelAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAgentAccess().getAmodelStrategyPropertyParserRuleCall_3_0()); }
		ruleStrategyProperty
		{ after(grammarAccess.getAgentAccess().getAmodelStrategyPropertyParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getCpropertyAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__TypeRefAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAccess().getTypeRefTypeRefParserRuleCall_3_0_0()); }
		ruleTypeRef
		{ after(grammarAccess.getCpropertyAccess().getTypeRefTypeRefParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__TensorAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAccess().getTensorTensorParserRuleCall_3_1_0()); }
		ruleTensor
		{ after(grammarAccess.getCpropertyAccess().getTensorTensorParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cproperty__AnnotationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getCpropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__PropertyAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssignAccess().getPropertyPropertyCrossReference_1_0()); }
		(
			{ before(grammarAccess.getPropertyAssignAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPropertyAssignAccess().getPropertyPropertyIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getPropertyAssignAccess().getPropertyPropertyCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__IndexAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssignAccess().getIndexExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPropertyAssignAccess().getIndexExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__InitAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssignAccess().getInitExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getPropertyAssignAccess().getInitExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyAssign__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Protocol__AnnotationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProtocolAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getProtocolAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__NameAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_0_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_0_0()); }
		ruleParameter
		{ after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ParametersAssignment_0_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_1_1_0()); }
		ruleParameter
		{ after(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__TypeRefAssignment_0_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getTypeRefTypeRefParserRuleCall_0_5_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getFunctionAccess().getTypeRefTypeRefParserRuleCall_0_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__ExtraTypeRefAssignment_0_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getExtraTypeRefTypeRefParserRuleCall_0_6_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getFunctionAccess().getExtraTypeRefTypeRefParserRuleCall_0_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__AnnotationsAssignment_0_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_0_7_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_0_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Function__BodyAssignment_0_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionAccess().getBodyActionParserRuleCall_0_8_0()); }
		ruleAction
		{ after(grammarAccess.getFunctionAccess().getBodyActionParserRuleCall_0_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__AbstractAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0()); }
		(
			{ before(grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0()); }
			'abstract'
			{ after(grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0()); }
		)
		{ after(grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getAbstractFunctionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__ParametersAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); }
		ruleParameter
		{ after(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__ParametersAssignment_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); }
		ruleParameter
		{ after(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__TypeRefAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getTypeRefTypeRefParserRuleCall_6_1_0()); }
		ruleTypeRef
		{ after(grammarAccess.getAbstractFunctionAccess().getTypeRefTypeRefParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractFunction__AnnotationsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getAbstractFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__ReadonlyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0()); }
		(
			{ before(grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0()); }
			'readonly'
			{ after(grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0()); }
		)
		{ after(grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TypeRefAssignment_4_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0()); }
		ruleTypeRef
		{ after(grammarAccess.getPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__InitAssignment_4_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getInitExpressionParserRuleCall_4_0_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPropertyAccess().getInitExpressionParserRuleCall_4_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__TensorAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getTensorTensorParserRuleCall_4_1_0()); }
		ruleTensor
		{ after(grammarAccess.getPropertyAccess().getTensorTensorParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Property__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getPropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__ParametersAssignment_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0()); }
		ruleParameter
		{ after(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__ParametersAssignment_3_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0()); }
		ruleParameter
		{ after(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Message__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__NameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
		RULE_ID
		{ after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__TypeRefAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_2_0()); }
		ruleTypeRef
		{ after(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Parameter__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__OptionalAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0()); }
		(
			{ before(grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0()); }
			'optional'
			{ after(grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0()); }
		)
		{ after(grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__NameAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0()); }
		RULE_ID
		{ after(grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__AnnotationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getRequiredPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__SendsAssignment_6_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_1_0()); }
		(
			{ before(grammarAccess.getRequiredPortAccess().getSendsMessageIDTerminalRuleCall_6_0_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequiredPortAccess().getSendsMessageIDTerminalRuleCall_6_0_1_0_1()); }
		)
		{ after(grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__SendsAssignment_6_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_2_1_0()); }
		(
			{ before(grammarAccess.getRequiredPortAccess().getSendsMessageIDTerminalRuleCall_6_0_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequiredPortAccess().getSendsMessageIDTerminalRuleCall_6_0_2_1_0_1()); }
		)
		{ after(grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__ReceivesAssignment_6_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_1_0()); }
		(
			{ before(grammarAccess.getRequiredPortAccess().getReceivesMessageIDTerminalRuleCall_6_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequiredPortAccess().getReceivesMessageIDTerminalRuleCall_6_1_1_0_1()); }
		)
		{ after(grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RequiredPort__ReceivesAssignment_6_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_2_1_0()); }
		(
			{ before(grammarAccess.getRequiredPortAccess().getReceivesMessageIDTerminalRuleCall_6_1_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRequiredPortAccess().getReceivesMessageIDTerminalRuleCall_6_1_2_1_0_1()); }
		)
		{ after(grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getProvidedPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__SendsAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_1_0()); }
		(
			{ before(grammarAccess.getProvidedPortAccess().getSendsMessageIDTerminalRuleCall_5_0_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProvidedPortAccess().getSendsMessageIDTerminalRuleCall_5_0_1_0_1()); }
		)
		{ after(grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__SendsAssignment_5_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_2_1_0()); }
		(
			{ before(grammarAccess.getProvidedPortAccess().getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProvidedPortAccess().getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1()); }
		)
		{ after(grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__ReceivesAssignment_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_1_0()); }
		(
			{ before(grammarAccess.getProvidedPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProvidedPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_1_0_1()); }
		)
		{ after(grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ProvidedPort__ReceivesAssignment_5_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_2_1_0()); }
		(
			{ before(grammarAccess.getProvidedPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getProvidedPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1()); }
		)
		{ after(grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInternalPortAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getInternalPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__SendsAssignment_5_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_1_0()); }
		(
			{ before(grammarAccess.getInternalPortAccess().getSendsMessageIDTerminalRuleCall_5_0_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInternalPortAccess().getSendsMessageIDTerminalRuleCall_5_0_1_0_1()); }
		)
		{ after(grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__SendsAssignment_5_0_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_2_1_0()); }
		(
			{ before(grammarAccess.getInternalPortAccess().getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInternalPortAccess().getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1()); }
		)
		{ after(grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__ReceivesAssignment_5_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_1_0()); }
		(
			{ before(grammarAccess.getInternalPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInternalPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_1_0_1()); }
		)
		{ after(grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalPort__ReceivesAssignment_5_1_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_2_1_0()); }
		(
			{ before(grammarAccess.getInternalPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInternalPortAccess().getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1()); }
		)
		{ after(grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__NameAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__AnnotationsAssignment_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_2_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__PropertiesAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_4_0()); }
		ruleProperty
		{ after(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__EntryAssignment_3_5_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getEntryActionParserRuleCall_3_5_0_2_0()); }
		ruleAction
		{ after(grammarAccess.getStateAccess().getEntryActionParserRuleCall_3_5_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__ExitAssignment_3_5_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getExitActionParserRuleCall_3_5_1_2_0()); }
		ruleAction
		{ after(grammarAccess.getStateAccess().getExitActionParserRuleCall_3_5_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__PropertiesAssignment_3_5_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_5_2_0_0()); }
		ruleProperty
		{ after(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_5_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__InternalAssignment_3_5_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getInternalInternalTransitionParserRuleCall_3_5_2_1_0()); }
		ruleInternalTransition
		{ after(grammarAccess.getStateAccess().getInternalInternalTransitionParserRuleCall_3_5_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__State__OutgoingAssignment_3_5_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateAccess().getOutgoingTransitionParserRuleCall_3_5_2_2_0()); }
		ruleTransition
		{ after(grammarAccess.getStateAccess().getOutgoingTransitionParserRuleCall_3_5_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__TargetAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); }
		(
			{ before(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getTransitionAccess().getTargetStateIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__AnnotationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__EventAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_5_1_0()); }
		ruleEvent
		{ after(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__GuardAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); }
		ruleExpression
		{ after(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Transition__ActionAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_7_1_0()); }
		ruleAction
		{ after(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getInternalTransitionAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getInternalTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__EventAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_4_1_0()); }
		ruleEvent
		{ after(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__GuardAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getGuardExpressionParserRuleCall_5_1_0()); }
		ruleExpression
		{ after(grammarAccess.getInternalTransitionAccess().getGuardExpressionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__InternalTransition__ActionAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_6_1_0()); }
		ruleAction
		{ after(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__InitialAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getInitialStateCrossReference_4_0()); }
		(
			{ before(grammarAccess.getCompositeStateAccess().getInitialStateIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCompositeStateAccess().getInitialStateIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getCompositeStateAccess().getInitialStateCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__HistoryAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0()); }
		(
			{ before(grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0()); }
			'history'
			{ after(grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0()); }
		)
		{ after(grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__AnnotationsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getCompositeStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__PropertiesAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_8_0()); }
		ruleProperty
		{ after(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__EntryAssignment_9_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getEntryActionParserRuleCall_9_0_2_0()); }
		ruleAction
		{ after(grammarAccess.getCompositeStateAccess().getEntryActionParserRuleCall_9_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__ExitAssignment_9_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getExitActionParserRuleCall_9_1_2_0()); }
		ruleAction
		{ after(grammarAccess.getCompositeStateAccess().getExitActionParserRuleCall_9_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__PropertiesAssignment_9_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_9_2_0_0()); }
		ruleProperty
		{ after(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_9_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__SubstateAssignment_9_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getSubstateStateParserRuleCall_9_2_1_0()); }
		ruleState
		{ after(grammarAccess.getCompositeStateAccess().getSubstateStateParserRuleCall_9_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__InternalAssignment_9_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getInternalInternalTransitionParserRuleCall_9_2_2_0()); }
		ruleInternalTransition
		{ after(grammarAccess.getCompositeStateAccess().getInternalInternalTransitionParserRuleCall_9_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__OutgoingAssignment_9_2_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getOutgoingTransitionParserRuleCall_9_2_3_0()); }
		ruleTransition
		{ after(grammarAccess.getCompositeStateAccess().getOutgoingTransitionParserRuleCall_9_2_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__RegionAssignment_10_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getRegionRegionParserRuleCall_10_0_0()); }
		ruleRegion
		{ after(grammarAccess.getCompositeStateAccess().getRegionRegionParserRuleCall_10_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CompositeState__SessionAssignment_10_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCompositeStateAccess().getSessionSessionParserRuleCall_10_1_0()); }
		ruleSession
		{ after(grammarAccess.getCompositeStateAccess().getSessionSessionParserRuleCall_10_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__InitialAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getInitialStateCrossReference_3_0()); }
		(
			{ before(grammarAccess.getStateMachineAccess().getInitialStateIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStateMachineAccess().getInitialStateIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getStateMachineAccess().getInitialStateCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__HistoryAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0()); }
			'history'
			{ after(grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getStateMachineAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__PropertiesAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_7_0()); }
		ruleProperty
		{ after(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__EntryAssignment_8_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getEntryActionParserRuleCall_8_0_2_0()); }
		ruleAction
		{ after(grammarAccess.getStateMachineAccess().getEntryActionParserRuleCall_8_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__ExitAssignment_8_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getExitActionParserRuleCall_8_1_2_0()); }
		ruleAction
		{ after(grammarAccess.getStateMachineAccess().getExitActionParserRuleCall_8_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__PropertiesAssignment_8_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_8_2_0_0()); }
		ruleProperty
		{ after(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_8_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__SubstateAssignment_8_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getSubstateStateParserRuleCall_8_2_1_0()); }
		ruleState
		{ after(grammarAccess.getStateMachineAccess().getSubstateStateParserRuleCall_8_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__InternalAssignment_8_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getInternalInternalTransitionParserRuleCall_8_2_2_0()); }
		ruleInternalTransition
		{ after(grammarAccess.getStateMachineAccess().getInternalInternalTransitionParserRuleCall_8_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__RegionAssignment_9_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getRegionRegionParserRuleCall_9_0_0()); }
		ruleRegion
		{ after(grammarAccess.getStateMachineAccess().getRegionRegionParserRuleCall_9_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateMachine__SessionAssignment_9_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateMachineAccess().getSessionSessionParserRuleCall_9_1_0()); }
		ruleSession
		{ after(grammarAccess.getStateMachineAccess().getSessionSessionParserRuleCall_9_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__MaxInstancesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getMaxInstancesAlternatives_2_1_0()); }
		(rule__Session__MaxInstancesAlternatives_2_1_0)
		{ after(grammarAccess.getSessionAccess().getMaxInstancesAlternatives_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__InitialAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getInitialStateCrossReference_4_0()); }
		(
			{ before(grammarAccess.getSessionAccess().getInitialStateIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSessionAccess().getInitialStateIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getSessionAccess().getInitialStateCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getSessionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Session__SubstateAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSessionAccess().getSubstateStateParserRuleCall_7_0()); }
		ruleState
		{ after(grammarAccess.getSessionAccess().getSubstateStateParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__InitialAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegionAccess().getInitialStateCrossReference_3_0()); }
		(
			{ before(grammarAccess.getRegionAccess().getInitialStateIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getRegionAccess().getInitialStateIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getRegionAccess().getInitialStateCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__HistoryAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0()); }
		(
			{ before(grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0()); }
			'history'
			{ after(grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0()); }
		)
		{ after(grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getRegionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Region__SubstateAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRegionAccess().getSubstateStateParserRuleCall_7_0()); }
		ruleState
		{ after(grammarAccess.getRegionAccess().getSubstateStateParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__AnnotationsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFinalStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getFinalStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FinalState__EntryAssignment_5_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFinalStateAccess().getEntryActionParserRuleCall_5_2_0()); }
		ruleAction
		{ after(grammarAccess.getFinalStateAccess().getEntryActionParserRuleCall_5_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__InitialAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateContainerAccess().getInitialStateCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getStateContainerAccess().getInitialStateIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStateContainerAccess().getInitialStateIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getStateContainerAccess().getInitialStateCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__HistoryAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0()); }
		(
			{ before(grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0()); }
			'history'
			{ after(grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0()); }
		)
		{ after(grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StateContainer__SubstateAssignment_3_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStateContainerAccess().getSubstateStateParserRuleCall_3_4_0()); }
		ruleState
		{ after(grammarAccess.getStateContainerAccess().getSubstateStateParserRuleCall_3_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__NameAssignment_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReceiveMessageAccess().getNameIDTerminalRuleCall_0_0_0()); }
		RULE_ID
		{ after(grammarAccess.getReceiveMessageAccess().getNameIDTerminalRuleCall_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__PortAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReceiveMessageAccess().getPortPortCrossReference_1_0()); }
		(
			{ before(grammarAccess.getReceiveMessageAccess().getPortPortIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getReceiveMessageAccess().getPortPortIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getReceiveMessageAccess().getPortPortCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReceiveMessage__MessageAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReceiveMessageAccess().getMessageMessageCrossReference_3_0()); }
		(
			{ before(grammarAccess.getReceiveMessageAccess().getMessageMessageIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getReceiveMessageAccess().getMessageMessageIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getReceiveMessageAccess().getMessageMessageCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActionBlock__ActionsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActionBlockAccess().getActionsActionParserRuleCall_2_0()); }
		ruleAction
		{ after(grammarAccess.getActionBlockAccess().getActionsActionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__StatementAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternStatementAccess().getStatementEXTERNTerminalRuleCall_0_0()); }
		RULE_EXTERN
		{ after(grammarAccess.getExternStatementAccess().getStatementEXTERNTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternStatement__SegmentsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternStatementAccess().getSegmentsExpressionParserRuleCall_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getExternStatementAccess().getSegmentsExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__ReadonlyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0()); }
		(
			{ before(grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0()); }
			'readonly'
			{ after(grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0()); }
		)
		{ after(grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__TypeRefAssignment_4_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0()); }
		ruleTypeRef
		{ after(grammarAccess.getLocalVariableAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__InitAssignment_4_0_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getInitExpressionParserRuleCall_4_0_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getLocalVariableAccess().getInitExpressionParserRuleCall_4_0_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__TensorAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getTensorTensorParserRuleCall_4_1_0()); }
		ruleTensor
		{ after(grammarAccess.getLocalVariableAccess().getTensorTensorParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LocalVariable__AnnotationsAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLocalVariableAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getLocalVariableAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__PortAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSendActionAccess().getPortPortCrossReference_0_0()); }
		(
			{ before(grammarAccess.getSendActionAccess().getPortPortIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSendActionAccess().getPortPortIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getSendActionAccess().getPortPortCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__MessageAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSendActionAccess().getMessageMessageCrossReference_2_0()); }
		(
			{ before(grammarAccess.getSendActionAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getSendActionAccess().getMessageMessageIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getSendActionAccess().getMessageMessageCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__ParametersAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_0_0()); }
		ruleExpression
		{ after(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SendAction__ParametersAssignment_4_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__PropertyAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getPropertyVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getVariableAssignmentAccess().getPropertyVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVariableAssignmentAccess().getPropertyVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getVariableAssignmentAccess().getPropertyVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__IndexAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getIndexExpressionParserRuleCall_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getVariableAssignmentAccess().getIndexExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__ExtraPropertyAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getExtraPropertyVariableCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getVariableAssignmentAccess().getExtraPropertyVariableIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getVariableAssignmentAccess().getExtraPropertyVariableIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getVariableAssignmentAccess().getExtraPropertyVariableCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__ExtraIndexAssignment_2_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getExtraIndexExpressionParserRuleCall_2_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getVariableAssignmentAccess().getExtraIndexExpressionParserRuleCall_2_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__VariableAssignment__ExpressionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__CpropertysAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getCpropertysVariableCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCpropertyAssignmentAccess().getCpropertysVariableIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCpropertyAssignmentAccess().getCpropertysVariableIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCpropertyAssignmentAccess().getCpropertysVariableCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__CindexAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getCindexExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getCpropertyAssignmentAccess().getCindexExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__PropertyAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getPropertyVariableCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getCpropertyAssignmentAccess().getPropertyVariableIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCpropertyAssignmentAccess().getPropertyVariableIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getCpropertyAssignmentAccess().getPropertyVariableCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__PindexAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getPindexExpressionParserRuleCall_3_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getCpropertyAssignmentAccess().getPindexExpressionParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyAssignment__ExpressionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyAssignmentAccess().getExpressionExpressionParserRuleCall_5_0()); }
		ruleExpression
		{ after(grammarAccess.getCpropertyAssignmentAccess().getExpressionExpressionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__InputsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_1_0()); }
		(
			{ before(grammarAccess.getStrategyStreamAccess().getInputsVariableIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyStreamAccess().getInputsVariableIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__InputsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getStrategyStreamAccess().getInputsVariableIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyStreamAccess().getInputsVariableIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__StrategyAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getStrategyVariableCrossReference_4_0()); }
		(
			{ before(grammarAccess.getStrategyStreamAccess().getStrategyVariableIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyStreamAccess().getStrategyVariableIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getStrategyStreamAccess().getStrategyVariableCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__OutputsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_6_0()); }
		(
			{ before(grammarAccess.getStrategyStreamAccess().getOutputsVariableIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyStreamAccess().getOutputsVariableIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StrategyStream__OutputsAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getStrategyStreamAccess().getOutputsVariableIDTerminalRuleCall_7_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStrategyStreamAccess().getOutputsVariableIDTerminalRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__DictAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDictAssignmentAccess().getDictVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getDictAssignmentAccess().getDictVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDictAssignmentAccess().getDictVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getDictAssignmentAccess().getDictVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__ElementsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDictAssignmentAccess().getElementsVariableCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getDictAssignmentAccess().getElementsVariableIDTerminalRuleCall_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDictAssignmentAccess().getElementsVariableIDTerminalRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getDictAssignmentAccess().getElementsVariableCrossReference_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DictAssignment__VarAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDictAssignmentAccess().getVarVariableCrossReference_3_0()); }
		(
			{ before(grammarAccess.getDictAssignmentAccess().getVarVariableIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDictAssignmentAccess().getVarVariableIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getDictAssignmentAccess().getVarVariableCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__VarsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_1_0()); }
		(
			{ before(grammarAccess.getZipEnumerateAccess().getVarsVariableIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getZipEnumerateAccess().getVarsVariableIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__VarsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getZipEnumerateAccess().getVarsVariableIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getZipEnumerateAccess().getVarsVariableIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__FnameAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getFnameAlternatives_4_0()); }
		(rule__ZipEnumerate__FnameAlternatives_4_0)
		{ after(grammarAccess.getZipEnumerateAccess().getFnameAlternatives_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__SetsAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_6_0()); }
		(
			{ before(grammarAccess.getZipEnumerateAccess().getSetsVariableIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getZipEnumerateAccess().getSetsVariableIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__SetsAssignment_7_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_7_1_0()); }
		(
			{ before(grammarAccess.getZipEnumerateAccess().getSetsVariableIDTerminalRuleCall_7_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getZipEnumerateAccess().getSetsVariableIDTerminalRuleCall_7_1_0_1()); }
		)
		{ after(grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_7_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ZipEnumerate__ActionAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getZipEnumerateAccess().getActionActionParserRuleCall_9_0()); }
		ruleAction
		{ after(grammarAccess.getZipEnumerateAccess().getActionActionParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__PythonlistAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppendAccess().getPythonlistVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getAppendAccess().getPythonlistVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAppendAccess().getPythonlistVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getAppendAccess().getPythonlistVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Append__ElementAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAppendAccess().getElementExpressionParserRuleCall_4_0()); }
		ruleExpression
		{ after(grammarAccess.getAppendAccess().getElementExpressionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Increment__VarAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIncrementAccess().getVarVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getIncrementAccess().getVarVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getIncrementAccess().getVarVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getIncrementAccess().getVarVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decrement__VarAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecrementAccess().getVarVariableCrossReference_0_0()); }
		(
			{ before(grammarAccess.getDecrementAccess().getVarVariableIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getDecrementAccess().getVarVariableIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getDecrementAccess().getVarVariableCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__VariableAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForActionAccess().getVariableParameterParserRuleCall_2_0()); }
		ruleParameter
		{ after(grammarAccess.getForActionAccess().getVariableParameterParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__IndexAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForActionAccess().getIndexParameterParserRuleCall_3_1_0()); }
		ruleParameter
		{ after(grammarAccess.getForActionAccess().getIndexParameterParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__ArrayAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForActionAccess().getArrayPropertyReferenceParserRuleCall_5_0()); }
		rulePropertyReference
		{ after(grammarAccess.getForActionAccess().getArrayPropertyReferenceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ForAction__ActionAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getForActionAccess().getActionActionParserRuleCall_7_0()); }
		ruleAction
		{ after(grammarAccess.getForActionAccess().getActionActionParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__VariablesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_2_0()); }
		ruleParameter
		{ after(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__VariablesAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_3_1_0()); }
		ruleParameter
		{ after(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__ArraysAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_5_0()); }
		rulePropertyReference
		{ after(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__ArraysAssignment_6_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_6_1_0()); }
		rulePropertyReference
		{ after(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_6_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PyforAction__ActionAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPyforActionAccess().getActionActionParserRuleCall_8_0()); }
		ruleAction
		{ after(grammarAccess.getPyforActionAccess().getActionActionParserRuleCall_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__ConditionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LoopAction__ActionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0()); }
		ruleAction
		{ after(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__ConditionAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalActionAccess().getConditionExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getConditionalActionAccess().getConditionExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__ActionAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalActionAccess().getActionActionParserRuleCall_4_0()); }
		ruleAction
		{ after(grammarAccess.getConditionalActionAccess().getActionActionParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConditionalAction__ElseActionAssignment_5_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConditionalActionAccess().getElseActionActionParserRuleCall_5_1_0()); }
		ruleAction
		{ after(grammarAccess.getConditionalActionAccess().getElseActionActionParserRuleCall_5_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__ExpAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReturnActionAccess().getExpExpressionParserRuleCall_2_0()); }
		ruleExpression
		{ after(grammarAccess.getReturnActionAccess().getExpExpressionParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ReturnAction__ExtraExpAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getReturnActionAccess().getExtraExpExpressionParserRuleCall_3_1_0()); }
		ruleExpression
		{ after(grammarAccess.getReturnActionAccess().getExtraExpExpressionParserRuleCall_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__LineAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0()); }
			'println'
			{ after(grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__MsgAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PrintAction__MsgAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__LineAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0()); }
		(
			{ before(grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0()); }
			'errorln'
			{ after(grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0()); }
		)
		{ after(grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__MsgAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ErrorAction__MsgAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StartSession__SessionAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStartSessionAccess().getSessionSessionCrossReference_1_0()); }
		(
			{ before(grammarAccess.getStartSessionAccess().getSessionSessionIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getStartSessionAccess().getSessionSessionIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getStartSessionAccess().getSessionSessionCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__FunctionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__ParametersAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_0_0()); }
		ruleExpression
		{ after(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallStatement__ParametersAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpression__RhsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0()); }
		ruleAndExpression
		{ after(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpression__RhsAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0()); }
		ruleEquality
		{ after(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__RhsAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0()); }
		ruleComparaison
		{ after(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Equality__RhsAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0()); }
		ruleComparaison
		{ after(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__RhsAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0()); }
		ruleAddition
		{ after(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__RhsAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0()); }
		ruleAddition
		{ after(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__RhsAssignment_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0()); }
		ruleAddition
		{ after(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparaison__RhsAssignment_1_3_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0()); }
		ruleAddition
		{ after(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__RhsAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0()); }
		ruleMultiplication
		{ after(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Addition__RhsAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0()); }
		ruleMultiplication
		{ after(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__RhsAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0()); }
		ruleCastExpression
		{ after(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__RhsAssignment_1_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0()); }
		ruleCastExpression
		{ after(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Multiplication__RhsAssignment_1_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0()); }
		ruleCastExpression
		{ after(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__TypeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCastExpressionAccess().getTypeTypeCrossReference_1_2_0()); }
		(
			{ before(grammarAccess.getCastExpressionAccess().getTypeTypeIDTerminalRuleCall_1_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCastExpressionAccess().getTypeTypeIDTerminalRuleCall_1_2_0_1()); }
		)
		{ after(grammarAccess.getCastExpressionAccess().getTypeTypeCrossReference_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CastExpression__IsArrayAssignment_1_3_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0()); }
		(
			{ before(grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0()); }
			'['
			{ after(grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0()); }
		)
		{ after(grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__TermAssignment_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0()); }
		ruleExpression
		{ after(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__TermAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0()); }
		rulePrimary
		{ after(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__TermAssignment_2_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0()); }
		rulePrimary
		{ after(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayIndexPostfix__IndexAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0()); }
		ruleExpression
		{ after(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__ExpressionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0()); }
		RULE_EXTERN
		{ after(grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternExpression__SegmentsAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__ValuesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_1_0()); }
		ruleExpression
		{ after(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ArrayInit__ValuesAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__EnumAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationCrossReference_0_0()); }
		(
			{ before(grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EnumLiteralRef__LiteralAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralCrossReference_2_0()); }
		(
			{ before(grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ByteLiteral__ByteValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0()); }
		RULE_BYTE
		{ after(grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CharLiteral__CharValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0()); }
		RULE_CHAR
		{ after(grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerLiteral__IntValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0()); }
		RULE_INT
		{ after(grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanLiteral__BoolValueAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0()); }
		(
			{ before(grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0()); }
			'true'
			{ after(grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0()); }
		)
		{ after(grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringLiteral__StringValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DoubleLiteral__DoubleValueAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0()); }
		RULE_FLOAT
		{ after(grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyReference__PropertyAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyReferenceAccess().getPropertyVariableCrossReference_0()); }
		(
			{ before(grammarAccess.getPropertyReferenceAccess().getPropertyVariableIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getPropertyReferenceAccess().getPropertyVariableIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getPropertyReferenceAccess().getPropertyVariableCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__CpropertysAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyReferenceAccess().getCpropertysVariableCrossReference_1_0()); }
		(
			{ before(grammarAccess.getCpropertyReferenceAccess().getCpropertysVariableIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCpropertyReferenceAccess().getCpropertysVariableIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getCpropertyReferenceAccess().getCpropertysVariableCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__CindexAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyReferenceAccess().getCindexExpressionParserRuleCall_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getCpropertyReferenceAccess().getCindexExpressionParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__PropertyAssignment_3_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyReferenceAccess().getPropertyVariableCrossReference_3_1_0()); }
		(
			{ before(grammarAccess.getCpropertyReferenceAccess().getPropertyVariableIDTerminalRuleCall_3_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getCpropertyReferenceAccess().getPropertyVariableIDTerminalRuleCall_3_1_0_1()); }
		)
		{ after(grammarAccess.getCpropertyReferenceAccess().getPropertyVariableCrossReference_3_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CpropertyReference__PindexAssignment_3_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCpropertyReferenceAccess().getPindexExpressionParserRuleCall_3_2_1_0()); }
		ruleExpression
		{ after(grammarAccess.getCpropertyReferenceAccess().getPindexExpressionParserRuleCall_3_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__ReceiveMsgAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventReferenceAccess().getReceiveMsgEventCrossReference_0_0()); }
		(
			{ before(grammarAccess.getEventReferenceAccess().getReceiveMsgEventIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEventReferenceAccess().getReceiveMsgEventIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getEventReferenceAccess().getReceiveMsgEventCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EventReference__ParameterAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEventReferenceAccess().getParameterParameterCrossReference_2_0()); }
		(
			{ before(grammarAccess.getEventReferenceAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEventReferenceAccess().getParameterParameterIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getEventReferenceAccess().getParameterParameterCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__FunctionAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionCrossReference_0_0()); }
		(
			{ before(grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); }
			RULE_ID
			{ after(grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionIDTerminalRuleCall_0_0_1()); }
		)
		{ after(grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionCrossReference_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__ParametersAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_0_0()); }
		ruleExpression
		{ after(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FunctionCallExpression__ParametersAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_1_1_0()); }
		ruleExpression
		{ after(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__AnnotationsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__InstancesAssignment_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getInstancesInstanceParserRuleCall_4_0_0()); }
		ruleInstance
		{ after(grammarAccess.getConfigurationAccess().getInstancesInstanceParserRuleCall_4_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__ConnectorsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getConnectorsAbstractConnectorParserRuleCall_4_1_0()); }
		ruleAbstractConnector
		{ after(grammarAccess.getConfigurationAccess().getConnectorsAbstractConnectorParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Configuration__PropassignsAssignment_4_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigurationAccess().getPropassignsConfigPropertyAssignParserRuleCall_4_2_0()); }
		ruleConfigPropertyAssign
		{ after(grammarAccess.getConfigurationAccess().getPropassignsConfigPropertyAssignParserRuleCall_4_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__TypeAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceAccess().getTypeThingCrossReference_3_0()); }
		(
			{ before(grammarAccess.getInstanceAccess().getTypeThingIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getInstanceAccess().getTypeThingIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getInstanceAccess().getTypeThingCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Instance__AnnotationsAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getInstanceAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getInstanceAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__InstanceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceCrossReference_1_0()); }
		(
			{ before(grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceIDTerminalRuleCall_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceIDTerminalRuleCall_1_0_1()); }
		)
		{ after(grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceCrossReference_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__PropertyAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyCrossReference_3_0()); }
		(
			{ before(grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyIDTerminalRuleCall_3_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyIDTerminalRuleCall_3_0_1()); }
		)
		{ after(grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyCrossReference_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__IndexAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getIndexExpressionParserRuleCall_4_1_0()); }
		ruleExpression
		{ after(grammarAccess.getConfigPropertyAssignAccess().getIndexExpressionParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__InitAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getInitExpressionParserRuleCall_6_0()); }
		ruleExpression
		{ after(grammarAccess.getConfigPropertyAssignAccess().getInitExpressionParserRuleCall_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConfigPropertyAssign__AnnotationsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__CliAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getCliInstanceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getConnectorAccess().getCliInstanceIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConnectorAccess().getCliInstanceIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getConnectorAccess().getCliInstanceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__RequiredAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getRequiredRequiredPortCrossReference_4_0()); }
		(
			{ before(grammarAccess.getConnectorAccess().getRequiredRequiredPortIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConnectorAccess().getRequiredRequiredPortIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getConnectorAccess().getRequiredRequiredPortCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__SrvAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getSrvInstanceCrossReference_6_0()); }
		(
			{ before(grammarAccess.getConnectorAccess().getSrvInstanceIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConnectorAccess().getSrvInstanceIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getConnectorAccess().getSrvInstanceCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__ProvidedAssignment_8
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getProvidedProvidedPortCrossReference_8_0()); }
		(
			{ before(grammarAccess.getConnectorAccess().getProvidedProvidedPortIDTerminalRuleCall_8_0_1()); }
			RULE_ID
			{ after(grammarAccess.getConnectorAccess().getProvidedProvidedPortIDTerminalRuleCall_8_0_1()); }
		)
		{ after(grammarAccess.getConnectorAccess().getProvidedProvidedPortCrossReference_8_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Connector__AnnotationsAssignment_9
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getExternalConnectorAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__InstAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getInstInstanceCrossReference_2_0()); }
		(
			{ before(grammarAccess.getExternalConnectorAccess().getInstInstanceIDTerminalRuleCall_2_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExternalConnectorAccess().getInstInstanceIDTerminalRuleCall_2_0_1()); }
		)
		{ after(grammarAccess.getExternalConnectorAccess().getInstInstanceCrossReference_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__PortAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getPortPortCrossReference_4_0()); }
		(
			{ before(grammarAccess.getExternalConnectorAccess().getPortPortIDTerminalRuleCall_4_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExternalConnectorAccess().getPortPortIDTerminalRuleCall_4_0_1()); }
		)
		{ after(grammarAccess.getExternalConnectorAccess().getPortPortCrossReference_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__ProtocolAssignment_6
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getProtocolProtocolCrossReference_6_0()); }
		(
			{ before(grammarAccess.getExternalConnectorAccess().getProtocolProtocolIDTerminalRuleCall_6_0_1()); }
			RULE_ID
			{ after(grammarAccess.getExternalConnectorAccess().getProtocolProtocolIDTerminalRuleCall_6_0_1()); }
		)
		{ after(grammarAccess.getExternalConnectorAccess().getProtocolProtocolCrossReference_6_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExternalConnector__AnnotationsAssignment_7
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExternalConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
		rulePlatformAnnotation
		{ after(grammarAccess.getExternalConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_BYTE : '0x' ('0'..'9'|'a'..'f'|'A'..'F') ('0'..'9'|'a'..'f'|'A'..'F');

RULE_CHAR : '\'' ('\\0'|'\\t'|'\\n'|'\\r'|' '..'&'|'\\\''|'('..'['|'\\\\'|']'..'~') '\'';

RULE_INT : ('0'..'9')+;

RULE_FLOAT : (('0'..'9')+ '.' ('0'..'9')* (('e'|'E') ('+'|'-')? ('0'..'9')+)?|'.' ('0'..'9')+ (('e'|'E') ('+'|'-')? ('0'..'9')+)?|('0'..'9')+ ('e'|'E') ('+'|'-')? ('0'..'9')+);

RULE_ANNOTATION_ID : '@' ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_STRING : '"' ('\\' .|~(('\\'|'"')))* '"';

RULE_EXTERN : '`' ('\\' .|~(('\\'|'`')))* '`';

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
