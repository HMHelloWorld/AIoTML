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
package org.aiotml.xtext.aiotML.impl;

import java.util.Collection;

import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Import;
import org.aiotml.xtext.aiotML.Protocol;
import org.aiotml.xtext.aiotML.Template;
import org.aiotml.xtext.aiotML.Type;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl#getTemplates <em>Templates</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl#getConfigs <em>Configs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AiotMLModelImpl extends MinimalEObjectImpl.Container implements AiotMLModel
{
  /**
   * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImports()
   * @generated
   * @ordered
   */
  protected EList<Import> imports;

  /**
   * The cached value of the '{@link #getTemplates() <em>Templates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTemplates()
   * @generated
   * @ordered
   */
  protected EList<Template> templates;

  /**
   * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypes()
   * @generated
   * @ordered
   */
  protected EList<Type> types;

  /**
   * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProtocols()
   * @generated
   * @ordered
   */
  protected EList<Protocol> protocols;

  /**
   * The cached value of the '{@link #getConfigs() <em>Configs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConfigs()
   * @generated
   * @ordered
   */
  protected EList<Configuration> configs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AiotMLModelImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AiotMLPackage.Literals.AIOT_ML_MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Import> getImports()
  {
    if (imports == null)
    {
      imports = new EObjectContainmentEList<Import>(Import.class, this, AiotMLPackage.AIOT_ML_MODEL__IMPORTS);
    }
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Template> getTemplates()
  {
    if (templates == null)
    {
      templates = new EObjectContainmentEList<Template>(Template.class, this, AiotMLPackage.AIOT_ML_MODEL__TEMPLATES);
    }
    return templates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Type> getTypes()
  {
    if (types == null)
    {
      types = new EObjectContainmentEList<Type>(Type.class, this, AiotMLPackage.AIOT_ML_MODEL__TYPES);
    }
    return types;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Protocol> getProtocols()
  {
    if (protocols == null)
    {
      protocols = new EObjectContainmentEList<Protocol>(Protocol.class, this, AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS);
    }
    return protocols;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Configuration> getConfigs()
  {
    if (configs == null)
    {
      configs = new EObjectContainmentEList<Configuration>(Configuration.class, this, AiotMLPackage.AIOT_ML_MODEL__CONFIGS);
    }
    return configs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AiotMLPackage.AIOT_ML_MODEL__IMPORTS:
        return ((InternalEList<?>)getImports()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.AIOT_ML_MODEL__TEMPLATES:
        return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.AIOT_ML_MODEL__TYPES:
        return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS:
        return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.AIOT_ML_MODEL__CONFIGS:
        return ((InternalEList<?>)getConfigs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AiotMLPackage.AIOT_ML_MODEL__IMPORTS:
        return getImports();
      case AiotMLPackage.AIOT_ML_MODEL__TEMPLATES:
        return getTemplates();
      case AiotMLPackage.AIOT_ML_MODEL__TYPES:
        return getTypes();
      case AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS:
        return getProtocols();
      case AiotMLPackage.AIOT_ML_MODEL__CONFIGS:
        return getConfigs();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AiotMLPackage.AIOT_ML_MODEL__IMPORTS:
        getImports().clear();
        getImports().addAll((Collection<? extends Import>)newValue);
        return;
      case AiotMLPackage.AIOT_ML_MODEL__TEMPLATES:
        getTemplates().clear();
        getTemplates().addAll((Collection<? extends Template>)newValue);
        return;
      case AiotMLPackage.AIOT_ML_MODEL__TYPES:
        getTypes().clear();
        getTypes().addAll((Collection<? extends Type>)newValue);
        return;
      case AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS:
        getProtocols().clear();
        getProtocols().addAll((Collection<? extends Protocol>)newValue);
        return;
      case AiotMLPackage.AIOT_ML_MODEL__CONFIGS:
        getConfigs().clear();
        getConfigs().addAll((Collection<? extends Configuration>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AiotMLPackage.AIOT_ML_MODEL__IMPORTS:
        getImports().clear();
        return;
      case AiotMLPackage.AIOT_ML_MODEL__TEMPLATES:
        getTemplates().clear();
        return;
      case AiotMLPackage.AIOT_ML_MODEL__TYPES:
        getTypes().clear();
        return;
      case AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS:
        getProtocols().clear();
        return;
      case AiotMLPackage.AIOT_ML_MODEL__CONFIGS:
        getConfigs().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AiotMLPackage.AIOT_ML_MODEL__IMPORTS:
        return imports != null && !imports.isEmpty();
      case AiotMLPackage.AIOT_ML_MODEL__TEMPLATES:
        return templates != null && !templates.isEmpty();
      case AiotMLPackage.AIOT_ML_MODEL__TYPES:
        return types != null && !types.isEmpty();
      case AiotMLPackage.AIOT_ML_MODEL__PROTOCOLS:
        return protocols != null && !protocols.isEmpty();
      case AiotMLPackage.AIOT_ML_MODEL__CONFIGS:
        return configs != null && !configs.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AiotMLModelImpl
