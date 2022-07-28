/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 */
package org.aiotml.testing.tests.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.xtext.EcoreUtil2;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.aiotML.AbstractConnector;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.BooleanLiteral;
import org.aiotml.xtext.aiotML.CharLiteral;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.ConditionalAction;
import org.aiotml.xtext.aiotML.ConfigPropertyAssign;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Connector;
import org.aiotml.xtext.aiotML.ExternExpression;
import org.aiotml.xtext.aiotML.ExternalConnector;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.NotExpression;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.ProvidedPort;
import org.aiotml.xtext.aiotML.ReceiveMessage;
import org.aiotml.xtext.aiotML.RequiredPort;
import org.aiotml.xtext.aiotML.SendAction;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.StringLiteral;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.TypeRef;
import org.aiotml.xtext.aiotML.VariableAssignment;

public class GeneralTestHelper {
	AiotMLModel model;
	Configuration config;
	
	Thing testFragment;
	RequiredPort testPort;
	
	Thing testMsgs;
	Message testIn;
	Message testOut;
	Message testFailure;
	Message testDone;
	
	Thing fileDumper;
	Property fileDumpPath;
	
	Thing testHarness;
	ActionBlock testHarnessSendCharsEntry;
	
	Thing synchronizer;
	State synchronizerListen;
	Function synchronizerCheckCoompleted;
	
	PrimitiveType boolType;
	
	Collection<InputOutputWrapper> inputOutputs;
	
	public GeneralTestHelper(AiotMLModel testModel) throws AssertionError {
		model = testModel;
		
		// Make sure that there is just a single configuration, or make one if it is empty
		Collection<Configuration> configs = AiotMLHelpers.allConfigurations(model);
		if (configs.size() > 1) throw new AssertionError("Model has more than one configuration");
		else if (configs.size() == 1) config = configs.iterator().next();
		else {
			config = AiotMLFactory.eINSTANCE.createConfiguration();
			model.getConfigs().add(config);
		}
		config.setName("testconfiguration_generated");
		
		// Find references to the model that are useful for later
		testFragment = findThing("Test");
		testPort = findRequiredPort(testFragment, "Test");
		
		testMsgs = findThing("TestMsgs");
		testIn = findMessage(testMsgs, "In");
		testOut = findMessage(testMsgs, "Out");
		testFailure = findMessage(testMsgs, "Failure");
		testDone = findMessage(testMsgs, "Done");
		
		fileDumper = findThing("FileDumper");
		fileDumpPath = findProperty(fileDumper, "DumpPath");
		
		testHarness = findThing("TestHarness");
		testHarnessSendCharsEntry = findEntryBlock(findState(testHarness, "Chars"));
		
		synchronizer = findThing("Synchronizer");
		synchronizerListen = findState(synchronizer, "Listen");
		synchronizerCheckCoompleted = findFunction(synchronizer, "CheckCompleted");
		
		boolType = findPrimitiveType("Boolean");
		
		inputOutputs = new ArrayList<InputOutputWrapper>();
	}
	
	/* --- Model manipulation methods --- */
	public Collection<GeneralTestInputOutput> getAllInputOutputs() {
		Collection<GeneralTestInputOutput> result = new ArrayList<GeneralTestInputOutput>();
		inputOutputs.clear();
		
		for (Thing thing : allTestThings()) {
			String typeName = thing.getName();
			int dumpCounter = 1;
			
			for (String testAnnotation : AnnotatedElementHelper.annotation(thing, "test")) {
				GeneralTestInputOutput res = GeneralTestInputOutput.create(thing, testAnnotation, typeName+"_"+dumpCounter);
				if (res != null) {
					result.add(res);
					inputOutputs.add(new InputOutputWrapper(thing, res));
					dumpCounter++;
				}
			}
		}		
		
		return result;
	}
	
