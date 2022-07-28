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
import org.aiotml.xtext.aiotML.CpropertyReference;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cproperty Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl#getCpropertys <em>Cpropertys</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl#getCindex <em>Cindex</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl#getPindex <em>Pindex</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CpropertyReferenceImpl extends ExpressionImpl implements CpropertyReference
{
  /**
   * The cached value of the '{@link #getCpropertys() <em>Cpropertys</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCpropertys()
   * @generated
   * @ordered
   */
  protected EList<Variable> cpropertys;

  /**
   * The cached value of the '{@link #getCindex() <em>Cindex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCindex()
   * @generated
   * @ordered
   */
  protected Expression cindex;

  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Variable property;

  /**
   * The cached value of the '{@link #getPindex() <em>Pindex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPindex()
   * @generated
   * @ordered
   */
  protected Expression pindex;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CpropertyReferenceImpl()
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
    return AiotMLPackage.Literals.CPROPERTY_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getCpropertys()
  {
    if (cpropertys == null)
    {
      cpropertys = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.CPROPERTY_REFERENCE__CPROPERTYS);
    }
    return cpropertys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getCindex()
  {
    return cindex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCindex(Expression newCindex, NotificationChain msgs)
  {
    Expression oldCindex = cindex;
    cindex = newCindex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.CPROPERTY_REFERENCE__CINDEX, oldCindex, newCindex);
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
  public void setCindex(Expression newCindex)
  {
    if (newCindex != cindex)
    {
      NotificationChain msgs = null;
      if (cindex != null)
        msgs = ((InternalEObject)cindex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.CPROPERTY_REFERENCE__CINDEX, null, msgs);
      if (newCindex != null)
        msgs = ((InternalEObject)newCindex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.CPROPERTY_REFERENCE__CINDEX, null, msgs);
      msgs = basicSetCindex(newCindex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.CPROPERTY_REFERENCE__CINDEX, newCindex, newCindex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Variable)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(Variable newProperty)
  {
    Variable oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getPindex()
  {
    return pindex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPindex(Expression newPindex, NotificationChain msgs)
  {
    Expression oldPindex = pindex;
    pindex = newPindex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.CPROPERTY_REFERENCE__PINDEX, oldPindex, newPindex);
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
  public void setPindex(Expression newPindex)
  {
    if (newPindex != pindex)
    {
      NotificationChain msgs = null;
      if (pindex != null)
        msgs = ((InternalEObject)pindex).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.CPROPERTY_REFERENCE__PINDEX, null, msgs);
      if (newPindex != null)
        msgs = ((InternalEObject)newPindex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.CPROPERTY_REFERENCE__PINDEX, null, msgs);
      msgs = basicSetPindex(newPindex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.CPROPERTY_REFERENCE__PINDEX, newPindex, newPindex));
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
      case AiotMLPackage.CPROPERTY_REFERENCE__CINDEX:
        return basicSetCindex(null, msgs);
      case AiotMLPackage.CPROPERTY_REFERENCE__PINDEX:
        return basicSetPindex(null, msgs);
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
      case AiotMLPackage.CPROPERTY_REFERENCE__CPROPERTYS:
        return getCpropertys();
      case AiotMLPackage.CPROPERTY_REFERENCE__CINDEX:
        return getCindex();
      case AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case AiotMLPackage.CPROPERTY_REFERENCE__PINDEX:
        return getPindex();
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
      case AiotMLPackage.CPROPERTY_REFERENCE__CPROPERTYS:
        getCpropertys().clear();
        getCpropertys().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__CINDEX:
        setCindex((Expression)newValue);
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY:
        setProperty((Variable)newValue);
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__PINDEX:
        setPindex((Expression)newValue);
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
      case AiotMLPackage.CPROPERTY_REFERENCE__CPROPERTYS:
        getCpropertys().clear();
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__CINDEX:
        setCindex((Expression)null);
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY:
        setProperty((Variable)null);
        return;
      case AiotMLPackage.CPROPERTY_REFERENCE__PINDEX:
        setPindex((Expression)null);
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
      case AiotMLPackage.CPROPERTY_REFERENCE__CPROPERTYS:
        return cpropertys != null && !cpropertys.isEmpty();
      case AiotMLPackage.CPROPERTY_REFERENCE__CINDEX:
        return cindex != null;
      case AiotMLPackage.CPROPERTY_REFERENCE__PROPERTY:
        return property != null;
      case AiotMLPackage.CPROPERTY_REFERENCE__PINDEX:
        return pindex != null;
    }
    return super.eIsSet(featureID);
  }

} //CpropertyReferenceImpl
