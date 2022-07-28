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

import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.VariableAssignment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl#getIndex <em>Index</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl#getExtraProperty <em>Extra Property</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl#getExtraIndex <em>Extra Index</em>}</li>
 *   <li>{@link org.aiotml.xtext.aiotML.impl.VariableAssignmentImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableAssignmentImpl extends ActionImpl implements VariableAssignment
{
  /**
   * The cached value of the '{@link #getProperty() <em>Property</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperty()
   * @generated
   * @ordered
   */
  protected Variable property;

  /**
   * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIndex()
   * @generated
   * @ordered
   */
  protected Expression index;

  /**
   * The cached value of the '{@link #getExtraProperty() <em>Extra Property</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraProperty()
   * @generated
   * @ordered
   */
  protected EList<Variable> extraProperty;

  /**
   * The cached value of the '{@link #getExtraIndex() <em>Extra Index</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExtraIndex()
   * @generated
   * @ordered
   */
  protected EList<Expression> extraIndex;

  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected Expression expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableAssignmentImpl()
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
    return AiotMLPackage.Literals.VARIABLE_ASSIGNMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Variable getProperty()
  {
    if (property != null && property.eIsProxy())
    {
      InternalEObject oldProperty = (InternalEObject)property;
      property = (Variable)eResolveProxy(oldProperty);
      if (property != oldProperty)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY, oldProperty, property));
      }
    }
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Variable basicGetProperty()
  {
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProperty(Variable newProperty)
  {
    Variable oldProperty = property;
    property = newProperty;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY, oldProperty, property));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getIndex()
  {
    return index;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs)
  {
    Expression oldIndex = index;
    index = newIndex;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX, oldIndex, newIndex);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIndex(Expression newIndex)
  {
    if (newIndex != index)
    {
      NotificationChain msgs = null;
      if (index != null)
        msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX, null, msgs);
      if (newIndex != null)
        msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX, null, msgs);
      msgs = basicSetIndex(newIndex, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX, newIndex, newIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Variable> getExtraProperty()
  {
    if (extraProperty == null)
    {
      extraProperty = new EObjectResolvingEList<Variable>(Variable.class, this, AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_PROPERTY);
    }
    return extraProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Expression> getExtraIndex()
  {
    if (extraIndex == null)
    {
      extraIndex = new EObjectContainmentEList<Expression>(Expression.class, this, AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX);
    }
    return extraIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
  {
    Expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setExpression(Expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION, newExpression, newExpression));
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
      case AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX:
        return basicSetIndex(null, msgs);
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX:
        return ((InternalEList<?>)getExtraIndex()).basicRemove(otherEnd, msgs);
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
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
      case AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
        if (resolve) return getProperty();
        return basicGetProperty();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX:
        return getIndex();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_PROPERTY:
        return getExtraProperty();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX:
        return getExtraIndex();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
        return getExpression();
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
      case AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
        setProperty((Variable)newValue);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX:
        setIndex((Expression)newValue);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_PROPERTY:
        getExtraProperty().clear();
        getExtraProperty().addAll((Collection<? extends Variable>)newValue);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX:
        getExtraIndex().clear();
        getExtraIndex().addAll((Collection<? extends Expression>)newValue);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
        setExpression((Expression)newValue);
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
      case AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
        setProperty((Variable)null);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX:
        setIndex((Expression)null);
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_PROPERTY:
        getExtraProperty().clear();
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX:
        getExtraIndex().clear();
        return;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
        setExpression((Expression)null);
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
      case AiotMLPackage.VARIABLE_ASSIGNMENT__PROPERTY:
        return property != null;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__INDEX:
        return index != null;
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_PROPERTY:
        return extraProperty != null && !extraProperty.isEmpty();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXTRA_INDEX:
        return extraIndex != null && !extraIndex.isEmpty();
      case AiotMLPackage.VARIABLE_ASSIGNMENT__EXPRESSION:
        return expression != null;
    }
    return super.eIsSet(featureID);
  }

} //VariableAssignmentImpl
