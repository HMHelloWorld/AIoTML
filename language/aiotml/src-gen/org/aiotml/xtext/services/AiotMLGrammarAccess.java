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
package org.aiotml.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.UnorderedGroup;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class AiotMLGrammarAccess extends AbstractGrammarElementFinder {
	
	public class AiotMLModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AiotMLModel");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cImportsAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cImportsImportParserRuleCall_0_0 = (RuleCall)cImportsAssignment_0.eContents().get(0);
		private final Assignment cTemplatesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTemplatesTemplateParserRuleCall_1_0 = (RuleCall)cTemplatesAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cTypesAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cTypesTypeParserRuleCall_2_0_0 = (RuleCall)cTypesAssignment_2_0.eContents().get(0);
		private final Assignment cProtocolsAssignment_2_1 = (Assignment)cAlternatives_2.eContents().get(1);
		private final RuleCall cProtocolsProtocolParserRuleCall_2_1_0 = (RuleCall)cProtocolsAssignment_2_1.eContents().get(0);
		private final Assignment cConfigsAssignment_2_2 = (Assignment)cAlternatives_2.eContents().get(2);
		private final RuleCall cConfigsConfigurationParserRuleCall_2_2_0 = (RuleCall)cConfigsAssignment_2_2.eContents().get(0);
		
		//AiotMLModel:
		//	imports+=Import*
		//	templates+=Template* (types+=Type | protocols+=Protocol | configs+=Configuration)*;
		@Override public ParserRule getRule() { return rule; }
		
		//imports+=Import* templates+=Template* (types+=Type | protocols+=Protocol | configs+=Configuration)*
		public Group getGroup() { return cGroup; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_0() { return cImportsAssignment_0; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_0_0() { return cImportsImportParserRuleCall_0_0; }
		
		//templates+=Template*
		public Assignment getTemplatesAssignment_1() { return cTemplatesAssignment_1; }
		
		//Template
		public RuleCall getTemplatesTemplateParserRuleCall_1_0() { return cTemplatesTemplateParserRuleCall_1_0; }
		
		//(types+=Type | protocols+=Protocol | configs+=Configuration)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//types+=Type
		public Assignment getTypesAssignment_2_0() { return cTypesAssignment_2_0; }
		
		//Type
		public RuleCall getTypesTypeParserRuleCall_2_0_0() { return cTypesTypeParserRuleCall_2_0_0; }
		
		//protocols+=Protocol
		public Assignment getProtocolsAssignment_2_1() { return cProtocolsAssignment_2_1; }
		
		//Protocol
		public RuleCall getProtocolsProtocolParserRuleCall_2_1_0() { return cProtocolsProtocolParserRuleCall_2_1_0; }
		
		//configs+=Configuration
		public Assignment getConfigsAssignment_2_2() { return cConfigsAssignment_2_2; }
		
		//Configuration
		public RuleCall getConfigsConfigurationParserRuleCall_2_2_0() { return cConfigsConfigurationParserRuleCall_2_2_0; }
	}
	public class TemplateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Template");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTemplateKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPathAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPathSTRINGTerminalRuleCall_1_0 = (RuleCall)cPathAssignment_1.eContents().get(0);
		
		//Template:
		//	"template" path=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//"template" path=STRING
		public Group getGroup() { return cGroup; }
		
		//"template"
		public Keyword getTemplateKeyword_0() { return cTemplateKeyword_0; }
		
		//path=STRING
		public Assignment getPathAssignment_1() { return cPathAssignment_1; }
		
		//STRING
		public RuleCall getPathSTRINGTerminalRuleCall_1_0() { return cPathSTRINGTerminalRuleCall_1_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportURIAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_1_0 = (RuleCall)cImportURIAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cFromKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cFromAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cFromIDTerminalRuleCall_2_1_0 = (RuleCall)cFromAssignment_2_1.eContents().get(0);
		
		//Import:
		//	"import" importURI=STRING ("from" from=ID)?;
		@Override public ParserRule getRule() { return rule; }
		
		//"import" importURI=STRING ("from" from=ID)?
		public Group getGroup() { return cGroup; }
		
		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importURI=STRING
		public Assignment getImportURIAssignment_1() { return cImportURIAssignment_1; }
		
		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_1_0() { return cImportURISTRINGTerminalRuleCall_1_0; }
		
		//("from" from=ID)?
		public Group getGroup_2() { return cGroup_2; }
		
		//"from"
		public Keyword getFromKeyword_2_0() { return cFromKeyword_2_0; }
		
		//from=ID
		public Assignment getFromAssignment_2_1() { return cFromAssignment_2_1; }
		
		//ID
		public RuleCall getFromIDTerminalRuleCall_2_1_0() { return cFromIDTerminalRuleCall_2_1_0; }
	}
	public class PlatformAnnotationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PlatformAnnotation");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameANNOTATION_IDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_1_0 = (Assignment)cAlternatives_1.eContents().get(0);
		private final RuleCall cValueEXTERNTerminalRuleCall_1_0_0 = (RuleCall)cValueAssignment_1_0.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cAlternatives_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		
		//PlatformAnnotation:
		//	name=ANNOTATION_ID (value=EXTERN | value=STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ANNOTATION_ID (value=EXTERN | value=STRING)?
		public Group getGroup() { return cGroup; }
		
		//name=ANNOTATION_ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ANNOTATION_ID
		public RuleCall getNameANNOTATION_IDTerminalRuleCall_0_0() { return cNameANNOTATION_IDTerminalRuleCall_0_0; }
		
		//(value=EXTERN | value=STRING)?
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//value=EXTERN
		public Assignment getValueAssignment_1_0() { return cValueAssignment_1_0; }
		
		//EXTERN
		public RuleCall getValueEXTERNTerminalRuleCall_1_0_0() { return cValueEXTERNTerminalRuleCall_1_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }
	}
	public class NamedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.NamedElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProtocolParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFunctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMessageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cConfigurationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cHandlerParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cStateParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cStateContainerParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cTypeParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cVariableParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cInstanceParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cAbstractConnectorParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cEnumerationLiteralParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cEventParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cCpropertyParserRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cStrategyPropertyParserRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		private final RuleCall cModelReferenceParserRuleCall_16 = (RuleCall)cAlternatives.eContents().get(16);
		private final Group cGroup_17 = (Group)cAlternatives.eContents().get(17);
		private final Keyword cSemicolonKeyword_17_0 = (Keyword)cGroup_17.eContents().get(0);
		private final Assignment cNameAssignment_17_1 = (Assignment)cGroup_17.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_17_1_0 = (RuleCall)cNameAssignment_17_1.eContents().get(0);
		
		//NamedElement:
		//	Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | Variable | Instance |
		//	AbstractConnector | EnumerationLiteral | Event | Cproperty | StrategyProperty | ModelReference |
		//	";" name=ID // This is never used, it is just to have the attributes in the superclass
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | Variable | Instance |
		//AbstractConnector | EnumerationLiteral | Event | Cproperty | StrategyProperty | ModelReference | ";" name=ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Protocol
		public RuleCall getProtocolParserRuleCall_0() { return cProtocolParserRuleCall_0; }
		
		//Function
		public RuleCall getFunctionParserRuleCall_1() { return cFunctionParserRuleCall_1; }
		
		//Message
		public RuleCall getMessageParserRuleCall_2() { return cMessageParserRuleCall_2; }
		
		//Port
		public RuleCall getPortParserRuleCall_3() { return cPortParserRuleCall_3; }
		
		//Configuration
		public RuleCall getConfigurationParserRuleCall_4() { return cConfigurationParserRuleCall_4; }
		
		//Handler
		public RuleCall getHandlerParserRuleCall_5() { return cHandlerParserRuleCall_5; }
		
		//State
		public RuleCall getStateParserRuleCall_6() { return cStateParserRuleCall_6; }
		
		//StateContainer
		public RuleCall getStateContainerParserRuleCall_7() { return cStateContainerParserRuleCall_7; }
		
		//Type
		public RuleCall getTypeParserRuleCall_8() { return cTypeParserRuleCall_8; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_9() { return cVariableParserRuleCall_9; }
		
		//Instance
		public RuleCall getInstanceParserRuleCall_10() { return cInstanceParserRuleCall_10; }
		
		//AbstractConnector
		public RuleCall getAbstractConnectorParserRuleCall_11() { return cAbstractConnectorParserRuleCall_11; }
		
		//EnumerationLiteral
		public RuleCall getEnumerationLiteralParserRuleCall_12() { return cEnumerationLiteralParserRuleCall_12; }
		
		//Event
		public RuleCall getEventParserRuleCall_13() { return cEventParserRuleCall_13; }
		
		//Cproperty
		public RuleCall getCpropertyParserRuleCall_14() { return cCpropertyParserRuleCall_14; }
		
		//StrategyProperty
		public RuleCall getStrategyPropertyParserRuleCall_15() { return cStrategyPropertyParserRuleCall_15; }
		
		//ModelReference
		public RuleCall getModelReferenceParserRuleCall_16() { return cModelReferenceParserRuleCall_16; }
		
		//";" name=ID
		public Group getGroup_17() { return cGroup_17; }
		
		//";"
		public Keyword getSemicolonKeyword_17_0() { return cSemicolonKeyword_17_0; }
		
		//name=ID
		public Assignment getNameAssignment_17_1() { return cNameAssignment_17_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_17_1_0() { return cNameIDTerminalRuleCall_17_1_0; }
	}
	public class AnnotatedElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AnnotatedElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cProtocolParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFunctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMessageParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPortParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cConfigurationParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cHandlerParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cStateParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cStateContainerParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cTypeParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cPropertyAssignParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cVariableParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cInstanceParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cAbstractConnectorParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cEnumerationLiteralParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final Group cGroup_14 = (Group)cAlternatives.eContents().get(14);
		private final Keyword cSemicolonKeyword_14_0 = (Keyword)cGroup_14.eContents().get(0);
		private final Assignment cAnnotationsAssignment_14_1 = (Assignment)cGroup_14.eContents().get(1);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_14_1_0 = (RuleCall)cAnnotationsAssignment_14_1.eContents().get(0);
		
		//AnnotatedElement:
		//	Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | PropertyAssign |
		//	Variable | Instance | AbstractConnector | EnumerationLiteral |
		//	";" annotations+=PlatformAnnotation* // This is never used, it is just to have the attributes in the superclass
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | PropertyAssign |
		//Variable | Instance | AbstractConnector | EnumerationLiteral | ";" annotations+=PlatformAnnotation*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Protocol
		public RuleCall getProtocolParserRuleCall_0() { return cProtocolParserRuleCall_0; }
		
		//Function
		public RuleCall getFunctionParserRuleCall_1() { return cFunctionParserRuleCall_1; }
		
		//Message
		public RuleCall getMessageParserRuleCall_2() { return cMessageParserRuleCall_2; }
		
		//Port
		public RuleCall getPortParserRuleCall_3() { return cPortParserRuleCall_3; }
		
		//Configuration
		public RuleCall getConfigurationParserRuleCall_4() { return cConfigurationParserRuleCall_4; }
		
		//Handler
		public RuleCall getHandlerParserRuleCall_5() { return cHandlerParserRuleCall_5; }
		
		//State
		public RuleCall getStateParserRuleCall_6() { return cStateParserRuleCall_6; }
		
		//StateContainer
		public RuleCall getStateContainerParserRuleCall_7() { return cStateContainerParserRuleCall_7; }
		
		//Type
		public RuleCall getTypeParserRuleCall_8() { return cTypeParserRuleCall_8; }
		
		//PropertyAssign
		public RuleCall getPropertyAssignParserRuleCall_9() { return cPropertyAssignParserRuleCall_9; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_10() { return cVariableParserRuleCall_10; }
		
		//Instance
		public RuleCall getInstanceParserRuleCall_11() { return cInstanceParserRuleCall_11; }
		
		//AbstractConnector
		public RuleCall getAbstractConnectorParserRuleCall_12() { return cAbstractConnectorParserRuleCall_12; }
		
		//EnumerationLiteral
		public RuleCall getEnumerationLiteralParserRuleCall_13() { return cEnumerationLiteralParserRuleCall_13; }
		
		//";" annotations+=PlatformAnnotation*
		public Group getGroup_14() { return cGroup_14; }
		
		//";"
		public Keyword getSemicolonKeyword_14_0() { return cSemicolonKeyword_14_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_14_1() { return cAnnotationsAssignment_14_1; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_14_1_0() { return cAnnotationsPlatformAnnotationParserRuleCall_14_1_0; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Variable");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cVarKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cColonKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cTypeRefAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cTypeRefTypeRefParserRuleCall_0_3_0 = (RuleCall)cTypeRefAssignment_0_3.eContents().get(0);
		private final Assignment cTensorAssignment_1 = (Assignment)cAlternatives.eContents().get(1);
		private final RuleCall cTensorTensorParserRuleCall_1_0 = (RuleCall)cTensorAssignment_1.eContents().get(0);
		private final RuleCall cLocalVariableParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPropertyParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cParameterParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cCpropertyParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cStrategyPropertyParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMultiAgentPropertyParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Variable:
		//	"var" name=ID ':' typeRef=TypeRef | tensor=Tensor | LocalVariable | Property | Parameter | Cproperty |
		//	StrategyProperty | MultiAgentProperty;
		@Override public ParserRule getRule() { return rule; }
		
		//"var" name=ID ':' typeRef=TypeRef | tensor=Tensor | LocalVariable | Property | Parameter | Cproperty | StrategyProperty
		//| MultiAgentProperty
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//"var" name=ID ':' typeRef=TypeRef
		public Group getGroup_0() { return cGroup_0; }
		
		//"var"
		public Keyword getVarKeyword_0_0() { return cVarKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//':'
		public Keyword getColonKeyword_0_2() { return cColonKeyword_0_2; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_0_3() { return cTypeRefAssignment_0_3; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_0_3_0() { return cTypeRefTypeRefParserRuleCall_0_3_0; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_1() { return cTensorAssignment_1; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_1_0() { return cTensorTensorParserRuleCall_1_0; }
		
		//// This is never used, it is just to have the attributes in the superclass
		//LocalVariable
		public RuleCall getLocalVariableParserRuleCall_2() { return cLocalVariableParserRuleCall_2; }
		
		//Property
		public RuleCall getPropertyParserRuleCall_3() { return cPropertyParserRuleCall_3; }
		
		//Parameter
		public RuleCall getParameterParserRuleCall_4() { return cParameterParserRuleCall_4; }
		
		//Cproperty
		public RuleCall getCpropertyParserRuleCall_5() { return cCpropertyParserRuleCall_5; }
		
		//StrategyProperty
		public RuleCall getStrategyPropertyParserRuleCall_6() { return cStrategyPropertyParserRuleCall_6; }
		
		//MultiAgentProperty
		public RuleCall getMultiAgentPropertyParserRuleCall_7() { return cMultiAgentPropertyParserRuleCall_7; }
	}
	public class TypeRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.TypeRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cTypeTypeCrossReference_0_0 = (CrossReference)cTypeAssignment_0.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_0_0_1 = (RuleCall)cTypeTypeCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cIsArrayAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cIsArrayLeftSquareBracketKeyword_1_0_0 = (Keyword)cIsArrayAssignment_1_0.eContents().get(0);
		private final Assignment cCardinalityAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final Alternatives cCardinalityAlternatives_1_1_0 = (Alternatives)cCardinalityAssignment_1_1.eContents().get(0);
		private final RuleCall cCardinalityIntegerLiteralParserRuleCall_1_1_0_0 = (RuleCall)cCardinalityAlternatives_1_1_0.eContents().get(0);
		private final RuleCall cCardinalityPropertyReferenceParserRuleCall_1_1_0_1 = (RuleCall)cCardinalityAlternatives_1_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		////ReferInstance:
		////	
		////;
		///*****************************************************************************
		// *       TYPES / ENUMERATIONS                                                *
		// *****************************************************************************/ TypeRef:
		//	type=[Type] (^isArray?='[' cardinality=(IntegerLiteral | PropertyReference)? ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//type=[Type] (^isArray?='[' cardinality=(IntegerLiteral | PropertyReference)? ']')?
		public Group getGroup() { return cGroup; }
		
		//type=[Type]
		public Assignment getTypeAssignment_0() { return cTypeAssignment_0; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_0_0() { return cTypeTypeCrossReference_0_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_0_0_1() { return cTypeTypeIDTerminalRuleCall_0_0_1; }
		
		//(^isArray?='[' cardinality=(IntegerLiteral | PropertyReference)? ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//^isArray?='['
		public Assignment getIsArrayAssignment_1_0() { return cIsArrayAssignment_1_0; }
		
		//'['
		public Keyword getIsArrayLeftSquareBracketKeyword_1_0_0() { return cIsArrayLeftSquareBracketKeyword_1_0_0; }
		
		//cardinality=(IntegerLiteral | PropertyReference)?
		public Assignment getCardinalityAssignment_1_1() { return cCardinalityAssignment_1_1; }
		
		//(IntegerLiteral | PropertyReference)
		public Alternatives getCardinalityAlternatives_1_1_0() { return cCardinalityAlternatives_1_1_0; }
		
		//IntegerLiteral
		public RuleCall getCardinalityIntegerLiteralParserRuleCall_1_1_0_0() { return cCardinalityIntegerLiteralParserRuleCall_1_1_0_0; }
		
		//PropertyReference
		public RuleCall getCardinalityPropertyReferenceParserRuleCall_1_1_0_1() { return cCardinalityPropertyReferenceParserRuleCall_1_1_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
	}
	public class TypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Type");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cPrimitiveTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cObjectTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEnumerationParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cThingParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cSubThingParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cModelParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cStrategyParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cMultiAgentParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		
		//Type:
		//	PrimitiveType | ObjectType | Enumeration | Thing | SubThing | Model | Strategy | MultiAgent;
		@Override public ParserRule getRule() { return rule; }
		
		//PrimitiveType | ObjectType | Enumeration | Thing | SubThing | Model | Strategy | MultiAgent
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//PrimitiveType
		public RuleCall getPrimitiveTypeParserRuleCall_0() { return cPrimitiveTypeParserRuleCall_0; }
		
		//ObjectType
		public RuleCall getObjectTypeParserRuleCall_1() { return cObjectTypeParserRuleCall_1; }
		
		//Enumeration
		public RuleCall getEnumerationParserRuleCall_2() { return cEnumerationParserRuleCall_2; }
		
		//Thing
		public RuleCall getThingParserRuleCall_3() { return cThingParserRuleCall_3; }
		
		//SubThing
		public RuleCall getSubThingParserRuleCall_4() { return cSubThingParserRuleCall_4; }
		
		//Model
		public RuleCall getModelParserRuleCall_5() { return cModelParserRuleCall_5; }
		
		//Strategy
		public RuleCall getStrategyParserRuleCall_6() { return cStrategyParserRuleCall_6; }
		
		//MultiAgent
		public RuleCall getMultiAgentParserRuleCall_7() { return cMultiAgentParserRuleCall_7; }
	}
	public class PrimitiveTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PrimitiveType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cDatatypeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLessThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cByteSizeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cByteSizeINTTerminalRuleCall_3_0 = (RuleCall)cByteSizeAssignment_3.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//PrimitiveType:
		//	'datatype' name=ID => '<' ByteSize=INT '>' annotations+=PlatformAnnotation* ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'datatype' name=ID => '<' ByteSize=INT '>' annotations+=PlatformAnnotation* ';'?
		public Group getGroup() { return cGroup; }
		
		//'datatype'
		public Keyword getDatatypeKeyword_0() { return cDatatypeKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//=> '<'
		public Keyword getLessThanSignKeyword_2() { return cLessThanSignKeyword_2; }
		
		//ByteSize=INT
		public Assignment getByteSizeAssignment_3() { return cByteSizeAssignment_3; }
		
		//INT
		public RuleCall getByteSizeINTTerminalRuleCall_3_0() { return cByteSizeINTTerminalRuleCall_3_0; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_4() { return cGreaterThanSignKeyword_4; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class ObjectTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ObjectType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cObjectKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_2_0 = (RuleCall)cAnnotationsAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ObjectType:
		//	'object' name=ID annotations+=PlatformAnnotation* ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'object' name=ID annotations+=PlatformAnnotation* ';'?
		public Group getGroup() { return cGroup; }
		
		//'object'
		public Keyword getObjectKeyword_0() { return cObjectKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_2() { return cAnnotationsAssignment_2; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_2_0() { return cAnnotationsPlatformAnnotationParserRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class EnumerationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Enumeration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEnumerationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cAsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cTypeRefAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cTypeRefTypeRefParserRuleCall_2_1_0 = (RuleCall)cTypeRefAssignment_2_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cLiteralsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cLiteralsEnumerationLiteralParserRuleCall_5_0 = (RuleCall)cLiteralsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Enumeration:
		//	'enumeration' name=ID (=> 'as' typeRef=TypeRef)? annotations+=PlatformAnnotation* '{' literals+=EnumerationLiteral*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'enumeration' name=ID (=> 'as' typeRef=TypeRef)? annotations+=PlatformAnnotation* '{' literals+=EnumerationLiteral* '}'
		public Group getGroup() { return cGroup; }
		
		//'enumeration'
		public Keyword getEnumerationKeyword_0() { return cEnumerationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//(=> 'as' typeRef=TypeRef)?
		public Group getGroup_2() { return cGroup_2; }
		
		//=> 'as'
		public Keyword getAsKeyword_2_0() { return cAsKeyword_2_0; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_2_1() { return cTypeRefAssignment_2_1; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_2_1_0() { return cTypeRefTypeRefParserRuleCall_2_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//literals+=EnumerationLiteral*
		public Assignment getLiteralsAssignment_5() { return cLiteralsAssignment_5; }
		
		//EnumerationLiteral
		public RuleCall getLiteralsEnumerationLiteralParserRuleCall_5_0() { return cLiteralsEnumerationLiteralParserRuleCall_5_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class EnumerationLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.EnumerationLiteral");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cEqualsSignKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cInitAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cInitLiteralParserRuleCall_1_1_0 = (RuleCall)cInitAssignment_1_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_2_0 = (RuleCall)cAnnotationsAssignment_2.eContents().get(0);
		
		//EnumerationLiteral:
		//	name=ID ('=' init=Literal)? annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ('=' init=Literal)? annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//('=' init=Literal)?
		public Group getGroup_1() { return cGroup_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_1_0() { return cEqualsSignKeyword_1_0; }
		
		//init=Literal
		public Assignment getInitAssignment_1_1() { return cInitAssignment_1_1; }
		
		//Literal
		public RuleCall getInitLiteralParserRuleCall_1_1_0() { return cInitLiteralParserRuleCall_1_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_2() { return cAnnotationsAssignment_2; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_2_0() { return cAnnotationsPlatformAnnotationParserRuleCall_2_0; }
	}
	public class TensorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Tensor");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTensorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDimKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cDimsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cDimsIntegerLiteralParserRuleCall_5_0 = (RuleCall)cDimsAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cDimsAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cDimsIntegerLiteralParserRuleCall_6_1_0 = (RuleCall)cDimsAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Group cGroup_8 = (Group)cGroup.eContents().get(8);
		private final Keyword cCommaKeyword_8_0 = (Keyword)cGroup_8.eContents().get(0);
		private final Assignment cDatatypeAssignment_8_1 = (Assignment)cGroup_8.eContents().get(1);
		private final RuleCall cDatatypeIDTerminalRuleCall_8_1_0 = (RuleCall)cDatatypeAssignment_8_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_9 = (Keyword)cGroup.eContents().get(9);
		
		//Tensor:
		//	'tensor' '(' 'dim' '=' '(' dims+=IntegerLiteral ("," dims+=IntegerLiteral)* ')' ("," datatype=ID)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//'tensor' '(' 'dim' '=' '(' dims+=IntegerLiteral ("," dims+=IntegerLiteral)* ')' ("," datatype=ID)? ')'
		public Group getGroup() { return cGroup; }
		
		//'tensor'
		public Keyword getTensorKeyword_0() { return cTensorKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//'dim'
		public Keyword getDimKeyword_2() { return cDimKeyword_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//dims+=IntegerLiteral
		public Assignment getDimsAssignment_5() { return cDimsAssignment_5; }
		
		//IntegerLiteral
		public RuleCall getDimsIntegerLiteralParserRuleCall_5_0() { return cDimsIntegerLiteralParserRuleCall_5_0; }
		
		//("," dims+=IntegerLiteral)*
		public Group getGroup_6() { return cGroup_6; }
		
		//","
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//dims+=IntegerLiteral
		public Assignment getDimsAssignment_6_1() { return cDimsAssignment_6_1; }
		
		//IntegerLiteral
		public RuleCall getDimsIntegerLiteralParserRuleCall_6_1_0() { return cDimsIntegerLiteralParserRuleCall_6_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
		
		//("," datatype=ID)?
		public Group getGroup_8() { return cGroup_8; }
		
		//","
		public Keyword getCommaKeyword_8_0() { return cCommaKeyword_8_0; }
		
		//datatype=ID
		public Assignment getDatatypeAssignment_8_1() { return cDatatypeAssignment_8_1; }
		
		//ID
		public RuleCall getDatatypeIDTerminalRuleCall_8_1_0() { return cDatatypeIDTerminalRuleCall_8_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_9() { return cRightParenthesisKeyword_9; }
	}
	public class LayerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Layer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFully_connectedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cDimKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Assignment cLayernumsAssignment_5_0_0 = (Assignment)cGroup_5_0.eContents().get(0);
		private final RuleCall cLayernumsIntegerLiteralParserRuleCall_5_0_0_0 = (RuleCall)cLayernumsAssignment_5_0_0.eContents().get(0);
		private final Group cGroup_5_0_1 = (Group)cGroup_5_0.eContents().get(1);
		private final Keyword cCommaKeyword_5_0_1_0 = (Keyword)cGroup_5_0_1.eContents().get(0);
		private final Assignment cLayernumsAssignment_5_0_1_1 = (Assignment)cGroup_5_0_1.eContents().get(1);
		private final RuleCall cLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0 = (RuleCall)cLayernumsAssignment_5_0_1_1.eContents().get(0);
		private final Assignment cNumAssignment_5_1 = (Assignment)cAlternatives_5.eContents().get(1);
		private final Keyword cNumNoneKeyword_5_1_0 = (Keyword)cNumAssignment_5_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Keyword cAfKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Keyword cEqualsSignKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cAfAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final Alternatives cAfAlternatives_10_0 = (Alternatives)cAfAssignment_10.eContents().get(0);
		private final Keyword cAfReluKeyword_10_0_0 = (Keyword)cAfAlternatives_10_0.eContents().get(0);
		private final Keyword cAfSigmoidKeyword_10_0_1 = (Keyword)cAfAlternatives_10_0.eContents().get(1);
		private final Keyword cAfNoneKeyword_10_0_2 = (Keyword)cAfAlternatives_10_0.eContents().get(2);
		
		///*****************************************************************************
		// *       THING / COMPONENT MODEL                                             *
		// *****************************************************************************/ Layer:
		//	'fully_connected' ':' 'dim' '=' '(' (layernums+=IntegerLiteral (',' layernums+=IntegerLiteral)* | num='None') ')' ','
		//	'af' '=' af=('relu' | 'sigmoid' | 'None');
		@Override public ParserRule getRule() { return rule; }
		
		//'fully_connected' ':' 'dim' '=' '(' (layernums+=IntegerLiteral (',' layernums+=IntegerLiteral)* | num='None') ')' ','
		//'af' '=' af=('relu' | 'sigmoid' | 'None')
		public Group getGroup() { return cGroup; }
		
		//'fully_connected'
		public Keyword getFully_connectedKeyword_0() { return cFully_connectedKeyword_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//'dim'
		public Keyword getDimKeyword_2() { return cDimKeyword_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_4() { return cLeftParenthesisKeyword_4; }
		
		//(layernums+=IntegerLiteral (',' layernums+=IntegerLiteral)* | num='None')
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//layernums+=IntegerLiteral (',' layernums+=IntegerLiteral)*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//layernums+=IntegerLiteral
		public Assignment getLayernumsAssignment_5_0_0() { return cLayernumsAssignment_5_0_0; }
		
		//IntegerLiteral
		public RuleCall getLayernumsIntegerLiteralParserRuleCall_5_0_0_0() { return cLayernumsIntegerLiteralParserRuleCall_5_0_0_0; }
		
		//(',' layernums+=IntegerLiteral)*
		public Group getGroup_5_0_1() { return cGroup_5_0_1; }
		
		//','
		public Keyword getCommaKeyword_5_0_1_0() { return cCommaKeyword_5_0_1_0; }
		
		//layernums+=IntegerLiteral
		public Assignment getLayernumsAssignment_5_0_1_1() { return cLayernumsAssignment_5_0_1_1; }
		
		//IntegerLiteral
		public RuleCall getLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0() { return cLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0; }
		
		//num='None'
		public Assignment getNumAssignment_5_1() { return cNumAssignment_5_1; }
		
		//'None'
		public Keyword getNumNoneKeyword_5_1_0() { return cNumNoneKeyword_5_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//','
		public Keyword getCommaKeyword_7() { return cCommaKeyword_7; }
		
		//'af'
		public Keyword getAfKeyword_8() { return cAfKeyword_8; }
		
		//'='
		public Keyword getEqualsSignKeyword_9() { return cEqualsSignKeyword_9; }
		
		//af=('relu' | 'sigmoid' | 'None')
		public Assignment getAfAssignment_10() { return cAfAssignment_10; }
		
		//('relu' | 'sigmoid' | 'None')
		public Alternatives getAfAlternatives_10_0() { return cAfAlternatives_10_0; }
		
		//'relu'
		public Keyword getAfReluKeyword_10_0_0() { return cAfReluKeyword_10_0_0; }
		
		//'sigmoid'
		public Keyword getAfSigmoidKeyword_10_0_1() { return cAfSigmoidKeyword_10_0_1; }
		
		//'None'
		public Keyword getAfNoneKeyword_10_0_2() { return cAfNoneKeyword_10_0_2; }
	}
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMlpKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cInputKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cLayersAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cLayersLayerParserRuleCall_4_1_0 = (RuleCall)cLayersAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Model:
		//	'mlp' name=ID '{'
		//	'input' ('->>' layers+=Layer)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'mlp' name=ID '{' 'input' ('->>' layers+=Layer)* '}'
		public Group getGroup() { return cGroup; }
		
		//'mlp'
		public Keyword getMlpKeyword_0() { return cMlpKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'input'
		public Keyword getInputKeyword_3() { return cInputKeyword_3; }
		
		//('->>' layers+=Layer)*
		public Group getGroup_4() { return cGroup_4; }
		
		//'->>'
		public Keyword getHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0() { return cHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0; }
		
		//layers+=Layer
		public Assignment getLayersAssignment_4_1() { return cLayersAssignment_4_1; }
		
		//Layer
		public RuleCall getLayersLayerParserRuleCall_4_1_0() { return cLayersLayerParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class ModelReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ModelReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUsingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cMlpKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeRefTypeRefParserRuleCall_4_0 = (RuleCall)cTypeRefAssignment_4.eContents().get(0);
		
		//ModelReference:
		//	'using' 'mlp' name=ID ':' typeRef=TypeRef;
		@Override public ParserRule getRule() { return rule; }
		
		//'using' 'mlp' name=ID ':' typeRef=TypeRef
		public Group getGroup() { return cGroup; }
		
		//'using'
		public Keyword getUsingKeyword_0() { return cUsingKeyword_0; }
		
		//'mlp'
		public Keyword getMlpKeyword_1() { return cMlpKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_4() { return cTypeRefAssignment_4; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_4_0() { return cTypeRefTypeRefParserRuleCall_4_0; }
	}
	public class StrategyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Strategy");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Keyword cInputKeyword_3_0_0 = (Keyword)cGroup_3_0.eContents().get(0);
		private final Keyword cColonKeyword_3_0_1 = (Keyword)cGroup_3_0.eContents().get(1);
		private final Assignment cTensorAssignment_3_0_2 = (Assignment)cGroup_3_0.eContents().get(2);
		private final RuleCall cTensorTensorParserRuleCall_3_0_2_0 = (RuleCall)cTensorAssignment_3_0_2.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cOutputKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Keyword cColonKeyword_3_1_1 = (Keyword)cGroup_3_1.eContents().get(1);
		private final Assignment cTensorAssignment_3_1_2 = (Assignment)cGroup_3_1.eContents().get(2);
		private final RuleCall cTensorTensorParserRuleCall_3_1_2_0 = (RuleCall)cTensorAssignment_3_1_2.eContents().get(0);
		private final Group cGroup_3_2 = (Group)cAlternatives_3.eContents().get(2);
		private final Keyword cDeviceKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Keyword cColonKeyword_3_2_1 = (Keyword)cGroup_3_2.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		private final Assignment cDevicesAssignment_3_2_3 = (Assignment)cGroup_3_2.eContents().get(3);
		private final RuleCall cDevicesCpropertyParserRuleCall_3_2_3_0 = (RuleCall)cDevicesAssignment_3_2_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_2_4 = (Keyword)cGroup_3_2.eContents().get(4);
		private final Group cGroup_3_3 = (Group)cAlternatives_3.eContents().get(3);
		private final Keyword cRewardKeyword_3_3_0 = (Keyword)cGroup_3_3.eContents().get(0);
		private final Keyword cColonKeyword_3_3_1 = (Keyword)cGroup_3_3.eContents().get(1);
		private final Assignment cTensorAssignment_3_3_2 = (Assignment)cGroup_3_3.eContents().get(2);
		private final RuleCall cTensorTensorParserRuleCall_3_3_2_0 = (RuleCall)cTensorAssignment_3_3_2.eContents().get(0);
		private final Group cGroup_3_4 = (Group)cAlternatives_3.eContents().get(4);
		private final Keyword cRewardsKeyword_3_4_0 = (Keyword)cGroup_3_4.eContents().get(0);
		private final Keyword cColonKeyword_3_4_1 = (Keyword)cGroup_3_4.eContents().get(1);
		private final Keyword cDimKeyword_3_4_2 = (Keyword)cGroup_3_4.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3_4_3 = (Keyword)cGroup_3_4.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_4_4 = (Keyword)cGroup_3_4.eContents().get(4);
		private final Group cGroup_3_4_5 = (Group)cGroup_3_4.eContents().get(5);
		private final Assignment cRewdimsAssignment_3_4_5_0 = (Assignment)cGroup_3_4_5.eContents().get(0);
		private final RuleCall cRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0 = (RuleCall)cRewdimsAssignment_3_4_5_0.eContents().get(0);
		private final Group cGroup_3_4_5_1 = (Group)cGroup_3_4_5.eContents().get(1);
		private final Keyword cCommaKeyword_3_4_5_1_0 = (Keyword)cGroup_3_4_5_1.eContents().get(0);
		private final Assignment cRewdimsAssignment_3_4_5_1_1 = (Assignment)cGroup_3_4_5_1.eContents().get(1);
		private final RuleCall cRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0 = (RuleCall)cRewdimsAssignment_3_4_5_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_4_6 = (Keyword)cGroup_3_4.eContents().get(6);
		private final Group cGroup_3_5 = (Group)cAlternatives_3.eContents().get(5);
		private final Keyword cObservationKeyword_3_5_0 = (Keyword)cGroup_3_5.eContents().get(0);
		private final Keyword cColonKeyword_3_5_1 = (Keyword)cGroup_3_5.eContents().get(1);
		private final Keyword cDimKeyword_3_5_2 = (Keyword)cGroup_3_5.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3_5_3 = (Keyword)cGroup_3_5.eContents().get(3);
		private final Keyword cLeftParenthesisKeyword_3_5_4 = (Keyword)cGroup_3_5.eContents().get(4);
		private final Group cGroup_3_5_5 = (Group)cGroup_3_5.eContents().get(5);
		private final Assignment cObsdimsAssignment_3_5_5_0 = (Assignment)cGroup_3_5_5.eContents().get(0);
		private final RuleCall cObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0 = (RuleCall)cObsdimsAssignment_3_5_5_0.eContents().get(0);
		private final Group cGroup_3_5_5_1 = (Group)cGroup_3_5_5.eContents().get(1);
		private final Keyword cCommaKeyword_3_5_5_1_0 = (Keyword)cGroup_3_5_5_1.eContents().get(0);
		private final Assignment cObsdimsAssignment_3_5_5_1_1 = (Assignment)cGroup_3_5_5_1.eContents().get(1);
		private final RuleCall cObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0 = (RuleCall)cObsdimsAssignment_3_5_5_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_5_6 = (Keyword)cGroup_3_5.eContents().get(6);
		private final Group cGroup_3_6 = (Group)cAlternatives_3.eContents().get(6);
		private final Keyword cAction_spaceKeyword_3_6_0 = (Keyword)cGroup_3_6.eContents().get(0);
		private final Keyword cColonKeyword_3_6_1 = (Keyword)cGroup_3_6.eContents().get(1);
		private final Keyword cDiscreteKeyword_3_6_2 = (Keyword)cGroup_3_6.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3_6_3 = (Keyword)cGroup_3_6.eContents().get(3);
		private final Keyword cDimKeyword_3_6_4 = (Keyword)cGroup_3_6.eContents().get(4);
		private final Keyword cEqualsSignKeyword_3_6_5 = (Keyword)cGroup_3_6.eContents().get(5);
		private final Assignment cActiondimsAssignment_3_6_6 = (Assignment)cGroup_3_6.eContents().get(6);
		private final RuleCall cActiondimsIntegerLiteralParserRuleCall_3_6_6_0 = (RuleCall)cActiondimsAssignment_3_6_6.eContents().get(0);
		private final Group cGroup_3_6_7 = (Group)cGroup_3_6.eContents().get(7);
		private final Keyword cCommaKeyword_3_6_7_0 = (Keyword)cGroup_3_6_7.eContents().get(0);
		private final Assignment cActiondimsAssignment_3_6_7_1 = (Assignment)cGroup_3_6_7.eContents().get(1);
		private final RuleCall cActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0 = (RuleCall)cActiondimsAssignment_3_6_7_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_6_8 = (Keyword)cGroup_3_6.eContents().get(8);
		private final Group cGroup_3_7 = (Group)cAlternatives_3.eContents().get(7);
		private final Keyword cP_functionKeyword_3_7_0 = (Keyword)cGroup_3_7.eContents().get(0);
		private final Keyword cColonKeyword_3_7_1 = (Keyword)cGroup_3_7.eContents().get(1);
		private final Assignment cPmodelAssignment_3_7_2 = (Assignment)cGroup_3_7.eContents().get(2);
		private final RuleCall cPmodelModelReferenceParserRuleCall_3_7_2_0 = (RuleCall)cPmodelAssignment_3_7_2.eContents().get(0);
		private final Group cGroup_3_8 = (Group)cAlternatives_3.eContents().get(8);
		private final Keyword cQ_functionKeyword_3_8_0 = (Keyword)cGroup_3_8.eContents().get(0);
		private final Keyword cColonKeyword_3_8_1 = (Keyword)cGroup_3_8.eContents().get(1);
		private final Assignment cQmodelAssignment_3_8_2 = (Assignment)cGroup_3_8.eContents().get(2);
		private final RuleCall cQmodelModelReferenceParserRuleCall_3_8_2_0 = (RuleCall)cQmodelAssignment_3_8_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		
		//Strategy:
		//	'model' name=ID '{' ('input' ':' tensor=Tensor |
		//	'output' ':' tensor=Tensor |
		//	'device' ':' '{' devices+=Cproperty* '}' |
		//	'reward' ':' tensor=Tensor |
		//	'rewards' ':' 'dim' '=' '(' (rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)? ')' |
		//	'observation' ':' 'dim' '=' '(' (obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)? ')' |
		//	'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral (',' actiondims+=IntegerLiteral)* ')' |
		//	'p_function' ':' pmodel=ModelReference |
		//	'q_function' ':' qmodel=ModelReference)*
		//	'}' annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'model' name=ID '{' ('input' ':' tensor=Tensor | 'output' ':' tensor=Tensor | 'device' ':' '{' devices+=Cproperty* '}' |
		//'reward' ':' tensor=Tensor | 'rewards' ':' 'dim' '=' '(' (rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)? ')'
		//| 'observation' ':' 'dim' '=' '(' (obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)? ')' | 'action_space' ':'
		//'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral (',' actiondims+=IntegerLiteral)* ')' | 'p_function' ':'
		//pmodel=ModelReference | 'q_function' ':' qmodel=ModelReference)* '}' annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'model'
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('input' ':' tensor=Tensor | 'output' ':' tensor=Tensor | 'device' ':' '{' devices+=Cproperty* '}' | 'reward' ':'
		//tensor=Tensor | 'rewards' ':' 'dim' '=' '(' (rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)? ')' |
		//'observation' ':' 'dim' '=' '(' (obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)? ')' | 'action_space' ':'
		//'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral (',' actiondims+=IntegerLiteral)* ')' | 'p_function' ':'
		//pmodel=ModelReference | 'q_function' ':' qmodel=ModelReference)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//'input' ':' tensor=Tensor
		public Group getGroup_3_0() { return cGroup_3_0; }
		
		//'input'
		public Keyword getInputKeyword_3_0_0() { return cInputKeyword_3_0_0; }
		
		//':'
		public Keyword getColonKeyword_3_0_1() { return cColonKeyword_3_0_1; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_3_0_2() { return cTensorAssignment_3_0_2; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_3_0_2_0() { return cTensorTensorParserRuleCall_3_0_2_0; }
		
		//'output' ':' tensor=Tensor
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//'output'
		public Keyword getOutputKeyword_3_1_0() { return cOutputKeyword_3_1_0; }
		
		//':'
		public Keyword getColonKeyword_3_1_1() { return cColonKeyword_3_1_1; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_3_1_2() { return cTensorAssignment_3_1_2; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_3_1_2_0() { return cTensorTensorParserRuleCall_3_1_2_0; }
		
		//'device' ':' '{' devices+=Cproperty* '}'
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'device'
		public Keyword getDeviceKeyword_3_2_0() { return cDeviceKeyword_3_2_0; }
		
		//':'
		public Keyword getColonKeyword_3_2_1() { return cColonKeyword_3_2_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_2_2() { return cLeftCurlyBracketKeyword_3_2_2; }
		
		//devices+=Cproperty*
		public Assignment getDevicesAssignment_3_2_3() { return cDevicesAssignment_3_2_3; }
		
		//Cproperty
		public RuleCall getDevicesCpropertyParserRuleCall_3_2_3_0() { return cDevicesCpropertyParserRuleCall_3_2_3_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_2_4() { return cRightCurlyBracketKeyword_3_2_4; }
		
		//'reward' ':' tensor=Tensor
		public Group getGroup_3_3() { return cGroup_3_3; }
		
		//'reward'
		public Keyword getRewardKeyword_3_3_0() { return cRewardKeyword_3_3_0; }
		
		//':'
		public Keyword getColonKeyword_3_3_1() { return cColonKeyword_3_3_1; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_3_3_2() { return cTensorAssignment_3_3_2; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_3_3_2_0() { return cTensorTensorParserRuleCall_3_3_2_0; }
		
		//'rewards' ':' 'dim' '=' '(' (rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)? ')'
		public Group getGroup_3_4() { return cGroup_3_4; }
		
		//'rewards'
		public Keyword getRewardsKeyword_3_4_0() { return cRewardsKeyword_3_4_0; }
		
		//':'
		public Keyword getColonKeyword_3_4_1() { return cColonKeyword_3_4_1; }
		
		//'dim'
		public Keyword getDimKeyword_3_4_2() { return cDimKeyword_3_4_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_4_3() { return cEqualsSignKeyword_3_4_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_4_4() { return cLeftParenthesisKeyword_3_4_4; }
		
		//(rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)?
		public Group getGroup_3_4_5() { return cGroup_3_4_5; }
		
		//rewdims+=IntegerLiteral
		public Assignment getRewdimsAssignment_3_4_5_0() { return cRewdimsAssignment_3_4_5_0; }
		
		//IntegerLiteral
		public RuleCall getRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0() { return cRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0; }
		
		//(',' rewdims+=IntegerLiteral)*
		public Group getGroup_3_4_5_1() { return cGroup_3_4_5_1; }
		
		//','
		public Keyword getCommaKeyword_3_4_5_1_0() { return cCommaKeyword_3_4_5_1_0; }
		
		//rewdims+=IntegerLiteral
		public Assignment getRewdimsAssignment_3_4_5_1_1() { return cRewdimsAssignment_3_4_5_1_1; }
		
		//IntegerLiteral
		public RuleCall getRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0() { return cRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_4_6() { return cRightParenthesisKeyword_3_4_6; }
		
		//'observation' ':' 'dim' '=' '(' (obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)? ')'
		public Group getGroup_3_5() { return cGroup_3_5; }
		
		//'observation'
		public Keyword getObservationKeyword_3_5_0() { return cObservationKeyword_3_5_0; }
		
		//':'
		public Keyword getColonKeyword_3_5_1() { return cColonKeyword_3_5_1; }
		
		//'dim'
		public Keyword getDimKeyword_3_5_2() { return cDimKeyword_3_5_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_5_3() { return cEqualsSignKeyword_3_5_3; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_5_4() { return cLeftParenthesisKeyword_3_5_4; }
		
		//(obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)?
		public Group getGroup_3_5_5() { return cGroup_3_5_5; }
		
		//obsdims+=IntegerLiteral
		public Assignment getObsdimsAssignment_3_5_5_0() { return cObsdimsAssignment_3_5_5_0; }
		
		//IntegerLiteral
		public RuleCall getObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0() { return cObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0; }
		
		//(',' obsdims+=IntegerLiteral)*
		public Group getGroup_3_5_5_1() { return cGroup_3_5_5_1; }
		
		//','
		public Keyword getCommaKeyword_3_5_5_1_0() { return cCommaKeyword_3_5_5_1_0; }
		
		//obsdims+=IntegerLiteral
		public Assignment getObsdimsAssignment_3_5_5_1_1() { return cObsdimsAssignment_3_5_5_1_1; }
		
		//IntegerLiteral
		public RuleCall getObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0() { return cObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_5_6() { return cRightParenthesisKeyword_3_5_6; }
		
		//'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral (',' actiondims+=IntegerLiteral)* ')'
		public Group getGroup_3_6() { return cGroup_3_6; }
		
		//'action_space'
		public Keyword getAction_spaceKeyword_3_6_0() { return cAction_spaceKeyword_3_6_0; }
		
		//':'
		public Keyword getColonKeyword_3_6_1() { return cColonKeyword_3_6_1; }
		
		//'Discrete'
		public Keyword getDiscreteKeyword_3_6_2() { return cDiscreteKeyword_3_6_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3_6_3() { return cLeftParenthesisKeyword_3_6_3; }
		
		//'dim'
		public Keyword getDimKeyword_3_6_4() { return cDimKeyword_3_6_4; }
		
		//'='
		public Keyword getEqualsSignKeyword_3_6_5() { return cEqualsSignKeyword_3_6_5; }
		
		//actiondims+=IntegerLiteral
		public Assignment getActiondimsAssignment_3_6_6() { return cActiondimsAssignment_3_6_6; }
		
		//IntegerLiteral
		public RuleCall getActiondimsIntegerLiteralParserRuleCall_3_6_6_0() { return cActiondimsIntegerLiteralParserRuleCall_3_6_6_0; }
		
		//(',' actiondims+=IntegerLiteral)*
		public Group getGroup_3_6_7() { return cGroup_3_6_7; }
		
		//','
		public Keyword getCommaKeyword_3_6_7_0() { return cCommaKeyword_3_6_7_0; }
		
		//actiondims+=IntegerLiteral
		public Assignment getActiondimsAssignment_3_6_7_1() { return cActiondimsAssignment_3_6_7_1; }
		
		//IntegerLiteral
		public RuleCall getActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0() { return cActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3_6_8() { return cRightParenthesisKeyword_3_6_8; }
		
		//'p_function' ':' pmodel=ModelReference
		public Group getGroup_3_7() { return cGroup_3_7; }
		
		//'p_function'
		public Keyword getP_functionKeyword_3_7_0() { return cP_functionKeyword_3_7_0; }
		
		//':'
		public Keyword getColonKeyword_3_7_1() { return cColonKeyword_3_7_1; }
		
		//pmodel=ModelReference
		public Assignment getPmodelAssignment_3_7_2() { return cPmodelAssignment_3_7_2; }
		
		//ModelReference
		public RuleCall getPmodelModelReferenceParserRuleCall_3_7_2_0() { return cPmodelModelReferenceParserRuleCall_3_7_2_0; }
		
		//'q_function' ':' qmodel=ModelReference
		public Group getGroup_3_8() { return cGroup_3_8; }
		
		//'q_function'
		public Keyword getQ_functionKeyword_3_8_0() { return cQ_functionKeyword_3_8_0; }
		
		//':'
		public Keyword getColonKeyword_3_8_1() { return cColonKeyword_3_8_1; }
		
		//qmodel=ModelReference
		public Assignment getQmodelAssignment_3_8_2() { return cQmodelAssignment_3_8_2; }
		
		//ModelReference
		public RuleCall getQmodelModelReferenceParserRuleCall_3_8_2_0() { return cQmodelModelReferenceParserRuleCall_3_8_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
	}
	public class MultiAgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.MultiAgent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStrategyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAgentsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAgentsAgentParserRuleCall_3_0 = (RuleCall)cAgentsAssignment_3.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		
		//MultiAgent:
		//	'strategy' name=ID '{'
		//	agents+=Agent*
		//	//'agent' 'model' name = ID amodel = StrategyProperty
		//	'}' annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'strategy' name=ID '{' agents+=Agent* //'agent' 'model' name = ID amodel = StrategyProperty
		//'}' annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'strategy'
		public Keyword getStrategyKeyword_0() { return cStrategyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//agents+=Agent*
		public Assignment getAgentsAssignment_3() { return cAgentsAssignment_3; }
		
		//Agent
		public RuleCall getAgentsAgentParserRuleCall_3_0() { return cAgentsAgentParserRuleCall_3_0; }
		
		////'agent' 'model' name = ID amodel = StrategyProperty
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
	}
	public class MultiAgentPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.MultiAgentProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUsingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cStrategyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeRefTypeRefParserRuleCall_4_0 = (RuleCall)cTypeRefAssignment_4.eContents().get(0);
		
		//MultiAgentProperty:
		//	'using' 'strategy' name=ID ':' typeRef=TypeRef;
		@Override public ParserRule getRule() { return rule; }
		
		//'using' 'strategy' name=ID ':' typeRef=TypeRef
		public Group getGroup() { return cGroup; }
		
		//'using'
		public Keyword getUsingKeyword_0() { return cUsingKeyword_0; }
		
		//'strategy'
		public Keyword getStrategyKeyword_1() { return cStrategyKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_4() { return cTypeRefAssignment_4; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_4_0() { return cTypeRefTypeRefParserRuleCall_4_0; }
	}
	public class StrategyPropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StrategyProperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cUsingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cModelKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeRefAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeRefTypeRefParserRuleCall_4_0 = (RuleCall)cTypeRefAssignment_4.eContents().get(0);
		
		//StrategyProperty:
		//	'using' 'model' name=ID ':' typeRef=TypeRef;
		@Override public ParserRule getRule() { return rule; }
		
		//'using' 'model' name=ID ':' typeRef=TypeRef
		public Group getGroup() { return cGroup; }
		
		//'using'
		public Keyword getUsingKeyword_0() { return cUsingKeyword_0; }
		
		//'model'
		public Keyword getModelKeyword_1() { return cModelKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_4() { return cTypeRefAssignment_4; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_4_0() { return cTypeRefTypeRefParserRuleCall_4_0; }
	}
	public class StrategyAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StrategyAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBindKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cStrategyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cStrategyVariableCrossReference_1_0 = (CrossReference)cStrategyAssignment_1.eContents().get(0);
		private final RuleCall cStrategyVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cStrategyVariableCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAgentAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cAgentAgentCrossReference_3_0 = (CrossReference)cAgentAssignment_3.eContents().get(0);
		private final RuleCall cAgentAgentIDTerminalRuleCall_3_0_1 = (RuleCall)cAgentAgentCrossReference_3_0.eContents().get(1);
		private final Keyword cFullStopKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cRewardKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5_0_1 = (Keyword)cGroup_5_0.eContents().get(1);
		private final Assignment cRbindFunctionAssignment_5_0_2 = (Assignment)cGroup_5_0.eContents().get(2);
		private final CrossReference cRbindFunctionPropertyCrossReference_5_0_2_0 = (CrossReference)cRbindFunctionAssignment_5_0_2.eContents().get(0);
		private final RuleCall cRbindFunctionPropertyIDTerminalRuleCall_5_0_2_0_1 = (RuleCall)cRbindFunctionPropertyCrossReference_5_0_2_0.eContents().get(1);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cInputKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5_1_1 = (Keyword)cGroup_5_1.eContents().get(1);
		private final Assignment cIbindFunctionAssignment_5_1_2 = (Assignment)cGroup_5_1.eContents().get(2);
		private final CrossReference cIbindFunctionPropertyCrossReference_5_1_2_0 = (CrossReference)cIbindFunctionAssignment_5_1_2.eContents().get(0);
		private final RuleCall cIbindFunctionPropertyIDTerminalRuleCall_5_1_2_0_1 = (RuleCall)cIbindFunctionPropertyCrossReference_5_1_2_0.eContents().get(1);
		private final Group cGroup_5_2 = (Group)cAlternatives_5.eContents().get(2);
		private final Keyword cOutputKeyword_5_2_0 = (Keyword)cGroup_5_2.eContents().get(0);
		private final Keyword cEqualsSignKeyword_5_2_1 = (Keyword)cGroup_5_2.eContents().get(1);
		private final Assignment cObindFunctionAssignment_5_2_2 = (Assignment)cGroup_5_2.eContents().get(2);
		private final CrossReference cObindFunctionPropertyCrossReference_5_2_2_0 = (CrossReference)cObindFunctionAssignment_5_2_2.eContents().get(0);
		private final RuleCall cObindFunctionPropertyIDTerminalRuleCall_5_2_2_0_1 = (RuleCall)cObindFunctionPropertyCrossReference_5_2_2_0.eContents().get(1);
		
		//StrategyAssignment:
		//	'bind' strategy=[Variable] '.' agent=[Agent] '.' ('reward' '=' rbindFunction=[Property] | 'input' '='
		//	ibindFunction=[Property] | 'output' '=' obindFunction=[Property]);
		@Override public ParserRule getRule() { return rule; }
		
		//'bind' strategy=[Variable] '.' agent=[Agent] '.' ('reward' '=' rbindFunction=[Property] | 'input' '='
		//ibindFunction=[Property] | 'output' '=' obindFunction=[Property])
		public Group getGroup() { return cGroup; }
		
		//'bind'
		public Keyword getBindKeyword_0() { return cBindKeyword_0; }
		
		//strategy=[Variable]
		public Assignment getStrategyAssignment_1() { return cStrategyAssignment_1; }
		
		//[Variable]
		public CrossReference getStrategyVariableCrossReference_1_0() { return cStrategyVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getStrategyVariableIDTerminalRuleCall_1_0_1() { return cStrategyVariableIDTerminalRuleCall_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//agent=[Agent]
		public Assignment getAgentAssignment_3() { return cAgentAssignment_3; }
		
		//[Agent]
		public CrossReference getAgentAgentCrossReference_3_0() { return cAgentAgentCrossReference_3_0; }
		
		//ID
		public RuleCall getAgentAgentIDTerminalRuleCall_3_0_1() { return cAgentAgentIDTerminalRuleCall_3_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_4() { return cFullStopKeyword_4; }
		
		//('reward' '=' rbindFunction=[Property] | 'input' '=' ibindFunction=[Property] | 'output' '=' obindFunction=[Property])
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'reward' '=' rbindFunction=[Property]
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'reward'
		public Keyword getRewardKeyword_5_0_0() { return cRewardKeyword_5_0_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5_0_1() { return cEqualsSignKeyword_5_0_1; }
		
		//rbindFunction=[Property]
		public Assignment getRbindFunctionAssignment_5_0_2() { return cRbindFunctionAssignment_5_0_2; }
		
		//[Property]
		public CrossReference getRbindFunctionPropertyCrossReference_5_0_2_0() { return cRbindFunctionPropertyCrossReference_5_0_2_0; }
		
		//ID
		public RuleCall getRbindFunctionPropertyIDTerminalRuleCall_5_0_2_0_1() { return cRbindFunctionPropertyIDTerminalRuleCall_5_0_2_0_1; }
		
		//'input' '=' ibindFunction=[Property]
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'input'
		public Keyword getInputKeyword_5_1_0() { return cInputKeyword_5_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5_1_1() { return cEqualsSignKeyword_5_1_1; }
		
		//ibindFunction=[Property]
		public Assignment getIbindFunctionAssignment_5_1_2() { return cIbindFunctionAssignment_5_1_2; }
		
		//[Property]
		public CrossReference getIbindFunctionPropertyCrossReference_5_1_2_0() { return cIbindFunctionPropertyCrossReference_5_1_2_0; }
		
		//ID
		public RuleCall getIbindFunctionPropertyIDTerminalRuleCall_5_1_2_0_1() { return cIbindFunctionPropertyIDTerminalRuleCall_5_1_2_0_1; }
		
		//'output' '=' obindFunction=[Property]
		public Group getGroup_5_2() { return cGroup_5_2; }
		
		//'output'
		public Keyword getOutputKeyword_5_2_0() { return cOutputKeyword_5_2_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_5_2_1() { return cEqualsSignKeyword_5_2_1; }
		
		//obindFunction=[Property]
		public Assignment getObindFunctionAssignment_5_2_2() { return cObindFunctionAssignment_5_2_2; }
		
		//[Property]
		public CrossReference getObindFunctionPropertyCrossReference_5_2_2_0() { return cObindFunctionPropertyCrossReference_5_2_2_0; }
		
		//ID
		public RuleCall getObindFunctionPropertyIDTerminalRuleCall_5_2_2_0_1() { return cObindFunctionPropertyIDTerminalRuleCall_5_2_2_0_1; }
	}
	public class ThingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Thing");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cThingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cFragmentAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cFragmentFragmentKeyword_1_0 = (Keyword)cFragmentAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIncludesKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIncludesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cIncludesThingCrossReference_3_1_0 = (CrossReference)cIncludesAssignment_3_1.eContents().get(0);
		private final RuleCall cIncludesThingIDTerminalRuleCall_3_1_0_1 = (RuleCall)cIncludesThingCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cCommaKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cIncludesAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final CrossReference cIncludesThingCrossReference_3_2_1_0 = (CrossReference)cIncludesAssignment_3_2_1.eContents().get(0);
		private final RuleCall cIncludesThingIDTerminalRuleCall_3_2_1_0_1 = (RuleCall)cIncludesThingCrossReference_3_2_1_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_4_0 = (RuleCall)cAnnotationsAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Assignment cMessagesAssignment_6_0 = (Assignment)cAlternatives_6.eContents().get(0);
		private final RuleCall cMessagesMessageParserRuleCall_6_0_0 = (RuleCall)cMessagesAssignment_6_0.eContents().get(0);
		private final Assignment cPortsAssignment_6_1 = (Assignment)cAlternatives_6.eContents().get(1);
		private final RuleCall cPortsPortParserRuleCall_6_1_0 = (RuleCall)cPortsAssignment_6_1.eContents().get(0);
		private final Assignment cPropertiesAssignment_6_2 = (Assignment)cAlternatives_6.eContents().get(2);
		private final RuleCall cPropertiesPropertyParserRuleCall_6_2_0 = (RuleCall)cPropertiesAssignment_6_2.eContents().get(0);
		private final Assignment cCpropertiesAssignment_6_3 = (Assignment)cAlternatives_6.eContents().get(3);
		private final RuleCall cCpropertiesCpropertyParserRuleCall_6_3_0 = (RuleCall)cCpropertiesAssignment_6_3.eContents().get(0);
		private final Assignment cFunctionsAssignment_6_4 = (Assignment)cAlternatives_6.eContents().get(4);
		private final RuleCall cFunctionsFunctionParserRuleCall_6_4_0 = (RuleCall)cFunctionsAssignment_6_4.eContents().get(0);
		private final Assignment cAssignAssignment_6_5 = (Assignment)cAlternatives_6.eContents().get(5);
		private final RuleCall cAssignPropertyAssignParserRuleCall_6_5_0 = (RuleCall)cAssignAssignment_6_5.eContents().get(0);
		private final Assignment cStrategysAssignment_6_6 = (Assignment)cAlternatives_6.eContents().get(6);
		private final RuleCall cStrategysStrategyPropertyParserRuleCall_6_6_0 = (RuleCall)cStrategysAssignment_6_6.eContents().get(0);
		private final Assignment cSassignsAssignment_6_7 = (Assignment)cAlternatives_6.eContents().get(7);
		private final RuleCall cSassignsStrategyAssignmentParserRuleCall_6_7_0 = (RuleCall)cSassignsAssignment_6_7.eContents().get(0);
		private final Assignment cMasAssignment_6_8 = (Assignment)cAlternatives_6.eContents().get(8);
		private final RuleCall cMasMultiAgentPropertyParserRuleCall_6_8_0 = (RuleCall)cMasAssignment_6_8.eContents().get(0);
		private final Assignment cBehaviourAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cBehaviourStateMachineParserRuleCall_7_0 = (RuleCall)cBehaviourAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Thing:
		//	'thing' ^fragment?='fragment'? name=ID ('includes' includes+=[Thing] ("," includes+=[Thing])*)?
		//	annotations+=PlatformAnnotation* '{' (messages+=Message | ports+=Port | properties+=Property | cproperties+=Cproperty
		//	| functions+=Function | assign+=PropertyAssign
		//	| strategys+=StrategyProperty | sassigns+=StrategyAssignment | mas+=MultiAgentProperty /* | streams+=Stream*/)*
		//	behaviour=StateMachine?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'thing' ^fragment?='fragment'? name=ID ('includes' includes+=[Thing] ("," includes+=[Thing])*)?
		//annotations+=PlatformAnnotation* '{' (messages+=Message | ports+=Port | properties+=Property | cproperties+=Cproperty |
		//functions+=Function | assign+=PropertyAssign | strategys+=StrategyProperty | sassigns+=StrategyAssignment |
		//mas+=MultiAgentProperty /* | streams+=Stream*/)* behaviour=StateMachine? '}'
		public Group getGroup() { return cGroup; }
		
		//'thing'
		public Keyword getThingKeyword_0() { return cThingKeyword_0; }
		
		//^fragment?='fragment'?
		public Assignment getFragmentAssignment_1() { return cFragmentAssignment_1; }
		
		//'fragment'
		public Keyword getFragmentFragmentKeyword_1_0() { return cFragmentFragmentKeyword_1_0; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//('includes' includes+=[Thing] ("," includes+=[Thing])*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'includes'
		public Keyword getIncludesKeyword_3_0() { return cIncludesKeyword_3_0; }
		
		//includes+=[Thing]
		public Assignment getIncludesAssignment_3_1() { return cIncludesAssignment_3_1; }
		
		//[Thing]
		public CrossReference getIncludesThingCrossReference_3_1_0() { return cIncludesThingCrossReference_3_1_0; }
		
		//ID
		public RuleCall getIncludesThingIDTerminalRuleCall_3_1_0_1() { return cIncludesThingIDTerminalRuleCall_3_1_0_1; }
		
		//("," includes+=[Thing])*
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//","
		public Keyword getCommaKeyword_3_2_0() { return cCommaKeyword_3_2_0; }
		
		//includes+=[Thing]
		public Assignment getIncludesAssignment_3_2_1() { return cIncludesAssignment_3_2_1; }
		
		//[Thing]
		public CrossReference getIncludesThingCrossReference_3_2_1_0() { return cIncludesThingCrossReference_3_2_1_0; }
		
		//ID
		public RuleCall getIncludesThingIDTerminalRuleCall_3_2_1_0_1() { return cIncludesThingIDTerminalRuleCall_3_2_1_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_4() { return cAnnotationsAssignment_4; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_4_0() { return cAnnotationsPlatformAnnotationParserRuleCall_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//(messages+=Message | ports+=Port | properties+=Property | cproperties+=Cproperty | functions+=Function |
		//assign+=PropertyAssign | strategys+=StrategyProperty | sassigns+=StrategyAssignment | mas+=MultiAgentProperty
		///* | streams+=Stream*/)*
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//messages+=Message
		public Assignment getMessagesAssignment_6_0() { return cMessagesAssignment_6_0; }
		
		//Message
		public RuleCall getMessagesMessageParserRuleCall_6_0_0() { return cMessagesMessageParserRuleCall_6_0_0; }
		
		//ports+=Port
		public Assignment getPortsAssignment_6_1() { return cPortsAssignment_6_1; }
		
		//Port
		public RuleCall getPortsPortParserRuleCall_6_1_0() { return cPortsPortParserRuleCall_6_1_0; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_6_2() { return cPropertiesAssignment_6_2; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_6_2_0() { return cPropertiesPropertyParserRuleCall_6_2_0; }
		
		//cproperties+=Cproperty
		public Assignment getCpropertiesAssignment_6_3() { return cCpropertiesAssignment_6_3; }
		
		//Cproperty
		public RuleCall getCpropertiesCpropertyParserRuleCall_6_3_0() { return cCpropertiesCpropertyParserRuleCall_6_3_0; }
		
		//functions+=Function
		public Assignment getFunctionsAssignment_6_4() { return cFunctionsAssignment_6_4; }
		
		//Function
		public RuleCall getFunctionsFunctionParserRuleCall_6_4_0() { return cFunctionsFunctionParserRuleCall_6_4_0; }
		
		//assign+=PropertyAssign
		public Assignment getAssignAssignment_6_5() { return cAssignAssignment_6_5; }
		
		//PropertyAssign
		public RuleCall getAssignPropertyAssignParserRuleCall_6_5_0() { return cAssignPropertyAssignParserRuleCall_6_5_0; }
		
		//strategys+=StrategyProperty
		public Assignment getStrategysAssignment_6_6() { return cStrategysAssignment_6_6; }
		
		//StrategyProperty
		public RuleCall getStrategysStrategyPropertyParserRuleCall_6_6_0() { return cStrategysStrategyPropertyParserRuleCall_6_6_0; }
		
		//sassigns+=StrategyAssignment
		public Assignment getSassignsAssignment_6_7() { return cSassignsAssignment_6_7; }
		
		//StrategyAssignment
		public RuleCall getSassignsStrategyAssignmentParserRuleCall_6_7_0() { return cSassignsStrategyAssignmentParserRuleCall_6_7_0; }
		
		//mas+=MultiAgentProperty
		public Assignment getMasAssignment_6_8() { return cMasAssignment_6_8; }
		
		//MultiAgentProperty
		public RuleCall getMasMultiAgentPropertyParserRuleCall_6_8_0() { return cMasMultiAgentPropertyParserRuleCall_6_8_0; }
		
		//behaviour=StateMachine?
		public Assignment getBehaviourAssignment_7() { return cBehaviourAssignment_7; }
		
		//StateMachine
		public RuleCall getBehaviourStateMachineParserRuleCall_7_0() { return cBehaviourStateMachineParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class SubThingElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.SubThing");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSubthingKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cPropertiesAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cPropertiesPropertyParserRuleCall_3_0_0 = (RuleCall)cPropertiesAssignment_3_0.eContents().get(0);
		private final Assignment cFunctionsAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cFunctionsFunctionParserRuleCall_3_1_0 = (RuleCall)cFunctionsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//SubThing:
		//	'subthing' name=ID '{' (properties+=Property | functions+=Function)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'subthing' name=ID '{' (properties+=Property | functions+=Function)* '}'
		public Group getGroup() { return cGroup; }
		
		//'subthing'
		public Keyword getSubthingKeyword_0() { return cSubthingKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(properties+=Property | functions+=Function)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_3_0() { return cPropertiesAssignment_3_0; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_3_0_0() { return cPropertiesPropertyParserRuleCall_3_0_0; }
		
		//functions+=Function
		public Assignment getFunctionsAssignment_3_1() { return cFunctionsAssignment_3_1; }
		
		//Function
		public RuleCall getFunctionsFunctionParserRuleCall_3_1_0() { return cFunctionsFunctionParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class AgentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Agent");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAgentKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cCardinalityAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cCardinalityIntegerLiteralParserRuleCall_2_1_0 = (RuleCall)cCardinalityAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cAmodelAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAmodelStrategyPropertyParserRuleCall_3_0 = (RuleCall)cAmodelAssignment_3.eContents().get(0);
		
		//Agent:
		//	'agent' name=ID ('[' cardinality=IntegerLiteral? ']')? amodel=StrategyProperty;
		@Override public ParserRule getRule() { return rule; }
		
		//'agent' name=ID ('[' cardinality=IntegerLiteral? ']')? amodel=StrategyProperty
		public Group getGroup() { return cGroup; }
		
		//'agent'
		public Keyword getAgentKeyword_0() { return cAgentKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('[' cardinality=IntegerLiteral? ']')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//cardinality=IntegerLiteral?
		public Assignment getCardinalityAssignment_2_1() { return cCardinalityAssignment_2_1; }
		
		//IntegerLiteral
		public RuleCall getCardinalityIntegerLiteralParserRuleCall_2_1_0() { return cCardinalityIntegerLiteralParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//amodel=StrategyProperty
		public Assignment getAmodelAssignment_3() { return cAmodelAssignment_3; }
		
		//StrategyProperty
		public RuleCall getAmodelStrategyPropertyParserRuleCall_3_0() { return cAmodelStrategyPropertyParserRuleCall_3_0; }
	}
	public class CpropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Cproperty");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCpropertyKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cTypeRefAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cTypeRefTypeRefParserRuleCall_3_0_0 = (RuleCall)cTypeRefAssignment_3_0.eContents().get(0);
		private final Assignment cTensorAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cTensorTensorParserRuleCall_3_1_0 = (RuleCall)cTensorAssignment_3_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_4_0 = (RuleCall)cAnnotationsAssignment_4.eContents().get(0);
		
		//Cproperty:
		//	'cproperty' name=ID ':' (typeRef=TypeRef | tensor=Tensor) annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'cproperty' name=ID ':' (typeRef=TypeRef | tensor=Tensor) annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'cproperty'
		public Keyword getCpropertyKeyword_0() { return cCpropertyKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//(typeRef=TypeRef | tensor=Tensor)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_3_0() { return cTypeRefAssignment_3_0; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_3_0_0() { return cTypeRefTypeRefParserRuleCall_3_0_0; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_3_1() { return cTensorAssignment_3_1; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_3_1_0() { return cTensorTensorParserRuleCall_3_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_4() { return cAnnotationsAssignment_4; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_4_0() { return cAnnotationsPlatformAnnotationParserRuleCall_4_0; }
	}
	public class PropertyAssignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PropertyAssign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cPropertyAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPropertyPropertyCrossReference_1_0 = (CrossReference)cPropertyAssignment_1.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_1_0_1 = (RuleCall)cPropertyPropertyCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cIndexAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cIndexExpressionParserRuleCall_2_1_0 = (RuleCall)cIndexAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cInitExpressionParserRuleCall_4_0 = (RuleCall)cInitAssignment_4.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		
		//PropertyAssign:
		//	'set' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'set' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'set'
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }
		
		//property=[Property]
		public Assignment getPropertyAssignment_1() { return cPropertyAssignment_1; }
		
		//[Property]
		public CrossReference getPropertyPropertyCrossReference_1_0() { return cPropertyPropertyCrossReference_1_0; }
		
		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_1_0_1() { return cPropertyPropertyIDTerminalRuleCall_1_0_1; }
		
		//(=> '[' index=Expression ']')?
		public Group getGroup_2() { return cGroup_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//index=Expression
		public Assignment getIndexAssignment_2_1() { return cIndexAssignment_2_1; }
		
		//Expression
		public RuleCall getIndexExpressionParserRuleCall_2_1_0() { return cIndexExpressionParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//init=Expression
		public Assignment getInitAssignment_4() { return cInitAssignment_4; }
		
		//Expression
		public RuleCall getInitExpressionParserRuleCall_4_0() { return cInitExpressionParserRuleCall_4_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
	}
	public class ProtocolElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Protocol");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProtocolKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_2_0 = (RuleCall)cAnnotationsAssignment_2.eContents().get(0);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Protocol:
		//	'protocol' name=ID annotations+=PlatformAnnotation* ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'protocol' name=ID annotations+=PlatformAnnotation* ';'?
		public Group getGroup() { return cGroup; }
		
		//'protocol'
		public Keyword getProtocolKeyword_0() { return cProtocolKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_2() { return cAnnotationsAssignment_2; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_2_0() { return cAnnotationsPlatformAnnotationParserRuleCall_2_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	public class FunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Function");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Keyword cFunctionKeyword_0_0 = (Keyword)cGroup_0.eContents().get(0);
		private final Assignment cNameAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_0_1_0 = (RuleCall)cNameAssignment_0_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Group cGroup_0_3 = (Group)cGroup_0.eContents().get(3);
		private final Assignment cParametersAssignment_0_3_0 = (Assignment)cGroup_0_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_0_3_0_0 = (RuleCall)cParametersAssignment_0_3_0.eContents().get(0);
		private final Group cGroup_0_3_1 = (Group)cGroup_0_3.eContents().get(1);
		private final Keyword cCommaKeyword_0_3_1_0 = (Keyword)cGroup_0_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_0_3_1_1 = (Assignment)cGroup_0_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_0_3_1_1_0 = (RuleCall)cParametersAssignment_0_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_4 = (Keyword)cGroup_0.eContents().get(4);
		private final Group cGroup_0_5 = (Group)cGroup_0.eContents().get(5);
		private final Keyword cColonKeyword_0_5_0 = (Keyword)cGroup_0_5.eContents().get(0);
		private final Assignment cTypeRefAssignment_0_5_1 = (Assignment)cGroup_0_5.eContents().get(1);
		private final RuleCall cTypeRefTypeRefParserRuleCall_0_5_1_0 = (RuleCall)cTypeRefAssignment_0_5_1.eContents().get(0);
		private final Group cGroup_0_6 = (Group)cGroup_0.eContents().get(6);
		private final Keyword cCommaKeyword_0_6_0 = (Keyword)cGroup_0_6.eContents().get(0);
		private final Assignment cExtraTypeRefAssignment_0_6_1 = (Assignment)cGroup_0_6.eContents().get(1);
		private final RuleCall cExtraTypeRefTypeRefParserRuleCall_0_6_1_0 = (RuleCall)cExtraTypeRefAssignment_0_6_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_0_7 = (Assignment)cGroup_0.eContents().get(7);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_0_7_0 = (RuleCall)cAnnotationsAssignment_0_7.eContents().get(0);
		private final Assignment cBodyAssignment_0_8 = (Assignment)cGroup_0.eContents().get(8);
		private final RuleCall cBodyActionParserRuleCall_0_8_0 = (RuleCall)cBodyAssignment_0_8.eContents().get(0);
		private final RuleCall cAbstractFunctionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Function:
		//	'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':' typeRef=TypeRef)? (','
		//	extraTypeRef+=TypeRef)*
		//	annotations+=PlatformAnnotation* body=Action | AbstractFunction;
		@Override public ParserRule getRule() { return rule; }
		
		//'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':' typeRef=TypeRef)? (','
		//extraTypeRef+=TypeRef)* annotations+=PlatformAnnotation* body=Action | AbstractFunction
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':' typeRef=TypeRef)? (','
		//extraTypeRef+=TypeRef)* annotations+=PlatformAnnotation* body=Action
		public Group getGroup_0() { return cGroup_0; }
		
		//'function'
		public Keyword getFunctionKeyword_0_0() { return cFunctionKeyword_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_1() { return cNameAssignment_0_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_1_0() { return cNameIDTerminalRuleCall_0_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_2() { return cLeftParenthesisKeyword_0_2; }
		
		//(parameters+=Parameter ("," parameters+=Parameter)*)?
		public Group getGroup_0_3() { return cGroup_0_3; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_0_3_0() { return cParametersAssignment_0_3_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_0_3_0_0() { return cParametersParameterParserRuleCall_0_3_0_0; }
		
		//("," parameters+=Parameter)*
		public Group getGroup_0_3_1() { return cGroup_0_3_1; }
		
		//","
		public Keyword getCommaKeyword_0_3_1_0() { return cCommaKeyword_0_3_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_0_3_1_1() { return cParametersAssignment_0_3_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_0_3_1_1_0() { return cParametersParameterParserRuleCall_0_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_4() { return cRightParenthesisKeyword_0_4; }
		
		//(':' typeRef=TypeRef)?
		public Group getGroup_0_5() { return cGroup_0_5; }
		
		//':'
		public Keyword getColonKeyword_0_5_0() { return cColonKeyword_0_5_0; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_0_5_1() { return cTypeRefAssignment_0_5_1; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_0_5_1_0() { return cTypeRefTypeRefParserRuleCall_0_5_1_0; }
		
		//(',' extraTypeRef+=TypeRef)*
		public Group getGroup_0_6() { return cGroup_0_6; }
		
		//','
		public Keyword getCommaKeyword_0_6_0() { return cCommaKeyword_0_6_0; }
		
		//extraTypeRef+=TypeRef
		public Assignment getExtraTypeRefAssignment_0_6_1() { return cExtraTypeRefAssignment_0_6_1; }
		
		//TypeRef
		public RuleCall getExtraTypeRefTypeRefParserRuleCall_0_6_1_0() { return cExtraTypeRefTypeRefParserRuleCall_0_6_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_0_7() { return cAnnotationsAssignment_0_7; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_0_7_0() { return cAnnotationsPlatformAnnotationParserRuleCall_0_7_0; }
		
		//body=Action
		public Assignment getBodyAssignment_0_8() { return cBodyAssignment_0_8; }
		
		//Action
		public RuleCall getBodyActionParserRuleCall_0_8_0() { return cBodyActionParserRuleCall_0_8_0; }
		
		//AbstractFunction
		public RuleCall getAbstractFunctionParserRuleCall_1() { return cAbstractFunctionParserRuleCall_1; }
	}
	public class AbstractFunctionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AbstractFunction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAbstractAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cAbstractAbstractKeyword_0_0 = (Keyword)cAbstractAssignment_0.eContents().get(0);
		private final Keyword cFunctionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cParametersAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_4_0_0 = (RuleCall)cParametersAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cParametersAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_4_1_1_0 = (RuleCall)cParametersAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cColonKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cTypeRefAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cTypeRefTypeRefParserRuleCall_6_1_0 = (RuleCall)cTypeRefAssignment_6_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_7_0 = (RuleCall)cAnnotationsAssignment_7.eContents().get(0);
		
		//AbstractFunction Function:
		//	abstract?='abstract' 'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':'
		//	typeRef=TypeRef)?
		//	annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//abstract?='abstract' 'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':'
		//typeRef=TypeRef)? annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//abstract?='abstract'
		public Assignment getAbstractAssignment_0() { return cAbstractAssignment_0; }
		
		//'abstract'
		public Keyword getAbstractAbstractKeyword_0_0() { return cAbstractAbstractKeyword_0_0; }
		
		//'function'
		public Keyword getFunctionKeyword_1() { return cFunctionKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//(parameters+=Parameter ("," parameters+=Parameter)*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_4_0() { return cParametersAssignment_4_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_4_0_0() { return cParametersParameterParserRuleCall_4_0_0; }
		
		//("," parameters+=Parameter)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_4_1_1() { return cParametersAssignment_4_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_4_1_1_0() { return cParametersParameterParserRuleCall_4_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//(':' typeRef=TypeRef)?
		public Group getGroup_6() { return cGroup_6; }
		
		//':'
		public Keyword getColonKeyword_6_0() { return cColonKeyword_6_0; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_6_1() { return cTypeRefAssignment_6_1; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_6_1_0() { return cTypeRefTypeRefParserRuleCall_6_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_7() { return cAnnotationsAssignment_7; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_7_0() { return cAnnotationsPlatformAnnotationParserRuleCall_7_0; }
	}
	public class PropertyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Property");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReadonlyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cReadonlyReadonlyKeyword_0_0 = (Keyword)cReadonlyAssignment_0.eContents().get(0);
		private final Keyword cPropertyKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cTypeRefAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final RuleCall cTypeRefTypeRefParserRuleCall_4_0_0_0 = (RuleCall)cTypeRefAssignment_4_0_0.eContents().get(0);
		private final Group cGroup_4_0_1 = (Group)cGroup_4_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_4_0_1_0 = (Keyword)cGroup_4_0_1.eContents().get(0);
		private final Assignment cInitAssignment_4_0_1_1 = (Assignment)cGroup_4_0_1.eContents().get(1);
		private final RuleCall cInitExpressionParserRuleCall_4_0_1_1_0 = (RuleCall)cInitAssignment_4_0_1_1.eContents().get(0);
		private final Assignment cTensorAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTensorTensorParserRuleCall_4_1_0 = (RuleCall)cTensorAssignment_4_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		
		//Property:
		//	readonly?='readonly'? 'property' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		//	annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//readonly?='readonly'? 'property' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		//annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//readonly?='readonly'?
		public Assignment getReadonlyAssignment_0() { return cReadonlyAssignment_0; }
		
		//'readonly'
		public Keyword getReadonlyReadonlyKeyword_0_0() { return cReadonlyReadonlyKeyword_0_0; }
		
		//'property'
		public Keyword getPropertyKeyword_1() { return cPropertyKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//(typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//typeRef=TypeRef ('=' init=Expression)?
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_4_0_0() { return cTypeRefAssignment_4_0_0; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_4_0_0_0() { return cTypeRefTypeRefParserRuleCall_4_0_0_0; }
		
		//('=' init=Expression)?
		public Group getGroup_4_0_1() { return cGroup_4_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_4_0_1_0() { return cEqualsSignKeyword_4_0_1_0; }
		
		//init=Expression
		public Assignment getInitAssignment_4_0_1_1() { return cInitAssignment_4_0_1_1; }
		
		//Expression
		public RuleCall getInitExpressionParserRuleCall_4_0_1_1_0() { return cInitExpressionParserRuleCall_4_0_1_1_0; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_4_1() { return cTensorAssignment_4_1; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_4_1_0() { return cTensorTensorParserRuleCall_4_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
	}
	public class MessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Message");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cMessageKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Assignment cParametersAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final RuleCall cParametersParameterParserRuleCall_3_0_0 = (RuleCall)cParametersAssignment_3_0.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cGroup_3.eContents().get(1);
		private final Keyword cCommaKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cParametersAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cParametersParameterParserRuleCall_3_1_1_0 = (RuleCall)cParametersAssignment_3_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Message:
		//	'message' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')'
		//	annotations+=PlatformAnnotation* ';'?;
		@Override public ParserRule getRule() { return rule; }
		
		//'message' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' annotations+=PlatformAnnotation* ';'?
		public Group getGroup() { return cGroup; }
		
		//'message'
		public Keyword getMessageKeyword_0() { return cMessageKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//(parameters+=Parameter ("," parameters+=Parameter)*)?
		public Group getGroup_3() { return cGroup_3; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_0() { return cParametersAssignment_3_0; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_0_0() { return cParametersParameterParserRuleCall_3_0_0; }
		
		//("," parameters+=Parameter)*
		public Group getGroup_3_1() { return cGroup_3_1; }
		
		//","
		public Keyword getCommaKeyword_3_1_0() { return cCommaKeyword_3_1_0; }
		
		//parameters+=Parameter
		public Assignment getParametersAssignment_3_1_1() { return cParametersAssignment_3_1_1; }
		
		//Parameter
		public RuleCall getParametersParameterParserRuleCall_3_1_1_0() { return cParametersParameterParserRuleCall_3_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_4() { return cRightParenthesisKeyword_4; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
		
		//';'?
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }
	}
	public class ParameterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Parameter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeRefAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeRefTypeRefParserRuleCall_2_0 = (RuleCall)cTypeRefAssignment_2.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		
		//Parameter:
		//	name=ID ':' typeRef=TypeRef annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//name=ID ':' typeRef=TypeRef annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_2() { return cTypeRefAssignment_2; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_2_0() { return cTypeRefTypeRefParserRuleCall_2_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
	}
	public class PortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Port");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cRequiredPortParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cProvidedPortParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cInternalPortParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Port:
		//	RequiredPort | ProvidedPort | InternalPort;
		@Override public ParserRule getRule() { return rule; }
		
		//RequiredPort | ProvidedPort | InternalPort
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//RequiredPort
		public RuleCall getRequiredPortParserRuleCall_0() { return cRequiredPortParserRuleCall_0; }
		
		//ProvidedPort
		public RuleCall getProvidedPortParserRuleCall_1() { return cProvidedPortParserRuleCall_1; }
		
		//InternalPort
		public RuleCall getInternalPortParserRuleCall_2() { return cInternalPortParserRuleCall_2; }
	}
	public class RequiredPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.RequiredPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOptionalAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cOptionalOptionalKeyword_0_0 = (Keyword)cOptionalAssignment_0.eContents().get(0);
		private final Keyword cRequiredKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cPortKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cNameAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cNameIDTerminalRuleCall_3_0 = (RuleCall)cNameAssignment_3.eContents().get(0);
		private final Assignment cAnnotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_4_0 = (RuleCall)cAnnotationsAssignment_4.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Alternatives cAlternatives_6 = (Alternatives)cGroup.eContents().get(6);
		private final Group cGroup_6_0 = (Group)cAlternatives_6.eContents().get(0);
		private final Keyword cSendsKeyword_6_0_0 = (Keyword)cGroup_6_0.eContents().get(0);
		private final Assignment cSendsAssignment_6_0_1 = (Assignment)cGroup_6_0.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_6_0_1_0 = (CrossReference)cSendsAssignment_6_0_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_6_0_1_0_1 = (RuleCall)cSendsMessageCrossReference_6_0_1_0.eContents().get(1);
		private final Group cGroup_6_0_2 = (Group)cGroup_6_0.eContents().get(2);
		private final Keyword cCommaKeyword_6_0_2_0 = (Keyword)cGroup_6_0_2.eContents().get(0);
		private final Assignment cSendsAssignment_6_0_2_1 = (Assignment)cGroup_6_0_2.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_6_0_2_1_0 = (CrossReference)cSendsAssignment_6_0_2_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_6_0_2_1_0_1 = (RuleCall)cSendsMessageCrossReference_6_0_2_1_0.eContents().get(1);
		private final Group cGroup_6_1 = (Group)cAlternatives_6.eContents().get(1);
		private final Keyword cReceivesKeyword_6_1_0 = (Keyword)cGroup_6_1.eContents().get(0);
		private final Assignment cReceivesAssignment_6_1_1 = (Assignment)cGroup_6_1.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_6_1_1_0 = (CrossReference)cReceivesAssignment_6_1_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_6_1_1_0_1 = (RuleCall)cReceivesMessageCrossReference_6_1_1_0.eContents().get(1);
		private final Group cGroup_6_1_2 = (Group)cGroup_6_1.eContents().get(2);
		private final Keyword cCommaKeyword_6_1_2_0 = (Keyword)cGroup_6_1_2.eContents().get(0);
		private final Assignment cReceivesAssignment_6_1_2_1 = (Assignment)cGroup_6_1_2.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_6_1_2_1_0 = (CrossReference)cReceivesAssignment_6_1_2_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_6_1_2_1_0_1 = (RuleCall)cReceivesMessageCrossReference_6_1_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//RequiredPort:
		//	optional?='optional'? 'required' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] (","
		//	sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//optional?='optional'? 'required' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] (","
		//sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)* '}'
		public Group getGroup() { return cGroup; }
		
		//optional?='optional'?
		public Assignment getOptionalAssignment_0() { return cOptionalAssignment_0; }
		
		//'optional'
		public Keyword getOptionalOptionalKeyword_0_0() { return cOptionalOptionalKeyword_0_0; }
		
		//'required'
		public Keyword getRequiredKeyword_1() { return cRequiredKeyword_1; }
		
		//'port'
		public Keyword getPortKeyword_2() { return cPortKeyword_2; }
		
		//name=ID
		public Assignment getNameAssignment_3() { return cNameAssignment_3; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_0() { return cNameIDTerminalRuleCall_3_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_4() { return cAnnotationsAssignment_4; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_4_0() { return cAnnotationsPlatformAnnotationParserRuleCall_4_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_5() { return cLeftCurlyBracketKeyword_5; }
		
		//('sends' sends+=[Message] ("," sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)*
		public Alternatives getAlternatives_6() { return cAlternatives_6; }
		
		//'sends' sends+=[Message] ("," sends+=[Message])*
		public Group getGroup_6_0() { return cGroup_6_0; }
		
		//'sends'
		public Keyword getSendsKeyword_6_0_0() { return cSendsKeyword_6_0_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_6_0_1() { return cSendsAssignment_6_0_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_6_0_1_0() { return cSendsMessageCrossReference_6_0_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_6_0_1_0_1() { return cSendsMessageIDTerminalRuleCall_6_0_1_0_1; }
		
		//("," sends+=[Message])*
		public Group getGroup_6_0_2() { return cGroup_6_0_2; }
		
		//","
		public Keyword getCommaKeyword_6_0_2_0() { return cCommaKeyword_6_0_2_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_6_0_2_1() { return cSendsAssignment_6_0_2_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_6_0_2_1_0() { return cSendsMessageCrossReference_6_0_2_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_6_0_2_1_0_1() { return cSendsMessageIDTerminalRuleCall_6_0_2_1_0_1; }
		
		//'receives' receives+=[Message] ("," receives+=[Message])*
		public Group getGroup_6_1() { return cGroup_6_1; }
		
		//'receives'
		public Keyword getReceivesKeyword_6_1_0() { return cReceivesKeyword_6_1_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_6_1_1() { return cReceivesAssignment_6_1_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_6_1_1_0() { return cReceivesMessageCrossReference_6_1_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_6_1_1_0_1() { return cReceivesMessageIDTerminalRuleCall_6_1_1_0_1; }
		
		//("," receives+=[Message])*
		public Group getGroup_6_1_2() { return cGroup_6_1_2; }
		
		//","
		public Keyword getCommaKeyword_6_1_2_0() { return cCommaKeyword_6_1_2_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_6_1_2_1() { return cReceivesAssignment_6_1_2_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_6_1_2_1_0() { return cReceivesMessageCrossReference_6_1_2_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_6_1_2_1_0_1() { return cReceivesMessageIDTerminalRuleCall_6_1_2_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ProvidedPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ProvidedPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProvidedKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPortKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cSendsKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cSendsAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_5_0_1_0 = (CrossReference)cSendsAssignment_5_0_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_5_0_1_0_1 = (RuleCall)cSendsMessageCrossReference_5_0_1_0.eContents().get(1);
		private final Group cGroup_5_0_2 = (Group)cGroup_5_0.eContents().get(2);
		private final Keyword cCommaKeyword_5_0_2_0 = (Keyword)cGroup_5_0_2.eContents().get(0);
		private final Assignment cSendsAssignment_5_0_2_1 = (Assignment)cGroup_5_0_2.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_5_0_2_1_0 = (CrossReference)cSendsAssignment_5_0_2_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_5_0_2_1_0_1 = (RuleCall)cSendsMessageCrossReference_5_0_2_1_0.eContents().get(1);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cReceivesKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cReceivesAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_5_1_1_0 = (CrossReference)cReceivesAssignment_5_1_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_5_1_1_0_1 = (RuleCall)cReceivesMessageCrossReference_5_1_1_0.eContents().get(1);
		private final Group cGroup_5_1_2 = (Group)cGroup_5_1.eContents().get(2);
		private final Keyword cCommaKeyword_5_1_2_0 = (Keyword)cGroup_5_1_2.eContents().get(0);
		private final Assignment cReceivesAssignment_5_1_2_1 = (Assignment)cGroup_5_1_2.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_5_1_2_1_0 = (CrossReference)cReceivesAssignment_5_1_2_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1 = (RuleCall)cReceivesMessageCrossReference_5_1_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//ProvidedPort:
		//	'provided' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
		//	'receives' receives+=[Message] ("," receives+=[Message])*)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'provided' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
		//'receives' receives+=[Message] ("," receives+=[Message])*)* '}'
		public Group getGroup() { return cGroup; }
		
		//'provided'
		public Keyword getProvidedKeyword_0() { return cProvidedKeyword_0; }
		
		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('sends' sends+=[Message] ("," sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'sends' sends+=[Message] ("," sends+=[Message])*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'sends'
		public Keyword getSendsKeyword_5_0_0() { return cSendsKeyword_5_0_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_5_0_1() { return cSendsAssignment_5_0_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_5_0_1_0() { return cSendsMessageCrossReference_5_0_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_5_0_1_0_1() { return cSendsMessageIDTerminalRuleCall_5_0_1_0_1; }
		
		//("," sends+=[Message])*
		public Group getGroup_5_0_2() { return cGroup_5_0_2; }
		
		//","
		public Keyword getCommaKeyword_5_0_2_0() { return cCommaKeyword_5_0_2_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_5_0_2_1() { return cSendsAssignment_5_0_2_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_5_0_2_1_0() { return cSendsMessageCrossReference_5_0_2_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1() { return cSendsMessageIDTerminalRuleCall_5_0_2_1_0_1; }
		
		//'receives' receives+=[Message] ("," receives+=[Message])*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'receives'
		public Keyword getReceivesKeyword_5_1_0() { return cReceivesKeyword_5_1_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_5_1_1() { return cReceivesAssignment_5_1_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_5_1_1_0() { return cReceivesMessageCrossReference_5_1_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_5_1_1_0_1() { return cReceivesMessageIDTerminalRuleCall_5_1_1_0_1; }
		
		//("," receives+=[Message])*
		public Group getGroup_5_1_2() { return cGroup_5_1_2; }
		
		//","
		public Keyword getCommaKeyword_5_1_2_0() { return cCommaKeyword_5_1_2_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_5_1_2_1() { return cReceivesAssignment_5_1_2_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_5_1_2_1_0() { return cReceivesMessageCrossReference_5_1_2_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1() { return cReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class InternalPortElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.InternalPort");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInternalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cPortKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final Group cGroup_5_0 = (Group)cAlternatives_5.eContents().get(0);
		private final Keyword cSendsKeyword_5_0_0 = (Keyword)cGroup_5_0.eContents().get(0);
		private final Assignment cSendsAssignment_5_0_1 = (Assignment)cGroup_5_0.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_5_0_1_0 = (CrossReference)cSendsAssignment_5_0_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_5_0_1_0_1 = (RuleCall)cSendsMessageCrossReference_5_0_1_0.eContents().get(1);
		private final Group cGroup_5_0_2 = (Group)cGroup_5_0.eContents().get(2);
		private final Keyword cCommaKeyword_5_0_2_0 = (Keyword)cGroup_5_0_2.eContents().get(0);
		private final Assignment cSendsAssignment_5_0_2_1 = (Assignment)cGroup_5_0_2.eContents().get(1);
		private final CrossReference cSendsMessageCrossReference_5_0_2_1_0 = (CrossReference)cSendsAssignment_5_0_2_1.eContents().get(0);
		private final RuleCall cSendsMessageIDTerminalRuleCall_5_0_2_1_0_1 = (RuleCall)cSendsMessageCrossReference_5_0_2_1_0.eContents().get(1);
		private final Group cGroup_5_1 = (Group)cAlternatives_5.eContents().get(1);
		private final Keyword cReceivesKeyword_5_1_0 = (Keyword)cGroup_5_1.eContents().get(0);
		private final Assignment cReceivesAssignment_5_1_1 = (Assignment)cGroup_5_1.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_5_1_1_0 = (CrossReference)cReceivesAssignment_5_1_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_5_1_1_0_1 = (RuleCall)cReceivesMessageCrossReference_5_1_1_0.eContents().get(1);
		private final Group cGroup_5_1_2 = (Group)cGroup_5_1.eContents().get(2);
		private final Keyword cCommaKeyword_5_1_2_0 = (Keyword)cGroup_5_1_2.eContents().get(0);
		private final Assignment cReceivesAssignment_5_1_2_1 = (Assignment)cGroup_5_1_2.eContents().get(1);
		private final CrossReference cReceivesMessageCrossReference_5_1_2_1_0 = (CrossReference)cReceivesAssignment_5_1_2_1.eContents().get(0);
		private final RuleCall cReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1 = (RuleCall)cReceivesMessageCrossReference_5_1_2_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//InternalPort:
		//	'internal' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
		//	'receives' receives+=[Message] ("," receives+=[Message])*)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'internal' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
		//'receives' receives+=[Message] ("," receives+=[Message])*)* '}'
		public Group getGroup() { return cGroup; }
		
		//'internal'
		public Keyword getInternalKeyword_0() { return cInternalKeyword_0; }
		
		//'port'
		public Keyword getPortKeyword_1() { return cPortKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('sends' sends+=[Message] ("," sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)*
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//'sends' sends+=[Message] ("," sends+=[Message])*
		public Group getGroup_5_0() { return cGroup_5_0; }
		
		//'sends'
		public Keyword getSendsKeyword_5_0_0() { return cSendsKeyword_5_0_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_5_0_1() { return cSendsAssignment_5_0_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_5_0_1_0() { return cSendsMessageCrossReference_5_0_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_5_0_1_0_1() { return cSendsMessageIDTerminalRuleCall_5_0_1_0_1; }
		
		//("," sends+=[Message])*
		public Group getGroup_5_0_2() { return cGroup_5_0_2; }
		
		//","
		public Keyword getCommaKeyword_5_0_2_0() { return cCommaKeyword_5_0_2_0; }
		
		//sends+=[Message]
		public Assignment getSendsAssignment_5_0_2_1() { return cSendsAssignment_5_0_2_1; }
		
		//[Message]
		public CrossReference getSendsMessageCrossReference_5_0_2_1_0() { return cSendsMessageCrossReference_5_0_2_1_0; }
		
		//ID
		public RuleCall getSendsMessageIDTerminalRuleCall_5_0_2_1_0_1() { return cSendsMessageIDTerminalRuleCall_5_0_2_1_0_1; }
		
		//'receives' receives+=[Message] ("," receives+=[Message])*
		public Group getGroup_5_1() { return cGroup_5_1; }
		
		//'receives'
		public Keyword getReceivesKeyword_5_1_0() { return cReceivesKeyword_5_1_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_5_1_1() { return cReceivesAssignment_5_1_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_5_1_1_0() { return cReceivesMessageCrossReference_5_1_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_5_1_1_0_1() { return cReceivesMessageIDTerminalRuleCall_5_1_1_0_1; }
		
		//("," receives+=[Message])*
		public Group getGroup_5_1_2() { return cGroup_5_1_2; }
		
		//","
		public Keyword getCommaKeyword_5_1_2_0() { return cCommaKeyword_5_1_2_0; }
		
		//receives+=[Message]
		public Assignment getReceivesAssignment_5_1_2_1() { return cReceivesAssignment_5_1_2_1; }
		
		//[Message]
		public CrossReference getReceivesMessageCrossReference_5_1_2_1_0() { return cReceivesMessageCrossReference_5_1_2_1_0; }
		
		//ID
		public RuleCall getReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1() { return cReceivesMessageIDTerminalRuleCall_5_1_2_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class StateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.State");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStateMachineParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFinalStateParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCompositeStateParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cStateKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cNameAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_3_1_0 = (RuleCall)cNameAssignment_3_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_2_0 = (RuleCall)cAnnotationsAssignment_3_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cPropertiesAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cPropertiesPropertyParserRuleCall_3_4_0 = (RuleCall)cPropertiesAssignment_3_4.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_3_5 = (UnorderedGroup)cGroup_3.eContents().get(5);
		private final Group cGroup_3_5_0 = (Group)cUnorderedGroup_3_5.eContents().get(0);
		private final Keyword cOnKeyword_3_5_0_0 = (Keyword)cGroup_3_5_0.eContents().get(0);
		private final Keyword cEntryKeyword_3_5_0_1 = (Keyword)cGroup_3_5_0.eContents().get(1);
		private final Assignment cEntryAssignment_3_5_0_2 = (Assignment)cGroup_3_5_0.eContents().get(2);
		private final RuleCall cEntryActionParserRuleCall_3_5_0_2_0 = (RuleCall)cEntryAssignment_3_5_0_2.eContents().get(0);
		private final Group cGroup_3_5_1 = (Group)cUnorderedGroup_3_5.eContents().get(1);
		private final Keyword cOnKeyword_3_5_1_0 = (Keyword)cGroup_3_5_1.eContents().get(0);
		private final Keyword cExitKeyword_3_5_1_1 = (Keyword)cGroup_3_5_1.eContents().get(1);
		private final Assignment cExitAssignment_3_5_1_2 = (Assignment)cGroup_3_5_1.eContents().get(2);
		private final RuleCall cExitActionParserRuleCall_3_5_1_2_0 = (RuleCall)cExitAssignment_3_5_1_2.eContents().get(0);
		private final Alternatives cAlternatives_3_5_2 = (Alternatives)cUnorderedGroup_3_5.eContents().get(2);
		private final Assignment cPropertiesAssignment_3_5_2_0 = (Assignment)cAlternatives_3_5_2.eContents().get(0);
		private final RuleCall cPropertiesPropertyParserRuleCall_3_5_2_0_0 = (RuleCall)cPropertiesAssignment_3_5_2_0.eContents().get(0);
		private final Assignment cInternalAssignment_3_5_2_1 = (Assignment)cAlternatives_3_5_2.eContents().get(1);
		private final RuleCall cInternalInternalTransitionParserRuleCall_3_5_2_1_0 = (RuleCall)cInternalAssignment_3_5_2_1.eContents().get(0);
		private final Assignment cOutgoingAssignment_3_5_2_2 = (Assignment)cAlternatives_3_5_2.eContents().get(2);
		private final RuleCall cOutgoingTransitionParserRuleCall_3_5_2_2_0 = (RuleCall)cOutgoingAssignment_3_5_2_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_6 = (Keyword)cGroup_3.eContents().get(6);
		
		///*****************************************************************************
		// *       STATE MECHINES                                                      *
		// *****************************************************************************/ State:
		//	StateMachine | FinalState | CompositeState |
		//	'state' name=ID annotations+=PlatformAnnotation* '{'
		//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
		//	internal+=InternalTransition | outgoing+=Transition)*)
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//StateMachine | FinalState | CompositeState | 'state' name=ID annotations+=PlatformAnnotation* '{' properties+=Property*
		//(('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property | internal+=InternalTransition |
		//outgoing+=Transition)*) '}'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//StateMachine
		public RuleCall getStateMachineParserRuleCall_0() { return cStateMachineParserRuleCall_0; }
		
		//FinalState
		public RuleCall getFinalStateParserRuleCall_1() { return cFinalStateParserRuleCall_1; }
		
		//CompositeState
		public RuleCall getCompositeStateParserRuleCall_2() { return cCompositeStateParserRuleCall_2; }
		
		//'state' name=ID annotations+=PlatformAnnotation* '{' properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit'
		//exit=Action)? & (properties+=Property | internal+=InternalTransition | outgoing+=Transition)*) '}'
		public Group getGroup_3() { return cGroup_3; }
		
		//'state'
		public Keyword getStateKeyword_3_0() { return cStateKeyword_3_0; }
		
		//name=ID
		public Assignment getNameAssignment_3_1() { return cNameAssignment_3_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_3_1_0() { return cNameIDTerminalRuleCall_3_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3_2() { return cAnnotationsAssignment_3_2; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_2_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_3() { return cLeftCurlyBracketKeyword_3_3; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_3_4() { return cPropertiesAssignment_3_4; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_3_4_0() { return cPropertiesPropertyParserRuleCall_3_4_0; }
		
		//(('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property | internal+=InternalTransition |
		//outgoing+=Transition)*)
		public UnorderedGroup getUnorderedGroup_3_5() { return cUnorderedGroup_3_5; }
		
		//('on' 'entry' entry=Action)?
		public Group getGroup_3_5_0() { return cGroup_3_5_0; }
		
		//'on'
		public Keyword getOnKeyword_3_5_0_0() { return cOnKeyword_3_5_0_0; }
		
		//'entry'
		public Keyword getEntryKeyword_3_5_0_1() { return cEntryKeyword_3_5_0_1; }
		
		//entry=Action
		public Assignment getEntryAssignment_3_5_0_2() { return cEntryAssignment_3_5_0_2; }
		
		//Action
		public RuleCall getEntryActionParserRuleCall_3_5_0_2_0() { return cEntryActionParserRuleCall_3_5_0_2_0; }
		
		//('on' 'exit' exit=Action)?
		public Group getGroup_3_5_1() { return cGroup_3_5_1; }
		
		//'on'
		public Keyword getOnKeyword_3_5_1_0() { return cOnKeyword_3_5_1_0; }
		
		//'exit'
		public Keyword getExitKeyword_3_5_1_1() { return cExitKeyword_3_5_1_1; }
		
		//exit=Action
		public Assignment getExitAssignment_3_5_1_2() { return cExitAssignment_3_5_1_2; }
		
		//Action
		public RuleCall getExitActionParserRuleCall_3_5_1_2_0() { return cExitActionParserRuleCall_3_5_1_2_0; }
		
		//(properties+=Property | internal+=InternalTransition | outgoing+=Transition)*
		public Alternatives getAlternatives_3_5_2() { return cAlternatives_3_5_2; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_3_5_2_0() { return cPropertiesAssignment_3_5_2_0; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_3_5_2_0_0() { return cPropertiesPropertyParserRuleCall_3_5_2_0_0; }
		
		//internal+=InternalTransition
		public Assignment getInternalAssignment_3_5_2_1() { return cInternalAssignment_3_5_2_1; }
		
		//InternalTransition
		public RuleCall getInternalInternalTransitionParserRuleCall_3_5_2_1_0() { return cInternalInternalTransitionParserRuleCall_3_5_2_1_0; }
		
		//outgoing+=Transition
		public Assignment getOutgoingAssignment_3_5_2_2() { return cOutgoingAssignment_3_5_2_2; }
		
		//Transition
		public RuleCall getOutgoingTransitionParserRuleCall_3_5_2_2_0() { return cOutgoingTransitionParserRuleCall_3_5_2_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_6() { return cRightCurlyBracketKeyword_3_6; }
	}
	public class HandlerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Handler");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTransitionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cInternalTransitionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Handler:
		//	Transition | InternalTransition;
		@Override public ParserRule getRule() { return rule; }
		
		//Transition | InternalTransition
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Transition
		public RuleCall getTransitionParserRuleCall_0() { return cTransitionParserRuleCall_0; }
		
		//InternalTransition
		public RuleCall getInternalTransitionParserRuleCall_1() { return cInternalTransitionParserRuleCall_1; }
	}
	public class TransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Transition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cTransitionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTargetAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTargetStateCrossReference_3_0 = (CrossReference)cTargetAssignment_3.eContents().get(0);
		private final RuleCall cTargetStateIDTerminalRuleCall_3_0_1 = (RuleCall)cTargetStateCrossReference_3_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_4_0 = (RuleCall)cAnnotationsAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEventKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cEventAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cEventEventParserRuleCall_5_1_0 = (RuleCall)cEventAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cGuardKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cGuardAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cGuardExpressionParserRuleCall_6_1_0 = (RuleCall)cGuardAssignment_6_1.eContents().get(0);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cActionKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cActionAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final RuleCall cActionActionParserRuleCall_7_1_0 = (RuleCall)cActionAssignment_7_1.eContents().get(0);
		
		//Transition:
		//	'transition' name=ID? '->' target=[State] annotations+=PlatformAnnotation* ('event' event=Event)? ('guard'
		//	guard=Expression)? ('action' action=Action)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'transition' name=ID? '->' target=[State] annotations+=PlatformAnnotation* ('event' event=Event)? ('guard'
		//guard=Expression)? ('action' action=Action)?
		public Group getGroup() { return cGroup; }
		
		//'transition'
		public Keyword getTransitionKeyword_0() { return cTransitionKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'->'
		public Keyword getHyphenMinusGreaterThanSignKeyword_2() { return cHyphenMinusGreaterThanSignKeyword_2; }
		
		//target=[State]
		public Assignment getTargetAssignment_3() { return cTargetAssignment_3; }
		
		//[State]
		public CrossReference getTargetStateCrossReference_3_0() { return cTargetStateCrossReference_3_0; }
		
		//ID
		public RuleCall getTargetStateIDTerminalRuleCall_3_0_1() { return cTargetStateIDTerminalRuleCall_3_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_4() { return cAnnotationsAssignment_4; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_4_0() { return cAnnotationsPlatformAnnotationParserRuleCall_4_0; }
		
		//('event' event=Event)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'event'
		public Keyword getEventKeyword_5_0() { return cEventKeyword_5_0; }
		
		//event=Event
		public Assignment getEventAssignment_5_1() { return cEventAssignment_5_1; }
		
		//Event
		public RuleCall getEventEventParserRuleCall_5_1_0() { return cEventEventParserRuleCall_5_1_0; }
		
		//('guard' guard=Expression)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'guard'
		public Keyword getGuardKeyword_6_0() { return cGuardKeyword_6_0; }
		
		//guard=Expression
		public Assignment getGuardAssignment_6_1() { return cGuardAssignment_6_1; }
		
		//Expression
		public RuleCall getGuardExpressionParserRuleCall_6_1_0() { return cGuardExpressionParserRuleCall_6_1_0; }
		
		//('action' action=Action)?
		public Group getGroup_7() { return cGroup_7; }
		
		//'action'
		public Keyword getActionKeyword_7_0() { return cActionKeyword_7_0; }
		
		//action=Action
		public Assignment getActionAssignment_7_1() { return cActionAssignment_7_1; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_7_1_0() { return cActionActionParserRuleCall_7_1_0; }
	}
	public class InternalTransitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.InternalTransition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cInternalTransitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cInternalKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cEventKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cEventAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cEventEventParserRuleCall_4_1_0 = (RuleCall)cEventAssignment_4_1.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cGuardKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cGuardAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cGuardExpressionParserRuleCall_5_1_0 = (RuleCall)cGuardAssignment_5_1.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cActionKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cActionAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cActionActionParserRuleCall_6_1_0 = (RuleCall)cActionAssignment_6_1.eContents().get(0);
		
		//InternalTransition:
		//	{InternalTransition}
		//	'internal' name=ID?
		//	annotations+=PlatformAnnotation* ('event' event=Event)? ('guard' guard=Expression)? ('action' action=Action)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{InternalTransition} 'internal' name=ID? annotations+=PlatformAnnotation* ('event' event=Event)? ('guard'
		//guard=Expression)? ('action' action=Action)?
		public Group getGroup() { return cGroup; }
		
		//{InternalTransition}
		public Action getInternalTransitionAction_0() { return cInternalTransitionAction_0; }
		
		//'internal'
		public Keyword getInternalKeyword_1() { return cInternalKeyword_1; }
		
		//name=ID?
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
		
		//('event' event=Event)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'event'
		public Keyword getEventKeyword_4_0() { return cEventKeyword_4_0; }
		
		//event=Event
		public Assignment getEventAssignment_4_1() { return cEventAssignment_4_1; }
		
		//Event
		public RuleCall getEventEventParserRuleCall_4_1_0() { return cEventEventParserRuleCall_4_1_0; }
		
		//('guard' guard=Expression)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'guard'
		public Keyword getGuardKeyword_5_0() { return cGuardKeyword_5_0; }
		
		//guard=Expression
		public Assignment getGuardAssignment_5_1() { return cGuardAssignment_5_1; }
		
		//Expression
		public RuleCall getGuardExpressionParserRuleCall_5_1_0() { return cGuardExpressionParserRuleCall_5_1_0; }
		
		//('action' action=Action)?
		public Group getGroup_6() { return cGroup_6; }
		
		//'action'
		public Keyword getActionKeyword_6_0() { return cActionKeyword_6_0; }
		
		//action=Action
		public Assignment getActionAssignment_6_1() { return cActionAssignment_6_1; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_6_1_0() { return cActionActionParserRuleCall_6_1_0; }
	}
	public class CompositeStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CompositeState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cCompositeKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cInitKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitialAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInitialStateCrossReference_4_0 = (CrossReference)cInitialAssignment_4.eContents().get(0);
		private final RuleCall cInitialStateIDTerminalRuleCall_4_0_1 = (RuleCall)cInitialStateCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cKeepsKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cHistoryAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final Keyword cHistoryHistoryKeyword_5_1_0 = (Keyword)cHistoryAssignment_5_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_6_0 = (RuleCall)cAnnotationsAssignment_6.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cPropertiesAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cPropertiesPropertyParserRuleCall_8_0 = (RuleCall)cPropertiesAssignment_8.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_9 = (UnorderedGroup)cGroup.eContents().get(9);
		private final Group cGroup_9_0 = (Group)cUnorderedGroup_9.eContents().get(0);
		private final Keyword cOnKeyword_9_0_0 = (Keyword)cGroup_9_0.eContents().get(0);
		private final Keyword cEntryKeyword_9_0_1 = (Keyword)cGroup_9_0.eContents().get(1);
		private final Assignment cEntryAssignment_9_0_2 = (Assignment)cGroup_9_0.eContents().get(2);
		private final RuleCall cEntryActionParserRuleCall_9_0_2_0 = (RuleCall)cEntryAssignment_9_0_2.eContents().get(0);
		private final Group cGroup_9_1 = (Group)cUnorderedGroup_9.eContents().get(1);
		private final Keyword cOnKeyword_9_1_0 = (Keyword)cGroup_9_1.eContents().get(0);
		private final Keyword cExitKeyword_9_1_1 = (Keyword)cGroup_9_1.eContents().get(1);
		private final Assignment cExitAssignment_9_1_2 = (Assignment)cGroup_9_1.eContents().get(2);
		private final RuleCall cExitActionParserRuleCall_9_1_2_0 = (RuleCall)cExitAssignment_9_1_2.eContents().get(0);
		private final Alternatives cAlternatives_9_2 = (Alternatives)cUnorderedGroup_9.eContents().get(2);
		private final Assignment cPropertiesAssignment_9_2_0 = (Assignment)cAlternatives_9_2.eContents().get(0);
		private final RuleCall cPropertiesPropertyParserRuleCall_9_2_0_0 = (RuleCall)cPropertiesAssignment_9_2_0.eContents().get(0);
		private final Assignment cSubstateAssignment_9_2_1 = (Assignment)cAlternatives_9_2.eContents().get(1);
		private final RuleCall cSubstateStateParserRuleCall_9_2_1_0 = (RuleCall)cSubstateAssignment_9_2_1.eContents().get(0);
		private final Assignment cInternalAssignment_9_2_2 = (Assignment)cAlternatives_9_2.eContents().get(2);
		private final RuleCall cInternalInternalTransitionParserRuleCall_9_2_2_0 = (RuleCall)cInternalAssignment_9_2_2.eContents().get(0);
		private final Assignment cOutgoingAssignment_9_2_3 = (Assignment)cAlternatives_9_2.eContents().get(3);
		private final RuleCall cOutgoingTransitionParserRuleCall_9_2_3_0 = (RuleCall)cOutgoingAssignment_9_2_3.eContents().get(0);
		private final Alternatives cAlternatives_10 = (Alternatives)cGroup.eContents().get(10);
		private final Assignment cRegionAssignment_10_0 = (Assignment)cAlternatives_10.eContents().get(0);
		private final RuleCall cRegionRegionParserRuleCall_10_0_0 = (RuleCall)cRegionAssignment_10_0.eContents().get(0);
		private final Assignment cSessionAssignment_10_1 = (Assignment)cAlternatives_10.eContents().get(1);
		private final RuleCall cSessionSessionParserRuleCall_10_1_0 = (RuleCall)cSessionAssignment_10_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_11 = (Keyword)cGroup.eContents().get(11);
		
		//CompositeState:
		//	'composite' 'state' name=ID 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
		//	substate+=State | internal+=InternalTransition | outgoing+=Transition)*) (region+=Region | session+=Session)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'composite' 'state' name=ID 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
		//substate+=State | internal+=InternalTransition | outgoing+=Transition)*) (region+=Region | session+=Session)* '}'
		public Group getGroup() { return cGroup; }
		
		//'composite'
		public Keyword getCompositeKeyword_0() { return cCompositeKeyword_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'init'
		public Keyword getInitKeyword_3() { return cInitKeyword_3; }
		
		//initial=[State]
		public Assignment getInitialAssignment_4() { return cInitialAssignment_4; }
		
		//[State]
		public CrossReference getInitialStateCrossReference_4_0() { return cInitialStateCrossReference_4_0; }
		
		//ID
		public RuleCall getInitialStateIDTerminalRuleCall_4_0_1() { return cInitialStateIDTerminalRuleCall_4_0_1; }
		
		//('keeps' history?='history')?
		public Group getGroup_5() { return cGroup_5; }
		
		//'keeps'
		public Keyword getKeepsKeyword_5_0() { return cKeepsKeyword_5_0; }
		
		//history?='history'
		public Assignment getHistoryAssignment_5_1() { return cHistoryAssignment_5_1; }
		
		//'history'
		public Keyword getHistoryHistoryKeyword_5_1_0() { return cHistoryHistoryKeyword_5_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_6() { return cAnnotationsAssignment_6; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_6_0() { return cAnnotationsPlatformAnnotationParserRuleCall_6_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_7() { return cLeftCurlyBracketKeyword_7; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_8() { return cPropertiesAssignment_8; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_8_0() { return cPropertiesPropertyParserRuleCall_8_0; }
		
		//(('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property | substate+=State |
		//internal+=InternalTransition | outgoing+=Transition)*)
		public UnorderedGroup getUnorderedGroup_9() { return cUnorderedGroup_9; }
		
		//('on' 'entry' entry=Action)?
		public Group getGroup_9_0() { return cGroup_9_0; }
		
		//'on'
		public Keyword getOnKeyword_9_0_0() { return cOnKeyword_9_0_0; }
		
		//'entry'
		public Keyword getEntryKeyword_9_0_1() { return cEntryKeyword_9_0_1; }
		
		//entry=Action
		public Assignment getEntryAssignment_9_0_2() { return cEntryAssignment_9_0_2; }
		
		//Action
		public RuleCall getEntryActionParserRuleCall_9_0_2_0() { return cEntryActionParserRuleCall_9_0_2_0; }
		
		//('on' 'exit' exit=Action)?
		public Group getGroup_9_1() { return cGroup_9_1; }
		
		//'on'
		public Keyword getOnKeyword_9_1_0() { return cOnKeyword_9_1_0; }
		
		//'exit'
		public Keyword getExitKeyword_9_1_1() { return cExitKeyword_9_1_1; }
		
		//exit=Action
		public Assignment getExitAssignment_9_1_2() { return cExitAssignment_9_1_2; }
		
		//Action
		public RuleCall getExitActionParserRuleCall_9_1_2_0() { return cExitActionParserRuleCall_9_1_2_0; }
		
		//(properties+=Property | substate+=State | internal+=InternalTransition | outgoing+=Transition)*
		public Alternatives getAlternatives_9_2() { return cAlternatives_9_2; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_9_2_0() { return cPropertiesAssignment_9_2_0; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_9_2_0_0() { return cPropertiesPropertyParserRuleCall_9_2_0_0; }
		
		//substate+=State
		public Assignment getSubstateAssignment_9_2_1() { return cSubstateAssignment_9_2_1; }
		
		//State
		public RuleCall getSubstateStateParserRuleCall_9_2_1_0() { return cSubstateStateParserRuleCall_9_2_1_0; }
		
		//internal+=InternalTransition
		public Assignment getInternalAssignment_9_2_2() { return cInternalAssignment_9_2_2; }
		
		//InternalTransition
		public RuleCall getInternalInternalTransitionParserRuleCall_9_2_2_0() { return cInternalInternalTransitionParserRuleCall_9_2_2_0; }
		
		//outgoing+=Transition
		public Assignment getOutgoingAssignment_9_2_3() { return cOutgoingAssignment_9_2_3; }
		
		//Transition
		public RuleCall getOutgoingTransitionParserRuleCall_9_2_3_0() { return cOutgoingTransitionParserRuleCall_9_2_3_0; }
		
		//(region+=Region | session+=Session)*
		public Alternatives getAlternatives_10() { return cAlternatives_10; }
		
		//region+=Region
		public Assignment getRegionAssignment_10_0() { return cRegionAssignment_10_0; }
		
		//Region
		public RuleCall getRegionRegionParserRuleCall_10_0_0() { return cRegionRegionParserRuleCall_10_0_0; }
		
		//session+=Session
		public Assignment getSessionAssignment_10_1() { return cSessionAssignment_10_1; }
		
		//Session
		public RuleCall getSessionSessionParserRuleCall_10_1_0() { return cSessionSessionParserRuleCall_10_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_11() { return cRightCurlyBracketKeyword_11; }
	}
	public class StateMachineElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StateMachine");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStatechartKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInitKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInitialStateCrossReference_3_0 = (CrossReference)cInitialAssignment_3.eContents().get(0);
		private final RuleCall cInitialStateIDTerminalRuleCall_3_0_1 = (RuleCall)cInitialStateCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cKeepsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cHistoryAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Keyword cHistoryHistoryKeyword_4_1_0 = (Keyword)cHistoryAssignment_4_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cPropertiesAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cPropertiesPropertyParserRuleCall_7_0 = (RuleCall)cPropertiesAssignment_7.eContents().get(0);
		private final UnorderedGroup cUnorderedGroup_8 = (UnorderedGroup)cGroup.eContents().get(8);
		private final Group cGroup_8_0 = (Group)cUnorderedGroup_8.eContents().get(0);
		private final Keyword cOnKeyword_8_0_0 = (Keyword)cGroup_8_0.eContents().get(0);
		private final Keyword cEntryKeyword_8_0_1 = (Keyword)cGroup_8_0.eContents().get(1);
		private final Assignment cEntryAssignment_8_0_2 = (Assignment)cGroup_8_0.eContents().get(2);
		private final RuleCall cEntryActionParserRuleCall_8_0_2_0 = (RuleCall)cEntryAssignment_8_0_2.eContents().get(0);
		private final Group cGroup_8_1 = (Group)cUnorderedGroup_8.eContents().get(1);
		private final Keyword cOnKeyword_8_1_0 = (Keyword)cGroup_8_1.eContents().get(0);
		private final Keyword cExitKeyword_8_1_1 = (Keyword)cGroup_8_1.eContents().get(1);
		private final Assignment cExitAssignment_8_1_2 = (Assignment)cGroup_8_1.eContents().get(2);
		private final RuleCall cExitActionParserRuleCall_8_1_2_0 = (RuleCall)cExitAssignment_8_1_2.eContents().get(0);
		private final Alternatives cAlternatives_8_2 = (Alternatives)cUnorderedGroup_8.eContents().get(2);
		private final Assignment cPropertiesAssignment_8_2_0 = (Assignment)cAlternatives_8_2.eContents().get(0);
		private final RuleCall cPropertiesPropertyParserRuleCall_8_2_0_0 = (RuleCall)cPropertiesAssignment_8_2_0.eContents().get(0);
		private final Assignment cSubstateAssignment_8_2_1 = (Assignment)cAlternatives_8_2.eContents().get(1);
		private final RuleCall cSubstateStateParserRuleCall_8_2_1_0 = (RuleCall)cSubstateAssignment_8_2_1.eContents().get(0);
		private final Assignment cInternalAssignment_8_2_2 = (Assignment)cAlternatives_8_2.eContents().get(2);
		private final RuleCall cInternalInternalTransitionParserRuleCall_8_2_2_0 = (RuleCall)cInternalAssignment_8_2_2.eContents().get(0);
		private final Alternatives cAlternatives_9 = (Alternatives)cGroup.eContents().get(9);
		private final Assignment cRegionAssignment_9_0 = (Assignment)cAlternatives_9.eContents().get(0);
		private final RuleCall cRegionRegionParserRuleCall_9_0_0 = (RuleCall)cRegionAssignment_9_0.eContents().get(0);
		private final Assignment cSessionAssignment_9_1 = (Assignment)cAlternatives_9.eContents().get(1);
		private final RuleCall cSessionSessionParserRuleCall_9_1_0 = (RuleCall)cSessionAssignment_9_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_10 = (Keyword)cGroup.eContents().get(10);
		
		//StateMachine CompositeState: // Actually only another syntax for a composite state
		//	'statechart' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
		//	substate+=State | internal+=InternalTransition)*) (region+=Region | session+=Session)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//// Actually only another syntax for a composite state
		//'statechart' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
		//substate+=State | internal+=InternalTransition)*) (region+=Region | session+=Session)* '}'
		public Group getGroup() { return cGroup; }
		
		//// Actually only another syntax for a composite state
		//'statechart'
		public Keyword getStatechartKeyword_0() { return cStatechartKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'init'
		public Keyword getInitKeyword_2() { return cInitKeyword_2; }
		
		//initial=[State]
		public Assignment getInitialAssignment_3() { return cInitialAssignment_3; }
		
		//[State]
		public CrossReference getInitialStateCrossReference_3_0() { return cInitialStateCrossReference_3_0; }
		
		//ID
		public RuleCall getInitialStateIDTerminalRuleCall_3_0_1() { return cInitialStateIDTerminalRuleCall_3_0_1; }
		
		//('keeps' history?='history')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'keeps'
		public Keyword getKeepsKeyword_4_0() { return cKeepsKeyword_4_0; }
		
		//history?='history'
		public Assignment getHistoryAssignment_4_1() { return cHistoryAssignment_4_1; }
		
		//'history'
		public Keyword getHistoryHistoryKeyword_4_1_0() { return cHistoryHistoryKeyword_4_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//properties+=Property*
		public Assignment getPropertiesAssignment_7() { return cPropertiesAssignment_7; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_7_0() { return cPropertiesPropertyParserRuleCall_7_0; }
		
		//(('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property | substate+=State |
		//internal+=InternalTransition)*)
		public UnorderedGroup getUnorderedGroup_8() { return cUnorderedGroup_8; }
		
		//('on' 'entry' entry=Action)?
		public Group getGroup_8_0() { return cGroup_8_0; }
		
		//'on'
		public Keyword getOnKeyword_8_0_0() { return cOnKeyword_8_0_0; }
		
		//'entry'
		public Keyword getEntryKeyword_8_0_1() { return cEntryKeyword_8_0_1; }
		
		//entry=Action
		public Assignment getEntryAssignment_8_0_2() { return cEntryAssignment_8_0_2; }
		
		//Action
		public RuleCall getEntryActionParserRuleCall_8_0_2_0() { return cEntryActionParserRuleCall_8_0_2_0; }
		
		//('on' 'exit' exit=Action)?
		public Group getGroup_8_1() { return cGroup_8_1; }
		
		//'on'
		public Keyword getOnKeyword_8_1_0() { return cOnKeyword_8_1_0; }
		
		//'exit'
		public Keyword getExitKeyword_8_1_1() { return cExitKeyword_8_1_1; }
		
		//exit=Action
		public Assignment getExitAssignment_8_1_2() { return cExitAssignment_8_1_2; }
		
		//Action
		public RuleCall getExitActionParserRuleCall_8_1_2_0() { return cExitActionParserRuleCall_8_1_2_0; }
		
		//(properties+=Property | substate+=State | internal+=InternalTransition)*
		public Alternatives getAlternatives_8_2() { return cAlternatives_8_2; }
		
		//properties+=Property
		public Assignment getPropertiesAssignment_8_2_0() { return cPropertiesAssignment_8_2_0; }
		
		//Property
		public RuleCall getPropertiesPropertyParserRuleCall_8_2_0_0() { return cPropertiesPropertyParserRuleCall_8_2_0_0; }
		
		//substate+=State
		public Assignment getSubstateAssignment_8_2_1() { return cSubstateAssignment_8_2_1; }
		
		//State
		public RuleCall getSubstateStateParserRuleCall_8_2_1_0() { return cSubstateStateParserRuleCall_8_2_1_0; }
		
		//internal+=InternalTransition
		public Assignment getInternalAssignment_8_2_2() { return cInternalAssignment_8_2_2; }
		
		//InternalTransition
		public RuleCall getInternalInternalTransitionParserRuleCall_8_2_2_0() { return cInternalInternalTransitionParserRuleCall_8_2_2_0; }
		
		//(region+=Region | session+=Session)*
		public Alternatives getAlternatives_9() { return cAlternatives_9; }
		
		//region+=Region
		public Assignment getRegionAssignment_9_0() { return cRegionAssignment_9_0; }
		
		//Region
		public RuleCall getRegionRegionParserRuleCall_9_0_0() { return cRegionRegionParserRuleCall_9_0_0; }
		
		//session+=Session
		public Assignment getSessionAssignment_9_1() { return cSessionAssignment_9_1; }
		
		//Session
		public RuleCall getSessionSessionParserRuleCall_9_1_0() { return cSessionSessionParserRuleCall_9_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_10() { return cRightCurlyBracketKeyword_10; }
	}
	public class SessionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Session");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSessionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLessThanSignKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMaxInstancesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final Alternatives cMaxInstancesAlternatives_2_1_0 = (Alternatives)cMaxInstancesAssignment_2_1.eContents().get(0);
		private final RuleCall cMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0 = (RuleCall)cMaxInstancesAlternatives_2_1_0.eContents().get(0);
		private final RuleCall cMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1 = (RuleCall)cMaxInstancesAlternatives_2_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Keyword cInitKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cInitialAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cInitialStateCrossReference_4_0 = (CrossReference)cInitialAssignment_4.eContents().get(0);
		private final RuleCall cInitialStateIDTerminalRuleCall_4_0_1 = (RuleCall)cInitialStateCrossReference_4_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cSubstateAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSubstateStateParserRuleCall_7_0 = (RuleCall)cSubstateAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Session:
		//	'session' name=ID ('<' maxInstances=(IntegerLiteral | PropertyReference) '>')? 'init' initial=[State]
		//	annotations+=PlatformAnnotation* '{'
		//	substate+=State*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'session' name=ID ('<' maxInstances=(IntegerLiteral | PropertyReference) '>')? 'init' initial=[State]
		//annotations+=PlatformAnnotation* '{' substate+=State* '}'
		public Group getGroup() { return cGroup; }
		
		//'session'
		public Keyword getSessionKeyword_0() { return cSessionKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('<' maxInstances=(IntegerLiteral | PropertyReference) '>')?
		public Group getGroup_2() { return cGroup_2; }
		
		//'<'
		public Keyword getLessThanSignKeyword_2_0() { return cLessThanSignKeyword_2_0; }
		
		//maxInstances=(IntegerLiteral | PropertyReference)
		public Assignment getMaxInstancesAssignment_2_1() { return cMaxInstancesAssignment_2_1; }
		
		//(IntegerLiteral | PropertyReference)
		public Alternatives getMaxInstancesAlternatives_2_1_0() { return cMaxInstancesAlternatives_2_1_0; }
		
		//IntegerLiteral
		public RuleCall getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0() { return cMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0; }
		
		//PropertyReference
		public RuleCall getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1() { return cMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1; }
		
		//'>'
		public Keyword getGreaterThanSignKeyword_2_2() { return cGreaterThanSignKeyword_2_2; }
		
		//'init'
		public Keyword getInitKeyword_3() { return cInitKeyword_3; }
		
		//initial=[State]
		public Assignment getInitialAssignment_4() { return cInitialAssignment_4; }
		
		//[State]
		public CrossReference getInitialStateCrossReference_4_0() { return cInitialStateCrossReference_4_0; }
		
		//ID
		public RuleCall getInitialStateIDTerminalRuleCall_4_0_1() { return cInitialStateIDTerminalRuleCall_4_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//substate+=State*
		public Assignment getSubstateAssignment_7() { return cSubstateAssignment_7; }
		
		//State
		public RuleCall getSubstateStateParserRuleCall_7_0() { return cSubstateStateParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class RegionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Region");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRegionKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cInitKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cInitialAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cInitialStateCrossReference_3_0 = (CrossReference)cInitialAssignment_3.eContents().get(0);
		private final RuleCall cInitialStateIDTerminalRuleCall_3_0_1 = (RuleCall)cInitialStateCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cKeepsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cHistoryAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final Keyword cHistoryHistoryKeyword_4_1_0 = (Keyword)cHistoryAssignment_4_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cSubstateAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cSubstateStateParserRuleCall_7_0 = (RuleCall)cSubstateAssignment_7.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_8 = (Keyword)cGroup.eContents().get(8);
		
		//Region:
		//	'region' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//	substate+=State*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'region' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
		//substate+=State* '}'
		public Group getGroup() { return cGroup; }
		
		//'region'
		public Keyword getRegionKeyword_0() { return cRegionKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'init'
		public Keyword getInitKeyword_2() { return cInitKeyword_2; }
		
		//initial=[State]
		public Assignment getInitialAssignment_3() { return cInitialAssignment_3; }
		
		//[State]
		public CrossReference getInitialStateCrossReference_3_0() { return cInitialStateCrossReference_3_0; }
		
		//ID
		public RuleCall getInitialStateIDTerminalRuleCall_3_0_1() { return cInitialStateIDTerminalRuleCall_3_0_1; }
		
		//('keeps' history?='history')?
		public Group getGroup_4() { return cGroup_4; }
		
		//'keeps'
		public Keyword getKeepsKeyword_4_0() { return cKeepsKeyword_4_0; }
		
		//history?='history'
		public Assignment getHistoryAssignment_4_1() { return cHistoryAssignment_4_1; }
		
		//'history'
		public Keyword getHistoryHistoryKeyword_4_1_0() { return cHistoryHistoryKeyword_4_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//substate+=State*
		public Assignment getSubstateAssignment_7() { return cSubstateAssignment_7; }
		
		//State
		public RuleCall getSubstateStateParserRuleCall_7_0() { return cSubstateStateParserRuleCall_7_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_8() { return cRightCurlyBracketKeyword_8; }
	}
	public class FinalStateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.FinalState");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFinalKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cStateKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Assignment cAnnotationsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_3_0 = (RuleCall)cAnnotationsAssignment_3.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cOnKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Keyword cEntryKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cEntryAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cEntryActionParserRuleCall_5_2_0 = (RuleCall)cEntryAssignment_5_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//FinalState:
		//	'final' 'state' name=ID annotations+=PlatformAnnotation* '{' ('on' 'entry' entry=Action)? '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'final' 'state' name=ID annotations+=PlatformAnnotation* '{' ('on' 'entry' entry=Action)? '}'
		public Group getGroup() { return cGroup; }
		
		//'final'
		public Keyword getFinalKeyword_0() { return cFinalKeyword_0; }
		
		//'state'
		public Keyword getStateKeyword_1() { return cStateKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_3() { return cAnnotationsAssignment_3; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_3_0() { return cAnnotationsPlatformAnnotationParserRuleCall_3_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }
		
		//('on' 'entry' entry=Action)?
		public Group getGroup_5() { return cGroup_5; }
		
		//'on'
		public Keyword getOnKeyword_5_0() { return cOnKeyword_5_0; }
		
		//'entry'
		public Keyword getEntryKeyword_5_1() { return cEntryKeyword_5_1; }
		
		//entry=Action
		public Assignment getEntryAssignment_5_2() { return cEntryAssignment_5_2; }
		
		//Action
		public RuleCall getEntryActionParserRuleCall_5_2_0() { return cEntryActionParserRuleCall_5_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class StateContainerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StateContainer");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCompositeStateParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cRegionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSessionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Keyword cKeepsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cInitialAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cInitialStateCrossReference_3_1_0 = (CrossReference)cInitialAssignment_3_1.eContents().get(0);
		private final RuleCall cInitialStateIDTerminalRuleCall_3_1_0_1 = (RuleCall)cInitialStateCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cKeepsKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cHistoryAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final Keyword cHistoryHistoryKeyword_3_2_1_0 = (Keyword)cHistoryAssignment_3_2_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Assignment cSubstateAssignment_3_4 = (Assignment)cGroup_3.eContents().get(4);
		private final RuleCall cSubstateStateParserRuleCall_3_4_0 = (RuleCall)cSubstateAssignment_3_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3_5 = (Keyword)cGroup_3.eContents().get(5);
		
		//StateContainer:
		//	CompositeState | Region | Session |
		//	'keeps' initial=[State] ('keeps' history?='history')? '{' // This is never used, it is just to have the attributes in the superclass
		//	substate+=State*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//CompositeState | Region | Session | 'keeps' initial=[State] ('keeps' history?='history')? '{' // This is never used, it is just to have the attributes in the superclass
		//substate+=State* '}'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CompositeState
		public RuleCall getCompositeStateParserRuleCall_0() { return cCompositeStateParserRuleCall_0; }
		
		//Region
		public RuleCall getRegionParserRuleCall_1() { return cRegionParserRuleCall_1; }
		
		//Session
		public RuleCall getSessionParserRuleCall_2() { return cSessionParserRuleCall_2; }
		
		//'keeps' initial=[State] ('keeps' history?='history')? '{' // This is never used, it is just to have the attributes in the superclass
		//substate+=State* '}'
		public Group getGroup_3() { return cGroup_3; }
		
		//'keeps'
		public Keyword getKeepsKeyword_3_0() { return cKeepsKeyword_3_0; }
		
		//initial=[State]
		public Assignment getInitialAssignment_3_1() { return cInitialAssignment_3_1; }
		
		//[State]
		public CrossReference getInitialStateCrossReference_3_1_0() { return cInitialStateCrossReference_3_1_0; }
		
		//ID
		public RuleCall getInitialStateIDTerminalRuleCall_3_1_0_1() { return cInitialStateIDTerminalRuleCall_3_1_0_1; }
		
		//('keeps' history?='history')?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//'keeps'
		public Keyword getKeepsKeyword_3_2_0() { return cKeepsKeyword_3_2_0; }
		
		//history?='history'
		public Assignment getHistoryAssignment_3_2_1() { return cHistoryAssignment_3_2_1; }
		
		//'history'
		public Keyword getHistoryHistoryKeyword_3_2_1_0() { return cHistoryHistoryKeyword_3_2_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3_3() { return cLeftCurlyBracketKeyword_3_3; }
		
		//// This is never used, it is just to have the attributes in the superclass
		//substate+=State*
		public Assignment getSubstateAssignment_3_4() { return cSubstateAssignment_3_4; }
		
		//State
		public RuleCall getSubstateStateParserRuleCall_3_4_0() { return cSubstateStateParserRuleCall_3_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3_5() { return cRightCurlyBracketKeyword_3_5; }
	}
	public class EventElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Event");
		private final RuleCall cReceiveMessageParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		///*****************************************************************************
		// *       EVENTS                                                             *
		// *****************************************************************************/ Event:
		//	ReceiveMessage;
		@Override public ParserRule getRule() { return rule; }
		
		//ReceiveMessage
		public RuleCall getReceiveMessageParserRuleCall() { return cReceiveMessageParserRuleCall; }
	}
	public class ReceiveMessageElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ReceiveMessage");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0_0 = (RuleCall)cNameAssignment_0_0.eContents().get(0);
		private final Keyword cColonKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cPortAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cPortPortCrossReference_1_0 = (CrossReference)cPortAssignment_1.eContents().get(0);
		private final RuleCall cPortPortIDTerminalRuleCall_1_0_1 = (RuleCall)cPortPortCrossReference_1_0.eContents().get(1);
		private final Keyword cQuestionMarkKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cMessageAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cMessageMessageCrossReference_3_0 = (CrossReference)cMessageAssignment_3.eContents().get(0);
		private final RuleCall cMessageMessageIDTerminalRuleCall_3_0_1 = (RuleCall)cMessageMessageCrossReference_3_0.eContents().get(1);
		
		//ReceiveMessage:
		//	(name=ID ":")? port=[Port] '?' message=[Message];
		@Override public ParserRule getRule() { return rule; }
		
		//(name=ID ":")? port=[Port] '?' message=[Message]
		public Group getGroup() { return cGroup; }
		
		//(name=ID ":")?
		public Group getGroup_0() { return cGroup_0; }
		
		//name=ID
		public Assignment getNameAssignment_0_0() { return cNameAssignment_0_0; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0_0() { return cNameIDTerminalRuleCall_0_0_0; }
		
		//":"
		public Keyword getColonKeyword_0_1() { return cColonKeyword_0_1; }
		
		//port=[Port]
		public Assignment getPortAssignment_1() { return cPortAssignment_1; }
		
		//[Port]
		public CrossReference getPortPortCrossReference_1_0() { return cPortPortCrossReference_1_0; }
		
		//ID
		public RuleCall getPortPortIDTerminalRuleCall_1_0_1() { return cPortPortIDTerminalRuleCall_1_0_1; }
		
		//'?'
		public Keyword getQuestionMarkKeyword_2() { return cQuestionMarkKeyword_2; }
		
		//message=[Message]
		public Assignment getMessageAssignment_3() { return cMessageAssignment_3; }
		
		//[Message]
		public CrossReference getMessageMessageCrossReference_3_0() { return cMessageMessageCrossReference_3_0; }
		
		//ID
		public RuleCall getMessageMessageIDTerminalRuleCall_3_0_1() { return cMessageMessageIDTerminalRuleCall_3_0_1; }
	}
	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cActionBlockParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternStatementParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cSendActionParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cVariableAssignmentParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cIncrementParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDecrementParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cLoopActionParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cForActionParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cPyforActionParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cAppendParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cDictAssignmentParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cConditionalActionParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cReturnActionParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cPrintActionParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cErrorActionParserRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cStartSessionParserRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		private final RuleCall cFunctionCallStatementParserRuleCall_16 = (RuleCall)cAlternatives.eContents().get(16);
		private final RuleCall cLocalVariableParserRuleCall_17 = (RuleCall)cAlternatives.eContents().get(17);
		private final RuleCall cCpropertyAssignmentParserRuleCall_18 = (RuleCall)cAlternatives.eContents().get(18);
		private final RuleCall cStrategyStreamParserRuleCall_19 = (RuleCall)cAlternatives.eContents().get(19);
		private final RuleCall cZipEnumerateParserRuleCall_20 = (RuleCall)cAlternatives.eContents().get(20);
		
		///*****************************************************************************
		// *       ACTIONS                                                             *
		// *****************************************************************************/ Action:
		//	ActionBlock | ExternStatement | SendAction | VariableAssignment | Increment | Decrement | LoopAction | ForAction |
		//	PyforAction | Append | DictAssignment | ConditionalAction | ReturnAction | PrintAction | ErrorAction | StartSession |
		//	FunctionCallStatement | LocalVariable | CpropertyAssignment | StrategyStream | ZipEnumerate;
		@Override public ParserRule getRule() { return rule; }
		
		//ActionBlock | ExternStatement | SendAction | VariableAssignment | Increment | Decrement | LoopAction | ForAction |
		//PyforAction | Append | DictAssignment | ConditionalAction | ReturnAction | PrintAction | ErrorAction | StartSession |
		//FunctionCallStatement | LocalVariable | CpropertyAssignment | StrategyStream | ZipEnumerate
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ActionBlock
		public RuleCall getActionBlockParserRuleCall_0() { return cActionBlockParserRuleCall_0; }
		
		//ExternStatement
		public RuleCall getExternStatementParserRuleCall_1() { return cExternStatementParserRuleCall_1; }
		
		//SendAction
		public RuleCall getSendActionParserRuleCall_2() { return cSendActionParserRuleCall_2; }
		
		//VariableAssignment
		public RuleCall getVariableAssignmentParserRuleCall_3() { return cVariableAssignmentParserRuleCall_3; }
		
		//Increment
		public RuleCall getIncrementParserRuleCall_4() { return cIncrementParserRuleCall_4; }
		
		//Decrement
		public RuleCall getDecrementParserRuleCall_5() { return cDecrementParserRuleCall_5; }
		
		//LoopAction
		public RuleCall getLoopActionParserRuleCall_6() { return cLoopActionParserRuleCall_6; }
		
		//ForAction
		public RuleCall getForActionParserRuleCall_7() { return cForActionParserRuleCall_7; }
		
		//PyforAction
		public RuleCall getPyforActionParserRuleCall_8() { return cPyforActionParserRuleCall_8; }
		
		//Append
		public RuleCall getAppendParserRuleCall_9() { return cAppendParserRuleCall_9; }
		
		//DictAssignment
		public RuleCall getDictAssignmentParserRuleCall_10() { return cDictAssignmentParserRuleCall_10; }
		
		//ConditionalAction
		public RuleCall getConditionalActionParserRuleCall_11() { return cConditionalActionParserRuleCall_11; }
		
		//ReturnAction
		public RuleCall getReturnActionParserRuleCall_12() { return cReturnActionParserRuleCall_12; }
		
		//PrintAction
		public RuleCall getPrintActionParserRuleCall_13() { return cPrintActionParserRuleCall_13; }
		
		//ErrorAction
		public RuleCall getErrorActionParserRuleCall_14() { return cErrorActionParserRuleCall_14; }
		
		//StartSession
		public RuleCall getStartSessionParserRuleCall_15() { return cStartSessionParserRuleCall_15; }
		
		//FunctionCallStatement
		public RuleCall getFunctionCallStatementParserRuleCall_16() { return cFunctionCallStatementParserRuleCall_16; }
		
		//LocalVariable
		public RuleCall getLocalVariableParserRuleCall_17() { return cLocalVariableParserRuleCall_17; }
		
		//CpropertyAssignment
		public RuleCall getCpropertyAssignmentParserRuleCall_18() { return cCpropertyAssignmentParserRuleCall_18; }
		
		//StrategyStream
		public RuleCall getStrategyStreamParserRuleCall_19() { return cStrategyStreamParserRuleCall_19; }
		
		//ZipEnumerate
		public RuleCall getZipEnumerateParserRuleCall_20() { return cZipEnumerateParserRuleCall_20; }
	}
	public class ActionBlockElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ActionBlock");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cActionBlockAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cDoKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cActionsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActionsActionParserRuleCall_2_0 = (RuleCall)cActionsAssignment_2.eContents().get(0);
		private final Keyword cEndKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ActionBlock:
		//	{ActionBlock}
		//	'do' actions+=Action* 'end';
		@Override public ParserRule getRule() { return rule; }
		
		//{ActionBlock} 'do' actions+=Action* 'end'
		public Group getGroup() { return cGroup; }
		
		//{ActionBlock}
		public Action getActionBlockAction_0() { return cActionBlockAction_0; }
		
		//'do'
		public Keyword getDoKeyword_1() { return cDoKeyword_1; }
		
		//actions+=Action*
		public Assignment getActionsAssignment_2() { return cActionsAssignment_2; }
		
		//Action
		public RuleCall getActionsActionParserRuleCall_2_0() { return cActionsActionParserRuleCall_2_0; }
		
		//'end'
		public Keyword getEndKeyword_3() { return cEndKeyword_3; }
	}
	public class ExternStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ExternStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cStatementAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cStatementEXTERNTerminalRuleCall_0_0 = (RuleCall)cStatementAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAmpersandKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSegmentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSegmentsExpressionParserRuleCall_1_1_0 = (RuleCall)cSegmentsAssignment_1_1.eContents().get(0);
		
		//ExternStatement:
		//	statement=EXTERN ('&' segments+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//statement=EXTERN ('&' segments+=Expression)*
		public Group getGroup() { return cGroup; }
		
		//statement=EXTERN
		public Assignment getStatementAssignment_0() { return cStatementAssignment_0; }
		
		//EXTERN
		public RuleCall getStatementEXTERNTerminalRuleCall_0_0() { return cStatementEXTERNTerminalRuleCall_0_0; }
		
		//('&' segments+=Expression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'&'
		public Keyword getAmpersandKeyword_1_0() { return cAmpersandKeyword_1_0; }
		
		//segments+=Expression
		public Assignment getSegmentsAssignment_1_1() { return cSegmentsAssignment_1_1; }
		
		//Expression
		public RuleCall getSegmentsExpressionParserRuleCall_1_1_0() { return cSegmentsExpressionParserRuleCall_1_1_0; }
	}
	public class LocalVariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.LocalVariable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReadonlyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cReadonlyReadonlyKeyword_0_0 = (Keyword)cReadonlyAssignment_0.eContents().get(0);
		private final Keyword cVarKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Group cGroup_4_0 = (Group)cAlternatives_4.eContents().get(0);
		private final Assignment cTypeRefAssignment_4_0_0 = (Assignment)cGroup_4_0.eContents().get(0);
		private final RuleCall cTypeRefTypeRefParserRuleCall_4_0_0_0 = (RuleCall)cTypeRefAssignment_4_0_0.eContents().get(0);
		private final Group cGroup_4_0_1 = (Group)cGroup_4_0.eContents().get(1);
		private final Keyword cEqualsSignKeyword_4_0_1_0 = (Keyword)cGroup_4_0_1.eContents().get(0);
		private final Assignment cInitAssignment_4_0_1_1 = (Assignment)cGroup_4_0_1.eContents().get(1);
		private final RuleCall cInitExpressionParserRuleCall_4_0_1_1_0 = (RuleCall)cInitAssignment_4_0_1_1.eContents().get(0);
		private final Assignment cTensorAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cTensorTensorParserRuleCall_4_1_0 = (RuleCall)cTensorAssignment_4_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_5_0 = (RuleCall)cAnnotationsAssignment_5.eContents().get(0);
		
		//LocalVariable:
		//	readonly?='readonly'? 'var' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		//	annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//readonly?='readonly'? 'var' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		//annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//readonly?='readonly'?
		public Assignment getReadonlyAssignment_0() { return cReadonlyAssignment_0; }
		
		//'readonly'
		public Keyword getReadonlyReadonlyKeyword_0_0() { return cReadonlyReadonlyKeyword_0_0; }
		
		//'var'
		public Keyword getVarKeyword_1() { return cVarKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//':'
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }
		
		//(typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//typeRef=TypeRef ('=' init=Expression)?
		public Group getGroup_4_0() { return cGroup_4_0; }
		
		//typeRef=TypeRef
		public Assignment getTypeRefAssignment_4_0_0() { return cTypeRefAssignment_4_0_0; }
		
		//TypeRef
		public RuleCall getTypeRefTypeRefParserRuleCall_4_0_0_0() { return cTypeRefTypeRefParserRuleCall_4_0_0_0; }
		
		//('=' init=Expression)?
		public Group getGroup_4_0_1() { return cGroup_4_0_1; }
		
		//'='
		public Keyword getEqualsSignKeyword_4_0_1_0() { return cEqualsSignKeyword_4_0_1_0; }
		
		//init=Expression
		public Assignment getInitAssignment_4_0_1_1() { return cInitAssignment_4_0_1_1; }
		
		//Expression
		public RuleCall getInitExpressionParserRuleCall_4_0_1_1_0() { return cInitExpressionParserRuleCall_4_0_1_1_0; }
		
		//tensor=Tensor
		public Assignment getTensorAssignment_4_1() { return cTensorAssignment_4_1; }
		
		//Tensor
		public RuleCall getTensorTensorParserRuleCall_4_1_0() { return cTensorTensorParserRuleCall_4_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_5() { return cAnnotationsAssignment_5; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_5_0() { return cAnnotationsPlatformAnnotationParserRuleCall_5_0; }
	}
	public class SendActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.SendAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPortAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPortPortCrossReference_0_0 = (CrossReference)cPortAssignment_0.eContents().get(0);
		private final RuleCall cPortPortIDTerminalRuleCall_0_0_1 = (RuleCall)cPortPortCrossReference_0_0.eContents().get(1);
		private final Keyword cExclamationMarkKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cMessageAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cMessageMessageCrossReference_2_0 = (CrossReference)cMessageAssignment_2.eContents().get(0);
		private final RuleCall cMessageMessageIDTerminalRuleCall_2_0_1 = (RuleCall)cMessageMessageCrossReference_2_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Assignment cParametersAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final RuleCall cParametersExpressionParserRuleCall_4_0_0 = (RuleCall)cParametersAssignment_4_0.eContents().get(0);
		private final Group cGroup_4_1 = (Group)cGroup_4.eContents().get(1);
		private final Keyword cCommaKeyword_4_1_0 = (Keyword)cGroup_4_1.eContents().get(0);
		private final Assignment cParametersAssignment_4_1_1 = (Assignment)cGroup_4_1.eContents().get(1);
		private final RuleCall cParametersExpressionParserRuleCall_4_1_1_0 = (RuleCall)cParametersAssignment_4_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SendAction:
		//	port=[Port] '!' message=[Message] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//port=[Port] '!' message=[Message] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//port=[Port]
		public Assignment getPortAssignment_0() { return cPortAssignment_0; }
		
		//[Port]
		public CrossReference getPortPortCrossReference_0_0() { return cPortPortCrossReference_0_0; }
		
		//ID
		public RuleCall getPortPortIDTerminalRuleCall_0_0_1() { return cPortPortIDTerminalRuleCall_0_0_1; }
		
		//'!'
		public Keyword getExclamationMarkKeyword_1() { return cExclamationMarkKeyword_1; }
		
		//message=[Message]
		public Assignment getMessageAssignment_2() { return cMessageAssignment_2; }
		
		//[Message]
		public CrossReference getMessageMessageCrossReference_2_0() { return cMessageMessageCrossReference_2_0; }
		
		//ID
		public RuleCall getMessageMessageIDTerminalRuleCall_2_0_1() { return cMessageMessageIDTerminalRuleCall_2_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//(parameters+=Expression ("," parameters+=Expression)*)?
		public Group getGroup_4() { return cGroup_4; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_4_0() { return cParametersAssignment_4_0; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_4_0_0() { return cParametersExpressionParserRuleCall_4_0_0; }
		
		//("," parameters+=Expression)*
		public Group getGroup_4_1() { return cGroup_4_1; }
		
		//","
		public Keyword getCommaKeyword_4_1_0() { return cCommaKeyword_4_1_0; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_4_1_1() { return cParametersAssignment_4_1_1; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_4_1_1_0() { return cParametersExpressionParserRuleCall_4_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class VariableAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.VariableAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPropertyAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPropertyVariableCrossReference_0_0 = (CrossReference)cPropertyAssignment_0.eContents().get(0);
		private final RuleCall cPropertyVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cPropertyVariableCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cIndexAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cIndexExpressionParserRuleCall_1_1_0 = (RuleCall)cIndexAssignment_1_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cExtraPropertyAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cExtraPropertyVariableCrossReference_2_1_0 = (CrossReference)cExtraPropertyAssignment_2_1.eContents().get(0);
		private final RuleCall cExtraPropertyVariableIDTerminalRuleCall_2_1_0_1 = (RuleCall)cExtraPropertyVariableCrossReference_2_1_0.eContents().get(1);
		private final Group cGroup_2_2 = (Group)cGroup_2.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_2_0 = (Keyword)cGroup_2_2.eContents().get(0);
		private final Assignment cExtraIndexAssignment_2_2_1 = (Assignment)cGroup_2_2.eContents().get(1);
		private final RuleCall cExtraIndexExpressionParserRuleCall_2_2_1_0 = (RuleCall)cExtraIndexAssignment_2_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2_2 = (Keyword)cGroup_2_2.eContents().get(2);
		private final Keyword cEqualsSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cExpressionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cExpressionExpressionParserRuleCall_4_0 = (RuleCall)cExpressionAssignment_4.eContents().get(0);
		
		//VariableAssignment:
		//	property=[Variable] (=> '[' index=Expression ']')? (',' extraProperty+=[Variable] (=> '[' extraIndex+=Expression
		//	']')?)* '=' expression=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		////	property+=[Variable|ID] (=>'[' index+=Expression ']')? ('#>' property+= [Variable|ID] (=>'[' index+=Expression ']')?)* '=' expression=Expression;
		////	property=[Variable|ID] (=>'[' index=Expression ']')? '=' expression=Expression;
		//property=[Variable] (=> '[' index=Expression ']')? (',' extraProperty+=[Variable] (=> '[' extraIndex+=Expression ']')?)*
		//'=' expression=Expression
		public Group getGroup() { return cGroup; }
		
		////	property+=[Variable|ID] (=>'[' index+=Expression ']')? ('#>' property+= [Variable|ID] (=>'[' index+=Expression ']')?)* '=' expression=Expression;
		////	property=[Variable|ID] (=>'[' index=Expression ']')? '=' expression=Expression;
		//property=[Variable]
		public Assignment getPropertyAssignment_0() { return cPropertyAssignment_0; }
		
		//[Variable]
		public CrossReference getPropertyVariableCrossReference_0_0() { return cPropertyVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getPropertyVariableIDTerminalRuleCall_0_0_1() { return cPropertyVariableIDTerminalRuleCall_0_0_1; }
		
		//(=> '[' index=Expression ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//index=Expression
		public Assignment getIndexAssignment_1_1() { return cIndexAssignment_1_1; }
		
		//Expression
		public RuleCall getIndexExpressionParserRuleCall_1_1_0() { return cIndexExpressionParserRuleCall_1_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//(',' extraProperty+=[Variable] (=> '[' extraIndex+=Expression ']')?)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//extraProperty+=[Variable]
		public Assignment getExtraPropertyAssignment_2_1() { return cExtraPropertyAssignment_2_1; }
		
		//[Variable]
		public CrossReference getExtraPropertyVariableCrossReference_2_1_0() { return cExtraPropertyVariableCrossReference_2_1_0; }
		
		//ID
		public RuleCall getExtraPropertyVariableIDTerminalRuleCall_2_1_0_1() { return cExtraPropertyVariableIDTerminalRuleCall_2_1_0_1; }
		
		//(=> '[' extraIndex+=Expression ']')?
		public Group getGroup_2_2() { return cGroup_2_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_2_2_0() { return cLeftSquareBracketKeyword_2_2_0; }
		
		//extraIndex+=Expression
		public Assignment getExtraIndexAssignment_2_2_1() { return cExtraIndexAssignment_2_2_1; }
		
		//Expression
		public RuleCall getExtraIndexExpressionParserRuleCall_2_2_1_0() { return cExtraIndexExpressionParserRuleCall_2_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2_2() { return cRightSquareBracketKeyword_2_2_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_3() { return cEqualsSignKeyword_3; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_4() { return cExpressionAssignment_4; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_4_0() { return cExpressionExpressionParserRuleCall_4_0; }
	}
	public class CpropertyAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CpropertyAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCpropertysAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cCpropertysVariableCrossReference_1_0 = (CrossReference)cCpropertysAssignment_1.eContents().get(0);
		private final RuleCall cCpropertysVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cCpropertysVariableCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cCindexAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cCindexExpressionParserRuleCall_2_1_0 = (RuleCall)cCindexAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPropertyAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cPropertyVariableCrossReference_3_1_0 = (CrossReference)cPropertyAssignment_3_1.eContents().get(0);
		private final RuleCall cPropertyVariableIDTerminalRuleCall_3_1_0_1 = (RuleCall)cPropertyVariableCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cPindexAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cPindexExpressionParserRuleCall_3_2_1_0 = (RuleCall)cPindexAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		private final Keyword cEqualsSignKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpressionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpressionExpressionParserRuleCall_5_0 = (RuleCall)cExpressionAssignment_5.eContents().get(0);
		
		//CpropertyAssignment: //	cproperty=[Variable|ID] '.' (cpropertys = [Variable|ID])'=' expression=Expression; 
		//	'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
		//	']')?)? '=' expression=Expression;
		@Override public ParserRule getRule() { return rule; }
		
		////	cproperty=[Variable|ID] '.' (cpropertys = [Variable|ID])'=' expression=Expression; 
		//'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
		//']')?)? '=' expression=Expression
		public Group getGroup() { return cGroup; }
		
		////	cproperty=[Variable|ID] '.' (cpropertys = [Variable|ID])'=' expression=Expression; 
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//cpropertys+=[Variable]
		public Assignment getCpropertysAssignment_1() { return cCpropertysAssignment_1; }
		
		//[Variable]
		public CrossReference getCpropertysVariableCrossReference_1_0() { return cCpropertysVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getCpropertysVariableIDTerminalRuleCall_1_0_1() { return cCpropertysVariableIDTerminalRuleCall_1_0_1; }
		
		//(=> '[' cindex=Expression ']')?
		public Group getGroup_2() { return cGroup_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//cindex=Expression
		public Assignment getCindexAssignment_2_1() { return cCindexAssignment_2_1; }
		
		//Expression
		public RuleCall getCindexExpressionParserRuleCall_2_1_0() { return cCindexExpressionParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//('.' property=[Variable] (=> '[' pindex=Expression ']')?)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'.'
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }
		
		//property=[Variable]
		public Assignment getPropertyAssignment_3_1() { return cPropertyAssignment_3_1; }
		
		//[Variable]
		public CrossReference getPropertyVariableCrossReference_3_1_0() { return cPropertyVariableCrossReference_3_1_0; }
		
		//ID
		public RuleCall getPropertyVariableIDTerminalRuleCall_3_1_0_1() { return cPropertyVariableIDTerminalRuleCall_3_1_0_1; }
		
		//(=> '[' pindex=Expression ']')?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_3_2_0() { return cLeftSquareBracketKeyword_3_2_0; }
		
		//pindex=Expression
		public Assignment getPindexAssignment_3_2_1() { return cPindexAssignment_3_2_1; }
		
		//Expression
		public RuleCall getPindexExpressionParserRuleCall_3_2_1_0() { return cPindexExpressionParserRuleCall_3_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3_2_2() { return cRightSquareBracketKeyword_3_2_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_4() { return cEqualsSignKeyword_4; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_5() { return cExpressionAssignment_5; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_5_0() { return cExpressionExpressionParserRuleCall_5_0; }
	}
	public class StrategyStreamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StrategyStream");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cStreamKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInputsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInputsVariableCrossReference_1_0 = (CrossReference)cInputsAssignment_1.eContents().get(0);
		private final RuleCall cInputsVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cInputsVariableCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cInputsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cInputsVariableCrossReference_2_1_0 = (CrossReference)cInputsAssignment_2_1.eContents().get(0);
		private final RuleCall cInputsVariableIDTerminalRuleCall_2_1_0_1 = (RuleCall)cInputsVariableCrossReference_2_1_0.eContents().get(1);
		private final Keyword cGreaterThanSignGreaterThanSignKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cStrategyAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cStrategyVariableCrossReference_4_0 = (CrossReference)cStrategyAssignment_4.eContents().get(0);
		private final RuleCall cStrategyVariableIDTerminalRuleCall_4_0_1 = (RuleCall)cStrategyVariableCrossReference_4_0.eContents().get(1);
		private final Keyword cGreaterThanSignGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cOutputsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cOutputsVariableCrossReference_6_0 = (CrossReference)cOutputsAssignment_6.eContents().get(0);
		private final RuleCall cOutputsVariableIDTerminalRuleCall_6_0_1 = (RuleCall)cOutputsVariableCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cOutputsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cOutputsVariableCrossReference_7_1_0 = (CrossReference)cOutputsAssignment_7_1.eContents().get(0);
		private final RuleCall cOutputsVariableIDTerminalRuleCall_7_1_0_1 = (RuleCall)cOutputsVariableCrossReference_7_1_0.eContents().get(1);
		
		////	'assign' cpropertys+=[Variable|ID] (=>'[' index+=Expression ']')? ('#>' cpropertys+= [Variable|ID] (=>'[' index+=Expression ']')?)* '=' expression=Expression;
		//StrategyStream:
		//	'stream' inputs+=[Variable] (',' inputs+=[Variable])* '>>' strategy=[Variable] '>>' outputs+=[Variable] (','
		//	outputs+=[Variable])*;
		@Override public ParserRule getRule() { return rule; }
		
		//'stream' inputs+=[Variable] (',' inputs+=[Variable])* '>>' strategy=[Variable] '>>' outputs+=[Variable] (','
		//outputs+=[Variable])*
		public Group getGroup() { return cGroup; }
		
		//'stream'
		public Keyword getStreamKeyword_0() { return cStreamKeyword_0; }
		
		//inputs+=[Variable]
		public Assignment getInputsAssignment_1() { return cInputsAssignment_1; }
		
		//[Variable]
		public CrossReference getInputsVariableCrossReference_1_0() { return cInputsVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getInputsVariableIDTerminalRuleCall_1_0_1() { return cInputsVariableIDTerminalRuleCall_1_0_1; }
		
		//(',' inputs+=[Variable])*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//inputs+=[Variable]
		public Assignment getInputsAssignment_2_1() { return cInputsAssignment_2_1; }
		
		//[Variable]
		public CrossReference getInputsVariableCrossReference_2_1_0() { return cInputsVariableCrossReference_2_1_0; }
		
		//ID
		public RuleCall getInputsVariableIDTerminalRuleCall_2_1_0_1() { return cInputsVariableIDTerminalRuleCall_2_1_0_1; }
		
		//'>>'
		public Keyword getGreaterThanSignGreaterThanSignKeyword_3() { return cGreaterThanSignGreaterThanSignKeyword_3; }
		
		//strategy=[Variable]
		public Assignment getStrategyAssignment_4() { return cStrategyAssignment_4; }
		
		//[Variable]
		public CrossReference getStrategyVariableCrossReference_4_0() { return cStrategyVariableCrossReference_4_0; }
		
		//ID
		public RuleCall getStrategyVariableIDTerminalRuleCall_4_0_1() { return cStrategyVariableIDTerminalRuleCall_4_0_1; }
		
		//'>>'
		public Keyword getGreaterThanSignGreaterThanSignKeyword_5() { return cGreaterThanSignGreaterThanSignKeyword_5; }
		
		//outputs+=[Variable]
		public Assignment getOutputsAssignment_6() { return cOutputsAssignment_6; }
		
		//[Variable]
		public CrossReference getOutputsVariableCrossReference_6_0() { return cOutputsVariableCrossReference_6_0; }
		
		//ID
		public RuleCall getOutputsVariableIDTerminalRuleCall_6_0_1() { return cOutputsVariableIDTerminalRuleCall_6_0_1; }
		
		//(',' outputs+=[Variable])*
		public Group getGroup_7() { return cGroup_7; }
		
		//','
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//outputs+=[Variable]
		public Assignment getOutputsAssignment_7_1() { return cOutputsAssignment_7_1; }
		
		//[Variable]
		public CrossReference getOutputsVariableCrossReference_7_1_0() { return cOutputsVariableCrossReference_7_1_0; }
		
		//ID
		public RuleCall getOutputsVariableIDTerminalRuleCall_7_1_0_1() { return cOutputsVariableIDTerminalRuleCall_7_1_0_1; }
	}
	public class DictAssignmentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.DictAssignment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDictAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cDictVariableCrossReference_0_0 = (CrossReference)cDictAssignment_0.eContents().get(0);
		private final RuleCall cDictVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cDictVariableCrossReference_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cLeftSquareBracketKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cElementsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cElementsVariableCrossReference_1_1_0 = (CrossReference)cElementsAssignment_1_1.eContents().get(0);
		private final RuleCall cElementsVariableIDTerminalRuleCall_1_1_0_1 = (RuleCall)cElementsVariableCrossReference_1_1_0.eContents().get(1);
		private final Keyword cRightSquareBracketKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVarAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cVarVariableCrossReference_3_0 = (CrossReference)cVarAssignment_3.eContents().get(0);
		private final RuleCall cVarVariableIDTerminalRuleCall_3_0_1 = (RuleCall)cVarVariableCrossReference_3_0.eContents().get(1);
		
		//DictAssignment:
		//	dict=[Variable] ('[' elements+=[Variable] ']')* '=' var=[Variable];
		@Override public ParserRule getRule() { return rule; }
		
		//dict=[Variable] ('[' elements+=[Variable] ']')* '=' var=[Variable]
		public Group getGroup() { return cGroup; }
		
		//dict=[Variable]
		public Assignment getDictAssignment_0() { return cDictAssignment_0; }
		
		//[Variable]
		public CrossReference getDictVariableCrossReference_0_0() { return cDictVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getDictVariableIDTerminalRuleCall_0_0_1() { return cDictVariableIDTerminalRuleCall_0_0_1; }
		
		//('[' elements+=[Variable] ']')*
		public Group getGroup_1() { return cGroup_1; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_0() { return cLeftSquareBracketKeyword_1_0; }
		
		//elements+=[Variable]
		public Assignment getElementsAssignment_1_1() { return cElementsAssignment_1_1; }
		
		//[Variable]
		public CrossReference getElementsVariableCrossReference_1_1_0() { return cElementsVariableCrossReference_1_1_0; }
		
		//ID
		public RuleCall getElementsVariableIDTerminalRuleCall_1_1_0_1() { return cElementsVariableIDTerminalRuleCall_1_1_0_1; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_2() { return cRightSquareBracketKeyword_1_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//var=[Variable]
		public Assignment getVarAssignment_3() { return cVarAssignment_3; }
		
		//[Variable]
		public CrossReference getVarVariableCrossReference_3_0() { return cVarVariableCrossReference_3_0; }
		
		//ID
		public RuleCall getVarVariableIDTerminalRuleCall_3_0_1() { return cVarVariableIDTerminalRuleCall_3_0_1; }
	}
	public class ZipEnumerateElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ZipEnumerate");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cVarsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cVarsVariableCrossReference_1_0 = (CrossReference)cVarsAssignment_1.eContents().get(0);
		private final RuleCall cVarsVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cVarsVariableCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cVarsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cVarsVariableCrossReference_2_1_0 = (CrossReference)cVarsAssignment_2_1.eContents().get(0);
		private final RuleCall cVarsVariableIDTerminalRuleCall_2_1_0_1 = (RuleCall)cVarsVariableCrossReference_2_1_0.eContents().get(1);
		private final Keyword cInKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cFnameAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cFnameAlternatives_4_0 = (Alternatives)cFnameAssignment_4.eContents().get(0);
		private final Keyword cFnameZipKeyword_4_0_0 = (Keyword)cFnameAlternatives_4_0.eContents().get(0);
		private final Keyword cFnameEnumerateKeyword_4_0_1 = (Keyword)cFnameAlternatives_4_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSetsAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cSetsVariableCrossReference_6_0 = (CrossReference)cSetsAssignment_6.eContents().get(0);
		private final RuleCall cSetsVariableIDTerminalRuleCall_6_0_1 = (RuleCall)cSetsVariableCrossReference_6_0.eContents().get(1);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cCommaKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Assignment cSetsAssignment_7_1 = (Assignment)cGroup_7.eContents().get(1);
		private final CrossReference cSetsVariableCrossReference_7_1_0 = (CrossReference)cSetsAssignment_7_1.eContents().get(0);
		private final RuleCall cSetsVariableIDTerminalRuleCall_7_1_0_1 = (RuleCall)cSetsVariableCrossReference_7_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_8 = (Keyword)cGroup.eContents().get(8);
		private final Assignment cActionAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cActionActionParserRuleCall_9_0 = (RuleCall)cActionAssignment_9.eContents().get(0);
		
		//ZipEnumerate:
		//	'for' vars+=[Variable] (',' vars+=[Variable])* 'in' fname=('zip' | 'enumerate') '(' sets+=[Variable] (','
		//	sets+=[Variable])* ')' action=Action;
		@Override public ParserRule getRule() { return rule; }
		
		//'for' vars+=[Variable] (',' vars+=[Variable])* 'in' fname=('zip' | 'enumerate') '(' sets+=[Variable] (','
		//sets+=[Variable])* ')' action=Action
		public Group getGroup() { return cGroup; }
		
		//'for'
		public Keyword getForKeyword_0() { return cForKeyword_0; }
		
		//vars+=[Variable]
		public Assignment getVarsAssignment_1() { return cVarsAssignment_1; }
		
		//[Variable]
		public CrossReference getVarsVariableCrossReference_1_0() { return cVarsVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getVarsVariableIDTerminalRuleCall_1_0_1() { return cVarsVariableIDTerminalRuleCall_1_0_1; }
		
		//(',' vars+=[Variable])*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//vars+=[Variable]
		public Assignment getVarsAssignment_2_1() { return cVarsAssignment_2_1; }
		
		//[Variable]
		public CrossReference getVarsVariableCrossReference_2_1_0() { return cVarsVariableCrossReference_2_1_0; }
		
		//ID
		public RuleCall getVarsVariableIDTerminalRuleCall_2_1_0_1() { return cVarsVariableIDTerminalRuleCall_2_1_0_1; }
		
		//'in'
		public Keyword getInKeyword_3() { return cInKeyword_3; }
		
		//fname=('zip' | 'enumerate')
		public Assignment getFnameAssignment_4() { return cFnameAssignment_4; }
		
		//('zip' | 'enumerate')
		public Alternatives getFnameAlternatives_4_0() { return cFnameAlternatives_4_0; }
		
		//'zip'
		public Keyword getFnameZipKeyword_4_0_0() { return cFnameZipKeyword_4_0_0; }
		
		//'enumerate'
		public Keyword getFnameEnumerateKeyword_4_0_1() { return cFnameEnumerateKeyword_4_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_5() { return cLeftParenthesisKeyword_5; }
		
		//sets+=[Variable]
		public Assignment getSetsAssignment_6() { return cSetsAssignment_6; }
		
		//[Variable]
		public CrossReference getSetsVariableCrossReference_6_0() { return cSetsVariableCrossReference_6_0; }
		
		//ID
		public RuleCall getSetsVariableIDTerminalRuleCall_6_0_1() { return cSetsVariableIDTerminalRuleCall_6_0_1; }
		
		//(',' sets+=[Variable])*
		public Group getGroup_7() { return cGroup_7; }
		
		//','
		public Keyword getCommaKeyword_7_0() { return cCommaKeyword_7_0; }
		
		//sets+=[Variable]
		public Assignment getSetsAssignment_7_1() { return cSetsAssignment_7_1; }
		
		//[Variable]
		public CrossReference getSetsVariableCrossReference_7_1_0() { return cSetsVariableCrossReference_7_1_0; }
		
		//ID
		public RuleCall getSetsVariableIDTerminalRuleCall_7_1_0_1() { return cSetsVariableIDTerminalRuleCall_7_1_0_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_8() { return cRightParenthesisKeyword_8; }
		
		//action=Action
		public Assignment getActionAssignment_9() { return cActionAssignment_9; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_9_0() { return cActionActionParserRuleCall_9_0; }
	}
	public class AppendElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Append");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cPythonlistAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cPythonlistVariableCrossReference_0_0 = (CrossReference)cPythonlistAssignment_0.eContents().get(0);
		private final RuleCall cPythonlistVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cPythonlistVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cAppendKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cElementAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cElementExpressionParserRuleCall_4_0 = (RuleCall)cElementAssignment_4.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Append:
		//	pythonlist=[Variable] '.' 'append' '(' element=Expression ')';
		@Override public ParserRule getRule() { return rule; }
		
		//pythonlist=[Variable] '.' 'append' '(' element=Expression ')'
		public Group getGroup() { return cGroup; }
		
		//pythonlist=[Variable]
		public Assignment getPythonlistAssignment_0() { return cPythonlistAssignment_0; }
		
		//[Variable]
		public CrossReference getPythonlistVariableCrossReference_0_0() { return cPythonlistVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getPythonlistVariableIDTerminalRuleCall_0_0_1() { return cPythonlistVariableIDTerminalRuleCall_0_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//'append'
		public Keyword getAppendKeyword_2() { return cAppendKeyword_2; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_3() { return cLeftParenthesisKeyword_3; }
		
		//element=Expression
		public Assignment getElementAssignment_4() { return cElementAssignment_4; }
		
		//Expression
		public RuleCall getElementExpressionParserRuleCall_4_0() { return cElementExpressionParserRuleCall_4_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
	}
	public class IncrementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Increment");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cVarVariableCrossReference_0_0 = (CrossReference)cVarAssignment_0.eContents().get(0);
		private final RuleCall cVarVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cVarVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cPlusSignPlusSignKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		////cpropertyAssignment_Cpropertys
		//Increment:
		//	var=[Variable] '++';
		@Override public ParserRule getRule() { return rule; }
		
		//var=[Variable] '++'
		public Group getGroup() { return cGroup; }
		
		//var=[Variable]
		public Assignment getVarAssignment_0() { return cVarAssignment_0; }
		
		//[Variable]
		public CrossReference getVarVariableCrossReference_0_0() { return cVarVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getVarVariableIDTerminalRuleCall_0_0_1() { return cVarVariableIDTerminalRuleCall_0_0_1; }
		
		//'++'
		public Keyword getPlusSignPlusSignKeyword_1() { return cPlusSignPlusSignKeyword_1; }
	}
	public class DecrementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Decrement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cVarAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cVarVariableCrossReference_0_0 = (CrossReference)cVarAssignment_0.eContents().get(0);
		private final RuleCall cVarVariableIDTerminalRuleCall_0_0_1 = (RuleCall)cVarVariableCrossReference_0_0.eContents().get(1);
		private final Keyword cHyphenMinusHyphenMinusKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//Decrement:
		//	var=[Variable] '--';
		@Override public ParserRule getRule() { return rule; }
		
		//var=[Variable] '--'
		public Group getGroup() { return cGroup; }
		
		//var=[Variable]
		public Assignment getVarAssignment_0() { return cVarAssignment_0; }
		
		//[Variable]
		public CrossReference getVarVariableCrossReference_0_0() { return cVarVariableCrossReference_0_0; }
		
		//ID
		public RuleCall getVarVariableIDTerminalRuleCall_0_0_1() { return cVarVariableIDTerminalRuleCall_0_0_1; }
		
		//'--'
		public Keyword getHyphenMinusHyphenMinusKeyword_1() { return cHyphenMinusHyphenMinusKeyword_1; }
	}
	public class ForActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ForAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVariableAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariableParameterParserRuleCall_2_0 = (RuleCall)cVariableAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIndexAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cIndexParameterParserRuleCall_3_1_0 = (RuleCall)cIndexAssignment_3_1.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cArrayAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cArrayPropertyReferenceParserRuleCall_5_0 = (RuleCall)cArrayAssignment_5.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Assignment cActionAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cActionActionParserRuleCall_7_0 = (RuleCall)cActionAssignment_7.eContents().get(0);
		
		//ForAction:
		//	'for' '(' variable=Parameter (',' index=Parameter)? 'in' array=PropertyReference ')' action=Action;
		@Override public ParserRule getRule() { return rule; }
		
		//'for' '(' variable=Parameter (',' index=Parameter)? 'in' array=PropertyReference ')' action=Action
		public Group getGroup() { return cGroup; }
		
		//'for'
		public Keyword getForKeyword_0() { return cForKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//variable=Parameter
		public Assignment getVariableAssignment_2() { return cVariableAssignment_2; }
		
		//Parameter
		public RuleCall getVariableParameterParserRuleCall_2_0() { return cVariableParameterParserRuleCall_2_0; }
		
		//(',' index=Parameter)?
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//index=Parameter
		public Assignment getIndexAssignment_3_1() { return cIndexAssignment_3_1; }
		
		//Parameter
		public RuleCall getIndexParameterParserRuleCall_3_1_0() { return cIndexParameterParserRuleCall_3_1_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//array=PropertyReference
		public Assignment getArrayAssignment_5() { return cArrayAssignment_5; }
		
		//PropertyReference
		public RuleCall getArrayPropertyReferenceParserRuleCall_5_0() { return cArrayPropertyReferenceParserRuleCall_5_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }
		
		//action=Action
		public Assignment getActionAssignment_7() { return cActionAssignment_7; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_7_0() { return cActionActionParserRuleCall_7_0; }
	}
	public class PyforActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PyforAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cExforKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cVariablesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cVariablesParameterParserRuleCall_2_0 = (RuleCall)cVariablesAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cVariablesAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cVariablesParameterParserRuleCall_3_1_0 = (RuleCall)cVariablesAssignment_3_1.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cArraysAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cArraysPropertyReferenceParserRuleCall_5_0 = (RuleCall)cArraysAssignment_5.eContents().get(0);
		private final Group cGroup_6 = (Group)cGroup.eContents().get(6);
		private final Keyword cCommaKeyword_6_0 = (Keyword)cGroup_6.eContents().get(0);
		private final Assignment cArraysAssignment_6_1 = (Assignment)cGroup_6.eContents().get(1);
		private final RuleCall cArraysPropertyReferenceParserRuleCall_6_1_0 = (RuleCall)cArraysAssignment_6_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cActionAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final RuleCall cActionActionParserRuleCall_8_0 = (RuleCall)cActionAssignment_8.eContents().get(0);
		
		//PyforAction:
		//	'exfor' '(' variables+=Parameter (',' variables+=Parameter)* 'in' arrays+=PropertyReference (','
		//	arrays+=PropertyReference)* ')' action=Action;
		@Override public ParserRule getRule() { return rule; }
		
		//'exfor' '(' variables+=Parameter (',' variables+=Parameter)* 'in' arrays+=PropertyReference (','
		//arrays+=PropertyReference)* ')' action=Action
		public Group getGroup() { return cGroup; }
		
		//'exfor'
		public Keyword getExforKeyword_0() { return cExforKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//variables+=Parameter
		public Assignment getVariablesAssignment_2() { return cVariablesAssignment_2; }
		
		//Parameter
		public RuleCall getVariablesParameterParserRuleCall_2_0() { return cVariablesParameterParserRuleCall_2_0; }
		
		//(',' variables+=Parameter)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//variables+=Parameter
		public Assignment getVariablesAssignment_3_1() { return cVariablesAssignment_3_1; }
		
		//Parameter
		public RuleCall getVariablesParameterParserRuleCall_3_1_0() { return cVariablesParameterParserRuleCall_3_1_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//arrays+=PropertyReference
		public Assignment getArraysAssignment_5() { return cArraysAssignment_5; }
		
		//PropertyReference
		public RuleCall getArraysPropertyReferenceParserRuleCall_5_0() { return cArraysPropertyReferenceParserRuleCall_5_0; }
		
		//(',' arrays+=PropertyReference)*
		public Group getGroup_6() { return cGroup_6; }
		
		//','
		public Keyword getCommaKeyword_6_0() { return cCommaKeyword_6_0; }
		
		//arrays+=PropertyReference
		public Assignment getArraysAssignment_6_1() { return cArraysAssignment_6_1; }
		
		//PropertyReference
		public RuleCall getArraysPropertyReferenceParserRuleCall_6_1_0() { return cArraysPropertyReferenceParserRuleCall_6_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_7() { return cRightParenthesisKeyword_7; }
		
		//action=Action
		public Assignment getActionAssignment_8() { return cActionAssignment_8; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_8_0() { return cActionActionParserRuleCall_8_0; }
	}
	public class LoopActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.LoopAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWhileKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConditionExpressionParserRuleCall_2_0 = (RuleCall)cConditionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionActionParserRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		
		//LoopAction:
		//	'while' '(' condition=Expression ')' action=Action;
		@Override public ParserRule getRule() { return rule; }
		
		//'while' '(' condition=Expression ')' action=Action
		public Group getGroup() { return cGroup; }
		
		//'while'
		public Keyword getWhileKeyword_0() { return cWhileKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//condition=Expression
		public Assignment getConditionAssignment_2() { return cConditionAssignment_2; }
		
		//Expression
		public RuleCall getConditionExpressionParserRuleCall_2_0() { return cConditionExpressionParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//action=Action
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_4_0() { return cActionActionParserRuleCall_4_0; }
	}
	public class ConditionalActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ConditionalAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cIfKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cConditionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConditionExpressionParserRuleCall_2_0 = (RuleCall)cConditionAssignment_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cActionAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cActionActionParserRuleCall_4_0 = (RuleCall)cActionAssignment_4.eContents().get(0);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cElseKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cElseActionAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final RuleCall cElseActionActionParserRuleCall_5_1_0 = (RuleCall)cElseActionAssignment_5_1.eContents().get(0);
		
		//ConditionalAction:
		//	'if' '(' condition=Expression ')' action=Action (=> 'else' elseAction=Action)?;
		@Override public ParserRule getRule() { return rule; }
		
		//'if' '(' condition=Expression ')' action=Action (=> 'else' elseAction=Action)?
		public Group getGroup() { return cGroup; }
		
		//'if'
		public Keyword getIfKeyword_0() { return cIfKeyword_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//condition=Expression
		public Assignment getConditionAssignment_2() { return cConditionAssignment_2; }
		
		//Expression
		public RuleCall getConditionExpressionParserRuleCall_2_0() { return cConditionExpressionParserRuleCall_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
		
		//action=Action
		public Assignment getActionAssignment_4() { return cActionAssignment_4; }
		
		//Action
		public RuleCall getActionActionParserRuleCall_4_0() { return cActionActionParserRuleCall_4_0; }
		
		//(=> 'else' elseAction=Action)?
		public Group getGroup_5() { return cGroup_5; }
		
		//=> 'else'
		public Keyword getElseKeyword_5_0() { return cElseKeyword_5_0; }
		
		//elseAction=Action
		public Assignment getElseActionAssignment_5_1() { return cElseActionAssignment_5_1; }
		
		//Action
		public RuleCall getElseActionActionParserRuleCall_5_1_0() { return cElseActionActionParserRuleCall_5_1_0; }
	}
	public class ReturnActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ReturnAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cReturnActionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cReturnKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cExpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cExpExpressionParserRuleCall_2_0 = (RuleCall)cExpAssignment_2.eContents().get(0);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cCommaKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cExtraExpAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cExtraExpExpressionParserRuleCall_3_1_0 = (RuleCall)cExtraExpAssignment_3_1.eContents().get(0);
		
		//ReturnAction:
		//	{ReturnAction} 'return' => exp=Expression? (',' extraExp+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//{ReturnAction} 'return' => exp=Expression? (',' extraExp+=Expression)*
		public Group getGroup() { return cGroup; }
		
		//{ReturnAction}
		public Action getReturnActionAction_0() { return cReturnActionAction_0; }
		
		//'return'
		public Keyword getReturnKeyword_1() { return cReturnKeyword_1; }
		
		//=> exp=Expression?
		public Assignment getExpAssignment_2() { return cExpAssignment_2; }
		
		//Expression
		public RuleCall getExpExpressionParserRuleCall_2_0() { return cExpExpressionParserRuleCall_2_0; }
		
		//(',' extraExp+=Expression)*
		public Group getGroup_3() { return cGroup_3; }
		
		//','
		public Keyword getCommaKeyword_3_0() { return cCommaKeyword_3_0; }
		
		//extraExp+=Expression
		public Assignment getExtraExpAssignment_3_1() { return cExtraExpAssignment_3_1; }
		
		//Expression
		public RuleCall getExtraExpExpressionParserRuleCall_3_1_0() { return cExtraExpExpressionParserRuleCall_3_1_0; }
	}
	public class PrintActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PrintAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cPrintKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Assignment cLineAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cLinePrintlnKeyword_0_1_0 = (Keyword)cLineAssignment_0_1.eContents().get(0);
		private final Assignment cMsgAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMsgExpressionParserRuleCall_1_0 = (RuleCall)cMsgAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMsgAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMsgExpressionParserRuleCall_2_1_0 = (RuleCall)cMsgAssignment_2_1.eContents().get(0);
		
		//PrintAction:
		//	('print' | line?='println') msg+=Expression (',' msg+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//('print' | line?='println') msg+=Expression (',' msg+=Expression)*
		public Group getGroup() { return cGroup; }
		
		//('print' | line?='println')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'print'
		public Keyword getPrintKeyword_0_0() { return cPrintKeyword_0_0; }
		
		//line?='println'
		public Assignment getLineAssignment_0_1() { return cLineAssignment_0_1; }
		
		//'println'
		public Keyword getLinePrintlnKeyword_0_1_0() { return cLinePrintlnKeyword_0_1_0; }
		
		//msg+=Expression
		public Assignment getMsgAssignment_1() { return cMsgAssignment_1; }
		
		//Expression
		public RuleCall getMsgExpressionParserRuleCall_1_0() { return cMsgExpressionParserRuleCall_1_0; }
		
		//(',' msg+=Expression)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//msg+=Expression
		public Assignment getMsgAssignment_2_1() { return cMsgAssignment_2_1; }
		
		//Expression
		public RuleCall getMsgExpressionParserRuleCall_2_1_0() { return cMsgExpressionParserRuleCall_2_1_0; }
	}
	public class ErrorActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ErrorAction");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final Keyword cErrorKeyword_0_0 = (Keyword)cAlternatives_0.eContents().get(0);
		private final Assignment cLineAssignment_0_1 = (Assignment)cAlternatives_0.eContents().get(1);
		private final Keyword cLineErrorlnKeyword_0_1_0 = (Keyword)cLineAssignment_0_1.eContents().get(0);
		private final Assignment cMsgAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMsgExpressionParserRuleCall_1_0 = (RuleCall)cMsgAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cMsgAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cMsgExpressionParserRuleCall_2_1_0 = (RuleCall)cMsgAssignment_2_1.eContents().get(0);
		
		//ErrorAction:
		//	('error' | line?='errorln') msg+=Expression (',' msg+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//('error' | line?='errorln') msg+=Expression (',' msg+=Expression)*
		public Group getGroup() { return cGroup; }
		
		//('error' | line?='errorln')
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//'error'
		public Keyword getErrorKeyword_0_0() { return cErrorKeyword_0_0; }
		
		//line?='errorln'
		public Assignment getLineAssignment_0_1() { return cLineAssignment_0_1; }
		
		//'errorln'
		public Keyword getLineErrorlnKeyword_0_1_0() { return cLineErrorlnKeyword_0_1_0; }
		
		//msg+=Expression
		public Assignment getMsgAssignment_1() { return cMsgAssignment_1; }
		
		//Expression
		public RuleCall getMsgExpressionParserRuleCall_1_0() { return cMsgExpressionParserRuleCall_1_0; }
		
		//(',' msg+=Expression)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//msg+=Expression
		public Assignment getMsgAssignment_2_1() { return cMsgAssignment_2_1; }
		
		//Expression
		public RuleCall getMsgExpressionParserRuleCall_2_1_0() { return cMsgExpressionParserRuleCall_2_1_0; }
	}
	public class StartSessionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StartSession");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cForkKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cSessionAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cSessionSessionCrossReference_1_0 = (CrossReference)cSessionAssignment_1.eContents().get(0);
		private final RuleCall cSessionSessionIDTerminalRuleCall_1_0_1 = (RuleCall)cSessionSessionCrossReference_1_0.eContents().get(1);
		
		//StartSession:
		//	'fork' session=[Session];
		@Override public ParserRule getRule() { return rule; }
		
		//'fork' session=[Session]
		public Group getGroup() { return cGroup; }
		
		//'fork'
		public Keyword getForkKeyword_0() { return cForkKeyword_0; }
		
		//session=[Session]
		public Assignment getSessionAssignment_1() { return cSessionAssignment_1; }
		
		//[Session]
		public CrossReference getSessionSessionCrossReference_1_0() { return cSessionSessionCrossReference_1_0; }
		
		//ID
		public RuleCall getSessionSessionIDTerminalRuleCall_1_0_1() { return cSessionSessionIDTerminalRuleCall_1_0_1; }
	}
	public class FunctionCallStatementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.FunctionCallStatement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunctionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFunctionFunctionCrossReference_0_0 = (CrossReference)cFunctionAssignment_0.eContents().get(0);
		private final RuleCall cFunctionFunctionIDTerminalRuleCall_0_0_1 = (RuleCall)cFunctionFunctionCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParametersExpressionParserRuleCall_2_0_0 = (RuleCall)cParametersAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParametersExpressionParserRuleCall_2_1_1_0 = (RuleCall)cParametersAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FunctionCallStatement:
		//	function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')';
		@Override public ParserRule getRule() { return rule; }
		
		//function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//function=[Function]
		public Assignment getFunctionAssignment_0() { return cFunctionAssignment_0; }
		
		//[Function]
		public CrossReference getFunctionFunctionCrossReference_0_0() { return cFunctionFunctionCrossReference_0_0; }
		
		//ID
		public RuleCall getFunctionFunctionIDTerminalRuleCall_0_0_1() { return cFunctionFunctionIDTerminalRuleCall_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(parameters+=Expression ("," parameters+=Expression)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_2_0() { return cParametersAssignment_2_0; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_2_0_0() { return cParametersExpressionParserRuleCall_2_0_0; }
		
		//("," parameters+=Expression)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_2_1_1() { return cParametersAssignment_2_1_1; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_2_1_1_0() { return cParametersExpressionParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Expression");
		private final RuleCall cOrExpressionParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		///*****************************************************************************
		// *       EXPRESSIONS                                                         *
		// *****************************************************************************/ //ExternExpression | EnumLiteralRef | IntegerLiteral | BooleanLiteral | StringLiteral | DoubleLiteral | NotExpression | UnaryMinus | 
		////PlusExpression | MinusExpression | TimesExpression | DivExpression | ModExpression | EqualsExpression | NotEqualsExpression | GreaterExpression | 
		////LowerExpression | GreaterOrEqualExpression | LowerOrEqualExpression | AndExpression | OrExpression | PropertyReference | ArrayIndex | 
		////ExpressionGroup | FunctionCallExpression | MessageParameter | Reference;
		//Expression:
		//	OrExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//OrExpression
		public RuleCall getOrExpressionParserRuleCall() { return cOrExpressionParserRuleCall; }
	}
	public class OrExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.OrExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExpressionLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cOrKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsAndExpressionParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//OrExpression Expression:
		//	AndExpression ({OrExpression.lhs=current} "or" rhs=AndExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpression ({OrExpression.lhs=current} "or" rhs=AndExpression)*
		public Group getGroup() { return cGroup; }
		
		//AndExpression
		public RuleCall getAndExpressionParserRuleCall_0() { return cAndExpressionParserRuleCall_0; }
		
		//({OrExpression.lhs=current} "or" rhs=AndExpression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpression.lhs=current}
		public Action getOrExpressionLhsAction_1_0() { return cOrExpressionLhsAction_1_0; }
		
		//"or"
		public Keyword getOrKeyword_1_1() { return cOrKeyword_1_1; }
		
		//rhs=AndExpression
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//AndExpression
		public RuleCall getRhsAndExpressionParserRuleCall_1_2_0() { return cRhsAndExpressionParserRuleCall_1_2_0; }
	}
	public class AndExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AndExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEqualityParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExpressionLhsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAndKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRhsEqualityParserRuleCall_1_2_0 = (RuleCall)cRhsAssignment_1_2.eContents().get(0);
		
		//AndExpression Expression:
		//	Equality ({AndExpression.lhs=current} "and" rhs=Equality)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Equality ({AndExpression.lhs=current} "and" rhs=Equality)*
		public Group getGroup() { return cGroup; }
		
		//Equality
		public RuleCall getEqualityParserRuleCall_0() { return cEqualityParserRuleCall_0; }
		
		//({AndExpression.lhs=current} "and" rhs=Equality)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpression.lhs=current}
		public Action getAndExpressionLhsAction_1_0() { return cAndExpressionLhsAction_1_0; }
		
		//"and"
		public Keyword getAndKeyword_1_1() { return cAndKeyword_1_1; }
		
		//rhs=Equality
		public Assignment getRhsAssignment_1_2() { return cRhsAssignment_1_2; }
		
		//Equality
		public RuleCall getRhsEqualityParserRuleCall_1_2_0() { return cRhsEqualityParserRuleCall_1_2_0; }
	}
	public class EqualityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Equality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cComparaisonParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cEqualsExpressionLhsAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cEqualsSignEqualsSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRhsAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRhsComparaisonParserRuleCall_1_0_2_0 = (RuleCall)cRhsAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cNotEqualsExpressionLhsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cExclamationMarkEqualsSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRhsComparaisonParserRuleCall_1_1_2_0 = (RuleCall)cRhsAssignment_1_1_2.eContents().get(0);
		
		//Equality Expression:
		//	Comparaison ({EqualsExpression.lhs=current} "==" rhs=Comparaison | {NotEqualsExpression.lhs=current} "!="
		//	rhs=Comparaison)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Comparaison ({EqualsExpression.lhs=current} "==" rhs=Comparaison | {NotEqualsExpression.lhs=current} "!="
		//rhs=Comparaison)*
		public Group getGroup() { return cGroup; }
		
		//Comparaison
		public RuleCall getComparaisonParserRuleCall_0() { return cComparaisonParserRuleCall_0; }
		
		//({EqualsExpression.lhs=current} "==" rhs=Comparaison | {NotEqualsExpression.lhs=current} "!=" rhs=Comparaison)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{EqualsExpression.lhs=current} "==" rhs=Comparaison
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{EqualsExpression.lhs=current}
		public Action getEqualsExpressionLhsAction_1_0_0() { return cEqualsExpressionLhsAction_1_0_0; }
		
		//"=="
		public Keyword getEqualsSignEqualsSignKeyword_1_0_1() { return cEqualsSignEqualsSignKeyword_1_0_1; }
		
		//rhs=Comparaison
		public Assignment getRhsAssignment_1_0_2() { return cRhsAssignment_1_0_2; }
		
		//Comparaison
		public RuleCall getRhsComparaisonParserRuleCall_1_0_2_0() { return cRhsComparaisonParserRuleCall_1_0_2_0; }
		
		//{NotEqualsExpression.lhs=current} "!=" rhs=Comparaison
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{NotEqualsExpression.lhs=current}
		public Action getNotEqualsExpressionLhsAction_1_1_0() { return cNotEqualsExpressionLhsAction_1_1_0; }
		
		//"!="
		public Keyword getExclamationMarkEqualsSignKeyword_1_1_1() { return cExclamationMarkEqualsSignKeyword_1_1_1; }
		
		//rhs=Comparaison
		public Assignment getRhsAssignment_1_1_2() { return cRhsAssignment_1_1_2; }
		
		//Comparaison
		public RuleCall getRhsComparaisonParserRuleCall_1_1_2_0() { return cRhsComparaisonParserRuleCall_1_1_2_0; }
	}
	public class ComparaisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Comparaison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAdditionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cGreaterExpressionLhsAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cGreaterThanSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRhsAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRhsAdditionParserRuleCall_1_0_2_0 = (RuleCall)cRhsAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cLowerExpressionLhsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cLessThanSignKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRhsAdditionParserRuleCall_1_1_2_0 = (RuleCall)cRhsAssignment_1_1_2.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Action cGreaterOrEqualExpressionLhsAction_1_2_0 = (Action)cGroup_1_2.eContents().get(0);
		private final Keyword cGreaterThanSignEqualsSignKeyword_1_2_1 = (Keyword)cGroup_1_2.eContents().get(1);
		private final Assignment cRhsAssignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cRhsAdditionParserRuleCall_1_2_2_0 = (RuleCall)cRhsAssignment_1_2_2.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cAlternatives_1.eContents().get(3);
		private final Action cLowerOrEqualExpressionLhsAction_1_3_0 = (Action)cGroup_1_3.eContents().get(0);
		private final Keyword cLessThanSignEqualsSignKeyword_1_3_1 = (Keyword)cGroup_1_3.eContents().get(1);
		private final Assignment cRhsAssignment_1_3_2 = (Assignment)cGroup_1_3.eContents().get(2);
		private final RuleCall cRhsAdditionParserRuleCall_1_3_2_0 = (RuleCall)cRhsAssignment_1_3_2.eContents().get(0);
		
		//Comparaison Expression:
		//	Addition ({GreaterExpression.lhs=current} ">" rhs=Addition | {LowerExpression.lhs=current} "<" rhs=Addition |
		//	{GreaterOrEqualExpression.lhs=current} ">=" rhs=Addition | {LowerOrEqualExpression.lhs=current} "<=" rhs=Addition)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Addition ({GreaterExpression.lhs=current} ">" rhs=Addition | {LowerExpression.lhs=current} "<" rhs=Addition |
		//{GreaterOrEqualExpression.lhs=current} ">=" rhs=Addition | {LowerOrEqualExpression.lhs=current} "<=" rhs=Addition)*
		public Group getGroup() { return cGroup; }
		
		//Addition
		public RuleCall getAdditionParserRuleCall_0() { return cAdditionParserRuleCall_0; }
		
		//({GreaterExpression.lhs=current} ">" rhs=Addition | {LowerExpression.lhs=current} "<" rhs=Addition |
		//{GreaterOrEqualExpression.lhs=current} ">=" rhs=Addition | {LowerOrEqualExpression.lhs=current} "<=" rhs=Addition)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{GreaterExpression.lhs=current} ">" rhs=Addition
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{GreaterExpression.lhs=current}
		public Action getGreaterExpressionLhsAction_1_0_0() { return cGreaterExpressionLhsAction_1_0_0; }
		
		//">"
		public Keyword getGreaterThanSignKeyword_1_0_1() { return cGreaterThanSignKeyword_1_0_1; }
		
		//rhs=Addition
		public Assignment getRhsAssignment_1_0_2() { return cRhsAssignment_1_0_2; }
		
		//Addition
		public RuleCall getRhsAdditionParserRuleCall_1_0_2_0() { return cRhsAdditionParserRuleCall_1_0_2_0; }
		
		//{LowerExpression.lhs=current} "<" rhs=Addition
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{LowerExpression.lhs=current}
		public Action getLowerExpressionLhsAction_1_1_0() { return cLowerExpressionLhsAction_1_1_0; }
		
		//"<"
		public Keyword getLessThanSignKeyword_1_1_1() { return cLessThanSignKeyword_1_1_1; }
		
		//rhs=Addition
		public Assignment getRhsAssignment_1_1_2() { return cRhsAssignment_1_1_2; }
		
		//Addition
		public RuleCall getRhsAdditionParserRuleCall_1_1_2_0() { return cRhsAdditionParserRuleCall_1_1_2_0; }
		
		//{GreaterOrEqualExpression.lhs=current} ">=" rhs=Addition
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//{GreaterOrEqualExpression.lhs=current}
		public Action getGreaterOrEqualExpressionLhsAction_1_2_0() { return cGreaterOrEqualExpressionLhsAction_1_2_0; }
		
		//">="
		public Keyword getGreaterThanSignEqualsSignKeyword_1_2_1() { return cGreaterThanSignEqualsSignKeyword_1_2_1; }
		
		//rhs=Addition
		public Assignment getRhsAssignment_1_2_2() { return cRhsAssignment_1_2_2; }
		
		//Addition
		public RuleCall getRhsAdditionParserRuleCall_1_2_2_0() { return cRhsAdditionParserRuleCall_1_2_2_0; }
		
		//{LowerOrEqualExpression.lhs=current} "<=" rhs=Addition
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//{LowerOrEqualExpression.lhs=current}
		public Action getLowerOrEqualExpressionLhsAction_1_3_0() { return cLowerOrEqualExpressionLhsAction_1_3_0; }
		
		//"<="
		public Keyword getLessThanSignEqualsSignKeyword_1_3_1() { return cLessThanSignEqualsSignKeyword_1_3_1; }
		
		//rhs=Addition
		public Assignment getRhsAssignment_1_3_2() { return cRhsAssignment_1_3_2; }
		
		//Addition
		public RuleCall getRhsAdditionParserRuleCall_1_3_2_0() { return cRhsAdditionParserRuleCall_1_3_2_0; }
	}
	public class AdditionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Addition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMultiplicationParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cPlusExpressionLhsAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRhsAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRhsMultiplicationParserRuleCall_1_0_2_0 = (RuleCall)cRhsAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cMinusExpressionLhsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRhsMultiplicationParserRuleCall_1_1_2_0 = (RuleCall)cRhsAssignment_1_1_2.eContents().get(0);
		
		//Addition Expression:
		//	Multiplication ({PlusExpression.lhs=current} "+" rhs=Multiplication | {MinusExpression.lhs=current} "-"
		//	rhs=Multiplication)*;
		@Override public ParserRule getRule() { return rule; }
		
		//Multiplication ({PlusExpression.lhs=current} "+" rhs=Multiplication | {MinusExpression.lhs=current} "-"
		//rhs=Multiplication)*
		public Group getGroup() { return cGroup; }
		
		//Multiplication
		public RuleCall getMultiplicationParserRuleCall_0() { return cMultiplicationParserRuleCall_0; }
		
		//({PlusExpression.lhs=current} "+" rhs=Multiplication | {MinusExpression.lhs=current} "-" rhs=Multiplication)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{PlusExpression.lhs=current} "+" rhs=Multiplication
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{PlusExpression.lhs=current}
		public Action getPlusExpressionLhsAction_1_0_0() { return cPlusExpressionLhsAction_1_0_0; }
		
		//"+"
		public Keyword getPlusSignKeyword_1_0_1() { return cPlusSignKeyword_1_0_1; }
		
		//rhs=Multiplication
		public Assignment getRhsAssignment_1_0_2() { return cRhsAssignment_1_0_2; }
		
		//Multiplication
		public RuleCall getRhsMultiplicationParserRuleCall_1_0_2_0() { return cRhsMultiplicationParserRuleCall_1_0_2_0; }
		
		//{MinusExpression.lhs=current} "-" rhs=Multiplication
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{MinusExpression.lhs=current}
		public Action getMinusExpressionLhsAction_1_1_0() { return cMinusExpressionLhsAction_1_1_0; }
		
		//"-"
		public Keyword getHyphenMinusKeyword_1_1_1() { return cHyphenMinusKeyword_1_1_1; }
		
		//rhs=Multiplication
		public Assignment getRhsAssignment_1_1_2() { return cRhsAssignment_1_1_2; }
		
		//Multiplication
		public RuleCall getRhsMultiplicationParserRuleCall_1_1_2_0() { return cRhsMultiplicationParserRuleCall_1_1_2_0; }
	}
	public class MultiplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Multiplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCastExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cAlternatives_1.eContents().get(0);
		private final Action cTimesExpressionLhsAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Keyword cAsteriskKeyword_1_0_1 = (Keyword)cGroup_1_0.eContents().get(1);
		private final Assignment cRhsAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRhsCastExpressionParserRuleCall_1_0_2_0 = (RuleCall)cRhsAssignment_1_0_2.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cAlternatives_1.eContents().get(1);
		private final Action cDivExpressionLhsAction_1_1_0 = (Action)cGroup_1_1.eContents().get(0);
		private final Keyword cSolidusKeyword_1_1_1 = (Keyword)cGroup_1_1.eContents().get(1);
		private final Assignment cRhsAssignment_1_1_2 = (Assignment)cGroup_1_1.eContents().get(2);
		private final RuleCall cRhsCastExpressionParserRuleCall_1_1_2_0 = (RuleCall)cRhsAssignment_1_1_2.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cAlternatives_1.eContents().get(2);
		private final Action cModExpressionLhsAction_1_2_0 = (Action)cGroup_1_2.eContents().get(0);
		private final Keyword cPercentSignKeyword_1_2_1 = (Keyword)cGroup_1_2.eContents().get(1);
		private final Assignment cRhsAssignment_1_2_2 = (Assignment)cGroup_1_2.eContents().get(2);
		private final RuleCall cRhsCastExpressionParserRuleCall_1_2_2_0 = (RuleCall)cRhsAssignment_1_2_2.eContents().get(0);
		
		//Multiplication Expression:
		//	CastExpression ({TimesExpression.lhs=current} "*" rhs=CastExpression | {DivExpression.lhs=current} "/"
		//	rhs=CastExpression | {ModExpression.lhs=current} "%" rhs=CastExpression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//CastExpression ({TimesExpression.lhs=current} "*" rhs=CastExpression | {DivExpression.lhs=current} "/"
		//rhs=CastExpression | {ModExpression.lhs=current} "%" rhs=CastExpression)*
		public Group getGroup() { return cGroup; }
		
		//CastExpression
		public RuleCall getCastExpressionParserRuleCall_0() { return cCastExpressionParserRuleCall_0; }
		
		//({TimesExpression.lhs=current} "*" rhs=CastExpression | {DivExpression.lhs=current} "/" rhs=CastExpression |
		//{ModExpression.lhs=current} "%" rhs=CastExpression)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//{TimesExpression.lhs=current} "*" rhs=CastExpression
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{TimesExpression.lhs=current}
		public Action getTimesExpressionLhsAction_1_0_0() { return cTimesExpressionLhsAction_1_0_0; }
		
		//"*"
		public Keyword getAsteriskKeyword_1_0_1() { return cAsteriskKeyword_1_0_1; }
		
		//rhs=CastExpression
		public Assignment getRhsAssignment_1_0_2() { return cRhsAssignment_1_0_2; }
		
		//CastExpression
		public RuleCall getRhsCastExpressionParserRuleCall_1_0_2_0() { return cRhsCastExpressionParserRuleCall_1_0_2_0; }
		
		//{DivExpression.lhs=current} "/" rhs=CastExpression
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//{DivExpression.lhs=current}
		public Action getDivExpressionLhsAction_1_1_0() { return cDivExpressionLhsAction_1_1_0; }
		
		//"/"
		public Keyword getSolidusKeyword_1_1_1() { return cSolidusKeyword_1_1_1; }
		
		//rhs=CastExpression
		public Assignment getRhsAssignment_1_1_2() { return cRhsAssignment_1_1_2; }
		
		//CastExpression
		public RuleCall getRhsCastExpressionParserRuleCall_1_1_2_0() { return cRhsCastExpressionParserRuleCall_1_1_2_0; }
		
		//{ModExpression.lhs=current} "%" rhs=CastExpression
		public Group getGroup_1_2() { return cGroup_1_2; }
		
		//{ModExpression.lhs=current}
		public Action getModExpressionLhsAction_1_2_0() { return cModExpressionLhsAction_1_2_0; }
		
		//"%"
		public Keyword getPercentSignKeyword_1_2_1() { return cPercentSignKeyword_1_2_1; }
		
		//rhs=CastExpression
		public Assignment getRhsAssignment_1_2_2() { return cRhsAssignment_1_2_2; }
		
		//CastExpression
		public RuleCall getRhsCastExpressionParserRuleCall_1_2_2_0() { return cRhsCastExpressionParserRuleCall_1_2_2_0; }
	}
	public class CastExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CastExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cCastExpressionTermAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cAsKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cTypeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final CrossReference cTypeTypeCrossReference_1_2_0 = (CrossReference)cTypeAssignment_1_2.eContents().get(0);
		private final RuleCall cTypeTypeIDTerminalRuleCall_1_2_0_1 = (RuleCall)cTypeTypeCrossReference_1_2_0.eContents().get(1);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Assignment cIsArrayAssignment_1_3_0 = (Assignment)cGroup_1_3.eContents().get(0);
		private final Keyword cIsArrayLeftSquareBracketKeyword_1_3_0_0 = (Keyword)cIsArrayAssignment_1_3_0.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3_1 = (Keyword)cGroup_1_3.eContents().get(1);
		
		//CastExpression Expression:
		//	Primary ({CastExpression.term=current} "as" type=[Type] (^isArray?='[' ']')?)?;
		@Override public ParserRule getRule() { return rule; }
		
		//Primary ({CastExpression.term=current} "as" type=[Type] (^isArray?='[' ']')?)?
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		//({CastExpression.term=current} "as" type=[Type] (^isArray?='[' ']')?)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{CastExpression.term=current}
		public Action getCastExpressionTermAction_1_0() { return cCastExpressionTermAction_1_0; }
		
		//"as"
		public Keyword getAsKeyword_1_1() { return cAsKeyword_1_1; }
		
		//type=[Type]
		public Assignment getTypeAssignment_1_2() { return cTypeAssignment_1_2; }
		
		//[Type]
		public CrossReference getTypeTypeCrossReference_1_2_0() { return cTypeTypeCrossReference_1_2_0; }
		
		//ID
		public RuleCall getTypeTypeIDTerminalRuleCall_1_2_0_1() { return cTypeTypeIDTerminalRuleCall_1_2_0_1; }
		
		//(^isArray?='[' ']')?
		public Group getGroup_1_3() { return cGroup_1_3; }
		
		//^isArray?='['
		public Assignment getIsArrayAssignment_1_3_0() { return cIsArrayAssignment_1_3_0; }
		
		//'['
		public Keyword getIsArrayLeftSquareBracketKeyword_1_3_0_0() { return cIsArrayLeftSquareBracketKeyword_1_3_0_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_3_1() { return cRightSquareBracketKeyword_1_3_1; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cExpressionGroupAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cTermAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cTermExpressionParserRuleCall_0_2_0 = (RuleCall)cTermAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cNotExpressionAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cNotKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cTermAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cTermPrimaryParserRuleCall_1_2_0 = (RuleCall)cTermAssignment_1_2.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cUnaryMinusAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cTermAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cTermPrimaryParserRuleCall_2_2_0 = (RuleCall)cTermAssignment_2_2.eContents().get(0);
		private final RuleCall cArrayIndexPostfixParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//Primary Expression:
		//	{ExpressionGroup} '(' term=Expression ')' | {NotExpression} "not" term=Primary | {UnaryMinus} '-' term=Primary
		//	| ArrayIndexPostfix;
		@Override public ParserRule getRule() { return rule; }
		
		//{ExpressionGroup} '(' term=Expression ')' | {NotExpression} "not" term=Primary | {UnaryMinus} '-' term=Primary |
		//ArrayIndexPostfix
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{ExpressionGroup} '(' term=Expression ')'
		public Group getGroup_0() { return cGroup_0; }
		
		//{ExpressionGroup}
		public Action getExpressionGroupAction_0_0() { return cExpressionGroupAction_0_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }
		
		//term=Expression
		public Assignment getTermAssignment_0_2() { return cTermAssignment_0_2; }
		
		//Expression
		public RuleCall getTermExpressionParserRuleCall_0_2_0() { return cTermExpressionParserRuleCall_0_2_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }
		
		//{NotExpression} "not" term=Primary
		public Group getGroup_1() { return cGroup_1; }
		
		//{NotExpression}
		public Action getNotExpressionAction_1_0() { return cNotExpressionAction_1_0; }
		
		//"not"
		public Keyword getNotKeyword_1_1() { return cNotKeyword_1_1; }
		
		//term=Primary
		public Assignment getTermAssignment_1_2() { return cTermAssignment_1_2; }
		
		//Primary
		public RuleCall getTermPrimaryParserRuleCall_1_2_0() { return cTermPrimaryParserRuleCall_1_2_0; }
		
		//{UnaryMinus} '-' term=Primary
		public Group getGroup_2() { return cGroup_2; }
		
		//{UnaryMinus}
		public Action getUnaryMinusAction_2_0() { return cUnaryMinusAction_2_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_2_1() { return cHyphenMinusKeyword_2_1; }
		
		//term=Primary
		public Assignment getTermAssignment_2_2() { return cTermAssignment_2_2; }
		
		//Primary
		public RuleCall getTermPrimaryParserRuleCall_2_2_0() { return cTermPrimaryParserRuleCall_2_2_0; }
		
		//ArrayIndexPostfix
		public RuleCall getArrayIndexPostfixParserRuleCall_3() { return cArrayIndexPostfixParserRuleCall_3; }
	}
	public class ArrayIndexPostfixElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ArrayIndexPostfix");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAtomicExpressionParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cArrayIndexArrayAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cIndexAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cIndexExpressionParserRuleCall_1_2_0 = (RuleCall)cIndexAssignment_1_2.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		
		//ArrayIndexPostfix Expression:
		//	AtomicExpression ({ArrayIndex.array=current} '[' index=Expression ']')?;
		@Override public ParserRule getRule() { return rule; }
		
		//AtomicExpression ({ArrayIndex.array=current} '[' index=Expression ']')?
		public Group getGroup() { return cGroup; }
		
		//AtomicExpression
		public RuleCall getAtomicExpressionParserRuleCall_0() { return cAtomicExpressionParserRuleCall_0; }
		
		//({ArrayIndex.array=current} '[' index=Expression ']')?
		public Group getGroup_1() { return cGroup_1; }
		
		//{ArrayIndex.array=current}
		public Action getArrayIndexArrayAction_1_0() { return cArrayIndexArrayAction_1_0; }
		
		//'['
		public Keyword getLeftSquareBracketKeyword_1_1() { return cLeftSquareBracketKeyword_1_1; }
		
		//index=Expression
		public Assignment getIndexAssignment_1_2() { return cIndexAssignment_1_2; }
		
		//Expression
		public RuleCall getIndexExpressionParserRuleCall_1_2_0() { return cIndexExpressionParserRuleCall_1_2_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_1_3() { return cRightSquareBracketKeyword_1_3; }
	}
	public class AtomicExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AtomicExpression");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cExternExpressionParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cArrayInitParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cPropertyReferenceParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cFunctionCallExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cEventReferenceParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cCpropertyReferenceParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//AtomicExpression Expression:
		//	ExternExpression | Literal | ArrayInit | PropertyReference | FunctionCallExpression
		//	| EventReference | CpropertyReference;
		@Override public ParserRule getRule() { return rule; }
		
		//ExternExpression | Literal | ArrayInit | PropertyReference | FunctionCallExpression | EventReference |
		//CpropertyReference
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ExternExpression
		public RuleCall getExternExpressionParserRuleCall_0() { return cExternExpressionParserRuleCall_0; }
		
		//Literal
		public RuleCall getLiteralParserRuleCall_1() { return cLiteralParserRuleCall_1; }
		
		//ArrayInit
		public RuleCall getArrayInitParserRuleCall_2() { return cArrayInitParserRuleCall_2; }
		
		//PropertyReference
		public RuleCall getPropertyReferenceParserRuleCall_3() { return cPropertyReferenceParserRuleCall_3; }
		
		//FunctionCallExpression
		public RuleCall getFunctionCallExpressionParserRuleCall_4() { return cFunctionCallExpressionParserRuleCall_4; }
		
		//EventReference
		public RuleCall getEventReferenceParserRuleCall_5() { return cEventReferenceParserRuleCall_5; }
		
		//CpropertyReference
		public RuleCall getCpropertyReferenceParserRuleCall_6() { return cCpropertyReferenceParserRuleCall_6; }
	}
	public class ExternExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ExternExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cExpressionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cExpressionEXTERNTerminalRuleCall_0_0 = (RuleCall)cExpressionAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cAmpersandKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cSegmentsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSegmentsExpressionParserRuleCall_1_1_0 = (RuleCall)cSegmentsAssignment_1_1.eContents().get(0);
		
		//ExternExpression:
		//	expression=EXTERN ('&' segments+=Expression)*;
		@Override public ParserRule getRule() { return rule; }
		
		//expression=EXTERN ('&' segments+=Expression)*
		public Group getGroup() { return cGroup; }
		
		//expression=EXTERN
		public Assignment getExpressionAssignment_0() { return cExpressionAssignment_0; }
		
		//EXTERN
		public RuleCall getExpressionEXTERNTerminalRuleCall_0_0() { return cExpressionEXTERNTerminalRuleCall_0_0; }
		
		//('&' segments+=Expression)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'&'
		public Keyword getAmpersandKeyword_1_0() { return cAmpersandKeyword_1_0; }
		
		//segments+=Expression
		public Assignment getSegmentsAssignment_1_1() { return cSegmentsAssignment_1_1; }
		
		//Expression
		public RuleCall getSegmentsExpressionParserRuleCall_1_1_0() { return cSegmentsExpressionParserRuleCall_1_1_0; }
	}
	public class LiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Literal");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEnumLiteralRefParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cByteLiteralParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCharLiteralParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cIntegerLiteralParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBooleanLiteralParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cStringLiteralParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cDoubleLiteralParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		
		//Literal:
		//	EnumLiteralRef | ByteLiteral | CharLiteral | IntegerLiteral | BooleanLiteral | StringLiteral | DoubleLiteral;
		@Override public ParserRule getRule() { return rule; }
		
		//EnumLiteralRef | ByteLiteral | CharLiteral | IntegerLiteral | BooleanLiteral | StringLiteral | DoubleLiteral
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EnumLiteralRef
		public RuleCall getEnumLiteralRefParserRuleCall_0() { return cEnumLiteralRefParserRuleCall_0; }
		
		//ByteLiteral
		public RuleCall getByteLiteralParserRuleCall_1() { return cByteLiteralParserRuleCall_1; }
		
		//CharLiteral
		public RuleCall getCharLiteralParserRuleCall_2() { return cCharLiteralParserRuleCall_2; }
		
		//IntegerLiteral
		public RuleCall getIntegerLiteralParserRuleCall_3() { return cIntegerLiteralParserRuleCall_3; }
		
		//BooleanLiteral
		public RuleCall getBooleanLiteralParserRuleCall_4() { return cBooleanLiteralParserRuleCall_4; }
		
		//StringLiteral
		public RuleCall getStringLiteralParserRuleCall_5() { return cStringLiteralParserRuleCall_5; }
		
		//DoubleLiteral
		public RuleCall getDoubleLiteralParserRuleCall_6() { return cDoubleLiteralParserRuleCall_6; }
	}
	public class ArrayInitElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ArrayInit");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesExpressionParserRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesExpressionParserRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//ArrayInit:
		//	'{' values+=Expression (',' values+=Expression)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'{' values+=Expression (',' values+=Expression)* '}'
		public Group getGroup() { return cGroup; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_0() { return cLeftCurlyBracketKeyword_0; }
		
		//values+=Expression
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }
		
		//Expression
		public RuleCall getValuesExpressionParserRuleCall_1_0() { return cValuesExpressionParserRuleCall_1_0; }
		
		//(',' values+=Expression)*
		public Group getGroup_2() { return cGroup_2; }
		
		//','
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }
		
		//values+=Expression
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }
		
		//Expression
		public RuleCall getValuesExpressionParserRuleCall_2_1_0() { return cValuesExpressionParserRuleCall_2_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_3() { return cRightCurlyBracketKeyword_3; }
	}
	public class EnumLiteralRefElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.EnumLiteralRef");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cEnumAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cEnumEnumerationCrossReference_0_0 = (CrossReference)cEnumAssignment_0.eContents().get(0);
		private final RuleCall cEnumEnumerationIDTerminalRuleCall_0_0_1 = (RuleCall)cEnumEnumerationCrossReference_0_0.eContents().get(1);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cLiteralAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cLiteralEnumerationLiteralCrossReference_2_0 = (CrossReference)cLiteralAssignment_2.eContents().get(0);
		private final RuleCall cLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1 = (RuleCall)cLiteralEnumerationLiteralCrossReference_2_0.eContents().get(1);
		
		//EnumLiteralRef:
		//	^enum=[Enumeration] ':' literal=[EnumerationLiteral];
		@Override public ParserRule getRule() { return rule; }
		
		//^enum=[Enumeration] ':' literal=[EnumerationLiteral]
		public Group getGroup() { return cGroup; }
		
		//^enum=[Enumeration]
		public Assignment getEnumAssignment_0() { return cEnumAssignment_0; }
		
		//[Enumeration]
		public CrossReference getEnumEnumerationCrossReference_0_0() { return cEnumEnumerationCrossReference_0_0; }
		
		//ID
		public RuleCall getEnumEnumerationIDTerminalRuleCall_0_0_1() { return cEnumEnumerationIDTerminalRuleCall_0_0_1; }
		
		//':'
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }
		
		//literal=[EnumerationLiteral]
		public Assignment getLiteralAssignment_2() { return cLiteralAssignment_2; }
		
		//[EnumerationLiteral]
		public CrossReference getLiteralEnumerationLiteralCrossReference_2_0() { return cLiteralEnumerationLiteralCrossReference_2_0; }
		
		//ID
		public RuleCall getLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1() { return cLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1; }
	}
	public class ByteLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ByteLiteral");
		private final Assignment cByteValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cByteValueBYTETerminalRuleCall_0 = (RuleCall)cByteValueAssignment.eContents().get(0);
		
		//ByteLiteral:
		//	byteValue=BYTE;
		@Override public ParserRule getRule() { return rule; }
		
		//byteValue=BYTE
		public Assignment getByteValueAssignment() { return cByteValueAssignment; }
		
		//BYTE
		public RuleCall getByteValueBYTETerminalRuleCall_0() { return cByteValueBYTETerminalRuleCall_0; }
	}
	public class CharLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CharLiteral");
		private final Assignment cCharValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cCharValueCHARTerminalRuleCall_0 = (RuleCall)cCharValueAssignment.eContents().get(0);
		
		//CharLiteral:
		//	charValue=CHAR;
		@Override public ParserRule getRule() { return rule; }
		
		//charValue=CHAR
		public Assignment getCharValueAssignment() { return cCharValueAssignment; }
		
		//CHAR
		public RuleCall getCharValueCHARTerminalRuleCall_0() { return cCharValueCHARTerminalRuleCall_0; }
	}
	public class IntegerLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.IntegerLiteral");
		private final Assignment cIntValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cIntValueINTTerminalRuleCall_0 = (RuleCall)cIntValueAssignment.eContents().get(0);
		
		//IntegerLiteral:
		//	intValue=INT;
		@Override public ParserRule getRule() { return rule; }
		
		//intValue=INT
		public Assignment getIntValueAssignment() { return cIntValueAssignment; }
		
		//INT
		public RuleCall getIntValueINTTerminalRuleCall_0() { return cIntValueINTTerminalRuleCall_0; }
	}
	public class BooleanLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.BooleanLiteral");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cBoolValueAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final Keyword cBoolValueTrueKeyword_0_0 = (Keyword)cBoolValueAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cBooleanLiteralAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cFalseKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		
		//BooleanLiteral:
		//	boolValue?='true' | {BooleanLiteral} 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//boolValue?='true' | {BooleanLiteral} 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//boolValue?='true'
		public Assignment getBoolValueAssignment_0() { return cBoolValueAssignment_0; }
		
		//'true'
		public Keyword getBoolValueTrueKeyword_0_0() { return cBoolValueTrueKeyword_0_0; }
		
		//{BooleanLiteral} 'false'
		public Group getGroup_1() { return cGroup_1; }
		
		//{BooleanLiteral}
		public Action getBooleanLiteralAction_1_0() { return cBooleanLiteralAction_1_0; }
		
		//'false'
		public Keyword getFalseKeyword_1_1() { return cFalseKeyword_1_1; }
	}
	public class StringLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.StringLiteral");
		private final Assignment cStringValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cStringValueSTRINGTerminalRuleCall_0 = (RuleCall)cStringValueAssignment.eContents().get(0);
		
		//StringLiteral:
		//	stringValue=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//stringValue=STRING
		public Assignment getStringValueAssignment() { return cStringValueAssignment; }
		
		//STRING
		public RuleCall getStringValueSTRINGTerminalRuleCall_0() { return cStringValueSTRINGTerminalRuleCall_0; }
	}
	public class DoubleLiteralElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.DoubleLiteral");
		private final Assignment cDoubleValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cDoubleValueFLOATTerminalRuleCall_0 = (RuleCall)cDoubleValueAssignment.eContents().get(0);
		
		//DoubleLiteral:
		//	doubleValue=FLOAT;
		@Override public ParserRule getRule() { return rule; }
		
		//doubleValue=FLOAT
		public Assignment getDoubleValueAssignment() { return cDoubleValueAssignment; }
		
		//FLOAT
		public RuleCall getDoubleValueFLOATTerminalRuleCall_0() { return cDoubleValueFLOATTerminalRuleCall_0; }
	}
	public class PropertyReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.PropertyReference");
		private final Assignment cPropertyAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cPropertyVariableCrossReference_0 = (CrossReference)cPropertyAssignment.eContents().get(0);
		private final RuleCall cPropertyVariableIDTerminalRuleCall_0_1 = (RuleCall)cPropertyVariableCrossReference_0.eContents().get(1);
		
		//PropertyReference:
		//	property=[Variable];
		@Override public ParserRule getRule() { return rule; }
		
		//property=[Variable]
		public Assignment getPropertyAssignment() { return cPropertyAssignment; }
		
		//[Variable]
		public CrossReference getPropertyVariableCrossReference_0() { return cPropertyVariableCrossReference_0; }
		
		//ID
		public RuleCall getPropertyVariableIDTerminalRuleCall_0_1() { return cPropertyVariableIDTerminalRuleCall_0_1; }
	}
	public class CpropertyReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CpropertyReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cCpropertysAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cCpropertysVariableCrossReference_1_0 = (CrossReference)cCpropertysAssignment_1.eContents().get(0);
		private final RuleCall cCpropertysVariableIDTerminalRuleCall_1_0_1 = (RuleCall)cCpropertysVariableCrossReference_1_0.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cCindexAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cCindexExpressionParserRuleCall_2_1_0 = (RuleCall)cCindexAssignment_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cFullStopKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPropertyAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final CrossReference cPropertyVariableCrossReference_3_1_0 = (CrossReference)cPropertyAssignment_3_1.eContents().get(0);
		private final RuleCall cPropertyVariableIDTerminalRuleCall_3_1_0_1 = (RuleCall)cPropertyVariableCrossReference_3_1_0.eContents().get(1);
		private final Group cGroup_3_2 = (Group)cGroup_3.eContents().get(2);
		private final Keyword cLeftSquareBracketKeyword_3_2_0 = (Keyword)cGroup_3_2.eContents().get(0);
		private final Assignment cPindexAssignment_3_2_1 = (Assignment)cGroup_3_2.eContents().get(1);
		private final RuleCall cPindexExpressionParserRuleCall_3_2_1_0 = (RuleCall)cPindexAssignment_3_2_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_3_2_2 = (Keyword)cGroup_3_2.eContents().get(2);
		
		////StrategyReferrence returns StrategyReferrence:
		////	strategys += [Variable|ID]  (',' strategys+= [Variable|ID] )* 
		////;
		//CpropertyReference:
		//	'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
		//	']')?)?
		//	//	cpropertys+=[Variable|ID] (=>'[' index+=Expression ']')? '#>' (cpropertys += [Variable|ID] (=>'[' index+=Expression ']')?'#>')* property = [Variable|ID] (=>'[' index+=Expression ']')?
		//	//	cproperty=[Cproperty|ID] '--' property = [Property|ID]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
		//']')?)?
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//cpropertys+=[Variable]
		public Assignment getCpropertysAssignment_1() { return cCpropertysAssignment_1; }
		
		//[Variable]
		public CrossReference getCpropertysVariableCrossReference_1_0() { return cCpropertysVariableCrossReference_1_0; }
		
		//ID
		public RuleCall getCpropertysVariableIDTerminalRuleCall_1_0_1() { return cCpropertysVariableIDTerminalRuleCall_1_0_1; }
		
		//(=> '[' cindex=Expression ']')?
		public Group getGroup_2() { return cGroup_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_2_0() { return cLeftSquareBracketKeyword_2_0; }
		
		//cindex=Expression
		public Assignment getCindexAssignment_2_1() { return cCindexAssignment_2_1; }
		
		//Expression
		public RuleCall getCindexExpressionParserRuleCall_2_1_0() { return cCindexExpressionParserRuleCall_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_2_2() { return cRightSquareBracketKeyword_2_2; }
		
		//('.' property=[Variable] (=> '[' pindex=Expression ']')?)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'.'
		public Keyword getFullStopKeyword_3_0() { return cFullStopKeyword_3_0; }
		
		//property=[Variable]
		public Assignment getPropertyAssignment_3_1() { return cPropertyAssignment_3_1; }
		
		//[Variable]
		public CrossReference getPropertyVariableCrossReference_3_1_0() { return cPropertyVariableCrossReference_3_1_0; }
		
		//ID
		public RuleCall getPropertyVariableIDTerminalRuleCall_3_1_0_1() { return cPropertyVariableIDTerminalRuleCall_3_1_0_1; }
		
		//(=> '[' pindex=Expression ']')?
		public Group getGroup_3_2() { return cGroup_3_2; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_3_2_0() { return cLeftSquareBracketKeyword_3_2_0; }
		
		//pindex=Expression
		public Assignment getPindexAssignment_3_2_1() { return cPindexAssignment_3_2_1; }
		
		//Expression
		public RuleCall getPindexExpressionParserRuleCall_3_2_1_0() { return cPindexExpressionParserRuleCall_3_2_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_3_2_2() { return cRightSquareBracketKeyword_3_2_2; }
	}
	public class EventReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.EventReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cReceiveMsgAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cReceiveMsgEventCrossReference_0_0 = (CrossReference)cReceiveMsgAssignment_0.eContents().get(0);
		private final RuleCall cReceiveMsgEventIDTerminalRuleCall_0_0_1 = (RuleCall)cReceiveMsgEventCrossReference_0_0.eContents().get(1);
		private final Keyword cFullStopKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cParameterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cParameterParameterCrossReference_2_0 = (CrossReference)cParameterAssignment_2.eContents().get(0);
		private final RuleCall cParameterParameterIDTerminalRuleCall_2_0_1 = (RuleCall)cParameterParameterCrossReference_2_0.eContents().get(1);
		
		//EventReference:
		//	receiveMsg=[Event] "." parameter=[Parameter];
		@Override public ParserRule getRule() { return rule; }
		
		//receiveMsg=[Event] "." parameter=[Parameter]
		public Group getGroup() { return cGroup; }
		
		//receiveMsg=[Event]
		public Assignment getReceiveMsgAssignment_0() { return cReceiveMsgAssignment_0; }
		
		//[Event]
		public CrossReference getReceiveMsgEventCrossReference_0_0() { return cReceiveMsgEventCrossReference_0_0; }
		
		//ID
		public RuleCall getReceiveMsgEventIDTerminalRuleCall_0_0_1() { return cReceiveMsgEventIDTerminalRuleCall_0_0_1; }
		
		//"."
		public Keyword getFullStopKeyword_1() { return cFullStopKeyword_1; }
		
		//parameter=[Parameter]
		public Assignment getParameterAssignment_2() { return cParameterAssignment_2; }
		
		//[Parameter]
		public CrossReference getParameterParameterCrossReference_2_0() { return cParameterParameterCrossReference_2_0; }
		
		//ID
		public RuleCall getParameterParameterIDTerminalRuleCall_2_0_1() { return cParameterParameterIDTerminalRuleCall_2_0_1; }
	}
	public class FunctionCallExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.FunctionCallExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cFunctionAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final CrossReference cFunctionFunctionCrossReference_0_0 = (CrossReference)cFunctionAssignment_0.eContents().get(0);
		private final RuleCall cFunctionFunctionIDTerminalRuleCall_0_0_1 = (RuleCall)cFunctionFunctionCrossReference_0_0.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Assignment cParametersAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final RuleCall cParametersExpressionParserRuleCall_2_0_0 = (RuleCall)cParametersAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cGroup_2.eContents().get(1);
		private final Keyword cCommaKeyword_2_1_0 = (Keyword)cGroup_2_1.eContents().get(0);
		private final Assignment cParametersAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cParametersExpressionParserRuleCall_2_1_1_0 = (RuleCall)cParametersAssignment_2_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//FunctionCallExpression:
		//	function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)?
		//	')';
		@Override public ParserRule getRule() { return rule; }
		
		//function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')'
		public Group getGroup() { return cGroup; }
		
		//function=[Function]
		public Assignment getFunctionAssignment_0() { return cFunctionAssignment_0; }
		
		//[Function]
		public CrossReference getFunctionFunctionCrossReference_0_0() { return cFunctionFunctionCrossReference_0_0; }
		
		//ID
		public RuleCall getFunctionFunctionIDTerminalRuleCall_0_0_1() { return cFunctionFunctionIDTerminalRuleCall_0_0_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }
		
		//(parameters+=Expression ("," parameters+=Expression)*)?
		public Group getGroup_2() { return cGroup_2; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_2_0() { return cParametersAssignment_2_0; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_2_0_0() { return cParametersExpressionParserRuleCall_2_0_0; }
		
		//("," parameters+=Expression)*
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//","
		public Keyword getCommaKeyword_2_1_0() { return cCommaKeyword_2_1_0; }
		
		//parameters+=Expression
		public Assignment getParametersAssignment_2_1_1() { return cParametersAssignment_2_1_1; }
		
		//Expression
		public RuleCall getParametersExpressionParserRuleCall_2_1_1_0() { return cParametersExpressionParserRuleCall_2_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }
	}
	public class ConfigurationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Configuration");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConfigurationKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cAnnotationsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_2_0 = (RuleCall)cAnnotationsAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final Assignment cInstancesAssignment_4_0 = (Assignment)cAlternatives_4.eContents().get(0);
		private final RuleCall cInstancesInstanceParserRuleCall_4_0_0 = (RuleCall)cInstancesAssignment_4_0.eContents().get(0);
		private final Assignment cConnectorsAssignment_4_1 = (Assignment)cAlternatives_4.eContents().get(1);
		private final RuleCall cConnectorsAbstractConnectorParserRuleCall_4_1_0 = (RuleCall)cConnectorsAssignment_4_1.eContents().get(0);
		private final Assignment cPropassignsAssignment_4_2 = (Assignment)cAlternatives_4.eContents().get(2);
		private final RuleCall cPropassignsConfigPropertyAssignParserRuleCall_4_2_0 = (RuleCall)cPropassignsAssignment_4_2.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		///*****************************************************************************
		// *       CONFIGURATIONS                                                      *
		// *****************************************************************************/ Configuration:
		//	'configuration' name=ID annotations+=PlatformAnnotation* '{' (instances+=Instance | connectors+=AbstractConnector |
		//	propassigns+=ConfigPropertyAssign)*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'configuration' name=ID annotations+=PlatformAnnotation* '{' (instances+=Instance | connectors+=AbstractConnector |
		//propassigns+=ConfigPropertyAssign)* '}'
		public Group getGroup() { return cGroup; }
		
		//'configuration'
		public Keyword getConfigurationKeyword_0() { return cConfigurationKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_2() { return cAnnotationsAssignment_2; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_2_0() { return cAnnotationsPlatformAnnotationParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//(instances+=Instance | connectors+=AbstractConnector | propassigns+=ConfigPropertyAssign)*
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//instances+=Instance
		public Assignment getInstancesAssignment_4_0() { return cInstancesAssignment_4_0; }
		
		//Instance
		public RuleCall getInstancesInstanceParserRuleCall_4_0_0() { return cInstancesInstanceParserRuleCall_4_0_0; }
		
		//connectors+=AbstractConnector
		public Assignment getConnectorsAssignment_4_1() { return cConnectorsAssignment_4_1; }
		
		//AbstractConnector
		public RuleCall getConnectorsAbstractConnectorParserRuleCall_4_1_0() { return cConnectorsAbstractConnectorParserRuleCall_4_1_0; }
		
		//propassigns+=ConfigPropertyAssign
		public Assignment getPropassignsAssignment_4_2() { return cPropassignsAssignment_4_2; }
		
		//ConfigPropertyAssign
		public RuleCall getPropassignsConfigPropertyAssignParserRuleCall_4_2_0() { return cPropassignsConfigPropertyAssignParserRuleCall_4_2_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class InstanceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Instance");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cInstanceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cColonKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cTypeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cTypeThingCrossReference_3_0 = (CrossReference)cTypeAssignment_3.eContents().get(0);
		private final RuleCall cTypeThingIDTerminalRuleCall_3_0_1 = (RuleCall)cTypeThingCrossReference_3_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_4_0 = (RuleCall)cAnnotationsAssignment_4.eContents().get(0);
		
		//Instance:
		//	'instance' name=ID ':' type=[Thing] annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'instance' name=ID ':' type=[Thing] annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'instance'
		public Keyword getInstanceKeyword_0() { return cInstanceKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//':'
		public Keyword getColonKeyword_2() { return cColonKeyword_2; }
		
		//type=[Thing]
		public Assignment getTypeAssignment_3() { return cTypeAssignment_3; }
		
		//[Thing]
		public CrossReference getTypeThingCrossReference_3_0() { return cTypeThingCrossReference_3_0; }
		
		//ID
		public RuleCall getTypeThingIDTerminalRuleCall_3_0_1() { return cTypeThingIDTerminalRuleCall_3_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_4() { return cAnnotationsAssignment_4; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_4_0() { return cAnnotationsPlatformAnnotationParserRuleCall_4_0; }
	}
	public class ConfigPropertyAssignElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ConfigPropertyAssign");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cSetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cInstanceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cInstanceInstanceCrossReference_1_0 = (CrossReference)cInstanceAssignment_1.eContents().get(0);
		private final RuleCall cInstanceInstanceIDTerminalRuleCall_1_0_1 = (RuleCall)cInstanceInstanceCrossReference_1_0.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cPropertyAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final CrossReference cPropertyPropertyCrossReference_3_0 = (CrossReference)cPropertyAssignment_3.eContents().get(0);
		private final RuleCall cPropertyPropertyIDTerminalRuleCall_3_0_1 = (RuleCall)cPropertyPropertyCrossReference_3_0.eContents().get(1);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cLeftSquareBracketKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cIndexAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cIndexExpressionParserRuleCall_4_1_0 = (RuleCall)cIndexAssignment_4_1.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		private final Keyword cEqualsSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cInitAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cInitExpressionParserRuleCall_6_0 = (RuleCall)cInitAssignment_6.eContents().get(0);
		private final Assignment cAnnotationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_7_0 = (RuleCall)cAnnotationsAssignment_7.eContents().get(0);
		
		//ConfigPropertyAssign:
		//	'set' instance=[Instance] '.' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression
		//	annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'set' instance=[Instance] '.' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression
		//annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'set'
		public Keyword getSetKeyword_0() { return cSetKeyword_0; }
		
		//instance=[Instance]
		public Assignment getInstanceAssignment_1() { return cInstanceAssignment_1; }
		
		//[Instance]
		public CrossReference getInstanceInstanceCrossReference_1_0() { return cInstanceInstanceCrossReference_1_0; }
		
		//ID
		public RuleCall getInstanceInstanceIDTerminalRuleCall_1_0_1() { return cInstanceInstanceIDTerminalRuleCall_1_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }
		
		//property=[Property]
		public Assignment getPropertyAssignment_3() { return cPropertyAssignment_3; }
		
		//[Property]
		public CrossReference getPropertyPropertyCrossReference_3_0() { return cPropertyPropertyCrossReference_3_0; }
		
		//ID
		public RuleCall getPropertyPropertyIDTerminalRuleCall_3_0_1() { return cPropertyPropertyIDTerminalRuleCall_3_0_1; }
		
		//(=> '[' index=Expression ']')?
		public Group getGroup_4() { return cGroup_4; }
		
		//=> '['
		public Keyword getLeftSquareBracketKeyword_4_0() { return cLeftSquareBracketKeyword_4_0; }
		
		//index=Expression
		public Assignment getIndexAssignment_4_1() { return cIndexAssignment_4_1; }
		
		//Expression
		public RuleCall getIndexExpressionParserRuleCall_4_1_0() { return cIndexExpressionParserRuleCall_4_1_0; }
		
		//']'
		public Keyword getRightSquareBracketKeyword_4_2() { return cRightSquareBracketKeyword_4_2; }
		
		//'='
		public Keyword getEqualsSignKeyword_5() { return cEqualsSignKeyword_5; }
		
		//init=Expression
		public Assignment getInitAssignment_6() { return cInitAssignment_6; }
		
		//Expression
		public RuleCall getInitExpressionParserRuleCall_6_0() { return cInitExpressionParserRuleCall_6_0; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_7() { return cAnnotationsAssignment_7; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_7_0() { return cAnnotationsPlatformAnnotationParserRuleCall_7_0; }
	}
	public class AbstractConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.AbstractConnector");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cConnectorParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cExternalConnectorParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractConnector:
		//	Connector | ExternalConnector;
		@Override public ParserRule getRule() { return rule; }
		
		//Connector | ExternalConnector
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Connector
		public RuleCall getConnectorParserRuleCall_0() { return cConnectorParserRuleCall_0; }
		
		//ExternalConnector
		public RuleCall getExternalConnectorParserRuleCall_1() { return cExternalConnectorParserRuleCall_1; }
	}
	public class ConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.Connector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cCliAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cCliInstanceCrossReference_2_0 = (CrossReference)cCliAssignment_2.eContents().get(0);
		private final RuleCall cCliInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cCliInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRequiredAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cRequiredRequiredPortCrossReference_4_0 = (CrossReference)cRequiredAssignment_4.eContents().get(0);
		private final RuleCall cRequiredRequiredPortIDTerminalRuleCall_4_0_1 = (RuleCall)cRequiredRequiredPortCrossReference_4_0.eContents().get(1);
		private final Keyword cEqualsSignGreaterThanSignKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cSrvAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cSrvInstanceCrossReference_6_0 = (CrossReference)cSrvAssignment_6.eContents().get(0);
		private final RuleCall cSrvInstanceIDTerminalRuleCall_6_0_1 = (RuleCall)cSrvInstanceCrossReference_6_0.eContents().get(1);
		private final Keyword cFullStopKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cProvidedAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cProvidedProvidedPortCrossReference_8_0 = (CrossReference)cProvidedAssignment_8.eContents().get(0);
		private final RuleCall cProvidedProvidedPortIDTerminalRuleCall_8_0_1 = (RuleCall)cProvidedProvidedPortCrossReference_8_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_9 = (Assignment)cGroup.eContents().get(9);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_9_0 = (RuleCall)cAnnotationsAssignment_9.eContents().get(0);
		
		//Connector:
		//	'connector' name=ID? cli=[Instance] '.' required=[RequiredPort] '=>' srv=[Instance] '.' provided=[ProvidedPort]
		//	annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'connector' name=ID? cli=[Instance] '.' required=[RequiredPort] '=>' srv=[Instance] '.' provided=[ProvidedPort]
		//annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'connector'
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//cli=[Instance]
		public Assignment getCliAssignment_2() { return cCliAssignment_2; }
		
		//[Instance]
		public CrossReference getCliInstanceCrossReference_2_0() { return cCliInstanceCrossReference_2_0; }
		
		//ID
		public RuleCall getCliInstanceIDTerminalRuleCall_2_0_1() { return cCliInstanceIDTerminalRuleCall_2_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//required=[RequiredPort]
		public Assignment getRequiredAssignment_4() { return cRequiredAssignment_4; }
		
		//[RequiredPort]
		public CrossReference getRequiredRequiredPortCrossReference_4_0() { return cRequiredRequiredPortCrossReference_4_0; }
		
		//ID
		public RuleCall getRequiredRequiredPortIDTerminalRuleCall_4_0_1() { return cRequiredRequiredPortIDTerminalRuleCall_4_0_1; }
		
		//'=>'
		public Keyword getEqualsSignGreaterThanSignKeyword_5() { return cEqualsSignGreaterThanSignKeyword_5; }
		
		//srv=[Instance]
		public Assignment getSrvAssignment_6() { return cSrvAssignment_6; }
		
		//[Instance]
		public CrossReference getSrvInstanceCrossReference_6_0() { return cSrvInstanceCrossReference_6_0; }
		
		//ID
		public RuleCall getSrvInstanceIDTerminalRuleCall_6_0_1() { return cSrvInstanceIDTerminalRuleCall_6_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_7() { return cFullStopKeyword_7; }
		
		//provided=[ProvidedPort]
		public Assignment getProvidedAssignment_8() { return cProvidedAssignment_8; }
		
		//[ProvidedPort]
		public CrossReference getProvidedProvidedPortCrossReference_8_0() { return cProvidedProvidedPortCrossReference_8_0; }
		
		//ID
		public RuleCall getProvidedProvidedPortIDTerminalRuleCall_8_0_1() { return cProvidedProvidedPortIDTerminalRuleCall_8_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_9() { return cAnnotationsAssignment_9; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_9_0() { return cAnnotationsPlatformAnnotationParserRuleCall_9_0; }
	}
	public class ExternalConnectorElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ExternalConnector");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cConnectorKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cInstAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cInstInstanceCrossReference_2_0 = (CrossReference)cInstAssignment_2.eContents().get(0);
		private final RuleCall cInstInstanceIDTerminalRuleCall_2_0_1 = (RuleCall)cInstInstanceCrossReference_2_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cPortAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cPortPortCrossReference_4_0 = (CrossReference)cPortAssignment_4.eContents().get(0);
		private final RuleCall cPortPortIDTerminalRuleCall_4_0_1 = (RuleCall)cPortPortCrossReference_4_0.eContents().get(1);
		private final Keyword cOverKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cProtocolAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final CrossReference cProtocolProtocolCrossReference_6_0 = (CrossReference)cProtocolAssignment_6.eContents().get(0);
		private final RuleCall cProtocolProtocolIDTerminalRuleCall_6_0_1 = (RuleCall)cProtocolProtocolCrossReference_6_0.eContents().get(1);
		private final Assignment cAnnotationsAssignment_7 = (Assignment)cGroup.eContents().get(7);
		private final RuleCall cAnnotationsPlatformAnnotationParserRuleCall_7_0 = (RuleCall)cAnnotationsAssignment_7.eContents().get(0);
		
		//ExternalConnector:
		//	'connector' name=ID? inst=[Instance] '.' port=[Port] 'over' protocol=[Protocol] annotations+=PlatformAnnotation*;
		@Override public ParserRule getRule() { return rule; }
		
		//'connector' name=ID? inst=[Instance] '.' port=[Port] 'over' protocol=[Protocol] annotations+=PlatformAnnotation*
		public Group getGroup() { return cGroup; }
		
		//'connector'
		public Keyword getConnectorKeyword_0() { return cConnectorKeyword_0; }
		
		//name=ID?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//inst=[Instance]
		public Assignment getInstAssignment_2() { return cInstAssignment_2; }
		
		//[Instance]
		public CrossReference getInstInstanceCrossReference_2_0() { return cInstInstanceCrossReference_2_0; }
		
		//ID
		public RuleCall getInstInstanceIDTerminalRuleCall_2_0_1() { return cInstInstanceIDTerminalRuleCall_2_0_1; }
		
		//'.'
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }
		
		//port=[Port]
		public Assignment getPortAssignment_4() { return cPortAssignment_4; }
		
		//[Port]
		public CrossReference getPortPortCrossReference_4_0() { return cPortPortCrossReference_4_0; }
		
		//ID
		public RuleCall getPortPortIDTerminalRuleCall_4_0_1() { return cPortPortIDTerminalRuleCall_4_0_1; }
		
		//'over'
		public Keyword getOverKeyword_5() { return cOverKeyword_5; }
		
		//protocol=[Protocol]
		public Assignment getProtocolAssignment_6() { return cProtocolAssignment_6; }
		
		//[Protocol]
		public CrossReference getProtocolProtocolCrossReference_6_0() { return cProtocolProtocolCrossReference_6_0; }
		
		//ID
		public RuleCall getProtocolProtocolIDTerminalRuleCall_6_0_1() { return cProtocolProtocolIDTerminalRuleCall_6_0_1; }
		
		//annotations+=PlatformAnnotation*
		public Assignment getAnnotationsAssignment_7() { return cAnnotationsAssignment_7; }
		
		//PlatformAnnotation
		public RuleCall getAnnotationsPlatformAnnotationParserRuleCall_7_0() { return cAnnotationsPlatformAnnotationParserRuleCall_7_0; }
	}
	
	
	private final AiotMLModelElements pAiotMLModel;
	private final TemplateElements pTemplate;
	private final ImportElements pImport;
	private final PlatformAnnotationElements pPlatformAnnotation;
	private final NamedElementElements pNamedElement;
	private final AnnotatedElementElements pAnnotatedElement;
	private final VariableElements pVariable;
	private final TypeRefElements pTypeRef;
	private final TypeElements pType;
	private final PrimitiveTypeElements pPrimitiveType;
	private final ObjectTypeElements pObjectType;
	private final EnumerationElements pEnumeration;
	private final EnumerationLiteralElements pEnumerationLiteral;
	private final TensorElements pTensor;
	private final LayerElements pLayer;
	private final ModelElements pModel;
	private final ModelReferenceElements pModelReference;
	private final StrategyElements pStrategy;
	private final MultiAgentElements pMultiAgent;
	private final MultiAgentPropertyElements pMultiAgentProperty;
	private final StrategyPropertyElements pStrategyProperty;
	private final StrategyAssignmentElements pStrategyAssignment;
	private final ThingElements pThing;
	private final SubThingElements pSubThing;
	private final AgentElements pAgent;
	private final CpropertyElements pCproperty;
	private final PropertyAssignElements pPropertyAssign;
	private final ProtocolElements pProtocol;
	private final FunctionElements pFunction;
	private final AbstractFunctionElements pAbstractFunction;
	private final PropertyElements pProperty;
	private final MessageElements pMessage;
	private final ParameterElements pParameter;
	private final PortElements pPort;
	private final RequiredPortElements pRequiredPort;
	private final ProvidedPortElements pProvidedPort;
	private final InternalPortElements pInternalPort;
	private final StateElements pState;
	private final HandlerElements pHandler;
	private final TransitionElements pTransition;
	private final InternalTransitionElements pInternalTransition;
	private final CompositeStateElements pCompositeState;
	private final StateMachineElements pStateMachine;
	private final SessionElements pSession;
	private final RegionElements pRegion;
	private final FinalStateElements pFinalState;
	private final StateContainerElements pStateContainer;
	private final EventElements pEvent;
	private final ReceiveMessageElements pReceiveMessage;
	private final ActionElements pAction;
	private final ActionBlockElements pActionBlock;
	private final ExternStatementElements pExternStatement;
	private final LocalVariableElements pLocalVariable;
	private final SendActionElements pSendAction;
	private final VariableAssignmentElements pVariableAssignment;
	private final CpropertyAssignmentElements pCpropertyAssignment;
	private final StrategyStreamElements pStrategyStream;
	private final DictAssignmentElements pDictAssignment;
	private final ZipEnumerateElements pZipEnumerate;
	private final AppendElements pAppend;
	private final IncrementElements pIncrement;
	private final DecrementElements pDecrement;
	private final ForActionElements pForAction;
	private final PyforActionElements pPyforAction;
	private final LoopActionElements pLoopAction;
	private final ConditionalActionElements pConditionalAction;
	private final ReturnActionElements pReturnAction;
	private final PrintActionElements pPrintAction;
	private final ErrorActionElements pErrorAction;
	private final StartSessionElements pStartSession;
	private final FunctionCallStatementElements pFunctionCallStatement;
	private final ExpressionElements pExpression;
	private final OrExpressionElements pOrExpression;
	private final AndExpressionElements pAndExpression;
	private final EqualityElements pEquality;
	private final ComparaisonElements pComparaison;
	private final AdditionElements pAddition;
	private final MultiplicationElements pMultiplication;
	private final CastExpressionElements pCastExpression;
	private final PrimaryElements pPrimary;
	private final ArrayIndexPostfixElements pArrayIndexPostfix;
	private final AtomicExpressionElements pAtomicExpression;
	private final ExternExpressionElements pExternExpression;
	private final LiteralElements pLiteral;
	private final ArrayInitElements pArrayInit;
	private final EnumLiteralRefElements pEnumLiteralRef;
	private final ByteLiteralElements pByteLiteral;
	private final CharLiteralElements pCharLiteral;
	private final IntegerLiteralElements pIntegerLiteral;
	private final BooleanLiteralElements pBooleanLiteral;
	private final StringLiteralElements pStringLiteral;
	private final DoubleLiteralElements pDoubleLiteral;
	private final PropertyReferenceElements pPropertyReference;
	private final CpropertyReferenceElements pCpropertyReference;
	private final EventReferenceElements pEventReference;
	private final FunctionCallExpressionElements pFunctionCallExpression;
	private final ConfigurationElements pConfiguration;
	private final InstanceElements pInstance;
	private final ConfigPropertyAssignElements pConfigPropertyAssign;
	private final AbstractConnectorElements pAbstractConnector;
	private final ConnectorElements pConnector;
	private final ExternalConnectorElements pExternalConnector;
	private final TerminalRule tID;
	private final TerminalRule tBYTE;
	private final TerminalRule tCHAR;
	private final TerminalRule tINT;
	private final TerminalRule tFLOAT;
	private final TerminalRule tANNOTATION_ID;
	private final TerminalRule tSTRING;
	private final TerminalRule tEXTERN;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tWS;
	private final TerminalRule tANY_OTHER;
	
	private final Grammar grammar;

	@Inject
	public AiotMLGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pAiotMLModel = new AiotMLModelElements();
		this.pTemplate = new TemplateElements();
		this.pImport = new ImportElements();
		this.pPlatformAnnotation = new PlatformAnnotationElements();
		this.pNamedElement = new NamedElementElements();
		this.pAnnotatedElement = new AnnotatedElementElements();
		this.pVariable = new VariableElements();
		this.pTypeRef = new TypeRefElements();
		this.pType = new TypeElements();
		this.pPrimitiveType = new PrimitiveTypeElements();
		this.pObjectType = new ObjectTypeElements();
		this.pEnumeration = new EnumerationElements();
		this.pEnumerationLiteral = new EnumerationLiteralElements();
		this.pTensor = new TensorElements();
		this.pLayer = new LayerElements();
		this.pModel = new ModelElements();
		this.pModelReference = new ModelReferenceElements();
		this.pStrategy = new StrategyElements();
		this.pMultiAgent = new MultiAgentElements();
		this.pMultiAgentProperty = new MultiAgentPropertyElements();
		this.pStrategyProperty = new StrategyPropertyElements();
		this.pStrategyAssignment = new StrategyAssignmentElements();
		this.pThing = new ThingElements();
		this.pSubThing = new SubThingElements();
		this.pAgent = new AgentElements();
		this.pCproperty = new CpropertyElements();
		this.pPropertyAssign = new PropertyAssignElements();
		this.pProtocol = new ProtocolElements();
		this.pFunction = new FunctionElements();
		this.pAbstractFunction = new AbstractFunctionElements();
		this.pProperty = new PropertyElements();
		this.pMessage = new MessageElements();
		this.pParameter = new ParameterElements();
		this.pPort = new PortElements();
		this.pRequiredPort = new RequiredPortElements();
		this.pProvidedPort = new ProvidedPortElements();
		this.pInternalPort = new InternalPortElements();
		this.pState = new StateElements();
		this.pHandler = new HandlerElements();
		this.pTransition = new TransitionElements();
		this.pInternalTransition = new InternalTransitionElements();
		this.pCompositeState = new CompositeStateElements();
		this.pStateMachine = new StateMachineElements();
		this.pSession = new SessionElements();
		this.pRegion = new RegionElements();
		this.pFinalState = new FinalStateElements();
		this.pStateContainer = new StateContainerElements();
		this.pEvent = new EventElements();
		this.pReceiveMessage = new ReceiveMessageElements();
		this.pAction = new ActionElements();
		this.pActionBlock = new ActionBlockElements();
		this.pExternStatement = new ExternStatementElements();
		this.pLocalVariable = new LocalVariableElements();
		this.pSendAction = new SendActionElements();
		this.pVariableAssignment = new VariableAssignmentElements();
		this.pCpropertyAssignment = new CpropertyAssignmentElements();
		this.pStrategyStream = new StrategyStreamElements();
		this.pDictAssignment = new DictAssignmentElements();
		this.pZipEnumerate = new ZipEnumerateElements();
		this.pAppend = new AppendElements();
		this.pIncrement = new IncrementElements();
		this.pDecrement = new DecrementElements();
		this.pForAction = new ForActionElements();
		this.pPyforAction = new PyforActionElements();
		this.pLoopAction = new LoopActionElements();
		this.pConditionalAction = new ConditionalActionElements();
		this.pReturnAction = new ReturnActionElements();
		this.pPrintAction = new PrintActionElements();
		this.pErrorAction = new ErrorActionElements();
		this.pStartSession = new StartSessionElements();
		this.pFunctionCallStatement = new FunctionCallStatementElements();
		this.pExpression = new ExpressionElements();
		this.pOrExpression = new OrExpressionElements();
		this.pAndExpression = new AndExpressionElements();
		this.pEquality = new EqualityElements();
		this.pComparaison = new ComparaisonElements();
		this.pAddition = new AdditionElements();
		this.pMultiplication = new MultiplicationElements();
		this.pCastExpression = new CastExpressionElements();
		this.pPrimary = new PrimaryElements();
		this.pArrayIndexPostfix = new ArrayIndexPostfixElements();
		this.pAtomicExpression = new AtomicExpressionElements();
		this.pExternExpression = new ExternExpressionElements();
		this.pLiteral = new LiteralElements();
		this.pArrayInit = new ArrayInitElements();
		this.pEnumLiteralRef = new EnumLiteralRefElements();
		this.pByteLiteral = new ByteLiteralElements();
		this.pCharLiteral = new CharLiteralElements();
		this.pIntegerLiteral = new IntegerLiteralElements();
		this.pBooleanLiteral = new BooleanLiteralElements();
		this.pStringLiteral = new StringLiteralElements();
		this.pDoubleLiteral = new DoubleLiteralElements();
		this.pPropertyReference = new PropertyReferenceElements();
		this.pCpropertyReference = new CpropertyReferenceElements();
		this.pEventReference = new EventReferenceElements();
		this.pFunctionCallExpression = new FunctionCallExpressionElements();
		this.pConfiguration = new ConfigurationElements();
		this.pInstance = new InstanceElements();
		this.pConfigPropertyAssign = new ConfigPropertyAssignElements();
		this.pAbstractConnector = new AbstractConnectorElements();
		this.pConnector = new ConnectorElements();
		this.pExternalConnector = new ExternalConnectorElements();
		this.tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ID");
		this.tBYTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.BYTE");
		this.tCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.CHAR");
		this.tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.INT");
		this.tFLOAT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.FLOAT");
		this.tANNOTATION_ID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ANNOTATION_ID");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.STRING");
		this.tEXTERN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.EXTERN");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.SL_COMMENT");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.WS");
		this.tANY_OTHER = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "org.aiotml.xtext.AiotML.ANY_OTHER");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.aiotml.xtext.AiotML".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//AiotMLModel:
	//	imports+=Import*
	//	templates+=Template* (types+=Type | protocols+=Protocol | configs+=Configuration)*;
	public AiotMLModelElements getAiotMLModelAccess() {
		return pAiotMLModel;
	}
	
	public ParserRule getAiotMLModelRule() {
		return getAiotMLModelAccess().getRule();
	}
	
	//Template:
	//	"template" path=STRING;
	public TemplateElements getTemplateAccess() {
		return pTemplate;
	}
	
	public ParserRule getTemplateRule() {
		return getTemplateAccess().getRule();
	}
	
	//Import:
	//	"import" importURI=STRING ("from" from=ID)?;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//PlatformAnnotation:
	//	name=ANNOTATION_ID (value=EXTERN | value=STRING)?;
	public PlatformAnnotationElements getPlatformAnnotationAccess() {
		return pPlatformAnnotation;
	}
	
	public ParserRule getPlatformAnnotationRule() {
		return getPlatformAnnotationAccess().getRule();
	}
	
	//NamedElement:
	//	Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | Variable | Instance |
	//	AbstractConnector | EnumerationLiteral | Event | Cproperty | StrategyProperty | ModelReference |
	//	";" name=ID // This is never used, it is just to have the attributes in the superclass
	//;
	public NamedElementElements getNamedElementAccess() {
		return pNamedElement;
	}
	
	public ParserRule getNamedElementRule() {
		return getNamedElementAccess().getRule();
	}
	
	//AnnotatedElement:
	//	Protocol | Function | Message | Port | Configuration | Handler | State | StateContainer | Type | PropertyAssign |
	//	Variable | Instance | AbstractConnector | EnumerationLiteral |
	//	";" annotations+=PlatformAnnotation* // This is never used, it is just to have the attributes in the superclass
	//;
	public AnnotatedElementElements getAnnotatedElementAccess() {
		return pAnnotatedElement;
	}
	
	public ParserRule getAnnotatedElementRule() {
		return getAnnotatedElementAccess().getRule();
	}
	
	//Variable:
	//	"var" name=ID ':' typeRef=TypeRef | tensor=Tensor | LocalVariable | Property | Parameter | Cproperty |
	//	StrategyProperty | MultiAgentProperty;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	////ReferInstance:
	////	
	////;
	///*****************************************************************************
	// *       TYPES / ENUMERATIONS                                                *
	// *****************************************************************************/ TypeRef:
	//	type=[Type] (^isArray?='[' cardinality=(IntegerLiteral | PropertyReference)? ']')?;
	public TypeRefElements getTypeRefAccess() {
		return pTypeRef;
	}
	
	public ParserRule getTypeRefRule() {
		return getTypeRefAccess().getRule();
	}
	
	//Type:
	//	PrimitiveType | ObjectType | Enumeration | Thing | SubThing | Model | Strategy | MultiAgent;
	public TypeElements getTypeAccess() {
		return pType;
	}
	
	public ParserRule getTypeRule() {
		return getTypeAccess().getRule();
	}
	
	//PrimitiveType:
	//	'datatype' name=ID => '<' ByteSize=INT '>' annotations+=PlatformAnnotation* ';'?;
	public PrimitiveTypeElements getPrimitiveTypeAccess() {
		return pPrimitiveType;
	}
	
	public ParserRule getPrimitiveTypeRule() {
		return getPrimitiveTypeAccess().getRule();
	}
	
	//ObjectType:
	//	'object' name=ID annotations+=PlatformAnnotation* ';'?;
	public ObjectTypeElements getObjectTypeAccess() {
		return pObjectType;
	}
	
	public ParserRule getObjectTypeRule() {
		return getObjectTypeAccess().getRule();
	}
	
	//Enumeration:
	//	'enumeration' name=ID (=> 'as' typeRef=TypeRef)? annotations+=PlatformAnnotation* '{' literals+=EnumerationLiteral*
	//	'}';
	public EnumerationElements getEnumerationAccess() {
		return pEnumeration;
	}
	
	public ParserRule getEnumerationRule() {
		return getEnumerationAccess().getRule();
	}
	
	//EnumerationLiteral:
	//	name=ID ('=' init=Literal)? annotations+=PlatformAnnotation*;
	public EnumerationLiteralElements getEnumerationLiteralAccess() {
		return pEnumerationLiteral;
	}
	
	public ParserRule getEnumerationLiteralRule() {
		return getEnumerationLiteralAccess().getRule();
	}
	
	//Tensor:
	//	'tensor' '(' 'dim' '=' '(' dims+=IntegerLiteral ("," dims+=IntegerLiteral)* ')' ("," datatype=ID)? ')';
	public TensorElements getTensorAccess() {
		return pTensor;
	}
	
	public ParserRule getTensorRule() {
		return getTensorAccess().getRule();
	}
	
	///*****************************************************************************
	// *       THING / COMPONENT MODEL                                             *
	// *****************************************************************************/ Layer:
	//	'fully_connected' ':' 'dim' '=' '(' (layernums+=IntegerLiteral (',' layernums+=IntegerLiteral)* | num='None') ')' ','
	//	'af' '=' af=('relu' | 'sigmoid' | 'None');
	public LayerElements getLayerAccess() {
		return pLayer;
	}
	
	public ParserRule getLayerRule() {
		return getLayerAccess().getRule();
	}
	
	//Model:
	//	'mlp' name=ID '{'
	//	'input' ('->>' layers+=Layer)*
	//	'}';
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//ModelReference:
	//	'using' 'mlp' name=ID ':' typeRef=TypeRef;
	public ModelReferenceElements getModelReferenceAccess() {
		return pModelReference;
	}
	
	public ParserRule getModelReferenceRule() {
		return getModelReferenceAccess().getRule();
	}
	
	//Strategy:
	//	'model' name=ID '{' ('input' ':' tensor=Tensor |
	//	'output' ':' tensor=Tensor |
	//	'device' ':' '{' devices+=Cproperty* '}' |
	//	'reward' ':' tensor=Tensor |
	//	'rewards' ':' 'dim' '=' '(' (rewdims+=IntegerLiteral (',' rewdims+=IntegerLiteral)*)? ')' |
	//	'observation' ':' 'dim' '=' '(' (obsdims+=IntegerLiteral (',' obsdims+=IntegerLiteral)*)? ')' |
	//	'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral (',' actiondims+=IntegerLiteral)* ')' |
	//	'p_function' ':' pmodel=ModelReference |
	//	'q_function' ':' qmodel=ModelReference)*
	//	'}' annotations+=PlatformAnnotation*;
	public StrategyElements getStrategyAccess() {
		return pStrategy;
	}
	
	public ParserRule getStrategyRule() {
		return getStrategyAccess().getRule();
	}
	
	//MultiAgent:
	//	'strategy' name=ID '{'
	//	agents+=Agent*
	//	//'agent' 'model' name = ID amodel = StrategyProperty
	//	'}' annotations+=PlatformAnnotation*;
	public MultiAgentElements getMultiAgentAccess() {
		return pMultiAgent;
	}
	
	public ParserRule getMultiAgentRule() {
		return getMultiAgentAccess().getRule();
	}
	
	//MultiAgentProperty:
	//	'using' 'strategy' name=ID ':' typeRef=TypeRef;
	public MultiAgentPropertyElements getMultiAgentPropertyAccess() {
		return pMultiAgentProperty;
	}
	
	public ParserRule getMultiAgentPropertyRule() {
		return getMultiAgentPropertyAccess().getRule();
	}
	
	//StrategyProperty:
	//	'using' 'model' name=ID ':' typeRef=TypeRef;
	public StrategyPropertyElements getStrategyPropertyAccess() {
		return pStrategyProperty;
	}
	
	public ParserRule getStrategyPropertyRule() {
		return getStrategyPropertyAccess().getRule();
	}
	
	//StrategyAssignment:
	//	'bind' strategy=[Variable] '.' agent=[Agent] '.' ('reward' '=' rbindFunction=[Property] | 'input' '='
	//	ibindFunction=[Property] | 'output' '=' obindFunction=[Property]);
	public StrategyAssignmentElements getStrategyAssignmentAccess() {
		return pStrategyAssignment;
	}
	
	public ParserRule getStrategyAssignmentRule() {
		return getStrategyAssignmentAccess().getRule();
	}
	
	//Thing:
	//	'thing' ^fragment?='fragment'? name=ID ('includes' includes+=[Thing] ("," includes+=[Thing])*)?
	//	annotations+=PlatformAnnotation* '{' (messages+=Message | ports+=Port | properties+=Property | cproperties+=Cproperty
	//	| functions+=Function | assign+=PropertyAssign
	//	| strategys+=StrategyProperty | sassigns+=StrategyAssignment | mas+=MultiAgentProperty /* | streams+=Stream*/)*
	//	behaviour=StateMachine?
	//	'}';
	public ThingElements getThingAccess() {
		return pThing;
	}
	
	public ParserRule getThingRule() {
		return getThingAccess().getRule();
	}
	
	//SubThing:
	//	'subthing' name=ID '{' (properties+=Property | functions+=Function)*
	//	'}';
	public SubThingElements getSubThingAccess() {
		return pSubThing;
	}
	
	public ParserRule getSubThingRule() {
		return getSubThingAccess().getRule();
	}
	
	//Agent:
	//	'agent' name=ID ('[' cardinality=IntegerLiteral? ']')? amodel=StrategyProperty;
	public AgentElements getAgentAccess() {
		return pAgent;
	}
	
	public ParserRule getAgentRule() {
		return getAgentAccess().getRule();
	}
	
	//Cproperty:
	//	'cproperty' name=ID ':' (typeRef=TypeRef | tensor=Tensor) annotations+=PlatformAnnotation*;
	public CpropertyElements getCpropertyAccess() {
		return pCproperty;
	}
	
	public ParserRule getCpropertyRule() {
		return getCpropertyAccess().getRule();
	}
	
	//PropertyAssign:
	//	'set' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression annotations+=PlatformAnnotation*;
	public PropertyAssignElements getPropertyAssignAccess() {
		return pPropertyAssign;
	}
	
	public ParserRule getPropertyAssignRule() {
		return getPropertyAssignAccess().getRule();
	}
	
	//Protocol:
	//	'protocol' name=ID annotations+=PlatformAnnotation* ';'?;
	public ProtocolElements getProtocolAccess() {
		return pProtocol;
	}
	
	public ParserRule getProtocolRule() {
		return getProtocolAccess().getRule();
	}
	
	//Function:
	//	'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':' typeRef=TypeRef)? (','
	//	extraTypeRef+=TypeRef)*
	//	annotations+=PlatformAnnotation* body=Action | AbstractFunction;
	public FunctionElements getFunctionAccess() {
		return pFunction;
	}
	
	public ParserRule getFunctionRule() {
		return getFunctionAccess().getRule();
	}
	
	//AbstractFunction Function:
	//	abstract?='abstract' 'function' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')' (':'
	//	typeRef=TypeRef)?
	//	annotations+=PlatformAnnotation*;
	public AbstractFunctionElements getAbstractFunctionAccess() {
		return pAbstractFunction;
	}
	
	public ParserRule getAbstractFunctionRule() {
		return getAbstractFunctionAccess().getRule();
	}
	
	//Property:
	//	readonly?='readonly'? 'property' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
	//	annotations+=PlatformAnnotation*;
	public PropertyElements getPropertyAccess() {
		return pProperty;
	}
	
	public ParserRule getPropertyRule() {
		return getPropertyAccess().getRule();
	}
	
	//Message:
	//	'message' name=ID '(' (parameters+=Parameter ("," parameters+=Parameter)*)? ')'
	//	annotations+=PlatformAnnotation* ';'?;
	public MessageElements getMessageAccess() {
		return pMessage;
	}
	
	public ParserRule getMessageRule() {
		return getMessageAccess().getRule();
	}
	
	//Parameter:
	//	name=ID ':' typeRef=TypeRef annotations+=PlatformAnnotation*;
	public ParameterElements getParameterAccess() {
		return pParameter;
	}
	
	public ParserRule getParameterRule() {
		return getParameterAccess().getRule();
	}
	
	//Port:
	//	RequiredPort | ProvidedPort | InternalPort;
	public PortElements getPortAccess() {
		return pPort;
	}
	
	public ParserRule getPortRule() {
		return getPortAccess().getRule();
	}
	
	//RequiredPort:
	//	optional?='optional'? 'required' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] (","
	//	sends+=[Message])* | 'receives' receives+=[Message] ("," receives+=[Message])*)*
	//	'}';
	public RequiredPortElements getRequiredPortAccess() {
		return pRequiredPort;
	}
	
	public ParserRule getRequiredPortRule() {
		return getRequiredPortAccess().getRule();
	}
	
	//ProvidedPort:
	//	'provided' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
	//	'receives' receives+=[Message] ("," receives+=[Message])*)*
	//	'}';
	public ProvidedPortElements getProvidedPortAccess() {
		return pProvidedPort;
	}
	
	public ParserRule getProvidedPortRule() {
		return getProvidedPortAccess().getRule();
	}
	
	//InternalPort:
	//	'internal' 'port' name=ID annotations+=PlatformAnnotation* '{' ('sends' sends+=[Message] ("," sends+=[Message])* |
	//	'receives' receives+=[Message] ("," receives+=[Message])*)*
	//	'}';
	public InternalPortElements getInternalPortAccess() {
		return pInternalPort;
	}
	
	public ParserRule getInternalPortRule() {
		return getInternalPortAccess().getRule();
	}
	
	///*****************************************************************************
	// *       STATE MECHINES                                                      *
	// *****************************************************************************/ State:
	//	StateMachine | FinalState | CompositeState |
	//	'state' name=ID annotations+=PlatformAnnotation* '{'
	//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
	//	internal+=InternalTransition | outgoing+=Transition)*)
	//	'}';
	public StateElements getStateAccess() {
		return pState;
	}
	
	public ParserRule getStateRule() {
		return getStateAccess().getRule();
	}
	
	//Handler:
	//	Transition | InternalTransition;
	public HandlerElements getHandlerAccess() {
		return pHandler;
	}
	
	public ParserRule getHandlerRule() {
		return getHandlerAccess().getRule();
	}
	
	//Transition:
	//	'transition' name=ID? '->' target=[State] annotations+=PlatformAnnotation* ('event' event=Event)? ('guard'
	//	guard=Expression)? ('action' action=Action)?;
	public TransitionElements getTransitionAccess() {
		return pTransition;
	}
	
	public ParserRule getTransitionRule() {
		return getTransitionAccess().getRule();
	}
	
	//InternalTransition:
	//	{InternalTransition}
	//	'internal' name=ID?
	//	annotations+=PlatformAnnotation* ('event' event=Event)? ('guard' guard=Expression)? ('action' action=Action)?;
	public InternalTransitionElements getInternalTransitionAccess() {
		return pInternalTransition;
	}
	
	public ParserRule getInternalTransitionRule() {
		return getInternalTransitionAccess().getRule();
	}
	
	//CompositeState:
	//	'composite' 'state' name=ID 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
	//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
	//	substate+=State | internal+=InternalTransition | outgoing+=Transition)*) (region+=Region | session+=Session)*
	//	'}';
	public CompositeStateElements getCompositeStateAccess() {
		return pCompositeState;
	}
	
	public ParserRule getCompositeStateRule() {
		return getCompositeStateAccess().getRule();
	}
	
	//StateMachine CompositeState: // Actually only another syntax for a composite state
	//	'statechart' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
	//	properties+=Property* (('on' 'entry' entry=Action)? & ('on' 'exit' exit=Action)? & (properties+=Property |
	//	substate+=State | internal+=InternalTransition)*) (region+=Region | session+=Session)* '}';
	public StateMachineElements getStateMachineAccess() {
		return pStateMachine;
	}
	
	public ParserRule getStateMachineRule() {
		return getStateMachineAccess().getRule();
	}
	
	//Session:
	//	'session' name=ID ('<' maxInstances=(IntegerLiteral | PropertyReference) '>')? 'init' initial=[State]
	//	annotations+=PlatformAnnotation* '{'
	//	substate+=State*
	//	'}';
	public SessionElements getSessionAccess() {
		return pSession;
	}
	
	public ParserRule getSessionRule() {
		return getSessionAccess().getRule();
	}
	
	//Region:
	//	'region' name=ID? 'init' initial=[State] ('keeps' history?='history')? annotations+=PlatformAnnotation* '{'
	//	substate+=State*
	//	'}';
	public RegionElements getRegionAccess() {
		return pRegion;
	}
	
	public ParserRule getRegionRule() {
		return getRegionAccess().getRule();
	}
	
	//FinalState:
	//	'final' 'state' name=ID annotations+=PlatformAnnotation* '{' ('on' 'entry' entry=Action)? '}';
	public FinalStateElements getFinalStateAccess() {
		return pFinalState;
	}
	
	public ParserRule getFinalStateRule() {
		return getFinalStateAccess().getRule();
	}
	
	//StateContainer:
	//	CompositeState | Region | Session |
	//	'keeps' initial=[State] ('keeps' history?='history')? '{' // This is never used, it is just to have the attributes in the superclass
	//	substate+=State*
	//	'}';
	public StateContainerElements getStateContainerAccess() {
		return pStateContainer;
	}
	
	public ParserRule getStateContainerRule() {
		return getStateContainerAccess().getRule();
	}
	
	///*****************************************************************************
	// *       EVENTS                                                             *
	// *****************************************************************************/ Event:
	//	ReceiveMessage;
	public EventElements getEventAccess() {
		return pEvent;
	}
	
	public ParserRule getEventRule() {
		return getEventAccess().getRule();
	}
	
	//ReceiveMessage:
	//	(name=ID ":")? port=[Port] '?' message=[Message];
	public ReceiveMessageElements getReceiveMessageAccess() {
		return pReceiveMessage;
	}
	
	public ParserRule getReceiveMessageRule() {
		return getReceiveMessageAccess().getRule();
	}
	
	///*****************************************************************************
	// *       ACTIONS                                                             *
	// *****************************************************************************/ Action:
	//	ActionBlock | ExternStatement | SendAction | VariableAssignment | Increment | Decrement | LoopAction | ForAction |
	//	PyforAction | Append | DictAssignment | ConditionalAction | ReturnAction | PrintAction | ErrorAction | StartSession |
	//	FunctionCallStatement | LocalVariable | CpropertyAssignment | StrategyStream | ZipEnumerate;
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}
	
	//ActionBlock:
	//	{ActionBlock}
	//	'do' actions+=Action* 'end';
	public ActionBlockElements getActionBlockAccess() {
		return pActionBlock;
	}
	
	public ParserRule getActionBlockRule() {
		return getActionBlockAccess().getRule();
	}
	
	//ExternStatement:
	//	statement=EXTERN ('&' segments+=Expression)*;
	public ExternStatementElements getExternStatementAccess() {
		return pExternStatement;
	}
	
	public ParserRule getExternStatementRule() {
		return getExternStatementAccess().getRule();
	}
	
	//LocalVariable:
	//	readonly?='readonly'? 'var' name=ID ':' (typeRef=TypeRef ('=' init=Expression)? | tensor=Tensor)
	//	annotations+=PlatformAnnotation*;
	public LocalVariableElements getLocalVariableAccess() {
		return pLocalVariable;
	}
	
	public ParserRule getLocalVariableRule() {
		return getLocalVariableAccess().getRule();
	}
	
	//SendAction:
	//	port=[Port] '!' message=[Message] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')';
	public SendActionElements getSendActionAccess() {
		return pSendAction;
	}
	
	public ParserRule getSendActionRule() {
		return getSendActionAccess().getRule();
	}
	
	//VariableAssignment:
	//	property=[Variable] (=> '[' index=Expression ']')? (',' extraProperty+=[Variable] (=> '[' extraIndex+=Expression
	//	']')?)* '=' expression=Expression;
	public VariableAssignmentElements getVariableAssignmentAccess() {
		return pVariableAssignment;
	}
	
	public ParserRule getVariableAssignmentRule() {
		return getVariableAssignmentAccess().getRule();
	}
	
	//CpropertyAssignment: //	cproperty=[Variable|ID] '.' (cpropertys = [Variable|ID])'=' expression=Expression; 
	//	'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
	//	']')?)? '=' expression=Expression;
	public CpropertyAssignmentElements getCpropertyAssignmentAccess() {
		return pCpropertyAssignment;
	}
	
	public ParserRule getCpropertyAssignmentRule() {
		return getCpropertyAssignmentAccess().getRule();
	}
	
	////	'assign' cpropertys+=[Variable|ID] (=>'[' index+=Expression ']')? ('#>' cpropertys+= [Variable|ID] (=>'[' index+=Expression ']')?)* '=' expression=Expression;
	//StrategyStream:
	//	'stream' inputs+=[Variable] (',' inputs+=[Variable])* '>>' strategy=[Variable] '>>' outputs+=[Variable] (','
	//	outputs+=[Variable])*;
	public StrategyStreamElements getStrategyStreamAccess() {
		return pStrategyStream;
	}
	
	public ParserRule getStrategyStreamRule() {
		return getStrategyStreamAccess().getRule();
	}
	
	//DictAssignment:
	//	dict=[Variable] ('[' elements+=[Variable] ']')* '=' var=[Variable];
	public DictAssignmentElements getDictAssignmentAccess() {
		return pDictAssignment;
	}
	
	public ParserRule getDictAssignmentRule() {
		return getDictAssignmentAccess().getRule();
	}
	
	//ZipEnumerate:
	//	'for' vars+=[Variable] (',' vars+=[Variable])* 'in' fname=('zip' | 'enumerate') '(' sets+=[Variable] (','
	//	sets+=[Variable])* ')' action=Action;
	public ZipEnumerateElements getZipEnumerateAccess() {
		return pZipEnumerate;
	}
	
	public ParserRule getZipEnumerateRule() {
		return getZipEnumerateAccess().getRule();
	}
	
	//Append:
	//	pythonlist=[Variable] '.' 'append' '(' element=Expression ')';
	public AppendElements getAppendAccess() {
		return pAppend;
	}
	
	public ParserRule getAppendRule() {
		return getAppendAccess().getRule();
	}
	
	////cpropertyAssignment_Cpropertys
	//Increment:
	//	var=[Variable] '++';
	public IncrementElements getIncrementAccess() {
		return pIncrement;
	}
	
	public ParserRule getIncrementRule() {
		return getIncrementAccess().getRule();
	}
	
	//Decrement:
	//	var=[Variable] '--';
	public DecrementElements getDecrementAccess() {
		return pDecrement;
	}
	
	public ParserRule getDecrementRule() {
		return getDecrementAccess().getRule();
	}
	
	//ForAction:
	//	'for' '(' variable=Parameter (',' index=Parameter)? 'in' array=PropertyReference ')' action=Action;
	public ForActionElements getForActionAccess() {
		return pForAction;
	}
	
	public ParserRule getForActionRule() {
		return getForActionAccess().getRule();
	}
	
	//PyforAction:
	//	'exfor' '(' variables+=Parameter (',' variables+=Parameter)* 'in' arrays+=PropertyReference (','
	//	arrays+=PropertyReference)* ')' action=Action;
	public PyforActionElements getPyforActionAccess() {
		return pPyforAction;
	}
	
	public ParserRule getPyforActionRule() {
		return getPyforActionAccess().getRule();
	}
	
	//LoopAction:
	//	'while' '(' condition=Expression ')' action=Action;
	public LoopActionElements getLoopActionAccess() {
		return pLoopAction;
	}
	
	public ParserRule getLoopActionRule() {
		return getLoopActionAccess().getRule();
	}
	
	//ConditionalAction:
	//	'if' '(' condition=Expression ')' action=Action (=> 'else' elseAction=Action)?;
	public ConditionalActionElements getConditionalActionAccess() {
		return pConditionalAction;
	}
	
	public ParserRule getConditionalActionRule() {
		return getConditionalActionAccess().getRule();
	}
	
	//ReturnAction:
	//	{ReturnAction} 'return' => exp=Expression? (',' extraExp+=Expression)*;
	public ReturnActionElements getReturnActionAccess() {
		return pReturnAction;
	}
	
	public ParserRule getReturnActionRule() {
		return getReturnActionAccess().getRule();
	}
	
	//PrintAction:
	//	('print' | line?='println') msg+=Expression (',' msg+=Expression)*;
	public PrintActionElements getPrintActionAccess() {
		return pPrintAction;
	}
	
	public ParserRule getPrintActionRule() {
		return getPrintActionAccess().getRule();
	}
	
	//ErrorAction:
	//	('error' | line?='errorln') msg+=Expression (',' msg+=Expression)*;
	public ErrorActionElements getErrorActionAccess() {
		return pErrorAction;
	}
	
	public ParserRule getErrorActionRule() {
		return getErrorActionAccess().getRule();
	}
	
	//StartSession:
	//	'fork' session=[Session];
	public StartSessionElements getStartSessionAccess() {
		return pStartSession;
	}
	
	public ParserRule getStartSessionRule() {
		return getStartSessionAccess().getRule();
	}
	
	//FunctionCallStatement:
	//	function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)? ')';
	public FunctionCallStatementElements getFunctionCallStatementAccess() {
		return pFunctionCallStatement;
	}
	
	public ParserRule getFunctionCallStatementRule() {
		return getFunctionCallStatementAccess().getRule();
	}
	
	///*****************************************************************************
	// *       EXPRESSIONS                                                         *
	// *****************************************************************************/ //ExternExpression | EnumLiteralRef | IntegerLiteral | BooleanLiteral | StringLiteral | DoubleLiteral | NotExpression | UnaryMinus | 
	////PlusExpression | MinusExpression | TimesExpression | DivExpression | ModExpression | EqualsExpression | NotEqualsExpression | GreaterExpression | 
	////LowerExpression | GreaterOrEqualExpression | LowerOrEqualExpression | AndExpression | OrExpression | PropertyReference | ArrayIndex | 
	////ExpressionGroup | FunctionCallExpression | MessageParameter | Reference;
	//Expression:
	//	OrExpression;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//OrExpression Expression:
	//	AndExpression ({OrExpression.lhs=current} "or" rhs=AndExpression)*;
	public OrExpressionElements getOrExpressionAccess() {
		return pOrExpression;
	}
	
	public ParserRule getOrExpressionRule() {
		return getOrExpressionAccess().getRule();
	}
	
	//AndExpression Expression:
	//	Equality ({AndExpression.lhs=current} "and" rhs=Equality)*;
	public AndExpressionElements getAndExpressionAccess() {
		return pAndExpression;
	}
	
	public ParserRule getAndExpressionRule() {
		return getAndExpressionAccess().getRule();
	}
	
	//Equality Expression:
	//	Comparaison ({EqualsExpression.lhs=current} "==" rhs=Comparaison | {NotEqualsExpression.lhs=current} "!="
	//	rhs=Comparaison)*;
	public EqualityElements getEqualityAccess() {
		return pEquality;
	}
	
	public ParserRule getEqualityRule() {
		return getEqualityAccess().getRule();
	}
	
	//Comparaison Expression:
	//	Addition ({GreaterExpression.lhs=current} ">" rhs=Addition | {LowerExpression.lhs=current} "<" rhs=Addition |
	//	{GreaterOrEqualExpression.lhs=current} ">=" rhs=Addition | {LowerOrEqualExpression.lhs=current} "<=" rhs=Addition)*;
	public ComparaisonElements getComparaisonAccess() {
		return pComparaison;
	}
	
	public ParserRule getComparaisonRule() {
		return getComparaisonAccess().getRule();
	}
	
	//Addition Expression:
	//	Multiplication ({PlusExpression.lhs=current} "+" rhs=Multiplication | {MinusExpression.lhs=current} "-"
	//	rhs=Multiplication)*;
	public AdditionElements getAdditionAccess() {
		return pAddition;
	}
	
	public ParserRule getAdditionRule() {
		return getAdditionAccess().getRule();
	}
	
	//Multiplication Expression:
	//	CastExpression ({TimesExpression.lhs=current} "*" rhs=CastExpression | {DivExpression.lhs=current} "/"
	//	rhs=CastExpression | {ModExpression.lhs=current} "%" rhs=CastExpression)*;
	public MultiplicationElements getMultiplicationAccess() {
		return pMultiplication;
	}
	
	public ParserRule getMultiplicationRule() {
		return getMultiplicationAccess().getRule();
	}
	
	//CastExpression Expression:
	//	Primary ({CastExpression.term=current} "as" type=[Type] (^isArray?='[' ']')?)?;
	public CastExpressionElements getCastExpressionAccess() {
		return pCastExpression;
	}
	
	public ParserRule getCastExpressionRule() {
		return getCastExpressionAccess().getRule();
	}
	
	//Primary Expression:
	//	{ExpressionGroup} '(' term=Expression ')' | {NotExpression} "not" term=Primary | {UnaryMinus} '-' term=Primary
	//	| ArrayIndexPostfix;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//ArrayIndexPostfix Expression:
	//	AtomicExpression ({ArrayIndex.array=current} '[' index=Expression ']')?;
	public ArrayIndexPostfixElements getArrayIndexPostfixAccess() {
		return pArrayIndexPostfix;
	}
	
	public ParserRule getArrayIndexPostfixRule() {
		return getArrayIndexPostfixAccess().getRule();
	}
	
	//AtomicExpression Expression:
	//	ExternExpression | Literal | ArrayInit | PropertyReference | FunctionCallExpression
	//	| EventReference | CpropertyReference;
	public AtomicExpressionElements getAtomicExpressionAccess() {
		return pAtomicExpression;
	}
	
	public ParserRule getAtomicExpressionRule() {
		return getAtomicExpressionAccess().getRule();
	}
	
	//ExternExpression:
	//	expression=EXTERN ('&' segments+=Expression)*;
	public ExternExpressionElements getExternExpressionAccess() {
		return pExternExpression;
	}
	
	public ParserRule getExternExpressionRule() {
		return getExternExpressionAccess().getRule();
	}
	
	//Literal:
	//	EnumLiteralRef | ByteLiteral | CharLiteral | IntegerLiteral | BooleanLiteral | StringLiteral | DoubleLiteral;
	public LiteralElements getLiteralAccess() {
		return pLiteral;
	}
	
	public ParserRule getLiteralRule() {
		return getLiteralAccess().getRule();
	}
	
	//ArrayInit:
	//	'{' values+=Expression (',' values+=Expression)* '}';
	public ArrayInitElements getArrayInitAccess() {
		return pArrayInit;
	}
	
	public ParserRule getArrayInitRule() {
		return getArrayInitAccess().getRule();
	}
	
	//EnumLiteralRef:
	//	^enum=[Enumeration] ':' literal=[EnumerationLiteral];
	public EnumLiteralRefElements getEnumLiteralRefAccess() {
		return pEnumLiteralRef;
	}
	
	public ParserRule getEnumLiteralRefRule() {
		return getEnumLiteralRefAccess().getRule();
	}
	
	//ByteLiteral:
	//	byteValue=BYTE;
	public ByteLiteralElements getByteLiteralAccess() {
		return pByteLiteral;
	}
	
	public ParserRule getByteLiteralRule() {
		return getByteLiteralAccess().getRule();
	}
	
	//CharLiteral:
	//	charValue=CHAR;
	public CharLiteralElements getCharLiteralAccess() {
		return pCharLiteral;
	}
	
	public ParserRule getCharLiteralRule() {
		return getCharLiteralAccess().getRule();
	}
	
	//IntegerLiteral:
	//	intValue=INT;
	public IntegerLiteralElements getIntegerLiteralAccess() {
		return pIntegerLiteral;
	}
	
	public ParserRule getIntegerLiteralRule() {
		return getIntegerLiteralAccess().getRule();
	}
	
	//BooleanLiteral:
	//	boolValue?='true' | {BooleanLiteral} 'false';
	public BooleanLiteralElements getBooleanLiteralAccess() {
		return pBooleanLiteral;
	}
	
	public ParserRule getBooleanLiteralRule() {
		return getBooleanLiteralAccess().getRule();
	}
	
	//StringLiteral:
	//	stringValue=STRING;
	public StringLiteralElements getStringLiteralAccess() {
		return pStringLiteral;
	}
	
	public ParserRule getStringLiteralRule() {
		return getStringLiteralAccess().getRule();
	}
	
	//DoubleLiteral:
	//	doubleValue=FLOAT;
	public DoubleLiteralElements getDoubleLiteralAccess() {
		return pDoubleLiteral;
	}
	
	public ParserRule getDoubleLiteralRule() {
		return getDoubleLiteralAccess().getRule();
	}
	
	//PropertyReference:
	//	property=[Variable];
	public PropertyReferenceElements getPropertyReferenceAccess() {
		return pPropertyReference;
	}
	
	public ParserRule getPropertyReferenceRule() {
		return getPropertyReferenceAccess().getRule();
	}
	
	////StrategyReferrence returns StrategyReferrence:
	////	strategys += [Variable|ID]  (',' strategys+= [Variable|ID] )* 
	////;
	//CpropertyReference:
	//	'entity' cpropertys+=[Variable] (=> '[' cindex=Expression ']')? ('.' property=[Variable] (=> '[' pindex=Expression
	//	']')?)?
	//	//	cpropertys+=[Variable|ID] (=>'[' index+=Expression ']')? '#>' (cpropertys += [Variable|ID] (=>'[' index+=Expression ']')?'#>')* property = [Variable|ID] (=>'[' index+=Expression ']')?
	//	//	cproperty=[Cproperty|ID] '--' property = [Property|ID]
	//;
	public CpropertyReferenceElements getCpropertyReferenceAccess() {
		return pCpropertyReference;
	}
	
	public ParserRule getCpropertyReferenceRule() {
		return getCpropertyReferenceAccess().getRule();
	}
	
	//EventReference:
	//	receiveMsg=[Event] "." parameter=[Parameter];
	public EventReferenceElements getEventReferenceAccess() {
		return pEventReference;
	}
	
	public ParserRule getEventReferenceRule() {
		return getEventReferenceAccess().getRule();
	}
	
	//FunctionCallExpression:
	//	function=[Function] '(' (parameters+=Expression ("," parameters+=Expression)*)?
	//	')';
	public FunctionCallExpressionElements getFunctionCallExpressionAccess() {
		return pFunctionCallExpression;
	}
	
	public ParserRule getFunctionCallExpressionRule() {
		return getFunctionCallExpressionAccess().getRule();
	}
	
	///*****************************************************************************
	// *       CONFIGURATIONS                                                      *
	// *****************************************************************************/ Configuration:
	//	'configuration' name=ID annotations+=PlatformAnnotation* '{' (instances+=Instance | connectors+=AbstractConnector |
	//	propassigns+=ConfigPropertyAssign)*
	//	'}';
	public ConfigurationElements getConfigurationAccess() {
		return pConfiguration;
	}
	
	public ParserRule getConfigurationRule() {
		return getConfigurationAccess().getRule();
	}
	
	//Instance:
	//	'instance' name=ID ':' type=[Thing] annotations+=PlatformAnnotation*;
	public InstanceElements getInstanceAccess() {
		return pInstance;
	}
	
	public ParserRule getInstanceRule() {
		return getInstanceAccess().getRule();
	}
	
	//ConfigPropertyAssign:
	//	'set' instance=[Instance] '.' property=[Property] (=> '[' index=Expression ']')? '=' init=Expression
	//	annotations+=PlatformAnnotation*;
	public ConfigPropertyAssignElements getConfigPropertyAssignAccess() {
		return pConfigPropertyAssign;
	}
	
	public ParserRule getConfigPropertyAssignRule() {
		return getConfigPropertyAssignAccess().getRule();
	}
	
	//AbstractConnector:
	//	Connector | ExternalConnector;
	public AbstractConnectorElements getAbstractConnectorAccess() {
		return pAbstractConnector;
	}
	
	public ParserRule getAbstractConnectorRule() {
		return getAbstractConnectorAccess().getRule();
	}
	
	//Connector:
	//	'connector' name=ID? cli=[Instance] '.' required=[RequiredPort] '=>' srv=[Instance] '.' provided=[ProvidedPort]
	//	annotations+=PlatformAnnotation*;
	public ConnectorElements getConnectorAccess() {
		return pConnector;
	}
	
	public ParserRule getConnectorRule() {
		return getConnectorAccess().getRule();
	}
	
	//ExternalConnector:
	//	'connector' name=ID? inst=[Instance] '.' port=[Port] 'over' protocol=[Protocol] annotations+=PlatformAnnotation*;
	public ExternalConnectorElements getExternalConnectorAccess() {
		return pExternalConnector;
	}
	
	public ParserRule getExternalConnectorRule() {
		return getExternalConnectorAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return tID;
	}
	
	//terminal BYTE returns ecore::EByte:
	//	"0x" ('0'..'9' | 'a'..'f' | 'A'..'F') ('0'..'9' | 'a'..'f' | 'A'..'F');
	public TerminalRule getBYTERule() {
		return tBYTE;
	}
	
	//terminal CHAR returns ecore::EByte:
	//	"'" ('\\0' | '\\t' | '\\n' | '\\r' | ' '..'&' | '\\\'' | '('..'[' | '\\\\' | ']'..'~') "'";
	public TerminalRule getCHARRule() {
		return tCHAR;
	}
	
	//terminal INT returns ecore::ELong:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return tINT;
	}
	
	//terminal FLOAT returns ecore::EDouble:
	//	'0'..'9'+ '.' '0'..'9'* (('e' | 'E') ('+' | '-')? '0'..'9'+)?
	//	| '.' '0'..'9'+ (('e' | 'E') ('+' | '-')? '0'..'9'+)?
	//	| '0'..'9'+ ('e' | 'E') ('+' | '-')? '0'..'9'+;
	public TerminalRule getFLOATRule() {
		return tFLOAT;
	}
	
	//terminal ANNOTATION_ID:
	//	"@" ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getANNOTATION_IDRule() {
		return tANNOTATION_ID;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"';
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal EXTERN:
	//	'`' ('\\' . | !('\\' | '`'))* '`';
	public TerminalRule getEXTERNRule() {
		return tEXTERN;
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return tANY_OTHER;
	}
}
