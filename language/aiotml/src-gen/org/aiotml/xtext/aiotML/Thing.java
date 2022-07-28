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
package org.aiotml.xtext.aiotML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#isFragment <em>Fragment</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getMessages <em>Messages</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getPorts <em>Ports</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getCproperties <em>Cproperties</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getFunctions <em>Functions</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getStrategys <em>Strategys</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getSassigns <em>Sassigns</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getMas <em>Mas</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Thing#getBehaviour <em>Behaviour</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing()
 * @model
 * @generated
 */
public interface Thing extends Type
{
  /**
   * Returns the value of the '<em><b>Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fragment</em>' attribute.
   * @see #setFragment(boolean)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Fragment()
   * @model
   * @generated
   */
  boolean isFragment();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Thing#isFragment <em>Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fragment</em>' attribute.
   * @see #isFragment()
   * @generated
   */
  void setFragment(boolean value);

  /**
   * Returns the value of the '<em><b>Includes</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Thing}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Includes()
   * @model
   * @generated
   */
  EList<Thing> getIncludes();

  /**
   * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Message}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Messages</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Messages()
   * @model containment="true"
   * @generated
   */
  EList<Message> getMessages();

  /**
   * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Port}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ports</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Ports()
   * @model containment="true"
   * @generated
   */
  EList<Port> getPorts();

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Property}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Properties()
   * @model containment="true"
   * @generated
   */
  EList<Property> getProperties();

  /**
   * Returns the value of the '<em><b>Cproperties</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Cproperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cproperties</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Cproperties()
   * @model containment="true"
   * @generated
   */
  EList<Cproperty> getCproperties();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Function}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Assign</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.PropertyAssign}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Assign()
   * @model containment="true"
   * @generated
   */
  EList<PropertyAssign> getAssign();

  /**
   * Returns the value of the '<em><b>Strategys</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.StrategyProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategys</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Strategys()
   * @model containment="true"
   * @generated
   */
  EList<StrategyProperty> getStrategys();

  /**
   * Returns the value of the '<em><b>Sassigns</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.StrategyAssignment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sassigns</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Sassigns()
   * @model containment="true"
   * @generated
   */
  EList<StrategyAssignment> getSassigns();

  /**
   * Returns the value of the '<em><b>Mas</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.MultiAgentProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mas</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Mas()
   * @model containment="true"
   * @generated
   */
  EList<MultiAgentProperty> getMas();

  /**
   * Returns the value of the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Behaviour</em>' containment reference.
   * @see #setBehaviour(CompositeState)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getThing_Behaviour()
   * @model containment="true"
   * @generated
   */
  CompositeState getBehaviour();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Thing#getBehaviour <em>Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Behaviour</em>' containment reference.
   * @see #getBehaviour()
   * @generated
   */
  void setBehaviour(CompositeState value);

} // Thing
