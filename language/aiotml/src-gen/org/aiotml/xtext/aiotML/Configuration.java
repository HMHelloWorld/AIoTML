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
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.Configuration#getInstances <em>Instances</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Configuration#getConnectors <em>Connectors</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.Configuration#getPropassigns <em>Propassigns</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends NamedElement, AnnotatedElement
{
  /**
   * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Instance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Instances</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getConfiguration_Instances()
   * @model containment="true"
   * @generated
   */
  EList<Instance> getInstances();

  /**
   * Returns the value of the '<em><b>Connectors</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.AbstractConnector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connectors</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getConfiguration_Connectors()
   * @model containment="true"
   * @generated
   */
  EList<AbstractConnector> getConnectors();

  /**
   * Returns the value of the '<em><b>Propassigns</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.ConfigPropertyAssign}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Propassigns</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getConfiguration_Propassigns()
   * @model containment="true"
   * @generated
   */
  EList<ConfigPropertyAssign> getPropassigns();

} // Configuration
