package org.aiotml.xtext.validation.checks;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.ConfigPropertyAssign;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.EnumerationLiteral;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.Literal;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyAssign;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.UnaryMinus;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.aiotml.xtext.validation.TypeChecker;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class PropertyInitialization extends AiotMLValidatorCheck {
  public Set<Property> getUninitializedProperties(final Thing t) {
    final HashSet<Property> props = CollectionLiterals.<Property>newHashSet();
    final Consumer<Property> _function = (Property prop) -> {
      Expression _init = prop.getInit();
      boolean _tripleEquals = (_init == null);
      if (_tripleEquals) {
        props.add(prop);
      }
    };
    t.getProperties().forEach(_function);
    final Consumer<Thing> _function_1 = (Thing inc) -> {
      props.addAll(this.getUninitializedProperties(inc));
    };
    t.getIncludes().forEach(_function_1);
    final Consumer<PropertyAssign> _function_2 = (PropertyAssign propAssign) -> {
      final Predicate<Property> _function_3 = (Property prop) -> {
        Property _property = propAssign.getProperty();
        return (prop == _property);
      };
      props.removeIf(_function_3);
    };
    t.getAssign().forEach(_function_2);
    return props;
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyAssign(final PropertyAssign pa) {
    if ((pa.getProperty().getTypeRef().isIsArray() && (!((pa.getIndex() != null) || (pa.getInit() instanceof ArrayInit))))) {
      String _name = pa.getProperty().getName();
      String _plus = ("Property " + _name);
      final String msg = (_plus + " is an array, and can only be assigned with an array initialiser, or indexed set statements.");
      EObject _eContainer = pa.eContainer();
      EObject _eContainer_1 = pa.eContainer();
      this.error(msg, ((Thing) _eContainer), AiotMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_1).getAssign().indexOf(pa));
      return;
    }
    if (((!pa.getProperty().getTypeRef().isIsArray()) && (pa.getIndex() != null))) {
      String _name_1 = pa.getProperty().getName();
      String _plus_1 = ("Property " + _name_1);
      final String msg_1 = (_plus_1 + " is not an array.");
      EObject _eContainer_2 = pa.eContainer();
      EObject _eContainer_3 = pa.eContainer();
      this.error(msg_1, ((Thing) _eContainer_2), AiotMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_3).getAssign().indexOf(pa));
      return;
    }
    final Type pt = TyperHelper.getBroadType(pa.getProperty().getTypeRef().getType());
    final Type vt = TypeChecker.computeTypeOf(pa.getInit());
    boolean _isA = TyperHelper.isA(vt, pt);
    boolean _not = (!_isA);
    if (_not) {
      String _name_2 = pt.getName();
      String _plus_2 = ("Wrong type. Expected " + _name_2);
      String _plus_3 = (_plus_2 + ". Found ");
      String _name_3 = vt.getName();
      final String msg_2 = (_plus_3 + _name_3);
      EObject _eContainer_4 = pa.eContainer();
      EObject _eContainer_5 = pa.eContainer();
      this.error(msg_2, ((Thing) _eContainer_4), AiotMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_5).getAssign().indexOf(pa));
    }
    Expression _index = pa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final Type indexT = TypeChecker.computeTypeOf(pa.getIndex());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPE);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _name_4 = indexT.getName();
        final String msg_3 = ("Index must be an integer. Found " + _name_4);
        EObject _eContainer_6 = pa.eContainer();
        EObject _eContainer_7 = pa.eContainer();
        this.error(msg_3, ((Thing) _eContainer_6), AiotMLPackage.eINSTANCE.getThing_Assign(), ((Thing) _eContainer_7).getAssign().indexOf(pa));
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyAssign(final ConfigPropertyAssign pa) {
    if ((pa.getProperty().getTypeRef().isIsArray() && (!((pa.getIndex() != null) || (pa.getInit() instanceof ArrayInit))))) {
      String _name = pa.getProperty().getName();
      String _plus = ("Property " + _name);
      final String msg = (_plus + " is an array, and can only be assigned with an array initialiser, or indexed set statements.");
      EObject _eContainer = pa.eContainer();
      EObject _eContainer_1 = pa.eContainer();
      this.error(msg, ((Configuration) _eContainer), AiotMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_1).getPropassigns().indexOf(pa));
      return;
    }
    if (((pa.getProperty().getTypeRef().getCardinality() == null) && (pa.getIndex() != null))) {
      String _name_1 = pa.getProperty().getName();
      String _plus_1 = ("Property " + _name_1);
      final String msg_1 = (_plus_1 + " is not an array.");
      EObject _eContainer_2 = pa.eContainer();
      EObject _eContainer_3 = pa.eContainer();
      this.error(msg_1, ((Configuration) _eContainer_2), AiotMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_3).getPropassigns().indexOf(pa));
      return;
    }
    final Type pt = TyperHelper.getBroadType(pa.getProperty().getTypeRef().getType());
    final Type vt = TypeChecker.computeTypeOf(pa.getInit());
    boolean _isA = TyperHelper.isA(vt, pt);
    boolean _not = (!_isA);
    if (_not) {
      String _name_2 = pt.getName();
      String _plus_2 = ("Wrong type. Expected " + _name_2);
      String _plus_3 = (_plus_2 + ". Found ");
      String _name_3 = vt.getName();
      final String msg_2 = (_plus_3 + _name_3);
      EObject _eContainer_4 = pa.eContainer();
      EObject _eContainer_5 = pa.eContainer();
      this.error(msg_2, ((Configuration) _eContainer_4), AiotMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_5).getPropassigns().indexOf(pa));
    }
    Expression _index = pa.getIndex();
    boolean _tripleNotEquals = (_index != null);
    if (_tripleNotEquals) {
      final Type indexT = TypeChecker.computeTypeOf(pa.getIndex());
      boolean _isA_1 = TyperHelper.isA(indexT, Types.INTEGER_TYPE);
      boolean _not_1 = (!_isA_1);
      if (_not_1) {
        String _name_4 = indexT.getName();
        final String msg_3 = ("Index must be an integer. Found " + _name_4);
        EObject _eContainer_6 = pa.eContainer();
        EObject _eContainer_7 = pa.eContainer();
        this.error(msg_3, ((Configuration) _eContainer_6), AiotMLPackage.eINSTANCE.getConfiguration_Propassigns(), ((Configuration) _eContainer_7).getPropassigns().indexOf(pa));
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkPropertyInitialization(final Configuration cfg) {
    final Procedure2<Instance, Integer> _function = (Instance inst, Integer i) -> {
      final Function1<Property, Boolean> _function_1 = (Property p) -> {
        return Boolean.valueOf(p.isReadonly());
      };
      final Set<Property> props = IterableExtensions.<Property>toSet(IterableExtensions.<Property>filter(this.getUninitializedProperties(inst.getType()), _function_1));
      final Consumer<ConfigPropertyAssign> _function_2 = (ConfigPropertyAssign propAssign) -> {
        final Predicate<Property> _function_3 = (Property prop) -> {
          Property _property = propAssign.getProperty();
          return (prop == _property);
        };
        props.removeIf(_function_3);
      };
      cfg.getPropassigns().forEach(_function_2);
      boolean _isEmpty = props.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Function1<Property, CharSequence> _function_3 = (Property it) -> {
          return it.getName();
        };
        final String msg = IterableExtensions.<Property>join(props, "Properties (", ", ", ") are not initialized", _function_3);
        this.error(msg, cfg, AiotMLPackage.eINSTANCE.getConfiguration_Instances(), (i).intValue(), "properties-not-initialized");
      }
    };
    IterableExtensions.<Instance>forEach(cfg.getInstances(), _function);
  }
  
  @Check(CheckType.FAST)
  public void checkArray(final Variable p) {
    Expression _cardinality = p.getTypeRef().getCardinality();
    boolean _tripleNotEquals = (_cardinality != null);
    if (_tripleNotEquals) {
      Expression _cardinality_1 = p.getTypeRef().getCardinality();
      if ((_cardinality_1 instanceof PropertyReference)) {
        Expression _cardinality_2 = p.getTypeRef().getCardinality();
        final Variable prop = ((PropertyReference) _cardinality_2).getProperty();
        boolean isReadonly = false;
        if ((prop instanceof Property)) {
          isReadonly = ((Property) prop).isReadonly();
        } else {
          if ((prop instanceof LocalVariable)) {
            isReadonly = ((LocalVariable) prop).isReadonly();
          }
        }
        if ((!isReadonly)) {
          String _name = prop.getName();
          String _plus = ("Array cardinality must be an integer literal or a read-only property/variable. Variable " + _name);
          final String msg = (_plus + " is not read-only.");
          this.error(msg, p, AiotMLPackage.eINSTANCE.getNamedElement_Name());
        }
        final Type actualType = TyperHelper.getBroadType(prop.getTypeRef().getType());
        boolean _isA = TyperHelper.isA(actualType, Types.INTEGER_TYPE);
        boolean _not = (!_isA);
        if (_not) {
          String _name_1 = prop.getName();
          String _plus_1 = ("Array cardinality must resolve to Integer. Property/Variable " + _name_1);
          String _plus_2 = (_plus_1 + " is ");
          String _name_2 = actualType.getName();
          String _plus_3 = (_plus_2 + _name_2);
          final String msg_1 = (_plus_3 + ".");
          this.error(msg_1, p, AiotMLPackage.eINSTANCE.getNamedElement_Name());
        }
      }
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEnumInitialization(final Enumeration e) {
    TypeRef _typeRef = e.getTypeRef();
    boolean _tripleNotEquals = (_typeRef != null);
    if (_tripleNotEquals) {
      final Function1<EnumerationLiteral, Boolean> _function = (EnumerationLiteral l) -> {
        Literal _init = l.getInit();
        return Boolean.valueOf((_init == null));
      };
      boolean _exists = IterableExtensions.<EnumerationLiteral>exists(e.getLiterals(), _function);
      if (_exists) {
        String _name = e.getName();
        String _plus = ("Enumeration " + _name);
        final String msg = (_plus + " is typed. All literals must be initialized.");
        AiotMLModel _findContainingModel = AiotMLHelpers.findContainingModel(e);
        this.error(msg, AiotMLHelpers.findContainingModel(e), AiotMLPackage.eINSTANCE.getAiotMLModel_Types(), ((AiotMLModel) _findContainingModel).getTypes().indexOf(e));
      }
      final Procedure2<EnumerationLiteral, Integer> _function_1 = (EnumerationLiteral l, Integer i) -> {
        Literal _init = l.getInit();
        boolean _tripleNotEquals_1 = (_init != null);
        if (_tripleNotEquals_1) {
          final Type litType = TypeChecker.computeTypeOf(l.getInit());
          boolean _isA = TyperHelper.isA(litType, e.getTypeRef().getType());
          boolean _not = (!_isA);
          if (_not) {
            String _name_1 = l.getName();
            String _plus_1 = ("Literal " + _name_1);
            String _plus_2 = (_plus_1 + " must be of type ");
            String _name_2 = TyperHelper.getBroadType(e.getTypeRef().getType()).getName();
            String _plus_3 = (_plus_2 + _name_2);
            String _plus_4 = (_plus_3 + ". Found ");
            String _name_3 = TyperHelper.getBroadType(litType).getName();
            final String msg_1 = (_plus_4 + _name_3);
            this.error(msg_1, e, AiotMLPackage.eINSTANCE.getEnumeration_Literals(), (i).intValue());
          }
        }
      };
      IterableExtensions.<EnumerationLiteral>forEach(e.getLiterals(), _function_1);
    }
  }
  
  @Check(CheckType.FAST)
  public void checkArrayInit(final ArrayInit ai) {
    final Procedure2<Expression, Integer> _function = (Expression e, Integer i) -> {
      boolean ok = false;
      if ((e instanceof Literal)) {
        ok = true;
      } else {
        if ((e instanceof PropertyReference)) {
          final PropertyReference pr = ((PropertyReference) e);
          Variable _property = pr.getProperty();
          if ((_property instanceof Property)) {
            Variable _property_1 = pr.getProperty();
            ok = ((Property) _property_1).isReadonly();
          } else {
            Variable _property_2 = pr.getProperty();
            if ((_property_2 instanceof LocalVariable)) {
              Variable _property_3 = pr.getProperty();
              ok = ((LocalVariable) _property_3).isReadonly();
            }
          }
        } else {
          if ((e instanceof UnaryMinus)) {
            final UnaryMinus um = ((UnaryMinus) e);
            Expression _term = um.getTerm();
            if ((_term instanceof Literal)) {
              ok = true;
            } else {
              Expression _term_1 = um.getTerm();
              if ((_term_1 instanceof PropertyReference)) {
                Expression _term_2 = um.getTerm();
                final PropertyReference pr_1 = ((PropertyReference) _term_2);
                Variable _property_4 = pr_1.getProperty();
                if ((_property_4 instanceof Property)) {
                  Variable _property_5 = pr_1.getProperty();
                  ok = ((Property) _property_5).isReadonly();
                } else {
                  Variable _property_6 = pr_1.getProperty();
                  if ((_property_6 instanceof LocalVariable)) {
                    Variable _property_7 = pr_1.getProperty();
                    ok = ((LocalVariable) _property_7).isReadonly();
                  }
                }
              }
            }
          }
        }
      }
      if ((!ok)) {
        final String msg = "Arrays can only be initialized with literals or references to read-only properties.";
        this.error(msg, ai, AiotMLPackage.eINSTANCE.getArrayInit_Values(), (i).intValue());
      } else {
        final Type et = TypeChecker.computeTypeOf(e);
        final EObject container = ai.eContainer();
        TypeRef typeref = null;
        if ((container instanceof Variable)) {
          final Variable v = ((Variable) container);
          typeref = v.getTypeRef();
        } else {
          if ((container instanceof PropertyAssign)) {
            final PropertyAssign pa = ((PropertyAssign) container);
            typeref = pa.getProperty().getTypeRef();
          } else {
            if ((container instanceof ConfigPropertyAssign)) {
              final ConfigPropertyAssign pa_1 = ((ConfigPropertyAssign) container);
              typeref = pa_1.getProperty().getTypeRef();
            }
          }
        }
        final Type t = TyperHelper.getBroadType(typeref.getType());
        boolean _isA = TyperHelper.isA(et, t);
        boolean _not = (!_isA);
        if (_not) {
          String _name = t.getName();
          String _plus = ("Wrong type. Expected " + _name);
          String _plus_1 = (_plus + ". Found ");
          String _name_1 = et.getName();
          final String msg_1 = (_plus_1 + _name_1);
          this.error(msg_1, ai, AiotMLPackage.eINSTANCE.getArrayInit_Values(), (i).intValue());
        }
      }
    };
    IterableExtensions.<Expression>forEach(ai.getValues(), _function);
  }
}
