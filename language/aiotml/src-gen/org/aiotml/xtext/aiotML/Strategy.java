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
 * A representation of the model object '<em><b>Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getTensor <em>Tensor</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getRewdims <em>Rewdims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getObsdims <em>Obsdims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getActiondims <em>Actiondims</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getPmodel <em>Pmodel</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Strategy#getQmodel <em>Qmodel</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy()
 * @model
 * @generated
 */
public interface Strategy extends Type
{
  /**
   * Returns the value of the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tensor</em>' containment reference.
   * @see #setTensor(Tensor)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Tensor()
   * @model containment="true"
   * @generated
   */
  Tensor getTensor();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Strategy#getTensor <em>Tensor</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tensor</em>' containment reference.
   * @see #getTensor()
   * @generated
   */
  void setTensor(Tensor value);

  /**
   * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Cproperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Devices</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Devices()
   * @model containment="true"
   * @generated
   */
  EList<Cproperty> getDevices();

  /**
   * Returns the value of the '<em><b>Rewdims</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rewdims</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Rewdims()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getRewdims();

  /**
   * Returns the value of the '<em><b>Obsdims</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obsdims</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Obsdims()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getObsdims();

  /**
   * Returns the value of the '<em><b>Actiondims</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.IntegerLiteral}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actiondims</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Actiondims()
   * @model containment="true"
   * @generated
   */
  EList<IntegerLiteral> getActiondims();

  /**
   * Returns the value of the '<em><b>Pmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pmodel</em>' containment reference.
   * @see #setPmodel(ModelReference)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Pmodel()
   * @model containment="true"
   * @generated
   */
  ModelReference getPmodel();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Strategy#getPmodel <em>Pmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pmodel</em>' containment reference.
   * @see #getPmodel()
   * @generated
   */
  void setPmodel(ModelReference value);

  /**
   * Returns the value of the '<em><b>Qmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qmodel</em>' containment reference.
   * @see #setQmodel(ModelReference)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategy_Qmodel()
   * @model containment="true"
   * @generated
   */
  ModelReference getQmodel();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Strategy#getQmodel <em>Qmodel</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qmodel</em>' containment reference.
   * @see #getQmodel()
   * @generated
   */
  void setQmodel(ModelReference value);

} // Strategy
