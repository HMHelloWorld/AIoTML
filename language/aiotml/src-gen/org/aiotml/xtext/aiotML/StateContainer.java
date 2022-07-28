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
 * A representation of the model object '<em><b>State Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.StateContainer#getInitial <em>Initial</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StateContainer#isHistory <em>History</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StateContainer#getSubstate <em>Substate</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStateContainer()
 * @model
 * @generated
 */
public interface StateContainer extends NamedElement, AnnotatedElement
{
  /**
   * Returns the value of the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial</em>' reference.
   * @see #setInitial(State)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStateContainer_Initial()
   * @model
   * @generated
   */
  State getInitial();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StateContainer#getInitial <em>Initial</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial</em>' reference.
   * @see #getInitial()
   * @generated
   */
  void setInitial(State value);

  /**
   * Returns the value of the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>History</em>' attribute.
   * @see #setHistory(boolean)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStateContainer_History()
   * @model
   * @generated
   */
  boolean isHistory();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StateContainer#isHistory <em>History</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>History</em>' attribute.
   * @see #isHistory()
   * @generated
   */
  void setHistory(boolean value);

  /**
   * Returns the value of the '<em><b>Substate</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Substate</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStateContainer_Substate()
   * @model containment="true"
   * @generated
   */
  EList<State> getSubstate();

} // StateContainer
