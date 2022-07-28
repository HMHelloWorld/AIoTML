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
 * A representation of the model object '<em><b>Cproperty Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getCpropertys <em>Cpropertys</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getCindex <em>Cindex</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getProperty <em>Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getPindex <em>Pindex</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment()
 * @model
 * @generated
 */
public interface CpropertyAssignment extends Action
{
  /**
   * Returns the value of the '<em><b>Cpropertys</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cpropertys</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment_Cpropertys()
   * @model
   * @generated
   */
  EList<Variable> getCpropertys();

  /**
   * Returns the value of the '<em><b>Cindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cindex</em>' containment reference.
   * @see #setCindex(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment_Cindex()
   * @model containment="true"
   * @generated
   */
  Expression getCindex();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getCindex <em>Cindex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cindex</em>' containment reference.
   * @see #getCindex()
   * @generated
   */
  void setCindex(Expression value);

  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment_Property()
   * @model
   * @generated
   */
  Variable getProperty();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Variable value);

  /**
   * Returns the value of the '<em><b>Pindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pindex</em>' containment reference.
   * @see #setPindex(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment_Pindex()
   * @model containment="true"
   * @generated
   */
  Expression getPindex();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getPindex <em>Pindex</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pindex</em>' containment reference.
   * @see #getPindex()
   * @generated
   */
  void setPindex(Expression value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getCpropertyAssignment_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // CpropertyAssignment
