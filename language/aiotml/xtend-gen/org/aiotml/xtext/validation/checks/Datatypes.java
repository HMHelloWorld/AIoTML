package org.aiotml.xtext.validation.checks;

import com.google.common.base.Objects;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class Datatypes extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkDatatypeUniqueness(final PrimitiveType t) {
    final AiotMLModel model = AiotMLHelpers.findContainingModel(t);
    final Function1<Type, Boolean> _function = (Type ty) -> {
      return Boolean.valueOf((((ty instanceof PrimitiveType) && (ty != t)) && Objects.equal(ty.getName(), t.getName())));
    };
    final Iterable<Type> duplicates = IterableExtensions.<Type>filter(AiotMLHelpers.allSimpleTypes(model), _function);
    int _size = IterableExtensions.size(duplicates);
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      String _name = t.getName();
      String _plus = ("Datatype " + _name);
      final String msg = (_plus + " is duplicated.");
      this.error(msg, model, AiotMLPackage.eINSTANCE.getAiotMLModel_Types(), model.getTypes().indexOf(t), "duplicate-datatype");
    }
  }
}
