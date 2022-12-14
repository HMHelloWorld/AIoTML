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
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;

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
 * An implementation of the model object '<em><b>State Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl#isHistory <em>History</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl#getSubstate <em>Substate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateContainerImpl extends NamedElementImpl implements StateContainer
{
  /**
   * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAnnotations()
   * @generated
   * @ordered
   */
  protected EList<PlatformAnnotation> annotations;

  /**
   * The cached value of the '{@link #getInitial() <em>Initial</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitial()
   * @generated
   * @ordered
   */
  protected State initial;

  /**
   * The default value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected static final boolean HISTORY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isHistory() <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isHistory()
   * @generated
   * @ordered
   */
  protected boolean history = HISTORY_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubstate() <em>Substate</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstate()
   * @generated
   * @ordered
   */
  protected EList<State> substate;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateContainerImpl()
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
    return AiotMLPackage.Literals.STATE_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PlatformAnnotation> getAnnotations()
  {
    if (annotations == null)
    {
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, AiotMLPackage.STATE_CONTAINER__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public State getInitial()
  {
    if (initial != null && initial.eIsProxy())
    {
      InternalEObject oldInitial = (InternalEObject)initial;
      initial = (State)eResolveProxy(oldInitial);
      if (initial != oldInitial)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.STATE_CONTAINER__INITIAL, oldInitial, initial));
      }
    }
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetInitial()
  {
    return initial;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInitial(State newInitial)
  {
    State oldInitial = initial;
    initial = newInitial;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE_CONTAINER__INITIAL, oldInitial, initial));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isHistory()
  {
    return history;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHistory(boolean newHistory)
  {
    boolean oldHistory = history;
    history = newHistory;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE_CONTAINER__HISTORY, oldHistory, history));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<State> getSubstate()
  {
    if (substate == null)
    {
      substate = new EObjectContainmentEList<State>(State.class, this, AiotMLPackage.STATE_CONTAINER__SUBSTATE);
    }
    return substate;
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
      case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STATE_CONTAINER__SUBSTATE:
        return ((InternalEList<?>)getSubstate()).basicRemove(otherEnd, msgs);
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
      case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS:
        return getAnnotations();
      case AiotMLPackage.STATE_CONTAINER__INITIAL:
        if (resolve) return getInitial();
        return basicGetInitial();
      case AiotMLPackage.STATE_CONTAINER__HISTORY:
        return isHistory();
      case AiotMLPackage.STATE_CONTAINER__SUBSTATE:
        return getSubstate();
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
      case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
        return;
      case AiotMLPackage.STATE_CONTAINER__INITIAL:
        setInitial((State)newValue);
        return;
      case AiotMLPackage.STATE_CONTAINER__HISTORY:
        setHistory((Boolean)newValue);
        return;
      case AiotMLPackage.STATE_CONTAINER__SUBSTATE:
        getSubstate().clear();
        getSubstate().addAll((Collection<? extends State>)newValue);
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
      case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AiotMLPackage.STATE_CONTAINER__INITIAL:
        setInitial((State)null);
        return;
      case AiotMLPackage.STATE_CONTAINER__HISTORY:
        setHistory(HISTORY_EDEFAULT);
        return;
      case AiotMLPackage.STATE_CONTAINER__SUBSTATE:
        getSubstate().clear();
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
      case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AiotMLPackage.STATE_CONTAINER__INITIAL:
        return initial != null;
      case AiotMLPackage.STATE_CONTAINER__HISTORY:
        return history != HISTORY_EDEFAULT;
      case AiotMLPackage.STATE_CONTAINER__SUBSTATE:
        return substate != null && !substate.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == AnnotatedElement.class)
    {
      switch (derivedFeatureID)
      {
        case AiotMLPackage.STATE_CONTAINER__ANNOTATIONS: return AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == AnnotatedElement.class)
    {
      switch (baseFeatureID)
      {
        case AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return AiotMLPackage.STATE_CONTAINER__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (history: ");
    result.append(history);
    result.append(')');
    return result.toString();
  }

} //StateContainerImpl
