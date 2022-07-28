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
 * A representation of the model object '<em><b>Zip Enumerate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.ZipEnumerate#getVars <em>Vars</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ZipEnumerate#getFname <em>Fname</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ZipEnumerate#getSets <em>Sets</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ZipEnumerate#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getZipEnumerate()
 * @model
 * @generated
 */
public interface ZipEnumerate extends Action
{
  /**
   * Returns the value of the '<em><b>Vars</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Vars</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getZipEnumerate_Vars()
   * @model
   * @generated
   */
  EList<Variable> getVars();

  /**
   * Returns the value of the '<em><b>Fname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fname</em>' attribute.
   * @see #setFname(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getZipEnumerate_Fname()
   * @model
   * @generated
   */
  String getFname();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getFname <em>Fname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fname</em>' attribute.
   * @see #getFname()
   * @generated
   */
  void setFname(String value);

  /**
   * Returns the value of the '<em><b>Sets</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sets</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getZipEnumerate_Sets()
   * @model
   * @generated
   */
  EList<Variable> getSets();

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getZipEnumerate_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // ZipEnumerate
