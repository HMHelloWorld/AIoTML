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
 * A representation of the model object '<em><b>Event Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.EventReference#getReceiveMsg <em>Receive Msg</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.EventReference#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getEventReference()
 * @model
 * @generated
 */
public interface EventReference extends Expression
{
  /**
   * Returns the value of the '<em><b>Receive Msg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Receive Msg</em>' reference.
   * @see #setReceiveMsg(Event)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getEventReference_ReceiveMsg()
   * @model
   * @generated
   */
  Event getReceiveMsg();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.EventReference#getReceiveMsg <em>Receive Msg</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Receive Msg</em>' reference.
   * @see #getReceiveMsg()
   * @generated
   */
  void setReceiveMsg(Event value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' reference.
   * @see #setParameter(Parameter)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getEventReference_Parameter()
   * @model
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.EventReference#getParameter <em>Parameter</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // EventReference
