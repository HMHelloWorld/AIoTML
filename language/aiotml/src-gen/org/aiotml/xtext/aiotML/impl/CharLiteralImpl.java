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
import org.aiotml.xtext.aiotML.CharLiteral;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CharLiteralImpl#getCharValue <em>Char Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharLiteralImpl extends LiteralImpl implements CharLiteral
{
  /**
   * The default value of the '{@link #getCharValue() <em>Char Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharValue()
   * @generated
   * @ordered
   */
  protected static final byte CHAR_VALUE_EDEFAULT = 0x00;

  /**
   * The cached value of the '{@link #getCharValue() <em>Char Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharValue()
   * @generated
   * @ordered
   */
  protected byte charValue = CHAR_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CharLiteralImpl()
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
    return AiotMLPackage.Literals.CHAR_LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public byte getCharValue()
  {
    return charValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCharValue(byte newCharValue)
  {
    byte oldCharValue = charValue;
    charValue = newCharValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.CHAR_LITERAL__CHAR_VALUE, oldCharValue, charValue));
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
      case AiotMLPackage.CHAR_LITERAL__CHAR_VALUE:
        return getCharValue();
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
      case AiotMLPackage.CHAR_LITERAL__CHAR_VALUE:
        setCharValue((Byte)newValue);
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
      case AiotMLPackage.CHAR_LITERAL__CHAR_VALUE:
        setCharValue(CHAR_VALUE_EDEFAULT);
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
      case AiotMLPackage.CHAR_LITERAL__CHAR_VALUE:
        return charValue != CHAR_VALUE_EDEFAULT;
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
    result.append(" (charValue: ");
    result.append(charValue);
    result.append(')');
    return result.toString();
  }

} //CharLiteralImpl