	public void addTestThingInstances() throws AssertionError {
		Map<Thing, Instance> firstInstances = new HashMap<Thing, Instance>();
		Map<Instance, Integer> copyCounters = new HashMap<Instance, Integer>();
		Collection<Instance> generatedInstances = new ArrayList<Instance>();
		int generatedCounter = 1;
		
		Collection<Instance> existing = allTestInstances();
		
		for (InputOutputWrapper wrapped : inputOutputs) {			
			// Check if we have already found a first instance of this Thing type
			if (firstInstances.containsKey(wrapped.type)) {
				// If so, we make a copy of the first one
				Instance original = firstInstances.get(wrapped.type);
				Instance newinst = AiotMLFactory.eINSTANCE.createInstance();
				newinst.setName(original.getName()+"_copy"+copyCounters.get(original));
				newinst.setType(wrapped.type);
				config.getInstances().add(newinst);
				copyInstanceConfiguration(original, newinst);
				wrapped.instance = newinst;
				generatedInstances.add(newinst);
				copyCounters.put(original, copyCounters.get(original)+1);
				
			} else {
				// If not, check if the configuration already contains one - that is if it was put there manually
				Collection<Instance> already = instancesOf(existing, wrapped.type);
				if (!already.isEmpty()) {
					// There can only by exactly one - how else would we know where to send the input?
					if (already.size() > 1) throw new AssertionError("There is more than one instance of thing '"+wrapped.type.getName()+"' in the configuration");
					
					wrapped.instance = already.iterator().next();
					firstInstances.put(wrapped.type, wrapped.instance);
					copyCounters.put(wrapped.instance, 1);
				}
				// If nothing was found, we create a plain instance ourself
				else {
					wrapped.instance = AiotMLFactory.eINSTANCE.createInstance();
					wrapped.instance.setName("testinstance"+generatedCounter);
					wrapped.instance.setType(wrapped.type);
					config.getInstances().add(wrapped.instance);
					firstInstances.put(wrapped.type, wrapped.instance);
					copyCounters.put(wrapped.instance, 1);
					generatedInstances.add(wrapped.instance);
					generatedCounter++;
				}
			}
		}
		
		// Add '_generated' at the end of the names of all generated instances, and then add them to the configuration
		for (Instance inst : generatedInstances)
			inst.setName(inst.getName()+"_generated");
	}
	private void copyInstanceConfiguration(Instance original, Instance newinst) {
		// Create copies of all property assignments
		Collection<ConfigPropertyAssign> newPropAssigns = new ArrayList<ConfigPropertyAssign>();
		for (ConfigPropertyAssign propAssign : config.getPropassigns()) {
			if (propAssign.getInstance().equals(original)) {
				ConfigPropertyAssign copy = EcoreUtil2.copy(propAssign);
				copy.setInstance(newinst);
				newPropAssigns.add(copy);
			}
		}
		config.getPropassigns().addAll(newPropAssigns);
		
		// Create copies of all connectors
		Collection<AbstractConnector> newConnectors = new ArrayList<AbstractConnector>();
		for (AbstractConnector connector : config.getConnectors()) {
			if (connector instanceof Connector) {
				if (((Connector)connector).getCli().equals(original)) {
					// Receiving end of connector
					Connector copy = EcoreUtil2.copy((Connector)connector);
					copy.setCli(newinst);
					newConnectors.add(copy);
				} else if (((Connector)connector).getSrv().equals(original)) {
					// Sending end of connector
					Connector copy = EcoreUtil2.copy((Connector)connector);
					copy.setSrv(newinst);
					newConnectors.add(copy);
				}
			} else if (connector instanceof ExternalConnector) {
				if (((ExternalConnector)connector).getInst().equals(original)) {
					ExternalConnector copy = EcoreUtil2.copy((ExternalConnector)connector);
					copy.setInst(newinst);
					newConnectors.add(copy);
				}
			}
		}
		config.getConnectors().addAll(newConnectors);
	}
	
	public void addTestThingHarness() throws AssertionError {
		// Add a harness instance
		Instance harness = AiotMLFactory.eINSTANCE.createInstance();
		harness.setName("harness_generated");
		harness.setType(testHarness);
		config.getInstances().add(harness);
		
		// Add code to send input to all test instances
		for (InputOutputWrapper inputOutput : inputOutputs) {
			// Check that we have correctly generated an instance for this input-output
			if (inputOutput.instance == null) throw new AssertionError("No instance set for input-output");
			// Add a port for this instance of this input-output
			ProvidedPort port = AiotMLFactory.eINSTANCE.createProvidedPort();
			port.setName(inputOutput.instance.getName());
			port.getSends().add(testIn);
			port.getSends().add(testDone);
			testHarness.getPorts().add(port);
			// Add messages to send in the entry block
			for (char c : inputOutput.inout.input.toCharArray()) {
				SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
				send.setPort(port);
				send.setMessage(testIn);
				CharLiteral character = AiotMLFactory.eINSTANCE.createCharLiteral();
				character.setCharValue((byte)c);
				send.getParameters().add(character);
				testHarnessSendCharsEntry.getActions().add(send);
			}
			SendAction send = AiotMLFactory.eINSTANCE.createSendAction();
			send.setPort(port);
			send.setMessage(testDone);
			testHarnessSendCharsEntry.getActions().add(send);
			// Add a connector between harness and the instance
			Connector con = AiotMLFactory.eINSTANCE.createConnector();
			con.setSrv(harness); con.setProvided(port);
			con.setCli(inputOutput.instance); con.setRequired(testPort);
			config.getConnectors().add(con);
		}
	}
	
