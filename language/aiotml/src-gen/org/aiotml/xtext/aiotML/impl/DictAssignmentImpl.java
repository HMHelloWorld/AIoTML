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
import org.aiotml.xtext.aiotML.DictAssignment;
import org.aiotml.xtext.aiotML.Variable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dict Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.DictAssignmentImpl#getDict <em>Dict</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.DictAssignmentImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.DictAssignmentImpl#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DictAssignmentImpl extends ActionImpl implements DictAssignment
{
  /**
   * The cached value of the '{@link #getDict() <em>Dict</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDict()
   * @generated
   * @ordered
   */
  protected Variable dict;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Variable> elements;

  /**
   * The cached value of the '{@link #getVar() <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar()
   * @generated
   * @ordered
   */
  protected Variable var;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DictAssignmentImpl()
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
    return AiotMLPackage.Literals.DICT_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getDict()
  {
    if (dict != null && dict.eIsProxy())
    {
      InternalEObject oldDict = (InternalEObject)dict;
      dict = (Variable)eResolveProxy(oldDict);
      if (dict != oldDict)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.DICT_ASSIGNMENT__DICT, oldDict, dict));
      }
    }
    return dict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetDict()
  {
    return dict;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDict(Variable newDict)
  {
    Variable oldDict = dict;
    dict = newDict;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.DICT_ASSIGNMENT__DICT, oldDict, dict));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.DICT_ASSIGNMENT__ELEMENTS);
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getVar()
  {
    if (var != null && var.eIsProxy())
    {
      InternalEObject oldVar = (InternalEObject)var;
      var = (Variable)eResolveProxy(oldVar);
      if (var != oldVar)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.DICT_ASSIGNMENT__VAR, oldVar, var));
      }
    }
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetVar()
  {
    return var;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar(Variable newVar)
  {
    Variable oldVar = var;
    var = newVar;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.DICT_ASSIGNMENT__VAR, oldVar, var));
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
      case AiotMLPackage.DICT_ASSIGNMENT__DICT:
        if (resolve) return getDict();
        return basicGetDict();
      case AiotMLPackage.DICT_ASSIGNMENT__ELEMENTS:
        return getElements();
      case AiotMLPackage.DICT_ASSIGNMENT__VAR:
        if (resolve) return getVar();
        return basicGetVar();
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
      case AiotMLPackage.DICT_ASSIGNMENT__DICT:
        setDict((Variable)newValue);
        return;
      case AiotMLPackage.DICT_ASSIGNMENT__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.DICT_ASSIGNMENT__VAR:
        setVar((Variable)newValue);
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
      case AiotMLPackage.DICT_ASSIGNMENT__DICT:
        setDict((Variable)null);
        return;
      case AiotMLPackage.DICT_ASSIGNMENT__ELEMENTS:
        getElements().clear();
        return;
      case AiotMLPackage.DICT_ASSIGNMENT__VAR:
        setVar((Variable)null);
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
      case AiotMLPackage.DICT_ASSIGNMENT__DICT:
        return dict != null;
      case AiotMLPackage.DICT_ASSIGNMENT__ELEMENTS:
        return elements != null && !elements.isEmpty();
      case AiotMLPackage.DICT_ASSIGNMENT__VAR:
        return var != null;
    }
    return super.eIsSet(featureID);
  }

} //DictAssignmentImpl
