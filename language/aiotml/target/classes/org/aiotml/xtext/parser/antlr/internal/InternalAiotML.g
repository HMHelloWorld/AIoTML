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
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.aiotml.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.aiotml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.aiotml.xtext.services.AiotMLGrammarAccess;

}

@parser::members {

 	private AiotMLGrammarAccess grammarAccess;

    public InternalAiotMLParser(TokenStream input, AiotMLGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "AiotMLModel";
   	}

   	@Override
   	protected AiotMLGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleAiotMLModel
entryRuleAiotMLModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAiotMLModelRule()); }
	iv_ruleAiotMLModel=ruleAiotMLModel
	{ $current=$iv_ruleAiotMLModel.current; }
	EOF;

// Rule AiotMLModel
ruleAiotMLModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAiotMLModelAccess().getImportsImportParserRuleCall_0_0());
				}
				lv_imports_0_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAiotMLModelRule());
					}
					add(
						$current,
						"imports",
						lv_imports_0_0,
						"org.aiotml.xtext.AiotML.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getAiotMLModelAccess().getTemplatesTemplateParserRuleCall_1_0());
				}
				lv_templates_1_0=ruleTemplate
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAiotMLModelRule());
					}
					add(
						$current,
						"templates",
						lv_templates_1_0,
						"org.aiotml.xtext.AiotML.Template");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAiotMLModelAccess().getTypesTypeParserRuleCall_2_0_0());
					}
					lv_types_2_0=ruleType
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAiotMLModelRule());
						}
						add(
							$current,
							"types",
							lv_types_2_0,
							"org.aiotml.xtext.AiotML.Type");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAiotMLModelAccess().getProtocolsProtocolParserRuleCall_2_1_0());
					}
					lv_protocols_3_0=ruleProtocol
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAiotMLModelRule());
						}
						add(
							$current,
							"protocols",
							lv_protocols_3_0,
							"org.aiotml.xtext.AiotML.Protocol");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getAiotMLModelAccess().getConfigsConfigurationParserRuleCall_2_2_0());
					}
					lv_configs_4_0=ruleConfiguration
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAiotMLModelRule());
						}
						add(
							$current,
							"configs",
							lv_configs_4_0,
							"org.aiotml.xtext.AiotML.Configuration");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTemplate
entryRuleTemplate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTemplateRule()); }
	iv_ruleTemplate=ruleTemplate
	{ $current=$iv_ruleTemplate.current; }
	EOF;

// Rule Template
ruleTemplate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='template'
		{
			newLeafNode(otherlv_0, grammarAccess.getTemplateAccess().getTemplateKeyword_0());
		}
		(
			(
				lv_path_1_0=RULE_STRING
				{
					newLeafNode(lv_path_1_0, grammarAccess.getTemplateAccess().getPathSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTemplateRule());
					}
					setWithLastConsumed(
						$current,
						"path",
						lv_path_1_0,
						"org.aiotml.xtext.AiotML.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				lv_importURI_1_0=RULE_STRING
				{
					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getImportRule());
					}
					setWithLastConsumed(
						$current,
						"importURI",
						lv_importURI_1_0,
						"org.aiotml.xtext.AiotML.STRING");
				}
			)
		)
		(
			otherlv_2='from'
			{
				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getFromKeyword_2_0());
			}
			(
				(
					lv_from_3_0=RULE_ID
					{
						newLeafNode(lv_from_3_0, grammarAccess.getImportAccess().getFromIDTerminalRuleCall_2_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getImportRule());
						}
						setWithLastConsumed(
							$current,
							"from",
							lv_from_3_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
		)?
	)
;

// Entry rule entryRulePlatformAnnotation
entryRulePlatformAnnotation returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPlatformAnnotationRule()); }
	iv_rulePlatformAnnotation=rulePlatformAnnotation
	{ $current=$iv_rulePlatformAnnotation.current; }
	EOF;

// Rule PlatformAnnotation
rulePlatformAnnotation returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ANNOTATION_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getPlatformAnnotationAccess().getNameANNOTATION_IDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.aiotml.xtext.AiotML.ANNOTATION_ID");
				}
			)
		)
		(
			(
				(
					lv_value_1_0=RULE_EXTERN
					{
						newLeafNode(lv_value_1_0, grammarAccess.getPlatformAnnotationAccess().getValueEXTERNTerminalRuleCall_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_1_0,
							"org.aiotml.xtext.AiotML.EXTERN");
					}
				)
			)
			    |
			(
				(
					lv_value_2_0=RULE_STRING
					{
						newLeafNode(lv_value_2_0, grammarAccess.getPlatformAnnotationAccess().getValueSTRINGTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPlatformAnnotationRule());
						}
						setWithLastConsumed(
							$current,
							"value",
							lv_value_2_0,
							"org.aiotml.xtext.AiotML.STRING");
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleVariable
entryRuleVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableRule()); }
	iv_ruleVariable=ruleVariable
	{ $current=$iv_ruleVariable.current; }
	EOF;

// Rule Variable
ruleVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='var'
			{
				newLeafNode(otherlv_0, grammarAccess.getVariableAccess().getVarKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVariableRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
			otherlv_2=':'
			{
				newLeafNode(otherlv_2, grammarAccess.getVariableAccess().getColonKeyword_0_2());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAccess().getTypeRefTypeRefParserRuleCall_0_3_0());
					}
					lv_typeRef_3_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_3_0,
							"org.aiotml.xtext.AiotML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAccess().getTensorTensorParserRuleCall_1_0());
				}
				lv_tensor_4_0=ruleTensor
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableRule());
					}
					set(
						$current,
						"tensor",
						lv_tensor_4_0,
						"org.aiotml.xtext.AiotML.Tensor");
					afterParserOrEnumRuleCall();
				}
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getLocalVariableParserRuleCall_2());
		}
		this_LocalVariable_5=ruleLocalVariable
		{
			$current = $this_LocalVariable_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getPropertyParserRuleCall_3());
		}
		this_Property_6=ruleProperty
		{
			$current = $this_Property_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getParameterParserRuleCall_4());
		}
		this_Parameter_7=ruleParameter
		{
			$current = $this_Parameter_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getCpropertyParserRuleCall_5());
		}
		this_Cproperty_8=ruleCproperty
		{
			$current = $this_Cproperty_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getStrategyPropertyParserRuleCall_6());
		}
		this_StrategyProperty_9=ruleStrategyProperty
		{
			$current = $this_StrategyProperty_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getVariableAccess().getMultiAgentPropertyParserRuleCall_7());
		}
		this_MultiAgentProperty_10=ruleMultiAgentProperty
		{
			$current = $this_MultiAgentProperty_10.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeRef
entryRuleTypeRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRefRule()); }
	iv_ruleTypeRef=ruleTypeRef
	{ $current=$iv_ruleTypeRef.current; }
	EOF;

// Rule TypeRef
ruleTypeRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypeRefRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getTypeRefAccess().getTypeTypeCrossReference_0_0());
				}
			)
		)
		(
			(
				(
					lv_isArray_1_0='['
					{
						newLeafNode(lv_isArray_1_0, grammarAccess.getTypeRefAccess().getIsArrayLeftSquareBracketKeyword_1_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTypeRefRule());
						}
						setWithLastConsumed($current, "isArray", true, "[");
					}
				)
			)
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityIntegerLiteralParserRuleCall_1_1_0_0());
						}
						lv_cardinality_2_1=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeRefRule());
							}
							set(
								$current,
								"cardinality",
								lv_cardinality_2_1,
								"org.aiotml.xtext.AiotML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getTypeRefAccess().getCardinalityPropertyReferenceParserRuleCall_1_1_0_1());
						}
						lv_cardinality_2_2=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeRefRule());
							}
							set(
								$current,
								"cardinality",
								lv_cardinality_2_2,
								"org.aiotml.xtext.AiotML.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getTypeRefAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
	)
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getPrimitiveTypeParserRuleCall_0());
		}
		this_PrimitiveType_0=rulePrimitiveType
		{
			$current = $this_PrimitiveType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getObjectTypeParserRuleCall_1());
		}
		this_ObjectType_1=ruleObjectType
		{
			$current = $this_ObjectType_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getEnumerationParserRuleCall_2());
		}
		this_Enumeration_2=ruleEnumeration
		{
			$current = $this_Enumeration_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getThingParserRuleCall_3());
		}
		this_Thing_3=ruleThing
		{
			$current = $this_Thing_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getSubThingParserRuleCall_4());
		}
		this_SubThing_4=ruleSubThing
		{
			$current = $this_SubThing_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getModelParserRuleCall_5());
		}
		this_Model_5=ruleModel
		{
			$current = $this_Model_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getStrategyParserRuleCall_6());
		}
		this_Strategy_6=ruleStrategy
		{
			$current = $this_Strategy_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getMultiAgentParserRuleCall_7());
		}
		this_MultiAgent_7=ruleMultiAgent
		{
			$current = $this_MultiAgent_7.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRulePrimitiveType
entryRulePrimitiveType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimitiveTypeRule()); }
	iv_rulePrimitiveType=rulePrimitiveType
	{ $current=$iv_rulePrimitiveType.current; }
	EOF;

// Rule PrimitiveType
rulePrimitiveType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getPrimitiveTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPrimitiveTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			('<')=>
			otherlv_2='<'
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimitiveTypeAccess().getLessThanSignKeyword_2());
			}
		)
		(
			(
				lv_ByteSize_3_0=RULE_INT
				{
					newLeafNode(lv_ByteSize_3_0, grammarAccess.getPrimitiveTypeAccess().getByteSizeINTTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPrimitiveTypeRule());
					}
					setWithLastConsumed(
						$current,
						"ByteSize",
						lv_ByteSize_3_0,
						"org.aiotml.xtext.AiotML.INT");
				}
			)
		)
		otherlv_4='>'
		{
			newLeafNode(otherlv_4, grammarAccess.getPrimitiveTypeAccess().getGreaterThanSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPrimitiveTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_5_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrimitiveTypeRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_5_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_6=';'
			{
				newLeafNode(otherlv_6, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
			}
		)?
	)
;

// Entry rule entryRuleObjectType
entryRuleObjectType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getObjectTypeRule()); }
	iv_ruleObjectType=ruleObjectType
	{ $current=$iv_ruleObjectType.current; }
	EOF;

// Rule ObjectType
ruleObjectType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='object'
		{
			newLeafNode(otherlv_0, grammarAccess.getObjectTypeAccess().getObjectKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getObjectTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getObjectTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getObjectTypeAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getObjectTypeRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleEnumeration
entryRuleEnumeration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationRule()); }
	iv_ruleEnumeration=ruleEnumeration
	{ $current=$iv_ruleEnumeration.current; }
	EOF;

// Rule Enumeration
ruleEnumeration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='enumeration'
		{
			newLeafNode(otherlv_0, grammarAccess.getEnumerationAccess().getEnumerationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEnumerationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				('as')=>
				otherlv_2='as'
				{
					newLeafNode(otherlv_2, grammarAccess.getEnumerationAccess().getAsKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationAccess().getTypeRefTypeRefParserRuleCall_2_1_0());
					}
					lv_typeRef_3_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_3_0,
							"org.aiotml.xtext.AiotML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getEnumerationAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationAccess().getLiteralsEnumerationLiteralParserRuleCall_5_0());
				}
				lv_literals_6_0=ruleEnumerationLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationRule());
					}
					add(
						$current,
						"literals",
						lv_literals_6_0,
						"org.aiotml.xtext.AiotML.EnumerationLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getEnumerationAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleEnumerationLiteral
entryRuleEnumerationLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumerationLiteralRule()); }
	iv_ruleEnumerationLiteral=ruleEnumerationLiteral
	{ $current=$iv_ruleEnumerationLiteral.current; }
	EOF;

// Rule EnumerationLiteral
ruleEnumerationLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getEnumerationLiteralAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumerationLiteralRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			otherlv_1='='
			{
				newLeafNode(otherlv_1, grammarAccess.getEnumerationLiteralAccess().getEqualsSignKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getInitLiteralParserRuleCall_1_1_0());
					}
					lv_init_2_0=ruleLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
						}
						set(
							$current,
							"init",
							lv_init_2_0,
							"org.aiotml.xtext.AiotML.Literal");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getEnumerationLiteralAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEnumerationLiteralRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleTensor
entryRuleTensor returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTensorRule()); }
	iv_ruleTensor=ruleTensor
	{ $current=$iv_ruleTensor.current; }
	EOF;

// Rule Tensor
ruleTensor returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='tensor'
		{
			newLeafNode(otherlv_0, grammarAccess.getTensorAccess().getTensorKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getTensorAccess().getLeftParenthesisKeyword_1());
		}
		otherlv_2='dim'
		{
			newLeafNode(otherlv_2, grammarAccess.getTensorAccess().getDimKeyword_2());
		}
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getTensorAccess().getEqualsSignKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getTensorAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_5_0());
				}
				lv_dims_5_0=ruleIntegerLiteral
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTensorRule());
					}
					add(
						$current,
						"dims",
						lv_dims_5_0,
						"org.aiotml.xtext.AiotML.IntegerLiteral");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_6=','
			{
				newLeafNode(otherlv_6, grammarAccess.getTensorAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTensorAccess().getDimsIntegerLiteralParserRuleCall_6_1_0());
					}
					lv_dims_7_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTensorRule());
						}
						add(
							$current,
							"dims",
							lv_dims_7_0,
							"org.aiotml.xtext.AiotML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_8=')'
		{
			newLeafNode(otherlv_8, grammarAccess.getTensorAccess().getRightParenthesisKeyword_7());
		}
		(
			otherlv_9=','
			{
				newLeafNode(otherlv_9, grammarAccess.getTensorAccess().getCommaKeyword_8_0());
			}
			(
				(
					lv_datatype_10_0=RULE_ID
					{
						newLeafNode(lv_datatype_10_0, grammarAccess.getTensorAccess().getDatatypeIDTerminalRuleCall_8_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTensorRule());
						}
						setWithLastConsumed(
							$current,
							"datatype",
							lv_datatype_10_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
		)?
		otherlv_11=')'
		{
			newLeafNode(otherlv_11, grammarAccess.getTensorAccess().getRightParenthesisKeyword_9());
		}
	)
;

// Entry rule entryRuleLayer
entryRuleLayer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLayerRule()); }
	iv_ruleLayer=ruleLayer
	{ $current=$iv_ruleLayer.current; }
	EOF;

// Rule Layer
ruleLayer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fully_connected'
		{
			newLeafNode(otherlv_0, grammarAccess.getLayerAccess().getFully_connectedKeyword_0());
		}
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getLayerAccess().getColonKeyword_1());
		}
		otherlv_2='dim'
		{
			newLeafNode(otherlv_2, grammarAccess.getLayerAccess().getDimKeyword_2());
		}
		otherlv_3='='
		{
			newLeafNode(otherlv_3, grammarAccess.getLayerAccess().getEqualsSignKeyword_3());
		}
		otherlv_4='('
		{
			newLeafNode(otherlv_4, grammarAccess.getLayerAccess().getLeftParenthesisKeyword_4());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_0_0());
						}
						lv_layernums_5_0=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLayerRule());
							}
							add(
								$current,
								"layernums",
								lv_layernums_5_0,
								"org.aiotml.xtext.AiotML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_6=','
					{
						newLeafNode(otherlv_6, grammarAccess.getLayerAccess().getCommaKeyword_5_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getLayerAccess().getLayernumsIntegerLiteralParserRuleCall_5_0_1_1_0());
							}
							lv_layernums_7_0=ruleIntegerLiteral
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getLayerRule());
								}
								add(
									$current,
									"layernums",
									lv_layernums_7_0,
									"org.aiotml.xtext.AiotML.IntegerLiteral");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)
			    |
			(
				(
					lv_num_8_0='None'
					{
						newLeafNode(lv_num_8_0, grammarAccess.getLayerAccess().getNumNoneKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLayerRule());
						}
						setWithLastConsumed($current, "num", lv_num_8_0, "None");
					}
				)
			)
		)
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getLayerAccess().getRightParenthesisKeyword_6());
		}
		otherlv_10=','
		{
			newLeafNode(otherlv_10, grammarAccess.getLayerAccess().getCommaKeyword_7());
		}
		otherlv_11='af'
		{
			newLeafNode(otherlv_11, grammarAccess.getLayerAccess().getAfKeyword_8());
		}
		otherlv_12='='
		{
			newLeafNode(otherlv_12, grammarAccess.getLayerAccess().getEqualsSignKeyword_9());
		}
		(
			(
				(
					lv_af_13_1='relu'
					{
						newLeafNode(lv_af_13_1, grammarAccess.getLayerAccess().getAfReluKeyword_10_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLayerRule());
						}
						setWithLastConsumed($current, "af", lv_af_13_1, null);
					}
					    |
					lv_af_13_2='sigmoid'
					{
						newLeafNode(lv_af_13_2, grammarAccess.getLayerAccess().getAfSigmoidKeyword_10_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLayerRule());
						}
						setWithLastConsumed($current, "af", lv_af_13_2, null);
					}
					    |
					lv_af_13_3='None'
					{
						newLeafNode(lv_af_13_3, grammarAccess.getLayerAccess().getAfNoneKeyword_10_0_2());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getLayerRule());
						}
						setWithLastConsumed($current, "af", lv_af_13_3, null);
					}
				)
			)
		)
	)
