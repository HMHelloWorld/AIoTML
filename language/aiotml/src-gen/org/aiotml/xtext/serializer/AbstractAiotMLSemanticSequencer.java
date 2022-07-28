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
package org.aiotml.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.Agent;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.AndExpression;
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.Append;
import org.aiotml.xtext.aiotML.ArrayIndex;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.BooleanLiteral;
import org.aiotml.xtext.aiotML.ByteLiteral;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.CharLiteral;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.ConditionalAction;
import org.aiotml.xtext.aiotML.ConfigPropertyAssign;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Connector;
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.CpropertyAssignment;
import org.aiotml.xtext.aiotML.CpropertyReference;
import org.aiotml.xtext.aiotML.Decrement;
import org.aiotml.xtext.aiotML.DictAssignment;
import org.aiotml.xtext.aiotML.DivExpression;
import org.aiotml.xtext.aiotML.DoubleLiteral;
import org.aiotml.xtext.aiotML.EnumLiteralRef;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.EnumerationLiteral;
import org.aiotml.xtext.aiotML.EqualsExpression;
import org.aiotml.xtext.aiotML.ErrorAction;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.ExpressionGroup;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.ExternStatement;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.FinalState;
import org.aiotml.xtext.aiotML.ForAction;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.FunctionCallExpression;
import org.aiotml.xtext.aiotML.FunctionCallStatement;
import org.aiotml.xtext.aiotML.GreaterExpression;
import org.aiotml.xtext.aiotML.GreaterOrEqualExpression;
import org.aiotml.xtext.aiotML.Import;
import org.aiotml.xtext.aiotML.Increment;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.InternalPort;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.Layer;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.LoopAction;
import org.aiotml.xtext.aiotML.LowerExpression;
import org.aiotml.xtext.aiotML.LowerOrEqualExpression;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.MinusExpression;
import org.aiotml.xtext.aiotML.ModExpression;
import org.aiotml.xtext.aiotML.Model;
import org.aiotml.xtext.aiotML.ModelReference;
import org.aiotml.xtext.aiotML.MultiAgent;
import org.aiotml.xtext.aiotML.MultiAgentProperty;
import org.aiotml.xtext.aiotML.NamedElement;
import org.aiotml.xtext.aiotML.NotEqualsExpression;
import org.aiotml.xtext.aiotML.NotExpression;
import org.aiotml.xtext.aiotML.ObjectType;
import org.aiotml.xtext.aiotML.OrExpression;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.PlusExpression;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.PrintAction;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyAssign;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.Protocol;
import org.aiotml.xtext.aiotML.ProvidedPort;
import org.aiotml.xtext.aiotML.PyforAction;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.Region;
import org.aiotml.xtext.aiotML.RequiredPort;
import org.aiotml.xtext.aiotML.ReturnAction;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.Session;
import org.aiotml.xtext.aiotML.StartSession;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Strategy;
import org.aiotml.xtext.aiotML.StrategyAssignment;
import org.aiotml.xtext.aiotML.StrategyProperty;
import org.aiotml.xtext.aiotML.StrategyStream;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.SubThing;
import org.aiotml.xtext.aiotML.Template;
import org.aiotml.xtext.aiotML.Tensor;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.TimesExpression;
import org.aiotml.xtext.aiotML.Transition;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.UnaryMinus;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.VariableAssignment;
import org.aiotml.xtext.aiotML.ZipEnumerate;
import org.aiotml.xtext.services.AiotMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractAiotMLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AiotMLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == AiotMLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case AiotMLPackage.ACTION_BLOCK:
				sequence_ActionBlock(context, (ActionBlock) semanticObject); 
				return; 
			case AiotMLPackage.AGENT:
				sequence_Agent(context, (Agent) semanticObject); 
				return; 
			case AiotMLPackage.AIOT_ML_MODEL:
				sequence_AiotMLModel(context, (AiotMLModel) semanticObject); 
				return; 
			case AiotMLPackage.AND_EXPRESSION:
				sequence_AndExpression(context, (AndExpression) semanticObject); 
				return; 
			case AiotMLPackage.ANNOTATED_ELEMENT:
				sequence_AnnotatedElement(context, (AnnotatedElement) semanticObject); 
				return; 
			case AiotMLPackage.APPEND:
				sequence_Append(context, (Append) semanticObject); 
				return; 
			case AiotMLPackage.ARRAY_INDEX:
				sequence_ArrayIndexPostfix(context, (ArrayIndex) semanticObject); 
				return; 
			case AiotMLPackage.ARRAY_INIT:
				sequence_ArrayInit(context, (ArrayInit) semanticObject); 
				return; 
			case AiotMLPackage.BOOLEAN_LITERAL:
				sequence_BooleanLiteral(context, (BooleanLiteral) semanticObject); 
				return; 
			case AiotMLPackage.BYTE_LITERAL:
				sequence_ByteLiteral(context, (ByteLiteral) semanticObject); 
				return; 
			case AiotMLPackage.CAST_EXPRESSION:
				sequence_CastExpression(context, (CastExpression) semanticObject); 
				return; 
			case AiotMLPackage.CHAR_LITERAL:
				sequence_CharLiteral(context, (CharLiteral) semanticObject); 
				return; 
			case AiotMLPackage.COMPOSITE_STATE:
				if (rule == grammarAccess.getCompositeStateRule()
						|| rule == grammarAccess.getStateContainerRule()) {
					sequence_CompositeState(context, (CompositeState) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedElementRule()
						|| rule == grammarAccess.getAnnotatedElementRule()
						|| rule == grammarAccess.getStateRule()) {
					sequence_CompositeState_StateMachine(context, (CompositeState) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getStateMachineRule()) {
					sequence_StateMachine(context, (CompositeState) semanticObject); 
					return; 
				}
				else break;
			case AiotMLPackage.CONDITIONAL_ACTION:
				sequence_ConditionalAction(context, (ConditionalAction) semanticObject); 
				return; 
			case AiotMLPackage.CONFIG_PROPERTY_ASSIGN:
				sequence_ConfigPropertyAssign(context, (ConfigPropertyAssign) semanticObject); 
				return; 
			case AiotMLPackage.CONFIGURATION:
				sequence_Configuration(context, (Configuration) semanticObject); 
				return; 
			case AiotMLPackage.CONNECTOR:
				sequence_Connector(context, (Connector) semanticObject); 
				return; 
			case AiotMLPackage.CPROPERTY:
				sequence_Cproperty(context, (Cproperty) semanticObject); 
				return; 
			case AiotMLPackage.CPROPERTY_ASSIGNMENT:
				sequence_CpropertyAssignment(context, (CpropertyAssignment) semanticObject); 
				return; 
			case AiotMLPackage.CPROPERTY_REFERENCE:
				sequence_CpropertyReference(context, (CpropertyReference) semanticObject); 
				return; 
			case AiotMLPackage.DECREMENT:
				sequence_Decrement(context, (Decrement) semanticObject); 
				return; 
			case AiotMLPackage.DICT_ASSIGNMENT:
				sequence_DictAssignment(context, (DictAssignment) semanticObject); 
				return; 
			case AiotMLPackage.DIV_EXPRESSION:
				sequence_Multiplication(context, (DivExpression) semanticObject); 
				return; 
			case AiotMLPackage.DOUBLE_LITERAL:
				sequence_DoubleLiteral(context, (DoubleLiteral) semanticObject); 
				return; 
			case AiotMLPackage.ENUM_LITERAL_REF:
				sequence_EnumLiteralRef(context, (EnumLiteralRef) semanticObject); 
				return; 
			case AiotMLPackage.ENUMERATION:
				sequence_Enumeration(context, (Enumeration) semanticObject); 
				return; 
			case AiotMLPackage.ENUMERATION_LITERAL:
				sequence_EnumerationLiteral(context, (EnumerationLiteral) semanticObject); 
				return; 
			case AiotMLPackage.EQUALS_EXPRESSION:
				sequence_Equality(context, (EqualsExpression) semanticObject); 
				return; 
			case AiotMLPackage.ERROR_ACTION:
				sequence_ErrorAction(context, (ErrorAction) semanticObject); 
				return; 
			case AiotMLPackage.EVENT_REFERENCE:
				sequence_EventReference(context, (EventReference) semanticObject); 
				return; 
			case AiotMLPackage.EXPRESSION_GROUP:
				sequence_Primary(context, (ExpressionGroup) semanticObject); 
				return; 
			case AiotMLPackage.EXTERN_EXPRESSION:
				sequence_ExternExpression(context, (ExternExpression) semanticObject); 
				return; 
			case AiotMLPackage.EXTERN_STATEMENT:
				sequence_ExternStatement(context, (ExternStatement) semanticObject); 
				return; 
			case AiotMLPackage.EXTERNAL_CONNECTOR:
				sequence_ExternalConnector(context, (ExternalConnector) semanticObject); 
				return; 
			case AiotMLPackage.FINAL_STATE:
				sequence_FinalState(context, (FinalState) semanticObject); 
				return; 
			case AiotMLPackage.FOR_ACTION:
				sequence_ForAction(context, (ForAction) semanticObject); 
				return; 
			case AiotMLPackage.FUNCTION:
				if (rule == grammarAccess.getAbstractFunctionRule()) {
					sequence_AbstractFunction(context, (Function) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getNamedElementRule()
						|| rule == grammarAccess.getAnnotatedElementRule()
						|| rule == grammarAccess.getFunctionRule()) {
					sequence_AbstractFunction_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case AiotMLPackage.FUNCTION_CALL_EXPRESSION:
				sequence_FunctionCallExpression(context, (FunctionCallExpression) semanticObject); 
				return; 
			case AiotMLPackage.FUNCTION_CALL_STATEMENT:
				sequence_FunctionCallStatement(context, (FunctionCallStatement) semanticObject); 
				return; 
			case AiotMLPackage.GREATER_EXPRESSION:
				sequence_Comparaison(context, (GreaterExpression) semanticObject); 
				return; 
			case AiotMLPackage.GREATER_OR_EQUAL_EXPRESSION:
				sequence_Comparaison(context, (GreaterOrEqualExpression) semanticObject); 
				return; 
			case AiotMLPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case AiotMLPackage.INCREMENT:
				sequence_Increment(context, (Increment) semanticObject); 
				return; 
			case AiotMLPackage.INSTANCE:
				sequence_Instance(context, (Instance) semanticObject); 
				return; 
			case AiotMLPackage.INTEGER_LITERAL:
				sequence_IntegerLiteral(context, (IntegerLiteral) semanticObject); 
				return; 
			case AiotMLPackage.INTERNAL_PORT:
				sequence_InternalPort(context, (InternalPort) semanticObject); 
				return; 
			case AiotMLPackage.INTERNAL_TRANSITION:
				sequence_InternalTransition(context, (InternalTransition) semanticObject); 
				return; 
			case AiotMLPackage.LAYER:
				sequence_Layer(context, (Layer) semanticObject); 
				return; 
			case AiotMLPackage.LOCAL_VARIABLE:
				sequence_LocalVariable(context, (LocalVariable) semanticObject); 
				return; 
			case AiotMLPackage.LOOP_ACTION:
				sequence_LoopAction(context, (LoopAction) semanticObject); 
				return; 
			case AiotMLPackage.LOWER_EXPRESSION:
				sequence_Comparaison(context, (LowerExpression) semanticObject); 
				return; 
			case AiotMLPackage.LOWER_OR_EQUAL_EXPRESSION:
				sequence_Comparaison(context, (LowerOrEqualExpression) semanticObject); 
				return; 
			case AiotMLPackage.MESSAGE:
				sequence_Message(context, (Message) semanticObject); 
				return; 
			case AiotMLPackage.MINUS_EXPRESSION:
				sequence_Addition(context, (MinusExpression) semanticObject); 
				return; 
			case AiotMLPackage.MOD_EXPRESSION:
				sequence_Multiplication(context, (ModExpression) semanticObject); 
				return; 
			case AiotMLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AiotMLPackage.MODEL_REFERENCE:
				sequence_ModelReference(context, (ModelReference) semanticObject); 
				return; 
			case AiotMLPackage.MULTI_AGENT:
				sequence_MultiAgent(context, (MultiAgent) semanticObject); 
				return; 
			case AiotMLPackage.MULTI_AGENT_PROPERTY:
				sequence_MultiAgentProperty(context, (MultiAgentProperty) semanticObject); 
				return; 
			case AiotMLPackage.NAMED_ELEMENT:
				sequence_NamedElement(context, (NamedElement) semanticObject); 
				return; 
			case AiotMLPackage.NOT_EQUALS_EXPRESSION:
				sequence_Equality(context, (NotEqualsExpression) semanticObject); 
				return; 
			case AiotMLPackage.NOT_EXPRESSION:
				sequence_Primary(context, (NotExpression) semanticObject); 
				return; 
			case AiotMLPackage.OBJECT_TYPE:
				sequence_ObjectType(context, (ObjectType) semanticObject); 
				return; 
			case AiotMLPackage.OR_EXPRESSION:
				sequence_OrExpression(context, (OrExpression) semanticObject); 
				return; 
			case AiotMLPackage.PARAMETER:
				sequence_Parameter(context, (org.aiotml.xtext.aiotML.Parameter) semanticObject); 
				return; 
			case AiotMLPackage.PLATFORM_ANNOTATION:
				sequence_PlatformAnnotation(context, (PlatformAnnotation) semanticObject); 
				return; 
			case AiotMLPackage.PLUS_EXPRESSION:
				sequence_Addition(context, (PlusExpression) semanticObject); 
				return; 
			case AiotMLPackage.PRIMITIVE_TYPE:
				sequence_PrimitiveType(context, (PrimitiveType) semanticObject); 
				return; 
			case AiotMLPackage.PRINT_ACTION:
				sequence_PrintAction(context, (PrintAction) semanticObject); 
				return; 
			case AiotMLPackage.PROPERTY:
				sequence_Property(context, (Property) semanticObject); 
				return; 
			case AiotMLPackage.PROPERTY_ASSIGN:
				sequence_PropertyAssign(context, (PropertyAssign) semanticObject); 
				return; 
			case AiotMLPackage.PROPERTY_REFERENCE:
				sequence_PropertyReference(context, (PropertyReference) semanticObject); 
				return; 
			case AiotMLPackage.PROTOCOL:
				sequence_Protocol(context, (Protocol) semanticObject); 
				return; 
			case AiotMLPackage.PROVIDED_PORT:
				sequence_ProvidedPort(context, (ProvidedPort) semanticObject); 
				return; 
			case AiotMLPackage.PYFOR_ACTION:
				sequence_PyforAction(context, (PyforAction) semanticObject); 
				return; 
			case AiotMLPackage.RECEIVE_MESSAGE:
				sequence_ReceiveMessage(context, (ReceiveMessage) semanticObject); 
				return; 
			case AiotMLPackage.REGION:
				sequence_Region(context, (Region) semanticObject); 
				return; 
			case AiotMLPackage.REQUIRED_PORT:
				sequence_RequiredPort(context, (RequiredPort) semanticObject); 
				return; 
			case AiotMLPackage.RETURN_ACTION:
				sequence_ReturnAction(context, (ReturnAction) semanticObject); 
				return; 
			case AiotMLPackage.SEND_ACTION:
				sequence_SendAction(context, (SendAction) semanticObject); 
				return; 
			case AiotMLPackage.SESSION:
				sequence_Session(context, (Session) semanticObject); 
				return; 
			case AiotMLPackage.START_SESSION:
				sequence_StartSession(context, (StartSession) semanticObject); 
				return; 
			case AiotMLPackage.STATE:
				sequence_State(context, (State) semanticObject); 
				return; 
			case AiotMLPackage.STATE_CONTAINER:
				sequence_StateContainer(context, (StateContainer) semanticObject); 
				return; 
			case AiotMLPackage.STRATEGY:
				sequence_Strategy(context, (Strategy) semanticObject); 
				return; 
			case AiotMLPackage.STRATEGY_ASSIGNMENT:
				sequence_StrategyAssignment(context, (StrategyAssignment) semanticObject); 
				return; 
			case AiotMLPackage.STRATEGY_PROPERTY:
				sequence_StrategyProperty(context, (StrategyProperty) semanticObject); 
				return; 
			case AiotMLPackage.STRATEGY_STREAM:
				sequence_StrategyStream(context, (StrategyStream) semanticObject); 
				return; 
			case AiotMLPackage.STRING_LITERAL:
				sequence_StringLiteral(context, (StringLiteral) semanticObject); 
				return; 
			case AiotMLPackage.SUB_THING:
				sequence_SubThing(context, (SubThing) semanticObject); 
				return; 
			case AiotMLPackage.TEMPLATE:
				sequence_Template(context, (Template) semanticObject); 
				return; 
			case AiotMLPackage.TENSOR:
				sequence_Tensor(context, (Tensor) semanticObject); 
				return; 
			case AiotMLPackage.THING:
				sequence_Thing(context, (Thing) semanticObject); 
				return; 
			case AiotMLPackage.TIMES_EXPRESSION:
				sequence_Multiplication(context, (TimesExpression) semanticObject); 
				return; 
			case AiotMLPackage.TRANSITION:
				sequence_Transition(context, (Transition) semanticObject); 
				return; 
			case AiotMLPackage.TYPE_REF:
				sequence_TypeRef(context, (TypeRef) semanticObject); 
				return; 
			case AiotMLPackage.UNARY_MINUS:
				sequence_Primary(context, (UnaryMinus) semanticObject); 
				return; 
			case AiotMLPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case AiotMLPackage.VARIABLE_ASSIGNMENT:
				sequence_VariableAssignment(context, (VariableAssignment) semanticObject); 
				return; 
			case AiotMLPackage.ZIP_ENUMERATE:
				sequence_ZipEnumerate(context, (ZipEnumerate) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AbstractFunction returns Function
	 *
	 * Constraint:
	 *     (abstract?='abstract' name=ID (parameters+=Parameter parameters+=Parameter*)? typeRef=TypeRef? annotations+=PlatformAnnotation*)
	 */
	protected void sequence_AbstractFunction(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Function
	 *     AnnotatedElement returns Function
	 *     Function returns Function
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             (parameters+=Parameter parameters+=Parameter*)? 
	 *             typeRef=TypeRef? 
	 *             extraTypeRef+=TypeRef* 
	 *             annotations+=PlatformAnnotation* 
	 *             body=Action
	 *         ) | 
	 *         (abstract?='abstract' name=ID (parameters+=Parameter parameters+=Parameter*)? typeRef=TypeRef? annotations+=PlatformAnnotation*)
	 *     )
	 */
	protected void sequence_AbstractFunction_Function(ISerializationContext context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ActionBlock
	 *     ActionBlock returns ActionBlock
	 *
	 * Constraint:
	 *     actions+=Action*
	 */
	protected void sequence_ActionBlock(ISerializationContext context, ActionBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns MinusExpression
	 *     OrExpression returns MinusExpression
	 *     OrExpression.OrExpression_1_0 returns MinusExpression
	 *     AndExpression returns MinusExpression
	 *     AndExpression.AndExpression_1_0 returns MinusExpression
	 *     Equality returns MinusExpression
	 *     Equality.EqualsExpression_1_0_0 returns MinusExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns MinusExpression
	 *     Comparaison returns MinusExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns MinusExpression
	 *     Comparaison.LowerExpression_1_1_0 returns MinusExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns MinusExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns MinusExpression
	 *     Addition returns MinusExpression
	 *     Addition.PlusExpression_1_0_0 returns MinusExpression
	 *     Addition.MinusExpression_1_1_0 returns MinusExpression
	 *
	 * Constraint:
	 *     (lhs=Addition_MinusExpression_1_1_0 rhs=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, MinusExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.MINUS_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.MINUS_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.MINUS_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.MINUS_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getMinusExpressionLhsAction_1_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PlusExpression
	 *     OrExpression returns PlusExpression
	 *     OrExpression.OrExpression_1_0 returns PlusExpression
	 *     AndExpression returns PlusExpression
	 *     AndExpression.AndExpression_1_0 returns PlusExpression
	 *     Equality returns PlusExpression
	 *     Equality.EqualsExpression_1_0_0 returns PlusExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns PlusExpression
	 *     Comparaison returns PlusExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns PlusExpression
	 *     Comparaison.LowerExpression_1_1_0 returns PlusExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns PlusExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns PlusExpression
	 *     Addition returns PlusExpression
	 *     Addition.PlusExpression_1_0_0 returns PlusExpression
	 *     Addition.MinusExpression_1_1_0 returns PlusExpression
	 *
	 * Constraint:
	 *     (lhs=Addition_PlusExpression_1_0_0 rhs=Multiplication)
	 */
	protected void sequence_Addition(ISerializationContext context, PlusExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.PLUS_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.PLUS_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.PLUS_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.PLUS_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAdditionAccess().getPlusExpressionLhsAction_1_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAdditionAccess().getRhsMultiplicationParserRuleCall_1_0_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Agent returns Agent
	 *
	 * Constraint:
	 *     (name=ID cardinality=IntegerLiteral? amodel=StrategyProperty)
	 */
	protected void sequence_Agent(ISerializationContext context, Agent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AiotMLModel returns AiotMLModel
	 *
	 * Constraint:
	 *     (
	 *         (((imports+=Import+ templates+=Template+) | templates+=Template+)? (types+=Type | protocols+=Protocol | configs+=Configuration)+) | 
	 *         (types+=Type | protocols+=Protocol | configs+=Configuration)+
	 *     )?
	 */
	protected void sequence_AiotMLModel(ISerializationContext context, AiotMLModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns AndExpression
	 *     OrExpression returns AndExpression
	 *     OrExpression.OrExpression_1_0 returns AndExpression
	 *     AndExpression returns AndExpression
	 *     AndExpression.AndExpression_1_0 returns AndExpression
	 *
	 * Constraint:
	 *     (lhs=AndExpression_AndExpression_1_0 rhs=Equality)
	 */
	protected void sequence_AndExpression(ISerializationContext context, AndExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.AND_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.AND_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.AND_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.AND_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionAccess().getAndExpressionLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAndExpressionAccess().getRhsEqualityParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AnnotatedElement returns AnnotatedElement
	 *
	 * Constraint:
	 *     annotations+=PlatformAnnotation+
	 */
	protected void sequence_AnnotatedElement(ISerializationContext context, AnnotatedElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Append
	 *     Append returns Append
	 *
	 * Constraint:
	 *     (pythonlist=[Variable|ID] element=Expression)
	 */
	protected void sequence_Append(ISerializationContext context, Append semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.APPEND__PYTHONLIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.APPEND__PYTHONLIST));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.APPEND__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.APPEND__ELEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAppendAccess().getPythonlistVariableIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AiotMLPackage.Literals.APPEND__PYTHONLIST, false));
		feeder.accept(grammarAccess.getAppendAccess().getElementExpressionParserRuleCall_4_0(), semanticObject.getElement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ArrayIndex
	 *     OrExpression returns ArrayIndex
	 *     OrExpression.OrExpression_1_0 returns ArrayIndex
	 *     AndExpression returns ArrayIndex
	 *     AndExpression.AndExpression_1_0 returns ArrayIndex
	 *     Equality returns ArrayIndex
	 *     Equality.EqualsExpression_1_0_0 returns ArrayIndex
	 *     Equality.NotEqualsExpression_1_1_0 returns ArrayIndex
	 *     Comparaison returns ArrayIndex
	 *     Comparaison.GreaterExpression_1_0_0 returns ArrayIndex
	 *     Comparaison.LowerExpression_1_1_0 returns ArrayIndex
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ArrayIndex
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ArrayIndex
	 *     Addition returns ArrayIndex
	 *     Addition.PlusExpression_1_0_0 returns ArrayIndex
	 *     Addition.MinusExpression_1_1_0 returns ArrayIndex
	 *     Multiplication returns ArrayIndex
	 *     Multiplication.TimesExpression_1_0_0 returns ArrayIndex
	 *     Multiplication.DivExpression_1_1_0 returns ArrayIndex
	 *     Multiplication.ModExpression_1_2_0 returns ArrayIndex
	 *     CastExpression returns ArrayIndex
	 *     CastExpression.CastExpression_1_0 returns ArrayIndex
	 *     Primary returns ArrayIndex
	 *     ArrayIndexPostfix returns ArrayIndex
	 *
	 * Constraint:
	 *     (array=ArrayIndexPostfix_ArrayIndex_1_0 index=Expression)
	 */
	protected void sequence_ArrayIndexPostfix(ISerializationContext context, ArrayIndex semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.ARRAY_INDEX__ARRAY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.ARRAY_INDEX__ARRAY));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.ARRAY_INDEX__INDEX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.ARRAY_INDEX__INDEX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getArrayIndexPostfixAccess().getArrayIndexArrayAction_1_0(), semanticObject.getArray());
		feeder.accept(grammarAccess.getArrayIndexPostfixAccess().getIndexExpressionParserRuleCall_1_2_0(), semanticObject.getIndex());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ArrayInit
	 *     OrExpression returns ArrayInit
	 *     OrExpression.OrExpression_1_0 returns ArrayInit
	 *     AndExpression returns ArrayInit
	 *     AndExpression.AndExpression_1_0 returns ArrayInit
	 *     Equality returns ArrayInit
	 *     Equality.EqualsExpression_1_0_0 returns ArrayInit
	 *     Equality.NotEqualsExpression_1_1_0 returns ArrayInit
	 *     Comparaison returns ArrayInit
	 *     Comparaison.GreaterExpression_1_0_0 returns ArrayInit
	 *     Comparaison.LowerExpression_1_1_0 returns ArrayInit
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ArrayInit
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ArrayInit
	 *     Addition returns ArrayInit
	 *     Addition.PlusExpression_1_0_0 returns ArrayInit
	 *     Addition.MinusExpression_1_1_0 returns ArrayInit
	 *     Multiplication returns ArrayInit
	 *     Multiplication.TimesExpression_1_0_0 returns ArrayInit
	 *     Multiplication.DivExpression_1_1_0 returns ArrayInit
	 *     Multiplication.ModExpression_1_2_0 returns ArrayInit
	 *     CastExpression returns ArrayInit
	 *     CastExpression.CastExpression_1_0 returns ArrayInit
	 *     Primary returns ArrayInit
	 *     ArrayIndexPostfix returns ArrayInit
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns ArrayInit
	 *     AtomicExpression returns ArrayInit
	 *     ArrayInit returns ArrayInit
	 *
	 * Constraint:
	 *     (values+=Expression values+=Expression*)
	 */
	protected void sequence_ArrayInit(ISerializationContext context, ArrayInit semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns BooleanLiteral
	 *     OrExpression returns BooleanLiteral
	 *     OrExpression.OrExpression_1_0 returns BooleanLiteral
	 *     AndExpression returns BooleanLiteral
	 *     AndExpression.AndExpression_1_0 returns BooleanLiteral
	 *     Equality returns BooleanLiteral
	 *     Equality.EqualsExpression_1_0_0 returns BooleanLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns BooleanLiteral
	 *     Comparaison returns BooleanLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns BooleanLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns BooleanLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns BooleanLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns BooleanLiteral
	 *     Addition returns BooleanLiteral
	 *     Addition.PlusExpression_1_0_0 returns BooleanLiteral
	 *     Addition.MinusExpression_1_1_0 returns BooleanLiteral
	 *     Multiplication returns BooleanLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns BooleanLiteral
	 *     Multiplication.DivExpression_1_1_0 returns BooleanLiteral
	 *     Multiplication.ModExpression_1_2_0 returns BooleanLiteral
	 *     CastExpression returns BooleanLiteral
	 *     CastExpression.CastExpression_1_0 returns BooleanLiteral
	 *     Primary returns BooleanLiteral
	 *     ArrayIndexPostfix returns BooleanLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns BooleanLiteral
	 *     AtomicExpression returns BooleanLiteral
	 *     Literal returns BooleanLiteral
	 *     BooleanLiteral returns BooleanLiteral
	 *
	 * Constraint:
	 *     boolValue?='true'?
	 */
	protected void sequence_BooleanLiteral(ISerializationContext context, BooleanLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ByteLiteral
	 *     OrExpression returns ByteLiteral
	 *     OrExpression.OrExpression_1_0 returns ByteLiteral
	 *     AndExpression returns ByteLiteral
	 *     AndExpression.AndExpression_1_0 returns ByteLiteral
	 *     Equality returns ByteLiteral
	 *     Equality.EqualsExpression_1_0_0 returns ByteLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns ByteLiteral
	 *     Comparaison returns ByteLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns ByteLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns ByteLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ByteLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ByteLiteral
	 *     Addition returns ByteLiteral
	 *     Addition.PlusExpression_1_0_0 returns ByteLiteral
	 *     Addition.MinusExpression_1_1_0 returns ByteLiteral
	 *     Multiplication returns ByteLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns ByteLiteral
	 *     Multiplication.DivExpression_1_1_0 returns ByteLiteral
	 *     Multiplication.ModExpression_1_2_0 returns ByteLiteral
	 *     CastExpression returns ByteLiteral
	 *     CastExpression.CastExpression_1_0 returns ByteLiteral
	 *     Primary returns ByteLiteral
	 *     ArrayIndexPostfix returns ByteLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns ByteLiteral
	 *     AtomicExpression returns ByteLiteral
	 *     Literal returns ByteLiteral
	 *     ByteLiteral returns ByteLiteral
	 *
	 * Constraint:
	 *     byteValue=BYTE
	 */
	protected void sequence_ByteLiteral(ISerializationContext context, ByteLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.BYTE_LITERAL__BYTE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.BYTE_LITERAL__BYTE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getByteLiteralAccess().getByteValueBYTETerminalRuleCall_0(), semanticObject.getByteValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CastExpression
	 *     OrExpression returns CastExpression
	 *     OrExpression.OrExpression_1_0 returns CastExpression
	 *     AndExpression returns CastExpression
	 *     AndExpression.AndExpression_1_0 returns CastExpression
	 *     Equality returns CastExpression
	 *     Equality.EqualsExpression_1_0_0 returns CastExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns CastExpression
	 *     Comparaison returns CastExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns CastExpression
	 *     Comparaison.LowerExpression_1_1_0 returns CastExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns CastExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns CastExpression
	 *     Addition returns CastExpression
	 *     Addition.PlusExpression_1_0_0 returns CastExpression
	 *     Addition.MinusExpression_1_1_0 returns CastExpression
	 *     Multiplication returns CastExpression
	 *     Multiplication.TimesExpression_1_0_0 returns CastExpression
	 *     Multiplication.DivExpression_1_1_0 returns CastExpression
	 *     Multiplication.ModExpression_1_2_0 returns CastExpression
	 *     CastExpression returns CastExpression
	 *
	 * Constraint:
	 *     (term=CastExpression_CastExpression_1_0 type=[Type|ID] isArray?='['?)
	 */
	protected void sequence_CastExpression(ISerializationContext context, CastExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CharLiteral
	 *     OrExpression returns CharLiteral
	 *     OrExpression.OrExpression_1_0 returns CharLiteral
	 *     AndExpression returns CharLiteral
	 *     AndExpression.AndExpression_1_0 returns CharLiteral
	 *     Equality returns CharLiteral
	 *     Equality.EqualsExpression_1_0_0 returns CharLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns CharLiteral
	 *     Comparaison returns CharLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns CharLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns CharLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns CharLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns CharLiteral
	 *     Addition returns CharLiteral
	 *     Addition.PlusExpression_1_0_0 returns CharLiteral
	 *     Addition.MinusExpression_1_1_0 returns CharLiteral
	 *     Multiplication returns CharLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns CharLiteral
	 *     Multiplication.DivExpression_1_1_0 returns CharLiteral
	 *     Multiplication.ModExpression_1_2_0 returns CharLiteral
	 *     CastExpression returns CharLiteral
	 *     CastExpression.CastExpression_1_0 returns CharLiteral
	 *     Primary returns CharLiteral
	 *     ArrayIndexPostfix returns CharLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns CharLiteral
	 *     AtomicExpression returns CharLiteral
	 *     Literal returns CharLiteral
	 *     CharLiteral returns CharLiteral
	 *
	 * Constraint:
	 *     charValue=CHAR
	 */
	protected void sequence_CharLiteral(ISerializationContext context, CharLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.CHAR_LITERAL__CHAR_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.CHAR_LITERAL__CHAR_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCharLiteralAccess().getCharValueCHARTerminalRuleCall_0(), semanticObject.getCharValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns GreaterExpression
	 *     OrExpression returns GreaterExpression
	 *     OrExpression.OrExpression_1_0 returns GreaterExpression
	 *     AndExpression returns GreaterExpression
	 *     AndExpression.AndExpression_1_0 returns GreaterExpression
	 *     Equality returns GreaterExpression
	 *     Equality.EqualsExpression_1_0_0 returns GreaterExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns GreaterExpression
	 *     Comparaison returns GreaterExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns GreaterExpression
	 *     Comparaison.LowerExpression_1_1_0 returns GreaterExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns GreaterExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns GreaterExpression
	 *
	 * Constraint:
	 *     (lhs=Comparaison_GreaterExpression_1_0_0 rhs=Addition)
	 */
	protected void sequence_Comparaison(ISerializationContext context, GreaterExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.GREATER_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.GREATER_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.GREATER_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.GREATER_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparaisonAccess().getGreaterExpressionLhsAction_1_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_0_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns GreaterOrEqualExpression
	 *     OrExpression returns GreaterOrEqualExpression
	 *     OrExpression.OrExpression_1_0 returns GreaterOrEqualExpression
	 *     AndExpression returns GreaterOrEqualExpression
	 *     AndExpression.AndExpression_1_0 returns GreaterOrEqualExpression
	 *     Equality returns GreaterOrEqualExpression
	 *     Equality.EqualsExpression_1_0_0 returns GreaterOrEqualExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns GreaterOrEqualExpression
	 *     Comparaison returns GreaterOrEqualExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns GreaterOrEqualExpression
	 *     Comparaison.LowerExpression_1_1_0 returns GreaterOrEqualExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns GreaterOrEqualExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns GreaterOrEqualExpression
	 *
	 * Constraint:
	 *     (lhs=Comparaison_GreaterOrEqualExpression_1_2_0 rhs=Addition)
	 */
	protected void sequence_Comparaison(ISerializationContext context, GreaterOrEqualExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.GREATER_OR_EQUAL_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.GREATER_OR_EQUAL_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.GREATER_OR_EQUAL_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.GREATER_OR_EQUAL_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparaisonAccess().getGreaterOrEqualExpressionLhsAction_1_2_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_2_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns LowerExpression
	 *     OrExpression returns LowerExpression
	 *     OrExpression.OrExpression_1_0 returns LowerExpression
	 *     AndExpression returns LowerExpression
	 *     AndExpression.AndExpression_1_0 returns LowerExpression
	 *     Equality returns LowerExpression
	 *     Equality.EqualsExpression_1_0_0 returns LowerExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns LowerExpression
	 *     Comparaison returns LowerExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns LowerExpression
	 *     Comparaison.LowerExpression_1_1_0 returns LowerExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns LowerExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns LowerExpression
	 *
	 * Constraint:
	 *     (lhs=Comparaison_LowerExpression_1_1_0 rhs=Addition)
	 */
	protected void sequence_Comparaison(ISerializationContext context, LowerExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOWER_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOWER_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOWER_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOWER_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparaisonAccess().getLowerExpressionLhsAction_1_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns LowerOrEqualExpression
	 *     OrExpression returns LowerOrEqualExpression
	 *     OrExpression.OrExpression_1_0 returns LowerOrEqualExpression
	 *     AndExpression returns LowerOrEqualExpression
	 *     AndExpression.AndExpression_1_0 returns LowerOrEqualExpression
	 *     Equality returns LowerOrEqualExpression
	 *     Equality.EqualsExpression_1_0_0 returns LowerOrEqualExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns LowerOrEqualExpression
	 *     Comparaison returns LowerOrEqualExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns LowerOrEqualExpression
	 *     Comparaison.LowerExpression_1_1_0 returns LowerOrEqualExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns LowerOrEqualExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns LowerOrEqualExpression
	 *
	 * Constraint:
	 *     (lhs=Comparaison_LowerOrEqualExpression_1_3_0 rhs=Addition)
	 */
	protected void sequence_Comparaison(ISerializationContext context, LowerOrEqualExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOWER_OR_EQUAL_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOWER_OR_EQUAL_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOWER_OR_EQUAL_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOWER_OR_EQUAL_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getComparaisonAccess().getLowerOrEqualExpressionLhsAction_1_3_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparaisonAccess().getRhsAdditionParserRuleCall_1_3_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     CompositeState returns CompositeState
	 *     StateContainer returns CompositeState
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         initial=[State|ID] 
	 *         history?='history'? 
	 *         annotations+=PlatformAnnotation* 
	 *         properties+=Property* 
	 *         (
	 *             entry=Action | 
	 *             exit=Action | 
	 *             properties+=Property | 
	 *             substate+=State | 
	 *             internal+=InternalTransition | 
	 *             outgoing+=Transition
	 *         )* 
	 *         region+=Region? 
	 *         (session+=Session? region+=Region?)*
	 *     )
	 */
	protected void sequence_CompositeState(ISerializationContext context, CompositeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns CompositeState
	 *     AnnotatedElement returns CompositeState
	 *     State returns CompositeState
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             name=ID 
	 *             initial=[State|ID] 
	 *             history?='history'? 
	 *             annotations+=PlatformAnnotation* 
	 *             properties+=Property* 
	 *             (
	 *                 entry=Action | 
	 *                 exit=Action | 
	 *                 properties+=Property | 
	 *                 substate+=State | 
	 *                 internal+=InternalTransition | 
	 *                 outgoing+=Transition
	 *             )* 
	 *             session+=Session? 
	 *             (region+=Region? session+=Session?)*
	 *         ) | 
	 *         (
	 *             name=ID? 
	 *             initial=[State|ID] 
	 *             history?='history'? 
	 *             annotations+=PlatformAnnotation* 
	 *             properties+=Property* 
	 *             internal+=InternalTransition? 
	 *             ((entry=Action | exit=Action | properties+=Property | substate+=State)? internal+=InternalTransition?)* 
	 *             (region+=Region | session+=Session)*
	 *         )
	 *     )
	 */
	protected void sequence_CompositeState_StateMachine(ISerializationContext context, CompositeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ConditionalAction
	 *     ConditionalAction returns ConditionalAction
	 *
	 * Constraint:
	 *     (condition=Expression action=Action elseAction=Action?)
	 */
	protected void sequence_ConditionalAction(ISerializationContext context, ConditionalAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ConfigPropertyAssign returns ConfigPropertyAssign
	 *
	 * Constraint:
	 *     (instance=[Instance|ID] property=[Property|ID] index=Expression? init=Expression annotations+=PlatformAnnotation*)
	 */
	protected void sequence_ConfigPropertyAssign(ISerializationContext context, ConfigPropertyAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Configuration
	 *     AnnotatedElement returns Configuration
	 *     Configuration returns Configuration
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation* (instances+=Instance | connectors+=AbstractConnector | propassigns+=ConfigPropertyAssign)*)
	 */
	protected void sequence_Configuration(ISerializationContext context, Configuration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Connector
	 *     AnnotatedElement returns Connector
	 *     AbstractConnector returns Connector
	 *     Connector returns Connector
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         cli=[Instance|ID] 
	 *         required=[RequiredPort|ID] 
	 *         srv=[Instance|ID] 
	 *         provided=[ProvidedPort|ID] 
	 *         annotations+=PlatformAnnotation*
	 *     )
	 */
	protected void sequence_Connector(ISerializationContext context, Connector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns CpropertyAssignment
	 *     CpropertyAssignment returns CpropertyAssignment
	 *
	 * Constraint:
	 *     (cpropertys+=[Variable|ID] cindex=Expression? (property=[Variable|ID] pindex=Expression?)? expression=Expression)
	 */
	protected void sequence_CpropertyAssignment(ISerializationContext context, CpropertyAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns CpropertyReference
	 *     OrExpression returns CpropertyReference
	 *     OrExpression.OrExpression_1_0 returns CpropertyReference
	 *     AndExpression returns CpropertyReference
	 *     AndExpression.AndExpression_1_0 returns CpropertyReference
	 *     Equality returns CpropertyReference
	 *     Equality.EqualsExpression_1_0_0 returns CpropertyReference
	 *     Equality.NotEqualsExpression_1_1_0 returns CpropertyReference
	 *     Comparaison returns CpropertyReference
	 *     Comparaison.GreaterExpression_1_0_0 returns CpropertyReference
	 *     Comparaison.LowerExpression_1_1_0 returns CpropertyReference
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns CpropertyReference
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns CpropertyReference
	 *     Addition returns CpropertyReference
	 *     Addition.PlusExpression_1_0_0 returns CpropertyReference
	 *     Addition.MinusExpression_1_1_0 returns CpropertyReference
	 *     Multiplication returns CpropertyReference
	 *     Multiplication.TimesExpression_1_0_0 returns CpropertyReference
	 *     Multiplication.DivExpression_1_1_0 returns CpropertyReference
	 *     Multiplication.ModExpression_1_2_0 returns CpropertyReference
	 *     CastExpression returns CpropertyReference
	 *     CastExpression.CastExpression_1_0 returns CpropertyReference
	 *     Primary returns CpropertyReference
	 *     ArrayIndexPostfix returns CpropertyReference
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns CpropertyReference
	 *     AtomicExpression returns CpropertyReference
	 *     CpropertyReference returns CpropertyReference
	 *
	 * Constraint:
	 *     (cpropertys+=[Variable|ID] cindex=Expression? (property=[Variable|ID] pindex=Expression?)?)
	 */
	protected void sequence_CpropertyReference(ISerializationContext context, CpropertyReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Cproperty
	 *     AnnotatedElement returns Cproperty
	 *     Variable returns Cproperty
	 *     Cproperty returns Cproperty
	 *
	 * Constraint:
	 *     (name=ID (typeRef=TypeRef | tensor=Tensor) annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Cproperty(ISerializationContext context, Cproperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Decrement
	 *     Decrement returns Decrement
	 *
	 * Constraint:
	 *     var=[Variable|ID]
	 */
	protected void sequence_Decrement(ISerializationContext context, Decrement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.DECREMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.DECREMENT__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecrementAccess().getVarVariableIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AiotMLPackage.Literals.DECREMENT__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns DictAssignment
	 *     DictAssignment returns DictAssignment
	 *
	 * Constraint:
	 *     (dict=[Variable|ID] elements+=[Variable|ID]* var=[Variable|ID])
	 */
	protected void sequence_DictAssignment(ISerializationContext context, DictAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns DoubleLiteral
	 *     OrExpression returns DoubleLiteral
	 *     OrExpression.OrExpression_1_0 returns DoubleLiteral
	 *     AndExpression returns DoubleLiteral
	 *     AndExpression.AndExpression_1_0 returns DoubleLiteral
	 *     Equality returns DoubleLiteral
	 *     Equality.EqualsExpression_1_0_0 returns DoubleLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns DoubleLiteral
	 *     Comparaison returns DoubleLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns DoubleLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns DoubleLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns DoubleLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns DoubleLiteral
	 *     Addition returns DoubleLiteral
	 *     Addition.PlusExpression_1_0_0 returns DoubleLiteral
	 *     Addition.MinusExpression_1_1_0 returns DoubleLiteral
	 *     Multiplication returns DoubleLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns DoubleLiteral
	 *     Multiplication.DivExpression_1_1_0 returns DoubleLiteral
	 *     Multiplication.ModExpression_1_2_0 returns DoubleLiteral
	 *     CastExpression returns DoubleLiteral
	 *     CastExpression.CastExpression_1_0 returns DoubleLiteral
	 *     Primary returns DoubleLiteral
	 *     ArrayIndexPostfix returns DoubleLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns DoubleLiteral
	 *     AtomicExpression returns DoubleLiteral
	 *     Literal returns DoubleLiteral
	 *     DoubleLiteral returns DoubleLiteral
	 *
	 * Constraint:
	 *     doubleValue=FLOAT
	 */
	protected void sequence_DoubleLiteral(ISerializationContext context, DoubleLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.DOUBLE_LITERAL__DOUBLE_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.DOUBLE_LITERAL__DOUBLE_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDoubleLiteralAccess().getDoubleValueFLOATTerminalRuleCall_0(), semanticObject.getDoubleValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns EnumLiteralRef
	 *     OrExpression returns EnumLiteralRef
	 *     OrExpression.OrExpression_1_0 returns EnumLiteralRef
	 *     AndExpression returns EnumLiteralRef
	 *     AndExpression.AndExpression_1_0 returns EnumLiteralRef
	 *     Equality returns EnumLiteralRef
	 *     Equality.EqualsExpression_1_0_0 returns EnumLiteralRef
	 *     Equality.NotEqualsExpression_1_1_0 returns EnumLiteralRef
	 *     Comparaison returns EnumLiteralRef
	 *     Comparaison.GreaterExpression_1_0_0 returns EnumLiteralRef
	 *     Comparaison.LowerExpression_1_1_0 returns EnumLiteralRef
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns EnumLiteralRef
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns EnumLiteralRef
	 *     Addition returns EnumLiteralRef
	 *     Addition.PlusExpression_1_0_0 returns EnumLiteralRef
	 *     Addition.MinusExpression_1_1_0 returns EnumLiteralRef
	 *     Multiplication returns EnumLiteralRef
	 *     Multiplication.TimesExpression_1_0_0 returns EnumLiteralRef
	 *     Multiplication.DivExpression_1_1_0 returns EnumLiteralRef
	 *     Multiplication.ModExpression_1_2_0 returns EnumLiteralRef
	 *     CastExpression returns EnumLiteralRef
	 *     CastExpression.CastExpression_1_0 returns EnumLiteralRef
	 *     Primary returns EnumLiteralRef
	 *     ArrayIndexPostfix returns EnumLiteralRef
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns EnumLiteralRef
	 *     AtomicExpression returns EnumLiteralRef
	 *     Literal returns EnumLiteralRef
	 *     EnumLiteralRef returns EnumLiteralRef
	 *
	 * Constraint:
	 *     (enum=[Enumeration|ID] literal=[EnumerationLiteral|ID])
	 */
	protected void sequence_EnumLiteralRef(ISerializationContext context, EnumLiteralRef semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.ENUM_LITERAL_REF__ENUM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.ENUM_LITERAL_REF__ENUM));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.ENUM_LITERAL_REF__LITERAL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.ENUM_LITERAL_REF__LITERAL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumLiteralRefAccess().getEnumEnumerationIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AiotMLPackage.Literals.ENUM_LITERAL_REF__ENUM, false));
		feeder.accept(grammarAccess.getEnumLiteralRefAccess().getLiteralEnumerationLiteralIDTerminalRuleCall_2_0_1(), semanticObject.eGet(AiotMLPackage.Literals.ENUM_LITERAL_REF__LITERAL, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns EnumerationLiteral
	 *     AnnotatedElement returns EnumerationLiteral
	 *     EnumerationLiteral returns EnumerationLiteral
	 *
	 * Constraint:
	 *     (name=ID init=Literal? annotations+=PlatformAnnotation*)
	 */
	protected void sequence_EnumerationLiteral(ISerializationContext context, EnumerationLiteral semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Enumeration
	 *     AnnotatedElement returns Enumeration
	 *     Type returns Enumeration
	 *     Enumeration returns Enumeration
	 *
	 * Constraint:
	 *     (name=ID typeRef=TypeRef? annotations+=PlatformAnnotation* literals+=EnumerationLiteral*)
	 */
	protected void sequence_Enumeration(ISerializationContext context, Enumeration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns EqualsExpression
	 *     OrExpression returns EqualsExpression
	 *     OrExpression.OrExpression_1_0 returns EqualsExpression
	 *     AndExpression returns EqualsExpression
	 *     AndExpression.AndExpression_1_0 returns EqualsExpression
	 *     Equality returns EqualsExpression
	 *     Equality.EqualsExpression_1_0_0 returns EqualsExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns EqualsExpression
	 *
	 * Constraint:
	 *     (lhs=Equality_EqualsExpression_1_0_0 rhs=Comparaison)
	 */
	protected void sequence_Equality(ISerializationContext context, EqualsExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.EQUALS_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.EQUALS_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.EQUALS_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.EQUALS_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityAccess().getEqualsExpressionLhsAction_1_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_0_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NotEqualsExpression
	 *     OrExpression returns NotEqualsExpression
	 *     OrExpression.OrExpression_1_0 returns NotEqualsExpression
	 *     AndExpression returns NotEqualsExpression
	 *     AndExpression.AndExpression_1_0 returns NotEqualsExpression
	 *     Equality returns NotEqualsExpression
	 *     Equality.EqualsExpression_1_0_0 returns NotEqualsExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns NotEqualsExpression
	 *
	 * Constraint:
	 *     (lhs=Equality_NotEqualsExpression_1_1_0 rhs=Comparaison)
	 */
	protected void sequence_Equality(ISerializationContext context, NotEqualsExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NOT_EQUALS_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NOT_EQUALS_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NOT_EQUALS_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NOT_EQUALS_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEqualityAccess().getNotEqualsExpressionLhsAction_1_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getEqualityAccess().getRhsComparaisonParserRuleCall_1_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ErrorAction
	 *     ErrorAction returns ErrorAction
	 *
	 * Constraint:
	 *     (line?='errorln'? msg+=Expression msg+=Expression*)
	 */
	protected void sequence_ErrorAction(ISerializationContext context, ErrorAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns EventReference
	 *     OrExpression returns EventReference
	 *     OrExpression.OrExpression_1_0 returns EventReference
	 *     AndExpression returns EventReference
	 *     AndExpression.AndExpression_1_0 returns EventReference
	 *     Equality returns EventReference
	 *     Equality.EqualsExpression_1_0_0 returns EventReference
	 *     Equality.NotEqualsExpression_1_1_0 returns EventReference
	 *     Comparaison returns EventReference
	 *     Comparaison.GreaterExpression_1_0_0 returns EventReference
	 *     Comparaison.LowerExpression_1_1_0 returns EventReference
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns EventReference
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns EventReference
	 *     Addition returns EventReference
	 *     Addition.PlusExpression_1_0_0 returns EventReference
	 *     Addition.MinusExpression_1_1_0 returns EventReference
	 *     Multiplication returns EventReference
	 *     Multiplication.TimesExpression_1_0_0 returns EventReference
	 *     Multiplication.DivExpression_1_1_0 returns EventReference
	 *     Multiplication.ModExpression_1_2_0 returns EventReference
	 *     CastExpression returns EventReference
	 *     CastExpression.CastExpression_1_0 returns EventReference
	 *     Primary returns EventReference
	 *     ArrayIndexPostfix returns EventReference
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns EventReference
	 *     AtomicExpression returns EventReference
	 *     EventReference returns EventReference
	 *
	 * Constraint:
	 *     (receiveMsg=[Event|ID] parameter=[Parameter|ID])
	 */
	protected void sequence_EventReference(ISerializationContext context, EventReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.EVENT_REFERENCE__RECEIVE_MSG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.EVENT_REFERENCE__RECEIVE_MSG));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.EVENT_REFERENCE__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.EVENT_REFERENCE__PARAMETER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventReferenceAccess().getReceiveMsgEventIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AiotMLPackage.Literals.EVENT_REFERENCE__RECEIVE_MSG, false));
		feeder.accept(grammarAccess.getEventReferenceAccess().getParameterParameterIDTerminalRuleCall_2_0_1(), semanticObject.eGet(AiotMLPackage.Literals.EVENT_REFERENCE__PARAMETER, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ExternExpression
	 *     OrExpression returns ExternExpression
	 *     OrExpression.OrExpression_1_0 returns ExternExpression
	 *     AndExpression returns ExternExpression
	 *     AndExpression.AndExpression_1_0 returns ExternExpression
	 *     Equality returns ExternExpression
	 *     Equality.EqualsExpression_1_0_0 returns ExternExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns ExternExpression
	 *     Comparaison returns ExternExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns ExternExpression
	 *     Comparaison.LowerExpression_1_1_0 returns ExternExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ExternExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ExternExpression
	 *     Addition returns ExternExpression
	 *     Addition.PlusExpression_1_0_0 returns ExternExpression
	 *     Addition.MinusExpression_1_1_0 returns ExternExpression
	 *     Multiplication returns ExternExpression
	 *     Multiplication.TimesExpression_1_0_0 returns ExternExpression
	 *     Multiplication.DivExpression_1_1_0 returns ExternExpression
	 *     Multiplication.ModExpression_1_2_0 returns ExternExpression
	 *     CastExpression returns ExternExpression
	 *     CastExpression.CastExpression_1_0 returns ExternExpression
	 *     Primary returns ExternExpression
	 *     ArrayIndexPostfix returns ExternExpression
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns ExternExpression
	 *     AtomicExpression returns ExternExpression
	 *     ExternExpression returns ExternExpression
	 *
	 * Constraint:
	 *     (expression=EXTERN segments+=Expression*)
	 */
	protected void sequence_ExternExpression(ISerializationContext context, ExternExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ExternStatement
	 *     ExternStatement returns ExternStatement
	 *
	 * Constraint:
	 *     (statement=EXTERN segments+=Expression*)
	 */
	protected void sequence_ExternStatement(ISerializationContext context, ExternStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns ExternalConnector
	 *     AnnotatedElement returns ExternalConnector
	 *     AbstractConnector returns ExternalConnector
	 *     ExternalConnector returns ExternalConnector
	 *
	 * Constraint:
	 *     (name=ID? inst=[Instance|ID] port=[Port|ID] protocol=[Protocol|ID] annotations+=PlatformAnnotation*)
	 */
	protected void sequence_ExternalConnector(ISerializationContext context, ExternalConnector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns FinalState
	 *     AnnotatedElement returns FinalState
	 *     State returns FinalState
	 *     FinalState returns FinalState
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation* entry=Action?)
	 */
	protected void sequence_FinalState(ISerializationContext context, FinalState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ForAction
	 *     ForAction returns ForAction
	 *
	 * Constraint:
	 *     (variable=Parameter index=Parameter? array=PropertyReference action=Action)
	 */
	protected void sequence_ForAction(ISerializationContext context, ForAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns FunctionCallExpression
	 *     OrExpression returns FunctionCallExpression
	 *     OrExpression.OrExpression_1_0 returns FunctionCallExpression
	 *     AndExpression returns FunctionCallExpression
	 *     AndExpression.AndExpression_1_0 returns FunctionCallExpression
	 *     Equality returns FunctionCallExpression
	 *     Equality.EqualsExpression_1_0_0 returns FunctionCallExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns FunctionCallExpression
	 *     Comparaison returns FunctionCallExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns FunctionCallExpression
	 *     Comparaison.LowerExpression_1_1_0 returns FunctionCallExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns FunctionCallExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns FunctionCallExpression
	 *     Addition returns FunctionCallExpression
	 *     Addition.PlusExpression_1_0_0 returns FunctionCallExpression
	 *     Addition.MinusExpression_1_1_0 returns FunctionCallExpression
	 *     Multiplication returns FunctionCallExpression
	 *     Multiplication.TimesExpression_1_0_0 returns FunctionCallExpression
	 *     Multiplication.DivExpression_1_1_0 returns FunctionCallExpression
	 *     Multiplication.ModExpression_1_2_0 returns FunctionCallExpression
	 *     CastExpression returns FunctionCallExpression
	 *     CastExpression.CastExpression_1_0 returns FunctionCallExpression
	 *     Primary returns FunctionCallExpression
	 *     ArrayIndexPostfix returns FunctionCallExpression
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns FunctionCallExpression
	 *     AtomicExpression returns FunctionCallExpression
	 *     FunctionCallExpression returns FunctionCallExpression
	 *
	 * Constraint:
	 *     (function=[Function|ID] (parameters+=Expression parameters+=Expression*)?)
	 */
	protected void sequence_FunctionCallExpression(ISerializationContext context, FunctionCallExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns FunctionCallStatement
	 *     FunctionCallStatement returns FunctionCallStatement
	 *
	 * Constraint:
	 *     (function=[Function|ID] (parameters+=Expression parameters+=Expression*)?)
	 */
	protected void sequence_FunctionCallStatement(ISerializationContext context, FunctionCallStatement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     (importURI=STRING from=ID?)
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns Increment
	 *     Increment returns Increment
	 *
	 * Constraint:
	 *     var=[Variable|ID]
	 */
	protected void sequence_Increment(ISerializationContext context, Increment semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.INCREMENT__VAR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.INCREMENT__VAR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIncrementAccess().getVarVariableIDTerminalRuleCall_0_0_1(), semanticObject.eGet(AiotMLPackage.Literals.INCREMENT__VAR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Instance
	 *     AnnotatedElement returns Instance
	 *     Instance returns Instance
	 *
	 * Constraint:
	 *     (name=ID type=[Thing|ID] annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Instance(ISerializationContext context, Instance semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns IntegerLiteral
	 *     OrExpression returns IntegerLiteral
	 *     OrExpression.OrExpression_1_0 returns IntegerLiteral
	 *     AndExpression returns IntegerLiteral
	 *     AndExpression.AndExpression_1_0 returns IntegerLiteral
	 *     Equality returns IntegerLiteral
	 *     Equality.EqualsExpression_1_0_0 returns IntegerLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns IntegerLiteral
	 *     Comparaison returns IntegerLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns IntegerLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns IntegerLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns IntegerLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns IntegerLiteral
	 *     Addition returns IntegerLiteral
	 *     Addition.PlusExpression_1_0_0 returns IntegerLiteral
	 *     Addition.MinusExpression_1_1_0 returns IntegerLiteral
	 *     Multiplication returns IntegerLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns IntegerLiteral
	 *     Multiplication.DivExpression_1_1_0 returns IntegerLiteral
	 *     Multiplication.ModExpression_1_2_0 returns IntegerLiteral
	 *     CastExpression returns IntegerLiteral
	 *     CastExpression.CastExpression_1_0 returns IntegerLiteral
	 *     Primary returns IntegerLiteral
	 *     ArrayIndexPostfix returns IntegerLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns IntegerLiteral
	 *     AtomicExpression returns IntegerLiteral
	 *     Literal returns IntegerLiteral
	 *     IntegerLiteral returns IntegerLiteral
	 *
	 * Constraint:
	 *     intValue=INT
	 */
	protected void sequence_IntegerLiteral(ISerializationContext context, IntegerLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.INTEGER_LITERAL__INT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.INTEGER_LITERAL__INT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerLiteralAccess().getIntValueINTTerminalRuleCall_0(), semanticObject.getIntValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns InternalPort
	 *     AnnotatedElement returns InternalPort
	 *     Port returns InternalPort
	 *     InternalPort returns InternalPort
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation* ((sends+=[Message|ID] sends+=[Message|ID]*) | (receives+=[Message|ID] receives+=[Message|ID]*))*)
	 */
	protected void sequence_InternalPort(ISerializationContext context, InternalPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns InternalTransition
	 *     AnnotatedElement returns InternalTransition
	 *     Handler returns InternalTransition
	 *     InternalTransition returns InternalTransition
	 *
	 * Constraint:
	 *     (name=ID? annotations+=PlatformAnnotation* event=Event? guard=Expression? action=Action?)
	 */
	protected void sequence_InternalTransition(ISerializationContext context, InternalTransition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Layer returns Layer
	 *
	 * Constraint:
	 *     (((layernums+=IntegerLiteral layernums+=IntegerLiteral*) | num='None') (af='relu' | af='sigmoid' | af='None'))
	 */
	protected void sequence_Layer(ISerializationContext context, Layer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns LocalVariable
	 *     AnnotatedElement returns LocalVariable
	 *     Variable returns LocalVariable
	 *     Action returns LocalVariable
	 *     LocalVariable returns LocalVariable
	 *
	 * Constraint:
	 *     (readonly?='readonly'? name=ID ((typeRef=TypeRef init=Expression?) | tensor=Tensor) annotations+=PlatformAnnotation*)
	 */
	protected void sequence_LocalVariable(ISerializationContext context, LocalVariable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns LoopAction
	 *     LoopAction returns LoopAction
	 *
	 * Constraint:
	 *     (condition=Expression action=Action)
	 */
	protected void sequence_LoopAction(ISerializationContext context, LoopAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOOP_ACTION__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOOP_ACTION__CONDITION));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.LOOP_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.LOOP_ACTION__ACTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLoopActionAccess().getConditionExpressionParserRuleCall_2_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getLoopActionAccess().getActionActionParserRuleCall_4_0(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Message
	 *     AnnotatedElement returns Message
	 *     Message returns Message
	 *
	 * Constraint:
	 *     (name=ID (parameters+=Parameter parameters+=Parameter*)? annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Message(ISerializationContext context, Message semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns ModelReference
	 *     ModelReference returns ModelReference
	 *
	 * Constraint:
	 *     (name=ID typeRef=TypeRef)
	 */
	protected void sequence_ModelReference(ISerializationContext context, ModelReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.MODEL_REFERENCE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.MODEL_REFERENCE__TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelReferenceAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getModelReferenceAccess().getTypeRefTypeRefParserRuleCall_4_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Model
	 *     AnnotatedElement returns Model
	 *     Type returns Model
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (name=ID layers+=Layer*)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns MultiAgentProperty
	 *     AnnotatedElement returns MultiAgentProperty
	 *     Variable returns MultiAgentProperty
	 *     MultiAgentProperty returns MultiAgentProperty
	 *
	 * Constraint:
	 *     (name=ID typeRef=TypeRef)
	 */
	protected void sequence_MultiAgentProperty(ISerializationContext context, MultiAgentProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.VARIABLE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.VARIABLE__TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiAgentPropertyAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getMultiAgentPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns MultiAgent
	 *     AnnotatedElement returns MultiAgent
	 *     Type returns MultiAgent
	 *     MultiAgent returns MultiAgent
	 *
	 * Constraint:
	 *     (name=ID agents+=Agent* annotations+=PlatformAnnotation*)
	 */
	protected void sequence_MultiAgent(ISerializationContext context, MultiAgent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns DivExpression
	 *     OrExpression returns DivExpression
	 *     OrExpression.OrExpression_1_0 returns DivExpression
	 *     AndExpression returns DivExpression
	 *     AndExpression.AndExpression_1_0 returns DivExpression
	 *     Equality returns DivExpression
	 *     Equality.EqualsExpression_1_0_0 returns DivExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns DivExpression
	 *     Comparaison returns DivExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns DivExpression
	 *     Comparaison.LowerExpression_1_1_0 returns DivExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns DivExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns DivExpression
	 *     Addition returns DivExpression
	 *     Addition.PlusExpression_1_0_0 returns DivExpression
	 *     Addition.MinusExpression_1_1_0 returns DivExpression
	 *     Multiplication returns DivExpression
	 *     Multiplication.TimesExpression_1_0_0 returns DivExpression
	 *     Multiplication.DivExpression_1_1_0 returns DivExpression
	 *     Multiplication.ModExpression_1_2_0 returns DivExpression
	 *
	 * Constraint:
	 *     (lhs=Multiplication_DivExpression_1_1_0 rhs=CastExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, DivExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.DIV_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.DIV_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.DIV_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.DIV_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getDivExpressionLhsAction_1_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ModExpression
	 *     OrExpression returns ModExpression
	 *     OrExpression.OrExpression_1_0 returns ModExpression
	 *     AndExpression returns ModExpression
	 *     AndExpression.AndExpression_1_0 returns ModExpression
	 *     Equality returns ModExpression
	 *     Equality.EqualsExpression_1_0_0 returns ModExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns ModExpression
	 *     Comparaison returns ModExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns ModExpression
	 *     Comparaison.LowerExpression_1_1_0 returns ModExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ModExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ModExpression
	 *     Addition returns ModExpression
	 *     Addition.PlusExpression_1_0_0 returns ModExpression
	 *     Addition.MinusExpression_1_1_0 returns ModExpression
	 *     Multiplication returns ModExpression
	 *     Multiplication.TimesExpression_1_0_0 returns ModExpression
	 *     Multiplication.DivExpression_1_1_0 returns ModExpression
	 *     Multiplication.ModExpression_1_2_0 returns ModExpression
	 *
	 * Constraint:
	 *     (lhs=Multiplication_ModExpression_1_2_0 rhs=CastExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, ModExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.MOD_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.MOD_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.MOD_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.MOD_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getModExpressionLhsAction_1_2_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_2_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns TimesExpression
	 *     OrExpression returns TimesExpression
	 *     OrExpression.OrExpression_1_0 returns TimesExpression
	 *     AndExpression returns TimesExpression
	 *     AndExpression.AndExpression_1_0 returns TimesExpression
	 *     Equality returns TimesExpression
	 *     Equality.EqualsExpression_1_0_0 returns TimesExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns TimesExpression
	 *     Comparaison returns TimesExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns TimesExpression
	 *     Comparaison.LowerExpression_1_1_0 returns TimesExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns TimesExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns TimesExpression
	 *     Addition returns TimesExpression
	 *     Addition.PlusExpression_1_0_0 returns TimesExpression
	 *     Addition.MinusExpression_1_1_0 returns TimesExpression
	 *     Multiplication returns TimesExpression
	 *     Multiplication.TimesExpression_1_0_0 returns TimesExpression
	 *     Multiplication.DivExpression_1_1_0 returns TimesExpression
	 *     Multiplication.ModExpression_1_2_0 returns TimesExpression
	 *
	 * Constraint:
	 *     (lhs=Multiplication_TimesExpression_1_0_0 rhs=CastExpression)
	 */
	protected void sequence_Multiplication(ISerializationContext context, TimesExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.TIMES_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.TIMES_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.TIMES_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.TIMES_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMultiplicationAccess().getTimesExpressionLhsAction_1_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultiplicationAccess().getRhsCastExpressionParserRuleCall_1_0_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns NamedElement
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_NamedElement(ISerializationContext context, NamedElement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNamedElementAccess().getNameIDTerminalRuleCall_17_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns ObjectType
	 *     AnnotatedElement returns ObjectType
	 *     Type returns ObjectType
	 *     ObjectType returns ObjectType
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation*)
	 */
	protected void sequence_ObjectType(ISerializationContext context, ObjectType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns OrExpression
	 *     OrExpression returns OrExpression
	 *     OrExpression.OrExpression_1_0 returns OrExpression
	 *
	 * Constraint:
	 *     (lhs=OrExpression_OrExpression_1_0 rhs=AndExpression)
	 */
	protected void sequence_OrExpression(ISerializationContext context, OrExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.OR_EXPRESSION__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.OR_EXPRESSION__LHS));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.OR_EXPRESSION__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.OR_EXPRESSION__RHS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionAccess().getOrExpressionLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getOrExpressionAccess().getRhsAndExpressionParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Parameter
	 *     AnnotatedElement returns Parameter
	 *     Variable returns Parameter
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (name=ID typeRef=TypeRef annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Parameter(ISerializationContext context, org.aiotml.xtext.aiotML.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     PlatformAnnotation returns PlatformAnnotation
	 *
	 * Constraint:
	 *     (name=ANNOTATION_ID (value=EXTERN | value=STRING)?)
	 */
	protected void sequence_PlatformAnnotation(ISerializationContext context, PlatformAnnotation semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns ExpressionGroup
	 *     OrExpression returns ExpressionGroup
	 *     OrExpression.OrExpression_1_0 returns ExpressionGroup
	 *     AndExpression returns ExpressionGroup
	 *     AndExpression.AndExpression_1_0 returns ExpressionGroup
	 *     Equality returns ExpressionGroup
	 *     Equality.EqualsExpression_1_0_0 returns ExpressionGroup
	 *     Equality.NotEqualsExpression_1_1_0 returns ExpressionGroup
	 *     Comparaison returns ExpressionGroup
	 *     Comparaison.GreaterExpression_1_0_0 returns ExpressionGroup
	 *     Comparaison.LowerExpression_1_1_0 returns ExpressionGroup
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns ExpressionGroup
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns ExpressionGroup
	 *     Addition returns ExpressionGroup
	 *     Addition.PlusExpression_1_0_0 returns ExpressionGroup
	 *     Addition.MinusExpression_1_1_0 returns ExpressionGroup
	 *     Multiplication returns ExpressionGroup
	 *     Multiplication.TimesExpression_1_0_0 returns ExpressionGroup
	 *     Multiplication.DivExpression_1_1_0 returns ExpressionGroup
	 *     Multiplication.ModExpression_1_2_0 returns ExpressionGroup
	 *     CastExpression returns ExpressionGroup
	 *     CastExpression.CastExpression_1_0 returns ExpressionGroup
	 *     Primary returns ExpressionGroup
	 *
	 * Constraint:
	 *     term=Expression
	 */
	protected void sequence_Primary(ISerializationContext context, ExpressionGroup semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.EXPRESSION_GROUP__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.EXPRESSION_GROUP__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getTermExpressionParserRuleCall_0_2_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns NotExpression
	 *     OrExpression returns NotExpression
	 *     OrExpression.OrExpression_1_0 returns NotExpression
	 *     AndExpression returns NotExpression
	 *     AndExpression.AndExpression_1_0 returns NotExpression
	 *     Equality returns NotExpression
	 *     Equality.EqualsExpression_1_0_0 returns NotExpression
	 *     Equality.NotEqualsExpression_1_1_0 returns NotExpression
	 *     Comparaison returns NotExpression
	 *     Comparaison.GreaterExpression_1_0_0 returns NotExpression
	 *     Comparaison.LowerExpression_1_1_0 returns NotExpression
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns NotExpression
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns NotExpression
	 *     Addition returns NotExpression
	 *     Addition.PlusExpression_1_0_0 returns NotExpression
	 *     Addition.MinusExpression_1_1_0 returns NotExpression
	 *     Multiplication returns NotExpression
	 *     Multiplication.TimesExpression_1_0_0 returns NotExpression
	 *     Multiplication.DivExpression_1_1_0 returns NotExpression
	 *     Multiplication.ModExpression_1_2_0 returns NotExpression
	 *     CastExpression returns NotExpression
	 *     CastExpression.CastExpression_1_0 returns NotExpression
	 *     Primary returns NotExpression
	 *
	 * Constraint:
	 *     term=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, NotExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NOT_EXPRESSION__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NOT_EXPRESSION__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_1_2_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns UnaryMinus
	 *     OrExpression returns UnaryMinus
	 *     OrExpression.OrExpression_1_0 returns UnaryMinus
	 *     AndExpression returns UnaryMinus
	 *     AndExpression.AndExpression_1_0 returns UnaryMinus
	 *     Equality returns UnaryMinus
	 *     Equality.EqualsExpression_1_0_0 returns UnaryMinus
	 *     Equality.NotEqualsExpression_1_1_0 returns UnaryMinus
	 *     Comparaison returns UnaryMinus
	 *     Comparaison.GreaterExpression_1_0_0 returns UnaryMinus
	 *     Comparaison.LowerExpression_1_1_0 returns UnaryMinus
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns UnaryMinus
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns UnaryMinus
	 *     Addition returns UnaryMinus
	 *     Addition.PlusExpression_1_0_0 returns UnaryMinus
	 *     Addition.MinusExpression_1_1_0 returns UnaryMinus
	 *     Multiplication returns UnaryMinus
	 *     Multiplication.TimesExpression_1_0_0 returns UnaryMinus
	 *     Multiplication.DivExpression_1_1_0 returns UnaryMinus
	 *     Multiplication.ModExpression_1_2_0 returns UnaryMinus
	 *     CastExpression returns UnaryMinus
	 *     CastExpression.CastExpression_1_0 returns UnaryMinus
	 *     Primary returns UnaryMinus
	 *
	 * Constraint:
	 *     term=Primary
	 */
	protected void sequence_Primary(ISerializationContext context, UnaryMinus semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.UNARY_MINUS__TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.UNARY_MINUS__TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryAccess().getTermPrimaryParserRuleCall_2_2_0(), semanticObject.getTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns PrimitiveType
	 *     AnnotatedElement returns PrimitiveType
	 *     Type returns PrimitiveType
	 *     PrimitiveType returns PrimitiveType
	 *
	 * Constraint:
	 *     (name=ID ByteSize=INT annotations+=PlatformAnnotation*)
	 */
	protected void sequence_PrimitiveType(ISerializationContext context, PrimitiveType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns PrintAction
	 *     PrintAction returns PrintAction
	 *
	 * Constraint:
	 *     (line?='println'? msg+=Expression msg+=Expression*)
	 */
	protected void sequence_PrintAction(ISerializationContext context, PrintAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     AnnotatedElement returns PropertyAssign
	 *     PropertyAssign returns PropertyAssign
	 *
	 * Constraint:
	 *     (property=[Property|ID] index=Expression? init=Expression annotations+=PlatformAnnotation*)
	 */
	protected void sequence_PropertyAssign(ISerializationContext context, PropertyAssign semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns PropertyReference
	 *     OrExpression returns PropertyReference
	 *     OrExpression.OrExpression_1_0 returns PropertyReference
	 *     AndExpression returns PropertyReference
	 *     AndExpression.AndExpression_1_0 returns PropertyReference
	 *     Equality returns PropertyReference
	 *     Equality.EqualsExpression_1_0_0 returns PropertyReference
	 *     Equality.NotEqualsExpression_1_1_0 returns PropertyReference
	 *     Comparaison returns PropertyReference
	 *     Comparaison.GreaterExpression_1_0_0 returns PropertyReference
	 *     Comparaison.LowerExpression_1_1_0 returns PropertyReference
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns PropertyReference
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns PropertyReference
	 *     Addition returns PropertyReference
	 *     Addition.PlusExpression_1_0_0 returns PropertyReference
	 *     Addition.MinusExpression_1_1_0 returns PropertyReference
	 *     Multiplication returns PropertyReference
	 *     Multiplication.TimesExpression_1_0_0 returns PropertyReference
	 *     Multiplication.DivExpression_1_1_0 returns PropertyReference
	 *     Multiplication.ModExpression_1_2_0 returns PropertyReference
	 *     CastExpression returns PropertyReference
	 *     CastExpression.CastExpression_1_0 returns PropertyReference
	 *     Primary returns PropertyReference
	 *     ArrayIndexPostfix returns PropertyReference
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns PropertyReference
	 *     AtomicExpression returns PropertyReference
	 *     PropertyReference returns PropertyReference
	 *
	 * Constraint:
	 *     property=[Variable|ID]
	 */
	protected void sequence_PropertyReference(ISerializationContext context, PropertyReference semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.PROPERTY_REFERENCE__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.PROPERTY_REFERENCE__PROPERTY));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPropertyReferenceAccess().getPropertyVariableIDTerminalRuleCall_0_1(), semanticObject.eGet(AiotMLPackage.Literals.PROPERTY_REFERENCE__PROPERTY, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Property
	 *     AnnotatedElement returns Property
	 *     Variable returns Property
	 *     Property returns Property
	 *
	 * Constraint:
	 *     (readonly?='readonly'? name=ID ((typeRef=TypeRef init=Expression?) | tensor=Tensor) annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Property(ISerializationContext context, Property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Protocol
	 *     AnnotatedElement returns Protocol
	 *     Protocol returns Protocol
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation*)
	 */
	protected void sequence_Protocol(ISerializationContext context, Protocol semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns ProvidedPort
	 *     AnnotatedElement returns ProvidedPort
	 *     Port returns ProvidedPort
	 *     ProvidedPort returns ProvidedPort
	 *
	 * Constraint:
	 *     (name=ID annotations+=PlatformAnnotation* ((sends+=[Message|ID] sends+=[Message|ID]*) | (receives+=[Message|ID] receives+=[Message|ID]*))*)
	 */
	protected void sequence_ProvidedPort(ISerializationContext context, ProvidedPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns PyforAction
	 *     PyforAction returns PyforAction
	 *
	 * Constraint:
	 *     (variables+=Parameter variables+=Parameter* arrays+=PropertyReference arrays+=PropertyReference* action=Action)
	 */
	protected void sequence_PyforAction(ISerializationContext context, PyforAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns ReceiveMessage
	 *     Event returns ReceiveMessage
	 *     ReceiveMessage returns ReceiveMessage
	 *
	 * Constraint:
	 *     (name=ID? port=[Port|ID] message=[Message|ID])
	 */
	protected void sequence_ReceiveMessage(ISerializationContext context, ReceiveMessage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Region
	 *     AnnotatedElement returns Region
	 *     Region returns Region
	 *     StateContainer returns Region
	 *
	 * Constraint:
	 *     (name=ID? initial=[State|ID] history?='history'? annotations+=PlatformAnnotation* substate+=State*)
	 */
	protected void sequence_Region(ISerializationContext context, Region semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns RequiredPort
	 *     AnnotatedElement returns RequiredPort
	 *     Port returns RequiredPort
	 *     RequiredPort returns RequiredPort
	 *
	 * Constraint:
	 *     (
	 *         optional?='optional'? 
	 *         name=ID 
	 *         annotations+=PlatformAnnotation* 
	 *         ((sends+=[Message|ID] sends+=[Message|ID]*) | (receives+=[Message|ID] receives+=[Message|ID]*))*
	 *     )
	 */
	protected void sequence_RequiredPort(ISerializationContext context, RequiredPort semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ReturnAction
	 *     ReturnAction returns ReturnAction
	 *
	 * Constraint:
	 *     (exp=Expression? extraExp+=Expression*)
	 */
	protected void sequence_ReturnAction(ISerializationContext context, ReturnAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns SendAction
	 *     SendAction returns SendAction
	 *
	 * Constraint:
	 *     (port=[Port|ID] message=[Message|ID] (parameters+=Expression parameters+=Expression*)?)
	 */
	protected void sequence_SendAction(ISerializationContext context, SendAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Session
	 *     AnnotatedElement returns Session
	 *     Session returns Session
	 *     StateContainer returns Session
	 *
	 * Constraint:
	 *     (name=ID (maxInstances=IntegerLiteral | maxInstances=PropertyReference)? initial=[State|ID] annotations+=PlatformAnnotation* substate+=State*)
	 */
	protected void sequence_Session(ISerializationContext context, Session semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns StartSession
	 *     StartSession returns StartSession
	 *
	 * Constraint:
	 *     session=[Session|ID]
	 */
	protected void sequence_StartSession(ISerializationContext context, StartSession semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.START_SESSION__SESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.START_SESSION__SESSION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStartSessionAccess().getSessionSessionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(AiotMLPackage.Literals.START_SESSION__SESSION, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns StateContainer
	 *     AnnotatedElement returns StateContainer
	 *     StateContainer returns StateContainer
	 *
	 * Constraint:
	 *     (initial=[State|ID] history?='history'? substate+=State*)
	 */
	protected void sequence_StateContainer(ISerializationContext context, StateContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StateMachine returns CompositeState
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         initial=[State|ID] 
	 *         history?='history'? 
	 *         annotations+=PlatformAnnotation* 
	 *         properties+=Property* 
	 *         (entry=Action | exit=Action | properties+=Property | substate+=State | internal+=InternalTransition)* 
	 *         region+=Region? 
	 *         (session+=Session? region+=Region?)*
	 *     )
	 */
	protected void sequence_StateMachine(ISerializationContext context, CompositeState semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns State
	 *     AnnotatedElement returns State
	 *     State returns State
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         annotations+=PlatformAnnotation* 
	 *         properties+=Property* 
	 *         (entry=Action | exit=Action | properties+=Property | internal+=InternalTransition | outgoing+=Transition)*
	 *     )
	 */
	protected void sequence_State(ISerializationContext context, State semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     StrategyAssignment returns StrategyAssignment
	 *
	 * Constraint:
	 *     (strategy=[Variable|ID] agent=[Agent|ID] (rbindFunction=[Property|ID] | ibindFunction=[Property|ID] | obindFunction=[Property|ID]))
	 */
	protected void sequence_StrategyAssignment(ISerializationContext context, StrategyAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns StrategyProperty
	 *     AnnotatedElement returns StrategyProperty
	 *     Variable returns StrategyProperty
	 *     StrategyProperty returns StrategyProperty
	 *
	 * Constraint:
	 *     (name=ID typeRef=TypeRef)
	 */
	protected void sequence_StrategyProperty(ISerializationContext context, StrategyProperty semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.NAMED_ELEMENT__NAME));
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.VARIABLE__TYPE_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.VARIABLE__TYPE_REF));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStrategyPropertyAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getStrategyPropertyAccess().getTypeRefTypeRefParserRuleCall_4_0(), semanticObject.getTypeRef());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Action returns StrategyStream
	 *     StrategyStream returns StrategyStream
	 *
	 * Constraint:
	 *     (inputs+=[Variable|ID] inputs+=[Variable|ID]* strategy=[Variable|ID] outputs+=[Variable|ID] outputs+=[Variable|ID]*)
	 */
	protected void sequence_StrategyStream(ISerializationContext context, StrategyStream semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Strategy
	 *     AnnotatedElement returns Strategy
	 *     Type returns Strategy
	 *     Strategy returns Strategy
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             (
	 *                 tensor=Tensor | 
	 *                 tensor=Tensor | 
	 *                 devices+=Cproperty | 
	 *                 tensor=Tensor | 
	 *                 pmodel=ModelReference | 
	 *                 qmodel=ModelReference
	 *             )? 
	 *             (actiondims+=IntegerLiteral actiondims+=IntegerLiteral*)? 
	 *             (rewdims+=IntegerLiteral rewdims+=IntegerLiteral*)? 
	 *             (obsdims+=IntegerLiteral obsdims+=IntegerLiteral*)?
	 *         )+ 
	 *         annotations+=PlatformAnnotation*
	 *     )
	 */
	protected void sequence_Strategy(ISerializationContext context, Strategy semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Expression returns StringLiteral
	 *     OrExpression returns StringLiteral
	 *     OrExpression.OrExpression_1_0 returns StringLiteral
	 *     AndExpression returns StringLiteral
	 *     AndExpression.AndExpression_1_0 returns StringLiteral
	 *     Equality returns StringLiteral
	 *     Equality.EqualsExpression_1_0_0 returns StringLiteral
	 *     Equality.NotEqualsExpression_1_1_0 returns StringLiteral
	 *     Comparaison returns StringLiteral
	 *     Comparaison.GreaterExpression_1_0_0 returns StringLiteral
	 *     Comparaison.LowerExpression_1_1_0 returns StringLiteral
	 *     Comparaison.GreaterOrEqualExpression_1_2_0 returns StringLiteral
	 *     Comparaison.LowerOrEqualExpression_1_3_0 returns StringLiteral
	 *     Addition returns StringLiteral
	 *     Addition.PlusExpression_1_0_0 returns StringLiteral
	 *     Addition.MinusExpression_1_1_0 returns StringLiteral
	 *     Multiplication returns StringLiteral
	 *     Multiplication.TimesExpression_1_0_0 returns StringLiteral
	 *     Multiplication.DivExpression_1_1_0 returns StringLiteral
	 *     Multiplication.ModExpression_1_2_0 returns StringLiteral
	 *     CastExpression returns StringLiteral
	 *     CastExpression.CastExpression_1_0 returns StringLiteral
	 *     Primary returns StringLiteral
	 *     ArrayIndexPostfix returns StringLiteral
	 *     ArrayIndexPostfix.ArrayIndex_1_0 returns StringLiteral
	 *     AtomicExpression returns StringLiteral
	 *     Literal returns StringLiteral
	 *     StringLiteral returns StringLiteral
	 *
	 * Constraint:
	 *     stringValue=STRING
	 */
	protected void sequence_StringLiteral(ISerializationContext context, StringLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.STRING_LITERAL__STRING_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.STRING_LITERAL__STRING_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringLiteralAccess().getStringValueSTRINGTerminalRuleCall_0(), semanticObject.getStringValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns SubThing
	 *     AnnotatedElement returns SubThing
	 *     Type returns SubThing
	 *     SubThing returns SubThing
	 *
	 * Constraint:
	 *     (name=ID (properties+=Property | functions+=Function)*)
	 */
	protected void sequence_SubThing(ISerializationContext context, SubThing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Template returns Template
	 *
	 * Constraint:
	 *     path=STRING
	 */
	protected void sequence_Template(ISerializationContext context, Template semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, AiotMLPackage.Literals.TEMPLATE__PATH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AiotMLPackage.Literals.TEMPLATE__PATH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTemplateAccess().getPathSTRINGTerminalRuleCall_1_0(), semanticObject.getPath());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Tensor returns Tensor
	 *
	 * Constraint:
	 *     (dims+=IntegerLiteral dims+=IntegerLiteral* datatype=ID?)
	 */
	protected void sequence_Tensor(ISerializationContext context, Tensor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Thing
	 *     AnnotatedElement returns Thing
	 *     Type returns Thing
	 *     Thing returns Thing
	 *
	 * Constraint:
	 *     (
	 *         fragment?='fragment'? 
	 *         name=ID 
	 *         (includes+=[Thing|ID] includes+=[Thing|ID]*)? 
	 *         annotations+=PlatformAnnotation* 
	 *         (
	 *             messages+=Message | 
	 *             ports+=Port | 
	 *             properties+=Property | 
	 *             cproperties+=Cproperty | 
	 *             functions+=Function | 
	 *             assign+=PropertyAssign | 
	 *             strategys+=StrategyProperty | 
	 *             sassigns+=StrategyAssignment | 
	 *             mas+=MultiAgentProperty
	 *         )* 
	 *         behaviour=StateMachine?
	 *     )
	 */
	protected void sequence_Thing(ISerializationContext context, Thing semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Transition
	 *     AnnotatedElement returns Transition
	 *     Handler returns Transition
	 *     Transition returns Transition
	 *
	 * Constraint:
	 *     (
	 *         name=ID? 
	 *         target=[State|ID] 
	 *         annotations+=PlatformAnnotation* 
	 *         event=Event? 
	 *         guard=Expression? 
	 *         action=Action?
	 *     )
	 */
	protected void sequence_Transition(ISerializationContext context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypeRef returns TypeRef
	 *
	 * Constraint:
	 *     (type=[Type|ID] (isArray?='[' (cardinality=IntegerLiteral | cardinality=PropertyReference)?)?)
	 */
	protected void sequence_TypeRef(ISerializationContext context, TypeRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns VariableAssignment
	 *     VariableAssignment returns VariableAssignment
	 *
	 * Constraint:
	 *     (property=[Variable|ID] index=Expression? (extraProperty+=[Variable|ID] extraIndex+=Expression?)* expression=Expression)
	 */
	protected void sequence_VariableAssignment(ISerializationContext context, VariableAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     NamedElement returns Variable
	 *     AnnotatedElement returns Variable
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     ((name=ID typeRef=TypeRef) | tensor=Tensor)
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Action returns ZipEnumerate
	 *     ZipEnumerate returns ZipEnumerate
	 *
	 * Constraint:
	 *     (
	 *         vars+=[Variable|ID] 
	 *         vars+=[Variable|ID]* 
	 *         (fname='zip' | fname='enumerate') 
	 *         sets+=[Variable|ID] 
	 *         sets+=[Variable|ID]* 
	 *         action=Action
	 *     )
	 */
	protected void sequence_ZipEnumerate(ISerializationContext context, ZipEnumerate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
