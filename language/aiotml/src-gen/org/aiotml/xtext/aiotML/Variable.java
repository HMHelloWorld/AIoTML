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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Variable#getTypeRef <em>Type Ref</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Variable#getTensor <em>Tensor</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement, AnnotatedElement
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(TypeRef)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariable_TypeRef()
   * @model containment="true"
   * @generated
   */
  TypeRef getTypeRef();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Variable#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(TypeRef value);

  /**
   * Returns the value of the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tensor</em>' containment reference.
   * @see #setTensor(Tensor)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getVariable_Tensor()
   * @model containment="true"
   * @generated
   */
  Tensor getTensor();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Variable#getTensor <em>Tensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tensor</em>' containment reference.
   * @see #getTensor()
   * @generated
   */
  void setTensor(Tensor value);

} // Variable
