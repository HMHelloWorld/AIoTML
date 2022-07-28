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
import org.aiotml.xtext.aiotML.Cproperty;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.MultiAgentProperty;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyAssign;
import org.aiotml.xtext.aiotML.StrategyAssignment;
import org.aiotml.xtext.aiotML.StrategyProperty;
import org.aiotml.xtext.aiotML.Thing;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getCproperties <em>Cproperties</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getStrategys <em>Strategys</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getSassigns <em>Sassigns</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getMas <em>Mas</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.ThingImpl#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThingImpl extends TypeImpl implements Thing
{
  /**
   * The default value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFragment()
   * @generated
   * @ordered
   */
  protected static final boolean FRAGMENT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isFragment() <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isFragment()
   * @generated
   * @ordered
   */
  protected boolean fragment = FRAGMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getIncludes() <em>Includes</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIncludes()
   * @generated
   * @ordered
   */
  protected EList<Thing> includes;

  /**
   * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMessages()
   * @generated
   * @ordered
   */
  protected EList<Message> messages;

  /**
   * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPorts()
   * @generated
   * @ordered
   */
  protected EList<Port> ports;

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
   * The cached value of the '{@link #getCproperties() <em>Cproperties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCproperties()
   * @generated
   * @ordered
   */
  protected EList<Cproperty> cproperties;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected EList<PropertyAssign> assign;

  /**
   * The cached value of the '{@link #getStrategys() <em>Strategys</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrategys()
   * @generated
   * @ordered
   */
  protected EList<StrategyProperty> strategys;

  /**
   * The cached value of the '{@link #getSassigns() <em>Sassigns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSassigns()
   * @generated
   * @ordered
   */
  protected EList<StrategyAssignment> sassigns;

  /**
   * The cached value of the '{@link #getMas() <em>Mas</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMas()
   * @generated
   * @ordered
   */
  protected EList<MultiAgentProperty> mas;

  /**
   * The cached value of the '{@link #getBehaviour() <em>Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBehaviour()
   * @generated
   * @ordered
   */
  protected CompositeState behaviour;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ThingImpl()
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
    return AiotMLPackage.Literals.THING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean isFragment()
  {
    return fragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFragment(boolean newFragment)
  {
    boolean oldFragment = fragment;
    fragment = newFragment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.THING__FRAGMENT, oldFragment, fragment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Thing> getIncludes()
  {
    if (includes == null)
    {
      includes = new EObjectResolvingEList<Thing>(Thing.class, this, AiotMLPackage.THING__INCLUDES);
    }
    return includes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Message> getMessages()
  {
    if (messages == null)
    {
      messages = new EObjectContainmentEList<Message>(Message.class, this, AiotMLPackage.THING__MESSAGES);
    }
    return messages;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Port> getPorts()
  {
    if (ports == null)
    {
      ports = new EObjectContainmentEList<Port>(Port.class, this, AiotMLPackage.THING__PORTS);
    }
    return ports;
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
      properties = new EObjectContainmentEList<Property>(Property.class, this, AiotMLPackage.THING__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Cproperty> getCproperties()
  {
    if (cproperties == null)
    {
      cproperties = new EObjectContainmentEList<Cproperty>(Cproperty.class, this, AiotMLPackage.THING__CPROPERTIES);
    }
    return cproperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, AiotMLPackage.THING__FUNCTIONS);
    }
    return functions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<PropertyAssign> getAssign()
  {
    if (assign == null)
    {
      assign = new EObjectContainmentEList<PropertyAssign>(PropertyAssign.class, this, AiotMLPackage.THING__ASSIGN);
    }
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StrategyProperty> getStrategys()
  {
    if (strategys == null)
    {
      strategys = new EObjectContainmentEList<StrategyProperty>(StrategyProperty.class, this, AiotMLPackage.THING__STRATEGYS);
    }
    return strategys;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<StrategyAssignment> getSassigns()
  {
    if (sassigns == null)
    {
      sassigns = new EObjectContainmentEList<StrategyAssignment>(StrategyAssignment.class, this, AiotMLPackage.THING__SASSIGNS);
    }
    return sassigns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<MultiAgentProperty> getMas()
  {
    if (mas == null)
    {
      mas = new EObjectContainmentEList<MultiAgentProperty>(MultiAgentProperty.class, this, AiotMLPackage.THING__MAS);
    }
    return mas;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CompositeState getBehaviour()
  {
    return behaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBehaviour(CompositeState newBehaviour, NotificationChain msgs)
  {
    CompositeState oldBehaviour = behaviour;
    behaviour = newBehaviour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.THING__BEHAVIOUR, oldBehaviour, newBehaviour);
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
  public void setBehaviour(CompositeState newBehaviour)
  {
    if (newBehaviour != behaviour)
    {
      NotificationChain msgs = null;
      if (behaviour != null)
        msgs = ((InternalEObject)behaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.THING__BEHAVIOUR, null, msgs);
      if (newBehaviour != null)
        msgs = ((InternalEObject)newBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.THING__BEHAVIOUR, null, msgs);
      msgs = basicSetBehaviour(newBehaviour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.THING__BEHAVIOUR, newBehaviour, newBehaviour));
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
      case AiotMLPackage.THING__MESSAGES:
        return ((InternalEList<?>)getMessages()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__PORTS:
        return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__CPROPERTIES:
        return ((InternalEList<?>)getCproperties()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__ASSIGN:
        return ((InternalEList<?>)getAssign()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__STRATEGYS:
        return ((InternalEList<?>)getStrategys()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__SASSIGNS:
        return ((InternalEList<?>)getSassigns()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__MAS:
        return ((InternalEList<?>)getMas()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.THING__BEHAVIOUR:
        return basicSetBehaviour(null, msgs);
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
      case AiotMLPackage.THING__FRAGMENT:
        return isFragment();
      case AiotMLPackage.THING__INCLUDES:
        return getIncludes();
      case AiotMLPackage.THING__MESSAGES:
        return getMessages();
      case AiotMLPackage.THING__PORTS:
        return getPorts();
      case AiotMLPackage.THING__PROPERTIES:
        return getProperties();
      case AiotMLPackage.THING__CPROPERTIES:
        return getCproperties();
      case AiotMLPackage.THING__FUNCTIONS:
        return getFunctions();
      case AiotMLPackage.THING__ASSIGN:
        return getAssign();
      case AiotMLPackage.THING__STRATEGYS:
        return getStrategys();
      case AiotMLPackage.THING__SASSIGNS:
        return getSassigns();
      case AiotMLPackage.THING__MAS:
        return getMas();
      case AiotMLPackage.THING__BEHAVIOUR:
        return getBehaviour();
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
      case AiotMLPackage.THING__FRAGMENT:
        setFragment((Boolean)newValue);
        return;
      case AiotMLPackage.THING__INCLUDES:
        getIncludes().clear();
        getIncludes().addAll((Collection<? extends Thing>)newValue);
        return;
      case AiotMLPackage.THING__MESSAGES:
        getMessages().clear();
        getMessages().addAll((Collection<? extends Message>)newValue);
        return;
      case AiotMLPackage.THING__PORTS:
        getPorts().clear();
        getPorts().addAll((Collection<? extends Port>)newValue);
        return;
      case AiotMLPackage.THING__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends Property>)newValue);
        return;
      case AiotMLPackage.THING__CPROPERTIES:
        getCproperties().clear();
        getCproperties().addAll((Collection<? extends Cproperty>)newValue);
        return;
      case AiotMLPackage.THING__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
        return;
      case AiotMLPackage.THING__ASSIGN:
        getAssign().clear();
        getAssign().addAll((Collection<? extends PropertyAssign>)newValue);
        return;
      case AiotMLPackage.THING__STRATEGYS:
        getStrategys().clear();
        getStrategys().addAll((Collection<? extends StrategyProperty>)newValue);
        return;
      case AiotMLPackage.THING__SASSIGNS:
        getSassigns().clear();
        getSassigns().addAll((Collection<? extends StrategyAssignment>)newValue);
        return;
      case AiotMLPackage.THING__MAS:
        getMas().clear();
        getMas().addAll((Collection<? extends MultiAgentProperty>)newValue);
        return;
      case AiotMLPackage.THING__BEHAVIOUR:
        setBehaviour((CompositeState)newValue);
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
      case AiotMLPackage.THING__FRAGMENT:
        setFragment(FRAGMENT_EDEFAULT);
        return;
      case AiotMLPackage.THING__INCLUDES:
        getIncludes().clear();
        return;
      case AiotMLPackage.THING__MESSAGES:
        getMessages().clear();
        return;
      case AiotMLPackage.THING__PORTS:
        getPorts().clear();
        return;
      case AiotMLPackage.THING__PROPERTIES:
        getProperties().clear();
        return;
      case AiotMLPackage.THING__CPROPERTIES:
        getCproperties().clear();
        return;
      case AiotMLPackage.THING__FUNCTIONS:
        getFunctions().clear();
        return;
      case AiotMLPackage.THING__ASSIGN:
        getAssign().clear();
        return;
      case AiotMLPackage.THING__STRATEGYS:
        getStrategys().clear();
        return;
      case AiotMLPackage.THING__SASSIGNS:
        getSassigns().clear();
        return;
      case AiotMLPackage.THING__MAS:
        getMas().clear();
        return;
      case AiotMLPackage.THING__BEHAVIOUR:
        setBehaviour((CompositeState)null);
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
      case AiotMLPackage.THING__FRAGMENT:
        return fragment != FRAGMENT_EDEFAULT;
      case AiotMLPackage.THING__INCLUDES:
        return includes != null && !includes.isEmpty();
      case AiotMLPackage.THING__MESSAGES:
        return messages != null && !messages.isEmpty();
      case AiotMLPackage.THING__PORTS:
        return ports != null && !ports.isEmpty();
      case AiotMLPackage.THING__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case AiotMLPackage.THING__CPROPERTIES:
        return cproperties != null && !cproperties.isEmpty();
      case AiotMLPackage.THING__FUNCTIONS:
        return functions != null && !functions.isEmpty();
      case AiotMLPackage.THING__ASSIGN:
        return assign != null && !assign.isEmpty();
      case AiotMLPackage.THING__STRATEGYS:
        return strategys != null && !strategys.isEmpty();
      case AiotMLPackage.THING__SASSIGNS:
        return sassigns != null && !sassigns.isEmpty();
      case AiotMLPackage.THING__MAS:
        return mas != null && !mas.isEmpty();
      case AiotMLPackage.THING__BEHAVIOUR:
        return behaviour != null;
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
    result.append(" (fragment: ");
    result.append(fragment);
    result.append(')');
    return result.toString();
  }

} //ThingImpl
