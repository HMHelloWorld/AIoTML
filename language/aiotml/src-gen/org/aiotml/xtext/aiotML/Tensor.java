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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Tensor#getDims <em>Dims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Tensor#getDatatype <em>Datatype</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getTensor()
 * @model
 * @generated
 */
public interface Tensor extends EObject
{
  /**
   * Returns the value of the '<em><b>Dims</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dims</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getTensor_Dims()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getDims();

  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see #setDatatype(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getTensor_Datatype()
   * @model
   * @generated
   */
  String getDatatype();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Tensor#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(String value);

} // Tensor
