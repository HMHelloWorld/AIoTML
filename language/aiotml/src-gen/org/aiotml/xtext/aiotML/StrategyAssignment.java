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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategy Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyAssignment#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyAssignment#getAgent <em>Agent</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyAssignment#getRbindFunction <em>Rbind Function</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyAssignment#getIbindFunction <em>Ibind Function</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyAssignment#getObindFunction <em>Obind Function</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment()
 * @model
 * @generated
 */
public interface StrategyAssignment extends EObject
{
  /**
   * Returns the value of the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' reference.
   * @see #setStrategy(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment_Strategy()
   * @model
   * @generated
   */
  Variable getStrategy();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getStrategy <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(Variable value);

  /**
   * Returns the value of the '<em><b>Agent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Agent</em>' reference.
   * @see #setAgent(Agent)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment_Agent()
   * @model
   * @generated
   */
  Agent getAgent();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getAgent <em>Agent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Agent</em>' reference.
   * @see #getAgent()
   * @generated
   */
  void setAgent(Agent value);

  /**
   * Returns the value of the '<em><b>Rbind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rbind Function</em>' reference.
   * @see #setRbindFunction(Property)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment_RbindFunction()
   * @model
   * @generated
   */
  Property getRbindFunction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getRbindFunction <em>Rbind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rbind Function</em>' reference.
   * @see #getRbindFunction()
   * @generated
   */
  void setRbindFunction(Property value);

  /**
   * Returns the value of the '<em><b>Ibind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ibind Function</em>' reference.
   * @see #setIbindFunction(Property)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment_IbindFunction()
   * @model
   * @generated
   */
  Property getIbindFunction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getIbindFunction <em>Ibind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ibind Function</em>' reference.
   * @see #getIbindFunction()
   * @generated
   */
  void setIbindFunction(Property value);

  /**
   * Returns the value of the '<em><b>Obind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Obind Function</em>' reference.
   * @see #setObindFunction(Property)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyAssignment_ObindFunction()
   * @model
   * @generated
   */
  Property getObindFunction();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getObindFunction <em>Obind Function</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Obind Function</em>' reference.
   * @see #getObindFunction()
   * @generated
   */
  void setObindFunction(Property value);

} // StrategyAssignment