;

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='mlp'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getMlpKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
		}
		otherlv_3='input'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getInputKeyword_3());
		}
		(
			otherlv_4='->>'
			{
				newLeafNode(otherlv_4, grammarAccess.getModelAccess().getHyphenMinusGreaterThanSignGreaterThanSignKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getModelAccess().getLayersLayerParserRuleCall_4_1_0());
					}
					lv_layers_5_0=ruleLayer
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModelRule());
						}
						add(
							$current,
							"layers",
							lv_layers_5_0,
							"org.aiotml.xtext.AiotML.Layer");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleModelReference
entryRuleModelReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelReferenceRule()); }
	iv_ruleModelReference=ruleModelReference
	{ $current=$iv_ruleModelReference.current; }
	EOF;

// Rule ModelReference
ruleModelReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='using'
		{
			newLeafNode(otherlv_0, grammarAccess.getModelReferenceAccess().getUsingKeyword_0());
		}
		otherlv_1='mlp'
		{
			newLeafNode(otherlv_1, grammarAccess.getModelReferenceAccess().getMlpKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getModelReferenceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getModelReferenceAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModelReferenceAccess().getTypeRefTypeRefParserRuleCall_4_0());
				}
				lv_typeRef_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModelReferenceRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_4_0,
						"org.aiotml.xtext.AiotML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStrategy
entryRuleStrategy returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStrategyRule()); }
	iv_ruleStrategy=ruleStrategy
	{ $current=$iv_ruleStrategy.current; }
	EOF;

// Rule Strategy
ruleStrategy returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getStrategyAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStrategyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				otherlv_3='input'
				{
					newLeafNode(otherlv_3, grammarAccess.getStrategyAccess().getInputKeyword_3_0_0());
				}
				otherlv_4=':'
				{
					newLeafNode(otherlv_4, grammarAccess.getStrategyAccess().getColonKeyword_3_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_0_2_0());
						}
						lv_tensor_5_0=ruleTensor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							set(
								$current,
								"tensor",
								lv_tensor_5_0,
								"org.aiotml.xtext.AiotML.Tensor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_6='output'
				{
					newLeafNode(otherlv_6, grammarAccess.getStrategyAccess().getOutputKeyword_3_1_0());
				}
				otherlv_7=':'
				{
					newLeafNode(otherlv_7, grammarAccess.getStrategyAccess().getColonKeyword_3_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_1_2_0());
						}
						lv_tensor_8_0=ruleTensor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							set(
								$current,
								"tensor",
								lv_tensor_8_0,
								"org.aiotml.xtext.AiotML.Tensor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_9='device'
				{
					newLeafNode(otherlv_9, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0());
				}
				otherlv_10=':'
				{
					newLeafNode(otherlv_10, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1());
				}
				otherlv_11='{'
				{
					newLeafNode(otherlv_11, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getDevicesCpropertyParserRuleCall_3_2_3_0());
						}
						lv_devices_12_0=ruleCproperty
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							add(
								$current,
								"devices",
								lv_devices_12_0,
								"org.aiotml.xtext.AiotML.Cproperty");
							afterParserOrEnumRuleCall();
						}
					)
				)*
				otherlv_13='}'
				{
					newLeafNode(otherlv_13, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4());
				}
			)
			    |
			(
				otherlv_14='reward'
				{
					newLeafNode(otherlv_14, grammarAccess.getStrategyAccess().getRewardKeyword_3_3_0());
				}
				otherlv_15=':'
				{
					newLeafNode(otherlv_15, grammarAccess.getStrategyAccess().getColonKeyword_3_3_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getTensorTensorParserRuleCall_3_3_2_0());
						}
						lv_tensor_16_0=ruleTensor
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							set(
								$current,
								"tensor",
								lv_tensor_16_0,
								"org.aiotml.xtext.AiotML.Tensor");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_17='rewards'
				{
					newLeafNode(otherlv_17, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0());
				}
				otherlv_18=':'
				{
					newLeafNode(otherlv_18, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1());
				}
				otherlv_19='dim'
				{
					newLeafNode(otherlv_19, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2());
				}
				otherlv_20='='
				{
					newLeafNode(otherlv_20, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3());
				}
				otherlv_21='('
				{
					newLeafNode(otherlv_21, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_0_0());
							}
							lv_rewdims_22_0=ruleIntegerLiteral
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStrategyRule());
								}
								add(
									$current,
									"rewdims",
									lv_rewdims_22_0,
									"org.aiotml.xtext.AiotML.IntegerLiteral");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_23=','
						{
							newLeafNode(otherlv_23, grammarAccess.getStrategyAccess().getCommaKeyword_3_4_5_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getStrategyAccess().getRewdimsIntegerLiteralParserRuleCall_3_4_5_1_1_0());
								}
								lv_rewdims_24_0=ruleIntegerLiteral
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getStrategyRule());
									}
									add(
										$current,
										"rewdims",
										lv_rewdims_24_0,
										"org.aiotml.xtext.AiotML.IntegerLiteral");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_25=')'
				{
					newLeafNode(otherlv_25, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6());
				}
			)
			    |
			(
				otherlv_26='observation'
				{
					newLeafNode(otherlv_26, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0());
				}
				otherlv_27=':'
				{
					newLeafNode(otherlv_27, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1());
				}
				otherlv_28='dim'
				{
					newLeafNode(otherlv_28, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2());
				}
				otherlv_29='='
				{
					newLeafNode(otherlv_29, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3());
				}
				otherlv_30='('
				{
					newLeafNode(otherlv_30, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4());
				}
				(
					(
						(
							{
								newCompositeNode(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_0_0());
							}
							lv_obsdims_31_0=ruleIntegerLiteral
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStrategyRule());
								}
								add(
									$current,
									"obsdims",
									lv_obsdims_31_0,
									"org.aiotml.xtext.AiotML.IntegerLiteral");
								afterParserOrEnumRuleCall();
							}
						)
					)
					(
						otherlv_32=','
						{
							newLeafNode(otherlv_32, grammarAccess.getStrategyAccess().getCommaKeyword_3_5_5_1_0());
						}
						(
							(
								{
									newCompositeNode(grammarAccess.getStrategyAccess().getObsdimsIntegerLiteralParserRuleCall_3_5_5_1_1_0());
								}
								lv_obsdims_33_0=ruleIntegerLiteral
								{
									if ($current==null) {
										$current = createModelElementForParent(grammarAccess.getStrategyRule());
									}
									add(
										$current,
										"obsdims",
										lv_obsdims_33_0,
										"org.aiotml.xtext.AiotML.IntegerLiteral");
									afterParserOrEnumRuleCall();
								}
							)
						)
					)*
				)?
				otherlv_34=')'
				{
					newLeafNode(otherlv_34, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6());
				}
			)
			    |
			(
				otherlv_35='action_space'
				{
					newLeafNode(otherlv_35, grammarAccess.getStrategyAccess().getAction_spaceKeyword_3_6_0());
				}
				otherlv_36=':'
				{
					newLeafNode(otherlv_36, grammarAccess.getStrategyAccess().getColonKeyword_3_6_1());
				}
				otherlv_37='Discrete'
				{
					newLeafNode(otherlv_37, grammarAccess.getStrategyAccess().getDiscreteKeyword_3_6_2());
				}
				otherlv_38='('
				{
					newLeafNode(otherlv_38, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_6_3());
				}
				otherlv_39='dim'
				{
					newLeafNode(otherlv_39, grammarAccess.getStrategyAccess().getDimKeyword_3_6_4());
				}
				otherlv_40='='
				{
					newLeafNode(otherlv_40, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_6_5());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_6_0());
						}
						lv_actiondims_41_0=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							add(
								$current,
								"actiondims",
								lv_actiondims_41_0,
								"org.aiotml.xtext.AiotML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_42=','
					{
						newLeafNode(otherlv_42, grammarAccess.getStrategyAccess().getCommaKeyword_3_6_7_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getStrategyAccess().getActiondimsIntegerLiteralParserRuleCall_3_6_7_1_0());
							}
							lv_actiondims_43_0=ruleIntegerLiteral
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getStrategyRule());
								}
								add(
									$current,
									"actiondims",
									lv_actiondims_43_0,
									"org.aiotml.xtext.AiotML.IntegerLiteral");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
				otherlv_44=')'
				{
					newLeafNode(otherlv_44, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_6_8());
				}
			)
			    |
			(
				otherlv_45='p_function'
				{
					newLeafNode(otherlv_45, grammarAccess.getStrategyAccess().getP_functionKeyword_3_7_0());
				}
				otherlv_46=':'
				{
					newLeafNode(otherlv_46, grammarAccess.getStrategyAccess().getColonKeyword_3_7_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getPmodelModelReferenceParserRuleCall_3_7_2_0());
						}
						lv_pmodel_47_0=ruleModelReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							set(
								$current,
								"pmodel",
								lv_pmodel_47_0,
								"org.aiotml.xtext.AiotML.ModelReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				otherlv_48='q_function'
				{
					newLeafNode(otherlv_48, grammarAccess.getStrategyAccess().getQ_functionKeyword_3_8_0());
				}
				otherlv_49=':'
				{
					newLeafNode(otherlv_49, grammarAccess.getStrategyAccess().getColonKeyword_3_8_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getStrategyAccess().getQmodelModelReferenceParserRuleCall_3_8_2_0());
						}
						lv_qmodel_50_0=ruleModelReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getStrategyRule());
							}
							set(
								$current,
								"qmodel",
								lv_qmodel_50_0,
								"org.aiotml.xtext.AiotML.ModelReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
		otherlv_51='}'
		{
			newLeafNode(otherlv_51, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStrategyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_52_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStrategyRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_52_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMultiAgent
entryRuleMultiAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiAgentRule()); }
	iv_ruleMultiAgent=ruleMultiAgent
	{ $current=$iv_ruleMultiAgent.current; }
	EOF;

// Rule MultiAgent
ruleMultiAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='strategy'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiAgentAccess().getStrategyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMultiAgentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiAgentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getMultiAgentAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiAgentAccess().getAgentsAgentParserRuleCall_3_0());
				}
				lv_agents_3_0=ruleAgent
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiAgentRule());
					}
					add(
						$current,
						"agents",
						lv_agents_3_0,
						"org.aiotml.xtext.AiotML.Agent");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiAgentAccess().getRightCurlyBracketKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiAgentAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_5_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiAgentRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_5_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMultiAgentProperty
entryRuleMultiAgentProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiAgentPropertyRule()); }
	iv_ruleMultiAgentProperty=ruleMultiAgentProperty
	{ $current=$iv_ruleMultiAgentProperty.current; }
	EOF;

// Rule MultiAgentProperty
ruleMultiAgentProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='using'
		{
			newLeafNode(otherlv_0, grammarAccess.getMultiAgentPropertyAccess().getUsingKeyword_0());
		}
		otherlv_1='strategy'
		{
			newLeafNode(otherlv_1, grammarAccess.getMultiAgentPropertyAccess().getStrategyKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getMultiAgentPropertyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiAgentPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getMultiAgentPropertyAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiAgentPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0());
				}
				lv_typeRef_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiAgentPropertyRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_4_0,
						"org.aiotml.xtext.AiotML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStrategyProperty
entryRuleStrategyProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStrategyPropertyRule()); }
	iv_ruleStrategyProperty=ruleStrategyProperty
	{ $current=$iv_ruleStrategyProperty.current; }
	EOF;

// Rule StrategyProperty
ruleStrategyProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='using'
		{
			newLeafNode(otherlv_0, grammarAccess.getStrategyPropertyAccess().getUsingKeyword_0());
		}
		otherlv_1='model'
		{
			newLeafNode(otherlv_1, grammarAccess.getStrategyPropertyAccess().getModelKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getStrategyPropertyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getStrategyPropertyAccess().getColonKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStrategyPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0());
				}
				lv_typeRef_4_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStrategyPropertyRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_4_0,
						"org.aiotml.xtext.AiotML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStrategyAssignment
entryRuleStrategyAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStrategyAssignmentRule()); }
	iv_ruleStrategyAssignment=ruleStrategyAssignment
	{ $current=$iv_ruleStrategyAssignment.current; }
	EOF;

// Rule StrategyAssignment
ruleStrategyAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='bind'
		{
			newLeafNode(otherlv_0, grammarAccess.getStrategyAssignmentAccess().getBindKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyAssignmentRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStrategyAssignmentAccess().getStrategyVariableCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyAssignmentRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getStrategyAssignmentAccess().getAgentAgentCrossReference_3_0());
				}
			)
		)
		otherlv_4='.'
		{
			newLeafNode(otherlv_4, grammarAccess.getStrategyAssignmentAccess().getFullStopKeyword_4());
		}
		(
			(
				otherlv_5='reward'
				{
					newLeafNode(otherlv_5, grammarAccess.getStrategyAssignmentAccess().getRewardKeyword_5_0_0());
				}
				otherlv_6='='
				{
					newLeafNode(otherlv_6, grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_0_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStrategyAssignmentRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getStrategyAssignmentAccess().getRbindFunctionPropertyCrossReference_5_0_2_0());
						}
					)
				)
			)
			    |
			(
				otherlv_8='input'
				{
					newLeafNode(otherlv_8, grammarAccess.getStrategyAssignmentAccess().getInputKeyword_5_1_0());
				}
				otherlv_9='='
				{
					newLeafNode(otherlv_9, grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_1_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStrategyAssignmentRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getStrategyAssignmentAccess().getIbindFunctionPropertyCrossReference_5_1_2_0());
						}
					)
				)
			)
			    |
			(
				otherlv_11='output'
				{
					newLeafNode(otherlv_11, grammarAccess.getStrategyAssignmentAccess().getOutputKeyword_5_2_0());
				}
				otherlv_12='='
				{
					newLeafNode(otherlv_12, grammarAccess.getStrategyAssignmentAccess().getEqualsSignKeyword_5_2_1());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStrategyAssignmentRule());
							}
						}
						otherlv_13=RULE_ID
						{
							newLeafNode(otherlv_13, grammarAccess.getStrategyAssignmentAccess().getObindFunctionPropertyCrossReference_5_2_2_0());
						}
					)
				)
			)
		)
	)
;

// Entry rule entryRuleThing
entryRuleThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getThingRule()); }
	iv_ruleThing=ruleThing
	{ $current=$iv_ruleThing.current; }
	EOF;

// Rule Thing
ruleThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='thing'
		{
			newLeafNode(otherlv_0, grammarAccess.getThingAccess().getThingKeyword_0());
		}
		(
			(
				lv_fragment_1_0='fragment'
				{
					newLeafNode(lv_fragment_1_0, grammarAccess.getThingAccess().getFragmentFragmentKeyword_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getThingRule());
					}
					setWithLastConsumed($current, "fragment", true, "fragment");
				}
			)
		)?
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getThingAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getThingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			otherlv_3='includes'
			{
				newLeafNode(otherlv_3, grammarAccess.getThingAccess().getIncludesKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getThingRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getThingAccess().getCommaKeyword_3_2_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getThingRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getThingAccess().getIncludesThingCrossReference_3_2_1_0());
						}
					)
				)
			)*
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getThingAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getMessagesMessageParserRuleCall_6_0_0());
					}
					lv_messages_9_0=ruleMessage
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"messages",
							lv_messages_9_0,
							"org.aiotml.xtext.AiotML.Message");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getPortsPortParserRuleCall_6_1_0());
					}
					lv_ports_10_0=rulePort
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"ports",
							lv_ports_10_0,
							"org.aiotml.xtext.AiotML.Port");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getPropertiesPropertyParserRuleCall_6_2_0());
					}
					lv_properties_11_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"properties",
							lv_properties_11_0,
							"org.aiotml.xtext.AiotML.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getCpropertiesCpropertyParserRuleCall_6_3_0());
					}
					lv_cproperties_12_0=ruleCproperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"cproperties",
							lv_cproperties_12_0,
							"org.aiotml.xtext.AiotML.Cproperty");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getFunctionsFunctionParserRuleCall_6_4_0());
					}
					lv_functions_13_0=ruleFunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"functions",
							lv_functions_13_0,
							"org.aiotml.xtext.AiotML.Function");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getAssignPropertyAssignParserRuleCall_6_5_0());
					}
					lv_assign_14_0=rulePropertyAssign
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"assign",
							lv_assign_14_0,
							"org.aiotml.xtext.AiotML.PropertyAssign");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getStrategysStrategyPropertyParserRuleCall_6_6_0());
					}
					lv_strategys_15_0=ruleStrategyProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"strategys",
							lv_strategys_15_0,
							"org.aiotml.xtext.AiotML.StrategyProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getSassignsStrategyAssignmentParserRuleCall_6_7_0());
					}
					lv_sassigns_16_0=ruleStrategyAssignment
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"sassigns",
							lv_sassigns_16_0,
							"org.aiotml.xtext.AiotML.StrategyAssignment");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getThingAccess().getMasMultiAgentPropertyParserRuleCall_6_8_0());
					}
					lv_mas_17_0=ruleMultiAgentProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getThingRule());
						}
						add(
							$current,
							"mas",
							lv_mas_17_0,
							"org.aiotml.xtext.AiotML.MultiAgentProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getThingAccess().getBehaviourStateMachineParserRuleCall_7_0());
				}
				lv_behaviour_18_0=ruleStateMachine
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getThingRule());
					}
					set(
						$current,
						"behaviour",
						lv_behaviour_18_0,
						"org.aiotml.xtext.AiotML.StateMachine");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		otherlv_19='}'
		{
			newLeafNode(otherlv_19, grammarAccess.getThingAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleSubThing
entryRuleSubThing returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubThingRule()); }
	iv_ruleSubThing=ruleSubThing
	{ $current=$iv_ruleSubThing.current; }
	EOF;

