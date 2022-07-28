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

import org.aiotml.xtext.aiotML.Agent;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.StrategyAssignment;
import org.aiotml.xtext.aiotML.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl#getRbindFunction <em>Rbind Function</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl#getIbindFunction <em>Ibind Function</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl#getObindFunction <em>Obind Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyAssignmentImpl extends MinimalEObjectImpl.Container implements StrategyAssignment
{
  /**
   * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategy()
   * @generated
   * @ordered
   */
  protected Variable strategy;

  /**
   * The cached value of the '{@link #getAgent() <em>Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAgent()
   * @generated
   * @ordered
   */
  protected Agent agent;

  /**
   * The cached value of the '{@link #getRbindFunction() <em>Rbind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRbindFunction()
   * @generated
   * @ordered
   */
  protected Property rbindFunction;

  /**
   * The cached value of the '{@link #getIbindFunction() <em>Ibind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIbindFunction()
   * @generated
   * @ordered
   */
  protected Property ibindFunction;

  /**
   * The cached value of the '{@link #getObindFunction() <em>Obind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObindFunction()
   * @generated
   * @ordered
   */
  protected Property obindFunction;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyAssignmentImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AiotMLPackage.Literals.STRATEGY_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getStrategy()
  {
    if (strategy != null && strategy.eIsProxy())
    {
      InternalEObject oldStrategy = (InternalEObject)strategy;
      strategy = (Variable)eResolveProxy(oldStrategy);
      if (strategy != oldStrategy)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY, oldStrategy, strategy));
      }
    }
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetStrategy()
  {
    return strategy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrategy(Variable newStrategy)
  {
    Variable oldStrategy = strategy;
    strategy = newStrategy;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Agent getAgent()
  {
    if (agent != null && agent.eIsProxy())
    {
      InternalEObject oldAgent = (InternalEObject)agent;
      agent = (Agent)eResolveProxy(oldAgent);
      if (agent != oldAgent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT, oldAgent, agent));
      }
    }
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Agent basicGetAgent()
  {
    return agent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAgent(Agent newAgent)
  {
    Agent oldAgent = agent;
    agent = newAgent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT, oldAgent, agent));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getRbindFunction()
  {
    if (rbindFunction != null && rbindFunction.eIsProxy())
    {
      InternalEObject oldRbindFunction = (InternalEObject)rbindFunction;
      rbindFunction = (Property)eResolveProxy(oldRbindFunction);
      if (rbindFunction != oldRbindFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION, oldRbindFunction, rbindFunction));
      }
    }
    return rbindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetRbindFunction()
  {
    return rbindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRbindFunction(Property newRbindFunction)
  {
    Property oldRbindFunction = rbindFunction;
    rbindFunction = newRbindFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION, oldRbindFunction, rbindFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getIbindFunction()
  {
    if (ibindFunction != null && ibindFunction.eIsProxy())
    {
      InternalEObject oldIbindFunction = (InternalEObject)ibindFunction;
      ibindFunction = (Property)eResolveProxy(oldIbindFunction);
      if (ibindFunction != oldIbindFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION, oldIbindFunction, ibindFunction));
      }
    }
    return ibindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetIbindFunction()
  {
    return ibindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIbindFunction(Property newIbindFunction)
  {
    Property oldIbindFunction = ibindFunction;
    ibindFunction = newIbindFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION, oldIbindFunction, ibindFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Property getObindFunction()
  {
    if (obindFunction != null && obindFunction.eIsProxy())
    {
      InternalEObject oldObindFunction = (InternalEObject)obindFunction;
      obindFunction = (Property)eResolveProxy(oldObindFunction);
      if (obindFunction != oldObindFunction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION, oldObindFunction, obindFunction));
      }
    }
    return obindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetObindFunction()
  {
    return obindFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setObindFunction(Property newObindFunction)
  {
    Property oldObindFunction = obindFunction;
    obindFunction = newObindFunction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION, oldObindFunction, obindFunction));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY:
        if (resolve) return getStrategy();
        return basicGetStrategy();
      case AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT:
        if (resolve) return getAgent();
        return basicGetAgent();
      case AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION:
        if (resolve) return getRbindFunction();
        return basicGetRbindFunction();
      case AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION:
        if (resolve) return getIbindFunction();
        return basicGetIbindFunction();
      case AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION:
        if (resolve) return getObindFunction();
        return basicGetObindFunction();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY:
        setStrategy((Variable)newValue);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT:
        setAgent((Agent)newValue);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION:
        setRbindFunction((Property)newValue);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION:
        setIbindFunction((Property)newValue);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION:
        setObindFunction((Property)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY:
        setStrategy((Variable)null);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT:
        setAgent((Agent)null);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION:
        setRbindFunction((Property)null);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION:
        setIbindFunction((Property)null);
        return;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION:
        setObindFunction((Property)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AiotMLPackage.STRATEGY_ASSIGNMENT__STRATEGY:
        return strategy != null;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__AGENT:
        return agent != null;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__RBIND_FUNCTION:
        return rbindFunction != null;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__IBIND_FUNCTION:
        return ibindFunction != null;
      case AiotMLPackage.STRATEGY_ASSIGNMENT__OBIND_FUNCTION:
        return obindFunction != null;
    }
    return super.eIsSet(featureID);
  }

} //StrategyAssignmentImpl
