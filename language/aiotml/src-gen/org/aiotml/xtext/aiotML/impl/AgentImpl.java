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
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.StrategyProperty;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AgentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AgentImpl#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AgentImpl#getAmodel <em>Amodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgentImpl extends MinimalEObjectImpl.Container implements Agent
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getCardinality() <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCardinality()
   * @generated
   * @ordered
   */
  protected IntegerLiteral cardinality;

  /**
   * The cached value of the '{@link #getAmodel() <em>Amodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAmodel()
   * @generated
   * @ordered
   */
  protected StrategyProperty amodel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AgentImpl()
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
    return AiotMLPackage.Literals.AGENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.AGENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerLiteral getCardinality()
  {
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCardinality(IntegerLiteral newCardinality, NotificationChain msgs)
  {
    IntegerLiteral oldCardinality = cardinality;
    cardinality = newCardinality;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.AGENT__CARDINALITY, oldCardinality, newCardinality);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCardinality(IntegerLiteral newCardinality)
  {
    if (newCardinality != cardinality)
    {
      NotificationChain msgs = null;
      if (cardinality != null)
        msgs = ((InternalEObject)cardinality).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.AGENT__CARDINALITY, null, msgs);
      if (newCardinality != null)
        msgs = ((InternalEObject)newCardinality).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.AGENT__CARDINALITY, null, msgs);
      msgs = basicSetCardinality(newCardinality, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.AGENT__CARDINALITY, newCardinality, newCardinality));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StrategyProperty getAmodel()
  {
    return amodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAmodel(StrategyProperty newAmodel, NotificationChain msgs)
  {
    StrategyProperty oldAmodel = amodel;
    amodel = newAmodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.AGENT__AMODEL, oldAmodel, newAmodel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAmodel(StrategyProperty newAmodel)
  {
    if (newAmodel != amodel)
    {
      NotificationChain msgs = null;
      if (amodel != null)
        msgs = ((InternalEObject)amodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.AGENT__AMODEL, null, msgs);
      if (newAmodel != null)
        msgs = ((InternalEObject)newAmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.AGENT__AMODEL, null, msgs);
      msgs = basicSetAmodel(newAmodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.AGENT__AMODEL, newAmodel, newAmodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AiotMLPackage.AGENT__CARDINALITY:
        return basicSetCardinality(null, msgs);
      case AiotMLPackage.AGENT__AMODEL:
        return basicSetAmodel(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AiotMLPackage.AGENT__NAME:
        return getName();
      case AiotMLPackage.AGENT__CARDINALITY:
        return getCardinality();
      case AiotMLPackage.AGENT__AMODEL:
        return getAmodel();
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
      case AiotMLPackage.AGENT__NAME:
        setName((String)newValue);
        return;
      case AiotMLPackage.AGENT__CARDINALITY:
        setCardinality((IntegerLiteral)newValue);
        return;
      case AiotMLPackage.AGENT__AMODEL:
        setAmodel((StrategyProperty)newValue);
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
      case AiotMLPackage.AGENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AiotMLPackage.AGENT__CARDINALITY:
        setCardinality((IntegerLiteral)null);
        return;
      case AiotMLPackage.AGENT__AMODEL:
        setAmodel((StrategyProperty)null);
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
      case AiotMLPackage.AGENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AiotMLPackage.AGENT__CARDINALITY:
        return cardinality != null;
      case AiotMLPackage.AGENT__AMODEL:
        return amodel != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AgentImpl