// Rule SubThing
ruleSubThing returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='subthing'
		{
			newLeafNode(otherlv_0, grammarAccess.getSubThingAccess().getSubthingKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSubThingAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSubThingRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2='{'
		{
			newLeafNode(otherlv_2, grammarAccess.getSubThingAccess().getLeftCurlyBracketKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSubThingAccess().getPropertiesPropertyParserRuleCall_3_0_0());
					}
					lv_properties_3_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubThingRule());
						}
						add(
							$current,
							"properties",
							lv_properties_3_0,
							"org.aiotml.xtext.AiotML.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getSubThingAccess().getFunctionsFunctionParserRuleCall_3_1_0());
					}
					lv_functions_4_0=ruleFunction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSubThingRule());
						}
						add(
							$current,
							"functions",
							lv_functions_4_0,
							"org.aiotml.xtext.AiotML.Function");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='}'
		{
			newLeafNode(otherlv_5, grammarAccess.getSubThingAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

// Entry rule entryRuleAgent
entryRuleAgent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAgentRule()); }
	iv_ruleAgent=ruleAgent
	{ $current=$iv_ruleAgent.current; }
	EOF;

// Rule Agent
ruleAgent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='agent'
		{
			newLeafNode(otherlv_0, grammarAccess.getAgentAccess().getAgentKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAgentRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getAgentAccess().getLeftSquareBracketKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAgentAccess().getCardinalityIntegerLiteralParserRuleCall_2_1_0());
					}
					lv_cardinality_3_0=ruleIntegerLiteral
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAgentRule());
						}
						set(
							$current,
							"cardinality",
							lv_cardinality_3_0,
							"org.aiotml.xtext.AiotML.IntegerLiteral");
						afterParserOrEnumRuleCall();
					}
				)
			)?
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getAgentAccess().getRightSquareBracketKeyword_2_2());
			}
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAgentAccess().getAmodelStrategyPropertyParserRuleCall_3_0());
				}
				lv_amodel_5_0=ruleStrategyProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAgentRule());
					}
					set(
						$current,
						"amodel",
						lv_amodel_5_0,
						"org.aiotml.xtext.AiotML.StrategyProperty");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCproperty
entryRuleCproperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCpropertyRule()); }
	iv_ruleCproperty=ruleCproperty
	{ $current=$iv_ruleCproperty.current; }
	EOF;

// Rule Cproperty
ruleCproperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='cproperty'
		{
			newLeafNode(otherlv_0, grammarAccess.getCpropertyAccess().getCpropertyKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getCpropertyAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCpropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getCpropertyAccess().getColonKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCpropertyAccess().getTypeRefTypeRefParserRuleCall_3_0_0());
					}
					lv_typeRef_3_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCpropertyRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_3_0,
							"org.aiotml.xtext.AiotML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getCpropertyAccess().getTensorTensorParserRuleCall_3_1_0());
					}
					lv_tensor_4_0=ruleTensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCpropertyRule());
						}
						set(
							$current,
							"tensor",
							lv_tensor_4_0,
							"org.aiotml.xtext.AiotML.Tensor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getCpropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_5_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCpropertyRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_5_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePropertyAssign
entryRulePropertyAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyAssignRule()); }
	iv_rulePropertyAssign=rulePropertyAssign
	{ $current=$iv_rulePropertyAssign.current; }
	EOF;

// Rule PropertyAssign
rulePropertyAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getPropertyAssignAccess().getSetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyAssignRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getPropertyAssignAccess().getPropertyPropertyCrossReference_1_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getPropertyAssignAccess().getLeftSquareBracketKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAssignAccess().getIndexExpressionParserRuleCall_2_1_0());
					}
					lv_index_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
						}
						set(
							$current,
							"index",
							lv_index_3_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getPropertyAssignAccess().getRightSquareBracketKeyword_2_2());
			}
		)?
		otherlv_5='='
		{
			newLeafNode(otherlv_5, grammarAccess.getPropertyAssignAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssignAccess().getInitExpressionParserRuleCall_4_0());
				}
				lv_init_6_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
					}
					set(
						$current,
						"init",
						lv_init_6_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyAssignRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProtocol
entryRuleProtocol returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProtocolRule()); }
	iv_ruleProtocol=ruleProtocol
	{ $current=$iv_ruleProtocol.current; }
	EOF;

// Rule Protocol
ruleProtocol returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='protocol'
		{
			newLeafNode(otherlv_0, grammarAccess.getProtocolAccess().getProtocolKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getProtocolAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProtocolRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProtocolAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProtocolRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
			}
		)?
	)
;

// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	iv_ruleFunction=ruleFunction
	{ $current=$iv_ruleFunction.current; }
	EOF;

// Rule Function
ruleFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='function'
			{
				newLeafNode(otherlv_0, grammarAccess.getFunctionAccess().getFunctionKeyword_0_0());
			}
			(
				(
					lv_name_1_0=RULE_ID
					{
						newLeafNode(lv_name_1_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFunctionRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_1_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_0_2());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_0_0());
						}
						lv_parameters_3_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_3_0,
								"org.aiotml.xtext.AiotML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_4=','
					{
						newLeafNode(otherlv_4, grammarAccess.getFunctionAccess().getCommaKeyword_0_3_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_0_3_1_1_0());
							}
							lv_parameters_5_0=ruleParameter
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getFunctionRule());
								}
								add(
									$current,
									"parameters",
									lv_parameters_5_0,
									"org.aiotml.xtext.AiotML.Parameter");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)*
			)?
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_0_4());
			}
			(
				otherlv_7=':'
				{
					newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getColonKeyword_0_5_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getTypeRefTypeRefParserRuleCall_0_5_1_0());
						}
						lv_typeRef_8_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							set(
								$current,
								"typeRef",
								lv_typeRef_8_0,
								"org.aiotml.xtext.AiotML.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)?
			(
				otherlv_9=','
				{
					newLeafNode(otherlv_9, grammarAccess.getFunctionAccess().getCommaKeyword_0_6_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionAccess().getExtraTypeRefTypeRefParserRuleCall_0_6_1_0());
						}
						lv_extraTypeRef_10_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionRule());
							}
							add(
								$current,
								"extraTypeRef",
								lv_extraTypeRef_10_0,
								"org.aiotml.xtext.AiotML.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_0_7_0());
					}
					lv_annotations_11_0=rulePlatformAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_11_0,
							"org.aiotml.xtext.AiotML.PlatformAnnotation");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionAccess().getBodyActionParserRuleCall_0_8_0());
					}
					lv_body_12_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionRule());
						}
						set(
							$current,
							"body",
							lv_body_12_0,
							"org.aiotml.xtext.AiotML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getFunctionAccess().getAbstractFunctionParserRuleCall_1());
		}
		this_AbstractFunction_13=ruleAbstractFunction
		{
			$current = $this_AbstractFunction_13.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAbstractFunction
entryRuleAbstractFunction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractFunctionRule()); }
	iv_ruleAbstractFunction=ruleAbstractFunction
	{ $current=$iv_ruleAbstractFunction.current; }
	EOF;

// Rule AbstractFunction
ruleAbstractFunction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_abstract_0_0='abstract'
				{
					newLeafNode(lv_abstract_0_0, grammarAccess.getAbstractFunctionAccess().getAbstractAbstractKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractFunctionRule());
					}
					setWithLastConsumed($current, "abstract", true, "abstract");
				}
			)
		)
		otherlv_1='function'
		{
			newLeafNode(otherlv_1, grammarAccess.getAbstractFunctionAccess().getFunctionKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAbstractFunctionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAbstractFunctionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getAbstractFunctionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_0_0());
					}
					lv_parameters_4_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"org.aiotml.xtext.AiotML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getAbstractFunctionAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAbstractFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0());
						}
						lv_parameters_6_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"org.aiotml.xtext.AiotML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getAbstractFunctionAccess().getRightParenthesisKeyword_5());
		}
		(
			otherlv_8=':'
			{
				newLeafNode(otherlv_8, grammarAccess.getAbstractFunctionAccess().getColonKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAbstractFunctionAccess().getTypeRefTypeRefParserRuleCall_6_1_0());
					}
					lv_typeRef_9_0=ruleTypeRef
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
						}
						set(
							$current,
							"typeRef",
							lv_typeRef_9_0,
							"org.aiotml.xtext.AiotML.TypeRef");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAbstractFunctionAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_10_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAbstractFunctionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_10_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleProperty
entryRuleProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyRule()); }
	iv_ruleProperty=ruleProperty
	{ $current=$iv_ruleProperty.current; }
	EOF;

// Rule Property
ruleProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_readonly_0_0='readonly'
				{
					newLeafNode(lv_readonly_0_0, grammarAccess.getPropertyAccess().getReadonlyReadonlyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed($current, "readonly", true, "readonly");
				}
			)
		)?
		otherlv_1='property'
		{
			newLeafNode(otherlv_1, grammarAccess.getPropertyAccess().getPropertyKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getPropertyAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getPropertyAccess().getColonKeyword_3());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0());
						}
						lv_typeRef_4_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getPropertyRule());
							}
							set(
								$current,
								"typeRef",
								lv_typeRef_4_0,
								"org.aiotml.xtext.AiotML.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5='='
					{
						newLeafNode(otherlv_5, grammarAccess.getPropertyAccess().getEqualsSignKeyword_4_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getPropertyAccess().getInitExpressionParserRuleCall_4_0_1_1_0());
							}
							lv_init_6_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getPropertyRule());
								}
								set(
									$current,
									"init",
									lv_init_6_0,
									"org.aiotml.xtext.AiotML.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getPropertyAccess().getTensorTensorParserRuleCall_4_1_0());
					}
					lv_tensor_7_0=ruleTensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPropertyRule());
						}
						set(
							$current,
							"tensor",
							lv_tensor_7_0,
							"org.aiotml.xtext.AiotML.Tensor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPropertyAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_8_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPropertyRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_8_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleMessage
entryRuleMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMessageRule()); }
	iv_ruleMessage=ruleMessage
	{ $current=$iv_ruleMessage.current; }
	EOF;

// Rule Message
ruleMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='message'
		{
			newLeafNode(otherlv_0, grammarAccess.getMessageAccess().getMessageKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getMessageAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMessageRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getMessageAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_0_0());
					}
					lv_parameters_3_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMessageRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_3_0,
							"org.aiotml.xtext.AiotML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_4=','
				{
					newLeafNode(otherlv_4, grammarAccess.getMessageAccess().getCommaKeyword_3_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMessageAccess().getParametersParameterParserRuleCall_3_1_1_0());
						}
						lv_parameters_5_0=ruleParameter
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMessageRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_5_0,
								"org.aiotml.xtext.AiotML.Parameter");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getMessageAccess().getRightParenthesisKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getMessageAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMessageRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_8=';'
			{
				newLeafNode(otherlv_8, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
			}
		)?
	)
;

// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	iv_ruleParameter=ruleParameter
	{ $current=$iv_ruleParameter.current; }
	EOF;

// Rule Parameter
ruleParameter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_ID
				{
					newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParameterRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getParameterAccess().getColonKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getTypeRefTypeRefParserRuleCall_2_0());
				}
				lv_typeRef_2_0=ruleTypeRef
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					set(
						$current,
						"typeRef",
						lv_typeRef_2_0,
						"org.aiotml.xtext.AiotML.TypeRef");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getParameterAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParameterRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRulePort
entryRulePort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPortRule()); }
	iv_rulePort=rulePort
	{ $current=$iv_rulePort.current; }
	EOF;

// Rule Port
rulePort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPortAccess().getRequiredPortParserRuleCall_0());
		}
		this_RequiredPort_0=ruleRequiredPort
		{
			$current = $this_RequiredPort_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getProvidedPortParserRuleCall_1());
		}
		this_ProvidedPort_1=ruleProvidedPort
		{
			$current = $this_ProvidedPort_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPortAccess().getInternalPortParserRuleCall_2());
		}
		this_InternalPort_2=ruleInternalPort
		{
			$current = $this_InternalPort_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleRequiredPort
entryRuleRequiredPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRequiredPortRule()); }
	iv_ruleRequiredPort=ruleRequiredPort
	{ $current=$iv_ruleRequiredPort.current; }
	EOF;

// Rule RequiredPort
ruleRequiredPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_optional_0_0='optional'
				{
					newLeafNode(lv_optional_0_0, grammarAccess.getRequiredPortAccess().getOptionalOptionalKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredPortRule());
					}
					setWithLastConsumed($current, "optional", true, "optional");
				}
			)
		)?
		otherlv_1='required'
		{
			newLeafNode(otherlv_1, grammarAccess.getRequiredPortAccess().getRequiredKeyword_1());
		}
		otherlv_2='port'
		{
			newLeafNode(otherlv_2, grammarAccess.getRequiredPortAccess().getPortKeyword_2());
		}
		(
			(
				lv_name_3_0=RULE_ID
				{
					newLeafNode(lv_name_3_0, grammarAccess.getRequiredPortAccess().getNameIDTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRequiredPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_3_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getRequiredPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRequiredPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_5='{'
		{
			newLeafNode(otherlv_5, grammarAccess.getRequiredPortAccess().getLeftCurlyBracketKeyword_5());
		}
		(
			(
				otherlv_6='sends'
				{
					newLeafNode(otherlv_6, grammarAccess.getRequiredPortAccess().getSendsKeyword_6_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRequiredPortRule());
							}
						}
						otherlv_7=RULE_ID
						{
							newLeafNode(otherlv_7, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_1_0());
						}
					)
				)
				(
					otherlv_8=','
					{
						newLeafNode(otherlv_8, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRequiredPortRule());
								}
							}
							otherlv_9=RULE_ID
							{
								newLeafNode(otherlv_9, grammarAccess.getRequiredPortAccess().getSendsMessageCrossReference_6_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_10='receives'
				{
					newLeafNode(otherlv_10, grammarAccess.getRequiredPortAccess().getReceivesKeyword_6_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRequiredPortRule());
							}
						}
						otherlv_11=RULE_ID
						{
							newLeafNode(otherlv_11, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_1_0());
						}
					)
				)
				(
					otherlv_12=','
					{
						newLeafNode(otherlv_12, grammarAccess.getRequiredPortAccess().getCommaKeyword_6_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRequiredPortRule());
								}
							}
							otherlv_13=RULE_ID
							{
								newLeafNode(otherlv_13, grammarAccess.getRequiredPortAccess().getReceivesMessageCrossReference_6_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_14='}'
		{
			newLeafNode(otherlv_14, grammarAccess.getRequiredPortAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleProvidedPort
entryRuleProvidedPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getProvidedPortRule()); }
	iv_ruleProvidedPort=ruleProvidedPort
	{ $current=$iv_ruleProvidedPort.current; }
	EOF;

// Rule ProvidedPort
ruleProvidedPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='provided'
		{
			newLeafNode(otherlv_0, grammarAccess.getProvidedPortAccess().getProvidedKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getProvidedPortAccess().getPortKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getProvidedPortAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getProvidedPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getProvidedPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getProvidedPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getProvidedPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				otherlv_5='sends'
				{
					newLeafNode(otherlv_5, grammarAccess.getProvidedPortAccess().getSendsKeyword_5_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProvidedPortRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_1_0());
						}
					)
				)
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProvidedPortRule());
								}
							}
							otherlv_8=RULE_ID
							{
								newLeafNode(otherlv_8, grammarAccess.getProvidedPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_9='receives'
				{
					newLeafNode(otherlv_9, grammarAccess.getProvidedPortAccess().getReceivesKeyword_5_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getProvidedPortRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_1_0());
						}
					)
				)
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getProvidedPortAccess().getCommaKeyword_5_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getProvidedPortRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getProvidedPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getProvidedPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleInternalPort
entryRuleInternalPort returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInternalPortRule()); }
	iv_ruleInternalPort=ruleInternalPort
	{ $current=$iv_ruleInternalPort.current; }
	EOF;

