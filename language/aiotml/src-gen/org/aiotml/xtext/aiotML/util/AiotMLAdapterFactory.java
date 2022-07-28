/**
 * *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *  *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.aiotml.xtext.aiotML.util;

import org.aiotml.xtext.aiotML.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.aiotml.xtext.aiotML.AiotMLPackage
 * @generated
 */
public class AiotMLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AiotMLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiotMLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AiotMLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AiotMLSwitch<Adapter> modelSwitch =
    new AiotMLSwitch<Adapter>()
    {
      @Override
      public Adapter caseAiotMLModel(AiotMLModel object)
      {
        return createAiotMLModelAdapter();
      }
      @Override
      public Adapter caseTemplate(Template object)
      {
        return createTemplateAdapter();
      }
      @Override
      public Adapter caseImport(Import object)
      {
        return createImportAdapter();
      }
      @Override
      public Adapter casePlatformAnnotation(PlatformAnnotation object)
      {
        return createPlatformAnnotationAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseAnnotatedElement(AnnotatedElement object)
      {
        return createAnnotatedElementAdapter();
      }
      @Override
      public Adapter caseVariable(Variable object)
      {
        return createVariableAdapter();
      }
      @Override
      public Adapter caseTypeRef(TypeRef object)
      {
        return createTypeRefAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveType(PrimitiveType object)
      {
        return createPrimitiveTypeAdapter();
      }
      @Override
      public Adapter caseObjectType(ObjectType object)
      {
        return createObjectTypeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseEnumerationLiteral(EnumerationLiteral object)
      {
        return createEnumerationLiteralAdapter();
      }
      @Override
      public Adapter caseTensor(Tensor object)
      {
        return createTensorAdapter();
      }
      @Override
      public Adapter caseLayer(Layer object)
      {
        return createLayerAdapter();
      }
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseModelReference(ModelReference object)
      {
        return createModelReferenceAdapter();
      }
      @Override
      public Adapter caseStrategy(Strategy object)
      {
        return createStrategyAdapter();
      }
      @Override
      public Adapter caseMultiAgent(MultiAgent object)
      {
        return createMultiAgentAdapter();
      }
      @Override
      public Adapter caseMultiAgentProperty(MultiAgentProperty object)
      {
        return createMultiAgentPropertyAdapter();
      }
      @Override
      public Adapter caseStrategyProperty(StrategyProperty object)
      {
        return createStrategyPropertyAdapter();
      }
      @Override
      public Adapter caseStrategyAssignment(StrategyAssignment object)
      {
        return createStrategyAssignmentAdapter();
      }
      @Override
      public Adapter caseThing(Thing object)
      {
        return createThingAdapter();
      }
      @Override
      public Adapter caseSubThing(SubThing object)
      {
        return createSubThingAdapter();
      }
      @Override
      public Adapter caseAgent(Agent object)
      {
        return createAgentAdapter();
      }
      @Override
      public Adapter caseCproperty(Cproperty object)
      {
        return createCpropertyAdapter();
      }
      @Override
      public Adapter casePropertyAssign(PropertyAssign object)
      {
        return createPropertyAssignAdapter();
      }
      @Override
      public Adapter caseProtocol(Protocol object)
      {
        return createProtocolAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseMessage(Message object)
      {
        return createMessageAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter casePort(Port object)
      {
        return createPortAdapter();
      }
      @Override
      public Adapter caseRequiredPort(RequiredPort object)
      {
        return createRequiredPortAdapter();
      }
      @Override
      public Adapter caseProvidedPort(ProvidedPort object)
      {
        return createProvidedPortAdapter();
      }
      @Override
      public Adapter caseInternalPort(InternalPort object)
      {
        return createInternalPortAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseHandler(Handler object)
      {
        return createHandlerAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseInternalTransition(InternalTransition object)
      {
        return createInternalTransitionAdapter();
      }
      @Override
      public Adapter caseCompositeState(CompositeState object)
      {
        return createCompositeStateAdapter();
      }
      @Override
      public Adapter caseSession(Session object)
      {
        return createSessionAdapter();
      }
      @Override
      public Adapter caseRegion(Region object)
      {
        return createRegionAdapter();
      }
      @Override
      public Adapter caseFinalState(FinalState object)
      {
        return createFinalStateAdapter();
      }
      @Override
      public Adapter caseStateContainer(StateContainer object)
      {
        return createStateContainerAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseReceiveMessage(ReceiveMessage object)
      {
        return createReceiveMessageAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseActionBlock(ActionBlock object)
      {
        return createActionBlockAdapter();
      }
      @Override
      public Adapter caseExternStatement(ExternStatement object)
      {
        return createExternStatementAdapter();
      }
      @Override
      public Adapter caseLocalVariable(LocalVariable object)
      {
        return createLocalVariableAdapter();
      }
      @Override
      public Adapter caseSendAction(SendAction object)
      {
        return createSendActionAdapter();
      }
      @Override
      public Adapter caseVariableAssignment(VariableAssignment object)
      {
        return createVariableAssignmentAdapter();
      }
      @Override
      public Adapter caseCpropertyAssignment(CpropertyAssignment object)
      {
        return createCpropertyAssignmentAdapter();
      }
      @Override
      public Adapter caseStrategyStream(StrategyStream object)
      {
        return createStrategyStreamAdapter();
      }
      @Override
      public Adapter caseDictAssignment(DictAssignment object)
      {
        return createDictAssignmentAdapter();
      }
      @Override
      public Adapter caseZipEnumerate(ZipEnumerate object)
      {
        return createZipEnumerateAdapter();
      }
      @Override
      public Adapter caseAppend(Append object)
      {
        return createAppendAdapter();
      }
      @Override
      public Adapter caseIncrement(Increment object)
      {
        return createIncrementAdapter();
      }
      @Override
      public Adapter caseDecrement(Decrement object)
      {
        return createDecrementAdapter();
      }
      @Override
      public Adapter caseForAction(ForAction object)
      {
        return createForActionAdapter();
      }
      @Override
      public Adapter casePyforAction(PyforAction object)
      {
        return createPyforActionAdapter();
      }
      @Override
      public Adapter caseLoopAction(LoopAction object)
      {
        return createLoopActionAdapter();
      }
      @Override
      public Adapter caseConditionalAction(ConditionalAction object)
      {
        return createConditionalActionAdapter();
      }
      @Override
      public Adapter caseReturnAction(ReturnAction object)
      {
        return createReturnActionAdapter();
      }
      @Override
      public Adapter casePrintAction(PrintAction object)
      {
        return createPrintActionAdapter();
      }
      @Override
      public Adapter caseErrorAction(ErrorAction object)
      {
        return createErrorActionAdapter();
      }
      @Override
      public Adapter caseStartSession(StartSession object)
      {
        return createStartSessionAdapter();
      }
      @Override
      public Adapter caseFunctionCallStatement(FunctionCallStatement object)
      {
        return createFunctionCallStatementAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseExternExpression(ExternExpression object)
      {
        return createExternExpressionAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter caseArrayInit(ArrayInit object)
      {
        return createArrayInitAdapter();
      }
      @Override
      public Adapter caseEnumLiteralRef(EnumLiteralRef object)
      {
        return createEnumLiteralRefAdapter();
      }
      @Override
      public Adapter caseByteLiteral(ByteLiteral object)
      {
        return createByteLiteralAdapter();
      }
      @Override
      public Adapter caseCharLiteral(CharLiteral object)
      {
        return createCharLiteralAdapter();
      }
      @Override
      public Adapter caseIntegerLiteral(IntegerLiteral object)
      {
        return createIntegerLiteralAdapter();
      }
      @Override
      public Adapter caseBooleanLiteral(BooleanLiteral object)
      {
        return createBooleanLiteralAdapter();
      }
      @Override
      public Adapter caseStringLiteral(StringLiteral object)
      {
        return createStringLiteralAdapter();
      }
      @Override
      public Adapter caseDoubleLiteral(DoubleLiteral object)
      {
        return createDoubleLiteralAdapter();
      }
      @Override
      public Adapter casePropertyReference(PropertyReference object)
      {
        return createPropertyReferenceAdapter();
      }
      @Override
      public Adapter caseCpropertyReference(CpropertyReference object)
      {
        return createCpropertyReferenceAdapter();
      }
      @Override
      public Adapter caseEventReference(EventReference object)
      {
        return createEventReferenceAdapter();
      }
      @Override
      public Adapter caseFunctionCallExpression(FunctionCallExpression object)
      {
        return createFunctionCallExpressionAdapter();
      }
      @Override
      public Adapter caseConfiguration(Configuration object)
      {
        return createConfigurationAdapter();
      }
      @Override
      public Adapter caseInstance(Instance object)
      {
        return createInstanceAdapter();
      }
      @Override
      public Adapter caseConfigPropertyAssign(ConfigPropertyAssign object)
      {
        return createConfigPropertyAssignAdapter();
      }
      @Override
      public Adapter caseAbstractConnector(AbstractConnector object)
      {
        return createAbstractConnectorAdapter();
      }
      @Override
      public Adapter caseConnector(Connector object)
      {
        return createConnectorAdapter();
      }
      @Override
      public Adapter caseExternalConnector(ExternalConnector object)
      {
        return createExternalConnectorAdapter();
      }
      @Override
      public Adapter caseOrExpression(OrExpression object)
      {
        return createOrExpressionAdapter();
      }
      @Override
      public Adapter caseAndExpression(AndExpression object)
      {
        return createAndExpressionAdapter();
      }
      @Override
      public Adapter caseEqualsExpression(EqualsExpression object)
      {
        return createEqualsExpressionAdapter();
      }
      @Override
      public Adapter caseNotEqualsExpression(NotEqualsExpression object)
      {
        return createNotEqualsExpressionAdapter();
      }
      @Override
      public Adapter caseGreaterExpression(GreaterExpression object)
      {
        return createGreaterExpressionAdapter();
      }
      @Override
      public Adapter caseLowerExpression(LowerExpression object)
      {
        return createLowerExpressionAdapter();
      }
      @Override
      public Adapter caseGreaterOrEqualExpression(GreaterOrEqualExpression object)
      {
        return createGreaterOrEqualExpressionAdapter();
      }
      @Override
      public Adapter caseLowerOrEqualExpression(LowerOrEqualExpression object)
      {
        return createLowerOrEqualExpressionAdapter();
      }
      @Override
      public Adapter casePlusExpression(PlusExpression object)
      {
        return createPlusExpressionAdapter();
      }
      @Override
      public Adapter caseMinusExpression(MinusExpression object)
      {
        return createMinusExpressionAdapter();
      }
      @Override
      public Adapter caseTimesExpression(TimesExpression object)
      {
        return createTimesExpressionAdapter();
      }
      @Override
      public Adapter caseDivExpression(DivExpression object)
      {
        return createDivExpressionAdapter();
      }
      @Override
      public Adapter caseModExpression(ModExpression object)
      {
        return createModExpressionAdapter();
      }
      @Override
      public Adapter caseCastExpression(CastExpression object)
      {
        return createCastExpressionAdapter();
      }
      @Override
      public Adapter caseExpressionGroup(ExpressionGroup object)
      {
        return createExpressionGroupAdapter();
      }
      @Override
      public Adapter caseNotExpression(NotExpression object)
      {
        return createNotExpressionAdapter();
      }
      @Override
      public Adapter caseUnaryMinus(UnaryMinus object)
      {
        return createUnaryMinusAdapter();
      }
      @Override
      public Adapter caseArrayIndex(ArrayIndex object)
      {
        return createArrayIndexAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.AiotMLModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.AiotMLModel
   * @generated
   */
  public Adapter createAiotMLModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Template
   * @generated
   */
  public Adapter createTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Import
   * @generated
   */
  public Adapter createImportAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PlatformAnnotation <em>Platform Annotation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PlatformAnnotation
   * @generated
   */
  public Adapter createPlatformAnnotationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.AnnotatedElement <em>Annotated Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.AnnotatedElement
   * @generated
   */
  public Adapter createAnnotatedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Variable
   * @generated
   */
  public Adapter createVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.TypeRef
   * @generated
   */
  public Adapter createTypeRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PrimitiveType
   * @generated
   */
  public Adapter createPrimitiveTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ObjectType
   * @generated
   */
  public Adapter createObjectTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.EnumerationLiteral
   * @generated
   */
  public Adapter createEnumerationLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Tensor <em>Tensor</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Tensor
   * @generated
   */
  public Adapter createTensorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Layer
   * @generated
   */
  public Adapter createLayerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ModelReference
   * @generated
   */
  public Adapter createModelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Strategy
   * @generated
   */
  public Adapter createStrategyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.MultiAgent <em>Multi Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.MultiAgent
   * @generated
   */
  public Adapter createMultiAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.MultiAgentProperty <em>Multi Agent Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.MultiAgentProperty
   * @generated
   */
  public Adapter createMultiAgentPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StrategyProperty <em>Strategy Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StrategyProperty
   * @generated
   */
  public Adapter createStrategyPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StrategyAssignment <em>Strategy Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment
   * @generated
   */
  public Adapter createStrategyAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Thing
   * @generated
   */
  public Adapter createThingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.SubThing <em>Sub Thing</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.SubThing
   * @generated
   */
  public Adapter createSubThingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Agent
   * @generated
   */
  public Adapter createAgentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Cproperty <em>Cproperty</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Cproperty
   * @generated
   */
  public Adapter createCpropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PropertyAssign <em>Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PropertyAssign
   * @generated
   */
  public Adapter createPropertyAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Protocol
   * @generated
   */
  public Adapter createProtocolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Message
   * @generated
   */
  public Adapter createMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Port
   * @generated
   */
  public Adapter createPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.RequiredPort
   * @generated
   */
  public Adapter createRequiredPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ProvidedPort
   * @generated
   */
  public Adapter createProvidedPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.InternalPort <em>Internal Port</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.InternalPort
   * @generated
   */
  public Adapter createInternalPortAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Handler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Handler
   * @generated
   */
  public Adapter createHandlerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.InternalTransition <em>Internal Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.InternalTransition
   * @generated
   */
  public Adapter createInternalTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.CompositeState
   * @generated
   */
  public Adapter createCompositeStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Session <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Session
   * @generated
   */
  public Adapter createSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Region
   * @generated
   */
  public Adapter createRegionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.FinalState <em>Final State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.FinalState
   * @generated
   */
  public Adapter createFinalStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StateContainer <em>State Container</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StateContainer
   * @generated
   */
  public Adapter createStateContainerAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ReceiveMessage <em>Receive Message</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ReceiveMessage
   * @generated
   */
  public Adapter createReceiveMessageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ActionBlock
   * @generated
   */
  public Adapter createActionBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ExternStatement <em>Extern Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ExternStatement
   * @generated
   */
  public Adapter createExternStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.LocalVariable
   * @generated
   */
  public Adapter createLocalVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.SendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.SendAction
   * @generated
   */
  public Adapter createSendActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.VariableAssignment
   * @generated
   */
  public Adapter createVariableAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.CpropertyAssignment <em>Cproperty Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment
   * @generated
   */
  public Adapter createCpropertyAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StrategyStream <em>Strategy Stream</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StrategyStream
   * @generated
   */
  public Adapter createStrategyStreamAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.DictAssignment <em>Dict Assignment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.DictAssignment
   * @generated
   */
  public Adapter createDictAssignmentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ZipEnumerate <em>Zip Enumerate</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate
   * @generated
   */
  public Adapter createZipEnumerateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Append <em>Append</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Append
   * @generated
   */
  public Adapter createAppendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Increment <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Increment
   * @generated
   */
  public Adapter createIncrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Decrement <em>Decrement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Decrement
   * @generated
   */
  public Adapter createDecrementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ForAction <em>For Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ForAction
   * @generated
   */
  public Adapter createForActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PyforAction <em>Pyfor Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PyforAction
   * @generated
   */
  public Adapter createPyforActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.LoopAction <em>Loop Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.LoopAction
   * @generated
   */
  public Adapter createLoopActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ConditionalAction <em>Conditional Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ConditionalAction
   * @generated
   */
  public Adapter createConditionalActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ReturnAction <em>Return Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ReturnAction
   * @generated
   */
  public Adapter createReturnActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PrintAction <em>Print Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PrintAction
   * @generated
   */
  public Adapter createPrintActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ErrorAction <em>Error Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ErrorAction
   * @generated
   */
  public Adapter createErrorActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StartSession <em>Start Session</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StartSession
   * @generated
   */
  public Adapter createStartSessionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.FunctionCallStatement <em>Function Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.FunctionCallStatement
   * @generated
   */
  public Adapter createFunctionCallStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ExternExpression <em>Extern Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ExternExpression
   * @generated
   */
  public Adapter createExternExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ArrayInit <em>Array Init</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ArrayInit
   * @generated
   */
  public Adapter createArrayInitAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.EnumLiteralRef <em>Enum Literal Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.EnumLiteralRef
   * @generated
   */
  public Adapter createEnumLiteralRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ByteLiteral <em>Byte Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ByteLiteral
   * @generated
   */
  public Adapter createByteLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.CharLiteral <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.CharLiteral
   * @generated
   */
  public Adapter createCharLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.IntegerLiteral
   * @generated
   */
  public Adapter createIntegerLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.BooleanLiteral
   * @generated
   */
  public Adapter createBooleanLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.StringLiteral
   * @generated
   */
  public Adapter createStringLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.DoubleLiteral
   * @generated
   */
  public Adapter createDoubleLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PropertyReference
   * @generated
   */
  public Adapter createPropertyReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.CpropertyReference <em>Cproperty Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.CpropertyReference
   * @generated
   */
  public Adapter createCpropertyReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.EventReference <em>Event Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.EventReference
   * @generated
   */
  public Adapter createEventReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.FunctionCallExpression <em>Function Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.FunctionCallExpression
   * @generated
   */
  public Adapter createFunctionCallExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Configuration
   * @generated
   */
  public Adapter createConfigurationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Instance
   * @generated
   */
  public Adapter createInstanceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign <em>Config Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign
   * @generated
   */
  public Adapter createConfigPropertyAssignAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.AbstractConnector <em>Abstract Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.AbstractConnector
   * @generated
   */
  public Adapter createAbstractConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.Connector
   * @generated
   */
  public Adapter createConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ExternalConnector <em>External Connector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ExternalConnector
   * @generated
   */
  public Adapter createExternalConnectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.OrExpression
   * @generated
   */
  public Adapter createOrExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.AndExpression
   * @generated
   */
  public Adapter createAndExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.EqualsExpression <em>Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.EqualsExpression
   * @generated
   */
  public Adapter createEqualsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.NotEqualsExpression <em>Not Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.NotEqualsExpression
   * @generated
   */
  public Adapter createNotEqualsExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.GreaterExpression <em>Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.GreaterExpression
   * @generated
   */
  public Adapter createGreaterExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.LowerExpression <em>Lower Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.LowerExpression
   * @generated
   */
  public Adapter createLowerExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.GreaterOrEqualExpression <em>Greater Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.GreaterOrEqualExpression
   * @generated
   */
  public Adapter createGreaterOrEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.LowerOrEqualExpression <em>Lower Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.LowerOrEqualExpression
   * @generated
   */
  public Adapter createLowerOrEqualExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.PlusExpression
   * @generated
   */
  public Adapter createPlusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.MinusExpression
   * @generated
   */
  public Adapter createMinusExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.TimesExpression <em>Times Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.TimesExpression
   * @generated
   */
  public Adapter createTimesExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.DivExpression
   * @generated
   */
  public Adapter createDivExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ModExpression
   * @generated
   */
  public Adapter createModExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.CastExpression
   * @generated
   */
  public Adapter createCastExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ExpressionGroup <em>Expression Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ExpressionGroup
   * @generated
   */
  public Adapter createExpressionGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.NotExpression
   * @generated
   */
  public Adapter createNotExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.UnaryMinus <em>Unary Minus</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.UnaryMinus
   * @generated
   */
  public Adapter createUnaryMinusAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.aiotml.xtext.aiotML.ArrayIndex <em>Array Index</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.aiotml.xtext.aiotML.ArrayIndex
   * @generated
   */
  public Adapter createArrayIndexAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AiotMLAdapterFactory
