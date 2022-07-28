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
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.ModelReference;
import org.aiotml.xtext.aiotML.Strategy;
import org.aiotml.xtext.aiotML.Tensor;

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
 * An implementation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getTensor <em>Tensor</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getRewdims <em>Rewdims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getObsdims <em>Obsdims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getActiondims <em>Actiondims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getPmodel <em>Pmodel</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StrategyImpl#getQmodel <em>Qmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StrategyImpl extends TypeImpl implements Strategy
{
  /**
   * The cached value of the '{@link #getTensor() <em>Tensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTensor()
   * @generated
   * @ordered
   */
  protected Tensor tensor;

  /**
   * The cached value of the '{@link #getDevices() <em>Devices</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevices()
   * @generated
   * @ordered
   */
  protected EList<Cproperty> devices;

  /**
   * The cached value of the '{@link #getRewdims() <em>Rewdims</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRewdims()
   * @generated
   * @ordered
   */
  protected EList<IntegerLiteral> rewdims;

  /**
   * The cached value of the '{@link #getObsdims() <em>Obsdims</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObsdims()
   * @generated
   * @ordered
   */
  protected EList<IntegerLiteral> obsdims;

  /**
   * The cached value of the '{@link #getActiondims() <em>Actiondims</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActiondims()
   * @generated
   * @ordered
   */
  protected EList<IntegerLiteral> actiondims;

  /**
   * The cached value of the '{@link #getPmodel() <em>Pmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPmodel()
   * @generated
   * @ordered
   */
  protected ModelReference pmodel;

  /**
   * The cached value of the '{@link #getQmodel() <em>Qmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQmodel()
   * @generated
   * @ordered
   */
  protected ModelReference qmodel;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StrategyImpl()
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
    return AiotMLPackage.Literals.STRATEGY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Tensor getTensor()
  {
    return tensor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTensor(Tensor newTensor, NotificationChain msgs)
  {
    Tensor oldTensor = tensor;
    tensor = newTensor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__TENSOR, oldTensor, newTensor);
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
  public void setTensor(Tensor newTensor)
  {
    if (newTensor != tensor)
    {
      NotificationChain msgs = null;
      if (tensor != null)
        msgs = ((InternalEObject)tensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__TENSOR, null, msgs);
      if (newTensor != null)
        msgs = ((InternalEObject)newTensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__TENSOR, null, msgs);
      msgs = basicSetTensor(newTensor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__TENSOR, newTensor, newTensor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Cproperty> getDevices()
  {
    if (devices == null)
    {
      devices = new EObjectContainmentEList<Cproperty>(Cproperty.class, this, AiotMLPackage.STRATEGY__DEVICES);
    }
    return devices;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntegerLiteral> getRewdims()
  {
    if (rewdims == null)
    {
      rewdims = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, AiotMLPackage.STRATEGY__REWDIMS);
    }
    return rewdims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntegerLiteral> getObsdims()
  {
    if (obsdims == null)
    {
      obsdims = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, AiotMLPackage.STRATEGY__OBSDIMS);
    }
    return obsdims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntegerLiteral> getActiondims()
  {
    if (actiondims == null)
    {
      actiondims = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, AiotMLPackage.STRATEGY__ACTIONDIMS);
    }
    return actiondims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelReference getPmodel()
  {
    return pmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPmodel(ModelReference newPmodel, NotificationChain msgs)
  {
    ModelReference oldPmodel = pmodel;
    pmodel = newPmodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__PMODEL, oldPmodel, newPmodel);
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
  public void setPmodel(ModelReference newPmodel)
  {
    if (newPmodel != pmodel)
    {
      NotificationChain msgs = null;
      if (pmodel != null)
        msgs = ((InternalEObject)pmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__PMODEL, null, msgs);
      if (newPmodel != null)
        msgs = ((InternalEObject)newPmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__PMODEL, null, msgs);
      msgs = basicSetPmodel(newPmodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__PMODEL, newPmodel, newPmodel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModelReference getQmodel()
  {
    return qmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetQmodel(ModelReference newQmodel, NotificationChain msgs)
  {
    ModelReference oldQmodel = qmodel;
    qmodel = newQmodel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__QMODEL, oldQmodel, newQmodel);
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
  public void setQmodel(ModelReference newQmodel)
  {
    if (newQmodel != qmodel)
    {
      NotificationChain msgs = null;
      if (qmodel != null)
        msgs = ((InternalEObject)qmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__QMODEL, null, msgs);
      if (newQmodel != null)
        msgs = ((InternalEObject)newQmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STRATEGY__QMODEL, null, msgs);
      msgs = basicSetQmodel(newQmodel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STRATEGY__QMODEL, newQmodel, newQmodel));
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
      case AiotMLPackage.STRATEGY__TENSOR:
        return basicSetTensor(null, msgs);
      case AiotMLPackage.STRATEGY__DEVICES:
        return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STRATEGY__REWDIMS:
        return ((InternalEList<?>)getRewdims()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STRATEGY__OBSDIMS:
        return ((InternalEList<?>)getObsdims()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STRATEGY__ACTIONDIMS:
        return ((InternalEList<?>)getActiondims()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STRATEGY__PMODEL:
        return basicSetPmodel(null, msgs);
      case AiotMLPackage.STRATEGY__QMODEL:
        return basicSetQmodel(null, msgs);
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
      case AiotMLPackage.STRATEGY__TENSOR:
        return getTensor();
      case AiotMLPackage.STRATEGY__DEVICES:
        return getDevices();
      case AiotMLPackage.STRATEGY__REWDIMS:
        return getRewdims();
      case AiotMLPackage.STRATEGY__OBSDIMS:
        return getObsdims();
      case AiotMLPackage.STRATEGY__ACTIONDIMS:
        return getActiondims();
      case AiotMLPackage.STRATEGY__PMODEL:
        return getPmodel();
      case AiotMLPackage.STRATEGY__QMODEL:
        return getQmodel();
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
      case AiotMLPackage.STRATEGY__TENSOR:
        setTensor((Tensor)newValue);
        return;
      case AiotMLPackage.STRATEGY__DEVICES:
        getDevices().clear();
        getDevices().addAll((Collection<? extends Cproperty>)newValue);
        return;
      case AiotMLPackage.STRATEGY__REWDIMS:
        getRewdims().clear();
        getRewdims().addAll((Collection<? extends IntegerLiteral>)newValue);
        return;
      case AiotMLPackage.STRATEGY__OBSDIMS:
        getObsdims().clear();
        getObsdims().addAll((Collection<? extends IntegerLiteral>)newValue);
        return;
      case AiotMLPackage.STRATEGY__ACTIONDIMS:
        getActiondims().clear();
        getActiondims().addAll((Collection<? extends IntegerLiteral>)newValue);
        return;
      case AiotMLPackage.STRATEGY__PMODEL:
        setPmodel((ModelReference)newValue);
        return;
      case AiotMLPackage.STRATEGY__QMODEL:
        setQmodel((ModelReference)newValue);
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
      case AiotMLPackage.STRATEGY__TENSOR:
        setTensor((Tensor)null);
        return;
      case AiotMLPackage.STRATEGY__DEVICES:
        getDevices().clear();
        return;
      case AiotMLPackage.STRATEGY__REWDIMS:
        getRewdims().clear();
        return;
      case AiotMLPackage.STRATEGY__OBSDIMS:
        getObsdims().clear();
        return;
      case AiotMLPackage.STRATEGY__ACTIONDIMS:
        getActiondims().clear();
        return;
      case AiotMLPackage.STRATEGY__PMODEL:
        setPmodel((ModelReference)null);
        return;
      case AiotMLPackage.STRATEGY__QMODEL:
        setQmodel((ModelReference)null);
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
      case AiotMLPackage.STRATEGY__TENSOR:
        return tensor != null;
      case AiotMLPackage.STRATEGY__DEVICES:
        return devices != null && !devices.isEmpty();
      case AiotMLPackage.STRATEGY__REWDIMS:
        return rewdims != null && !rewdims.isEmpty();
      case AiotMLPackage.STRATEGY__OBSDIMS:
        return obsdims != null && !obsdims.isEmpty();
      case AiotMLPackage.STRATEGY__ACTIONDIMS:
        return actiondims != null && !actiondims.isEmpty();
      case AiotMLPackage.STRATEGY__PMODEL:
        return pmodel != null;
      case AiotMLPackage.STRATEGY__QMODEL:
        return qmodel != null;
    }
    return super.eIsSet(featureID);
  }

} //StrategyImpl
