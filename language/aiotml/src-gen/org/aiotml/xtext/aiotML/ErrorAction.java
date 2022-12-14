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
 * A representation of the model object '<em><b>Error Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.ErrorAction#isLine <em>Line</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ErrorAction#getMsg <em>Msg</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getErrorAction()
 * @model
 * @generated
 */
public interface ErrorAction extends Action
{
  /**
   * Returns the value of the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' attribute.
   * @see #setLine(boolean)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getErrorAction_Line()
   * @model
   * @generated
   */
  boolean isLine();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ErrorAction#isLine <em>Line</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' attribute.
   * @see #isLine()
   * @generated
   */
  void setLine(boolean value);

  /**
   * Returns the value of the '<em><b>Msg</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Msg</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getErrorAction_Msg()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getMsg();

} // ErrorAction
