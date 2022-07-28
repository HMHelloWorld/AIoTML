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

import java.util.Collection;

import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.StrategyStream;
import org.aiotml.xtext.aiotML.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Strategy Stream</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyStreamImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyStreamImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyStreamImpl#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyStreamImpl extends ActionImpl implements StrategyStream
{
  /**
   * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInputs()
   * @generated
   * @ordered
   */
  protected EList<Variable> inputs;

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
   * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutputs()
   * @generated
   * @ordered
   */
  protected EList<Variable> outputs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyStreamImpl()
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
    return AiotMLPackage.Literals.STRATEGY_STREAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getInputs()
  {
    if (inputs == null)
    {
      inputs = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.STRATEGY_STREAM__INPUTS);
    }
    return inputs;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STRATEGY_STREAM__STRATEGY, oldStrategy, strategy));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY_STREAM__STRATEGY, oldStrategy, strategy));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getOutputs()
  {
    if (outputs == null)
    {
      outputs = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.STRATEGY_STREAM__OUTPUTS);
    }
    return outputs;
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
      case AiotMLPackage.STRATEGY_STREAM__INPUTS:
        return getInputs();
      case AiotMLPackage.STRATEGY_STREAM__STRATEGY:
        if (resolve) return getStrategy();
        return basicGetStrategy();
      case AiotMLPackage.STRATEGY_STREAM__OUTPUTS:
        return getOutputs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiotMLPackage.STRATEGY_STREAM__INPUTS:
        getInputs().clear();
        getInputs().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.STRATEGY_STREAM__STRATEGY:
        setStrategy((Variable)newValue);
        return;
      case AiotMLPackage.STRATEGY_STREAM__OUTPUTS:
        getOutputs().clear();
        getOutputs().addAll((Collection<? extends Variable>)newValue);
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
      case AiotMLPackage.STRATEGY_STREAM__INPUTS:
        getInputs().clear();
        return;
      case AiotMLPackage.STRATEGY_STREAM__STRATEGY:
        setStrategy((Variable)null);
        return;
      case AiotMLPackage.STRATEGY_STREAM__OUTPUTS:
        getOutputs().clear();
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
      case AiotMLPackage.STRATEGY_STREAM__INPUTS:
        return inputs != null && !inputs.isEmpty();
      case AiotMLPackage.STRATEGY_STREAM__STRATEGY:
        return strategy != null;
      case AiotMLPackage.STRATEGY_STREAM__OUTPUTS:
        return outputs != null && !outputs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StrategyStreamImpl
