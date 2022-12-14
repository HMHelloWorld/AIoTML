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

import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.DoubleLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Double Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.DoubleLiteralImpl#getDoubleValue <em>Double Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DoubleLiteralImpl extends LiteralImpl implements DoubleLiteral
{
  /**
   * The default value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected static final double DOUBLE_VALUE_EDEFAULT = 0.0;

  /**
   * The cached value of the '{@link #getDoubleValue() <em>Double Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleValue()
   * @generated
   * @ordered
   */
  protected double doubleValue = DOUBLE_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DoubleLiteralImpl()
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
    return AiotMLPackage.Literals.DOUBLE_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public double getDoubleValue()
  {
    return doubleValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDoubleValue(double newDoubleValue)
  {
    double oldDoubleValue = doubleValue;
    doubleValue = newDoubleValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE, oldDoubleValue, doubleValue));
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
      case AiotMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
        return getDoubleValue();
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
      case AiotMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
        setDoubleValue((Double)newValue);
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
      case AiotMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
        setDoubleValue(DOUBLE_VALUE_EDEFAULT);
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
      case AiotMLPackage.DOUBLE_LITERAL__DOUBLE_VALUE:
        return doubleValue != DOUBLE_VALUE_EDEFAULT;
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
    result.append(" (doubleValue: ");
    result.append(doubleValue);
    result.append(')');
    return result.toString();
  }

} //DoubleLiteralImpl
