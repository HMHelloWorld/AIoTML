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
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.Tensor;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.TensorImpl#getDims <em>Dims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.TensorImpl#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TensorImpl extends MinimalEObjectImpl.Container implements Tensor
{
  /**
   * The cached value of the '{@link #getDims() <em>Dims</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDims()
   * @generated
   * @ordered
   */
  protected EList<IntegerLiteral> dims;

  /**
   * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected static final String DATATYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected String datatype = DATATYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TensorImpl()
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
    return AiotMLPackage.Literals.TENSOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<IntegerLiteral> getDims()
  {
    if (dims == null)
    {
      dims = new EObjectContainmentEList<IntegerLiteral>(IntegerLiteral.class, this, AiotMLPackage.TENSOR__DIMS);
    }
    return dims;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDatatype(String newDatatype)
  {
    String oldDatatype = datatype;
    datatype = newDatatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.TENSOR__DATATYPE, oldDatatype, datatype));
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
      case AiotMLPackage.TENSOR__DIMS:
        return ((InternalEList<?>)getDims()).basicRemove(otherEnd, msgs);
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
      case AiotMLPackage.TENSOR__DIMS:
        return getDims();
      case AiotMLPackage.TENSOR__DATATYPE:
        return getDatatype();
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
      case AiotMLPackage.TENSOR__DIMS:
        getDims().clear();
        getDims().addAll((Collection<? extends IntegerLiteral>)newValue);
        return;
      case AiotMLPackage.TENSOR__DATATYPE:
        setDatatype((String)newValue);
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
      case AiotMLPackage.TENSOR__DIMS:
        getDims().clear();
        return;
      case AiotMLPackage.TENSOR__DATATYPE:
        setDatatype(DATATYPE_EDEFAULT);
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
      case AiotMLPackage.TENSOR__DIMS:
        return dims != null && !dims.isEmpty();
      case AiotMLPackage.TENSOR__DATATYPE:
        return DATATYPE_EDEFAULT == null ? datatype != null : !DATATYPE_EDEFAULT.equals(datatype);
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
    result.append(" (datatype: ");
    result.append(datatype);
    result.append(')');
    return result.toString();
  }

} //TensorImpl
