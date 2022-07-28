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
 * A representation of the model object '<em><b>Extern Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.ExternStatement#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ExternStatement#getSegments <em>Segments</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternStatement()
 * @model
 * @generated
 */
public interface ExternStatement extends Action
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' attribute.
   * @see #setStatement(String)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternStatement_Statement()
   * @model
   * @generated
   */
  String getStatement();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ExternStatement#getStatement <em>Statement</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' attribute.
   * @see #getStatement()
   * @generated
   */
  void setStatement(String value);

  /**
   * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Segments</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternStatement_Segments()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getSegments();

} // ExternStatement
