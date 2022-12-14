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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.AiotMLModel#getImports <em>Imports</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.AiotMLModel#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.AiotMLModel#getTypes <em>Types</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.AiotMLModel#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.AiotMLModel#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel()
 * @model
 * @generated
 */
public interface AiotMLModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Import}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Template}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Templates</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel_Templates()
   * @model containment="true"
   * @generated
   */
  EList<Template> getTemplates();

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Type}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

  /**
   * Returns the value of the '<em><b>Protocols</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Protocol}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Protocols</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel_Protocols()
   * @model containment="true"
   * @generated
   */
  EList<Protocol> getProtocols();

  /**
   * Returns the value of the '<em><b>Configs</b></em>' containment reference list.
   * The list contents are of type {@link org.aiotml.xtext.aiotML.Configuration}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configs</em>' containment reference list.
   * @see org.aiotml.xtext.aiotML.AiotMLPackage#getAiotMLModel_Configs()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigs();

} // AiotMLModel
