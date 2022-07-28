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
import org.aiotml.xtext.aiotML.Event;
import org.aiotml.xtext.aiotML.EventReference;
import org.aiotml.xtext.aiotML.Parameter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.EventReferenceImpl#getReceiveMsg <em>Receive Msg</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.EventReferenceImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventReferenceImpl extends ExpressionImpl implements EventReference
{
  /**
   * The cached value of the '{@link #getReceiveMsg() <em>Receive Msg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceiveMsg()
   * @generated
   * @ordered
   */
  protected Event receiveMsg;

  /**
   * The cached value of the '{@link #getParameter() <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameter()
   * @generated
   * @ordered
   */
  protected Parameter parameter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventReferenceImpl()
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
    return AiotMLPackage.Literals.EVENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event getReceiveMsg()
  {
    if (receiveMsg != null && receiveMsg.eIsProxy())
    {
      InternalEObject oldReceiveMsg = (InternalEObject)receiveMsg;
      receiveMsg = (Event)eResolveProxy(oldReceiveMsg);
      if (receiveMsg != oldReceiveMsg)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG, oldReceiveMsg, receiveMsg));
      }
    }
    return receiveMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetReceiveMsg()
  {
    return receiveMsg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setReceiveMsg(Event newReceiveMsg)
  {
    Event oldReceiveMsg = receiveMsg;
    receiveMsg = newReceiveMsg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG, oldReceiveMsg, receiveMsg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter getParameter()
  {
    if (parameter != null && parameter.eIsProxy())
    {
      InternalEObject oldParameter = (InternalEObject)parameter;
      parameter = (Parameter)eResolveProxy(oldParameter);
      if (parameter != oldParameter)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.EVENT_REFERENCE__PARAMETER, oldParameter, parameter));
      }
    }
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter basicGetParameter()
  {
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setParameter(Parameter newParameter)
  {
    Parameter oldParameter = parameter;
    parameter = newParameter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.EVENT_REFERENCE__PARAMETER, oldParameter, parameter));
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
      case AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
        if (resolve) return getReceiveMsg();
        return basicGetReceiveMsg();
      case AiotMLPackage.EVENT_REFERENCE__PARAMETER:
        if (resolve) return getParameter();
        return basicGetParameter();
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
      case AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
        setReceiveMsg((Event)newValue);
        return;
      case AiotMLPackage.EVENT_REFERENCE__PARAMETER:
        setParameter((Parameter)newValue);
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
      case AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
        setReceiveMsg((Event)null);
        return;
      case AiotMLPackage.EVENT_REFERENCE__PARAMETER:
        setParameter((Parameter)null);
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
      case AiotMLPackage.EVENT_REFERENCE__RECEIVE_MSG:
        return receiveMsg != null;
      case AiotMLPackage.EVENT_REFERENCE__PARAMETER:
        return parameter != null;
    }
    return super.eIsSet(featureID);
  }

} //EventReferenceImpl