	public void setDumperPaths() throws AssertionError {
		for (InputOutputWrapper inputOutput : inputOutputs) {
			// Check that we have correctly generated an instance for this input-output
			if (inputOutput.instance == null) throw new AssertionError("No instance set for input-output");
			// Set path property
			ConfigPropertyAssign pathAssign = AiotMLFactory.eINSTANCE.createConfigPropertyAssign();
			pathAssign.setInstance(inputOutput.instance);
			pathAssign.setProperty(fileDumpPath);
			StringLiteral pathLiteral = AiotMLFactory.eINSTANCE.createStringLiteral();
			pathLiteral.setStringValue(inputOutput.inout.dumpPath);
			pathAssign.setInit(pathLiteral);
			config.getPropassigns().add(pathAssign);
		}
	}
	
	public void addSynchronizer() throws AssertionError {
		// Find the completed variable in the checkCompleted function
		LocalVariable completedVar = null;
		ActionBlock checkCompletedBody = (ActionBlock)synchronizerCheckCoompleted.getBody();
		for (Action act : checkCompletedBody.getActions()) {
			if (act instanceof LocalVariable)
				completedVar = (LocalVariable)act;
		}
		
		// Add instance of the synchronizer
		Instance syncronizerInstance = AiotMLFactory.eINSTANCE.createInstance();
		syncronizerInstance.setName("synchronizer_generated");
		syncronizerInstance.setType(synchronizer);
		config.getInstances().add(syncronizerInstance);
		
		// Add stuff for all test thing instances
		for (InputOutputWrapper inputOutput : inputOutputs) {
			// Check that we have correctly generated an instance for this input-output
			if (inputOutput.instance == null) throw new AssertionError("No instance set for input-output");
			// Add property to set if this test is finished
			Property completed = AiotMLFactory.eINSTANCE.createProperty();
			completed.setName(inputOutput.instance.getName()+"_finished");
			TypeRef completedTypeRef = AiotMLFactory.eINSTANCE.createTypeRef();
			completedTypeRef.setType(boolType);
			completed.setTypeRef(completedTypeRef);
			BooleanLiteral completedInit = AiotMLFactory.eINSTANCE.createBooleanLiteral();
			completedInit.setBoolValue(false);
			completed.setInit(completedInit);
			synchronizer.getProperties().add(completed);
			// Add port to receive testEnd or testFailure from instance
			ProvidedPort port = AiotMLFactory.eINSTANCE.createProvidedPort();
			port.setName(inputOutput.instance.getName()+"_result");
			port.getReceives().add(testDone);
			synchronizer.getPorts().add(port);
			// Add internal event to set finished property on reception of done message
			InternalTransition transition = AiotMLFactory.eINSTANCE.createInternalTransition();
			ReceiveMessage doneEvent = AiotMLFactory.eINSTANCE.createReceiveMessage();
			doneEvent.setPort(port);
			doneEvent.setMessage(testDone);
			transition.setEvent(doneEvent);
			VariableAssignment setTrue = AiotMLFactory.eINSTANCE.createVariableAssignment();
			setTrue.setProperty(completed);
			BooleanLiteral completedTrue = AiotMLFactory.eINSTANCE.createBooleanLiteral();
			completedTrue.setBoolValue(true);
			setTrue.setExpression(completedTrue);
			transition.setAction(setTrue);
			synchronizerListen.getInternal().add(transition);
			// Add check to the property in the checkCompleted function
			ConditionalAction checkIf = AiotMLFactory.eINSTANCE.createConditionalAction();
			NotExpression notExpr = AiotMLFactory.eINSTANCE.createNotExpression();
			PropertyReference propRef = AiotMLFactory.eINSTANCE.createPropertyReference();
			propRef.setProperty(completed);
			notExpr.setTerm(propRef);
			checkIf.setCondition(notExpr);
			VariableAssignment setFalse = AiotMLFactory.eINSTANCE.createVariableAssignment();
			setFalse.setProperty(completedVar);
			BooleanLiteral completedVarFalse = AiotMLFactory.eINSTANCE.createBooleanLiteral();
			completedVarFalse.setBoolValue(false);
			setFalse.setExpression(completedVarFalse);
			checkIf.setAction(setFalse);
			checkCompletedBody.getActions().add(checkCompletedBody.getActions().size()-1, checkIf);
			// Add connectors in configuration
			Connector endCon = AiotMLFactory.eINSTANCE.createConnector();
			endCon.setCli(inputOutput.instance); endCon.setRequired(testPort);
			endCon.setSrv(syncronizerInstance); endCon.setProvided(port);
			config.getConnectors().add(endCon);
		}
	}
	
	
	/* --- Type checking helpers --- */
	public boolean isTestThing(Thing thing) {
		return (
			!thing.isFragment() &&
			AnnotatedElementHelper.hasAnnotation(thing, "test") &&
			AiotMLHelpers.allThingFragments(thing).contains(testFragment)
		);
	}
	public Collection<Thing> allTestThings() {
		Collection<Thing> result = new ArrayList<Thing>();
		for (Thing thing : AiotMLHelpers.allThings(model))
			if (isTestThing(thing))
				result.add(thing);
		return result;
	}
	public Collection<Instance> allTestInstances() {
		Collection<Instance> result = new ArrayList<Instance>();
		for (Instance inst : config.getInstances())
			if (isTestThing(inst.getType()))
				result.add(inst);
		return result;
	}
	public Collection<Instance> instancesOf(Collection<Instance> instances, Thing type) {
		Collection<Instance> instancesof = new ArrayList<Instance>();
		for (Instance instance : instances)
			if (instance.getType().equals(type))
				instancesof.add(instance);
		return instancesof;
	}
	
