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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Agent#getName <em>Name</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Agent#getCardinality <em>Cardinality</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Agent#getAmodel <em>Amodel</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAgent_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Agent#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cardinality</em>' containment reference.
   * @see #setCardinality(IntegerLiteral)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAgent_Cardinality()
   * @model containment="true"
   * @generated
   */
  IntegerLiteral getCardinality();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Agent#getCardinality <em>Cardinality</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cardinality</em>' containment reference.
   * @see #getCardinality()
   * @generated
   */
  void setCardinality(IntegerLiteral value);

  /**
   * Returns the value of the '<em><b>Amodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Amodel</em>' containment reference.
   * @see #setAmodel(StrategyProperty)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAgent_Amodel()
   * @model containment="true"
   * @generated
   */
  StrategyProperty getAmodel();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Agent#getAmodel <em>Amodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Amodel</em>' containment reference.
   * @see #getAmodel()
   * @generated
   */
  void setAmodel(StrategyProperty value);

} // Agent
