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
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.Transition;

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
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getInternal <em>Internal</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.StateImpl#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends NamedElementImpl implements State
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
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<Property> properties;

  /**
   * The cached value of the '{@link #getEntry() <em>Entry</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEntry()
   * @generated
   * @ordered
   */
  protected Action entry;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected Action exit;

  /**
   * The cached value of the '{@link #getInternal() <em>Internal</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInternal()
   * @generated
   * @ordered
   */
  protected EList<InternalTransition> internal;

  /**
   * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOutgoing()
   * @generated
   * @ordered
   */
  protected EList<Transition> outgoing;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StateImpl()
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
    return AiotMLPackage.Literals.STATE;
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
      annotations = new EObjectContainmentEList<PlatformAnnotation>(PlatformAnnotation.class, this, AiotMLPackage.STATE__ANNOTATIONS);
    }
    return annotations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Property> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<Property>(Property.class, this, AiotMLPackage.STATE__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getEntry()
  {
    return entry;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEntry(Action newEntry, NotificationChain msgs)
  {
    Action oldEntry = entry;
    entry = newEntry;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE__ENTRY, oldEntry, newEntry);
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
  public void setEntry(Action newEntry)
  {
    if (newEntry != entry)
    {
      NotificationChain msgs = null;
      if (entry != null)
        msgs = ((InternalEObject)entry).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STATE__ENTRY, null, msgs);
      if (newEntry != null)
        msgs = ((InternalEObject)newEntry).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STATE__ENTRY, null, msgs);
      msgs = basicSetEntry(newEntry, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE__ENTRY, newEntry, newEntry));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExit(Action newExit, NotificationChain msgs)
  {
    Action oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE__EXIT, oldExit, newExit);
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
  public void setExit(Action newExit)
  {
    if (newExit != exit)
    {
      NotificationChain msgs = null;
      if (exit != null)
        msgs = ((InternalEObject)exit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STATE__EXIT, null, msgs);
      if (newExit != null)
        msgs = ((InternalEObject)newExit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.STATE__EXIT, null, msgs);
      msgs = basicSetExit(newExit, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.STATE__EXIT, newExit, newExit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<InternalTransition> getInternal()
  {
    if (internal == null)
    {
      internal = new EObjectContainmentEList<InternalTransition>(InternalTransition.class, this, AiotMLPackage.STATE__INTERNAL);
    }
    return internal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Transition> getOutgoing()
  {
    if (outgoing == null)
    {
      outgoing = new EObjectContainmentEList<Transition>(Transition.class, this, AiotMLPackage.STATE__OUTGOING);
    }
    return outgoing;
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
      case AiotMLPackage.STATE__ANNOTATIONS:
        return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STATE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STATE__ENTRY:
        return basicSetEntry(null, msgs);
      case AiotMLPackage.STATE__EXIT:
        return basicSetExit(null, msgs);
      case AiotMLPackage.STATE__INTERNAL:
        return ((InternalEList<?>)getInternal()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.STATE__OUTGOING:
        return ((InternalEList<?>)getOutgoing()).basicRemove(otherEnd, msgs);
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
      case AiotMLPackage.STATE__ANNOTATIONS:
        return getAnnotations();
      case AiotMLPackage.STATE__PROPERTIES:
        return getProperties();
      case AiotMLPackage.STATE__ENTRY:
        return getEntry();
      case AiotMLPackage.STATE__EXIT:
        return getExit();
      case AiotMLPackage.STATE__INTERNAL:
        return getInternal();
      case AiotMLPackage.STATE__OUTGOING:
        return getOutgoing();
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
      case AiotMLPackage.STATE__ANNOTATIONS:
        getAnnotations().clear();
        getAnnotations().addAll((Collection<? extends PlatformAnnotation>)newValue);
        return;
      case AiotMLPackage.STATE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case AiotMLPackage.STATE__ENTRY:
        setEntry((Action)newValue);
        return;
      case AiotMLPackage.STATE__EXIT:
        setExit((Action)newValue);
        return;
      case AiotMLPackage.STATE__INTERNAL:
        getInternal().clear();
        getInternal().addAll((Collection<? extends InternalTransition>)newValue);
        return;
      case AiotMLPackage.STATE__OUTGOING:
        getOutgoing().clear();
        getOutgoing().addAll((Collection<? extends Transition>)newValue);
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
      case AiotMLPackage.STATE__ANNOTATIONS:
        getAnnotations().clear();
        return;
      case AiotMLPackage.STATE__PROPERTIES:
        getProperties().clear();
        return;
      case AiotMLPackage.STATE__ENTRY:
        setEntry((Action)null);
        return;
      case AiotMLPackage.STATE__EXIT:
        setExit((Action)null);
        return;
      case AiotMLPackage.STATE__INTERNAL:
        getInternal().clear();
        return;
      case AiotMLPackage.STATE__OUTGOING:
        getOutgoing().clear();
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
      case AiotMLPackage.STATE__ANNOTATIONS:
        return annotations != null && !annotations.isEmpty();
      case AiotMLPackage.STATE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case AiotMLPackage.STATE__ENTRY:
        return entry != null;
      case AiotMLPackage.STATE__EXIT:
        return exit != null;
      case AiotMLPackage.STATE__INTERNAL:
        return internal != null && !internal.isEmpty();
      case AiotMLPackage.STATE__OUTGOING:
        return outgoing != null && !outgoing.isEmpty();
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
        case AiotMLPackage.STATE__ANNOTATIONS: return AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS;
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
        case AiotMLPackage.ANNOTATED_ELEMENT__ANNOTATIONS: return AiotMLPackage.STATE__ANNOTATIONS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //StateImpl
