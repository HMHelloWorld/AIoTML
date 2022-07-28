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
 * A representation of the model object '<em><b>Pyfor Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.PyforAction#getVariables <em>Variables</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.PyforAction#getArrays <em>Arrays</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.PyforAction#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getPyforAction()
 * @model
 * @generated
 */
public interface PyforAction extends Action
{
  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Parameter}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getPyforAction_Variables()
   * @model containment="true"
   * @generated
   */
  EList<Parameter> getVariables();

  /**
   * Returns the value of the '<em><b>Arrays</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.PropertyReference}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arrays</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getPyforAction_Arrays()
   * @model containment="true"
   * @generated
   */
  EList<PropertyReference> getArrays();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getPyforAction_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.PyforAction#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // PyforAction
