package org.aiotml.xtext.validation.checks;

import java.util.HashSet;
import java.util.List;
import java.util.function.Consumer;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.aiotml.xtext.validation.Tarjan;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class AutotransitionCycles extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkAutotransitionCycles(final StateContainer c) {
    final HashSet<org.aiotml.xtext.aiotML.State> verts = CollectionLiterals.<org.aiotml.xtext.aiotML.State>newHashSet();
    verts.addAll(c.getSubstate());
    final Tarjan<org.aiotml.xtext.aiotML.State> tarjan = new Tarjan<org.aiotml.xtext.aiotML.State>(null, verts);
    final List<List<org.aiotml.xtext.aiotML.State>> cycles = tarjan.findStronglyConnectedComponents();
    final Consumer<List<org.aiotml.xtext.aiotML.State>> _function = (List<org.aiotml.xtext.aiotML.State> cycle) -> {
      if (((cycle != null) && (cycle.size() > 1))) {
        final Function1<org.aiotml.xtext.aiotML.State, CharSequence> _function_1 = (org.aiotml.xtext.aiotML.State it) -> {
          return it.getName();
        };
        final String msg = IterableExtensions.<org.aiotml.xtext.aiotML.State>join(cycle, "Auto transition cycle: (", ", ", ")", _function_1);
        final Consumer<org.aiotml.xtext.aiotML.State> _function_2 = (org.aiotml.xtext.aiotML.State state) -> {
          this.error(msg, c, AiotMLPackage.eINSTANCE.getStateContainer_Substate(), c.getSubstate().indexOf(state), "autotransition-cycle");
        };
        cycle.forEach(_function_2);
      }
    };
    cycles.forEach(_function);
  }
}
