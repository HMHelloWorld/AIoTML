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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.aiotml.xtext.aiotML.AiotMLPackage
 * @generated
 */
public class AiotMLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AiotMLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AiotMLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AiotMLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AiotMLPackage.AIOT_ML_MODEL:
      {
        AiotMLModel aiotMLModel = (AiotMLModel)theEObject;
        T result = caseAiotMLModel(aiotMLModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.IMPORT:
      {
        Import import_ = (Import)theEObject;
        T result = caseImport(import_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PLATFORM_ANNOTATION:
      {
        PlatformAnnotation platformAnnotation = (PlatformAnnotation)theEObject;
        T result = casePlatformAnnotation(platformAnnotation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.NAMED_ELEMENT:
      {
        NamedElement namedElement = (NamedElement)theEObject;
        T result = caseNamedElement(namedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ANNOTATED_ELEMENT:
      {
        AnnotatedElement annotatedElement = (AnnotatedElement)theEObject;
        T result = caseAnnotatedElement(annotatedElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.VARIABLE:
      {
        Variable variable = (Variable)theEObject;
        T result = caseVariable(variable);
        if (result == null) result = caseNamedElement(variable);
        if (result == null) result = caseAnnotatedElement(variable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TYPE:
      {
        Type type = (Type)theEObject;
        T result = caseType(type);
        if (result == null) result = caseNamedElement(type);
        if (result == null) result = caseAnnotatedElement(type);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PRIMITIVE_TYPE:
      {
        PrimitiveType primitiveType = (PrimitiveType)theEObject;
        T result = casePrimitiveType(primitiveType);
        if (result == null) result = caseType(primitiveType);
        if (result == null) result = caseNamedElement(primitiveType);
        if (result == null) result = caseAnnotatedElement(primitiveType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.OBJECT_TYPE:
      {
        ObjectType objectType = (ObjectType)theEObject;
        T result = caseObjectType(objectType);
        if (result == null) result = caseType(objectType);
        if (result == null) result = caseNamedElement(objectType);
        if (result == null) result = caseAnnotatedElement(objectType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = caseType(enumeration);
        if (result == null) result = caseNamedElement(enumeration);
        if (result == null) result = caseAnnotatedElement(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ENUMERATION_LITERAL:
      {
        EnumerationLiteral enumerationLiteral = (EnumerationLiteral)theEObject;
        T result = caseEnumerationLiteral(enumerationLiteral);
        if (result == null) result = caseNamedElement(enumerationLiteral);
        if (result == null) result = caseAnnotatedElement(enumerationLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TENSOR:
      {
        Tensor tensor = (Tensor)theEObject;
        T result = caseTensor(tensor);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LAYER:
      {
        Layer layer = (Layer)theEObject;
        T result = caseLayer(layer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = caseType(model);
        if (result == null) result = caseNamedElement(model);
        if (result == null) result = caseAnnotatedElement(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MODEL_REFERENCE:
      {
        ModelReference modelReference = (ModelReference)theEObject;
        T result = caseModelReference(modelReference);
        if (result == null) result = caseNamedElement(modelReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STRATEGY:
      {
        Strategy strategy = (Strategy)theEObject;
        T result = caseStrategy(strategy);
        if (result == null) result = caseType(strategy);
        if (result == null) result = caseNamedElement(strategy);
        if (result == null) result = caseAnnotatedElement(strategy);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MULTI_AGENT:
      {
        MultiAgent multiAgent = (MultiAgent)theEObject;
        T result = caseMultiAgent(multiAgent);
        if (result == null) result = caseType(multiAgent);
        if (result == null) result = caseNamedElement(multiAgent);
        if (result == null) result = caseAnnotatedElement(multiAgent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MULTI_AGENT_PROPERTY:
      {
        MultiAgentProperty multiAgentProperty = (MultiAgentProperty)theEObject;
        T result = caseMultiAgentProperty(multiAgentProperty);
        if (result == null) result = caseVariable(multiAgentProperty);
        if (result == null) result = caseNamedElement(multiAgentProperty);
        if (result == null) result = caseAnnotatedElement(multiAgentProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STRATEGY_PROPERTY:
      {
        StrategyProperty strategyProperty = (StrategyProperty)theEObject;
        T result = caseStrategyProperty(strategyProperty);
        if (result == null) result = caseVariable(strategyProperty);
        if (result == null) result = caseNamedElement(strategyProperty);
        if (result == null) result = caseAnnotatedElement(strategyProperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STRATEGY_ASSIGNMENT:
      {
        StrategyAssignment strategyAssignment = (StrategyAssignment)theEObject;
        T result = caseStrategyAssignment(strategyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.THING:
      {
        Thing thing = (Thing)theEObject;
        T result = caseThing(thing);
        if (result == null) result = caseType(thing);
        if (result == null) result = caseNamedElement(thing);
        if (result == null) result = caseAnnotatedElement(thing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.SUB_THING:
      {
        SubThing subThing = (SubThing)theEObject;
        T result = caseSubThing(subThing);
        if (result == null) result = caseType(subThing);
        if (result == null) result = caseNamedElement(subThing);
        if (result == null) result = caseAnnotatedElement(subThing);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.AGENT:
      {
        Agent agent = (Agent)theEObject;
        T result = caseAgent(agent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CPROPERTY:
      {
        Cproperty cproperty = (Cproperty)theEObject;
        T result = caseCproperty(cproperty);
        if (result == null) result = caseVariable(cproperty);
        if (result == null) result = caseNamedElement(cproperty);
        if (result == null) result = caseAnnotatedElement(cproperty);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PROPERTY_ASSIGN:
      {
        PropertyAssign propertyAssign = (PropertyAssign)theEObject;
        T result = casePropertyAssign(propertyAssign);
        if (result == null) result = caseAnnotatedElement(propertyAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PROTOCOL:
      {
        Protocol protocol = (Protocol)theEObject;
        T result = caseProtocol(protocol);
        if (result == null) result = caseNamedElement(protocol);
        if (result == null) result = caseAnnotatedElement(protocol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.FUNCTION:
      {
        Function function = (Function)theEObject;
        T result = caseFunction(function);
        if (result == null) result = caseNamedElement(function);
        if (result == null) result = caseAnnotatedElement(function);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PROPERTY:
      {
        Property property = (Property)theEObject;
        T result = caseProperty(property);
        if (result == null) result = caseVariable(property);
        if (result == null) result = caseNamedElement(property);
        if (result == null) result = caseAnnotatedElement(property);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MESSAGE:
      {
        Message message = (Message)theEObject;
        T result = caseMessage(message);
        if (result == null) result = caseNamedElement(message);
        if (result == null) result = caseAnnotatedElement(message);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PARAMETER:
      {
        Parameter parameter = (Parameter)theEObject;
        T result = caseParameter(parameter);
        if (result == null) result = caseVariable(parameter);
        if (result == null) result = caseNamedElement(parameter);
        if (result == null) result = caseAnnotatedElement(parameter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PORT:
      {
        Port port = (Port)theEObject;
        T result = casePort(port);
        if (result == null) result = caseNamedElement(port);
        if (result == null) result = caseAnnotatedElement(port);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.REQUIRED_PORT:
      {
        RequiredPort requiredPort = (RequiredPort)theEObject;
        T result = caseRequiredPort(requiredPort);
        if (result == null) result = casePort(requiredPort);
        if (result == null) result = caseNamedElement(requiredPort);
        if (result == null) result = caseAnnotatedElement(requiredPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PROVIDED_PORT:
      {
        ProvidedPort providedPort = (ProvidedPort)theEObject;
        T result = caseProvidedPort(providedPort);
        if (result == null) result = casePort(providedPort);
        if (result == null) result = caseNamedElement(providedPort);
        if (result == null) result = caseAnnotatedElement(providedPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.INTERNAL_PORT:
      {
        InternalPort internalPort = (InternalPort)theEObject;
        T result = caseInternalPort(internalPort);
        if (result == null) result = casePort(internalPort);
        if (result == null) result = caseNamedElement(internalPort);
        if (result == null) result = caseAnnotatedElement(internalPort);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STATE:
      {
        State state = (State)theEObject;
        T result = caseState(state);
        if (result == null) result = caseNamedElement(state);
        if (result == null) result = caseAnnotatedElement(state);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.HANDLER:
      {
        Handler handler = (Handler)theEObject;
        T result = caseHandler(handler);
        if (result == null) result = caseNamedElement(handler);
        if (result == null) result = caseAnnotatedElement(handler);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TRANSITION:
      {
        Transition transition = (Transition)theEObject;
        T result = caseTransition(transition);
        if (result == null) result = caseHandler(transition);
        if (result == null) result = caseNamedElement(transition);
        if (result == null) result = caseAnnotatedElement(transition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.INTERNAL_TRANSITION:
      {
        InternalTransition internalTransition = (InternalTransition)theEObject;
        T result = caseInternalTransition(internalTransition);
        if (result == null) result = caseHandler(internalTransition);
        if (result == null) result = caseNamedElement(internalTransition);
        if (result == null) result = caseAnnotatedElement(internalTransition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.COMPOSITE_STATE:
      {
        CompositeState compositeState = (CompositeState)theEObject;
        T result = caseCompositeState(compositeState);
        if (result == null) result = caseState(compositeState);
        if (result == null) result = caseStateContainer(compositeState);
        if (result == null) result = caseNamedElement(compositeState);
        if (result == null) result = caseAnnotatedElement(compositeState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.SESSION:
      {
        Session session = (Session)theEObject;
        T result = caseSession(session);
        if (result == null) result = caseStateContainer(session);
        if (result == null) result = caseNamedElement(session);
        if (result == null) result = caseAnnotatedElement(session);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.REGION:
      {
        Region region = (Region)theEObject;
        T result = caseRegion(region);
        if (result == null) result = caseStateContainer(region);
        if (result == null) result = caseNamedElement(region);
        if (result == null) result = caseAnnotatedElement(region);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.FINAL_STATE:
      {
        FinalState finalState = (FinalState)theEObject;
        T result = caseFinalState(finalState);
        if (result == null) result = caseState(finalState);
        if (result == null) result = caseNamedElement(finalState);
        if (result == null) result = caseAnnotatedElement(finalState);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STATE_CONTAINER:
      {
        StateContainer stateContainer = (StateContainer)theEObject;
        T result = caseStateContainer(stateContainer);
        if (result == null) result = caseNamedElement(stateContainer);
        if (result == null) result = caseAnnotatedElement(stateContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = caseNamedElement(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.RECEIVE_MESSAGE:
      {
        ReceiveMessage receiveMessage = (ReceiveMessage)theEObject;
        T result = caseReceiveMessage(receiveMessage);
        if (result == null) result = caseEvent(receiveMessage);
        if (result == null) result = caseNamedElement(receiveMessage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ACTION_BLOCK:
      {
        ActionBlock actionBlock = (ActionBlock)theEObject;
        T result = caseActionBlock(actionBlock);
        if (result == null) result = caseAction(actionBlock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EXTERN_STATEMENT:
      {
        ExternStatement externStatement = (ExternStatement)theEObject;
        T result = caseExternStatement(externStatement);
        if (result == null) result = caseAction(externStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LOCAL_VARIABLE:
      {
        LocalVariable localVariable = (LocalVariable)theEObject;
        T result = caseLocalVariable(localVariable);
        if (result == null) result = caseVariable(localVariable);
        if (result == null) result = caseAction(localVariable);
        if (result == null) result = caseNamedElement(localVariable);
        if (result == null) result = caseAnnotatedElement(localVariable);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.SEND_ACTION:
      {
        SendAction sendAction = (SendAction)theEObject;
        T result = caseSendAction(sendAction);
        if (result == null) result = caseAction(sendAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.VARIABLE_ASSIGNMENT:
      {
        VariableAssignment variableAssignment = (VariableAssignment)theEObject;
        T result = caseVariableAssignment(variableAssignment);
        if (result == null) result = caseAction(variableAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CPROPERTY_ASSIGNMENT:
      {
        CpropertyAssignment cpropertyAssignment = (CpropertyAssignment)theEObject;
        T result = caseCpropertyAssignment(cpropertyAssignment);
        if (result == null) result = caseAction(cpropertyAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STRATEGY_STREAM:
      {
        StrategyStream strategyStream = (StrategyStream)theEObject;
        T result = caseStrategyStream(strategyStream);
        if (result == null) result = caseAction(strategyStream);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.DICT_ASSIGNMENT:
      {
        DictAssignment dictAssignment = (DictAssignment)theEObject;
        T result = caseDictAssignment(dictAssignment);
        if (result == null) result = caseAction(dictAssignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ZIP_ENUMERATE:
      {
        ZipEnumerate zipEnumerate = (ZipEnumerate)theEObject;
        T result = caseZipEnumerate(zipEnumerate);
        if (result == null) result = caseAction(zipEnumerate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.APPEND:
      {
        Append append = (Append)theEObject;
        T result = caseAppend(append);
        if (result == null) result = caseAction(append);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.INCREMENT:
      {
        Increment increment = (Increment)theEObject;
        T result = caseIncrement(increment);
        if (result == null) result = caseAction(increment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.DECREMENT:
      {
        Decrement decrement = (Decrement)theEObject;
        T result = caseDecrement(decrement);
        if (result == null) result = caseAction(decrement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.FOR_ACTION:
      {
        ForAction forAction = (ForAction)theEObject;
        T result = caseForAction(forAction);
        if (result == null) result = caseAction(forAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PYFOR_ACTION:
      {
        PyforAction pyforAction = (PyforAction)theEObject;
        T result = casePyforAction(pyforAction);
        if (result == null) result = caseAction(pyforAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LOOP_ACTION:
      {
        LoopAction loopAction = (LoopAction)theEObject;
        T result = caseLoopAction(loopAction);
        if (result == null) result = caseAction(loopAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CONDITIONAL_ACTION:
      {
        ConditionalAction conditionalAction = (ConditionalAction)theEObject;
        T result = caseConditionalAction(conditionalAction);
        if (result == null) result = caseAction(conditionalAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.RETURN_ACTION:
      {
        ReturnAction returnAction = (ReturnAction)theEObject;
        T result = caseReturnAction(returnAction);
        if (result == null) result = caseAction(returnAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PRINT_ACTION:
      {
        PrintAction printAction = (PrintAction)theEObject;
        T result = casePrintAction(printAction);
        if (result == null) result = caseAction(printAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ERROR_ACTION:
      {
        ErrorAction errorAction = (ErrorAction)theEObject;
        T result = caseErrorAction(errorAction);
        if (result == null) result = caseAction(errorAction);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.START_SESSION:
      {
        StartSession startSession = (StartSession)theEObject;
        T result = caseStartSession(startSession);
        if (result == null) result = caseAction(startSession);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.FUNCTION_CALL_STATEMENT:
      {
        FunctionCallStatement functionCallStatement = (FunctionCallStatement)theEObject;
        T result = caseFunctionCallStatement(functionCallStatement);
        if (result == null) result = caseAction(functionCallStatement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EXTERN_EXPRESSION:
      {
        ExternExpression externExpression = (ExternExpression)theEObject;
        T result = caseExternExpression(externExpression);
        if (result == null) result = caseExpression(externExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LITERAL:
      {
        Literal literal = (Literal)theEObject;
        T result = caseLiteral(literal);
        if (result == null) result = caseExpression(literal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ARRAY_INIT:
      {
        ArrayInit arrayInit = (ArrayInit)theEObject;
        T result = caseArrayInit(arrayInit);
        if (result == null) result = caseExpression(arrayInit);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ENUM_LITERAL_REF:
      {
        EnumLiteralRef enumLiteralRef = (EnumLiteralRef)theEObject;
        T result = caseEnumLiteralRef(enumLiteralRef);
        if (result == null) result = caseLiteral(enumLiteralRef);
        if (result == null) result = caseExpression(enumLiteralRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.BYTE_LITERAL:
      {
        ByteLiteral byteLiteral = (ByteLiteral)theEObject;
        T result = caseByteLiteral(byteLiteral);
        if (result == null) result = caseLiteral(byteLiteral);
        if (result == null) result = caseExpression(byteLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CHAR_LITERAL:
      {
        CharLiteral charLiteral = (CharLiteral)theEObject;
        T result = caseCharLiteral(charLiteral);
        if (result == null) result = caseLiteral(charLiteral);
        if (result == null) result = caseExpression(charLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.INTEGER_LITERAL:
      {
        IntegerLiteral integerLiteral = (IntegerLiteral)theEObject;
        T result = caseIntegerLiteral(integerLiteral);
        if (result == null) result = caseLiteral(integerLiteral);
        if (result == null) result = caseExpression(integerLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.BOOLEAN_LITERAL:
      {
        BooleanLiteral booleanLiteral = (BooleanLiteral)theEObject;
        T result = caseBooleanLiteral(booleanLiteral);
        if (result == null) result = caseLiteral(booleanLiteral);
        if (result == null) result = caseExpression(booleanLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.STRING_LITERAL:
      {
        StringLiteral stringLiteral = (StringLiteral)theEObject;
        T result = caseStringLiteral(stringLiteral);
        if (result == null) result = caseLiteral(stringLiteral);
        if (result == null) result = caseExpression(stringLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.DOUBLE_LITERAL:
      {
        DoubleLiteral doubleLiteral = (DoubleLiteral)theEObject;
        T result = caseDoubleLiteral(doubleLiteral);
        if (result == null) result = caseLiteral(doubleLiteral);
        if (result == null) result = caseExpression(doubleLiteral);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PROPERTY_REFERENCE:
      {
        PropertyReference propertyReference = (PropertyReference)theEObject;
        T result = casePropertyReference(propertyReference);
        if (result == null) result = caseExpression(propertyReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CPROPERTY_REFERENCE:
      {
        CpropertyReference cpropertyReference = (CpropertyReference)theEObject;
        T result = caseCpropertyReference(cpropertyReference);
        if (result == null) result = caseExpression(cpropertyReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EVENT_REFERENCE:
      {
        EventReference eventReference = (EventReference)theEObject;
        T result = caseEventReference(eventReference);
        if (result == null) result = caseExpression(eventReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.FUNCTION_CALL_EXPRESSION:
      {
        FunctionCallExpression functionCallExpression = (FunctionCallExpression)theEObject;
        T result = caseFunctionCallExpression(functionCallExpression);
        if (result == null) result = caseExpression(functionCallExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CONFIGURATION:
      {
        Configuration configuration = (Configuration)theEObject;
        T result = caseConfiguration(configuration);
        if (result == null) result = caseNamedElement(configuration);
        if (result == null) result = caseAnnotatedElement(configuration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.INSTANCE:
      {
        Instance instance = (Instance)theEObject;
        T result = caseInstance(instance);
        if (result == null) result = caseNamedElement(instance);
        if (result == null) result = caseAnnotatedElement(instance);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CONFIG_PROPERTY_ASSIGN:
      {
        ConfigPropertyAssign configPropertyAssign = (ConfigPropertyAssign)theEObject;
        T result = caseConfigPropertyAssign(configPropertyAssign);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ABSTRACT_CONNECTOR:
      {
        AbstractConnector abstractConnector = (AbstractConnector)theEObject;
        T result = caseAbstractConnector(abstractConnector);
        if (result == null) result = caseNamedElement(abstractConnector);
        if (result == null) result = caseAnnotatedElement(abstractConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CONNECTOR:
      {
        Connector connector = (Connector)theEObject;
        T result = caseConnector(connector);
        if (result == null) result = caseAbstractConnector(connector);
        if (result == null) result = caseNamedElement(connector);
        if (result == null) result = caseAnnotatedElement(connector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EXTERNAL_CONNECTOR:
      {
        ExternalConnector externalConnector = (ExternalConnector)theEObject;
        T result = caseExternalConnector(externalConnector);
        if (result == null) result = caseAbstractConnector(externalConnector);
        if (result == null) result = caseNamedElement(externalConnector);
        if (result == null) result = caseAnnotatedElement(externalConnector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.OR_EXPRESSION:
      {
        OrExpression orExpression = (OrExpression)theEObject;
        T result = caseOrExpression(orExpression);
        if (result == null) result = caseExpression(orExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.AND_EXPRESSION:
      {
        AndExpression andExpression = (AndExpression)theEObject;
        T result = caseAndExpression(andExpression);
        if (result == null) result = caseExpression(andExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EQUALS_EXPRESSION:
      {
        EqualsExpression equalsExpression = (EqualsExpression)theEObject;
        T result = caseEqualsExpression(equalsExpression);
        if (result == null) result = caseExpression(equalsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.NOT_EQUALS_EXPRESSION:
      {
        NotEqualsExpression notEqualsExpression = (NotEqualsExpression)theEObject;
        T result = caseNotEqualsExpression(notEqualsExpression);
        if (result == null) result = caseExpression(notEqualsExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.GREATER_EXPRESSION:
      {
        GreaterExpression greaterExpression = (GreaterExpression)theEObject;
        T result = caseGreaterExpression(greaterExpression);
        if (result == null) result = caseExpression(greaterExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LOWER_EXPRESSION:
      {
        LowerExpression lowerExpression = (LowerExpression)theEObject;
        T result = caseLowerExpression(lowerExpression);
        if (result == null) result = caseExpression(lowerExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.GREATER_OR_EQUAL_EXPRESSION:
      {
        GreaterOrEqualExpression greaterOrEqualExpression = (GreaterOrEqualExpression)theEObject;
        T result = caseGreaterOrEqualExpression(greaterOrEqualExpression);
        if (result == null) result = caseExpression(greaterOrEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.LOWER_OR_EQUAL_EXPRESSION:
      {
        LowerOrEqualExpression lowerOrEqualExpression = (LowerOrEqualExpression)theEObject;
        T result = caseLowerOrEqualExpression(lowerOrEqualExpression);
        if (result == null) result = caseExpression(lowerOrEqualExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.PLUS_EXPRESSION:
      {
        PlusExpression plusExpression = (PlusExpression)theEObject;
        T result = casePlusExpression(plusExpression);
        if (result == null) result = caseExpression(plusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MINUS_EXPRESSION:
      {
        MinusExpression minusExpression = (MinusExpression)theEObject;
        T result = caseMinusExpression(minusExpression);
        if (result == null) result = caseExpression(minusExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.TIMES_EXPRESSION:
      {
        TimesExpression timesExpression = (TimesExpression)theEObject;
        T result = caseTimesExpression(timesExpression);
        if (result == null) result = caseExpression(timesExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.DIV_EXPRESSION:
      {
        DivExpression divExpression = (DivExpression)theEObject;
        T result = caseDivExpression(divExpression);
        if (result == null) result = caseExpression(divExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.MOD_EXPRESSION:
      {
        ModExpression modExpression = (ModExpression)theEObject;
        T result = caseModExpression(modExpression);
        if (result == null) result = caseExpression(modExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.CAST_EXPRESSION:
      {
        CastExpression castExpression = (CastExpression)theEObject;
        T result = caseCastExpression(castExpression);
        if (result == null) result = caseExpression(castExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.EXPRESSION_GROUP:
      {
        ExpressionGroup expressionGroup = (ExpressionGroup)theEObject;
        T result = caseExpressionGroup(expressionGroup);
        if (result == null) result = caseExpression(expressionGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.NOT_EXPRESSION:
      {
        NotExpression notExpression = (NotExpression)theEObject;
        T result = caseNotExpression(notExpression);
        if (result == null) result = caseExpression(notExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.UNARY_MINUS:
      {
        UnaryMinus unaryMinus = (UnaryMinus)theEObject;
        T result = caseUnaryMinus(unaryMinus);
        if (result == null) result = caseExpression(unaryMinus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AiotMLPackage.ARRAY_INDEX:
      {
        ArrayIndex arrayIndex = (ArrayIndex)theEObject;
        T result = caseArrayIndex(arrayIndex);
        if (result == null) result = caseExpression(arrayIndex);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAiotMLModel(AiotMLModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Import</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImport(Import object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Platform Annotation</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Platform Annotation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlatformAnnotation(PlatformAnnotation object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotated Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotatedElement(AnnotatedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariable(Variable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseType(Type object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitiveType(PrimitiveType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectType(ObjectType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumerationLiteral(EnumerationLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tensor</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tensor</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTensor(Tensor object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Layer</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Layer</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLayer(Layer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModelReference(ModelReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategy(Strategy object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiAgent(MultiAgent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Multi Agent Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Multi Agent Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMultiAgentProperty(MultiAgentProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategyProperty(StrategyProperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategyAssignment(StrategyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Thing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Thing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThing(Thing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Thing</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Thing</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSubThing(SubThing object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAgent(Agent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cproperty</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cproperty</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCproperty(Cproperty object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyAssign(PropertyAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Protocol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProtocol(Protocol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunction(Function object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProperty(Property object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMessage(Message object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameter(Parameter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePort(Port object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Required Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequiredPort(RequiredPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Provided Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseProvidedPort(ProvidedPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Port</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Port</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalPort(InternalPort object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseState(State object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handler</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handler</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandler(Handler object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTransition(Transition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Internal Transition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInternalTransition(InternalTransition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeState(CompositeState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSession(Session object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Region</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRegion(Region object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Final State</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Final State</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFinalState(FinalState object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>State Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>State Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStateContainer(StateContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Receive Message</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Receive Message</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReceiveMessage(ReceiveMessage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action Block</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActionBlock(ActionBlock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternStatement(ExternStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Local Variable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLocalVariable(LocalVariable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Send Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Send Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSendAction(SendAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variable Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariableAssignment(VariableAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cproperty Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cproperty Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpropertyAssignment(CpropertyAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Strategy Stream</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Strategy Stream</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStrategyStream(StrategyStream object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dict Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dict Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDictAssignment(DictAssignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zip Enumerate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zip Enumerate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZipEnumerate(ZipEnumerate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Append</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Append</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAppend(Append object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Increment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Increment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIncrement(Increment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decrement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decrement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecrement(Decrement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>For Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>For Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseForAction(ForAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pyfor Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pyfor Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePyforAction(PyforAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Loop Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Loop Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLoopAction(LoopAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalAction(ConditionalAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Return Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Return Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturnAction(ReturnAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Print Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Print Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrintAction(PrintAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Error Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Error Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseErrorAction(ErrorAction object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Start Session</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Start Session</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStartSession(StartSession object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallStatement(FunctionCallStatement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Extern Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Extern Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternExpression(ExternExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLiteral(Literal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Init</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Init</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayInit(ArrayInit object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enum Literal Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumLiteralRef(EnumLiteralRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Byte Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Byte Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseByteLiteral(ByteLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharLiteral(CharLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerLiteral(IntegerLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanLiteral(BooleanLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringLiteral(StringLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Double Literal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDoubleLiteral(DoubleLiteral object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyReference(PropertyReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cproperty Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cproperty Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCpropertyReference(CpropertyReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventReference(EventReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Function Call Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFunctionCallExpression(FunctionCallExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfiguration(Configuration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstance(Instance object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Config Property Assign</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Config Property Assign</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConfigPropertyAssign(ConfigPropertyAssign object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractConnector(AbstractConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConnector(Connector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Connector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Connector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalConnector(ExternalConnector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpression(OrExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpression(AndExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equals Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEqualsExpression(EqualsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Equals Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Equals Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotEqualsExpression(NotEqualsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterExpression(GreaterExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerExpression(LowerExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Greater Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Greater Or Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGreaterOrEqualExpression(GreaterOrEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lower Or Equal Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lower Or Equal Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLowerOrEqualExpression(LowerOrEqualExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlusExpression(PlusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinusExpression(MinusExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Times Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Times Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTimesExpression(TimesExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDivExpression(DivExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mod Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModExpression(ModExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cast Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCastExpression(CastExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionGroup(ExpressionGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNotExpression(NotExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Unary Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUnaryMinus(UnaryMinus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Index</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayIndex(ArrayIndex object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AiotMLSwitch
