package org.aiotml.xtext.validation.checks;

import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ConditionalAction;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.LoopAction;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.constraints.Types;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.TyperHelper;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.aiotml.xtext.validation.TypeChecker;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;

@SuppressWarnings("all")
public class ControlStructures extends AiotMLValidatorCheck {
  public void checkActionExpression(final Action a, final Expression e) {
    final Type actual = TypeChecker.computeTypeOf(e);
    boolean _equals = actual.equals(Types.BOOLEAN_TYPE);
    if (_equals) {
      return;
    }
    final Thing t = AiotMLHelpers.findContainingThing(a);
    if (((!AnnotatedElementHelper.isDefined(t, "ignore", "type-warning")) && actual.equals(Types.ANY_TYPE))) {
      int _size = AiotMLHelpers.<ExternExpression>getAllExpressions(e, ExternExpression.class).size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        this.warning("Condition involving extern expressions cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature(), "type");
      } else {
        this.warning("Condition cannot be typed as Boolean. Consider using a cast, or use @ignore \"type-warning\" on the containing thing.", a, e.eContainingFeature(), "type-cast", "Boolean");
      }
    } else {
      String _name = TyperHelper.getBroadType(actual).getName();
      String _plus = ("Condition is not a Boolean (" + _name);
      String _plus_1 = (_plus + ")");
      this.error(_plus_1, a, e.eContainingFeature(), "type");
    }
  }
  
  @Check(CheckType.FAST)
  public void checkConditionalAction(final ConditionalAction ca) {
    this.checkActionExpression(ca, ca.getCondition());
  }
  
  @Check(CheckType.FAST)
  public void checkLoopAction(final LoopAction la) {
    this.checkActionExpression(la, la.getCondition());
  }
}
