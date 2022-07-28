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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Append</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Append#getPythonlist <em>Pythonlist</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Append#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAppend()
 * @model
 * @generated
 */
public interface Append extends Action
{
  /**
   * Returns the value of the '<em><b>Pythonlist</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pythonlist</em>' reference.
   * @see #setPythonlist(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAppend_Pythonlist()
   * @model
   * @generated
   */
  Variable getPythonlist();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Append#getPythonlist <em>Pythonlist</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pythonlist</em>' reference.
   * @see #getPythonlist()
   * @generated
   */
  void setPythonlist(Variable value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAppend_Element()
   * @model containment="true"
   * @generated
   */
  Expression getElement();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Append#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Expression value);

} // Append
