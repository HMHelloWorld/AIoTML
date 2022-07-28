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
 * A representation of the model object '<em><b>Dict Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.DictAssignment#getDict <em>Dict</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.DictAssignment#getElements <em>Elements</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.DictAssignment#getVar <em>Var</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getDictAssignment()
 * @model
 * @generated
 */
public interface DictAssignment extends Action
{
  /**
   * Returns the value of the '<em><b>Dict</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dict</em>' reference.
   * @see #setDict(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getDictAssignment_Dict()
   * @model
   * @generated
   */
  Variable getDict();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.DictAssignment#getDict <em>Dict</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dict</em>' reference.
   * @see #getDict()
   * @generated
   */
  void setDict(Variable value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getDictAssignment_Elements()
   * @model
   * @generated
   */
  EList<Variable> getElements();

  /**
   * Returns the value of the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var</em>' reference.
   * @see #setVar(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getDictAssignment_Var()
   * @model
   * @generated
   */
  Variable getVar();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.DictAssignment#getVar <em>Var</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var</em>' reference.
   * @see #getVar()
   * @generated
   */
  void setVar(Variable value);

} // DictAssignment
