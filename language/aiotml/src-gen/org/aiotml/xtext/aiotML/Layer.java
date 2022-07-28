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
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Layer#getLayernums <em>Layernums</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Layer#getNum <em>Num</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Layer#getAf <em>Af</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends EObject
{
  /**
   * Returns the value of the '<em><b>Layernums</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layernums</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getLayer_Layernums()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getLayernums();

  /**
   * Returns the value of the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Num</em>' attribute.
   * @see #setNum(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getLayer_Num()
   * @model
   * @generated
   */
  String getNum();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Layer#getNum <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Num</em>' attribute.
   * @see #getNum()
   * @generated
   */
  void setNum(String value);

  /**
   * Returns the value of the '<em><b>Af</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Af</em>' attribute.
   * @see #setAf(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getLayer_Af()
   * @model
   * @generated
   */
  String getAf();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Layer#getAf <em>Af</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Af</em>' attribute.
   * @see #getAf()
   * @generated
   */
  void setAf(String value);

} // Layer
