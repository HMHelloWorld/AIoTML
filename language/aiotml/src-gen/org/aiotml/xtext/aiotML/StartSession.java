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
 * A representation of the model object '<em><b>Start Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.StartSession#getSession <em>Session</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStartSession()
 * @model
 * @generated
 */
public interface StartSession extends Action
{
  /**
   * Returns the value of the '<em><b>Session</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Session</em>' reference.
   * @see #setSession(Session)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStartSession_Session()
   * @model
   * @generated
   */
  Session getSession();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StartSession#getSession <em>Session</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Session</em>' reference.
   * @see #getSession()
   * @generated
   */
  void setSession(Session value);

} // StartSession
