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
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Region;
import org.aiotml.xtext.aiotML.Session;
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
 * An implementation of the model object '<em><b>Composite State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl#isHistory <em>History</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl#getSubstate <em>Substate</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl#getRegion <em>Region</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl#getSession <em>Session</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeStateImpl extends StateImpl implements CompositeState
{
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
   * The cached value of the '{@link #getRegion() <em>Region</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRegion()
   * @generated
   * @ordered
   */
  protected EList<Region> region;

  /**
   * The cached value of the '{@link #getSession() <em>Session</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSession()
   * @generated
   * @ordered
   */
  protected EList<Session> session;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CompositeStateImpl()
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
    return AiotMLPackage.Literals.COMPOSITE_STATE;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.COMPOSITE_STATE__INITIAL, oldInitial, initial));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.COMPOSITE_STATE__INITIAL, oldInitial, initial));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.COMPOSITE_STATE__HISTORY, oldHistory, history));
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
      substate = new EObjectContainmentEList<State>(State.class, this, AiotMLPackage.COMPOSITE_STATE__SUBSTATE);
    }
    return substate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Region> getRegion()
  {
    if (region == null)
    {
      region = new EObjectContainmentEList<Region>(Region.class, this, AiotMLPackage.COMPOSITE_STATE__REGION);
    }
    return region;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Session> getSession()
  {
    if (session == null)
    {
      session = new EObjectContainmentEList<Session>(Session.class, this, AiotMLPackage.COMPOSITE_STATE__SESSION);
    }
    return session;
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
      case AiotMLPackage.COMPOSITE_STATE__SUBSTATE:
        return ((InternalEList<?>)getSubstate()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.COMPOSITE_STATE__REGION:
        return ((InternalEList<?>)getRegion()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.COMPOSITE_STATE__SESSION:
        return ((InternalEList<?>)getSession()).basicRemove(otherEnd, msgs);
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
      case AiotMLPackage.COMPOSITE_STATE__INITIAL:
        if (resolve) return getInitial();
        return basicGetInitial();
      case AiotMLPackage.COMPOSITE_STATE__HISTORY:
        return isHistory();
      case AiotMLPackage.COMPOSITE_STATE__SUBSTATE:
        return getSubstate();
      case AiotMLPackage.COMPOSITE_STATE__REGION:
        return getRegion();
      case AiotMLPackage.COMPOSITE_STATE__SESSION:
        return getSession();
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
      case AiotMLPackage.COMPOSITE_STATE__INITIAL:
        setInitial((State)newValue);
        return;
      case AiotMLPackage.COMPOSITE_STATE__HISTORY:
        setHistory((Boolean)newValue);
        return;
      case AiotMLPackage.COMPOSITE_STATE__SUBSTATE:
        getSubstate().clear();
        getSubstate().addAll((Collection<? extends State>)newValue);
        return;
      case AiotMLPackage.COMPOSITE_STATE__REGION:
        getRegion().clear();
        getRegion().addAll((Collection<? extends Region>)newValue);
        return;
      case AiotMLPackage.COMPOSITE_STATE__SESSION:
        getSession().clear();
        getSession().addAll((Collection<? extends Session>)newValue);
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
      case AiotMLPackage.COMPOSITE_STATE__INITIAL:
        setInitial((State)null);
        return;
      case AiotMLPackage.COMPOSITE_STATE__HISTORY:
        setHistory(HISTORY_EDEFAULT);
        return;
      case AiotMLPackage.COMPOSITE_STATE__SUBSTATE:
        getSubstate().clear();
        return;
      case AiotMLPackage.COMPOSITE_STATE__REGION:
        getRegion().clear();
        return;
      case AiotMLPackage.COMPOSITE_STATE__SESSION:
        getSession().clear();
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
      case AiotMLPackage.COMPOSITE_STATE__INITIAL:
        return initial != null;
      case AiotMLPackage.COMPOSITE_STATE__HISTORY:
        return history != HISTORY_EDEFAULT;
      case AiotMLPackage.COMPOSITE_STATE__SUBSTATE:
        return substate != null && !substate.isEmpty();
      case AiotMLPackage.COMPOSITE_STATE__REGION:
        return region != null && !region.isEmpty();
      case AiotMLPackage.COMPOSITE_STATE__SESSION:
        return session != null && !session.isEmpty();
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
    if (baseClass == StateContainer.class)
    {
      switch (derivedFeatureID)
      {
        case AiotMLPackage.COMPOSITE_STATE__INITIAL: return AiotMLPackage.STATE_CONTAINER__INITIAL;
        case AiotMLPackage.COMPOSITE_STATE__HISTORY: return AiotMLPackage.STATE_CONTAINER__HISTORY;
        case AiotMLPackage.COMPOSITE_STATE__SUBSTATE: return AiotMLPackage.STATE_CONTAINER__SUBSTATE;
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
    if (baseClass == StateContainer.class)
    {
      switch (baseFeatureID)
      {
        case AiotMLPackage.STATE_CONTAINER__INITIAL: return AiotMLPackage.COMPOSITE_STATE__INITIAL;
        case AiotMLPackage.STATE_CONTAINER__HISTORY: return AiotMLPackage.COMPOSITE_STATE__HISTORY;
        case AiotMLPackage.STATE_CONTAINER__SUBSTATE: return AiotMLPackage.COMPOSITE_STATE__SUBSTATE;
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

} //CompositeStateImpl
