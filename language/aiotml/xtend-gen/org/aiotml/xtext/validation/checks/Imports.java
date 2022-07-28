package org.aiotml.xtext.validation.checks;

import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Import;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class Imports extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkImports(final AiotMLModel model) {
    final Procedure2<Import, Integer> _function = (Import imp, Integer i) -> {
      try {
        AiotMLHelpers.getModelFromRelativeURI(AiotMLHelpers.findContainingModel(imp), imp.getImportURI(), imp.getFrom());
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          this.error(e.getMessage(), model, AiotMLPackage.eINSTANCE.getAiotMLModel_Imports(), (i).intValue());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    };
    IterableExtensions.<Import>forEach(model.getImports(), _function);
  }
}