// Rule InternalPort
ruleInternalPort returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='internal'
		{
			newLeafNode(otherlv_0, grammarAccess.getInternalPortAccess().getInternalKeyword_0());
		}
		otherlv_1='port'
		{
			newLeafNode(otherlv_1, grammarAccess.getInternalPortAccess().getPortKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInternalPortAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInternalPortRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInternalPortAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInternalPortRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getInternalPortAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			(
				otherlv_5='sends'
				{
					newLeafNode(otherlv_5, grammarAccess.getInternalPortAccess().getSendsKeyword_5_0_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInternalPortRule());
							}
						}
						otherlv_6=RULE_ID
						{
							newLeafNode(otherlv_6, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_1_0());
						}
					)
				)
				(
					otherlv_7=','
					{
						newLeafNode(otherlv_7, grammarAccess.getInternalPortAccess().getCommaKeyword_5_0_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getInternalPortRule());
								}
							}
							otherlv_8=RULE_ID
							{
								newLeafNode(otherlv_8, grammarAccess.getInternalPortAccess().getSendsMessageCrossReference_5_0_2_1_0());
							}
						)
					)
				)*
			)
			    |
			(
				otherlv_9='receives'
				{
					newLeafNode(otherlv_9, grammarAccess.getInternalPortAccess().getReceivesKeyword_5_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getInternalPortRule());
							}
						}
						otherlv_10=RULE_ID
						{
							newLeafNode(otherlv_10, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_1_0());
						}
					)
				)
				(
					otherlv_11=','
					{
						newLeafNode(otherlv_11, grammarAccess.getInternalPortAccess().getCommaKeyword_5_1_2_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getInternalPortRule());
								}
							}
							otherlv_12=RULE_ID
							{
								newLeafNode(otherlv_12, grammarAccess.getInternalPortAccess().getReceivesMessageCrossReference_5_1_2_1_0());
							}
						)
					)
				)*
			)
		)*
		otherlv_13='}'
		{
			newLeafNode(otherlv_13, grammarAccess.getInternalPortAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStateAccess().getStateMachineParserRuleCall_0());
		}
		this_StateMachine_0=ruleStateMachine
		{
			$current = $this_StateMachine_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
		}
		this_FinalState_1=ruleFinalState
		{
			$current = $this_FinalState_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getCompositeStateParserRuleCall_2());
		}
		this_CompositeState_2=ruleCompositeState
		{
			$current = $this_CompositeState_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='state'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateAccess().getStateKeyword_3_0());
			}
			(
				(
					lv_name_4_0=RULE_ID
					{
						newLeafNode(lv_name_4_0, grammarAccess.getStateAccess().getNameIDTerminalRuleCall_3_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_4_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_2_0());
					}
					lv_annotations_5_0=rulePlatformAnnotation
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"annotations",
							lv_annotations_5_0,
							"org.aiotml.xtext.AiotML.PlatformAnnotation");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_6='{'
			{
				newLeafNode(otherlv_6, grammarAccess.getStateAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_4_0());
					}
					lv_properties_7_0=ruleProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateRule());
						}
						add(
							$current,
							"properties",
							lv_properties_7_0,
							"org.aiotml.xtext.AiotML.Property");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			(
				(
					{ 
					  getUnorderedGroupHelper().enter(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
					}
					(
						(
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 0);
						}
									({true}?=>(otherlv_9='on'
									{
										newLeafNode(otherlv_9, grammarAccess.getStateAccess().getOnKeyword_3_5_0_0());
									}
									otherlv_10='entry'
									{
										newLeafNode(otherlv_10, grammarAccess.getStateAccess().getEntryKeyword_3_5_0_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getEntryActionParserRuleCall_3_5_0_2_0());
											}
											lv_entry_11_0=ruleAction
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												set(
													$current,
													"entry",
													lv_entry_11_0,
													"org.aiotml.xtext.AiotML.Action");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 1);
						}
									({true}?=>(otherlv_12='on'
									{
										newLeafNode(otherlv_12, grammarAccess.getStateAccess().getOnKeyword_3_5_1_0());
									}
									otherlv_13='exit'
									{
										newLeafNode(otherlv_13, grammarAccess.getStateAccess().getExitKeyword_3_5_1_1());
									}
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getExitActionParserRuleCall_3_5_1_2_0());
											}
											lv_exit_14_0=ruleAction
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												set(
													$current,
													"exit",
													lv_exit_14_0,
													"org.aiotml.xtext.AiotML.Action");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)|
				(
					{getUnorderedGroupHelper().canSelect(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2)}?=>(
						{
							getUnorderedGroupHelper().select(grammarAccess.getStateAccess().getUnorderedGroup_3_5(), 2);
						}
									({true}?=>((
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getPropertiesPropertyParserRuleCall_3_5_2_0_0());
											}
											lv_properties_15_0=ruleProperty
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"properties",
													lv_properties_15_0,
													"org.aiotml.xtext.AiotML.Property");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getInternalInternalTransitionParserRuleCall_3_5_2_1_0());
											}
											lv_internal_16_0=ruleInternalTransition
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"internal",
													lv_internal_16_0,
													"org.aiotml.xtext.AiotML.InternalTransition");
												afterParserOrEnumRuleCall();
											}
										)
									)
									    |
									(
										(
											{
												newCompositeNode(grammarAccess.getStateAccess().getOutgoingTransitionParserRuleCall_3_5_2_2_0());
											}
											lv_outgoing_17_0=ruleTransition
											{
												if ($current==null) {
													$current = createModelElementForParent(grammarAccess.getStateRule());
												}
												add(
													$current,
													"outgoing",
													lv_outgoing_17_0,
													"org.aiotml.xtext.AiotML.Transition");
												afterParserOrEnumRuleCall();
											}
										)
									)
									))+
						{ 
							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
						}
					)
				)
						)*
					)
				)
					{ 
					  getUnorderedGroupHelper().leave(grammarAccess.getStateAccess().getUnorderedGroup_3_5());
					}
			)
			otherlv_18='}'
			{
				newLeafNode(otherlv_18, grammarAccess.getStateAccess().getRightCurlyBracketKeyword_3_6());
			}
		)
	)
;

// Entry rule entryRuleHandler
entryRuleHandler returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getHandlerRule()); }
	iv_ruleHandler=ruleHandler
	{ $current=$iv_ruleHandler.current; }
	EOF;

// Rule Handler
ruleHandler returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getHandlerAccess().getTransitionParserRuleCall_0());
		}
		this_Transition_0=ruleTransition
		{
			$current = $this_Transition_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getHandlerAccess().getInternalTransitionParserRuleCall_1());
		}
		this_InternalTransition_1=ruleInternalTransition
		{
			$current = $this_InternalTransition_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		otherlv_2='->'
		{
			newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getTargetStateCrossReference_3_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTransitionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_5='event'
			{
				newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getEventKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getEventEventParserRuleCall_5_1_0());
					}
					lv_event_6_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"event",
							lv_event_6_0,
							"org.aiotml.xtext.AiotML.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_7='guard'
			{
				newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getGuardKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getGuardExpressionParserRuleCall_6_1_0());
					}
					lv_guard_8_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_8_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_9='action'
			{
				newLeafNode(otherlv_9, grammarAccess.getTransitionAccess().getActionKeyword_7_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getActionActionParserRuleCall_7_1_0());
					}
					lv_action_10_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTransitionRule());
						}
						set(
							$current,
							"action",
							lv_action_10_0,
							"org.aiotml.xtext.AiotML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleInternalTransition
entryRuleInternalTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInternalTransitionRule()); }
	iv_ruleInternalTransition=ruleInternalTransition
	{ $current=$iv_ruleInternalTransition.current; }
	EOF;

// Rule InternalTransition
ruleInternalTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInternalTransitionAccess().getInternalTransitionAction_0(),
					$current);
			}
		)
		otherlv_1='internal'
		{
			newLeafNode(otherlv_1, grammarAccess.getInternalTransitionAccess().getInternalKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getInternalTransitionAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInternalTransitionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getInternalTransitionAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			otherlv_4='event'
			{
				newLeafNode(otherlv_4, grammarAccess.getInternalTransitionAccess().getEventKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getEventEventParserRuleCall_4_1_0());
					}
					lv_event_5_0=ruleEvent
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"event",
							lv_event_5_0,
							"org.aiotml.xtext.AiotML.Event");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_6='guard'
			{
				newLeafNode(otherlv_6, grammarAccess.getInternalTransitionAccess().getGuardKeyword_5_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getGuardExpressionParserRuleCall_5_1_0());
					}
					lv_guard_7_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"guard",
							lv_guard_7_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		(
			otherlv_8='action'
			{
				newLeafNode(otherlv_8, grammarAccess.getInternalTransitionAccess().getActionKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getInternalTransitionAccess().getActionActionParserRuleCall_6_1_0());
					}
					lv_action_9_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getInternalTransitionRule());
						}
						set(
							$current,
							"action",
							lv_action_9_0,
							"org.aiotml.xtext.AiotML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleCompositeState
entryRuleCompositeState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCompositeStateRule()); }
	iv_ruleCompositeState=ruleCompositeState
	{ $current=$iv_ruleCompositeState.current; }
	EOF;

// Rule CompositeState
ruleCompositeState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='composite'
		{
			newLeafNode(otherlv_0, grammarAccess.getCompositeStateAccess().getCompositeKeyword_0());
		}
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getCompositeStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getCompositeStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3='init'
		{
			newLeafNode(otherlv_3, grammarAccess.getCompositeStateAccess().getInitKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCompositeStateRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getCompositeStateAccess().getInitialStateCrossReference_4_0());
				}
			)
		)
		(
			otherlv_5='keeps'
			{
				newLeafNode(otherlv_5, grammarAccess.getCompositeStateAccess().getKeepsKeyword_5_0());
			}
			(
				(
					lv_history_6_0='history'
					{
						newLeafNode(lv_history_6_0, grammarAccess.getCompositeStateAccess().getHistoryHistoryKeyword_5_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCompositeStateRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_6_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getCompositeStateAccess().getLeftCurlyBracketKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_8_0());
				}
				lv_properties_9_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
					}
					add(
						$current,
						"properties",
						lv_properties_9_0,
						"org.aiotml.xtext.AiotML.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 0);
					}
								({true}?=>(otherlv_11='on'
								{
									newLeafNode(otherlv_11, grammarAccess.getCompositeStateAccess().getOnKeyword_9_0_0());
								}
								otherlv_12='entry'
								{
									newLeafNode(otherlv_12, grammarAccess.getCompositeStateAccess().getEntryKeyword_9_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getEntryActionParserRuleCall_9_0_2_0());
										}
										lv_entry_13_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											set(
												$current,
												"entry",
												lv_entry_13_0,
												"org.aiotml.xtext.AiotML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 1);
					}
								({true}?=>(otherlv_14='on'
								{
									newLeafNode(otherlv_14, grammarAccess.getCompositeStateAccess().getOnKeyword_9_1_0());
								}
								otherlv_15='exit'
								{
									newLeafNode(otherlv_15, grammarAccess.getCompositeStateAccess().getExitKeyword_9_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getExitActionParserRuleCall_9_1_2_0());
										}
										lv_exit_16_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											set(
												$current,
												"exit",
												lv_exit_16_0,
												"org.aiotml.xtext.AiotML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9(), 2);
					}
								({true}?=>((
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getPropertiesPropertyParserRuleCall_9_2_0_0());
										}
										lv_properties_17_0=ruleProperty
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"properties",
												lv_properties_17_0,
												"org.aiotml.xtext.AiotML.Property");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getSubstateStateParserRuleCall_9_2_1_0());
										}
										lv_substate_18_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"substate",
												lv_substate_18_0,
												"org.aiotml.xtext.AiotML.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getInternalInternalTransitionParserRuleCall_9_2_2_0());
										}
										lv_internal_19_0=ruleInternalTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"internal",
												lv_internal_19_0,
												"org.aiotml.xtext.AiotML.InternalTransition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getCompositeStateAccess().getOutgoingTransitionParserRuleCall_9_2_3_0());
										}
										lv_outgoing_20_0=ruleTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
											}
											add(
												$current,
												"outgoing",
												lv_outgoing_20_0,
												"org.aiotml.xtext.AiotML.Transition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getCompositeStateAccess().getUnorderedGroup_9());
				}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeStateAccess().getRegionRegionParserRuleCall_10_0_0());
					}
					lv_region_21_0=ruleRegion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
						}
						add(
							$current,
							"region",
							lv_region_21_0,
							"org.aiotml.xtext.AiotML.Region");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getCompositeStateAccess().getSessionSessionParserRuleCall_10_1_0());
					}
					lv_session_22_0=ruleSession
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCompositeStateRule());
						}
						add(
							$current,
							"session",
							lv_session_22_0,
							"org.aiotml.xtext.AiotML.Session");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_23='}'
		{
			newLeafNode(otherlv_23, grammarAccess.getCompositeStateAccess().getRightCurlyBracketKeyword_11());
		}
	)
;

// Entry rule entryRuleStateMachine
entryRuleStateMachine returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateMachineRule()); }
	iv_ruleStateMachine=ruleStateMachine
	{ $current=$iv_ruleStateMachine.current; }
	EOF;

// Rule StateMachine
ruleStateMachine returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='statechart'
		{
			newLeafNode(otherlv_0, grammarAccess.getStateMachineAccess().getStatechartKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		otherlv_2='init'
		{
			newLeafNode(otherlv_2, grammarAccess.getStateMachineAccess().getInitKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStateMachineRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getStateMachineAccess().getInitialStateCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4='keeps'
			{
				newLeafNode(otherlv_4, grammarAccess.getStateMachineAccess().getKeepsKeyword_4_0());
			}
			(
				(
					lv_history_5_0='history'
					{
						newLeafNode(lv_history_5_0, grammarAccess.getStateMachineAccess().getHistoryHistoryKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateMachineRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_6_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_6_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_7_0());
				}
				lv_properties_8_0=ruleProperty
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateMachineRule());
					}
					add(
						$current,
						"properties",
						lv_properties_8_0,
						"org.aiotml.xtext.AiotML.Property");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{ 
				  getUnorderedGroupHelper().enter(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
				}
				(
					(
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 0);
					}
								({true}?=>(otherlv_10='on'
								{
									newLeafNode(otherlv_10, grammarAccess.getStateMachineAccess().getOnKeyword_8_0_0());
								}
								otherlv_11='entry'
								{
									newLeafNode(otherlv_11, grammarAccess.getStateMachineAccess().getEntryKeyword_8_0_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getEntryActionParserRuleCall_8_0_2_0());
										}
										lv_entry_12_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"entry",
												lv_entry_12_0,
												"org.aiotml.xtext.AiotML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 1);
					}
								({true}?=>(otherlv_13='on'
								{
									newLeafNode(otherlv_13, grammarAccess.getStateMachineAccess().getOnKeyword_8_1_0());
								}
								otherlv_14='exit'
								{
									newLeafNode(otherlv_14, grammarAccess.getStateMachineAccess().getExitKeyword_8_1_1());
								}
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getExitActionParserRuleCall_8_1_2_0());
										}
										lv_exit_15_0=ruleAction
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											set(
												$current,
												"exit",
												lv_exit_15_0,
												"org.aiotml.xtext.AiotML.Action");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)|
			(
				{getUnorderedGroupHelper().canSelect(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2)}?=>(
					{
						getUnorderedGroupHelper().select(grammarAccess.getStateMachineAccess().getUnorderedGroup_8(), 2);
					}
								({true}?=>((
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getPropertiesPropertyParserRuleCall_8_2_0_0());
										}
										lv_properties_16_0=ruleProperty
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"properties",
												lv_properties_16_0,
												"org.aiotml.xtext.AiotML.Property");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getSubstateStateParserRuleCall_8_2_1_0());
										}
										lv_substate_17_0=ruleState
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"substate",
												lv_substate_17_0,
												"org.aiotml.xtext.AiotML.State");
											afterParserOrEnumRuleCall();
										}
									)
								)
								    |
								(
									(
										{
											newCompositeNode(grammarAccess.getStateMachineAccess().getInternalInternalTransitionParserRuleCall_8_2_2_0());
										}
										lv_internal_18_0=ruleInternalTransition
										{
											if ($current==null) {
												$current = createModelElementForParent(grammarAccess.getStateMachineRule());
											}
											add(
												$current,
												"internal",
												lv_internal_18_0,
												"org.aiotml.xtext.AiotML.InternalTransition");
											afterParserOrEnumRuleCall();
										}
									)
								)
								))+
					{ 
						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
					}
				)
			)
					)*
				)
			)
				{ 
				  getUnorderedGroupHelper().leave(grammarAccess.getStateMachineAccess().getUnorderedGroup_8());
				}
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getStateMachineAccess().getRegionRegionParserRuleCall_9_0_0());
					}
					lv_region_19_0=ruleRegion
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateMachineRule());
						}
						add(
							$current,
							"region",
							lv_region_19_0,
							"org.aiotml.xtext.AiotML.Region");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getStateMachineAccess().getSessionSessionParserRuleCall_9_1_0());
					}
					lv_session_20_0=ruleSession
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateMachineRule());
						}
						add(
							$current,
							"session",
							lv_session_20_0,
							"org.aiotml.xtext.AiotML.Session");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_21='}'
		{
			newLeafNode(otherlv_21, grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_10());
		}
	)
