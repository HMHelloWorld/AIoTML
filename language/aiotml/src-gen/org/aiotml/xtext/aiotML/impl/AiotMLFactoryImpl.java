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
package org.aiotml.xtext.aiotML.impl;

import org.aiotml.xtext.aiotML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AiotMLFactoryImpl extends EFactoryImpl implements AiotMLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AiotMLFactory init()
  {
    try
    {
      AiotMLFactory theAiotMLFactory = (AiotMLFactory)EPackage.Registry.INSTANCE.getEFactory(AiotMLPackage.eNS_URI);
      if (theAiotMLFactory != null)
      {
        return theAiotMLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AiotMLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiotMLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AiotMLPackage.AIOT_ML_MODEL: return createAiotMLModel();
      case AiotMLPackage.TEMPLATE: return createTemplate();
      case AiotMLPackage.IMPORT: return createImport();
      case AiotMLPackage.PLATFORM_ANNOTATION: return createPlatformAnnotation();
      case AiotMLPackage.NAMED_ELEMENT: return createNamedElement();
      case AiotMLPackage.ANNOTATED_ELEMENT: return createAnnotatedElement();
      case AiotMLPackage.VARIABLE: return createVariable();
      case AiotMLPackage.TYPE_REF: return createTypeRef();
      case AiotMLPackage.TYPE: return createType();
      case AiotMLPackage.PRIMITIVE_TYPE: return createPrimitiveType();
      case AiotMLPackage.OBJECT_TYPE: return createObjectType();
      case AiotMLPackage.ENUMERATION: return createEnumeration();
      case AiotMLPackage.ENUMERATION_LITERAL: return createEnumerationLiteral();
      case AiotMLPackage.TENSOR: return createTensor();
      case AiotMLPackage.LAYER: return createLayer();
      case AiotMLPackage.MODEL: return createModel();
      case AiotMLPackage.MODEL_REFERENCE: return createModelReference();
      case AiotMLPackage.STRATEGY: return createStrategy();
      case AiotMLPackage.MULTI_AGENT: return createMultiAgent();
      case AiotMLPackage.MULTI_AGENT_PROPERTY: return createMultiAgentProperty();
      case AiotMLPackage.STRATEGY_PROPERTY: return createStrategyProperty();
      case AiotMLPackage.STRATEGY_ASSIGNMENT: return createStrategyAssignment();
      case AiotMLPackage.THING: return createThing();
      case AiotMLPackage.SUB_THING: return createSubThing();
      case AiotMLPackage.AGENT: return createAgent();
      case AiotMLPackage.CPROPERTY: return createCproperty();
      case AiotMLPackage.PROPERTY_ASSIGN: return createPropertyAssign();
      case AiotMLPackage.PROTOCOL: return createProtocol();
      case AiotMLPackage.FUNCTION: return createFunction();
      case AiotMLPackage.PROPERTY: return createProperty();
      case AiotMLPackage.MESSAGE: return createMessage();
      case AiotMLPackage.PARAMETER: return createParameter();
      case AiotMLPackage.PORT: return createPort();
      case AiotMLPackage.REQUIRED_PORT: return createRequiredPort();
      case AiotMLPackage.PROVIDED_PORT: return createProvidedPort();
      case AiotMLPackage.INTERNAL_PORT: return createInternalPort();
      case AiotMLPackage.STATE: return createState();
      case AiotMLPackage.HANDLER: return createHandler();
      case AiotMLPackage.TRANSITION: return createTransition();
      case AiotMLPackage.INTERNAL_TRANSITION: return createInternalTransition();
      case AiotMLPackage.COMPOSITE_STATE: return createCompositeState();
      case AiotMLPackage.SESSION: return createSession();
      case AiotMLPackage.REGION: return createRegion();
      case AiotMLPackage.FINAL_STATE: return createFinalState();
      case AiotMLPackage.STATE_CONTAINER: return createStateContainer();
      case AiotMLPackage.EVENT: return createEvent();
      case AiotMLPackage.RECEIVE_MESSAGE: return createReceiveMessage();
      case AiotMLPackage.ACTION: return createAction();
      case AiotMLPackage.ACTION_BLOCK: return createActionBlock();
      case AiotMLPackage.EXTERN_STATEMENT: return createExternStatement();
      case AiotMLPackage.LOCAL_VARIABLE: return createLocalVariable();
      case AiotMLPackage.SEND_ACTION: return createSendAction();
      case AiotMLPackage.VARIABLE_ASSIGNMENT: return createVariableAssignment();
      case AiotMLPackage.CPROPERTY_ASSIGNMENT: return createCpropertyAssignment();
      case AiotMLPackage.STRATEGY_STREAM: return createStrategyStream();
      case AiotMLPackage.DICT_ASSIGNMENT: return createDictAssignment();
      case AiotMLPackage.ZIP_ENUMERATE: return createZipEnumerate();
      case AiotMLPackage.APPEND: return createAppend();
      case AiotMLPackage.INCREMENT: return createIncrement();
      case AiotMLPackage.DECREMENT: return createDecrement();
      case AiotMLPackage.FOR_ACTION: return createForAction();
      case AiotMLPackage.PYFOR_ACTION: return createPyforAction();
      case AiotMLPackage.LOOP_ACTION: return createLoopAction();
      case AiotMLPackage.CONDITIONAL_ACTION: return createConditionalAction();
      case AiotMLPackage.RETURN_ACTION: return createReturnAction();
      case AiotMLPackage.PRINT_ACTION: return createPrintAction();
      case AiotMLPackage.ERROR_ACTION: return createErrorAction();
      case AiotMLPackage.START_SESSION: return createStartSession();
      case AiotMLPackage.FUNCTION_CALL_STATEMENT: return createFunctionCallStatement();
      case AiotMLPackage.EXPRESSION: return createExpression();
      case AiotMLPackage.EXTERN_EXPRESSION: return createExternExpression();
      case AiotMLPackage.LITERAL: return createLiteral();
      case AiotMLPackage.ARRAY_INIT: return createArrayInit();
      case AiotMLPackage.ENUM_LITERAL_REF: return createEnumLiteralRef();
      case AiotMLPackage.BYTE_LITERAL: return createByteLiteral();
      case AiotMLPackage.CHAR_LITERAL: return createCharLiteral();
      case AiotMLPackage.INTEGER_LITERAL: return createIntegerLiteral();
      case AiotMLPackage.BOOLEAN_LITERAL: return createBooleanLiteral();
      case AiotMLPackage.STRING_LITERAL: return createStringLiteral();
      case AiotMLPackage.DOUBLE_LITERAL: return createDoubleLiteral();
      case AiotMLPackage.PROPERTY_REFERENCE: return createPropertyReference();
      case AiotMLPackage.CPROPERTY_REFERENCE: return createCpropertyReference();
      case AiotMLPackage.EVENT_REFERENCE: return createEventReference();
      case AiotMLPackage.FUNCTION_CALL_EXPRESSION: return createFunctionCallExpression();
      case AiotMLPackage.CONFIGURATION: return createConfiguration();
      case AiotMLPackage.INSTANCE: return createInstance();
      case AiotMLPackage.CONFIG_PROPERTY_ASSIGN: return createConfigPropertyAssign();
      case AiotMLPackage.ABSTRACT_CONNECTOR: return createAbstractConnector();
      case AiotMLPackage.CONNECTOR: return createConnector();
      case AiotMLPackage.EXTERNAL_CONNECTOR: return createExternalConnector();
      case AiotMLPackage.OR_EXPRESSION: return createOrExpression();
      case AiotMLPackage.AND_EXPRESSION: return createAndExpression();
      case AiotMLPackage.EQUALS_EXPRESSION: return createEqualsExpression();
      case AiotMLPackage.NOT_EQUALS_EXPRESSION: return createNotEqualsExpression();
      case AiotMLPackage.GREATER_EXPRESSION: return createGreaterExpression();
      case AiotMLPackage.LOWER_EXPRESSION: return createLowerExpression();
      case AiotMLPackage.GREATER_OR_EQUAL_EXPRESSION: return createGreaterOrEqualExpression();
      case AiotMLPackage.LOWER_OR_EQUAL_EXPRESSION: return createLowerOrEqualExpression();
      case AiotMLPackage.PLUS_EXPRESSION: return createPlusExpression();
      case AiotMLPackage.MINUS_EXPRESSION: return createMinusExpression();
      case AiotMLPackage.TIMES_EXPRESSION: return createTimesExpression();
      case AiotMLPackage.DIV_EXPRESSION: return createDivExpression();
      case AiotMLPackage.MOD_EXPRESSION: return createModExpression();
      case AiotMLPackage.CAST_EXPRESSION: return createCastExpression();
      case AiotMLPackage.EXPRESSION_GROUP: return createExpressionGroup();
      case AiotMLPackage.NOT_EXPRESSION: return createNotExpression();
      case AiotMLPackage.UNARY_MINUS: return createUnaryMinus();
      case AiotMLPackage.ARRAY_INDEX: return createArrayIndex();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AiotMLModel createAiotMLModel()
  {
    AiotMLModelImpl aiotMLModel = new AiotMLModelImpl();
    return aiotMLModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlatformAnnotation createPlatformAnnotation()
  {
    PlatformAnnotationImpl platformAnnotation = new PlatformAnnotationImpl();
    return platformAnnotation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NamedElement createNamedElement()
  {
    NamedElementImpl namedElement = new NamedElementImpl();
    return namedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AnnotatedElement createAnnotatedElement()
  {
    AnnotatedElementImpl annotatedElement = new AnnotatedElementImpl();
    return annotatedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable createVariable()
  {
    VariableImpl variable = new VariableImpl();
    return variable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef createTypeRef()
  {
    TypeRefImpl typeRef = new TypeRefImpl();
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrimitiveType createPrimitiveType()
  {
    PrimitiveTypeImpl primitiveType = new PrimitiveTypeImpl();
    return primitiveType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ObjectType createObjectType()
  {
    ObjectTypeImpl objectType = new ObjectTypeImpl();
    return objectType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumerationLiteral createEnumerationLiteral()
  {
    EnumerationLiteralImpl enumerationLiteral = new EnumerationLiteralImpl();
    return enumerationLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tensor createTensor()
  {
    TensorImpl tensor = new TensorImpl();
    return tensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Layer createLayer()
  {
    LayerImpl layer = new LayerImpl();
    return layer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelReference createModelReference()
  {
    ModelReferenceImpl modelReference = new ModelReferenceImpl();
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Strategy createStrategy()
  {
    StrategyImpl strategy = new StrategyImpl();
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiAgent createMultiAgent()
  {
    MultiAgentImpl multiAgent = new MultiAgentImpl();
    return multiAgent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MultiAgentProperty createMultiAgentProperty()
  {
    MultiAgentPropertyImpl multiAgentProperty = new MultiAgentPropertyImpl();
    return multiAgentProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrategyProperty createStrategyProperty()
  {
    StrategyPropertyImpl strategyProperty = new StrategyPropertyImpl();
    return strategyProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrategyAssignment createStrategyAssignment()
  {
    StrategyAssignmentImpl strategyAssignment = new StrategyAssignmentImpl();
    return strategyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Thing createThing()
  {
    ThingImpl thing = new ThingImpl();
    return thing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SubThing createSubThing()
  {
    SubThingImpl subThing = new SubThingImpl();
    return subThing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Agent createAgent()
  {
    AgentImpl agent = new AgentImpl();
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cproperty createCproperty()
  {
    CpropertyImpl cproperty = new CpropertyImpl();
    return cproperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyAssign createPropertyAssign()
  {
    PropertyAssignImpl propertyAssign = new PropertyAssignImpl();
    return propertyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Protocol createProtocol()
  {
    ProtocolImpl protocol = new ProtocolImpl();
    return protocol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Message createMessage()
  {
    MessageImpl message = new MessageImpl();
    return message;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Port createPort()
  {
    PortImpl port = new PortImpl();
    return port;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RequiredPort createRequiredPort()
  {
    RequiredPortImpl requiredPort = new RequiredPortImpl();
    return requiredPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ProvidedPort createProvidedPort()
  {
    ProvidedPortImpl providedPort = new ProvidedPortImpl();
    return providedPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalPort createInternalPort()
  {
    InternalPortImpl internalPort = new InternalPortImpl();
    return internalPort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Handler createHandler()
  {
    HandlerImpl handler = new HandlerImpl();
    return handler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InternalTransition createInternalTransition()
  {
    InternalTransitionImpl internalTransition = new InternalTransitionImpl();
    return internalTransition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompositeState createCompositeState()
  {
    CompositeStateImpl compositeState = new CompositeStateImpl();
    return compositeState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Session createSession()
  {
    SessionImpl session = new SessionImpl();
    return session;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Region createRegion()
  {
    RegionImpl region = new RegionImpl();
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FinalState createFinalState()
  {
    FinalStateImpl finalState = new FinalStateImpl();
    return finalState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StateContainer createStateContainer()
  {
    StateContainerImpl stateContainer = new StateContainerImpl();
    return stateContainer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReceiveMessage createReceiveMessage()
  {
    ReceiveMessageImpl receiveMessage = new ReceiveMessageImpl();
    return receiveMessage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActionBlock createActionBlock()
  {
    ActionBlockImpl actionBlock = new ActionBlockImpl();
    return actionBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternStatement createExternStatement()
  {
    ExternStatementImpl externStatement = new ExternStatementImpl();
    return externStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalVariable createLocalVariable()
  {
    LocalVariableImpl localVariable = new LocalVariableImpl();
    return localVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SendAction createSendAction()
  {
    SendActionImpl sendAction = new SendActionImpl();
    return sendAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableAssignment createVariableAssignment()
  {
    VariableAssignmentImpl variableAssignment = new VariableAssignmentImpl();
    return variableAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CpropertyAssignment createCpropertyAssignment()
  {
    CpropertyAssignmentImpl cpropertyAssignment = new CpropertyAssignmentImpl();
    return cpropertyAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrategyStream createStrategyStream()
  {
    StrategyStreamImpl strategyStream = new StrategyStreamImpl();
    return strategyStream;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DictAssignment createDictAssignment()
  {
    DictAssignmentImpl dictAssignment = new DictAssignmentImpl();
    return dictAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ZipEnumerate createZipEnumerate()
  {
    ZipEnumerateImpl zipEnumerate = new ZipEnumerateImpl();
    return zipEnumerate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Append createAppend()
  {
    AppendImpl append = new AppendImpl();
    return append;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Increment createIncrement()
  {
    IncrementImpl increment = new IncrementImpl();
    return increment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Decrement createDecrement()
  {
    DecrementImpl decrement = new DecrementImpl();
    return decrement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForAction createForAction()
  {
    ForActionImpl forAction = new ForActionImpl();
    return forAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PyforAction createPyforAction()
  {
    PyforActionImpl pyforAction = new PyforActionImpl();
    return pyforAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LoopAction createLoopAction()
  {
    LoopActionImpl loopAction = new LoopActionImpl();
    return loopAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConditionalAction createConditionalAction()
  {
    ConditionalActionImpl conditionalAction = new ConditionalActionImpl();
    return conditionalAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReturnAction createReturnAction()
  {
    ReturnActionImpl returnAction = new ReturnActionImpl();
    return returnAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PrintAction createPrintAction()
  {
    PrintActionImpl printAction = new PrintActionImpl();
    return printAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ErrorAction createErrorAction()
  {
    ErrorActionImpl errorAction = new ErrorActionImpl();
    return errorAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartSession createStartSession()
  {
    StartSessionImpl startSession = new StartSessionImpl();
    return startSession;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCallStatement createFunctionCallStatement()
  {
    FunctionCallStatementImpl functionCallStatement = new FunctionCallStatementImpl();
    return functionCallStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternExpression createExternExpression()
  {
    ExternExpressionImpl externExpression = new ExternExpressionImpl();
    return externExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayInit createArrayInit()
  {
    ArrayInitImpl arrayInit = new ArrayInitImpl();
    return arrayInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EnumLiteralRef createEnumLiteralRef()
  {
    EnumLiteralRefImpl enumLiteralRef = new EnumLiteralRefImpl();
    return enumLiteralRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ByteLiteral createByteLiteral()
  {
    ByteLiteralImpl byteLiteral = new ByteLiteralImpl();
    return byteLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CharLiteral createCharLiteral()
  {
    CharLiteralImpl charLiteral = new CharLiteralImpl();
    return charLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLiteral createIntegerLiteral()
  {
    IntegerLiteralImpl integerLiteral = new IntegerLiteralImpl();
    return integerLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanLiteral createBooleanLiteral()
  {
    BooleanLiteralImpl booleanLiteral = new BooleanLiteralImpl();
    return booleanLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringLiteral createStringLiteral()
  {
    StringLiteralImpl stringLiteral = new StringLiteralImpl();
    return stringLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleLiteral createDoubleLiteral()
  {
    DoubleLiteralImpl doubleLiteral = new DoubleLiteralImpl();
    return doubleLiteral;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyReference createPropertyReference()
  {
    PropertyReferenceImpl propertyReference = new PropertyReferenceImpl();
    return propertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CpropertyReference createCpropertyReference()
  {
    CpropertyReferenceImpl cpropertyReference = new CpropertyReferenceImpl();
    return cpropertyReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EventReference createEventReference()
  {
    EventReferenceImpl eventReference = new EventReferenceImpl();
    return eventReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FunctionCallExpression createFunctionCallExpression()
  {
    FunctionCallExpressionImpl functionCallExpression = new FunctionCallExpressionImpl();
    return functionCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Configuration createConfiguration()
  {
    ConfigurationImpl configuration = new ConfigurationImpl();
    return configuration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Instance createInstance()
  {
    InstanceImpl instance = new InstanceImpl();
    return instance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConfigPropertyAssign createConfigPropertyAssign()
  {
    ConfigPropertyAssignImpl configPropertyAssign = new ConfigPropertyAssignImpl();
    return configPropertyAssign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AbstractConnector createAbstractConnector()
  {
    AbstractConnectorImpl abstractConnector = new AbstractConnectorImpl();
    return abstractConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connector createConnector()
  {
    ConnectorImpl connector = new ConnectorImpl();
    return connector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalConnector createExternalConnector()
  {
    ExternalConnectorImpl externalConnector = new ExternalConnectorImpl();
    return externalConnector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpression createOrExpression()
  {
    OrExpressionImpl orExpression = new OrExpressionImpl();
    return orExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpression createAndExpression()
  {
    AndExpressionImpl andExpression = new AndExpressionImpl();
    return andExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EqualsExpression createEqualsExpression()
  {
    EqualsExpressionImpl equalsExpression = new EqualsExpressionImpl();
    return equalsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotEqualsExpression createNotEqualsExpression()
  {
    NotEqualsExpressionImpl notEqualsExpression = new NotEqualsExpressionImpl();
    return notEqualsExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterExpression createGreaterExpression()
  {
    GreaterExpressionImpl greaterExpression = new GreaterExpressionImpl();
    return greaterExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LowerExpression createLowerExpression()
  {
    LowerExpressionImpl lowerExpression = new LowerExpressionImpl();
    return lowerExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GreaterOrEqualExpression createGreaterOrEqualExpression()
  {
    GreaterOrEqualExpressionImpl greaterOrEqualExpression = new GreaterOrEqualExpressionImpl();
    return greaterOrEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LowerOrEqualExpression createLowerOrEqualExpression()
  {
    LowerOrEqualExpressionImpl lowerOrEqualExpression = new LowerOrEqualExpressionImpl();
    return lowerOrEqualExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PlusExpression createPlusExpression()
  {
    PlusExpressionImpl plusExpression = new PlusExpressionImpl();
    return plusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MinusExpression createMinusExpression()
  {
    MinusExpressionImpl minusExpression = new MinusExpressionImpl();
    return minusExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TimesExpression createTimesExpression()
  {
    TimesExpressionImpl timesExpression = new TimesExpressionImpl();
    return timesExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DivExpression createDivExpression()
  {
    DivExpressionImpl divExpression = new DivExpressionImpl();
    return divExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModExpression createModExpression()
  {
    ModExpressionImpl modExpression = new ModExpressionImpl();
    return modExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CastExpression createCastExpression()
  {
    CastExpressionImpl castExpression = new CastExpressionImpl();
    return castExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionGroup createExpressionGroup()
  {
    ExpressionGroupImpl expressionGroup = new ExpressionGroupImpl();
    return expressionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotExpression createNotExpression()
  {
    NotExpressionImpl notExpression = new NotExpressionImpl();
    return notExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryMinus createUnaryMinus()
  {
    UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
    return unaryMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayIndex createArrayIndex()
  {
    ArrayIndexImpl arrayIndex = new ArrayIndexImpl();
    return arrayIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AiotMLPackage getAiotMLPackage()
  {
    return (AiotMLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AiotMLPackage getPackage()
  {
    return AiotMLPackage.eINSTANCE;
  }

} //AiotMLFactoryImpl
