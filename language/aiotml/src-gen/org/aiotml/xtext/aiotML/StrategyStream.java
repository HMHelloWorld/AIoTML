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
 * A representation of the model object '<em><b>Strategy Stream</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyStream#getInputs <em>Inputs</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyStream#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.StrategyStream#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyStream()
 * @model
 * @generated
 */
public interface StrategyStream extends Action
{
  /**
   * Returns the value of the '<em><b>Inputs</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inputs</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyStream_Inputs()
   * @model
   * @generated
   */
  EList<Variable> getInputs();

  /**
   * Returns the value of the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Strategy</em>' reference.
   * @see #setStrategy(Variable)
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyStream_Strategy()
   * @model
   * @generated
   */
  Variable getStrategy();

  /**
   * Sets the value of the '{@link org.aiotml.xtext.aiotML.StrategyStream#getStrategy <em>Strategy</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Strategy</em>' reference.
   * @see #getStrategy()
   * @generated
   */
  void setStrategy(Variable value);

  /**
   * Returns the value of the '<em><b>Outputs</b></em>' reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Variable}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Outputs</em>' reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getStrategyStream_Outputs()
   * @model
   * @generated
   */
  EList<Variable> getOutputs();

} // StrategyStream
