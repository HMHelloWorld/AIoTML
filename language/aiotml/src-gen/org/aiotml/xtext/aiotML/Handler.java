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
 * A representation of the model object '<em><b>Handler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Handler#getEvent <em>Event</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Handler#getGuard <em>Guard</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Handler#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getHandler()
 * @model
 * @generated
 */
public interface Handler extends NamedElement, AnnotatedElement
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference.
   * @see #setEvent(Event)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getHandler_Event()
   * @model containment="true"
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Handler#getEvent <em>Event</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' containment reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' containment reference.
   * @see #setGuard(Expression)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getHandler_Guard()
   * @model containment="true"
   * @generated
   */
  Expression getGuard();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Handler#getGuard <em>Guard</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' containment reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Expression value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(Action)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getHandler_Action()
   * @model containment="true"
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.Handler#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

} // Handler
