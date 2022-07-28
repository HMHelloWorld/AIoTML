/**
 * generated by Xtext 2.10.0
 */
package org.aiotml.xtext.ui.contentassist;

import com.google.common.base.Objects;
import java.util.function.Consumer;
import org.aiotml.annotations.AnnotationRegistry;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.ui.contentassist.AbstractAiotMLProposalProvider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class AiotMLProposalProvider extends AbstractAiotMLProposalProvider {
  @Override
  public void completePlatformAnnotation_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    InputOutput.<String>println("completePlatformAnnotation_Name");
    super.completePlatformAnnotation_Name(model, assignment, context, acceptor);
    final Consumer<String> _function = (String a) -> {
      final String proposal = (("@" + a) + " \"...\"");
      acceptor.accept(this.createCompletionProposal(proposal, context));
    };
    AnnotationRegistry.availableAnnotations(model).forEach(_function);
  }
  
  public void completeActionAndExpression(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Thing thing = AiotMLHelpers.findContainingThing(model);
    boolean _notEquals = (!Objects.equal(thing, null));
    if (_notEquals) {
      final Consumer<Property> _function = (Property p) -> {
        final String proposal = p.getName();
        acceptor.accept(this.createCompletionProposal(proposal, context));
      };
      AiotMLHelpers.allProperties(thing).forEach(_function);
      final Consumer<Function> _function_1 = (Function f) -> {
        final String proposal = f.getName();
        acceptor.accept(this.createCompletionProposal(proposal, context));
      };
      AiotMLHelpers.allFunctions(thing).forEach(_function_1);
    }
    final State state = AiotMLHelpers.findContainingState(model);
    boolean _notEquals_1 = (!Objects.equal(state, null));
    if (_notEquals_1) {
      final Consumer<Property> _function_2 = (Property p) -> {
        final String proposal = p.getName();
        acceptor.accept(this.createCompletionProposal(proposal, context));
      };
      AiotMLHelpers.allProperties(state).forEach(_function_2);
    }
  }
  
  @Override
  public void complete_Expression(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeActionAndExpression(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_Action(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.completeActionAndExpression(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void completeThing_Messages(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeThing_Messages(model, assignment, context, acceptor);
    final String proposal0 = "message m()";
    final String proposal = "message m(...)";
    acceptor.accept(this.createCompletionProposal(proposal0, context));
    acceptor.accept(this.createCompletionProposal(proposal, context));
  }
  
  @Override
  public void completeThing_Properties(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeThing_Properties(model, assignment, context, acceptor);
    final String proposal0 = "property p : ";
    final String proposal = "readonly property p : ";
    acceptor.accept(this.createCompletionProposal(proposal0, context));
    acceptor.accept(this.createCompletionProposal(proposal, context));
  }
  
  @Override
  public void complete_PrimitiveType(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_PrimitiveType(model, ruleCall, context, acceptor);
    final String proposal0 = "datatype MyType<size>";
    acceptor.accept(this.createCompletionProposal(proposal0, context));
  }
  
  @Override
  public void complete_FunctionCallStatement(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final Consumer<Function> _function = (Function it) -> {
      String _name = it.getName();
      String proposal = (_name + "(");
      String _proposal = proposal;
      final Function1<Parameter, String> _function_1 = (Parameter it_1) -> {
        String _name_1 = it_1.getName();
        String _plus = (_name_1 + " as ");
        String _name_2 = it_1.getTypeRef().getType().getName();
        return (_plus + _name_2);
      };
      String _join = IterableExtensions.join(ListExtensions.<Parameter, String>map(it.getParameters(), _function_1), ", ");
      proposal = (_proposal + _join);
      String _proposal_1 = proposal;
      proposal = (_proposal_1 + ")");
      acceptor.accept(this.createCompletionProposal(proposal, context));
    };
    AiotMLHelpers.allFunctions(AiotMLHelpers.findContainingThing(model)).forEach(_function);
  }
  
  @Override
  public void complete_FunctionCallExpression(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    this.complete_FunctionCallStatement(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_SendAction(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_SendAction(model, ruleCall, context, acceptor);
    final Consumer<Port> _function = (Port it) -> {
      final Port port = it;
      final Consumer<Message> _function_1 = (Message it_1) -> {
        String _name = port.getName();
        String proposal = (_name + "!");
        String _proposal = proposal;
        String _name_1 = it_1.getName();
        String _plus = (_name_1 + "(");
        proposal = (_proposal + _plus);
        String _proposal_1 = proposal;
        final Function1<Parameter, String> _function_2 = (Parameter it_2) -> {
          String _name_2 = it_2.getName();
          String _plus_1 = (_name_2 + " as ");
          String _name_3 = it_2.getTypeRef().getType().getName();
          return (_plus_1 + _name_3);
        };
        String _join = IterableExtensions.join(ListExtensions.<Parameter, String>map(it_1.getParameters(), _function_2), ", ");
        proposal = (_proposal_1 + _join);
        String _proposal_2 = proposal;
        proposal = (_proposal_2 + ")");
        acceptor.accept(this.createCompletionProposal(proposal, context));
      };
      it.getSends().forEach(_function_1);
    };
    AiotMLHelpers.allPorts(AiotMLHelpers.findContainingThing(model)).forEach(_function);
  }
}
