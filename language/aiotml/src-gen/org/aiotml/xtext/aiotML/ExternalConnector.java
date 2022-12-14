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
 * A representation of the model object '<em><b>External Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.ExternalConnector#getInst <em>Inst</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ExternalConnector#getPort <em>Port</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.ExternalConnector#getProtocol <em>Protocol</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternalConnector()
 * @model
 * @generated
 */
public interface ExternalConnector extends AbstractConnector
{
  /**
   * Returns the value of the '<em><b>Inst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inst</em>' reference.
   * @see #setInst(Instance)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternalConnector_Inst()
   * @model
   * @generated
   */
  Instance getInst();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ExternalConnector#getInst <em>Inst</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inst</em>' reference.
   * @see #getInst()
   * @generated
   */
  void setInst(Instance value);

  /**
   * Returns the value of the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Port</em>' reference.
   * @see #setPort(Port)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternalConnector_Port()
   * @model
   * @generated
   */
  Port getPort();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ExternalConnector#getPort <em>Port</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Port</em>' reference.
   * @see #getPort()
   * @generated
   */
  void setPort(Port value);

  /**
   * Returns the value of the '<em><b>Protocol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocol</em>' reference.
   * @see #setProtocol(Protocol)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getExternalConnector_Protocol()
   * @model
   * @generated
   */
  Protocol getProtocol();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.ExternalConnector#getProtocol <em>Protocol</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Protocol</em>' reference.
   * @see #getProtocol()
   * @generated
   */
  void setProtocol(Protocol value);

} // ExternalConnector
