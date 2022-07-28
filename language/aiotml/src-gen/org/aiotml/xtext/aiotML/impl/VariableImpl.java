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
import org.aiotml.xtext.aiotML.Tensor;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.Variable;

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
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableImpl#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableImpl#getTensor <em>Tensor</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends NamedElementImpl implements Variable
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
   * The cached value of the '{@link #getTypeRef() <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeRef()
   * @generated
   * @ordered
   */
  protected TypeRef typeRef;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableImpl()
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
    return AiotMLPackage.Literals.VARIABLE;
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
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, AiotMLPackage.VARIABLE__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeRef getTypeRef()
  {
    return typeRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeRef(TypeRef newTypeRef, NotificationChain msgs)
  {
    TypeRef oldTypeRef = typeRef;
    typeRef = newTypeRef;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE__TYPE_REF, oldTypeRef, newTypeRef);
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
  public void setTypeRef(TypeRef newTypeRef)
  {
    if (newTypeRef != typeRef)
    {
      NotificationChain msgs = null;
      if (typeRef != null)
        msgs = ((InternalEObject)typeRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE__TYPE_REF, null, msgs);
      if (newTypeRef != null)
        msgs = ((InternalEObject)newTypeRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE__TYPE_REF, null, msgs);
      msgs = basicSetTypeRef(newTypeRef, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE__TYPE_REF, newTypeRef, newTypeRef));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE__TENSOR, oldTensor, newTensor);
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
        msgs = ((InternalEObject)tensor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE__TENSOR, null, msgs);
      if (newTensor != null)
        msgs = ((InternalEObject)newTensor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE__TENSOR, null, msgs);
      msgs = basicSetTensor(newTensor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE__TENSOR, newTensor, newTensor));
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
      case AiotMLPackage.VARIABLE__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.VARIABLE__TYPE_REF:
        return basicSetTypeRef(null, msgs);
      case AiotMLPackage.VARIABLE__TENSOR:
        return basicSetTensor(null, msgs);
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
      case AiotMLPackage.VARIABLE__ANNOTATIONS:
        return getAnnotations();
      case AiotMLPackage.VARIABLE__TYPE_REF:
        return getTypeRef();
      case AiotMLPackage.VARIABLE__TENSOR:
        return getTensor();
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
      case AiotMLPackage.VARIABLE__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
        return;
      case AiotMLPackage.VARIABLE__TYPE_REF:
        setTypeRef((TypeRef)newValue);
        return;
      case AiotMLPackage.VARIABLE__TENSOR:
        setTensor((Tensor)newValue);
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
      case AiotMLPackage.VARIABLE__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AiotMLPackage.VARIABLE__TYPE_REF:
        setTypeRef((TypeRef)null);
        return;
      case AiotMLPackage.VARIABLE__TENSOR:
        setTensor((Tensor)null);
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
      case AiotMLPackage.VARIABLE__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AiotMLPackage.VARIABLE__TYPE_REF:
        return typeRef != null;
      case AiotMLPackage.VARIABLE__TENSOR:
        return tensor != null;
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
        case AiotMLPackage.VARIABLE__ANNOTATIONS: return AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
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
        case AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return AiotMLPackage.VARIABLE__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //VariableImpl
