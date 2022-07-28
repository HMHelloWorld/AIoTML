package org.aiotml.xtext.validation.checks;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Event;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.Transition;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class TransitionUsage extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkNonDeterministicTransition(final org.aiotml.xtext.aiotML.State s) {
    final Consumer<Transition> _function = (Transition t1) -> {
      final Consumer<Transition> _function_1 = (Transition t2) -> {
        if ((t1 != t2)) {
          if ((EcoreUtil.equals(t1.getEvent(), t2.getEvent()) && ((t1.getGuard() == null) || (t2.getGuard() == null)))) {
            String event = AiotMLElementHelper.getName(t1.getEvent());
            Event _event = t1.getEvent();
            if ((_event instanceof ReceiveMessage)) {
              Event _event_1 = t1.getEvent();
              final ReceiveMessage e = ((ReceiveMessage) _event_1);
              String _name = e.getPort().getName();
              String _plus = (_name + "?");
              String _name_1 = e.getMessage().getName();
              String _plus_1 = (_plus + _name_1);
              event = _plus_1;
            }
            final String msg = (("Non deterministic behaviour: Two transitions handling " + event) + 
              ", with at least one without a guard");
            this.error(msg, s, AiotMLPackage.eINSTANCE.getState_Outgoing(), s.getOutgoing().indexOf(t1), "nondeterministic-multiple-handlers");
          }
        }
      };
      s.getOutgoing().forEach(_function_1);
    };
    s.getOutgoing().forEach(_function);
  }
  
  @Check(CheckType.FAST)
  public void checkGreedyTransition(final org.aiotml.xtext.aiotML.State s) {
    final Function1<Transition, Boolean> _function = (Transition t) -> {
      return Boolean.valueOf(((t.getEvent() == null) && (t.getGuard() == null)));
    };
    final Transition t = IterableExtensions.<Transition>findFirst(s.getOutgoing(), _function);
    if (((t != null) && (s.getOutgoing().size() > 1))) {
      String _name = t.getTarget().getName();
      String _plus = ("Transition -> " + _name);
      final String msg = (_plus + 
        " with no guard and no event always takes precedence over all the other transitions");
      this.warning(msg, s, AiotMLPackage.eINSTANCE.getState_Outgoing(), s.getOutgoing().indexOf(t), "greedy-transition");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEmptyAutotransition(final Transition t) {
    final org.aiotml.xtext.aiotML.State source = AiotMLHelpers.findContainingState(t);
    if ((((t.getEvent() == null) && (t.getGuard() == null)) && Objects.equal(t.getTarget(), source))) {
      final String msg = "Self Transition without guard and without event. Will loop forever.";
      EObject _eContainer = t.eContainer();
      this.error(msg, t.eContainer(), AiotMLPackage.eINSTANCE.getState_Outgoing(), ((org.aiotml.xtext.aiotML.State) _eContainer).getInternal().indexOf(t), "self-transition-loop");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkEmptyInternal(final InternalTransition t) {
    if (((t.getEvent() == null) && (t.getGuard() == null))) {
      final String msg = "Internal Transition without guard and without event. Will loop forever.";
      EObject _eContainer = t.eContainer();
      this.error(msg, t.eContainer(), AiotMLPackage.eINSTANCE.getState_Internal(), ((org.aiotml.xtext.aiotML.State) _eContainer).getInternal().indexOf(t), "internal-transition-loop");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkInternalWithoutAction(final InternalTransition t) {
    Action _action = t.getAction();
    boolean _tripleEquals = (_action == null);
    if (_tripleEquals) {
      final String msg = "Internal Transition without action, consider removing.";
      EObject _eContainer = t.eContainer();
      this.warning(msg, t.eContainer(), AiotMLPackage.eINSTANCE.getState_Internal(), ((org.aiotml.xtext.aiotML.State) _eContainer).getInternal().indexOf(t), "internal-transition-no-action");
    }
  }
}
