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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.aiotml.xtext.aiotML.AiotMLFactory
 * @model kind="package"
 * @generated
 */
public interface AiotMLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "aiotML";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.aiotml.org/xtext/AiotML";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "aiotML";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AiotMLPackage eINSTANCE = org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AiotMLModelImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAiotMLModel()
   * @generated
   */
  int AIOT_ML_MODEL = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL__IMPORTS = 0;

  /**
   * The feature id for the '<em><b>Templates</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL__TEMPLATES = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL__TYPES = 2;

  /**
   * The feature id for the '<em><b>Protocols</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL__PROTOCOLS = 3;

  /**
   * The feature id for the '<em><b>Configs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL__CONFIGS = 4;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AIOT_ML_MODEL_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TemplateImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 1;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__PATH = 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ImportImpl <em>Import</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ImportImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getImport()
   * @generated
   */
  int IMPORT = 2;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__IMPORT_URI = 0;

  /**
   * The feature id for the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT__FROM = 1;

  /**
   * The number of structural features of the '<em>Import</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMPORT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PlatformAnnotationImpl <em>Platform Annotation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PlatformAnnotationImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPlatformAnnotation()
   * @generated
   */
  int PLATFORM_ANNOTATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION__VALUE = 1;

  /**
   * The number of structural features of the '<em>Platform Annotation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLATFORM_ANNOTATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.NamedElementImpl <em>Named Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.NamedElementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNamedElement()
   * @generated
   */
  int NAMED_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Named Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AnnotatedElementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAnnotatedElement()
   * @generated
   */
  int ANNOTATED_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ELEMENT__ANNOTATIONS = 0;

  /**
   * The number of structural features of the '<em>Annotated Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANNOTATED_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.VariableImpl <em>Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.VariableImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getVariable()
   * @generated
   */
  int VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE__TENSOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TypeRefImpl <em>Type Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TypeRefImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTypeRef()
   * @generated
   */
  int TYPE_REF = 7;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__TYPE = 0;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__IS_ARRAY = 1;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF__CARDINALITY = 2;

  /**
   * The number of structural features of the '<em>Type Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_REF_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TypeImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getType()
   * @generated
   */
  int TYPE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PrimitiveTypeImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Byte Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE__BYTE_SIZE = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ObjectTypeImpl <em>Object Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ObjectTypeImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getObjectType()
   * @generated
   */
  int OBJECT_TYPE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The number of structural features of the '<em>Object Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OBJECT_TYPE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EnumerationImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__TYPE_REF = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EnumerationLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumerationLiteral()
   * @generated
   */
  int ENUMERATION_LITERAL = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL__INIT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_LITERAL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TensorImpl <em>Tensor</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TensorImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTensor()
   * @generated
   */
  int TENSOR = 13;

  /**
   * The feature id for the '<em><b>Dims</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TENSOR__DIMS = 0;

  /**
   * The feature id for the '<em><b>Datatype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TENSOR__DATATYPE = 1;

  /**
   * The number of structural features of the '<em>Tensor</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TENSOR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LayerImpl <em>Layer</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LayerImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLayer()
   * @generated
   */
  int LAYER = 14;

  /**
   * The feature id for the '<em><b>Layernums</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__LAYERNUMS = 0;

  /**
   * The feature id for the '<em><b>Num</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__NUM = 1;

  /**
   * The feature id for the '<em><b>Af</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER__AF = 2;

  /**
   * The number of structural features of the '<em>Layer</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LAYER_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ModelImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModel()
   * @generated
   */
  int MODEL = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Layers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__LAYERS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ModelReferenceImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModelReference()
   * @generated
   */
  int MODEL_REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Model Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StrategyImpl <em>Strategy</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StrategyImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategy()
   * @generated
   */
  int STRATEGY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__TENSOR = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Devices</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__DEVICES = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Rewdims</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__REWDIMS = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Obsdims</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__OBSDIMS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Actiondims</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__ACTIONDIMS = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Pmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__PMODEL = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Qmodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY__QMODEL = TYPE_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Strategy</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_FEATURE_COUNT = TYPE_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.MultiAgentImpl <em>Multi Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.MultiAgentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMultiAgent()
   * @generated
   */
  int MULTI_AGENT = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Agents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT__AGENTS = TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Multi Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.MultiAgentPropertyImpl <em>Multi Agent Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.MultiAgentPropertyImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMultiAgentProperty()
   * @generated
   */
  int MULTI_AGENT_PROPERTY = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_PROPERTY__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_PROPERTY__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_PROPERTY__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_PROPERTY__TENSOR = VARIABLE__TENSOR;

  /**
   * The number of structural features of the '<em>Multi Agent Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTI_AGENT_PROPERTY_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StrategyPropertyImpl <em>Strategy Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StrategyPropertyImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyProperty()
   * @generated
   */
  int STRATEGY_PROPERTY = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_PROPERTY__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_PROPERTY__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_PROPERTY__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_PROPERTY__TENSOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Strategy Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_PROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl <em>Strategy Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyAssignment()
   * @generated
   */
  int STRATEGY_ASSIGNMENT = 21;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT__STRATEGY = 0;

  /**
   * The feature id for the '<em><b>Agent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT__AGENT = 1;

  /**
   * The feature id for the '<em><b>Rbind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT__RBIND_FUNCTION = 2;

  /**
   * The feature id for the '<em><b>Ibind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT__IBIND_FUNCTION = 3;

  /**
   * The feature id for the '<em><b>Obind Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT__OBIND_FUNCTION = 4;

  /**
   * The number of structural features of the '<em>Strategy Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_ASSIGNMENT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ThingImpl <em>Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ThingImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getThing()
   * @generated
   */
  int THING = 22;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__FRAGMENT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Includes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__INCLUDES = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Messages</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__MESSAGES = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Ports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__PORTS = TYPE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__PROPERTIES = TYPE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Cproperties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__CPROPERTIES = TYPE_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__FUNCTIONS = TYPE_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__ASSIGN = TYPE_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Strategys</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__STRATEGYS = TYPE_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Sassigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__SASSIGNS = TYPE_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Mas</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__MAS = TYPE_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Behaviour</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING__BEHAVIOUR = TYPE_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.SubThingImpl <em>Sub Thing</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.SubThingImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSubThing()
   * @generated
   */
  int SUB_THING = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_THING__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_THING__ANNOTATIONS = TYPE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_THING__PROPERTIES = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_THING__FUNCTIONS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Sub Thing</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUB_THING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AgentImpl <em>Agent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AgentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAgent()
   * @generated
   */
  int AGENT = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__CARDINALITY = 1;

  /**
   * The feature id for the '<em><b>Amodel</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT__AMODEL = 2;

  /**
   * The number of structural features of the '<em>Agent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AGENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyImpl <em>Cproperty</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CpropertyImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCproperty()
   * @generated
   */
  int CPROPERTY = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY__TENSOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cproperty</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PropertyAssignImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPropertyAssign()
   * @generated
   */
  int PROPERTY_ASSIGN = 26;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__ANNOTATIONS = ANNOTATED_ELEMENT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__PROPERTY = ANNOTATED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__INDEX = ANNOTATED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN__INIT = ANNOTATED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Property Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_ASSIGN_FEATURE_COUNT = ANNOTATED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ProtocolImpl <em>Protocol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ProtocolImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProtocol()
   * @generated
   */
  int PROTOCOL = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Protocol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROTOCOL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.FunctionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extra Type Ref</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__EXTRA_TYPE_REF = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__BODY = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__ABSTRACT = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PropertyImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TENSOR = VARIABLE__TENSOR;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__READONLY = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__INIT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.MessageImpl <em>Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.MessageImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMessage()
   * @generated
   */
  int MESSAGE = 30;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE__PARAMETERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ParameterImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TENSOR = VARIABLE__TENSOR;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PortImpl <em>Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PortImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPort()
   * @generated
   */
  int PORT = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__SENDS = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT__RECEIVES = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PORT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.RequiredPortImpl <em>Required Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.RequiredPortImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getRequiredPort()
   * @generated
   */
  int REQUIRED_PORT = 33;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT__OPTIONAL = PORT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Required Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ProvidedPortImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProvidedPort()
   * @generated
   */
  int PROVIDED_PORT = 34;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The number of structural features of the '<em>Provided Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.InternalPortImpl <em>Internal Port</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.InternalPortImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInternalPort()
   * @generated
   */
  int INTERNAL_PORT = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__NAME = PORT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__ANNOTATIONS = PORT__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Sends</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__SENDS = PORT__SENDS;

  /**
   * The feature id for the '<em><b>Receives</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT__RECEIVES = PORT__RECEIVES;

  /**
   * The number of structural features of the '<em>Internal Port</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StateImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getState()
   * @generated
   */
  int STATE = 36;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__PROPERTIES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__ENTRY = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__EXIT = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__INTERNAL = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__OUTGOING = NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.HandlerImpl <em>Handler</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.HandlerImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getHandler()
   * @generated
   */
  int HANDLER = 37;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__EVENT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__GUARD = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER__ACTION = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Handler</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TransitionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 38;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__NAME = HANDLER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__EVENT = HANDLER__EVENT;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = HANDLER__GUARD;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = HANDLER__ACTION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TARGET = HANDLER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.InternalTransitionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInternalTransition()
   * @generated
   */
  int INTERNAL_TRANSITION = 39;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__NAME = HANDLER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__ANNOTATIONS = HANDLER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__EVENT = HANDLER__EVENT;

  /**
   * The feature id for the '<em><b>Guard</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__GUARD = HANDLER__GUARD;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION__ACTION = HANDLER__ACTION;

  /**
   * The number of structural features of the '<em>Internal Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTERNAL_TRANSITION_FEATURE_COUNT = HANDLER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl <em>Composite State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CompositeStateImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCompositeState()
   * @generated
   */
  int COMPOSITE_STATE = 40;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__NAME = STATE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__PROPERTIES = STATE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__ENTRY = STATE__ENTRY;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__EXIT = STATE__EXIT;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__INTERNAL = STATE__INTERNAL;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__OUTGOING = STATE__OUTGOING;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__INITIAL = STATE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__HISTORY = STATE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__SUBSTATE = STATE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Region</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__REGION = STATE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Session</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE__SESSION = STATE_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Composite State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl <em>State Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StateContainerImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStateContainer()
   * @generated
   */
  int STATE_CONTAINER = 44;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__INITIAL = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__HISTORY = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER__SUBSTATE = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>State Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.SessionImpl <em>Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.SessionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSession()
   * @generated
   */
  int SESSION = 41;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__NAME = STATE_CONTAINER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__INITIAL = STATE_CONTAINER__INITIAL;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__HISTORY = STATE_CONTAINER__HISTORY;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

  /**
   * The feature id for the '<em><b>Max Instances</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION__MAX_INSTANCES = STATE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SESSION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.RegionImpl <em>Region</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.RegionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getRegion()
   * @generated
   */
  int REGION = 42;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__NAME = STATE_CONTAINER__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__ANNOTATIONS = STATE_CONTAINER__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Initial</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__INITIAL = STATE_CONTAINER__INITIAL;

  /**
   * The feature id for the '<em><b>History</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__HISTORY = STATE_CONTAINER__HISTORY;

  /**
   * The feature id for the '<em><b>Substate</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION__SUBSTATE = STATE_CONTAINER__SUBSTATE;

  /**
   * The number of structural features of the '<em>Region</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REGION_FEATURE_COUNT = STATE_CONTAINER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.FinalStateImpl <em>Final State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.FinalStateImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFinalState()
   * @generated
   */
  int FINAL_STATE = 43;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__NAME = STATE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__ANNOTATIONS = STATE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__PROPERTIES = STATE__PROPERTIES;

  /**
   * The feature id for the '<em><b>Entry</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__ENTRY = STATE__ENTRY;

  /**
   * The feature id for the '<em><b>Exit</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__EXIT = STATE__EXIT;

  /**
   * The feature id for the '<em><b>Internal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__INTERNAL = STATE__INTERNAL;

  /**
   * The feature id for the '<em><b>Outgoing</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE__OUTGOING = STATE__OUTGOING;

  /**
   * The number of structural features of the '<em>Final State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FINAL_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EventImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 45;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = NAMED_ELEMENT__NAME;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ReceiveMessageImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getReceiveMessage()
   * @generated
   */
  int RECEIVE_MESSAGE = 46;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__NAME = EVENT__NAME;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__PORT = EVENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE__MESSAGE = EVENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Receive Message</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECEIVE_MESSAGE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAction()
   * @generated
   */
  int ACTION = 47;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ActionBlockImpl <em>Action Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ActionBlockImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getActionBlock()
   * @generated
   */
  int ACTION_BLOCK = 48;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK__ACTIONS = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Action Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_BLOCK_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ExternStatementImpl <em>Extern Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ExternStatementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternStatement()
   * @generated
   */
  int EXTERN_STATEMENT = 49;

  /**
   * The feature id for the '<em><b>Statement</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT__STATEMENT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT__SEGMENTS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extern Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LocalVariableImpl <em>Local Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LocalVariableImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLocalVariable()
   * @generated
   */
  int LOCAL_VARIABLE = 50;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__NAME = VARIABLE__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__ANNOTATIONS = VARIABLE__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__TYPE_REF = VARIABLE__TYPE_REF;

  /**
   * The feature id for the '<em><b>Tensor</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__TENSOR = VARIABLE__TENSOR;

  /**
   * The feature id for the '<em><b>Readonly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__READONLY = VARIABLE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE__INIT = VARIABLE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Local Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOCAL_VARIABLE_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.SendActionImpl <em>Send Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.SendActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSendAction()
   * @generated
   */
  int SEND_ACTION = 51;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__PORT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Message</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__MESSAGE = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION__PARAMETERS = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Send Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SEND_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getVariableAssignment()
   * @generated
   */
  int VARIABLE_ASSIGNMENT = 52;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__PROPERTY = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__INDEX = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Extra Property</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXTRA_PROPERTY = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Extra Index</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXTRA_INDEX = ACTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT__EXPRESSION = ACTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Variable Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_ASSIGNMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyAssignmentImpl <em>Cproperty Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CpropertyAssignmentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCpropertyAssignment()
   * @generated
   */
  int CPROPERTY_ASSIGNMENT = 53;

  /**
   * The feature id for the '<em><b>Cpropertys</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT__CPROPERTYS = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT__CINDEX = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT__PROPERTY = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT__PINDEX = ACTION_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT__EXPRESSION = ACTION_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Cproperty Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_ASSIGNMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StrategyStreamImpl <em>Strategy Stream</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StrategyStreamImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyStream()
   * @generated
   */
  int STRATEGY_STREAM = 54;

  /**
   * The feature id for the '<em><b>Inputs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_STREAM__INPUTS = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Strategy</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_STREAM__STRATEGY = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Outputs</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_STREAM__OUTPUTS = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Strategy Stream</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRATEGY_STREAM_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.DictAssignmentImpl <em>Dict Assignment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.DictAssignmentImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDictAssignment()
   * @generated
   */
  int DICT_ASSIGNMENT = 55;

  /**
   * The feature id for the '<em><b>Dict</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ASSIGNMENT__DICT = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ASSIGNMENT__ELEMENTS = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ASSIGNMENT__VAR = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Dict Assignment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DICT_ASSIGNMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl <em>Zip Enumerate</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getZipEnumerate()
   * @generated
   */
  int ZIP_ENUMERATE = 56;

  /**
   * The feature id for the '<em><b>Vars</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_ENUMERATE__VARS = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_ENUMERATE__FNAME = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Sets</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_ENUMERATE__SETS = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_ENUMERATE__ACTION = ACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Zip Enumerate</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ZIP_ENUMERATE_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AppendImpl <em>Append</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AppendImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAppend()
   * @generated
   */
  int APPEND = 57;

  /**
   * The feature id for the '<em><b>Pythonlist</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEND__PYTHONLIST = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEND__ELEMENT = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Append</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int APPEND_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.IncrementImpl <em>Increment</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.IncrementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getIncrement()
   * @generated
   */
  int INCREMENT = 58;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT__VAR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Increment</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INCREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.DecrementImpl <em>Decrement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.DecrementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDecrement()
   * @generated
   */
  int DECREMENT = 59;

  /**
   * The feature id for the '<em><b>Var</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT__VAR = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decrement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECREMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ForActionImpl <em>For Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ForActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getForAction()
   * @generated
   */
  int FOR_ACTION = 60;

  /**
   * The feature id for the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__VARIABLE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__INDEX = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__ARRAY = ACTION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION__ACTION = ACTION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>For Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PyforActionImpl <em>Pyfor Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PyforActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPyforAction()
   * @generated
   */
  int PYFOR_ACTION = 61;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PYFOR_ACTION__VARIABLES = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Arrays</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PYFOR_ACTION__ARRAYS = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PYFOR_ACTION__ACTION = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Pyfor Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PYFOR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LoopActionImpl <em>Loop Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LoopActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLoopAction()
   * @generated
   */
  int LOOP_ACTION = 62;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Loop Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOOP_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ConditionalActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConditionalAction()
   * @generated
   */
  int CONDITIONAL_ACTION = 63;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__CONDITION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__ACTION = ACTION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION__ELSE_ACTION = ACTION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Conditional Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ReturnActionImpl <em>Return Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ReturnActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getReturnAction()
   * @generated
   */
  int RETURN_ACTION = 64;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_ACTION__EXP = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Extra Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_ACTION__EXTRA_EXP = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Return Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PrintActionImpl <em>Print Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PrintActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPrintAction()
   * @generated
   */
  int PRINT_ACTION = 65;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Print Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRINT_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ErrorActionImpl <em>Error Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ErrorActionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getErrorAction()
   * @generated
   */
  int ERROR_ACTION = 66;

  /**
   * The feature id for the '<em><b>Line</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION__LINE = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Msg</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION__MSG = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Error Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ERROR_ACTION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StartSessionImpl <em>Start Session</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StartSessionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStartSession()
   * @generated
   */
  int START_SESSION = 67;

  /**
   * The feature id for the '<em><b>Session</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_SESSION__SESSION = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Start Session</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int START_SESSION_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.FunctionCallStatementImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunctionCallStatement()
   * @generated
   */
  int FUNCTION_CALL_STATEMENT = 68;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT__FUNCTION = ACTION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT__PARAMETERS = ACTION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_STATEMENT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 69;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ExternExpressionImpl <em>Extern Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ExternExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternExpression()
   * @generated
   */
  int EXTERN_EXPRESSION = 70;

  /**
   * The feature id for the '<em><b>Expression</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION__EXPRESSION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Segments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION__SEGMENTS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Extern Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERN_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 71;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ArrayInitImpl <em>Array Init</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ArrayInitImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getArrayInit()
   * @generated
   */
  int ARRAY_INIT = 72;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT__VALUES = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Array Init</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INIT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EnumLiteralRefImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumLiteralRef()
   * @generated
   */
  int ENUM_LITERAL_REF = 73;

  /**
   * The feature id for the '<em><b>Enum</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF__ENUM = LITERAL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literal</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF__LITERAL = LITERAL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enum Literal Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUM_LITERAL_REF_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ByteLiteralImpl <em>Byte Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ByteLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getByteLiteral()
   * @generated
   */
  int BYTE_LITERAL = 74;

  /**
   * The feature id for the '<em><b>Byte Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE_LITERAL__BYTE_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Byte Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BYTE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CharLiteralImpl <em>Char Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CharLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCharLiteral()
   * @generated
   */
  int CHAR_LITERAL = 75;

  /**
   * The feature id for the '<em><b>Char Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL__CHAR_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Char Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHAR_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.IntegerLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getIntegerLiteral()
   * @generated
   */
  int INTEGER_LITERAL = 76;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL__INT_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.BooleanLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getBooleanLiteral()
   * @generated
   */
  int BOOLEAN_LITERAL = 77;

  /**
   * The feature id for the '<em><b>Bool Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL__BOOL_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.StringLiteralImpl <em>String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.StringLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStringLiteral()
   * @generated
   */
  int STRING_LITERAL = 78;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL__STRING_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.DoubleLiteralImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDoubleLiteral()
   * @generated
   */
  int DOUBLE_LITERAL = 79;

  /**
   * The feature id for the '<em><b>Double Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL__DOUBLE_VALUE = LITERAL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Double Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOUBLE_LITERAL_FEATURE_COUNT = LITERAL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PropertyReferenceImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPropertyReference()
   * @generated
   */
  int PROPERTY_REFERENCE = 80;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE__PROPERTY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl <em>Cproperty Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCpropertyReference()
   * @generated
   */
  int CPROPERTY_REFERENCE = 81;

  /**
   * The feature id for the '<em><b>Cpropertys</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_REFERENCE__CPROPERTYS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_REFERENCE__CINDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_REFERENCE__PROPERTY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Pindex</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_REFERENCE__PINDEX = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Cproperty Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CPROPERTY_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EventReferenceImpl <em>Event Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EventReferenceImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEventReference()
   * @generated
   */
  int EVENT_REFERENCE = 82;

  /**
   * The feature id for the '<em><b>Receive Msg</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE__RECEIVE_MSG = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE__PARAMETER = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Event Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_REFERENCE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.FunctionCallExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunctionCallExpression()
   * @generated
   */
  int FUNCTION_CALL_EXPRESSION = 83;

  /**
   * The feature id for the '<em><b>Function</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__FUNCTION = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION__PARAMETERS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Function Call Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_CALL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ConfigurationImpl <em>Configuration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ConfigurationImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConfiguration()
   * @generated
   */
  int CONFIGURATION = 84;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Instances</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Connectors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__CONNECTORS = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Propassigns</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION__PROPASSIGNS = NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Configuration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIGURATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.InstanceImpl <em>Instance</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.InstanceImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInstance()
   * @generated
   */
  int INSTANCE = 85;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ConfigPropertyAssignImpl <em>Config Property Assign</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ConfigPropertyAssignImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConfigPropertyAssign()
   * @generated
   */
  int CONFIG_PROPERTY_ASSIGN = 86;

  /**
   * The feature id for the '<em><b>Instance</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INSTANCE = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__PROPERTY = 1;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INDEX = 2;

  /**
   * The feature id for the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__INIT = 3;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN__ANNOTATIONS = 4;

  /**
   * The number of structural features of the '<em>Config Property Assign</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONFIG_PROPERTY_ASSIGN_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AbstractConnectorImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAbstractConnector()
   * @generated
   */
  int ABSTRACT_CONNECTOR = 87;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR__NAME = NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR__ANNOTATIONS = NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Abstract Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_CONNECTOR_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ConnectorImpl <em>Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ConnectorImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConnector()
   * @generated
   */
  int CONNECTOR = 88;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Cli</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__CLI = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Required</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__REQUIRED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Srv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__SRV = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Provided</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR__PROVIDED = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ExternalConnectorImpl <em>External Connector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ExternalConnectorImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternalConnector()
   * @generated
   */
  int EXTERNAL_CONNECTOR = 89;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__NAME = ABSTRACT_CONNECTOR__NAME;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__ANNOTATIONS = ABSTRACT_CONNECTOR__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>Inst</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__INST = ABSTRACT_CONNECTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Port</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__PORT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Protocol</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR__PROTOCOL = ABSTRACT_CONNECTOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>External Connector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_CONNECTOR_FEATURE_COUNT = ABSTRACT_CONNECTOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.OrExpressionImpl <em>Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.OrExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getOrExpression()
   * @generated
   */
  int OR_EXPRESSION = 90;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.AndExpressionImpl <em>And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.AndExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAndExpression()
   * @generated
   */
  int AND_EXPRESSION = 91;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.EqualsExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEqualsExpression()
   * @generated
   */
  int EQUALS_EXPRESSION = 92;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Equals Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.NotEqualsExpressionImpl <em>Not Equals Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.NotEqualsExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNotEqualsExpression()
   * @generated
   */
  int NOT_EQUALS_EXPRESSION = 93;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Not Equals Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EQUALS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.GreaterExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getGreaterExpression()
   * @generated
   */
  int GREATER_EXPRESSION = 94;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LowerExpressionImpl <em>Lower Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LowerExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLowerExpression()
   * @generated
   */
  int LOWER_EXPRESSION = 95;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.GreaterOrEqualExpressionImpl <em>Greater Or Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.GreaterOrEqualExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getGreaterOrEqualExpression()
   * @generated
   */
  int GREATER_OR_EQUAL_EXPRESSION = 96;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Greater Or Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GREATER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.LowerOrEqualExpressionImpl <em>Lower Or Equal Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.LowerOrEqualExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLowerOrEqualExpression()
   * @generated
   */
  int LOWER_OR_EQUAL_EXPRESSION = 97;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Lower Or Equal Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOWER_OR_EQUAL_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.PlusExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPlusExpression()
   * @generated
   */
  int PLUS_EXPRESSION = 98;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.MinusExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMinusExpression()
   * @generated
   */
  int MINUS_EXPRESSION = 99;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.TimesExpressionImpl <em>Times Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.TimesExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTimesExpression()
   * @generated
   */
  int TIMES_EXPRESSION = 100;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Times Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TIMES_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.DivExpressionImpl <em>Div Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.DivExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDivExpression()
   * @generated
   */
  int DIV_EXPRESSION = 101;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Div Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ModExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModExpression()
   * @generated
   */
  int MOD_EXPRESSION = 102;

  /**
   * The feature id for the '<em><b>Lhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__LHS = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION__RHS = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Mod Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MOD_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.CastExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCastExpression()
   * @generated
   */
  int CAST_EXPRESSION = 103;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__TYPE = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Array</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION__IS_ARRAY = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Cast Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAST_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ExpressionGroupImpl <em>Expression Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ExpressionGroupImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExpressionGroup()
   * @generated
   */
  int EXPRESSION_GROUP = 104;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Expression Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_GROUP_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.NotExpressionImpl <em>Not Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.NotExpressionImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNotExpression()
   * @generated
   */
  int NOT_EXPRESSION = 105;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Not Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_EXPRESSION_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.UnaryMinusImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getUnaryMinus()
   * @generated
   */
  int UNARY_MINUS = 106;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MINUS__TERM = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Unary Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNARY_MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.aiotml.xtext.aiotML.impl.ArrayIndexImpl <em>Array Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.aiotml.xtext.aiotML.impl.ArrayIndexImpl
   * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getArrayIndex()
   * @generated
   */
  int ARRAY_INDEX = 107;

  /**
   * The feature id for the '<em><b>Array</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX__ARRAY = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Index</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX__INDEX = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Array Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARRAY_INDEX_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;


  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.AiotMLModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel
   * @generated
   */
  EClass getAiotMLModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AiotMLModel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Imports</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel#getImports()
   * @see #getAiotMLModel()
   * @generated
   */
  EReference getAiotMLModel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AiotMLModel#getTemplates <em>Templates</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Templates</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel#getTemplates()
   * @see #getAiotMLModel()
   * @generated
   */
  EReference getAiotMLModel_Templates();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AiotMLModel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel#getTypes()
   * @see #getAiotMLModel()
   * @generated
   */
  EReference getAiotMLModel_Types();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AiotMLModel#getProtocols <em>Protocols</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Protocols</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel#getProtocols()
   * @see #getAiotMLModel()
   * @generated
   */
  EReference getAiotMLModel_Protocols();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AiotMLModel#getConfigs <em>Configs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Configs</em>'.
   * @see org.aiotml.xtext.aiotML.AiotMLModel#getConfigs()
   * @see #getAiotMLModel()
   * @generated
   */
  EReference getAiotMLModel_Configs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.aiotml.xtext.aiotML.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Template#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.aiotml.xtext.aiotML.Template#getPath()
   * @see #getTemplate()
   * @generated
   */
  EAttribute getTemplate_Path();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Import <em>Import</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import</em>'.
   * @see org.aiotml.xtext.aiotML.Import
   * @generated
   */
  EClass getImport();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Import#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see org.aiotml.xtext.aiotML.Import#getImportURI()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Import#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>From</em>'.
   * @see org.aiotml.xtext.aiotML.Import#getFrom()
   * @see #getImport()
   * @generated
   */
  EAttribute getImport_From();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PlatformAnnotation <em>Platform Annotation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Platform Annotation</em>'.
   * @see org.aiotml.xtext.aiotML.PlatformAnnotation
   * @generated
   */
  EClass getPlatformAnnotation();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.PlatformAnnotation#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.aiotml.xtext.aiotML.PlatformAnnotation#getName()
   * @see #getPlatformAnnotation()
   * @generated
   */
  EAttribute getPlatformAnnotation_Name();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.PlatformAnnotation#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.aiotml.xtext.aiotML.PlatformAnnotation#getValue()
   * @see #getPlatformAnnotation()
   * @generated
   */
  EAttribute getPlatformAnnotation_Value();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Named Element</em>'.
   * @see org.aiotml.xtext.aiotML.NamedElement
   * @generated
   */
  EClass getNamedElement();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.NamedElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.aiotml.xtext.aiotML.NamedElement#getName()
   * @see #getNamedElement()
   * @generated
   */
  EAttribute getNamedElement_Name();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.AnnotatedElement <em>Annotated Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Annotated Element</em>'.
   * @see org.aiotml.xtext.aiotML.AnnotatedElement
   * @generated
   */
  EClass getAnnotatedElement();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.AnnotatedElement#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.aiotml.xtext.aiotML.AnnotatedElement#getAnnotations()
   * @see #getAnnotatedElement()
   * @generated
   */
  EReference getAnnotatedElement_Annotations();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Variable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable</em>'.
   * @see org.aiotml.xtext.aiotML.Variable
   * @generated
   */
  EClass getVariable();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Variable#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.Variable#getTypeRef()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_TypeRef();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Variable#getTensor <em>Tensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tensor</em>'.
   * @see org.aiotml.xtext.aiotML.Variable#getTensor()
   * @see #getVariable()
   * @generated
   */
  EReference getVariable_Tensor();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.TypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.TypeRef
   * @generated
   */
  EClass getTypeRef();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.TypeRef#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.aiotml.xtext.aiotML.TypeRef#getType()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Type();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.TypeRef#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.aiotml.xtext.aiotML.TypeRef#isIsArray()
   * @see #getTypeRef()
   * @generated
   */
  EAttribute getTypeRef_IsArray();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.TypeRef#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.aiotml.xtext.aiotML.TypeRef#getCardinality()
   * @see #getTypeRef()
   * @generated
   */
  EReference getTypeRef_Cardinality();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.aiotml.xtext.aiotML.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type</em>'.
   * @see org.aiotml.xtext.aiotML.PrimitiveType
   * @generated
   */
  EClass getPrimitiveType();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.PrimitiveType#getByteSize <em>Byte Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte Size</em>'.
   * @see org.aiotml.xtext.aiotML.PrimitiveType#getByteSize()
   * @see #getPrimitiveType()
   * @generated
   */
  EAttribute getPrimitiveType_ByteSize();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ObjectType <em>Object Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Object Type</em>'.
   * @see org.aiotml.xtext.aiotML.ObjectType
   * @generated
   */
  EClass getObjectType();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see org.aiotml.xtext.aiotML.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Enumeration#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.Enumeration#getTypeRef()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_TypeRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literals</em>'.
   * @see org.aiotml.xtext.aiotML.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EReference getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.EnumerationLiteral <em>Enumeration Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration Literal</em>'.
   * @see org.aiotml.xtext.aiotML.EnumerationLiteral
   * @generated
   */
  EClass getEnumerationLiteral();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.EnumerationLiteral#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.aiotml.xtext.aiotML.EnumerationLiteral#getInit()
   * @see #getEnumerationLiteral()
   * @generated
   */
  EReference getEnumerationLiteral_Init();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Tensor <em>Tensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tensor</em>'.
   * @see org.aiotml.xtext.aiotML.Tensor
   * @generated
   */
  EClass getTensor();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Tensor#getDims <em>Dims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dims</em>'.
   * @see org.aiotml.xtext.aiotML.Tensor#getDims()
   * @see #getTensor()
   * @generated
   */
  EReference getTensor_Dims();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Tensor#getDatatype <em>Datatype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Datatype</em>'.
   * @see org.aiotml.xtext.aiotML.Tensor#getDatatype()
   * @see #getTensor()
   * @generated
   */
  EAttribute getTensor_Datatype();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Layer <em>Layer</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Layer</em>'.
   * @see org.aiotml.xtext.aiotML.Layer
   * @generated
   */
  EClass getLayer();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Layer#getLayernums <em>Layernums</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layernums</em>'.
   * @see org.aiotml.xtext.aiotML.Layer#getLayernums()
   * @see #getLayer()
   * @generated
   */
  EReference getLayer_Layernums();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Layer#getNum <em>Num</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Num</em>'.
   * @see org.aiotml.xtext.aiotML.Layer#getNum()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Num();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Layer#getAf <em>Af</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Af</em>'.
   * @see org.aiotml.xtext.aiotML.Layer#getAf()
   * @see #getLayer()
   * @generated
   */
  EAttribute getLayer_Af();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.aiotml.xtext.aiotML.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Model#getLayers <em>Layers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Layers</em>'.
   * @see org.aiotml.xtext.aiotML.Model#getLayers()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Layers();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Reference</em>'.
   * @see org.aiotml.xtext.aiotML.ModelReference
   * @generated
   */
  EClass getModelReference();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ModelReference#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.ModelReference#getTypeRef()
   * @see #getModelReference()
   * @generated
   */
  EReference getModelReference_TypeRef();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Strategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy
   * @generated
   */
  EClass getStrategy();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Strategy#getTensor <em>Tensor</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tensor</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getTensor()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Tensor();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Strategy#getDevices <em>Devices</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Devices</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getDevices()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Devices();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Strategy#getRewdims <em>Rewdims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rewdims</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getRewdims()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Rewdims();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Strategy#getObsdims <em>Obsdims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Obsdims</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getObsdims()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Obsdims();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Strategy#getActiondims <em>Actiondims</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actiondims</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getActiondims()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Actiondims();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Strategy#getPmodel <em>Pmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pmodel</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getPmodel()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Pmodel();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Strategy#getQmodel <em>Qmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Qmodel</em>'.
   * @see org.aiotml.xtext.aiotML.Strategy#getQmodel()
   * @see #getStrategy()
   * @generated
   */
  EReference getStrategy_Qmodel();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.MultiAgent <em>Multi Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Agent</em>'.
   * @see org.aiotml.xtext.aiotML.MultiAgent
   * @generated
   */
  EClass getMultiAgent();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.MultiAgent#getAgents <em>Agents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Agents</em>'.
   * @see org.aiotml.xtext.aiotML.MultiAgent#getAgents()
   * @see #getMultiAgent()
   * @generated
   */
  EReference getMultiAgent_Agents();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.MultiAgentProperty <em>Multi Agent Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multi Agent Property</em>'.
   * @see org.aiotml.xtext.aiotML.MultiAgentProperty
   * @generated
   */
  EClass getMultiAgentProperty();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StrategyProperty <em>Strategy Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy Property</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyProperty
   * @generated
   */
  EClass getStrategyProperty();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StrategyAssignment <em>Strategy Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy Assignment</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment
   * @generated
   */
  EClass getStrategyAssignment();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Strategy</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment#getStrategy()
   * @see #getStrategyAssignment()
   * @generated
   */
  EReference getStrategyAssignment_Strategy();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getAgent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Agent</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment#getAgent()
   * @see #getStrategyAssignment()
   * @generated
   */
  EReference getStrategyAssignment_Agent();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getRbindFunction <em>Rbind Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rbind Function</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment#getRbindFunction()
   * @see #getStrategyAssignment()
   * @generated
   */
  EReference getStrategyAssignment_RbindFunction();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getIbindFunction <em>Ibind Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ibind Function</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment#getIbindFunction()
   * @see #getStrategyAssignment()
   * @generated
   */
  EReference getStrategyAssignment_IbindFunction();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyAssignment#getObindFunction <em>Obind Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Obind Function</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyAssignment#getObindFunction()
   * @see #getStrategyAssignment()
   * @generated
   */
  EReference getStrategyAssignment_ObindFunction();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Thing <em>Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Thing</em>'.
   * @see org.aiotml.xtext.aiotML.Thing
   * @generated
   */
  EClass getThing();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Thing#isFragment <em>Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fragment</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#isFragment()
   * @see #getThing()
   * @generated
   */
  EAttribute getThing_Fragment();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.Thing#getIncludes <em>Includes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Includes</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getIncludes()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Includes();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getMessages <em>Messages</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Messages</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getMessages()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Messages();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getPorts <em>Ports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ports</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getPorts()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Ports();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getProperties()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getCproperties <em>Cproperties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Cproperties</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getCproperties()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Cproperties();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getFunctions()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Functions();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assign</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getAssign()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Assign();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getStrategys <em>Strategys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Strategys</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getStrategys()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Strategys();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getSassigns <em>Sassigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sassigns</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getSassigns()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Sassigns();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Thing#getMas <em>Mas</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mas</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getMas()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Mas();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Thing#getBehaviour <em>Behaviour</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Behaviour</em>'.
   * @see org.aiotml.xtext.aiotML.Thing#getBehaviour()
   * @see #getThing()
   * @generated
   */
  EReference getThing_Behaviour();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.SubThing <em>Sub Thing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Thing</em>'.
   * @see org.aiotml.xtext.aiotML.SubThing
   * @generated
   */
  EClass getSubThing();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.SubThing#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.aiotml.xtext.aiotML.SubThing#getProperties()
   * @see #getSubThing()
   * @generated
   */
  EReference getSubThing_Properties();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.SubThing#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see org.aiotml.xtext.aiotML.SubThing#getFunctions()
   * @see #getSubThing()
   * @generated
   */
  EReference getSubThing_Functions();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Agent <em>Agent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Agent</em>'.
   * @see org.aiotml.xtext.aiotML.Agent
   * @generated
   */
  EClass getAgent();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Agent#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.aiotml.xtext.aiotML.Agent#getName()
   * @see #getAgent()
   * @generated
   */
  EAttribute getAgent_Name();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Agent#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see org.aiotml.xtext.aiotML.Agent#getCardinality()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Agent#getAmodel <em>Amodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Amodel</em>'.
   * @see org.aiotml.xtext.aiotML.Agent#getAmodel()
   * @see #getAgent()
   * @generated
   */
  EReference getAgent_Amodel();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Cproperty <em>Cproperty</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cproperty</em>'.
   * @see org.aiotml.xtext.aiotML.Cproperty
   * @generated
   */
  EClass getCproperty();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PropertyAssign <em>Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Assign</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyAssign
   * @generated
   */
  EClass getPropertyAssign();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.PropertyAssign#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyAssign#getProperty()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.PropertyAssign#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyAssign#getIndex()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.PropertyAssign#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyAssign#getInit()
   * @see #getPropertyAssign()
   * @generated
   */
  EReference getPropertyAssign_Init();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Protocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Protocol</em>'.
   * @see org.aiotml.xtext.aiotML.Protocol
   * @generated
   */
  EClass getProtocol();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see org.aiotml.xtext.aiotML.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Function#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.aiotml.xtext.aiotML.Function#getParameters()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Function#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.Function#getTypeRef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_TypeRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Function#getExtraTypeRef <em>Extra Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Type Ref</em>'.
   * @see org.aiotml.xtext.aiotML.Function#getExtraTypeRef()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_ExtraTypeRef();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Function#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see org.aiotml.xtext.aiotML.Function#getBody()
   * @see #getFunction()
   * @generated
   */
  EReference getFunction_Body();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Function#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see org.aiotml.xtext.aiotML.Function#isAbstract()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Abstract();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.Property#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see org.aiotml.xtext.aiotML.Property#isReadonly()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Property#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.aiotml.xtext.aiotML.Property#getInit()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Init();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Message <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Message</em>'.
   * @see org.aiotml.xtext.aiotML.Message
   * @generated
   */
  EClass getMessage();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Message#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.aiotml.xtext.aiotML.Message#getParameters()
   * @see #getMessage()
   * @generated
   */
  EReference getMessage_Parameters();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see org.aiotml.xtext.aiotML.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Port <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Port</em>'.
   * @see org.aiotml.xtext.aiotML.Port
   * @generated
   */
  EClass getPort();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.Port#getSends <em>Sends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sends</em>'.
   * @see org.aiotml.xtext.aiotML.Port#getSends()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Sends();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.Port#getReceives <em>Receives</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Receives</em>'.
   * @see org.aiotml.xtext.aiotML.Port#getReceives()
   * @see #getPort()
   * @generated
   */
  EReference getPort_Receives();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.RequiredPort <em>Required Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Required Port</em>'.
   * @see org.aiotml.xtext.aiotML.RequiredPort
   * @generated
   */
  EClass getRequiredPort();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.RequiredPort#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see org.aiotml.xtext.aiotML.RequiredPort#isOptional()
   * @see #getRequiredPort()
   * @generated
   */
  EAttribute getRequiredPort_Optional();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ProvidedPort <em>Provided Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Provided Port</em>'.
   * @see org.aiotml.xtext.aiotML.ProvidedPort
   * @generated
   */
  EClass getProvidedPort();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.InternalPort <em>Internal Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Port</em>'.
   * @see org.aiotml.xtext.aiotML.InternalPort
   * @generated
   */
  EClass getInternalPort();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see org.aiotml.xtext.aiotML.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.State#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.aiotml.xtext.aiotML.State#getProperties()
   * @see #getState()
   * @generated
   */
  EReference getState_Properties();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.State#getEntry <em>Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Entry</em>'.
   * @see org.aiotml.xtext.aiotML.State#getEntry()
   * @see #getState()
   * @generated
   */
  EReference getState_Entry();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.State#getExit <em>Exit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exit</em>'.
   * @see org.aiotml.xtext.aiotML.State#getExit()
   * @see #getState()
   * @generated
   */
  EReference getState_Exit();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.State#getInternal <em>Internal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Internal</em>'.
   * @see org.aiotml.xtext.aiotML.State#getInternal()
   * @see #getState()
   * @generated
   */
  EReference getState_Internal();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.State#getOutgoing <em>Outgoing</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Outgoing</em>'.
   * @see org.aiotml.xtext.aiotML.State#getOutgoing()
   * @see #getState()
   * @generated
   */
  EReference getState_Outgoing();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Handler <em>Handler</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler</em>'.
   * @see org.aiotml.xtext.aiotML.Handler
   * @generated
   */
  EClass getHandler();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Handler#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.aiotml.xtext.aiotML.Handler#getEvent()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Handler#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guard</em>'.
   * @see org.aiotml.xtext.aiotML.Handler#getGuard()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Guard();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Handler#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.Handler#getAction()
   * @see #getHandler()
   * @generated
   */
  EReference getHandler_Action();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see org.aiotml.xtext.aiotML.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Transition#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see org.aiotml.xtext.aiotML.Transition#getTarget()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Target();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.InternalTransition <em>Internal Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Internal Transition</em>'.
   * @see org.aiotml.xtext.aiotML.InternalTransition
   * @generated
   */
  EClass getInternalTransition();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.CompositeState <em>Composite State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite State</em>'.
   * @see org.aiotml.xtext.aiotML.CompositeState
   * @generated
   */
  EClass getCompositeState();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.CompositeState#getRegion <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Region</em>'.
   * @see org.aiotml.xtext.aiotML.CompositeState#getRegion()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_Region();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.CompositeState#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Session</em>'.
   * @see org.aiotml.xtext.aiotML.CompositeState#getSession()
   * @see #getCompositeState()
   * @generated
   */
  EReference getCompositeState_Session();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Session <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Session</em>'.
   * @see org.aiotml.xtext.aiotML.Session
   * @generated
   */
  EClass getSession();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Session#getMaxInstances <em>Max Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Max Instances</em>'.
   * @see org.aiotml.xtext.aiotML.Session#getMaxInstances()
   * @see #getSession()
   * @generated
   */
  EReference getSession_MaxInstances();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Region <em>Region</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Region</em>'.
   * @see org.aiotml.xtext.aiotML.Region
   * @generated
   */
  EClass getRegion();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.FinalState <em>Final State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Final State</em>'.
   * @see org.aiotml.xtext.aiotML.FinalState
   * @generated
   */
  EClass getFinalState();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StateContainer <em>State Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Container</em>'.
   * @see org.aiotml.xtext.aiotML.StateContainer
   * @generated
   */
  EClass getStateContainer();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StateContainer#getInitial <em>Initial</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Initial</em>'.
   * @see org.aiotml.xtext.aiotML.StateContainer#getInitial()
   * @see #getStateContainer()
   * @generated
   */
  EReference getStateContainer_Initial();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.StateContainer#isHistory <em>History</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>History</em>'.
   * @see org.aiotml.xtext.aiotML.StateContainer#isHistory()
   * @see #getStateContainer()
   * @generated
   */
  EAttribute getStateContainer_History();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.StateContainer#getSubstate <em>Substate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Substate</em>'.
   * @see org.aiotml.xtext.aiotML.StateContainer#getSubstate()
   * @see #getStateContainer()
   * @generated
   */
  EReference getStateContainer_Substate();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.aiotml.xtext.aiotML.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ReceiveMessage <em>Receive Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Receive Message</em>'.
   * @see org.aiotml.xtext.aiotML.ReceiveMessage
   * @generated
   */
  EClass getReceiveMessage();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ReceiveMessage#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.aiotml.xtext.aiotML.ReceiveMessage#getPort()
   * @see #getReceiveMessage()
   * @generated
   */
  EReference getReceiveMessage_Port();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ReceiveMessage#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.aiotml.xtext.aiotML.ReceiveMessage#getMessage()
   * @see #getReceiveMessage()
   * @generated
   */
  EReference getReceiveMessage_Message();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ActionBlock <em>Action Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action Block</em>'.
   * @see org.aiotml.xtext.aiotML.ActionBlock
   * @generated
   */
  EClass getActionBlock();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ActionBlock#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see org.aiotml.xtext.aiotML.ActionBlock#getActions()
   * @see #getActionBlock()
   * @generated
   */
  EReference getActionBlock_Actions();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ExternStatement <em>Extern Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Statement</em>'.
   * @see org.aiotml.xtext.aiotML.ExternStatement
   * @generated
   */
  EClass getExternStatement();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.ExternStatement#getStatement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Statement</em>'.
   * @see org.aiotml.xtext.aiotML.ExternStatement#getStatement()
   * @see #getExternStatement()
   * @generated
   */
  EAttribute getExternStatement_Statement();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ExternStatement#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.aiotml.xtext.aiotML.ExternStatement#getSegments()
   * @see #getExternStatement()
   * @generated
   */
  EReference getExternStatement_Segments();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.LocalVariable <em>Local Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Local Variable</em>'.
   * @see org.aiotml.xtext.aiotML.LocalVariable
   * @generated
   */
  EClass getLocalVariable();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.LocalVariable#isReadonly <em>Readonly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readonly</em>'.
   * @see org.aiotml.xtext.aiotML.LocalVariable#isReadonly()
   * @see #getLocalVariable()
   * @generated
   */
  EAttribute getLocalVariable_Readonly();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LocalVariable#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.aiotml.xtext.aiotML.LocalVariable#getInit()
   * @see #getLocalVariable()
   * @generated
   */
  EReference getLocalVariable_Init();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.SendAction <em>Send Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Send Action</em>'.
   * @see org.aiotml.xtext.aiotML.SendAction
   * @generated
   */
  EClass getSendAction();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.SendAction#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.aiotml.xtext.aiotML.SendAction#getPort()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Port();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.SendAction#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Message</em>'.
   * @see org.aiotml.xtext.aiotML.SendAction#getMessage()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Message();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.SendAction#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.aiotml.xtext.aiotML.SendAction#getParameters()
   * @see #getSendAction()
   * @generated
   */
  EReference getSendAction_Parameters();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.VariableAssignment <em>Variable Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Assignment</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment
   * @generated
   */
  EClass getVariableAssignment();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.VariableAssignment#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment#getProperty()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.VariableAssignment#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment#getIndex()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Index();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.VariableAssignment#getExtraProperty <em>Extra Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Extra Property</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment#getExtraProperty()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_ExtraProperty();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.VariableAssignment#getExtraIndex <em>Extra Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Index</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment#getExtraIndex()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_ExtraIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.VariableAssignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aiotml.xtext.aiotML.VariableAssignment#getExpression()
   * @see #getVariableAssignment()
   * @generated
   */
  EReference getVariableAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.CpropertyAssignment <em>Cproperty Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cproperty Assignment</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment
   * @generated
   */
  EClass getCpropertyAssignment();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getCpropertys <em>Cpropertys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Cpropertys</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment#getCpropertys()
   * @see #getCpropertyAssignment()
   * @generated
   */
  EReference getCpropertyAssignment_Cpropertys();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getCindex <em>Cindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cindex</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment#getCindex()
   * @see #getCpropertyAssignment()
   * @generated
   */
  EReference getCpropertyAssignment_Cindex();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment#getProperty()
   * @see #getCpropertyAssignment()
   * @generated
   */
  EReference getCpropertyAssignment_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getPindex <em>Pindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pindex</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment#getPindex()
   * @see #getCpropertyAssignment()
   * @generated
   */
  EReference getCpropertyAssignment_Pindex();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CpropertyAssignment#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyAssignment#getExpression()
   * @see #getCpropertyAssignment()
   * @generated
   */
  EReference getCpropertyAssignment_Expression();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StrategyStream <em>Strategy Stream</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Strategy Stream</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyStream
   * @generated
   */
  EClass getStrategyStream();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.StrategyStream#getInputs <em>Inputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Inputs</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyStream#getInputs()
   * @see #getStrategyStream()
   * @generated
   */
  EReference getStrategyStream_Inputs();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StrategyStream#getStrategy <em>Strategy</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Strategy</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyStream#getStrategy()
   * @see #getStrategyStream()
   * @generated
   */
  EReference getStrategyStream_Strategy();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.StrategyStream#getOutputs <em>Outputs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Outputs</em>'.
   * @see org.aiotml.xtext.aiotML.StrategyStream#getOutputs()
   * @see #getStrategyStream()
   * @generated
   */
  EReference getStrategyStream_Outputs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.DictAssignment <em>Dict Assignment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dict Assignment</em>'.
   * @see org.aiotml.xtext.aiotML.DictAssignment
   * @generated
   */
  EClass getDictAssignment();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.DictAssignment#getDict <em>Dict</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dict</em>'.
   * @see org.aiotml.xtext.aiotML.DictAssignment#getDict()
   * @see #getDictAssignment()
   * @generated
   */
  EReference getDictAssignment_Dict();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.DictAssignment#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see org.aiotml.xtext.aiotML.DictAssignment#getElements()
   * @see #getDictAssignment()
   * @generated
   */
  EReference getDictAssignment_Elements();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.DictAssignment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.aiotml.xtext.aiotML.DictAssignment#getVar()
   * @see #getDictAssignment()
   * @generated
   */
  EReference getDictAssignment_Var();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ZipEnumerate <em>Zip Enumerate</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Zip Enumerate</em>'.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate
   * @generated
   */
  EClass getZipEnumerate();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getVars <em>Vars</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Vars</em>'.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate#getVars()
   * @see #getZipEnumerate()
   * @generated
   */
  EReference getZipEnumerate_Vars();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getFname <em>Fname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fname</em>'.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate#getFname()
   * @see #getZipEnumerate()
   * @generated
   */
  EAttribute getZipEnumerate_Fname();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getSets <em>Sets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Sets</em>'.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate#getSets()
   * @see #getZipEnumerate()
   * @generated
   */
  EReference getZipEnumerate_Sets();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ZipEnumerate#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.ZipEnumerate#getAction()
   * @see #getZipEnumerate()
   * @generated
   */
  EReference getZipEnumerate_Action();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Append <em>Append</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Append</em>'.
   * @see org.aiotml.xtext.aiotML.Append
   * @generated
   */
  EClass getAppend();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Append#getPythonlist <em>Pythonlist</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pythonlist</em>'.
   * @see org.aiotml.xtext.aiotML.Append#getPythonlist()
   * @see #getAppend()
   * @generated
   */
  EReference getAppend_Pythonlist();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.Append#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element</em>'.
   * @see org.aiotml.xtext.aiotML.Append#getElement()
   * @see #getAppend()
   * @generated
   */
  EReference getAppend_Element();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Increment <em>Increment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Increment</em>'.
   * @see org.aiotml.xtext.aiotML.Increment
   * @generated
   */
  EClass getIncrement();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Increment#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.aiotml.xtext.aiotML.Increment#getVar()
   * @see #getIncrement()
   * @generated
   */
  EReference getIncrement_Var();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Decrement <em>Decrement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decrement</em>'.
   * @see org.aiotml.xtext.aiotML.Decrement
   * @generated
   */
  EClass getDecrement();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Decrement#getVar <em>Var</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Var</em>'.
   * @see org.aiotml.xtext.aiotML.Decrement#getVar()
   * @see #getDecrement()
   * @generated
   */
  EReference getDecrement_Var();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ForAction <em>For Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>For Action</em>'.
   * @see org.aiotml.xtext.aiotML.ForAction
   * @generated
   */
  EClass getForAction();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ForAction#getVariable <em>Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable</em>'.
   * @see org.aiotml.xtext.aiotML.ForAction#getVariable()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Variable();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ForAction#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.aiotml.xtext.aiotML.ForAction#getIndex()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ForAction#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.aiotml.xtext.aiotML.ForAction#getArray()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ForAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.ForAction#getAction()
   * @see #getForAction()
   * @generated
   */
  EReference getForAction_Action();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PyforAction <em>Pyfor Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pyfor Action</em>'.
   * @see org.aiotml.xtext.aiotML.PyforAction
   * @generated
   */
  EClass getPyforAction();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.PyforAction#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see org.aiotml.xtext.aiotML.PyforAction#getVariables()
   * @see #getPyforAction()
   * @generated
   */
  EReference getPyforAction_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.PyforAction#getArrays <em>Arrays</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arrays</em>'.
   * @see org.aiotml.xtext.aiotML.PyforAction#getArrays()
   * @see #getPyforAction()
   * @generated
   */
  EReference getPyforAction_Arrays();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.PyforAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.PyforAction#getAction()
   * @see #getPyforAction()
   * @generated
   */
  EReference getPyforAction_Action();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.LoopAction <em>Loop Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Loop Action</em>'.
   * @see org.aiotml.xtext.aiotML.LoopAction
   * @generated
   */
  EClass getLoopAction();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LoopAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.aiotml.xtext.aiotML.LoopAction#getCondition()
   * @see #getLoopAction()
   * @generated
   */
  EReference getLoopAction_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LoopAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.LoopAction#getAction()
   * @see #getLoopAction()
   * @generated
   */
  EReference getLoopAction_Action();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ConditionalAction <em>Conditional Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Action</em>'.
   * @see org.aiotml.xtext.aiotML.ConditionalAction
   * @generated
   */
  EClass getConditionalAction();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ConditionalAction#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.aiotml.xtext.aiotML.ConditionalAction#getCondition()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_Condition();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ConditionalAction#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Action</em>'.
   * @see org.aiotml.xtext.aiotML.ConditionalAction#getAction()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_Action();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ConditionalAction#getElseAction <em>Else Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Action</em>'.
   * @see org.aiotml.xtext.aiotML.ConditionalAction#getElseAction()
   * @see #getConditionalAction()
   * @generated
   */
  EReference getConditionalAction_ElseAction();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ReturnAction <em>Return Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Action</em>'.
   * @see org.aiotml.xtext.aiotML.ReturnAction
   * @generated
   */
  EClass getReturnAction();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ReturnAction#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.aiotml.xtext.aiotML.ReturnAction#getExp()
   * @see #getReturnAction()
   * @generated
   */
  EReference getReturnAction_Exp();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ReturnAction#getExtraExp <em>Extra Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Extra Exp</em>'.
   * @see org.aiotml.xtext.aiotML.ReturnAction#getExtraExp()
   * @see #getReturnAction()
   * @generated
   */
  EReference getReturnAction_ExtraExp();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PrintAction <em>Print Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Print Action</em>'.
   * @see org.aiotml.xtext.aiotML.PrintAction
   * @generated
   */
  EClass getPrintAction();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.PrintAction#isLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.aiotml.xtext.aiotML.PrintAction#isLine()
   * @see #getPrintAction()
   * @generated
   */
  EAttribute getPrintAction_Line();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.PrintAction#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msg</em>'.
   * @see org.aiotml.xtext.aiotML.PrintAction#getMsg()
   * @see #getPrintAction()
   * @generated
   */
  EReference getPrintAction_Msg();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ErrorAction <em>Error Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Error Action</em>'.
   * @see org.aiotml.xtext.aiotML.ErrorAction
   * @generated
   */
  EClass getErrorAction();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.ErrorAction#isLine <em>Line</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Line</em>'.
   * @see org.aiotml.xtext.aiotML.ErrorAction#isLine()
   * @see #getErrorAction()
   * @generated
   */
  EAttribute getErrorAction_Line();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ErrorAction#getMsg <em>Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Msg</em>'.
   * @see org.aiotml.xtext.aiotML.ErrorAction#getMsg()
   * @see #getErrorAction()
   * @generated
   */
  EReference getErrorAction_Msg();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StartSession <em>Start Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Start Session</em>'.
   * @see org.aiotml.xtext.aiotML.StartSession
   * @generated
   */
  EClass getStartSession();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.StartSession#getSession <em>Session</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Session</em>'.
   * @see org.aiotml.xtext.aiotML.StartSession#getSession()
   * @see #getStartSession()
   * @generated
   */
  EReference getStartSession_Session();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.FunctionCallStatement <em>Function Call Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Statement</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallStatement
   * @generated
   */
  EClass getFunctionCallStatement();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.FunctionCallStatement#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallStatement#getFunction()
   * @see #getFunctionCallStatement()
   * @generated
   */
  EReference getFunctionCallStatement_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.FunctionCallStatement#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallStatement#getParameters()
   * @see #getFunctionCallStatement()
   * @generated
   */
  EReference getFunctionCallStatement_Parameters();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.aiotml.xtext.aiotML.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ExternExpression <em>Extern Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Extern Expression</em>'.
   * @see org.aiotml.xtext.aiotML.ExternExpression
   * @generated
   */
  EClass getExternExpression();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.ExternExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Expression</em>'.
   * @see org.aiotml.xtext.aiotML.ExternExpression#getExpression()
   * @see #getExternExpression()
   * @generated
   */
  EAttribute getExternExpression_Expression();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ExternExpression#getSegments <em>Segments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Segments</em>'.
   * @see org.aiotml.xtext.aiotML.ExternExpression#getSegments()
   * @see #getExternExpression()
   * @generated
   */
  EReference getExternExpression_Segments();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see org.aiotml.xtext.aiotML.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ArrayInit <em>Array Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Init</em>'.
   * @see org.aiotml.xtext.aiotML.ArrayInit
   * @generated
   */
  EClass getArrayInit();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ArrayInit#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see org.aiotml.xtext.aiotML.ArrayInit#getValues()
   * @see #getArrayInit()
   * @generated
   */
  EReference getArrayInit_Values();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.EnumLiteralRef <em>Enum Literal Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enum Literal Ref</em>'.
   * @see org.aiotml.xtext.aiotML.EnumLiteralRef
   * @generated
   */
  EClass getEnumLiteralRef();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.EnumLiteralRef#getEnum <em>Enum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Enum</em>'.
   * @see org.aiotml.xtext.aiotML.EnumLiteralRef#getEnum()
   * @see #getEnumLiteralRef()
   * @generated
   */
  EReference getEnumLiteralRef_Enum();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.EnumLiteralRef#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Literal</em>'.
   * @see org.aiotml.xtext.aiotML.EnumLiteralRef#getLiteral()
   * @see #getEnumLiteralRef()
   * @generated
   */
  EReference getEnumLiteralRef_Literal();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ByteLiteral <em>Byte Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Byte Literal</em>'.
   * @see org.aiotml.xtext.aiotML.ByteLiteral
   * @generated
   */
  EClass getByteLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.ByteLiteral#getByteValue <em>Byte Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Byte Value</em>'.
   * @see org.aiotml.xtext.aiotML.ByteLiteral#getByteValue()
   * @see #getByteLiteral()
   * @generated
   */
  EAttribute getByteLiteral_ByteValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.CharLiteral <em>Char Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Char Literal</em>'.
   * @see org.aiotml.xtext.aiotML.CharLiteral
   * @generated
   */
  EClass getCharLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.CharLiteral#getCharValue <em>Char Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Char Value</em>'.
   * @see org.aiotml.xtext.aiotML.CharLiteral#getCharValue()
   * @see #getCharLiteral()
   * @generated
   */
  EAttribute getCharLiteral_CharValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.IntegerLiteral <em>Integer Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Literal</em>'.
   * @see org.aiotml.xtext.aiotML.IntegerLiteral
   * @generated
   */
  EClass getIntegerLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.IntegerLiteral#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see org.aiotml.xtext.aiotML.IntegerLiteral#getIntValue()
   * @see #getIntegerLiteral()
   * @generated
   */
  EAttribute getIntegerLiteral_IntValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.BooleanLiteral <em>Boolean Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Literal</em>'.
   * @see org.aiotml.xtext.aiotML.BooleanLiteral
   * @generated
   */
  EClass getBooleanLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.BooleanLiteral#isBoolValue <em>Bool Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bool Value</em>'.
   * @see org.aiotml.xtext.aiotML.BooleanLiteral#isBoolValue()
   * @see #getBooleanLiteral()
   * @generated
   */
  EAttribute getBooleanLiteral_BoolValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.StringLiteral <em>String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Literal</em>'.
   * @see org.aiotml.xtext.aiotML.StringLiteral
   * @generated
   */
  EClass getStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.StringLiteral#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see org.aiotml.xtext.aiotML.StringLiteral#getStringValue()
   * @see #getStringLiteral()
   * @generated
   */
  EAttribute getStringLiteral_StringValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.DoubleLiteral <em>Double Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Double Literal</em>'.
   * @see org.aiotml.xtext.aiotML.DoubleLiteral
   * @generated
   */
  EClass getDoubleLiteral();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.DoubleLiteral#getDoubleValue <em>Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double Value</em>'.
   * @see org.aiotml.xtext.aiotML.DoubleLiteral#getDoubleValue()
   * @see #getDoubleLiteral()
   * @generated
   */
  EAttribute getDoubleLiteral_DoubleValue();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PropertyReference <em>Property Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Reference</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyReference
   * @generated
   */
  EClass getPropertyReference();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.PropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.PropertyReference#getProperty()
   * @see #getPropertyReference()
   * @generated
   */
  EReference getPropertyReference_Property();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.CpropertyReference <em>Cproperty Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cproperty Reference</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyReference
   * @generated
   */
  EClass getCpropertyReference();

  /**
   * Returns the meta object for the reference list '{@link org.aiotml.xtext.aiotML.CpropertyReference#getCpropertys <em>Cpropertys</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Cpropertys</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyReference#getCpropertys()
   * @see #getCpropertyReference()
   * @generated
   */
  EReference getCpropertyReference_Cpropertys();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CpropertyReference#getCindex <em>Cindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cindex</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyReference#getCindex()
   * @see #getCpropertyReference()
   * @generated
   */
  EReference getCpropertyReference_Cindex();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.CpropertyReference#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyReference#getProperty()
   * @see #getCpropertyReference()
   * @generated
   */
  EReference getCpropertyReference_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CpropertyReference#getPindex <em>Pindex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pindex</em>'.
   * @see org.aiotml.xtext.aiotML.CpropertyReference#getPindex()
   * @see #getCpropertyReference()
   * @generated
   */
  EReference getCpropertyReference_Pindex();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.EventReference <em>Event Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Reference</em>'.
   * @see org.aiotml.xtext.aiotML.EventReference
   * @generated
   */
  EClass getEventReference();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.EventReference#getReceiveMsg <em>Receive Msg</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Receive Msg</em>'.
   * @see org.aiotml.xtext.aiotML.EventReference#getReceiveMsg()
   * @see #getEventReference()
   * @generated
   */
  EReference getEventReference_ReceiveMsg();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.EventReference#getParameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parameter</em>'.
   * @see org.aiotml.xtext.aiotML.EventReference#getParameter()
   * @see #getEventReference()
   * @generated
   */
  EReference getEventReference_Parameter();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.FunctionCallExpression <em>Function Call Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function Call Expression</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallExpression
   * @generated
   */
  EClass getFunctionCallExpression();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.FunctionCallExpression#getFunction <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Function</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallExpression#getFunction()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EReference getFunctionCallExpression_Function();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.FunctionCallExpression#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.aiotml.xtext.aiotML.FunctionCallExpression#getParameters()
   * @see #getFunctionCallExpression()
   * @generated
   */
  EReference getFunctionCallExpression_Parameters();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Configuration <em>Configuration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Configuration</em>'.
   * @see org.aiotml.xtext.aiotML.Configuration
   * @generated
   */
  EClass getConfiguration();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Configuration#getInstances <em>Instances</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Instances</em>'.
   * @see org.aiotml.xtext.aiotML.Configuration#getInstances()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Instances();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Configuration#getConnectors <em>Connectors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Connectors</em>'.
   * @see org.aiotml.xtext.aiotML.Configuration#getConnectors()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Connectors();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.Configuration#getPropassigns <em>Propassigns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Propassigns</em>'.
   * @see org.aiotml.xtext.aiotML.Configuration#getPropassigns()
   * @see #getConfiguration()
   * @generated
   */
  EReference getConfiguration_Propassigns();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Instance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance</em>'.
   * @see org.aiotml.xtext.aiotML.Instance
   * @generated
   */
  EClass getInstance();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Instance#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.aiotml.xtext.aiotML.Instance#getType()
   * @see #getInstance()
   * @generated
   */
  EReference getInstance_Type();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign <em>Config Property Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Config Property Assign</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign
   * @generated
   */
  EClass getConfigPropertyAssign();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign#getInstance <em>Instance</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Instance</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign#getInstance()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Instance();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign#getProperty()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Property();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign#getIndex()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Index();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign#getInit <em>Init</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Init</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign#getInit()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Init();

  /**
   * Returns the meta object for the containment reference list '{@link org.aiotml.xtext.aiotML.ConfigPropertyAssign#getAnnotations <em>Annotations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Annotations</em>'.
   * @see org.aiotml.xtext.aiotML.ConfigPropertyAssign#getAnnotations()
   * @see #getConfigPropertyAssign()
   * @generated
   */
  EReference getConfigPropertyAssign_Annotations();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.AbstractConnector <em>Abstract Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Connector</em>'.
   * @see org.aiotml.xtext.aiotML.AbstractConnector
   * @generated
   */
  EClass getAbstractConnector();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.Connector <em>Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Connector</em>'.
   * @see org.aiotml.xtext.aiotML.Connector
   * @generated
   */
  EClass getConnector();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Connector#getCli <em>Cli</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Cli</em>'.
   * @see org.aiotml.xtext.aiotML.Connector#getCli()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Cli();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Connector#getRequired <em>Required</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Required</em>'.
   * @see org.aiotml.xtext.aiotML.Connector#getRequired()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Required();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Connector#getSrv <em>Srv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Srv</em>'.
   * @see org.aiotml.xtext.aiotML.Connector#getSrv()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Srv();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.Connector#getProvided <em>Provided</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Provided</em>'.
   * @see org.aiotml.xtext.aiotML.Connector#getProvided()
   * @see #getConnector()
   * @generated
   */
  EReference getConnector_Provided();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ExternalConnector <em>External Connector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Connector</em>'.
   * @see org.aiotml.xtext.aiotML.ExternalConnector
   * @generated
   */
  EClass getExternalConnector();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ExternalConnector#getInst <em>Inst</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Inst</em>'.
   * @see org.aiotml.xtext.aiotML.ExternalConnector#getInst()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Inst();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ExternalConnector#getPort <em>Port</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Port</em>'.
   * @see org.aiotml.xtext.aiotML.ExternalConnector#getPort()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Port();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.ExternalConnector#getProtocol <em>Protocol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Protocol</em>'.
   * @see org.aiotml.xtext.aiotML.ExternalConnector#getProtocol()
   * @see #getExternalConnector()
   * @generated
   */
  EReference getExternalConnector_Protocol();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.OrExpression <em>Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression</em>'.
   * @see org.aiotml.xtext.aiotML.OrExpression
   * @generated
   */
  EClass getOrExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.OrExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.OrExpression#getLhs()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.OrExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.OrExpression#getRhs()
   * @see #getOrExpression()
   * @generated
   */
  EReference getOrExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.AndExpression <em>And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression</em>'.
   * @see org.aiotml.xtext.aiotML.AndExpression
   * @generated
   */
  EClass getAndExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.AndExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.AndExpression#getLhs()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.AndExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.AndExpression#getRhs()
   * @see #getAndExpression()
   * @generated
   */
  EReference getAndExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.EqualsExpression <em>Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equals Expression</em>'.
   * @see org.aiotml.xtext.aiotML.EqualsExpression
   * @generated
   */
  EClass getEqualsExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.EqualsExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.EqualsExpression#getLhs()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.EqualsExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.EqualsExpression#getRhs()
   * @see #getEqualsExpression()
   * @generated
   */
  EReference getEqualsExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.NotEqualsExpression <em>Not Equals Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Equals Expression</em>'.
   * @see org.aiotml.xtext.aiotML.NotEqualsExpression
   * @generated
   */
  EClass getNotEqualsExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.NotEqualsExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.NotEqualsExpression#getLhs()
   * @see #getNotEqualsExpression()
   * @generated
   */
  EReference getNotEqualsExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.NotEqualsExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.NotEqualsExpression#getRhs()
   * @see #getNotEqualsExpression()
   * @generated
   */
  EReference getNotEqualsExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.GreaterExpression <em>Greater Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Expression</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterExpression
   * @generated
   */
  EClass getGreaterExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.GreaterExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterExpression#getLhs()
   * @see #getGreaterExpression()
   * @generated
   */
  EReference getGreaterExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.GreaterExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterExpression#getRhs()
   * @see #getGreaterExpression()
   * @generated
   */
  EReference getGreaterExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.LowerExpression <em>Lower Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower Expression</em>'.
   * @see org.aiotml.xtext.aiotML.LowerExpression
   * @generated
   */
  EClass getLowerExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LowerExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.LowerExpression#getLhs()
   * @see #getLowerExpression()
   * @generated
   */
  EReference getLowerExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LowerExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.LowerExpression#getRhs()
   * @see #getLowerExpression()
   * @generated
   */
  EReference getLowerExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.GreaterOrEqualExpression <em>Greater Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Greater Or Equal Expression</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterOrEqualExpression
   * @generated
   */
  EClass getGreaterOrEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.GreaterOrEqualExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterOrEqualExpression#getLhs()
   * @see #getGreaterOrEqualExpression()
   * @generated
   */
  EReference getGreaterOrEqualExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.GreaterOrEqualExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.GreaterOrEqualExpression#getRhs()
   * @see #getGreaterOrEqualExpression()
   * @generated
   */
  EReference getGreaterOrEqualExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.LowerOrEqualExpression <em>Lower Or Equal Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Lower Or Equal Expression</em>'.
   * @see org.aiotml.xtext.aiotML.LowerOrEqualExpression
   * @generated
   */
  EClass getLowerOrEqualExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LowerOrEqualExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.LowerOrEqualExpression#getLhs()
   * @see #getLowerOrEqualExpression()
   * @generated
   */
  EReference getLowerOrEqualExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.LowerOrEqualExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.LowerOrEqualExpression#getRhs()
   * @see #getLowerOrEqualExpression()
   * @generated
   */
  EReference getLowerOrEqualExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.PlusExpression <em>Plus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Expression</em>'.
   * @see org.aiotml.xtext.aiotML.PlusExpression
   * @generated
   */
  EClass getPlusExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.PlusExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.PlusExpression#getLhs()
   * @see #getPlusExpression()
   * @generated
   */
  EReference getPlusExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.PlusExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.PlusExpression#getRhs()
   * @see #getPlusExpression()
   * @generated
   */
  EReference getPlusExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.MinusExpression <em>Minus Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus Expression</em>'.
   * @see org.aiotml.xtext.aiotML.MinusExpression
   * @generated
   */
  EClass getMinusExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.MinusExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.MinusExpression#getLhs()
   * @see #getMinusExpression()
   * @generated
   */
  EReference getMinusExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.MinusExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.MinusExpression#getRhs()
   * @see #getMinusExpression()
   * @generated
   */
  EReference getMinusExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.TimesExpression <em>Times Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Times Expression</em>'.
   * @see org.aiotml.xtext.aiotML.TimesExpression
   * @generated
   */
  EClass getTimesExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.TimesExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.TimesExpression#getLhs()
   * @see #getTimesExpression()
   * @generated
   */
  EReference getTimesExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.TimesExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.TimesExpression#getRhs()
   * @see #getTimesExpression()
   * @generated
   */
  EReference getTimesExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.DivExpression <em>Div Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div Expression</em>'.
   * @see org.aiotml.xtext.aiotML.DivExpression
   * @generated
   */
  EClass getDivExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.DivExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.DivExpression#getLhs()
   * @see #getDivExpression()
   * @generated
   */
  EReference getDivExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.DivExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.DivExpression#getRhs()
   * @see #getDivExpression()
   * @generated
   */
  EReference getDivExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ModExpression <em>Mod Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mod Expression</em>'.
   * @see org.aiotml.xtext.aiotML.ModExpression
   * @generated
   */
  EClass getModExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ModExpression#getLhs <em>Lhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Lhs</em>'.
   * @see org.aiotml.xtext.aiotML.ModExpression#getLhs()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Lhs();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ModExpression#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see org.aiotml.xtext.aiotML.ModExpression#getRhs()
   * @see #getModExpression()
   * @generated
   */
  EReference getModExpression_Rhs();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.CastExpression <em>Cast Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cast Expression</em>'.
   * @see org.aiotml.xtext.aiotML.CastExpression
   * @generated
   */
  EClass getCastExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.CastExpression#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.aiotml.xtext.aiotML.CastExpression#getTerm()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Term();

  /**
   * Returns the meta object for the reference '{@link org.aiotml.xtext.aiotML.CastExpression#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.aiotml.xtext.aiotML.CastExpression#getType()
   * @see #getCastExpression()
   * @generated
   */
  EReference getCastExpression_Type();

  /**
   * Returns the meta object for the attribute '{@link org.aiotml.xtext.aiotML.CastExpression#isIsArray <em>Is Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Array</em>'.
   * @see org.aiotml.xtext.aiotML.CastExpression#isIsArray()
   * @see #getCastExpression()
   * @generated
   */
  EAttribute getCastExpression_IsArray();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ExpressionGroup <em>Expression Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Group</em>'.
   * @see org.aiotml.xtext.aiotML.ExpressionGroup
   * @generated
   */
  EClass getExpressionGroup();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ExpressionGroup#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.aiotml.xtext.aiotML.ExpressionGroup#getTerm()
   * @see #getExpressionGroup()
   * @generated
   */
  EReference getExpressionGroup_Term();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.NotExpression <em>Not Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not Expression</em>'.
   * @see org.aiotml.xtext.aiotML.NotExpression
   * @generated
   */
  EClass getNotExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.NotExpression#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.aiotml.xtext.aiotML.NotExpression#getTerm()
   * @see #getNotExpression()
   * @generated
   */
  EReference getNotExpression_Term();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.UnaryMinus <em>Unary Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Unary Minus</em>'.
   * @see org.aiotml.xtext.aiotML.UnaryMinus
   * @generated
   */
  EClass getUnaryMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.UnaryMinus#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see org.aiotml.xtext.aiotML.UnaryMinus#getTerm()
   * @see #getUnaryMinus()
   * @generated
   */
  EReference getUnaryMinus_Term();

  /**
   * Returns the meta object for class '{@link org.aiotml.xtext.aiotML.ArrayIndex <em>Array Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Array Index</em>'.
   * @see org.aiotml.xtext.aiotML.ArrayIndex
   * @generated
   */
  EClass getArrayIndex();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ArrayIndex#getArray <em>Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Array</em>'.
   * @see org.aiotml.xtext.aiotML.ArrayIndex#getArray()
   * @see #getArrayIndex()
   * @generated
   */
  EReference getArrayIndex_Array();

  /**
   * Returns the meta object for the containment reference '{@link org.aiotml.xtext.aiotML.ArrayIndex#getIndex <em>Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Index</em>'.
   * @see org.aiotml.xtext.aiotML.ArrayIndex#getIndex()
   * @see #getArrayIndex()
   * @generated
   */
  EReference getArrayIndex_Index();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AiotMLFactory getAiotMLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AiotMLModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AiotMLModelImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAiotMLModel()
     * @generated
     */
    EClass AIOT_ML_MODEL = eINSTANCE.getAiotMLModel();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOT_ML_MODEL__IMPORTS = eINSTANCE.getAiotMLModel_Imports();

    /**
     * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOT_ML_MODEL__TEMPLATES = eINSTANCE.getAiotMLModel_Templates();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOT_ML_MODEL__TYPES = eINSTANCE.getAiotMLModel_Types();

    /**
     * The meta object literal for the '<em><b>Protocols</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOT_ML_MODEL__PROTOCOLS = eINSTANCE.getAiotMLModel_Protocols();

    /**
     * The meta object literal for the '<em><b>Configs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AIOT_ML_MODEL__CONFIGS = eINSTANCE.getAiotMLModel_Configs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TemplateImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TEMPLATE__PATH = eINSTANCE.getTemplate_Path();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ImportImpl <em>Import</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ImportImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getImport()
     * @generated
     */
    EClass IMPORT = eINSTANCE.getImport();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__IMPORT_URI = eINSTANCE.getImport_ImportURI();

    /**
     * The meta object literal for the '<em><b>From</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMPORT__FROM = eINSTANCE.getImport_From();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PlatformAnnotationImpl <em>Platform Annotation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PlatformAnnotationImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPlatformAnnotation()
     * @generated
     */
    EClass PLATFORM_ANNOTATION = eINSTANCE.getPlatformAnnotation();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM_ANNOTATION__NAME = eINSTANCE.getPlatformAnnotation_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PLATFORM_ANNOTATION__VALUE = eINSTANCE.getPlatformAnnotation_Value();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.NamedElementImpl <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.NamedElementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNamedElement()
     * @generated
     */
    EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AnnotatedElementImpl <em>Annotated Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AnnotatedElementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAnnotatedElement()
     * @generated
     */
    EClass ANNOTATED_ELEMENT = eINSTANCE.getAnnotatedElement();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANNOTATED_ELEMENT__ANNOTATIONS = eINSTANCE.getAnnotatedElement_Annotations();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.VariableImpl <em>Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.VariableImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getVariable()
     * @generated
     */
    EClass VARIABLE = eINSTANCE.getVariable();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TYPE_REF = eINSTANCE.getVariable_TypeRef();

    /**
     * The meta object literal for the '<em><b>Tensor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE__TENSOR = eINSTANCE.getVariable_Tensor();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TypeRefImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTypeRef()
     * @generated
     */
    EClass TYPE_REF = eINSTANCE.getTypeRef();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__TYPE = eINSTANCE.getTypeRef_Type();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_REF__IS_ARRAY = eINSTANCE.getTypeRef_IsArray();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_REF__CARDINALITY = eINSTANCE.getTypeRef_Cardinality();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TypeImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PrimitiveTypeImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPrimitiveType()
     * @generated
     */
    EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '<em><b>Byte Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE__BYTE_SIZE = eINSTANCE.getPrimitiveType_ByteSize();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ObjectTypeImpl <em>Object Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ObjectTypeImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getObjectType()
     * @generated
     */
    EClass OBJECT_TYPE = eINSTANCE.getObjectType();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EnumerationImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__TYPE_REF = eINSTANCE.getEnumeration_TypeRef();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EnumerationLiteralImpl <em>Enumeration Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EnumerationLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumerationLiteral()
     * @generated
     */
    EClass ENUMERATION_LITERAL = eINSTANCE.getEnumerationLiteral();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUMERATION_LITERAL__INIT = eINSTANCE.getEnumerationLiteral_Init();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TensorImpl <em>Tensor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TensorImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTensor()
     * @generated
     */
    EClass TENSOR = eINSTANCE.getTensor();

    /**
     * The meta object literal for the '<em><b>Dims</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TENSOR__DIMS = eINSTANCE.getTensor_Dims();

    /**
     * The meta object literal for the '<em><b>Datatype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TENSOR__DATATYPE = eINSTANCE.getTensor_Datatype();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LayerImpl <em>Layer</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LayerImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLayer()
     * @generated
     */
    EClass LAYER = eINSTANCE.getLayer();

    /**
     * The meta object literal for the '<em><b>Layernums</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LAYER__LAYERNUMS = eINSTANCE.getLayer_Layernums();

    /**
     * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__NUM = eINSTANCE.getLayer_Num();

    /**
     * The meta object literal for the '<em><b>Af</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LAYER__AF = eINSTANCE.getLayer_Af();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ModelImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Layers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__LAYERS = eINSTANCE.getModel_Layers();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ModelReferenceImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModelReference()
     * @generated
     */
    EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_REFERENCE__TYPE_REF = eINSTANCE.getModelReference_TypeRef();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StrategyImpl <em>Strategy</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StrategyImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategy()
     * @generated
     */
    EClass STRATEGY = eINSTANCE.getStrategy();

    /**
     * The meta object literal for the '<em><b>Tensor</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__TENSOR = eINSTANCE.getStrategy_Tensor();

    /**
     * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__DEVICES = eINSTANCE.getStrategy_Devices();

    /**
     * The meta object literal for the '<em><b>Rewdims</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__REWDIMS = eINSTANCE.getStrategy_Rewdims();

    /**
     * The meta object literal for the '<em><b>Obsdims</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__OBSDIMS = eINSTANCE.getStrategy_Obsdims();

    /**
     * The meta object literal for the '<em><b>Actiondims</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__ACTIONDIMS = eINSTANCE.getStrategy_Actiondims();

    /**
     * The meta object literal for the '<em><b>Pmodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__PMODEL = eINSTANCE.getStrategy_Pmodel();

    /**
     * The meta object literal for the '<em><b>Qmodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY__QMODEL = eINSTANCE.getStrategy_Qmodel();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.MultiAgentImpl <em>Multi Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.MultiAgentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMultiAgent()
     * @generated
     */
    EClass MULTI_AGENT = eINSTANCE.getMultiAgent();

    /**
     * The meta object literal for the '<em><b>Agents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MULTI_AGENT__AGENTS = eINSTANCE.getMultiAgent_Agents();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.MultiAgentPropertyImpl <em>Multi Agent Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.MultiAgentPropertyImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMultiAgentProperty()
     * @generated
     */
    EClass MULTI_AGENT_PROPERTY = eINSTANCE.getMultiAgentProperty();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StrategyPropertyImpl <em>Strategy Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StrategyPropertyImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyProperty()
     * @generated
     */
    EClass STRATEGY_PROPERTY = eINSTANCE.getStrategyProperty();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl <em>Strategy Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StrategyAssignmentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyAssignment()
     * @generated
     */
    EClass STRATEGY_ASSIGNMENT = eINSTANCE.getStrategyAssignment();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_ASSIGNMENT__STRATEGY = eINSTANCE.getStrategyAssignment_Strategy();

    /**
     * The meta object literal for the '<em><b>Agent</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_ASSIGNMENT__AGENT = eINSTANCE.getStrategyAssignment_Agent();

    /**
     * The meta object literal for the '<em><b>Rbind Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_ASSIGNMENT__RBIND_FUNCTION = eINSTANCE.getStrategyAssignment_RbindFunction();

    /**
     * The meta object literal for the '<em><b>Ibind Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_ASSIGNMENT__IBIND_FUNCTION = eINSTANCE.getStrategyAssignment_IbindFunction();

    /**
     * The meta object literal for the '<em><b>Obind Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_ASSIGNMENT__OBIND_FUNCTION = eINSTANCE.getStrategyAssignment_ObindFunction();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ThingImpl <em>Thing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ThingImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getThing()
     * @generated
     */
    EClass THING = eINSTANCE.getThing();

    /**
     * The meta object literal for the '<em><b>Fragment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute THING__FRAGMENT = eINSTANCE.getThing_Fragment();

    /**
     * The meta object literal for the '<em><b>Includes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__INCLUDES = eINSTANCE.getThing_Includes();

    /**
     * The meta object literal for the '<em><b>Messages</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__MESSAGES = eINSTANCE.getThing_Messages();

    /**
     * The meta object literal for the '<em><b>Ports</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__PORTS = eINSTANCE.getThing_Ports();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__PROPERTIES = eINSTANCE.getThing_Properties();

    /**
     * The meta object literal for the '<em><b>Cproperties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__CPROPERTIES = eINSTANCE.getThing_Cproperties();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__FUNCTIONS = eINSTANCE.getThing_Functions();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__ASSIGN = eINSTANCE.getThing_Assign();

    /**
     * The meta object literal for the '<em><b>Strategys</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__STRATEGYS = eINSTANCE.getThing_Strategys();

    /**
     * The meta object literal for the '<em><b>Sassigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__SASSIGNS = eINSTANCE.getThing_Sassigns();

    /**
     * The meta object literal for the '<em><b>Mas</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__MAS = eINSTANCE.getThing_Mas();

    /**
     * The meta object literal for the '<em><b>Behaviour</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference THING__BEHAVIOUR = eINSTANCE.getThing_Behaviour();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.SubThingImpl <em>Sub Thing</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.SubThingImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSubThing()
     * @generated
     */
    EClass SUB_THING = eINSTANCE.getSubThing();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_THING__PROPERTIES = eINSTANCE.getSubThing_Properties();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUB_THING__FUNCTIONS = eINSTANCE.getSubThing_Functions();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AgentImpl <em>Agent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AgentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAgent()
     * @generated
     */
    EClass AGENT = eINSTANCE.getAgent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AGENT__NAME = eINSTANCE.getAgent_Name();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__CARDINALITY = eINSTANCE.getAgent_Cardinality();

    /**
     * The meta object literal for the '<em><b>Amodel</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AGENT__AMODEL = eINSTANCE.getAgent_Amodel();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyImpl <em>Cproperty</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CpropertyImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCproperty()
     * @generated
     */
    EClass CPROPERTY = eINSTANCE.getCproperty();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PropertyAssignImpl <em>Property Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PropertyAssignImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPropertyAssign()
     * @generated
     */
    EClass PROPERTY_ASSIGN = eINSTANCE.getPropertyAssign();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ASSIGN__PROPERTY = eINSTANCE.getPropertyAssign_Property();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ASSIGN__INDEX = eINSTANCE.getPropertyAssign_Index();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_ASSIGN__INIT = eINSTANCE.getPropertyAssign_Init();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ProtocolImpl <em>Protocol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ProtocolImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProtocol()
     * @generated
     */
    EClass PROTOCOL = eINSTANCE.getProtocol();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.FunctionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__TYPE_REF = eINSTANCE.getFunction_TypeRef();

    /**
     * The meta object literal for the '<em><b>Extra Type Ref</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__EXTRA_TYPE_REF = eINSTANCE.getFunction_ExtraTypeRef();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION__BODY = eINSTANCE.getFunction_Body();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__ABSTRACT = eINSTANCE.getFunction_Abstract();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PropertyImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__READONLY = eINSTANCE.getProperty_Readonly();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__INIT = eINSTANCE.getProperty_Init();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.MessageImpl <em>Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.MessageImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMessage()
     * @generated
     */
    EClass MESSAGE = eINSTANCE.getMessage();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MESSAGE__PARAMETERS = eINSTANCE.getMessage_Parameters();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ParameterImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PortImpl <em>Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PortImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPort()
     * @generated
     */
    EClass PORT = eINSTANCE.getPort();

    /**
     * The meta object literal for the '<em><b>Sends</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__SENDS = eINSTANCE.getPort_Sends();

    /**
     * The meta object literal for the '<em><b>Receives</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PORT__RECEIVES = eINSTANCE.getPort_Receives();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.RequiredPortImpl <em>Required Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.RequiredPortImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getRequiredPort()
     * @generated
     */
    EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

    /**
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIRED_PORT__OPTIONAL = eINSTANCE.getRequiredPort_Optional();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ProvidedPortImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getProvidedPort()
     * @generated
     */
    EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.InternalPortImpl <em>Internal Port</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.InternalPortImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInternalPort()
     * @generated
     */
    EClass INTERNAL_PORT = eINSTANCE.getInternalPort();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StateImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__PROPERTIES = eINSTANCE.getState_Properties();

    /**
     * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__ENTRY = eINSTANCE.getState_Entry();

    /**
     * The meta object literal for the '<em><b>Exit</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__EXIT = eINSTANCE.getState_Exit();

    /**
     * The meta object literal for the '<em><b>Internal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__INTERNAL = eINSTANCE.getState_Internal();

    /**
     * The meta object literal for the '<em><b>Outgoing</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.HandlerImpl <em>Handler</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.HandlerImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getHandler()
     * @generated
     */
    EClass HANDLER = eINSTANCE.getHandler();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER__EVENT = eINSTANCE.getHandler_Event();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER__GUARD = eINSTANCE.getHandler_Guard();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HANDLER__ACTION = eINSTANCE.getHandler_Action();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TransitionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.InternalTransitionImpl <em>Internal Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.InternalTransitionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInternalTransition()
     * @generated
     */
    EClass INTERNAL_TRANSITION = eINSTANCE.getInternalTransition();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CompositeStateImpl <em>Composite State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CompositeStateImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCompositeState()
     * @generated
     */
    EClass COMPOSITE_STATE = eINSTANCE.getCompositeState();

    /**
     * The meta object literal for the '<em><b>Region</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_STATE__REGION = eINSTANCE.getCompositeState_Region();

    /**
     * The meta object literal for the '<em><b>Session</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_STATE__SESSION = eINSTANCE.getCompositeState_Session();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.SessionImpl <em>Session</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.SessionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSession()
     * @generated
     */
    EClass SESSION = eINSTANCE.getSession();

    /**
     * The meta object literal for the '<em><b>Max Instances</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SESSION__MAX_INSTANCES = eINSTANCE.getSession_MaxInstances();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.RegionImpl <em>Region</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.RegionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getRegion()
     * @generated
     */
    EClass REGION = eINSTANCE.getRegion();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.FinalStateImpl <em>Final State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.FinalStateImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFinalState()
     * @generated
     */
    EClass FINAL_STATE = eINSTANCE.getFinalState();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StateContainerImpl <em>State Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StateContainerImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStateContainer()
     * @generated
     */
    EClass STATE_CONTAINER = eINSTANCE.getStateContainer();

    /**
     * The meta object literal for the '<em><b>Initial</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTAINER__INITIAL = eINSTANCE.getStateContainer_Initial();

    /**
     * The meta object literal for the '<em><b>History</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE_CONTAINER__HISTORY = eINSTANCE.getStateContainer_History();

    /**
     * The meta object literal for the '<em><b>Substate</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_CONTAINER__SUBSTATE = eINSTANCE.getStateContainer_Substate();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EventImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ReceiveMessageImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getReceiveMessage()
     * @generated
     */
    EClass RECEIVE_MESSAGE = eINSTANCE.getReceiveMessage();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECEIVE_MESSAGE__PORT = eINSTANCE.getReceiveMessage_Port();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECEIVE_MESSAGE__MESSAGE = eINSTANCE.getReceiveMessage_Message();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ActionBlockImpl <em>Action Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ActionBlockImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getActionBlock()
     * @generated
     */
    EClass ACTION_BLOCK = eINSTANCE.getActionBlock();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION_BLOCK__ACTIONS = eINSTANCE.getActionBlock_Actions();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ExternStatementImpl <em>Extern Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ExternStatementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternStatement()
     * @generated
     */
    EClass EXTERN_STATEMENT = eINSTANCE.getExternStatement();

    /**
     * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERN_STATEMENT__STATEMENT = eINSTANCE.getExternStatement_Statement();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_STATEMENT__SEGMENTS = eINSTANCE.getExternStatement_Segments();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LocalVariableImpl <em>Local Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LocalVariableImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLocalVariable()
     * @generated
     */
    EClass LOCAL_VARIABLE = eINSTANCE.getLocalVariable();

    /**
     * The meta object literal for the '<em><b>Readonly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOCAL_VARIABLE__READONLY = eINSTANCE.getLocalVariable_Readonly();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOCAL_VARIABLE__INIT = eINSTANCE.getLocalVariable_Init();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.SendActionImpl <em>Send Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.SendActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getSendAction()
     * @generated
     */
    EClass SEND_ACTION = eINSTANCE.getSendAction();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND_ACTION__PORT = eINSTANCE.getSendAction_Port();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND_ACTION__MESSAGE = eINSTANCE.getSendAction_Message();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SEND_ACTION__PARAMETERS = eINSTANCE.getSendAction_Parameters();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl <em>Variable Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getVariableAssignment()
     * @generated
     */
    EClass VARIABLE_ASSIGNMENT = eINSTANCE.getVariableAssignment();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__PROPERTY = eINSTANCE.getVariableAssignment_Property();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__INDEX = eINSTANCE.getVariableAssignment_Index();

    /**
     * The meta object literal for the '<em><b>Extra Property</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXTRA_PROPERTY = eINSTANCE.getVariableAssignment_ExtraProperty();

    /**
     * The meta object literal for the '<em><b>Extra Index</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXTRA_INDEX = eINSTANCE.getVariableAssignment_ExtraIndex();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_ASSIGNMENT__EXPRESSION = eINSTANCE.getVariableAssignment_Expression();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyAssignmentImpl <em>Cproperty Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CpropertyAssignmentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCpropertyAssignment()
     * @generated
     */
    EClass CPROPERTY_ASSIGNMENT = eINSTANCE.getCpropertyAssignment();

    /**
     * The meta object literal for the '<em><b>Cpropertys</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_ASSIGNMENT__CPROPERTYS = eINSTANCE.getCpropertyAssignment_Cpropertys();

    /**
     * The meta object literal for the '<em><b>Cindex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_ASSIGNMENT__CINDEX = eINSTANCE.getCpropertyAssignment_Cindex();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_ASSIGNMENT__PROPERTY = eINSTANCE.getCpropertyAssignment_Property();

    /**
     * The meta object literal for the '<em><b>Pindex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_ASSIGNMENT__PINDEX = eINSTANCE.getCpropertyAssignment_Pindex();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_ASSIGNMENT__EXPRESSION = eINSTANCE.getCpropertyAssignment_Expression();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StrategyStreamImpl <em>Strategy Stream</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StrategyStreamImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStrategyStream()
     * @generated
     */
    EClass STRATEGY_STREAM = eINSTANCE.getStrategyStream();

    /**
     * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_STREAM__INPUTS = eINSTANCE.getStrategyStream_Inputs();

    /**
     * The meta object literal for the '<em><b>Strategy</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_STREAM__STRATEGY = eINSTANCE.getStrategyStream_Strategy();

    /**
     * The meta object literal for the '<em><b>Outputs</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STRATEGY_STREAM__OUTPUTS = eINSTANCE.getStrategyStream_Outputs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.DictAssignmentImpl <em>Dict Assignment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.DictAssignmentImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDictAssignment()
     * @generated
     */
    EClass DICT_ASSIGNMENT = eINSTANCE.getDictAssignment();

    /**
     * The meta object literal for the '<em><b>Dict</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ASSIGNMENT__DICT = eINSTANCE.getDictAssignment_Dict();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ASSIGNMENT__ELEMENTS = eINSTANCE.getDictAssignment_Elements();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DICT_ASSIGNMENT__VAR = eINSTANCE.getDictAssignment_Var();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl <em>Zip Enumerate</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ZipEnumerateImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getZipEnumerate()
     * @generated
     */
    EClass ZIP_ENUMERATE = eINSTANCE.getZipEnumerate();

    /**
     * The meta object literal for the '<em><b>Vars</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZIP_ENUMERATE__VARS = eINSTANCE.getZipEnumerate_Vars();

    /**
     * The meta object literal for the '<em><b>Fname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ZIP_ENUMERATE__FNAME = eINSTANCE.getZipEnumerate_Fname();

    /**
     * The meta object literal for the '<em><b>Sets</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZIP_ENUMERATE__SETS = eINSTANCE.getZipEnumerate_Sets();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ZIP_ENUMERATE__ACTION = eINSTANCE.getZipEnumerate_Action();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AppendImpl <em>Append</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AppendImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAppend()
     * @generated
     */
    EClass APPEND = eINSTANCE.getAppend();

    /**
     * The meta object literal for the '<em><b>Pythonlist</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPEND__PYTHONLIST = eINSTANCE.getAppend_Pythonlist();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference APPEND__ELEMENT = eINSTANCE.getAppend_Element();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.IncrementImpl <em>Increment</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.IncrementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getIncrement()
     * @generated
     */
    EClass INCREMENT = eINSTANCE.getIncrement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INCREMENT__VAR = eINSTANCE.getIncrement_Var();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.DecrementImpl <em>Decrement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.DecrementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDecrement()
     * @generated
     */
    EClass DECREMENT = eINSTANCE.getDecrement();

    /**
     * The meta object literal for the '<em><b>Var</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DECREMENT__VAR = eINSTANCE.getDecrement_Var();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ForActionImpl <em>For Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ForActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getForAction()
     * @generated
     */
    EClass FOR_ACTION = eINSTANCE.getForAction();

    /**
     * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ACTION__VARIABLE = eINSTANCE.getForAction_Variable();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ACTION__INDEX = eINSTANCE.getForAction_Index();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ACTION__ARRAY = eINSTANCE.getForAction_Array();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FOR_ACTION__ACTION = eINSTANCE.getForAction_Action();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PyforActionImpl <em>Pyfor Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PyforActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPyforAction()
     * @generated
     */
    EClass PYFOR_ACTION = eINSTANCE.getPyforAction();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PYFOR_ACTION__VARIABLES = eINSTANCE.getPyforAction_Variables();

    /**
     * The meta object literal for the '<em><b>Arrays</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PYFOR_ACTION__ARRAYS = eINSTANCE.getPyforAction_Arrays();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PYFOR_ACTION__ACTION = eINSTANCE.getPyforAction_Action();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LoopActionImpl <em>Loop Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LoopActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLoopAction()
     * @generated
     */
    EClass LOOP_ACTION = eINSTANCE.getLoopAction();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_ACTION__CONDITION = eINSTANCE.getLoopAction_Condition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOOP_ACTION__ACTION = eINSTANCE.getLoopAction_Action();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ConditionalActionImpl <em>Conditional Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ConditionalActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConditionalAction()
     * @generated
     */
    EClass CONDITIONAL_ACTION = eINSTANCE.getConditionalAction();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_ACTION__CONDITION = eINSTANCE.getConditionalAction_Condition();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_ACTION__ACTION = eINSTANCE.getConditionalAction_Action();

    /**
     * The meta object literal for the '<em><b>Else Action</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_ACTION__ELSE_ACTION = eINSTANCE.getConditionalAction_ElseAction();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ReturnActionImpl <em>Return Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ReturnActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getReturnAction()
     * @generated
     */
    EClass RETURN_ACTION = eINSTANCE.getReturnAction();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_ACTION__EXP = eINSTANCE.getReturnAction_Exp();

    /**
     * The meta object literal for the '<em><b>Extra Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RETURN_ACTION__EXTRA_EXP = eINSTANCE.getReturnAction_ExtraExp();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PrintActionImpl <em>Print Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PrintActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPrintAction()
     * @generated
     */
    EClass PRINT_ACTION = eINSTANCE.getPrintAction();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRINT_ACTION__LINE = eINSTANCE.getPrintAction_Line();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRINT_ACTION__MSG = eINSTANCE.getPrintAction_Msg();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ErrorActionImpl <em>Error Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ErrorActionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getErrorAction()
     * @generated
     */
    EClass ERROR_ACTION = eINSTANCE.getErrorAction();

    /**
     * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ERROR_ACTION__LINE = eINSTANCE.getErrorAction_Line();

    /**
     * The meta object literal for the '<em><b>Msg</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ERROR_ACTION__MSG = eINSTANCE.getErrorAction_Msg();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StartSessionImpl <em>Start Session</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StartSessionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStartSession()
     * @generated
     */
    EClass START_SESSION = eINSTANCE.getStartSession();

    /**
     * The meta object literal for the '<em><b>Session</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference START_SESSION__SESSION = eINSTANCE.getStartSession_Session();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.FunctionCallStatementImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunctionCallStatement()
     * @generated
     */
    EClass FUNCTION_CALL_STATEMENT = eINSTANCE.getFunctionCallStatement();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_STATEMENT__FUNCTION = eINSTANCE.getFunctionCallStatement_Function();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_STATEMENT__PARAMETERS = eINSTANCE.getFunctionCallStatement_Parameters();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ExternExpressionImpl <em>Extern Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ExternExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternExpression()
     * @generated
     */
    EClass EXTERN_EXPRESSION = eINSTANCE.getExternExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERN_EXPRESSION__EXPRESSION = eINSTANCE.getExternExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERN_EXPRESSION__SEGMENTS = eINSTANCE.getExternExpression_Segments();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ArrayInitImpl <em>Array Init</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ArrayInitImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getArrayInit()
     * @generated
     */
    EClass ARRAY_INIT = eINSTANCE.getArrayInit();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INIT__VALUES = eINSTANCE.getArrayInit_Values();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EnumLiteralRefImpl <em>Enum Literal Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EnumLiteralRefImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEnumLiteralRef()
     * @generated
     */
    EClass ENUM_LITERAL_REF = eINSTANCE.getEnumLiteralRef();

    /**
     * The meta object literal for the '<em><b>Enum</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LITERAL_REF__ENUM = eINSTANCE.getEnumLiteralRef_Enum();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENUM_LITERAL_REF__LITERAL = eINSTANCE.getEnumLiteralRef_Literal();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ByteLiteralImpl <em>Byte Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ByteLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getByteLiteral()
     * @generated
     */
    EClass BYTE_LITERAL = eINSTANCE.getByteLiteral();

    /**
     * The meta object literal for the '<em><b>Byte Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BYTE_LITERAL__BYTE_VALUE = eINSTANCE.getByteLiteral_ByteValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CharLiteralImpl <em>Char Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CharLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCharLiteral()
     * @generated
     */
    EClass CHAR_LITERAL = eINSTANCE.getCharLiteral();

    /**
     * The meta object literal for the '<em><b>Char Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CHAR_LITERAL__CHAR_VALUE = eINSTANCE.getCharLiteral_CharValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.IntegerLiteralImpl <em>Integer Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.IntegerLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getIntegerLiteral()
     * @generated
     */
    EClass INTEGER_LITERAL = eINSTANCE.getIntegerLiteral();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_LITERAL__INT_VALUE = eINSTANCE.getIntegerLiteral_IntValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.BooleanLiteralImpl <em>Boolean Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.BooleanLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getBooleanLiteral()
     * @generated
     */
    EClass BOOLEAN_LITERAL = eINSTANCE.getBooleanLiteral();

    /**
     * The meta object literal for the '<em><b>Bool Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_LITERAL__BOOL_VALUE = eINSTANCE.getBooleanLiteral_BoolValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.StringLiteralImpl <em>String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.StringLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getStringLiteral()
     * @generated
     */
    EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_LITERAL__STRING_VALUE = eINSTANCE.getStringLiteral_StringValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.DoubleLiteralImpl <em>Double Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.DoubleLiteralImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDoubleLiteral()
     * @generated
     */
    EClass DOUBLE_LITERAL = eINSTANCE.getDoubleLiteral();

    /**
     * The meta object literal for the '<em><b>Double Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOUBLE_LITERAL__DOUBLE_VALUE = eINSTANCE.getDoubleLiteral_DoubleValue();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PropertyReferenceImpl <em>Property Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PropertyReferenceImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPropertyReference()
     * @generated
     */
    EClass PROPERTY_REFERENCE = eINSTANCE.getPropertyReference();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_REFERENCE__PROPERTY = eINSTANCE.getPropertyReference_Property();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl <em>Cproperty Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CpropertyReferenceImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCpropertyReference()
     * @generated
     */
    EClass CPROPERTY_REFERENCE = eINSTANCE.getCpropertyReference();

    /**
     * The meta object literal for the '<em><b>Cpropertys</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_REFERENCE__CPROPERTYS = eINSTANCE.getCpropertyReference_Cpropertys();

    /**
     * The meta object literal for the '<em><b>Cindex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_REFERENCE__CINDEX = eINSTANCE.getCpropertyReference_Cindex();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_REFERENCE__PROPERTY = eINSTANCE.getCpropertyReference_Property();

    /**
     * The meta object literal for the '<em><b>Pindex</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CPROPERTY_REFERENCE__PINDEX = eINSTANCE.getCpropertyReference_Pindex();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EventReferenceImpl <em>Event Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EventReferenceImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEventReference()
     * @generated
     */
    EClass EVENT_REFERENCE = eINSTANCE.getEventReference();

    /**
     * The meta object literal for the '<em><b>Receive Msg</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_REFERENCE__RECEIVE_MSG = eINSTANCE.getEventReference_ReceiveMsg();

    /**
     * The meta object literal for the '<em><b>Parameter</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT_REFERENCE__PARAMETER = eINSTANCE.getEventReference_Parameter();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.FunctionCallExpressionImpl <em>Function Call Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.FunctionCallExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getFunctionCallExpression()
     * @generated
     */
    EClass FUNCTION_CALL_EXPRESSION = eINSTANCE.getFunctionCallExpression();

    /**
     * The meta object literal for the '<em><b>Function</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_EXPRESSION__FUNCTION = eINSTANCE.getFunctionCallExpression_Function();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FUNCTION_CALL_EXPRESSION__PARAMETERS = eINSTANCE.getFunctionCallExpression_Parameters();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ConfigurationImpl <em>Configuration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ConfigurationImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConfiguration()
     * @generated
     */
    EClass CONFIGURATION = eINSTANCE.getConfiguration();

    /**
     * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__INSTANCES = eINSTANCE.getConfiguration_Instances();

    /**
     * The meta object literal for the '<em><b>Connectors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__CONNECTORS = eINSTANCE.getConfiguration_Connectors();

    /**
     * The meta object literal for the '<em><b>Propassigns</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIGURATION__PROPASSIGNS = eINSTANCE.getConfiguration_Propassigns();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.InstanceImpl <em>Instance</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.InstanceImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getInstance()
     * @generated
     */
    EClass INSTANCE = eINSTANCE.getInstance();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE__TYPE = eINSTANCE.getInstance_Type();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ConfigPropertyAssignImpl <em>Config Property Assign</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ConfigPropertyAssignImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConfigPropertyAssign()
     * @generated
     */
    EClass CONFIG_PROPERTY_ASSIGN = eINSTANCE.getConfigPropertyAssign();

    /**
     * The meta object literal for the '<em><b>Instance</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_PROPERTY_ASSIGN__INSTANCE = eINSTANCE.getConfigPropertyAssign_Instance();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_PROPERTY_ASSIGN__PROPERTY = eINSTANCE.getConfigPropertyAssign_Property();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_PROPERTY_ASSIGN__INDEX = eINSTANCE.getConfigPropertyAssign_Index();

    /**
     * The meta object literal for the '<em><b>Init</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_PROPERTY_ASSIGN__INIT = eINSTANCE.getConfigPropertyAssign_Init();

    /**
     * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONFIG_PROPERTY_ASSIGN__ANNOTATIONS = eINSTANCE.getConfigPropertyAssign_Annotations();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AbstractConnectorImpl <em>Abstract Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AbstractConnectorImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAbstractConnector()
     * @generated
     */
    EClass ABSTRACT_CONNECTOR = eINSTANCE.getAbstractConnector();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ConnectorImpl <em>Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ConnectorImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getConnector()
     * @generated
     */
    EClass CONNECTOR = eINSTANCE.getConnector();

    /**
     * The meta object literal for the '<em><b>Cli</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__CLI = eINSTANCE.getConnector_Cli();

    /**
     * The meta object literal for the '<em><b>Required</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__REQUIRED = eINSTANCE.getConnector_Required();

    /**
     * The meta object literal for the '<em><b>Srv</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__SRV = eINSTANCE.getConnector_Srv();

    /**
     * The meta object literal for the '<em><b>Provided</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONNECTOR__PROVIDED = eINSTANCE.getConnector_Provided();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ExternalConnectorImpl <em>External Connector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ExternalConnectorImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExternalConnector()
     * @generated
     */
    EClass EXTERNAL_CONNECTOR = eINSTANCE.getExternalConnector();

    /**
     * The meta object literal for the '<em><b>Inst</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONNECTOR__INST = eINSTANCE.getExternalConnector_Inst();

    /**
     * The meta object literal for the '<em><b>Port</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONNECTOR__PORT = eINSTANCE.getExternalConnector_Port();

    /**
     * The meta object literal for the '<em><b>Protocol</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_CONNECTOR__PROTOCOL = eINSTANCE.getExternalConnector_Protocol();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.OrExpressionImpl <em>Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.OrExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getOrExpression()
     * @generated
     */
    EClass OR_EXPRESSION = eINSTANCE.getOrExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__LHS = eINSTANCE.getOrExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION__RHS = eINSTANCE.getOrExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.AndExpressionImpl <em>And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.AndExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getAndExpression()
     * @generated
     */
    EClass AND_EXPRESSION = eINSTANCE.getAndExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__LHS = eINSTANCE.getAndExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION__RHS = eINSTANCE.getAndExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.EqualsExpressionImpl <em>Equals Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.EqualsExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getEqualsExpression()
     * @generated
     */
    EClass EQUALS_EXPRESSION = eINSTANCE.getEqualsExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_EXPRESSION__LHS = eINSTANCE.getEqualsExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALS_EXPRESSION__RHS = eINSTANCE.getEqualsExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.NotEqualsExpressionImpl <em>Not Equals Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.NotEqualsExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNotEqualsExpression()
     * @generated
     */
    EClass NOT_EQUALS_EXPRESSION = eINSTANCE.getNotEqualsExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUALS_EXPRESSION__LHS = eINSTANCE.getNotEqualsExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EQUALS_EXPRESSION__RHS = eINSTANCE.getNotEqualsExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.GreaterExpressionImpl <em>Greater Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.GreaterExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getGreaterExpression()
     * @generated
     */
    EClass GREATER_EXPRESSION = eINSTANCE.getGreaterExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_EXPRESSION__LHS = eINSTANCE.getGreaterExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_EXPRESSION__RHS = eINSTANCE.getGreaterExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LowerExpressionImpl <em>Lower Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LowerExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLowerExpression()
     * @generated
     */
    EClass LOWER_EXPRESSION = eINSTANCE.getLowerExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER_EXPRESSION__LHS = eINSTANCE.getLowerExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER_EXPRESSION__RHS = eINSTANCE.getLowerExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.GreaterOrEqualExpressionImpl <em>Greater Or Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.GreaterOrEqualExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getGreaterOrEqualExpression()
     * @generated
     */
    EClass GREATER_OR_EQUAL_EXPRESSION = eINSTANCE.getGreaterOrEqualExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_OR_EQUAL_EXPRESSION__LHS = eINSTANCE.getGreaterOrEqualExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GREATER_OR_EQUAL_EXPRESSION__RHS = eINSTANCE.getGreaterOrEqualExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.LowerOrEqualExpressionImpl <em>Lower Or Equal Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.LowerOrEqualExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getLowerOrEqualExpression()
     * @generated
     */
    EClass LOWER_OR_EQUAL_EXPRESSION = eINSTANCE.getLowerOrEqualExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER_OR_EQUAL_EXPRESSION__LHS = eINSTANCE.getLowerOrEqualExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LOWER_OR_EQUAL_EXPRESSION__RHS = eINSTANCE.getLowerOrEqualExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.PlusExpressionImpl <em>Plus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.PlusExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getPlusExpression()
     * @generated
     */
    EClass PLUS_EXPRESSION = eINSTANCE.getPlusExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_EXPRESSION__LHS = eINSTANCE.getPlusExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS_EXPRESSION__RHS = eINSTANCE.getPlusExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.MinusExpressionImpl <em>Minus Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.MinusExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getMinusExpression()
     * @generated
     */
    EClass MINUS_EXPRESSION = eINSTANCE.getMinusExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS_EXPRESSION__LHS = eINSTANCE.getMinusExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS_EXPRESSION__RHS = eINSTANCE.getMinusExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.TimesExpressionImpl <em>Times Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.TimesExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getTimesExpression()
     * @generated
     */
    EClass TIMES_EXPRESSION = eINSTANCE.getTimesExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMES_EXPRESSION__LHS = eINSTANCE.getTimesExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TIMES_EXPRESSION__RHS = eINSTANCE.getTimesExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.DivExpressionImpl <em>Div Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.DivExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getDivExpression()
     * @generated
     */
    EClass DIV_EXPRESSION = eINSTANCE.getDivExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV_EXPRESSION__LHS = eINSTANCE.getDivExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV_EXPRESSION__RHS = eINSTANCE.getDivExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ModExpressionImpl <em>Mod Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ModExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getModExpression()
     * @generated
     */
    EClass MOD_EXPRESSION = eINSTANCE.getModExpression();

    /**
     * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__LHS = eINSTANCE.getModExpression_Lhs();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MOD_EXPRESSION__RHS = eINSTANCE.getModExpression_Rhs();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.CastExpressionImpl <em>Cast Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.CastExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getCastExpression()
     * @generated
     */
    EClass CAST_EXPRESSION = eINSTANCE.getCastExpression();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TERM = eINSTANCE.getCastExpression_Term();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CAST_EXPRESSION__TYPE = eINSTANCE.getCastExpression_Type();

    /**
     * The meta object literal for the '<em><b>Is Array</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CAST_EXPRESSION__IS_ARRAY = eINSTANCE.getCastExpression_IsArray();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ExpressionGroupImpl <em>Expression Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ExpressionGroupImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getExpressionGroup()
     * @generated
     */
    EClass EXPRESSION_GROUP = eINSTANCE.getExpressionGroup();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION_GROUP__TERM = eINSTANCE.getExpressionGroup_Term();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.NotExpressionImpl <em>Not Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.NotExpressionImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getNotExpression()
     * @generated
     */
    EClass NOT_EXPRESSION = eINSTANCE.getNotExpression();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOT_EXPRESSION__TERM = eINSTANCE.getNotExpression_Term();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.UnaryMinusImpl <em>Unary Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.UnaryMinusImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getUnaryMinus()
     * @generated
     */
    EClass UNARY_MINUS = eINSTANCE.getUnaryMinus();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNARY_MINUS__TERM = eINSTANCE.getUnaryMinus_Term();

    /**
     * The meta object literal for the '{@link org.aiotml.xtext.aiotML.impl.ArrayIndexImpl <em>Array Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.aiotml.xtext.aiotML.impl.ArrayIndexImpl
     * @see org.aiotml.xtext.aiotML.impl.AiotMLPackageImpl#getArrayIndex()
     * @generated
     */
    EClass ARRAY_INDEX = eINSTANCE.getArrayIndex();

    /**
     * The meta object literal for the '<em><b>Array</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INDEX__ARRAY = eINSTANCE.getArrayIndex_Array();

    /**
     * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARRAY_INDEX__INDEX = eINSTANCE.getArrayIndex_Index();

  }

} //AiotMLPackage