;

// Entry rule entryRuleSession
entryRuleSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSessionRule()); }
	iv_ruleSession=ruleSession
	{ $current=$iv_ruleSession.current; }
	EOF;

// Rule Session
ruleSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='session'
		{
			newLeafNode(otherlv_0, grammarAccess.getSessionAccess().getSessionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getSessionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSessionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			otherlv_2='<'
			{
				newLeafNode(otherlv_2, grammarAccess.getSessionAccess().getLessThanSignKeyword_2_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesIntegerLiteralParserRuleCall_2_1_0_0());
						}
						lv_maxInstances_3_1=ruleIntegerLiteral
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSessionRule());
							}
							set(
								$current,
								"maxInstances",
								lv_maxInstances_3_1,
								"org.aiotml.xtext.AiotML.IntegerLiteral");
							afterParserOrEnumRuleCall();
						}
						    |
						{
							newCompositeNode(grammarAccess.getSessionAccess().getMaxInstancesPropertyReferenceParserRuleCall_2_1_0_1());
						}
						lv_maxInstances_3_2=rulePropertyReference
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSessionRule());
							}
							set(
								$current,
								"maxInstances",
								lv_maxInstances_3_2,
								"org.aiotml.xtext.AiotML.PropertyReference");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			otherlv_4='>'
			{
				newLeafNode(otherlv_4, grammarAccess.getSessionAccess().getGreaterThanSignKeyword_2_2());
			}
		)?
		otherlv_5='init'
		{
			newLeafNode(otherlv_5, grammarAccess.getSessionAccess().getInitKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSessionRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getSessionAccess().getInitialStateCrossReference_4_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getSessionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSessionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_8='{'
		{
			newLeafNode(otherlv_8, grammarAccess.getSessionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSessionAccess().getSubstateStateParserRuleCall_7_0());
				}
				lv_substate_9_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSessionRule());
					}
					add(
						$current,
						"substate",
						lv_substate_9_0,
						"org.aiotml.xtext.AiotML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_10='}'
		{
			newLeafNode(otherlv_10, grammarAccess.getSessionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleRegion
entryRuleRegion returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRegionRule()); }
	iv_ruleRegion=ruleRegion
	{ $current=$iv_ruleRegion.current; }
	EOF;

// Rule Region
ruleRegion returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='region'
		{
			newLeafNode(otherlv_0, grammarAccess.getRegionAccess().getRegionKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getRegionAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegionRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		otherlv_2='init'
		{
			newLeafNode(otherlv_2, grammarAccess.getRegionAccess().getInitKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRegionRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getRegionAccess().getInitialStateCrossReference_3_0());
				}
			)
		)
		(
			otherlv_4='keeps'
			{
				newLeafNode(otherlv_4, grammarAccess.getRegionAccess().getKeepsKeyword_4_0());
			}
			(
				(
					lv_history_5_0='history'
					{
						newLeafNode(lv_history_5_0, grammarAccess.getRegionAccess().getHistoryHistoryKeyword_4_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getRegionRule());
						}
						setWithLastConsumed($current, "history", true, "history");
					}
				)
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getRegionAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_6_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegionRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_6_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getRegionAccess().getLeftCurlyBracketKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getRegionAccess().getSubstateStateParserRuleCall_7_0());
				}
				lv_substate_8_0=ruleState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getRegionRule());
					}
					add(
						$current,
						"substate",
						lv_substate_8_0,
						"org.aiotml.xtext.AiotML.State");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_9='}'
		{
			newLeafNode(otherlv_9, grammarAccess.getRegionAccess().getRightCurlyBracketKeyword_8());
		}
	)
;

// Entry rule entryRuleFinalState
entryRuleFinalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalStateRule()); }
	iv_ruleFinalState=ruleFinalState
	{ $current=$iv_ruleFinalState.current; }
	EOF;

// Rule FinalState
ruleFinalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='final'
		{
			newLeafNode(otherlv_0, grammarAccess.getFinalStateAccess().getFinalKeyword_0());
		}
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getStateKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getFinalStateAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFinalStateRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalStateAccess().getAnnotationsPlatformAnnotationParserRuleCall_3_0());
				}
				lv_annotations_3_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalStateRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_3_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getFinalStateAccess().getLeftCurlyBracketKeyword_4());
		}
		(
			otherlv_5='on'
			{
				newLeafNode(otherlv_5, grammarAccess.getFinalStateAccess().getOnKeyword_5_0());
			}
			otherlv_6='entry'
			{
				newLeafNode(otherlv_6, grammarAccess.getFinalStateAccess().getEntryKeyword_5_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFinalStateAccess().getEntryActionParserRuleCall_5_2_0());
					}
					lv_entry_7_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFinalStateRule());
						}
						set(
							$current,
							"entry",
							lv_entry_7_0,
							"org.aiotml.xtext.AiotML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getFinalStateAccess().getRightCurlyBracketKeyword_6());
		}
	)
;

// Entry rule entryRuleStateContainer
entryRuleStateContainer returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateContainerRule()); }
	iv_ruleStateContainer=ruleStateContainer
	{ $current=$iv_ruleStateContainer.current; }
	EOF;

// Rule StateContainer
ruleStateContainer returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getCompositeStateParserRuleCall_0());
		}
		this_CompositeState_0=ruleCompositeState
		{
			$current = $this_CompositeState_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getRegionParserRuleCall_1());
		}
		this_Region_1=ruleRegion
		{
			$current = $this_Region_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateContainerAccess().getSessionParserRuleCall_2());
		}
		this_Session_2=ruleSession
		{
			$current = $this_Session_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_3='keeps'
			{
				newLeafNode(otherlv_3, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStateContainerRule());
						}
					}
					otherlv_4=RULE_ID
					{
						newLeafNode(otherlv_4, grammarAccess.getStateContainerAccess().getInitialStateCrossReference_3_1_0());
					}
				)
			)
			(
				otherlv_5='keeps'
				{
					newLeafNode(otherlv_5, grammarAccess.getStateContainerAccess().getKeepsKeyword_3_2_0());
				}
				(
					(
						lv_history_6_0='history'
						{
							newLeafNode(lv_history_6_0, grammarAccess.getStateContainerAccess().getHistoryHistoryKeyword_3_2_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getStateContainerRule());
							}
							setWithLastConsumed($current, "history", true, "history");
						}
					)
				)
			)?
			otherlv_7='{'
			{
				newLeafNode(otherlv_7, grammarAccess.getStateContainerAccess().getLeftCurlyBracketKeyword_3_3());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStateContainerAccess().getSubstateStateParserRuleCall_3_4_0());
					}
					lv_substate_8_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStateContainerRule());
						}
						add(
							$current,
							"substate",
							lv_substate_8_0,
							"org.aiotml.xtext.AiotML.State");
						afterParserOrEnumRuleCall();
					}
				)
			)*
			otherlv_9='}'
			{
				newLeafNode(otherlv_9, grammarAccess.getStateContainerAccess().getRightCurlyBracketKeyword_3_5());
			}
		)
	)
;

// Entry rule entryRuleEvent
entryRuleEvent returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventRule()); }
	iv_ruleEvent=ruleEvent
	{ $current=$iv_ruleEvent.current; }
	EOF;

// Rule Event
ruleEvent returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getEventAccess().getReceiveMessageParserRuleCall());
	}
	this_ReceiveMessage_0=ruleReceiveMessage
	{
		$current = $this_ReceiveMessage_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleReceiveMessage
entryRuleReceiveMessage returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReceiveMessageRule()); }
	iv_ruleReceiveMessage=ruleReceiveMessage
	{ $current=$iv_ruleReceiveMessage.current; }
	EOF;

// Rule ReceiveMessage
ruleReceiveMessage returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					lv_name_0_0=RULE_ID
					{
						newLeafNode(lv_name_0_0, grammarAccess.getReceiveMessageAccess().getNameIDTerminalRuleCall_0_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getReceiveMessageRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_0_0,
							"org.aiotml.xtext.AiotML.ID");
					}
				)
			)
			otherlv_1=':'
			{
				newLeafNode(otherlv_1, grammarAccess.getReceiveMessageAccess().getColonKeyword_0_1());
			}
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReceiveMessageRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getReceiveMessageAccess().getPortPortCrossReference_1_0());
				}
			)
		)
		otherlv_3='?'
		{
			newLeafNode(otherlv_3, grammarAccess.getReceiveMessageAccess().getQuestionMarkKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getReceiveMessageRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getReceiveMessageAccess().getMessageMessageCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAction
entryRuleAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionRule()); }
	iv_ruleAction=ruleAction
	{ $current=$iv_ruleAction.current; }
	EOF;

// Rule Action
ruleAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getActionAccess().getActionBlockParserRuleCall_0());
		}
		this_ActionBlock_0=ruleActionBlock
		{
			$current = $this_ActionBlock_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getExternStatementParserRuleCall_1());
		}
		this_ExternStatement_1=ruleExternStatement
		{
			$current = $this_ExternStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getSendActionParserRuleCall_2());
		}
		this_SendAction_2=ruleSendAction
		{
			$current = $this_SendAction_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getVariableAssignmentParserRuleCall_3());
		}
		this_VariableAssignment_3=ruleVariableAssignment
		{
			$current = $this_VariableAssignment_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getIncrementParserRuleCall_4());
		}
		this_Increment_4=ruleIncrement
		{
			$current = $this_Increment_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDecrementParserRuleCall_5());
		}
		this_Decrement_5=ruleDecrement
		{
			$current = $this_Decrement_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLoopActionParserRuleCall_6());
		}
		this_LoopAction_6=ruleLoopAction
		{
			$current = $this_LoopAction_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getForActionParserRuleCall_7());
		}
		this_ForAction_7=ruleForAction
		{
			$current = $this_ForAction_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getPyforActionParserRuleCall_8());
		}
		this_PyforAction_8=rulePyforAction
		{
			$current = $this_PyforAction_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getAppendParserRuleCall_9());
		}
		this_Append_9=ruleAppend
		{
			$current = $this_Append_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getDictAssignmentParserRuleCall_10());
		}
		this_DictAssignment_10=ruleDictAssignment
		{
			$current = $this_DictAssignment_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getConditionalActionParserRuleCall_11());
		}
		this_ConditionalAction_11=ruleConditionalAction
		{
			$current = $this_ConditionalAction_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getReturnActionParserRuleCall_12());
		}
		this_ReturnAction_12=ruleReturnAction
		{
			$current = $this_ReturnAction_12.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getPrintActionParserRuleCall_13());
		}
		this_PrintAction_13=rulePrintAction
		{
			$current = $this_PrintAction_13.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getErrorActionParserRuleCall_14());
		}
		this_ErrorAction_14=ruleErrorAction
		{
			$current = $this_ErrorAction_14.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getStartSessionParserRuleCall_15());
		}
		this_StartSession_15=ruleStartSession
		{
			$current = $this_StartSession_15.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getFunctionCallStatementParserRuleCall_16());
		}
		this_FunctionCallStatement_16=ruleFunctionCallStatement
		{
			$current = $this_FunctionCallStatement_16.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getLocalVariableParserRuleCall_17());
		}
		this_LocalVariable_17=ruleLocalVariable
		{
			$current = $this_LocalVariable_17.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getCpropertyAssignmentParserRuleCall_18());
		}
		this_CpropertyAssignment_18=ruleCpropertyAssignment
		{
			$current = $this_CpropertyAssignment_18.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getStrategyStreamParserRuleCall_19());
		}
		this_StrategyStream_19=ruleStrategyStream
		{
			$current = $this_StrategyStream_19.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getActionAccess().getZipEnumerateParserRuleCall_20());
		}
		this_ZipEnumerate_20=ruleZipEnumerate
		{
			$current = $this_ZipEnumerate_20.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleActionBlock
entryRuleActionBlock returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActionBlockRule()); }
	iv_ruleActionBlock=ruleActionBlock
	{ $current=$iv_ruleActionBlock.current; }
	EOF;

// Rule ActionBlock
ruleActionBlock returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getActionBlockAccess().getActionBlockAction_0(),
					$current);
			}
		)
		otherlv_1='do'
		{
			newLeafNode(otherlv_1, grammarAccess.getActionBlockAccess().getDoKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActionBlockAccess().getActionsActionParserRuleCall_2_0());
				}
				lv_actions_2_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActionBlockRule());
					}
					add(
						$current,
						"actions",
						lv_actions_2_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='end'
		{
			newLeafNode(otherlv_3, grammarAccess.getActionBlockAccess().getEndKeyword_3());
		}
	)
;

// Entry rule entryRuleExternStatement
entryRuleExternStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternStatementRule()); }
	iv_ruleExternStatement=ruleExternStatement
	{ $current=$iv_ruleExternStatement.current; }
	EOF;

// Rule ExternStatement
ruleExternStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_statement_0_0=RULE_EXTERN
				{
					newLeafNode(lv_statement_0_0, grammarAccess.getExternStatementAccess().getStatementEXTERNTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternStatementRule());
					}
					setWithLastConsumed(
						$current,
						"statement",
						lv_statement_0_0,
						"org.aiotml.xtext.AiotML.EXTERN");
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getExternStatementAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternStatementAccess().getSegmentsExpressionParserRuleCall_1_1_0());
					}
					lv_segments_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternStatementRule());
						}
						add(
							$current,
							"segments",
							lv_segments_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLocalVariable
entryRuleLocalVariable returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLocalVariableRule()); }
	iv_ruleLocalVariable=ruleLocalVariable
	{ $current=$iv_ruleLocalVariable.current; }
	EOF;

// Rule LocalVariable
ruleLocalVariable returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_readonly_0_0='readonly'
				{
					newLeafNode(lv_readonly_0_0, grammarAccess.getLocalVariableAccess().getReadonlyReadonlyKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalVariableRule());
					}
					setWithLastConsumed($current, "readonly", true, "readonly");
				}
			)
		)?
		otherlv_1='var'
		{
			newLeafNode(otherlv_1, grammarAccess.getLocalVariableAccess().getVarKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getLocalVariableAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getLocalVariableRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_3=':'
		{
			newLeafNode(otherlv_3, grammarAccess.getLocalVariableAccess().getColonKeyword_3());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getLocalVariableAccess().getTypeRefTypeRefParserRuleCall_4_0_0_0());
						}
						lv_typeRef_4_0=ruleTypeRef
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
							}
							set(
								$current,
								"typeRef",
								lv_typeRef_4_0,
								"org.aiotml.xtext.AiotML.TypeRef");
							afterParserOrEnumRuleCall();
						}
					)
				)
				(
					otherlv_5='='
					{
						newLeafNode(otherlv_5, grammarAccess.getLocalVariableAccess().getEqualsSignKeyword_4_0_1_0());
					}
					(
						(
							{
								newCompositeNode(grammarAccess.getLocalVariableAccess().getInitExpressionParserRuleCall_4_0_1_1_0());
							}
							lv_init_6_0=ruleExpression
							{
								if ($current==null) {
									$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
								}
								set(
									$current,
									"init",
									lv_init_6_0,
									"org.aiotml.xtext.AiotML.Expression");
								afterParserOrEnumRuleCall();
							}
						)
					)
				)?
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getLocalVariableAccess().getTensorTensorParserRuleCall_4_1_0());
					}
					lv_tensor_7_0=ruleTensor
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
						}
						set(
							$current,
							"tensor",
							lv_tensor_7_0,
							"org.aiotml.xtext.AiotML.Tensor");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getLocalVariableAccess().getAnnotationsPlatformAnnotationParserRuleCall_5_0());
				}
				lv_annotations_8_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLocalVariableRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_8_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleSendAction
entryRuleSendAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSendActionRule()); }
	iv_ruleSendAction=ruleSendAction
	{ $current=$iv_ruleSendAction.current; }
	EOF;

// Rule SendAction
ruleSendAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSendActionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getSendActionAccess().getPortPortCrossReference_0_0());
				}
			)
		)
		otherlv_1='!'
		{
			newLeafNode(otherlv_1, grammarAccess.getSendActionAccess().getExclamationMarkKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSendActionRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getSendActionAccess().getMessageMessageCrossReference_2_0());
				}
			)
		)
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getSendActionAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_0_0());
					}
					lv_parameters_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSendActionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_4_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_5=','
				{
					newLeafNode(otherlv_5, grammarAccess.getSendActionAccess().getCommaKeyword_4_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getSendActionAccess().getParametersExpressionParserRuleCall_4_1_1_0());
						}
						lv_parameters_6_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getSendActionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_6_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getSendActionAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleVariableAssignment
entryRuleVariableAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableAssignmentRule()); }
	iv_ruleVariableAssignment=ruleVariableAssignment
	{ $current=$iv_ruleVariableAssignment.current; }
	EOF;

// Rule VariableAssignment
ruleVariableAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableAssignmentRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getVariableAssignmentAccess().getPropertyVariableCrossReference_0_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_1='['
				{
					newLeafNode(otherlv_1, grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_1_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getVariableAssignmentAccess().getIndexExpressionParserRuleCall_1_1_0());
					}
					lv_index_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
						}
						set(
							$current,
							"index",
							lv_index_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_1_2());
			}
		)?
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getVariableAssignmentAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getVariableAssignmentRule());
						}
					}
					otherlv_5=RULE_ID
					{
						newLeafNode(otherlv_5, grammarAccess.getVariableAssignmentAccess().getExtraPropertyVariableCrossReference_2_1_0());
					}
				)
			)
			(
				(
					('[')=>
					otherlv_6='['
					{
						newLeafNode(otherlv_6, grammarAccess.getVariableAssignmentAccess().getLeftSquareBracketKeyword_2_2_0());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExtraIndexExpressionParserRuleCall_2_2_1_0());
						}
						lv_extraIndex_7_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
							}
							add(
								$current,
								"extraIndex",
								lv_extraIndex_7_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_8=']'
				{
					newLeafNode(otherlv_8, grammarAccess.getVariableAssignmentAccess().getRightSquareBracketKeyword_2_2_2());
				}
			)?
		)*
		otherlv_9='='
		{
			newLeafNode(otherlv_9, grammarAccess.getVariableAssignmentAccess().getEqualsSignKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableAssignmentAccess().getExpressionExpressionParserRuleCall_4_0());
				}
				lv_expression_10_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableAssignmentRule());
					}
					set(
						$current,
						"expression",
						lv_expression_10_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCpropertyAssignment
entryRuleCpropertyAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCpropertyAssignmentRule()); }
	iv_ruleCpropertyAssignment=ruleCpropertyAssignment
	{ $current=$iv_ruleCpropertyAssignment.current; }
	EOF;

// Rule CpropertyAssignment
ruleCpropertyAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getCpropertyAssignmentAccess().getEntityKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCpropertyAssignmentRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCpropertyAssignmentAccess().getCpropertysVariableCrossReference_1_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getCpropertyAssignmentAccess().getCindexExpressionParserRuleCall_2_1_0());
					}
					lv_cindex_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCpropertyAssignmentRule());
						}
						set(
							$current,
							"cindex",
							lv_cindex_3_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_2_2());
			}
		)?
		(
			otherlv_5='.'
			{
				newLeafNode(otherlv_5, grammarAccess.getCpropertyAssignmentAccess().getFullStopKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCpropertyAssignmentRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getCpropertyAssignmentAccess().getPropertyVariableCrossReference_3_1_0());
					}
				)
			)
			(
				(
					('[')=>
					otherlv_7='['
					{
						newLeafNode(otherlv_7, grammarAccess.getCpropertyAssignmentAccess().getLeftSquareBracketKeyword_3_2_0());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getCpropertyAssignmentAccess().getPindexExpressionParserRuleCall_3_2_1_0());
						}
						lv_pindex_8_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCpropertyAssignmentRule());
							}
							set(
								$current,
								"pindex",
								lv_pindex_8_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_9=']'
				{
					newLeafNode(otherlv_9, grammarAccess.getCpropertyAssignmentAccess().getRightSquareBracketKeyword_3_2_2());
				}
			)?
		)?
		otherlv_10='='
		{
			newLeafNode(otherlv_10, grammarAccess.getCpropertyAssignmentAccess().getEqualsSignKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCpropertyAssignmentAccess().getExpressionExpressionParserRuleCall_5_0());
				}
				lv_expression_11_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCpropertyAssignmentRule());
					}
					set(
						$current,
						"expression",
						lv_expression_11_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStrategyStream
entryRuleStrategyStream returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStrategyStreamRule()); }
	iv_ruleStrategyStream=ruleStrategyStream
	{ $current=$iv_ruleStrategyStream.current; }
	EOF;

// Rule StrategyStream
ruleStrategyStream returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='stream'
		{
			newLeafNode(otherlv_0, grammarAccess.getStrategyStreamAccess().getStreamKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyStreamRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getStrategyStreamAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStrategyStreamRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getStrategyStreamAccess().getInputsVariableCrossReference_2_1_0());
					}
				)
			)
		)*
		otherlv_4='>>'
		{
			newLeafNode(otherlv_4, grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyStreamRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getStrategyStreamAccess().getStrategyVariableCrossReference_4_0());
				}
			)
		)
		otherlv_6='>>'
		{
			newLeafNode(otherlv_6, grammarAccess.getStrategyStreamAccess().getGreaterThanSignGreaterThanSignKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStrategyStreamRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_6_0());
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getStrategyStreamAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getStrategyStreamRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getStrategyStreamAccess().getOutputsVariableCrossReference_7_1_0());
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleDictAssignment
entryRuleDictAssignment returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDictAssignmentRule()); }
	iv_ruleDictAssignment=ruleDictAssignment
	{ $current=$iv_ruleDictAssignment.current; }
	EOF;

// Rule DictAssignment
ruleDictAssignment returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDictAssignmentRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDictAssignmentAccess().getDictVariableCrossReference_0_0());
				}
			)
		)
		(
			otherlv_1='['
			{
				newLeafNode(otherlv_1, grammarAccess.getDictAssignmentAccess().getLeftSquareBracketKeyword_1_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getDictAssignmentRule());
						}
					}
					otherlv_2=RULE_ID
					{
						newLeafNode(otherlv_2, grammarAccess.getDictAssignmentAccess().getElementsVariableCrossReference_1_1_0());
					}
				)
			)
			otherlv_3=']'
			{
				newLeafNode(otherlv_3, grammarAccess.getDictAssignmentAccess().getRightSquareBracketKeyword_1_2());
			}
		)*
		otherlv_4='='
		{
			newLeafNode(otherlv_4, grammarAccess.getDictAssignmentAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDictAssignmentRule());
					}
				}
				otherlv_5=RULE_ID
				{
					newLeafNode(otherlv_5, grammarAccess.getDictAssignmentAccess().getVarVariableCrossReference_3_0());
				}
			)
		)
	)
;

// Entry rule entryRuleZipEnumerate
entryRuleZipEnumerate returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getZipEnumerateRule()); }
	iv_ruleZipEnumerate=ruleZipEnumerate
	{ $current=$iv_ruleZipEnumerate.current; }
	EOF;

// Rule ZipEnumerate
ruleZipEnumerate returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getZipEnumerateAccess().getForKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getZipEnumerateRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_1_0());
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getZipEnumerateAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getZipEnumerateRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getZipEnumerateAccess().getVarsVariableCrossReference_2_1_0());
					}
				)
			)
		)*
		otherlv_4='in'
		{
			newLeafNode(otherlv_4, grammarAccess.getZipEnumerateAccess().getInKeyword_3());
		}
		(
			(
				(
					lv_fname_5_1='zip'
					{
						newLeafNode(lv_fname_5_1, grammarAccess.getZipEnumerateAccess().getFnameZipKeyword_4_0_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getZipEnumerateRule());
						}
						setWithLastConsumed($current, "fname", lv_fname_5_1, null);
					}
					    |
					lv_fname_5_2='enumerate'
					{
						newLeafNode(lv_fname_5_2, grammarAccess.getZipEnumerateAccess().getFnameEnumerateKeyword_4_0_1());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getZipEnumerateRule());
						}
						setWithLastConsumed($current, "fname", lv_fname_5_2, null);
					}
				)
			)
		)
		otherlv_6='('
		{
			newLeafNode(otherlv_6, grammarAccess.getZipEnumerateAccess().getLeftParenthesisKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getZipEnumerateRule());
					}
				}
				otherlv_7=RULE_ID
				{
					newLeafNode(otherlv_7, grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_6_0());
				}
			)
		)
		(
			otherlv_8=','
			{
				newLeafNode(otherlv_8, grammarAccess.getZipEnumerateAccess().getCommaKeyword_7_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getZipEnumerateRule());
						}
					}
					otherlv_9=RULE_ID
					{
						newLeafNode(otherlv_9, grammarAccess.getZipEnumerateAccess().getSetsVariableCrossReference_7_1_0());
					}
				)
			)
		)*
		otherlv_10=')'
		{
			newLeafNode(otherlv_10, grammarAccess.getZipEnumerateAccess().getRightParenthesisKeyword_8());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getZipEnumerateAccess().getActionActionParserRuleCall_9_0());
				}
				lv_action_11_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getZipEnumerateRule());
					}
					set(
						$current,
						"action",
						lv_action_11_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAppend
entryRuleAppend returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAppendRule()); }
	iv_ruleAppend=ruleAppend
	{ $current=$iv_ruleAppend.current; }
	EOF;

// Rule Append
ruleAppend returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAppendRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getAppendAccess().getPythonlistVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getAppendAccess().getFullStopKeyword_1());
		}
		otherlv_2='append'
		{
			newLeafNode(otherlv_2, grammarAccess.getAppendAccess().getAppendKeyword_2());
		}
		otherlv_3='('
		{
			newLeafNode(otherlv_3, grammarAccess.getAppendAccess().getLeftParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAppendAccess().getElementExpressionParserRuleCall_4_0());
				}
				lv_element_4_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAppendRule());
					}
					set(
						$current,
						"element",
						lv_element_4_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getAppendAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleIncrement
entryRuleIncrement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIncrementRule()); }
	iv_ruleIncrement=ruleIncrement
	{ $current=$iv_ruleIncrement.current; }
	EOF;

// Rule Increment
ruleIncrement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getIncrementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getIncrementAccess().getVarVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='++'
		{
			newLeafNode(otherlv_1, grammarAccess.getIncrementAccess().getPlusSignPlusSignKeyword_1());
		}
	)
;

// Entry rule entryRuleDecrement
entryRuleDecrement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecrementRule()); }
	iv_ruleDecrement=ruleDecrement
	{ $current=$iv_ruleDecrement.current; }
	EOF;

// Rule Decrement
ruleDecrement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDecrementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getDecrementAccess().getVarVariableCrossReference_0_0());
				}
			)
		)
		otherlv_1='--'
		{
			newLeafNode(otherlv_1, grammarAccess.getDecrementAccess().getHyphenMinusHyphenMinusKeyword_1());
		}
	)
;

// Entry rule entryRuleForAction
entryRuleForAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getForActionRule()); }
	iv_ruleForAction=ruleForAction
	{ $current=$iv_ruleForAction.current; }
	EOF;

// Rule ForAction
ruleForAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='for'
		{
			newLeafNode(otherlv_0, grammarAccess.getForActionAccess().getForKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getForActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getVariableParameterParserRuleCall_2_0());
				}
				lv_variable_2_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"variable",
						lv_variable_2_0,
						"org.aiotml.xtext.AiotML.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getForActionAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getForActionAccess().getIndexParameterParserRuleCall_3_1_0());
					}
					lv_index_4_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getForActionRule());
						}
						set(
							$current,
							"index",
							lv_index_4_0,
							"org.aiotml.xtext.AiotML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getForActionAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getArrayPropertyReferenceParserRuleCall_5_0());
				}
				lv_array_6_0=rulePropertyReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"array",
						lv_array_6_0,
						"org.aiotml.xtext.AiotML.PropertyReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_7=')'
		{
			newLeafNode(otherlv_7, grammarAccess.getForActionAccess().getRightParenthesisKeyword_6());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getForActionAccess().getActionActionParserRuleCall_7_0());
				}
				lv_action_8_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getForActionRule());
					}
					set(
						$current,
						"action",
						lv_action_8_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePyforAction
entryRulePyforAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPyforActionRule()); }
	iv_rulePyforAction=rulePyforAction
	{ $current=$iv_rulePyforAction.current; }
	EOF;

// Rule PyforAction
rulePyforAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='exfor'
		{
			newLeafNode(otherlv_0, grammarAccess.getPyforActionAccess().getExforKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getPyforActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_2_0());
				}
				lv_variables_2_0=ruleParameter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPyforActionRule());
					}
					add(
						$current,
						"variables",
						lv_variables_2_0,
						"org.aiotml.xtext.AiotML.Parameter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPyforActionAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPyforActionAccess().getVariablesParameterParserRuleCall_3_1_0());
					}
					lv_variables_4_0=ruleParameter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPyforActionRule());
						}
						add(
							$current,
							"variables",
							lv_variables_4_0,
							"org.aiotml.xtext.AiotML.Parameter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_5='in'
		{
			newLeafNode(otherlv_5, grammarAccess.getPyforActionAccess().getInKeyword_4());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_5_0());
				}
				lv_arrays_6_0=rulePropertyReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPyforActionRule());
					}
					add(
						$current,
						"arrays",
						lv_arrays_6_0,
						"org.aiotml.xtext.AiotML.PropertyReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_7=','
			{
				newLeafNode(otherlv_7, grammarAccess.getPyforActionAccess().getCommaKeyword_6_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPyforActionAccess().getArraysPropertyReferenceParserRuleCall_6_1_0());
					}
					lv_arrays_8_0=rulePropertyReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPyforActionRule());
						}
						add(
							$current,
							"arrays",
							lv_arrays_8_0,
							"org.aiotml.xtext.AiotML.PropertyReference");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_9=')'
		{
			newLeafNode(otherlv_9, grammarAccess.getPyforActionAccess().getRightParenthesisKeyword_7());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPyforActionAccess().getActionActionParserRuleCall_8_0());
				}
				lv_action_10_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPyforActionRule());
					}
					set(
						$current,
						"action",
						lv_action_10_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLoopAction
entryRuleLoopAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLoopActionRule()); }
	iv_ruleLoopAction=ruleLoopAction
	{ $current=$iv_ruleLoopAction.current; }
	EOF;

// Rule LoopAction
ruleLoopAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='while'
		{
			newLeafNode(otherlv_0, grammarAccess.getLoopActionAccess().getWhileKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getLoopActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopActionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getLoopActionAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0());
				}
				lv_action_4_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLoopActionRule());
					}
					set(
						$current,
						"action",
						lv_action_4_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleConditionalAction
entryRuleConditionalAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConditionalActionRule()); }
	iv_ruleConditionalAction=ruleConditionalAction
	{ $current=$iv_ruleConditionalAction.current; }
	EOF;

// Rule ConditionalAction
ruleConditionalAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='if'
		{
			newLeafNode(otherlv_0, grammarAccess.getConditionalActionAccess().getIfKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getConditionalActionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalActionAccess().getConditionExpressionParserRuleCall_2_0());
				}
				lv_condition_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
					}
					set(
						$current,
						"condition",
						lv_condition_2_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getConditionalActionAccess().getRightParenthesisKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConditionalActionAccess().getActionActionParserRuleCall_4_0());
				}
				lv_action_4_0=ruleAction
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
					}
					set(
						$current,
						"action",
						lv_action_4_0,
						"org.aiotml.xtext.AiotML.Action");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				('else')=>
				otherlv_5='else'
				{
					newLeafNode(otherlv_5, grammarAccess.getConditionalActionAccess().getElseKeyword_5_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConditionalActionAccess().getElseActionActionParserRuleCall_5_1_0());
					}
					lv_elseAction_6_0=ruleAction
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConditionalActionRule());
						}
						set(
							$current,
							"elseAction",
							lv_elseAction_6_0,
							"org.aiotml.xtext.AiotML.Action");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleReturnAction
entryRuleReturnAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getReturnActionRule()); }
	iv_ruleReturnAction=ruleReturnAction
	{ $current=$iv_ruleReturnAction.current; }
	EOF;

// Rule ReturnAction
ruleReturnAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getReturnActionAccess().getReturnActionAction_0(),
					$current);
			}
		)
		otherlv_1='return'
		{
			newLeafNode(otherlv_1, grammarAccess.getReturnActionAccess().getReturnKeyword_1());
		}
		(
			((
				ruleExpression
			)
			)=>
			(
				{
					newCompositeNode(grammarAccess.getReturnActionAccess().getExpExpressionParserRuleCall_2_0());
				}
				lv_exp_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getReturnActionRule());
					}
					set(
						$current,
						"exp",
						lv_exp_2_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getReturnActionAccess().getCommaKeyword_3_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getReturnActionAccess().getExtraExpExpressionParserRuleCall_3_1_0());
					}
					lv_extraExp_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getReturnActionRule());
						}
						add(
							$current,
							"extraExp",
							lv_extraExp_4_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRulePrintAction
entryRulePrintAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrintActionRule()); }
	iv_rulePrintAction=rulePrintAction
	{ $current=$iv_rulePrintAction.current; }
	EOF;

// Rule PrintAction
rulePrintAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='print'
			{
				newLeafNode(otherlv_0, grammarAccess.getPrintActionAccess().getPrintKeyword_0_0());
			}
			    |
			(
				(
					lv_line_1_0='println'
					{
						newLeafNode(lv_line_1_0, grammarAccess.getPrintActionAccess().getLinePrintlnKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getPrintActionRule());
						}
						setWithLastConsumed($current, "line", true, "println");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_1_0());
				}
				lv_msg_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPrintActionRule());
					}
					add(
						$current,
						"msg",
						lv_msg_2_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getPrintActionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrintActionAccess().getMsgExpressionParserRuleCall_2_1_0());
					}
					lv_msg_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrintActionRule());
						}
						add(
							$current,
							"msg",
							lv_msg_4_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleErrorAction
entryRuleErrorAction returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getErrorActionRule()); }
	iv_ruleErrorAction=ruleErrorAction
	{ $current=$iv_ruleErrorAction.current; }
	EOF;

// Rule ErrorAction
ruleErrorAction returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='error'
			{
				newLeafNode(otherlv_0, grammarAccess.getErrorActionAccess().getErrorKeyword_0_0());
			}
			    |
			(
				(
					lv_line_1_0='errorln'
					{
						newLeafNode(lv_line_1_0, grammarAccess.getErrorActionAccess().getLineErrorlnKeyword_0_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getErrorActionRule());
						}
						setWithLastConsumed($current, "line", true, "errorln");
					}
				)
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_1_0());
				}
				lv_msg_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getErrorActionRule());
					}
					add(
						$current,
						"msg",
						lv_msg_2_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getErrorActionAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getErrorActionAccess().getMsgExpressionParserRuleCall_2_1_0());
					}
					lv_msg_4_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getErrorActionRule());
						}
						add(
							$current,
							"msg",
							lv_msg_4_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleStartSession
entryRuleStartSession returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStartSessionRule()); }
	iv_ruleStartSession=ruleStartSession
	{ $current=$iv_ruleStartSession.current; }
	EOF;

// Rule StartSession
ruleStartSession returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='fork'
		{
			newLeafNode(otherlv_0, grammarAccess.getStartSessionAccess().getForkKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStartSessionRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getStartSessionAccess().getSessionSessionCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFunctionCallStatement
entryRuleFunctionCallStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallStatementRule()); }
	iv_ruleFunctionCallStatement=ruleFunctionCallStatement
	{ $current=$iv_ruleFunctionCallStatement.current; }
	EOF;

// Rule FunctionCallStatement
ruleFunctionCallStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallStatementRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFunctionCallStatementAccess().getFunctionFunctionCrossReference_0_0());
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionCallStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_0_0());
					}
					lv_parameters_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getFunctionCallStatementAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionCallStatementAccess().getParametersExpressionParserRuleCall_2_1_1_0());
						}
						lv_parameters_4_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionCallStatementRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_4_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionCallStatementAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getExpressionAccess().getOrExpressionParserRuleCall());
	}
	this_OrExpression_0=ruleOrExpression
	{
		$current = $this_OrExpression_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrExpression
entryRuleOrExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionRule()); }
	iv_ruleOrExpression=ruleOrExpression
	{ $current=$iv_ruleOrExpression.current; }
	EOF;

// Rule OrExpression
ruleOrExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getOrExpressionAccess().getAndExpressionParserRuleCall_0());
		}
		this_AndExpression_0=ruleAndExpression
		{
			$current = $this_AndExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(),
						$current);
				}
			)
			otherlv_2='or'
			{
				newLeafNode(otherlv_2, grammarAccess.getOrExpressionAccess().getOrKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0());
					}
					lv_rhs_3_0=ruleAndExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"org.aiotml.xtext.AiotML.AndExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpression
entryRuleAndExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionRule()); }
	iv_ruleAndExpression=ruleAndExpression
	{ $current=$iv_ruleAndExpression.current; }
	EOF;

// Rule AndExpression
ruleAndExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAndExpressionAccess().getEqualityParserRuleCall_0());
		}
		this_Equality_0=ruleEquality
		{
			$current = $this_Equality_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(),
						$current);
				}
			)
			otherlv_2='and'
			{
				newLeafNode(otherlv_2, grammarAccess.getAndExpressionAccess().getAndKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0());
					}
					lv_rhs_3_0=ruleEquality
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionRule());
						}
						set(
							$current,
							"rhs",
							lv_rhs_3_0,
							"org.aiotml.xtext.AiotML.Equality");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleEquality
entryRuleEquality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEqualityRule()); }
	iv_ruleEquality=ruleEquality
	{ $current=$iv_ruleEquality.current; }
	EOF;

// Rule Equality
ruleEquality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getEqualityAccess().getComparaisonParserRuleCall_0());
		}
		this_Comparaison_0=ruleComparaison
		{
			$current = $this_Comparaison_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='=='
				{
					newLeafNode(otherlv_2, grammarAccess.getEqualityAccess().getEqualsSignEqualsSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleComparaison
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEqualityRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.aiotml.xtext.AiotML.Comparaison");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='!='
				{
					newLeafNode(otherlv_5, grammarAccess.getEqualityAccess().getExclamationMarkEqualsSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleComparaison
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getEqualityRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.aiotml.xtext.AiotML.Comparaison");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleComparaison
entryRuleComparaison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparaisonRule()); }
	iv_ruleComparaison=ruleComparaison
	{ $current=$iv_ruleComparaison.current; }
	EOF;

// Rule Comparaison
ruleComparaison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getComparaisonAccess().getAdditionParserRuleCall_0());
		}
		this_Addition_0=ruleAddition
		{
			$current = $this_Addition_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='>'
				{
					newLeafNode(otherlv_2, grammarAccess.getComparaisonAccess().getGreaterThanSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.aiotml.xtext.AiotML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='<'
				{
					newLeafNode(otherlv_5, grammarAccess.getComparaisonAccess().getLessThanSignKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.aiotml.xtext.AiotML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0(),
							$current);
					}
				)
				otherlv_8='>='
				{
					newLeafNode(otherlv_8, grammarAccess.getComparaisonAccess().getGreaterThanSignEqualsSignKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0());
						}
						lv_rhs_9_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_9_0,
								"org.aiotml.xtext.AiotML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0(),
							$current);
					}
				)
				otherlv_11='<='
				{
					newLeafNode(otherlv_11, grammarAccess.getComparaisonAccess().getLessThanSignEqualsSignKeyword_1_3_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0());
						}
						lv_rhs_12_0=ruleAddition
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getComparaisonRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_12_0,
								"org.aiotml.xtext.AiotML.Addition");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0());
		}
		this_Multiplication_0=ruleMultiplication
		{
			$current = $this_Multiplication_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='+'
				{
					newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleMultiplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAdditionRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.aiotml.xtext.AiotML.Multiplication");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='-'
				{
					newLeafNode(otherlv_5, grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleMultiplication
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAdditionRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.aiotml.xtext.AiotML.Multiplication");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplication
entryRuleMultiplication returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplicationRule()); }
	iv_ruleMultiplication=ruleMultiplication
	{ $current=$iv_ruleMultiplication.current; }
	EOF;

// Rule Multiplication
ruleMultiplication returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplicationAccess().getCastExpressionParserRuleCall_0());
		}
		this_CastExpression_0=ruleCastExpression
		{
			$current = $this_CastExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='*'
				{
					newLeafNode(otherlv_2, grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0());
						}
						lv_rhs_3_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_3_0,
								"org.aiotml.xtext.AiotML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='/'
				{
					newLeafNode(otherlv_5, grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0());
						}
						lv_rhs_6_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_6_0,
								"org.aiotml.xtext.AiotML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0(),
							$current);
					}
				)
				otherlv_8='%'
				{
					newLeafNode(otherlv_8, grammarAccess.getMultiplicationAccess().getPercentSignKeyword_1_2_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0());
						}
						lv_rhs_9_0=ruleCastExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplicationRule());
							}
							set(
								$current,
								"rhs",
								lv_rhs_9_0,
								"org.aiotml.xtext.AiotML.CastExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleCastExpression
entryRuleCastExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCastExpressionRule()); }
	iv_ruleCastExpression=ruleCastExpression
	{ $current=$iv_ruleCastExpression.current; }
	EOF;

// Rule CastExpression
ruleCastExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getCastExpressionAccess().getPrimaryParserRuleCall_0());
		}
		this_Primary_0=rulePrimary
		{
			$current = $this_Primary_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getCastExpressionAccess().getCastExpressionTermAction_1_0(),
						$current);
				}
			)
			otherlv_2='as'
			{
				newLeafNode(otherlv_2, grammarAccess.getCastExpressionAccess().getAsKeyword_1_1());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCastExpressionRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getCastExpressionAccess().getTypeTypeCrossReference_1_2_0());
					}
				)
			)
			(
				(
					(
						lv_isArray_4_0='['
						{
							newLeafNode(lv_isArray_4_0, grammarAccess.getCastExpressionAccess().getIsArrayLeftSquareBracketKeyword_1_3_0_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getCastExpressionRule());
							}
							setWithLastConsumed($current, "isArray", true, "[");
						}
					)
				)
				otherlv_5=']'
				{
					newLeafNode(otherlv_5, grammarAccess.getCastExpressionAccess().getRightSquareBracketKeyword_1_3_1());
				}
			)?
		)?
	)
;

// Entry rule entryRulePrimary
entryRulePrimary returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryRule()); }
	iv_rulePrimary=rulePrimary
	{ $current=$iv_rulePrimary.current; }
	EOF;

// Rule Primary
rulePrimary returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getExpressionGroupAction_0_0(),
						$current);
				}
			)
			otherlv_1='('
			{
				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0());
					}
					lv_term_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
			}
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getNotExpressionAction_1_0(),
						$current);
				}
			)
			otherlv_5='not'
			{
				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getNotKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0());
					}
					lv_term_6_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_6_0,
							"org.aiotml.xtext.AiotML.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getPrimaryAccess().getUnaryMinusAction_2_0(),
						$current);
				}
			)
			otherlv_8='-'
			{
				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_2_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0());
					}
					lv_term_9_0=rulePrimary
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getPrimaryRule());
						}
						set(
							$current,
							"term",
							lv_term_9_0,
							"org.aiotml.xtext.AiotML.Primary");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryAccess().getArrayIndexPostfixParserRuleCall_3());
		}
		this_ArrayIndexPostfix_10=ruleArrayIndexPostfix
		{
			$current = $this_ArrayIndexPostfix_10.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleArrayIndexPostfix
entryRuleArrayIndexPostfix returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayIndexPostfixRule()); }
	iv_ruleArrayIndexPostfix=ruleArrayIndexPostfix
	{ $current=$iv_ruleArrayIndexPostfix.current; }
	EOF;

// Rule ArrayIndexPostfix
ruleArrayIndexPostfix returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getAtomicExpressionParserRuleCall_0());
		}
		this_AtomicExpression_0=ruleAtomicExpression
		{
			$current = $this_AtomicExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0(),
						$current);
				}
			)
			otherlv_2='['
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayIndexPostfixAccess().getLeftSquareBracketKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0());
					}
					lv_index_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayIndexPostfixRule());
						}
						set(
							$current,
							"index",
							lv_index_3_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getArrayIndexPostfixAccess().getRightSquareBracketKeyword_1_3());
			}
		)?
	)
;

// Entry rule entryRuleAtomicExpression
entryRuleAtomicExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtomicExpressionRule()); }
	iv_ruleAtomicExpression=ruleAtomicExpression
	{ $current=$iv_ruleAtomicExpression.current; }
	EOF;

// Rule AtomicExpression
ruleAtomicExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getExternExpressionParserRuleCall_0());
		}
		this_ExternExpression_0=ruleExternExpression
		{
			$current = $this_ExternExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getLiteralParserRuleCall_1());
		}
		this_Literal_1=ruleLiteral
		{
			$current = $this_Literal_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getArrayInitParserRuleCall_2());
		}
		this_ArrayInit_2=ruleArrayInit
		{
			$current = $this_ArrayInit_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getPropertyReferenceParserRuleCall_3());
		}
		this_PropertyReference_3=rulePropertyReference
		{
			$current = $this_PropertyReference_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getFunctionCallExpressionParserRuleCall_4());
		}
		this_FunctionCallExpression_4=ruleFunctionCallExpression
		{
			$current = $this_FunctionCallExpression_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getEventReferenceParserRuleCall_5());
		}
		this_EventReference_5=ruleEventReference
		{
			$current = $this_EventReference_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAtomicExpressionAccess().getCpropertyReferenceParserRuleCall_6());
		}
		this_CpropertyReference_6=ruleCpropertyReference
		{
			$current = $this_CpropertyReference_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleExternExpression
entryRuleExternExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternExpressionRule()); }
	iv_ruleExternExpression=ruleExternExpression
	{ $current=$iv_ruleExternExpression.current; }
	EOF;

// Rule ExternExpression
ruleExternExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_expression_0_0=RULE_EXTERN
				{
					newLeafNode(lv_expression_0_0, grammarAccess.getExternExpressionAccess().getExpressionEXTERNTerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternExpressionRule());
					}
					setWithLastConsumed(
						$current,
						"expression",
						lv_expression_0_0,
						"org.aiotml.xtext.AiotML.EXTERN");
				}
			)
		)
		(
			otherlv_1='&'
			{
				newLeafNode(otherlv_1, grammarAccess.getExternExpressionAccess().getAmpersandKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExternExpressionAccess().getSegmentsExpressionParserRuleCall_1_1_0());
					}
					lv_segments_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExternExpressionRule());
						}
						add(
							$current,
							"segments",
							lv_segments_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleLiteral
entryRuleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLiteralRule()); }
	iv_ruleLiteral=ruleLiteral
	{ $current=$iv_ruleLiteral.current; }
	EOF;

// Rule Literal
ruleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getEnumLiteralRefParserRuleCall_0());
		}
		this_EnumLiteralRef_0=ruleEnumLiteralRef
		{
			$current = $this_EnumLiteralRef_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getByteLiteralParserRuleCall_1());
		}
		this_ByteLiteral_1=ruleByteLiteral
		{
			$current = $this_ByteLiteral_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getCharLiteralParserRuleCall_2());
		}
		this_CharLiteral_2=ruleCharLiteral
		{
			$current = $this_CharLiteral_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getIntegerLiteralParserRuleCall_3());
		}
		this_IntegerLiteral_3=ruleIntegerLiteral
		{
			$current = $this_IntegerLiteral_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_4());
		}
		this_BooleanLiteral_4=ruleBooleanLiteral
		{
			$current = $this_BooleanLiteral_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_5());
		}
		this_StringLiteral_5=ruleStringLiteral
		{
			$current = $this_StringLiteral_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getLiteralAccess().getDoubleLiteralParserRuleCall_6());
		}
		this_DoubleLiteral_6=ruleDoubleLiteral
		{
			$current = $this_DoubleLiteral_6.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleArrayInit
entryRuleArrayInit returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getArrayInitRule()); }
	iv_ruleArrayInit=ruleArrayInit
	{ $current=$iv_ruleArrayInit.current; }
	EOF;

