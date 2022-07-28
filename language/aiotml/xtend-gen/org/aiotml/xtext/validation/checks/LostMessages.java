package org.aiotml.xtext.validation.checks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.function.Consumer;
import org.aiotml.xtext.aiotML.AbstractConnector;
import org.aiotml.xtext.aiotML.AiotMLPackage;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Connector;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.InternalPort;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.RequiredPort;
import org.aiotml.xtext.validation.AiotMLValidatorCheck;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;

@SuppressWarnings("all")
public class LostMessages extends AiotMLValidatorCheck {
  @Check(CheckType.FAST)
  public void checkLostMessages(final Configuration cfg) {
    final Procedure2<Instance, Integer> _function = (Instance inst, Integer i) -> {
      final ArrayList<CharSequence> notReceived = CollectionLiterals.<CharSequence>newArrayList();
      final ArrayList<CharSequence> sentNotReceived = CollectionLiterals.<CharSequence>newArrayList();
      final Function1<Port, Boolean> _function_1 = (Port port) -> {
        return Boolean.valueOf((!(port instanceof InternalPort)));
      };
      final Consumer<Port> _function_2 = (Port port) -> {
        final Function1<AbstractConnector, Boolean> _function_3 = (AbstractConnector con) -> {
          return Boolean.valueOf((((con instanceof ExternalConnector) && (((ExternalConnector) con).getInst() == inst)) && (((ExternalConnector) con).getPort() == port)));
        };
        boolean _exists = IterableExtensions.<AbstractConnector>exists(cfg.getConnectors(), _function_3);
        if (_exists) {
          return;
        }
        final HashSet<Message> incoming = CollectionLiterals.<Message>newHashSet();
        final HashSet<Message> outgoing = CollectionLiterals.<Message>newHashSet();
        final Consumer<AbstractConnector> _function_4 = (AbstractConnector connector) -> {
          if ((connector instanceof Connector)) {
            final Connector con = ((Connector) connector);
            if ((port instanceof RequiredPort)) {
              if (((con.getCli() == inst) && (con.getRequired() == port))) {
                incoming.addAll(con.getProvided().getSends());
                outgoing.addAll(con.getProvided().getReceives());
              }
            } else {
              if (((con.getSrv() == inst) && (con.getProvided() == port))) {
                incoming.addAll(con.getRequired().getSends());
                outgoing.addAll(con.getRequired().getReceives());
              }
            }
          }
        };
        cfg.getConnectors().forEach(_function_4);
        final Consumer<Message> _function_5 = (Message msg) -> {
          boolean _contains = incoming.contains(msg);
          boolean _not = (!_contains);
          if (_not) {
            String _name = port.getName();
            String _plus = (_name + ".");
            String _name_1 = msg.getName();
            String _plus_1 = (_plus + _name_1);
            notReceived.add(_plus_1);
          }
        };
        port.getReceives().forEach(_function_5);
        final Consumer<Message> _function_6 = (Message msg) -> {
          boolean _contains = outgoing.contains(msg);
          boolean _not = (!_contains);
          if (_not) {
            String _name = port.getName();
            String _plus = (_name + ".");
            String _name_1 = msg.getName();
            String _plus_1 = (_plus + _name_1);
            sentNotReceived.add(_plus_1);
          }
        };
        port.getSends().forEach(_function_6);
      };
      IterableExtensions.<Port>filter(inst.getType().getPorts(), _function_1).forEach(_function_2);
      boolean _isEmpty = notReceived.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final Function1<CharSequence, CharSequence> _function_3 = (CharSequence it) -> {
          return it;
        };
        final String msg = IterableExtensions.<CharSequence>join(notReceived, "Messages (", ", ", ") are never received by other instances", _function_3);
        this.info(msg, cfg, AiotMLPackage.eINSTANCE.getConfiguration_Instances(), (i).intValue(), "messages-not-received");
      }
      boolean _isEmpty_1 = sentNotReceived.isEmpty();
      boolean _not_1 = (!_isEmpty_1);
      if (_not_1) {
        final Function1<CharSequence, CharSequence> _function_4 = (CharSequence it) -> {
          return it;
        };
        final String msg_1 = IterableExtensions.<CharSequence>join(sentNotReceived, "Messages (", ", ", ") are sent but never received by other instances", _function_4);
        this.info(msg_1, cfg, AiotMLPackage.eINSTANCE.getConfiguration_Instances(), (i).intValue(), "messages-not-used");
      }
    };
    IterableExtensions.<Instance>forEach(cfg.getInstances(), _function);
  }
}
