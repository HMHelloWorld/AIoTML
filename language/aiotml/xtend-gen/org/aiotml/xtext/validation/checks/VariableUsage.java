package org.aiotml.xtext.validation.checks;

import java.util.List;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.CastExpression;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ForAction;
import org.aiotml.xtext.aiotML.Literal;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.VariableAssignment;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.aiotml.xtext.validation.TypeChecker;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class VariableUsage extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkFor(final ForAction fa) {
    Expression _cardinality = fa.getArray().getProperty().getTypeRef().getCardinality();
    boolean _tripleEquals = (_cardinality == null);
    if (_tripleEquals) {
      return;
    }
    final Type vt = TyperHelper.getBroadType(fa.getVariable().getTypeRef().getType());
    final Type arrayType = TyperHelper.getBroadType(fa.getArray().getProperty().getTypeRef().getType());
    boolean _isA = TyperHelper.isA(arrayType, vt);
    boolean _not = (!_isA);
    if (_not) {
      String _name = fa.getVariable().getName();
      String _plus = ("Variable " + _name);
      String _plus_1 = (_plus + " should be ");
      String _name_1 = arrayType.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + ". Found ");
      String _name_2 = vt.getName();
      final String msg = (_plus_3 + _name_2);
      this.error(msg, fa, AiotMLPackage.eINSTANCE.getForAction_Variable());
    }
    Parameter _index = fa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final Type indexT = TyperHelper.getBroadType(fa.getIndex().getTypeRef().getType());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPE);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _name_3 = fa.getIndex().getName();
        String _plus_4 = ("Variable " + _name_3);
        String _plus_5 = (_plus_4 + " should be Integer. Found ");
        String _name_4 = indexT.getName();
        String _plus_6 = (_plus_5 + _name_4);
        final String msg_1 = (_plus_6 + ".");
        this.error(msg_1, fa, AiotMLPackage.eINSTANCE.getForAction_Index());
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkCast(final CastExpression cast) {
    final Type actual = TypeChecker.computeTypeOf(cast.getTerm());
    boolean _isA = TyperHelper.isA(actual, cast.getType());
    boolean _not = (!_isA);
    if (_not) {
      String _name = actual.getName();
      String _plus = ("Cannot cast " + _name);
      String _plus_1 = (_plus + " to ");
      String _name_1 = cast.getType().getName();
      final String msg = (_plus_1 + _name_1);
      final Object parent = cast.eContainer().eGet(cast.eContainingFeature());
      if ((parent instanceof EList)) {
        this.error(msg, cast.eContainer(), cast.eContainingFeature(), ((EList<Action>) parent).indexOf(cast), "type");
      } else {
        this.error(msg, cast.eContainer(), cast.eContainingFeature(), "type");
      }
    }
  }
  
  public void checkType(final Variable va, final Expression e, final EObject o, final EStructuralFeature f) {
    Expression _cardinality = va.getTypeRef().getCardinality();
    boolean _tripleEquals = (_cardinality == null);
    if (_tripleEquals) {
      final Type expected = TyperHelper.getBroadType(va.getTypeRef().getType());
      final Type actual = TypeChecker.computeTypeOf(e);
      if ((actual != null)) {
        final Type broad = TyperHelper.getBroadType(actual);
        final Thing t = AiotMLHelpers.findContainingThing(va);
        final boolean ignore = (AnnotatedElementHelper.isDefined(t, "ignore", "type-warning") || AnnotatedElementHelper.isDefined(va, "ignore", "type-warning"));
        boolean _equals = actual.equals(Types.ERROR_TYPE);
        if (_equals) {
          String _name = va.getName();
          String _plus = ("Property " + _name);
          String _plus_1 = (_plus + " is assigned with an erroneous value/expression. Expected ");
          String _name_1 = expected.getName();
          String _plus_2 = (_plus_1 + _name_1);
          String _plus_3 = (_plus_2 + ", assigned with ");
          String _name_2 = broad.getName();
          final String msg = (_plus_3 + _name_2);
          this.error(msg, o, f, "type");
        } else {
          if (((!ignore) && actual.equals(Types.ANY_TYPE))) {
            String _name_3 = va.getName();
            String _plus_4 = ("Property " + _name_3);
            final String msg_1 = (_plus_4 + " is assigned with a value/expression which cannot be typed. Consider using a cast (<exp> as <Type>), or use @ignore \"type-warning\"");
            this.warning(msg_1, o, f, "type-cast", va.getTypeRef().getType().getName());
          } else {
            boolean _isA = TyperHelper.isA(actual, expected);
            boolean _not = (!_isA);
            if (_not) {
              String _name_4 = va.getName();
              String _plus_5 = ("Property " + _name_4);
              String _plus_6 = (_plus_5 + " is assigned with an erroneous value/expression. Expected ");
              String _name_5 = expected.getName();
              String _plus_7 = (_plus_6 + _name_5);
              String _plus_8 = (_plus_7 + ", assigned with ");
              String _name_6 = broad.getName();
              final String msg_2 = (_plus_8 + _name_6);
              this.error(msg_2, o, f, "type");
            }
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkVariableAssignment(final VariableAssignment va) {
    Expression _cardinality = va.getProperty().getTypeRef().getCardinality();
    boolean _tripleEquals = (_cardinality == null);
    if (_tripleEquals) {
      boolean _xifexpression = false;
      Variable _property = va.getProperty();
      if ((_property instanceof Property)) {
        Variable _property_1 = va.getProperty();
        _xifexpression = ((Property) _property_1).isReadonly();
      } else {
        boolean _xifexpression_1 = false;
        Variable _property_2 = va.getProperty();
        if ((_property_2 instanceof LocalVariable)) {
          Variable _property_3 = va.getProperty();
          _xifexpression_1 = ((LocalVariable) _property_3).isReadonly();
        } else {
          _xifexpression_1 = false;
        }
        _xifexpression = _xifexpression_1;
      }
      final boolean readOnly = _xifexpression;
      if (readOnly) {
        String _name = va.getProperty().getName();
        final String msg = ("Assigning read-only variable " + _name);
        final Object parent = va.eContainer().eGet(va.eContainingFeature());
        if ((parent instanceof EList)) {
          this.error(msg, va.eContainer(), va.eContainingFeature(), ((EList<Action>) parent).indexOf(va), "property-assign-readonly");
        } else {
          this.error(msg, va.eContainer(), va.eContainingFeature(), "property-assign-readonly");
        }
      }
    }
    this.checkType(va.getProperty(), va.getExpression(), va, AiotMLPackage.eINSTANCE.getVariableAssignment_Expression());
  }
  
  @Check(CheckType.FAST)
  public void checkLocalVariable(final LocalVariable v) {
    if ((v.isReadonly() && (v.getInit() == null))) {
      String _name = v.getName();
      String _plus = ("Readonly local variable " + _name);
      final String msg = (_plus + " must be initialized on declaration");
      final Object parent = v.eContainer().eGet(v.eContainingFeature());
      if ((parent instanceof EList)) {
        this.error(msg, v.eContainer(), v.eContainingFeature(), ((EList<Action>) parent).indexOf(v), "readonly-not-init");
      } else {
        this.error(msg, v.eContainer(), v.eContainingFeature(), "readonly-not-init");
      }
    }
    Expression _init = v.getInit();
    boolean _tripleNotEquals = (_init != null);
    if (_tripleNotEquals) {
      this.checkType(v, v.getInit(), v, AiotMLPackage.eINSTANCE.getLocalVariable_Init());
    }
    Expression _cardinality = v.getTypeRef().getCardinality();
    boolean _tripleNotEquals_1 = (_cardinality != null);
    if (_tripleNotEquals_1) {
      Expression _init_1 = v.getInit();
      boolean _tripleNotEquals_2 = (_init_1 != null);
      if (_tripleNotEquals_2) {
        final String msg_1 = "Arrays can only be assigned from an array initializers {...} or from another array.";
        final Expression i = v.getInit();
        if ((i instanceof ArrayInit)) {
          return;
        }
        if ((i instanceof Literal)) {
          this.error(msg_1, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
        }
        if ((i instanceof PropertyReference)) {
          final PropertyReference pr = ((PropertyReference) i);
          Expression _cardinality_1 = pr.getProperty().getTypeRef().getCardinality();
          boolean _tripleEquals = (_cardinality_1 == null);
          if (_tripleEquals) {
            this.error(msg_1, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkProperty(final Property v) {
    final Object parent = v.eContainer().eGet(v.eContainingFeature());
    Expression _init = v.getInit();
    boolean _tripleNotEquals = (_init != null);
    if (_tripleNotEquals) {
      this.checkType(v, v.getInit(), v, AiotMLPackage.eINSTANCE.getProperty_Init());
    }
    Expression _cardinality = v.getTypeRef().getCardinality();
    boolean _tripleNotEquals_1 = (_cardinality != null);
    if (_tripleNotEquals_1) {
      Expression _init_1 = v.getInit();
      boolean _tripleNotEquals_2 = (_init_1 != null);
      if (_tripleNotEquals_2) {
        final String msg = "Arrays can only be assigned from an array initializers {...} or from another array.";
        final Expression i = v.getInit();
        if ((i instanceof ArrayInit)) {
          return;
        }
        if ((i instanceof Literal)) {
          if ((parent instanceof EList)) {
            this.error(msg, v.eContainer(), v.eContainingFeature(), ((EList<Action>) parent).indexOf(v), "array-wrong-assign");
          } else {
            this.error(msg, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
          }
        }
        if ((i instanceof PropertyReference)) {
          final PropertyReference pr = ((PropertyReference) i);
          Expression _cardinality_1 = pr.getProperty().getTypeRef().getCardinality();
          boolean _tripleEquals = (_cardinality_1 == null);
          if (_tripleEquals) {
            if ((parent instanceof EList)) {
              this.error(msg, v.eContainer(), v.eContainingFeature(), ((EList<Action>) parent).indexOf(v), "array-wrong-assign");
            } else {
              this.error(msg, v.eContainer(), v.eContainingFeature(), "array-wrong-assign");
            }
          }
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyUsage(final Thing thing) {
    boolean _isFragment = thing.isFragment();
    if (_isFragment) {
      return;
    }
    final List<Property> usedProperties = ThingHelper.allUsedProperties(thing);
    final Function1<Property, Boolean> _function = (Property p) -> {
      boolean _isDefined = AnnotatedElementHelper.isDefined(p, "ignore", "not-used");
      return Boolean.valueOf((!_isDefined));
    };
    final Procedure2<Property, Integer> _function_1 = (Property p, Integer i) -> {
      final boolean isUsed = usedProperties.contains(p);
      if ((!isUsed)) {
        String _name = p.getName();
        String _plus = ("Property " + _name);
        String _plus_1 = (_plus + " of Thing ");
        String _name_1 = thing.getName();
        String _plus_2 = (_plus_1 + _name_1);
        final String msg = (_plus_2 + " is never used. Consider removing (or using) it, or use @ignore \"not-used\".");
        this.warning(msg, p, AiotMLPackage.eINSTANCE.getNamedElement_Name(), "property-not-used");
      }
    };
    IterableExtensions.<Property>forEach(IterableExtensions.<Property>filter(ThingHelper.allPropertiesInDepth(thing), _function), _function_1);
  }
}
