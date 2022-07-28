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
 * A representation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.VariableAssignment#getProperty <em>Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.VariableAssignment#getIndex <em>Index</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.VariableAssignment#getExtraProperty <em>Extra Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.VariableAssignment#getExtraIndex <em>Extra Index</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.VariableAssignment#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment()
 * @model
 * @generated
 */
public interface VariableAssignment extends Action
{
  /**
   * Returns the value of the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property</em>' reference.
   * @see #setProperty(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment_Property()
   * @model
   * @generated
   */
  Variable getProperty();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.VariableAssignment#getProperty <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property</em>' reference.
   * @see #getProperty()
   * @generated
   */
  void setProperty(Variable value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' containment reference.
   * @see #setIndex(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment_Index()
   * @model containment="true"
   * @generated
   */
  Expression getIndex();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.VariableAssignment#getIndex <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' containment reference.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Expression value);

  /**
   * Returns the value of the '<em><b>Extra Property</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Property</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment_ExtraProperty()
   * @model
   * @generated
   */
  EList<Variable> getExtraProperty();

  /**
   * Returns the value of the '<em><b>Extra Index</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Expression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extra Index</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment_ExtraIndex()
   * @model containment="true"
   * @generated
   */
  EList<Expression> getExtraIndex();

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariableAssignment_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.VariableAssignment#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

} // VariableAssignment
