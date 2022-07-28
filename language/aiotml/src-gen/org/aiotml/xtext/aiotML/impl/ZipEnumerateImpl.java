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
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.ZipEnumerate;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Zip Enumerate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl#getVars <em>Vars</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl#getFname <em>Fname</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl#getSets <em>Sets</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZipEnumerateImpl extends ActionImpl implements ZipEnumerate
{
  /**
   * The cached value of the '{@link #getVars() <em>Vars</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVars()
   * @generated
   * @ordered
   */
  protected EList<Variable> vars;

  /**
   * The default value of the '{@link #getFname() <em>Fname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFname()
   * @generated
   * @ordered
   */
  protected static final String FNAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFname() <em>Fname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFname()
   * @generated
   * @ordered
   */
  protected String fname = FNAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getSets() <em>Sets</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSets()
   * @generated
   * @ordered
   */
  protected EList<Variable> sets;

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
  protected ZipEnumerateImpl()
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
    return AiotMLPackage.Literals.ZIP_ENUMERATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getVars()
  {
    if (vars == null)
    {
      vars = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.ZIP_ENUMERATE__VARS);
    }
    return vars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getFname()
  {
    return fname;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFname(String newFname)
  {
    String oldFname = fname;
    fname = newFname;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.ZIP_ENUMERATE__FNAME, oldFname, fname));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getSets()
  {
    if (sets == null)
    {
      sets = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.ZIP_ENUMERATE__SETS);
    }
    return sets;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.ZIP_ENUMERATE__ACTION, oldAction, newAction);
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
        msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.ZIP_ENUMERATE__ACTION, null, msgs);
      if (newAction != null)
        msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.ZIP_ENUMERATE__ACTION, null, msgs);
      msgs = basicSetAction(newAction, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.ZIP_ENUMERATE__ACTION, newAction, newAction));
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
      case AiotMLPackage.ZIP_ENUMERATE__ACTION:
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
      case AiotMLPackage.ZIP_ENUMERATE__VARS:
        return getVars();
      case AiotMLPackage.ZIP_ENUMERATE__FNAME:
        return getFname();
      case AiotMLPackage.ZIP_ENUMERATE__SETS:
        return getSets();
      case AiotMLPackage.ZIP_ENUMERATE__ACTION:
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
      case AiotMLPackage.ZIP_ENUMERATE__VARS:
        getVars().clear();
        getVars().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.ZIP_ENUMERATE__FNAME:
        setFname((String)newValue);
        return;
      case AiotMLPackage.ZIP_ENUMERATE__SETS:
        getSets().clear();
        getSets().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.ZIP_ENUMERATE__ACTION:
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
      case AiotMLPackage.ZIP_ENUMERATE__VARS:
        getVars().clear();
        return;
      case AiotMLPackage.ZIP_ENUMERATE__FNAME:
        setFname(FNAME_EDEFAULT);
        return;
      case AiotMLPackage.ZIP_ENUMERATE__SETS:
        getSets().clear();
        return;
      case AiotMLPackage.ZIP_ENUMERATE__ACTION:
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
      case AiotMLPackage.ZIP_ENUMERATE__VARS:
        return vars != null && !vars.isEmpty();
      case AiotMLPackage.ZIP_ENUMERATE__FNAME:
        return FNAME_EDEFAULT == null ? fname != null : !FNAME_EDEFAULT.equals(fname);
      case AiotMLPackage.ZIP_ENUMERATE__SETS:
        return sets != null && !sets.isEmpty();
      case AiotMLPackage.ZIP_ENUMERATE__ACTION:
        return action != null;
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
    result.append(" (fname: ");
    result.append(fname);
    result.append(')');
    return result.toString();
  }

} //ZipEnumerateImpl
