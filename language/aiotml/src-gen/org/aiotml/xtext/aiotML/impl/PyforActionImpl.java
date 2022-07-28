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

import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.PyforAction;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pyfor Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PyforActionImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PyforActionImpl#getArrays <em>Arrays</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PyforActionImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PyforActionImpl extends ActionImpl implements PyforAction
{
  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<Parameter> variables;

  /**
   * The cached value of the '{@link #getArrays() <em>Arrays</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrays()
   * @generated
   * @ordered
   */
  protected EList<PropertyReference> arrays;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PyforActionImpl()
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
    return AiotMLPackage.Literals.PYFOR_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Parameter> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<Parameter>(Parameter.class, this, AiotMLPackage.PYFOR_ACTION__VARIABLES);
    }
    return variables;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyReference> getArrays()
  {
    if (arrays == null)
    {
      arrays = new EObjectContainmentEList<PropertyReference>(PropertyReference.class, this, AiotMLPackage.PYFOR_ACTION__ARRAYS);
    }
    return arrays;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAction(Action newAction, NotificationChain msgs)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.PYFOR_ACTION__ACTION, oldAction, newAction);
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
  public void setAction(Action newAction)
  {
    if (newAction != action)
    {
      NotificationChain msgs = null;
      if (action != null)
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.PYFOR_ACTION__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.PYFOR_ACTION__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.PYFOR_ACTION__ACTION, newAction, newAction));
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
      case AiotMLPackage.PYFOR_ACTION__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.PYFOR_ACTION__ARRAYS:
        return ((InternalEList<?>)getArrays()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.PYFOR_ACTION__ACTION:
        return basicSetAction(null, msgs);
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
      case AiotMLPackage.PYFOR_ACTION__VARIABLES:
        return getVariables();
      case AiotMLPackage.PYFOR_ACTION__ARRAYS:
        return getArrays();
      case AiotMLPackage.PYFOR_ACTION__ACTION:
        return getAction();
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
      case AiotMLPackage.PYFOR_ACTION__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends Parameter>)newValue);
        return;
      case AiotMLPackage.PYFOR_ACTION__ARRAYS:
        getArrays().clear();
        getArrays().addAll((Collection<? extends PropertyReference>)newValue);
        return;
      case AiotMLPackage.PYFOR_ACTION__ACTION:
        setAction((Action)newValue);
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
      case AiotMLPackage.PYFOR_ACTION__VARIABLES:
        getVariables().clear();
        return;
      case AiotMLPackage.PYFOR_ACTION__ARRAYS:
        getArrays().clear();
        return;
      case AiotMLPackage.PYFOR_ACTION__ACTION:
        setAction((Action)null);
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
      case AiotMLPackage.PYFOR_ACTION__VARIABLES:
        return variables != null && !variables.isEmpty();
      case AiotMLPackage.PYFOR_ACTION__ARRAYS:
        return arrays != null && !arrays.isEmpty();
      case AiotMLPackage.PYFOR_ACTION__ACTION:
        return action != null;
    }
    return super.eIsSet(featureID);
  }

} //PyforActionImpl