	/* --- Reference finding helpers --- */
	public Thing findThing(String name) throws AssertionError {
		for (Thing thing : AiotMLHelpers.allThings(model))
			if (thing.getName().equals(name))
				return thing;
		throw new AssertionError("Couldn't find thing '"+name+"' in model");
	}
	public RequiredPort findRequiredPort(Thing thing, String name) throws AssertionError {
		for (Port port : thing.getPorts())
			if (port instanceof RequiredPort && port.getName().equals(name))
				return (RequiredPort)port;
		throw new AssertionError("Couldn't find required port '"+name+"' in thing '"+thing.getName()+"'");
	}
	public Message findMessage(Thing thing, String name) throws AssertionError {
		for (Message msg : thing.getMessages())
			if (msg.getName().equals(name))
				return msg;
		throw new AssertionError("Couldn't find message '"+name+"' in thing '"+thing.getName()+"'");
	}
	public Property findProperty(Thing thing, String name) throws AssertionError {
		for (Property prop : thing.getProperties())
			if (prop.getName().equals(name))
				return prop;
		throw new AssertionError("Couldn't find property '"+name+"' in thing '"+thing.getName()+"'");
	}
	public State findState(Collection<? extends StateContainer> containers, String name) {
		for (StateContainer container : containers) {
			// Check if composite
			if (container instanceof CompositeState && container.getName().equals(name)) return (State)container;
			
			// Check all sub-states
			Collection<CompositeState> subComposits = new ArrayList<CompositeState>();
			for (State sub : container.getSubstate()) {
				if (sub.getName().equals(name)) return sub;
				if (sub instanceof CompositeState) subComposits.add((CompositeState)sub);
			}
			State subCompositsFind = findState(subComposits, name);
			if (subCompositsFind != null) return subCompositsFind;
			
			// Check regions and sessions
			if (container instanceof CompositeState) {
				CompositeState comp = (CompositeState)container;
				State regionSessionFind = findState(comp.getRegion(), name);
				if (regionSessionFind != null) return regionSessionFind;
				regionSessionFind = findState(comp.getSession(), name);
				if (regionSessionFind != null) return regionSessionFind;
			}
		}
		
		return null;
	}
	public State findState(Thing thing, String name) throws AssertionError {
		State found = findState(Arrays.asList(thing.getBehaviour()), name);
		if (found != null) return found;
		throw new AssertionError("Couldn't find state '"+name+"' in thing '"+thing.getName()+"'");
	}
	public ActionBlock findEntryBlock(State state) throws AssertionError {
		if (state.getEntry() != null && state.getEntry() instanceof ActionBlock)
			return (ActionBlock)state.getEntry();
		throw new AssertionError("Couldn't find on entry block in state '"+state.getName()+"'");
	}
	public Function findFunction(Thing thing, String name) throws AssertionError {
		for (Function func : thing.getFunctions())
			if (func.getName().equals(name))
				return func;
		throw new AssertionError("Couldn't find function '"+name+"' in thing '"+thing.getName()+"'");
	}
	public PrimitiveType findPrimitiveType(String name) throws AssertionError {
		for (Type type : AiotMLHelpers.allTypes(model))
			if (type instanceof PrimitiveType && type.getName().equals(name))
				return (PrimitiveType)type;
		throw new AssertionError("Couldn't find primitive type '"+name+"' in model");
	}
	/* --- Helper classes --- */
	private static class InputOutputWrapper {
		public Thing type;
		public Instance instance;
		public GeneralTestInputOutput inout;
		
		public InputOutputWrapper(Thing thing, GeneralTestInputOutput inputoutput) {
			type = thing;
			instance = null;
			inout = inputoutput;
		}
	}
}
