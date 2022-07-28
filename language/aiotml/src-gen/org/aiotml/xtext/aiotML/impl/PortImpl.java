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
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Port;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PortImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PortImpl#getSends <em>Sends</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.PortImpl#getReceives <em>Receives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortImpl extends NamedElementImpl implements Port
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
   * The cached value of the '{@link #getSends() <em>Sends</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSends()
   * @generated
   * @ordered
   */
  protected EList<Message> sends;

  /**
   * The cached value of the '{@link #getReceives() <em>Receives</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReceives()
   * @generated
   * @ordered
   */
  protected EList<Message> receives;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PortImpl()
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
    return AiotMLPackage.Literals.PORT;
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
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, AiotMLPackage.PORT__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Message> getSends()
  {
    if (sends == null)
    {
      sends = new EObjectResolvingEList<Message>(Message.class, this, AiotMLPackage.PORT__SENDS);
    }
    return sends;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Message> getReceives()
  {
    if (receives == null)
    {
      receives = new EObjectResolvingEList<Message>(Message.class, this, AiotMLPackage.PORT__RECEIVES);
    }
    return receives;
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
      case AiotMLPackage.PORT__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
      case AiotMLPackage.PORT__ANNOTATIONS:
        return getAnnotations();
      case AiotMLPackage.PORT__SENDS:
        return getSends();
      case AiotMLPackage.PORT__RECEIVES:
        return getReceives();
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
      case AiotMLPackage.PORT__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
        return;
      case AiotMLPackage.PORT__SENDS:
        getSends().clear();
        getSends().addAll((Collection<? extends Message>)newValue);
        return;
      case AiotMLPackage.PORT__RECEIVES:
        getReceives().clear();
        getReceives().addAll((Collection<? extends Message>)newValue);
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
      case AiotMLPackage.PORT__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AiotMLPackage.PORT__SENDS:
        getSends().clear();
        return;
      case AiotMLPackage.PORT__RECEIVES:
        getReceives().clear();
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
      case AiotMLPackage.PORT__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AiotMLPackage.PORT__SENDS:
        return sends != null && !sends.isEmpty();
      case AiotMLPackage.PORT__RECEIVES:
        return receives != null && !receives.isEmpty();
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
        case AiotMLPackage.PORT__ANNOTATIONS: return AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
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
        case AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return AiotMLPackage.PORT__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //PortImpl