// Rule ArrayInit
ruleArrayInit returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='{'
		{
			newLeafNode(otherlv_0, grammarAccess.getArrayInitAccess().getLeftCurlyBracketKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_1_0());
				}
				lv_values_1_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getArrayInitRule());
					}
					add(
						$current,
						"values",
						lv_values_1_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2=','
			{
				newLeafNode(otherlv_2, grammarAccess.getArrayInitAccess().getCommaKeyword_2_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getArrayInitAccess().getValuesExpressionParserRuleCall_2_1_0());
					}
					lv_values_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getArrayInitRule());
						}
						add(
							$current,
							"values",
							lv_values_3_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getArrayInitAccess().getRightCurlyBracketKeyword_3());
		}
	)
;

// Entry rule entryRuleEnumLiteralRef
entryRuleEnumLiteralRef returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEnumLiteralRefRule()); }
	iv_ruleEnumLiteralRef=ruleEnumLiteralRef
	{ $current=$iv_ruleEnumLiteralRef.current; }
	EOF;

// Rule EnumLiteralRef
ruleEnumLiteralRef returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralRefRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationCrossReference_0_0());
				}
			)
		)
		otherlv_1=':'
		{
			newLeafNode(otherlv_1, grammarAccess.getEnumLiteralRefAccess().getColonKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEnumLiteralRefRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleByteLiteral
entryRuleByteLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getByteLiteralRule()); }
	iv_ruleByteLiteral=ruleByteLiteral
	{ $current=$iv_ruleByteLiteral.current; }
	EOF;

// Rule ByteLiteral
ruleByteLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_byteValue_0_0=RULE_BYTE
			{
				newLeafNode(lv_byteValue_0_0, grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getByteLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"byteValue",
					lv_byteValue_0_0,
					"org.aiotml.xtext.AiotML.BYTE");
			}
		)
	)
;

// Entry rule entryRuleCharLiteral
entryRuleCharLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCharLiteralRule()); }
	iv_ruleCharLiteral=ruleCharLiteral
	{ $current=$iv_ruleCharLiteral.current; }
	EOF;

// Rule CharLiteral
ruleCharLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_charValue_0_0=RULE_CHAR
			{
				newLeafNode(lv_charValue_0_0, grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getCharLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"charValue",
					lv_charValue_0_0,
					"org.aiotml.xtext.AiotML.CHAR");
			}
		)
	)
;

// Entry rule entryRuleIntegerLiteral
entryRuleIntegerLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerLiteralRule()); }
	iv_ruleIntegerLiteral=ruleIntegerLiteral
	{ $current=$iv_ruleIntegerLiteral.current; }
	EOF;

// Rule IntegerLiteral
ruleIntegerLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_intValue_0_0=RULE_INT
			{
				newLeafNode(lv_intValue_0_0, grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntegerLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"intValue",
					lv_intValue_0_0,
					"org.aiotml.xtext.AiotML.INT");
			}
		)
	)
;

// Entry rule entryRuleBooleanLiteral
entryRuleBooleanLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanLiteralRule()); }
	iv_ruleBooleanLiteral=ruleBooleanLiteral
	{ $current=$iv_ruleBooleanLiteral.current; }
	EOF;

// Rule BooleanLiteral
ruleBooleanLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_boolValue_0_0='true'
				{
					newLeafNode(lv_boolValue_0_0, grammarAccess.getBooleanLiteralAccess().getBoolValueTrueKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBooleanLiteralRule());
					}
					setWithLastConsumed($current, "boolValue", true, "true");
				}
			)
		)
		    |
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getBooleanLiteralAccess().getBooleanLiteralAction_1_0(),
						$current);
				}
			)
			otherlv_2='false'
			{
				newLeafNode(otherlv_2, grammarAccess.getBooleanLiteralAccess().getFalseKeyword_1_1());
			}
		)
	)
;

// Entry rule entryRuleStringLiteral
entryRuleStringLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringLiteralRule()); }
	iv_ruleStringLiteral=ruleStringLiteral
	{ $current=$iv_ruleStringLiteral.current; }
	EOF;

// Rule StringLiteral
ruleStringLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_stringValue_0_0=RULE_STRING
			{
				newLeafNode(lv_stringValue_0_0, grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getStringLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"stringValue",
					lv_stringValue_0_0,
					"org.aiotml.xtext.AiotML.STRING");
			}
		)
	)
;

// Entry rule entryRuleDoubleLiteral
entryRuleDoubleLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDoubleLiteralRule()); }
	iv_ruleDoubleLiteral=ruleDoubleLiteral
	{ $current=$iv_ruleDoubleLiteral.current; }
	EOF;

// Rule DoubleLiteral
ruleDoubleLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_doubleValue_0_0=RULE_FLOAT
			{
				newLeafNode(lv_doubleValue_0_0, grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getDoubleLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"doubleValue",
					lv_doubleValue_0_0,
					"org.aiotml.xtext.AiotML.FLOAT");
			}
		)
	)
;

// Entry rule entryRulePropertyReference
entryRulePropertyReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyReferenceRule()); }
	iv_rulePropertyReference=rulePropertyReference
	{ $current=$iv_rulePropertyReference.current; }
	EOF;

// Rule PropertyReference
rulePropertyReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getPropertyReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getPropertyReferenceAccess().getPropertyVariableCrossReference_0());
			}
		)
	)
;

// Entry rule entryRuleCpropertyReference
entryRuleCpropertyReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCpropertyReferenceRule()); }
	iv_ruleCpropertyReference=ruleCpropertyReference
	{ $current=$iv_ruleCpropertyReference.current; }
	EOF;

// Rule CpropertyReference
ruleCpropertyReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='entity'
		{
			newLeafNode(otherlv_0, grammarAccess.getCpropertyReferenceAccess().getEntityKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCpropertyReferenceRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getCpropertyReferenceAccess().getCpropertysVariableCrossReference_1_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_2='['
				{
					newLeafNode(otherlv_2, grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_2_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getCpropertyReferenceAccess().getCindexExpressionParserRuleCall_2_1_0());
					}
					lv_cindex_3_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCpropertyReferenceRule());
						}
						set(
							$current,
							"cindex",
							lv_cindex_3_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4=']'
			{
				newLeafNode(otherlv_4, grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_2_2());
			}
		)?
		(
			otherlv_5='.'
			{
				newLeafNode(otherlv_5, grammarAccess.getCpropertyReferenceAccess().getFullStopKeyword_3_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getCpropertyReferenceRule());
						}
					}
					otherlv_6=RULE_ID
					{
						newLeafNode(otherlv_6, grammarAccess.getCpropertyReferenceAccess().getPropertyVariableCrossReference_3_1_0());
					}
				)
			)
			(
				(
					('[')=>
					otherlv_7='['
					{
						newLeafNode(otherlv_7, grammarAccess.getCpropertyReferenceAccess().getLeftSquareBracketKeyword_3_2_0());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getCpropertyReferenceAccess().getPindexExpressionParserRuleCall_3_2_1_0());
						}
						lv_pindex_8_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getCpropertyReferenceRule());
							}
							set(
								$current,
								"pindex",
								lv_pindex_8_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
				otherlv_9=']'
				{
					newLeafNode(otherlv_9, grammarAccess.getCpropertyReferenceAccess().getRightSquareBracketKeyword_3_2_2());
				}
			)?
		)?
	)
;

// Entry rule entryRuleEventReference
entryRuleEventReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEventReferenceRule()); }
	iv_ruleEventReference=ruleEventReference
	{ $current=$iv_ruleEventReference.current; }
	EOF;

// Rule EventReference
ruleEventReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventReferenceRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getEventReferenceAccess().getReceiveMsgEventCrossReference_0_0());
				}
			)
		)
		otherlv_1='.'
		{
			newLeafNode(otherlv_1, grammarAccess.getEventReferenceAccess().getFullStopKeyword_1());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEventReferenceRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getEventReferenceAccess().getParameterParameterCrossReference_2_0());
				}
			)
		)
	)
;

// Entry rule entryRuleFunctionCallExpression
entryRuleFunctionCallExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFunctionCallExpressionRule()); }
	iv_ruleFunctionCallExpression=ruleFunctionCallExpression
	{ $current=$iv_ruleFunctionCallExpression.current; }
	EOF;

// Rule FunctionCallExpression
ruleFunctionCallExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFunctionCallExpressionRule());
					}
				}
				otherlv_0=RULE_ID
				{
					newLeafNode(otherlv_0, grammarAccess.getFunctionCallExpressionAccess().getFunctionFunctionCrossReference_0_0());
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getFunctionCallExpressionAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_0_0());
					}
					lv_parameters_2_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
						}
						add(
							$current,
							"parameters",
							lv_parameters_2_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_3=','
				{
					newLeafNode(otherlv_3, grammarAccess.getFunctionCallExpressionAccess().getCommaKeyword_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getFunctionCallExpressionAccess().getParametersExpressionParserRuleCall_2_1_1_0());
						}
						lv_parameters_4_0=ruleExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getFunctionCallExpressionRule());
							}
							add(
								$current,
								"parameters",
								lv_parameters_4_0,
								"org.aiotml.xtext.AiotML.Expression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)*
		)?
		otherlv_5=')'
		{
			newLeafNode(otherlv_5, grammarAccess.getFunctionCallExpressionAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleConfiguration
entryRuleConfiguration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigurationRule()); }
	iv_ruleConfiguration=ruleConfiguration
	{ $current=$iv_ruleConfiguration.current; }
	EOF;

// Rule Configuration
ruleConfiguration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='configuration'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConfigurationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigurationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigurationAccess().getAnnotationsPlatformAnnotationParserRuleCall_2_0());
				}
				lv_annotations_2_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigurationRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_2_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getConfigurationAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getInstancesInstanceParserRuleCall_4_0_0());
					}
					lv_instances_4_0=ruleInstance
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"instances",
							lv_instances_4_0,
							"org.aiotml.xtext.AiotML.Instance");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getConnectorsAbstractConnectorParserRuleCall_4_1_0());
					}
					lv_connectors_5_0=ruleAbstractConnector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"connectors",
							lv_connectors_5_0,
							"org.aiotml.xtext.AiotML.AbstractConnector");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigurationAccess().getPropassignsConfigPropertyAssignParserRuleCall_4_2_0());
					}
					lv_propassigns_6_0=ruleConfigPropertyAssign
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigurationRule());
						}
						add(
							$current,
							"propassigns",
							lv_propassigns_6_0,
							"org.aiotml.xtext.AiotML.ConfigPropertyAssign");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_7='}'
		{
			newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleInstance
entryRuleInstance returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInstanceRule()); }
	iv_ruleInstance=ruleInstance
	{ $current=$iv_ruleInstance.current; }
	EOF;

// Rule Instance
ruleInstance returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='instance'
		{
			newLeafNode(otherlv_0, grammarAccess.getInstanceAccess().getInstanceKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getInstanceAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)
		otherlv_2=':'
		{
			newLeafNode(otherlv_2, grammarAccess.getInstanceAccess().getColonKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getInstanceRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getInstanceAccess().getTypeThingCrossReference_3_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getInstanceAccess().getAnnotationsPlatformAnnotationParserRuleCall_4_0());
				}
				lv_annotations_4_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInstanceRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_4_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleConfigPropertyAssign
entryRuleConfigPropertyAssign returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConfigPropertyAssignRule()); }
	iv_ruleConfigPropertyAssign=ruleConfigPropertyAssign
	{ $current=$iv_ruleConfigPropertyAssign.current; }
	EOF;

// Rule ConfigPropertyAssign
ruleConfigPropertyAssign returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='set'
		{
			newLeafNode(otherlv_0, grammarAccess.getConfigPropertyAssignAccess().getSetKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getConfigPropertyAssignAccess().getInstanceInstanceCrossReference_1_0());
				}
			)
		)
		otherlv_2='.'
		{
			newLeafNode(otherlv_2, grammarAccess.getConfigPropertyAssignAccess().getFullStopKeyword_2());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConfigPropertyAssignRule());
					}
				}
				otherlv_3=RULE_ID
				{
					newLeafNode(otherlv_3, grammarAccess.getConfigPropertyAssignAccess().getPropertyPropertyCrossReference_3_0());
				}
			)
		)
		(
			(
				('[')=>
				otherlv_4='['
				{
					newLeafNode(otherlv_4, grammarAccess.getConfigPropertyAssignAccess().getLeftSquareBracketKeyword_4_0());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getIndexExpressionParserRuleCall_4_1_0());
					}
					lv_index_5_0=ruleExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
						}
						set(
							$current,
							"index",
							lv_index_5_0,
							"org.aiotml.xtext.AiotML.Expression");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=']'
			{
				newLeafNode(otherlv_6, grammarAccess.getConfigPropertyAssignAccess().getRightSquareBracketKeyword_4_2());
			}
		)?
		otherlv_7='='
		{
			newLeafNode(otherlv_7, grammarAccess.getConfigPropertyAssignAccess().getEqualsSignKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getInitExpressionParserRuleCall_6_0());
				}
				lv_init_8_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
					}
					set(
						$current,
						"init",
						lv_init_8_0,
						"org.aiotml.xtext.AiotML.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConfigPropertyAssignAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_9_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConfigPropertyAssignRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_9_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleAbstractConnector
entryRuleAbstractConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAbstractConnectorRule()); }
	iv_ruleAbstractConnector=ruleAbstractConnector
	{ $current=$iv_ruleAbstractConnector.current; }
	EOF;

// Rule AbstractConnector
ruleAbstractConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getConnectorParserRuleCall_0());
		}
		this_Connector_0=ruleConnector
		{
			$current = $this_Connector_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getAbstractConnectorAccess().getExternalConnectorParserRuleCall_1());
		}
		this_ExternalConnector_1=ruleExternalConnector
		{
			$current = $this_ExternalConnector_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleConnector
entryRuleConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConnectorRule()); }
	iv_ruleConnector=ruleConnector
	{ $current=$iv_ruleConnector.current; }
	EOF;

// Rule Connector
ruleConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connector'
		{
			newLeafNode(otherlv_0, grammarAccess.getConnectorAccess().getConnectorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getConnectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getConnectorAccess().getCliInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getConnectorAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getConnectorAccess().getRequiredRequiredPortCrossReference_4_0());
				}
			)
		)
		otherlv_5='=>'
		{
			newLeafNode(otherlv_5, grammarAccess.getConnectorAccess().getEqualsSignGreaterThanSignKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getConnectorAccess().getSrvInstanceCrossReference_6_0());
				}
			)
		)
		otherlv_7='.'
		{
			newLeafNode(otherlv_7, grammarAccess.getConnectorAccess().getFullStopKeyword_7());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getConnectorRule());
					}
				}
				otherlv_8=RULE_ID
				{
					newLeafNode(otherlv_8, grammarAccess.getConnectorAccess().getProvidedProvidedPortCrossReference_8_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_9_0());
				}
				lv_annotations_9_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getConnectorRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_9_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

// Entry rule entryRuleExternalConnector
entryRuleExternalConnector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExternalConnectorRule()); }
	iv_ruleExternalConnector=ruleExternalConnector
	{ $current=$iv_ruleExternalConnector.current; }
	EOF;

// Rule ExternalConnector
ruleExternalConnector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='connector'
		{
			newLeafNode(otherlv_0, grammarAccess.getExternalConnectorAccess().getConnectorKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getExternalConnectorAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.aiotml.xtext.AiotML.ID");
				}
			)
		)?
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_2=RULE_ID
				{
					newLeafNode(otherlv_2, grammarAccess.getExternalConnectorAccess().getInstInstanceCrossReference_2_0());
				}
			)
		)
		otherlv_3='.'
		{
			newLeafNode(otherlv_3, grammarAccess.getExternalConnectorAccess().getFullStopKeyword_3());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_4=RULE_ID
				{
					newLeafNode(otherlv_4, grammarAccess.getExternalConnectorAccess().getPortPortCrossReference_4_0());
				}
			)
		)
		otherlv_5='over'
		{
			newLeafNode(otherlv_5, grammarAccess.getExternalConnectorAccess().getOverKeyword_5());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getExternalConnectorRule());
					}
				}
				otherlv_6=RULE_ID
				{
					newLeafNode(otherlv_6, grammarAccess.getExternalConnectorAccess().getProtocolProtocolCrossReference_6_0());
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getExternalConnectorAccess().getAnnotationsPlatformAnnotationParserRuleCall_7_0());
				}
				lv_annotations_7_0=rulePlatformAnnotation
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getExternalConnectorRule());
					}
					add(
						$current,
						"annotations",
						lv_annotations_7_0,
						"org.aiotml.xtext.AiotML.PlatformAnnotation");
					afterParserOrEnumRuleCall();
				}
			)
		)*
	)
;

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
