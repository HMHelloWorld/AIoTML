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
/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aiotml.xtext.constraints;

import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.aiotml.xtext.helpers.ActionHelper;
import org.aiotml.xtext.helpers.IncludeCycle;
import org.aiotml.xtext.helpers.ThingHelper;
import org.aiotml.xtext.helpers.AiotMLElementHelper;
import org.aiotml.xtext.aiotML.Action;
import org.aiotml.xtext.aiotML.ActionBlock;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Enumeration;
import org.aiotml.xtext.aiotML.EnumerationLiteral;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.ForAction;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.Handler;
import org.aiotml.xtext.aiotML.Import;
import org.aiotml.xtext.aiotML.Instance;
import org.aiotml.xtext.aiotML.LocalVariable;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.SubThing;
import org.aiotml.xtext.aiotML.Cproperty;

import org.aiotml.xtext.aiotML.ObjectType;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.PlatformAnnotation;
import org.aiotml.xtext.aiotML.Port;
import org.aiotml.xtext.aiotML.PrimitiveType;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Protocol;
import org.aiotml.xtext.aiotML.ProvidedPort;
import org.aiotml.xtext.aiotML.Region;
import org.aiotml.xtext.aiotML.RequiredPort;
import org.aiotml.xtext.aiotML.Session;
import org.aiotml.xtext.aiotML.StartSession;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.VariableAssignment;
import org.aiotml.xtext.aiotML.CpropertyAssignment;
import org.aiotml.xtext.aiotML.CpropertyReference;
import org.aiotml.xtext.aiotML.StrategyStream;
import org.aiotml.xtext.aiotML.StrategyProperty;
import org.aiotml.xtext.aiotML.Agent;
import org.aiotml.xtext.aiotML.MultiAgent;
import org.aiotml.xtext.aiotML.MultiAgentProperty;import org.aiotml.xtext.aiotML.StrategyAssignment;
import org.aiotml.xtext.helpers.ConfigurationHelper;

public class AiotMLHelpers {
	
    /**
     * Take a copy and flatten the model (removes imports and add all elements from the imports in the model)
     * @param model
     * @return
     */
    public static AiotMLModel flattenModel(AiotMLModel model) {

    	Copier copier = new Copier();
    	
    	if (model.eResource() != null) // TODO: Jakob - when models are flattened once, their resource dissapears
    		EcoreUtil.resolveAll(model.eResource().getResourceSet());
    	
    	AiotMLModel result = (AiotMLModel)copier.copy(model);
    	
    	Collection<AiotMLModel> importedmodels = new ArrayList<AiotMLModel>();
    	for(AiotMLModel m : AiotMLHelpers.allAiotMLModelModels(model)) {
    		if (m != model) {
    			importedmodels.add((AiotMLModel)copier.copy(m));
    		}
    	}
    	
    	copier.copyReferences();
    		
    	for(AiotMLModel m : importedmodels) {
        	if (m != result) {
        		result.getConfigs().addAll(m.getConfigs());
        		result.getProtocols().addAll(m.getProtocols());
        		result.getTypes().addAll(m.getTypes());
        	}
        }
    	
    	result.getImports().clear();
    	
    	// Add the new model to a resource set
    	String uriString = "memory:/"+UUID.randomUUID().toString()+".aiotml";
    	ResourceSet rs = new ResourceSetImpl();
        Resource res = rs.createResource(URI.createURI(uriString));
        res.getContents().add(result);
    	
    	return result;
    }
	
	
	/* ***********************************************************
	 * Resolution of containers
	 * ***********************************************************/

	@SuppressWarnings("unchecked") // I know what I am doing :-)
	public static <C> C findContainer(EObject eObject, Class<C> cClass) {
		while (eObject != null && !cClass.isAssignableFrom(eObject.getClass())) {
			eObject = eObject.eContainer();
		}
		return (C) eObject;
	}
	
    @SuppressWarnings("unchecked") // I know what I am doing :-)
	public static <C> List<C> allContainedElementsOfType(EObject parent, Class<?> c) {
    	final List<C> result = new ArrayList<C>();
    	org.eclipse.emf.common.util.TreeIterator<EObject> it = parent.eAllContents();
    	while (it.hasNext()) {
    		EObject o = it.next();
    		if ( c.isInstance(o) ) result.add((C)o); 
    	}
    	
    	return result;
    }
    
    public static StateContainer findContainingStateContainer(EObject object) {
		return findContainer(object, StateContainer.class);
	}
    
	public static AiotMLModel findContainingModel(EObject object) {
		return findContainer(object, AiotMLModel.class);
	}

	public static Function findContainingFunction(EObject object) {
		return findContainer(object,Function.class);
	}

	public static EObject findContainingElement(EObject object) {
		return findContainer(object,EObject.class);
	}

	public static ActionBlock findContainingActionBlock(EObject object) {
		return findContainer(object,ActionBlock.class);
	}
	
	public static ForAction findContainingForLoop(EObject object) {
		return findContainer(object,ForAction.class);
	}	

	public static SubThing findContainingSubThing(EObject object) {
		return findContainer(object,SubThing.class);
	} 
	public static MultiAgent findContainingMultiAgent(EObject object) {
		return findContainer(object,MultiAgent.class);
	}
	public static Agent findContainingAgent(EObject object) {
		return findContainer(object,Agent.class);
	}
	public static Thing findContainingThing(EObject object) {
		return findContainer(object,Thing.class);
	}

	public static Instance findContainingInstance(EObject object) {
		return findContainer(object,Instance.class);
	}

	public static Configuration findContainingConfiguration(EObject object) {
		return findContainer(object,Configuration.class);
	}

	public static State findContainingState(EObject object) {
		return findContainer(object,State.class);
	}
	
	public static CompositeState findContainingCompositeState(EObject object) {
		return findContainer(object,CompositeState.class);
	}

	public static Region findContainingRegion(EObject object) {
		return findContainer(object,Region.class);
	}

	public static Handler findContainingHandler(EObject object) {
		return findContainer(object,Handler.class);
	}
	
	public static StartSession findContainingStartSession(EObject object) {
		return findContainer(object, StartSession.class);
	}
	

	/* ***********************************************************
	 * Type checking and expressions
	 * ***********************************************************/
	
	//public static TypeChecker typerchecker = new TypeChecker();
		
	/*public static Type getExpressionType(Expression exp) {
		return typerchecker.computeTypeOf(exp);
	}*/

	/* ***********************************************************
	 * Resolution of imported models / All available Things and Types
	 * ***********************************************************/
	private static URI getIncludedLibrary(String uri, String from) throws Exception {
		URL url;
		switch (from) {
		case "stl":
			url = AiotMLModel.class.getResource("/org/aiotml/stl/"+uri);
			break;
		default:
			throw new Exception(from+" is not a valid library");
		}
		if (url == null) throw new Exception(uri+" was not found in library "+from);
		else return URI.createURI(url.toURI().toString());
	}
	
	public static AiotMLModel getModelFromRelativeURI(AiotMLModel base, String uri, String from) throws Exception {
		URI new_uri;
		if (from != null) {
			// Import included library
			new_uri = getIncludedLibrary(uri, from);
		} else {
			// Import local file
			new_uri = URI.createURI(uri);
			if (new_uri.isRelative()) {
				new_uri = new_uri.resolve(base.eResource().getURI());
			}
		}
		
		// Load the file into the ResourceSet
		Resource r = base.eResource().getResourceSet().getResource(new_uri, true);
		if (r != null && r.getContents().size() > 0 && r.getContents().get(0) instanceof AiotMLModel ) {
			return (AiotMLModel)r.getContents().get(0);
		} else {
			throw new Exception("No valid model found for resource "+uri);
		}
	}
	
	
	public static ArrayList<AiotMLModel> allAiotMLModelModels(AiotMLModel model) {
		ArrayList<AiotMLModel> result = new ArrayList<AiotMLModel>();
		result.add(model);

        ArrayList<AiotMLModel> temp = new ArrayList<AiotMLModel>();

        int prevSize = result.size();
        int newSize = prevSize;
        do {
            for (AiotMLModel m : result) {
            	for (Import imp : m.getImports()) {
            		try {
            			AiotMLModel m2 = getModelFromRelativeURI(m, imp.getImportURI(), imp.getFrom());
            			if (!temp.contains(m2)) {
                            temp.add(m2);
                        }
            		} catch (Exception e) {}
                	
                }
            }
            for (AiotMLModel m : temp) {
                if (!result.contains(m)) {
                    result.add(m);
                }
            }
            prevSize = newSize;
            newSize = result.size();
        } while (newSize > prevSize);
        
		return result;
	}
	
	public static ArrayList<Type> allTypes(AiotMLModel model) {
		ArrayList<Type> result = new ArrayList<Type>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Type t : m.getTypes()) {
				if (t instanceof Thing || t instanceof Protocol) continue;
				if (!result.contains(t)) result.add(t);
			}
		}
		return result;
	}
	

    /**
     * Returns the list of all types that are actually used in the model
     * A type is used if:
     *  - it exists a property (in a thing or in a state machine) of this type, or
     *  - it exists a message with a parameter of this type
     * @param model
     * @return
     */
    public static Set<Type> allUsedTypes(AiotMLModel model) {
        Set<Type> result = new HashSet<Type>();
        for(Type t : allTypes(model)) {
            for(Thing thing : allThings(model)) {
                for(Property p : ThingHelper.allPropertiesInDepth(thing)) {
                    if (EcoreUtil.equals(p.getTypeRef().getType(), t))
                        result.add(t);
                }
                for(Message m : AiotMLHelpers.allMessages(thing)) {
                    for(Parameter p : m.getParameters()) {
                        if (EcoreUtil.equals(p.getTypeRef().getType(), t)) {
                            result.add(t);
                        }
                    }
                }
                for(Function f : AiotMLHelpers.allFunctions(thing)) {
                	for(Parameter p : f.getParameters()) {
                        if (EcoreUtil.equals(p.getTypeRef().getType(), t)) {
                            result.add(t);
                        }
                    }
                }
                for (LocalVariable v : ActionHelper.getAllActions(thing, LocalVariable.class)) {
                    if (EcoreUtil.equals(v.getTypeRef().getType(), t)) {
                        result.add(t);
                    }	                	
                }
            }
        }
        return result;
    }


    public static Set<Type> allUsedSimpleTypes(AiotMLModel model) {
        Set<Type> result = new HashSet<Type>();
        for(Type t : allSimpleTypes(model)) {
            for(Thing thing : allThings(model)) {
                for(Property p : ThingHelper.allPropertiesInDepth(thing)) {
                    if (EcoreUtil.equals(p.getTypeRef().getType(), t))
                        result.add(t);
                }
                for(Message m : AiotMLHelpers.allMessages(thing)) {
                    for(Parameter p : m.getParameters()) {
                        if (EcoreUtil.equals(p.getTypeRef().getType(), t)) {
                            result.add(t);
                        }
                    }
                }
                for(Function m : AiotMLHelpers.allFunctions(thing)) {
                	for(Parameter p : m.getParameters()) {
                        if (EcoreUtil.equals(p.getTypeRef().getType(), t)) {
                            result.add(t);
                        }
                    }
                }
                for (LocalVariable v : ActionHelper.getAllActions(thing, LocalVariable.class)) {
                    if (EcoreUtil.equals(v.getTypeRef().getType(), t)) {
                        result.add(t);
                    }	                	
                }
            }
        }
        return result;
    }
	
	public static ArrayList<Type> allSimpleTypes(AiotMLModel model) {
		ArrayList<Type> result = new ArrayList<Type>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Type t : m.getTypes()) {
				if ( (t instanceof ObjectType || t instanceof PrimitiveType || t instanceof Enumeration) && !result.contains(t)) 
					result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Enumeration> allEnumerations(AiotMLModel model) {
		ArrayList<Enumeration> result = new ArrayList<Enumeration>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Type t : m.getTypes()) {
				if ( (t instanceof Enumeration) && !result.contains(t)) 
					result.add((Enumeration)t);
			}
		}
		return result;
	}
	
	public static ArrayList<Thing> allThings(AiotMLModel model) {
		ArrayList<Thing> result = new ArrayList<Thing>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Type t : m.getTypes()) {
				if ( (t instanceof Thing) && !result.contains(t)) 
					result.add((Thing)t);
			}
		}
		return result;
	}
	
	public static ArrayList<Instance> allInstances(Configuration config) {
		ArrayList<Instance> result = new ArrayList<Instance>();
		result.addAll(config.getInstances());
		return result;
	}
	
	public static ArrayList<Enumeration> findEnumeration(AiotMLModel model, String name, boolean fuzzy) {
		ArrayList<Enumeration> result = new ArrayList<Enumeration>();
		for (Enumeration t : allEnumerations(model)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<EnumerationLiteral> findEnumerationLiteral(Enumeration e, String name, boolean fuzzy) {
		ArrayList<EnumerationLiteral> result = new ArrayList<EnumerationLiteral>();
		for (EnumerationLiteral t : e.getLiterals()) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Type> findSimpleType(AiotMLModel model, String name, boolean fuzzy) {
		ArrayList<Type> result = new ArrayList<Type>();
		for (Type t : allSimpleTypes(model)) {
			if (t.getName() != null) {
				if (t.getName().startsWith(name)) {
					if (fuzzy) result.add(t);
					else if (t.getName().equals(name)) result.add(t);
				}
			}
		}
		return result;
	}
	
	public static ArrayList<Thing> findThing(AiotMLModel model, String name, boolean fuzzy) {
		ArrayList<Thing> result = new ArrayList<Thing>();
		for (Thing t : allThings(model)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	/* ***********************************************************
	 * Resolution for Things: Ports, Properties, StateMachines, Messages
	 * ***********************************************************/
	
	public static ArrayList<Thing> allThingFragmentsWithCheck(Thing thing) throws IncludeCycle {
		ArrayList<Thing> result = new ArrayList<Thing>();
		result.add(thing);
		for (Thing t : thing.getIncludes()) {
			if (EcoreUtil.equals(t, thing)) throw new IncludeCycle("Thing " + thing.getName() + " cannot include itself.");
			for(Thing i : t.getIncludes()) {
				if (EcoreUtil.equals(i, t) || EcoreUtil.equals(i, thing))
					throw new IncludeCycle("Thing " + t.getName() + " cannot include itself, even indirecty. Check your include hierarchy.");
			}
			for (Thing c : allThingFragments(t)) {
				if (!result.contains(c)) result.add(result.indexOf(thing),c);
			}
		}
		return result;
	}
	
	public static ArrayList<Thing> allThingFragments(Thing thing) {
		ArrayList<Thing> result = new ArrayList<Thing>();
		try {
			result.addAll(allThingFragmentsWithCheck(thing));
		} catch (IncludeCycle e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static ArrayList<Property> allProperties(Thing thing) {
		ArrayList<Property> result = new ArrayList<Property>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getProperties());
		}
		return result;
	}
	
	public static ArrayList<Property> allProperties(SubThing subthing) {
		ArrayList<Property> result = new ArrayList<Property>();
		
		result.addAll(subthing.getProperties());
		
		return result;
	}
	
	public static ArrayList<PlatformAnnotation> allAnnotations(Thing thing) {
		ArrayList<PlatformAnnotation> result = new ArrayList<PlatformAnnotation>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getAnnotations());
		}
		return result;
	}

	public static ArrayList<Function> allFunctions(Thing thing) {
		ArrayList<Function> result = new ArrayList<Function>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getFunctions());
		}
		return result;
	}
	
	public static ArrayList<Cproperty> allCpropertys(Thing thing) {
		ArrayList<Cproperty> result = new ArrayList<Cproperty>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getCproperties());
		}
		return result;
	}
	public static ArrayList<MultiAgentProperty> allMultiAgentPropertys(Thing thing) {
		ArrayList<MultiAgentProperty> result = new ArrayList<MultiAgentProperty>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getMas());
			
		}
		return result;
	}
	
	public static ArrayList<StrategyProperty> allStrategyPropertys(Thing thing) {
		ArrayList<StrategyProperty> result = new ArrayList<StrategyProperty>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getStrategys());
			
		}
		return result;
	}
	public static ArrayList<Message> allMessages(Thing thing) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getMessages());
			/*
			for (Message msg : t.getMessages()) {
				boolean isPresent = false;
				for(Message m : result) {
					if (EcoreUtil.equals(msg, m)) {
						isPresent = true;
						break;
					}
				}
				if (!isPresent) result.add(msg);
			}
			*/
		}
		return result;
	}
    
	public static ArrayList<Port> allPorts(Thing thing) {
		ArrayList<Port> result = new ArrayList<Port>();
		for (Thing t : allThingFragments(thing)) {
			result.addAll(t.getPorts());
		}
		return result;
	}
	
	public static ArrayList<ProvidedPort> allProvidedPorts(Thing thing) {
		ArrayList<ProvidedPort> result = new ArrayList<ProvidedPort>();
		for (Port p : allPorts(thing)) {
			if (p instanceof ProvidedPort) result.add((ProvidedPort)p);
		}
		return result;
	}
	
	public static ArrayList<RequiredPort> allRequiredPorts(Thing thing) {
		ArrayList<RequiredPort> result = new ArrayList<RequiredPort>();
		for (Port p : allPorts(thing)) {
			if (p instanceof RequiredPort) result.add((RequiredPort)p);
		}
		return result;
	}
	
	public static ArrayList<Message> allIncomingMessages(Thing thing) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Port p : allPorts(thing)) {
			for (Message m : p.getReceives()) {
				if (!result.contains(m)) result.add(m);
			}
		}
		return result;
	}
	
	public static ArrayList<Message> allOutgoingMessages(Thing thing) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Port p : allPorts(thing)) {
			for (Message m : p.getSends()) {
				if (!result.contains(m)) result.add(m);
			}
		}
		return result;
	}
	
	public static ArrayList<CompositeState> allStateMachines(Thing thing) {
		ArrayList<CompositeState> result = new ArrayList<CompositeState>();
		for (Thing t : allThingFragments(thing)) {
			if (t.getBehaviour() != null)
				result.add(t.getBehaviour());
		}
		return result;
	}
	
	public static ArrayList<Property> findProperty(Thing thing, String name, boolean fuzzy) {
		ArrayList<Property> result = new ArrayList<Property>();
		for (Property t : allProperties(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Function> findFunction(Thing thing, String name, boolean fuzzy) {
		ArrayList<Function> result = new ArrayList<Function>();
		for (Function t : allFunctions(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Message> findMessage(Thing thing, String name, boolean fuzzy) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Message msg : allMessages(thing)) {
			if (msg.getName().startsWith(name)) {
				if (fuzzy) result.add(msg);
				else if (msg.getName().equals(name)) result.add(msg);
			}
		}
		return result;
	}
	
	public static ArrayList<Port> findPort(Thing thing, String name, boolean fuzzy) {
		ArrayList<Port> result = new ArrayList<Port>();
		for (Port t : allPorts(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<RequiredPort> findRequiredPort(Thing thing, String name, boolean fuzzy) {
		ArrayList<RequiredPort> result = new ArrayList<RequiredPort>();
		for (RequiredPort t : allRequiredPorts(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<ProvidedPort> findProvidedPort(Thing thing, String name, boolean fuzzy) {
		ArrayList<ProvidedPort> result = new ArrayList<ProvidedPort>();
		for (ProvidedPort t : allProvidedPorts(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<CompositeState> findStateMachine(Thing thing, String name, boolean fuzzy) {
		ArrayList<CompositeState> result = new ArrayList<CompositeState>();
		for (CompositeState t : allStateMachines(thing)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	/* ***********************************************************
	 * Resolution for Ports: Incoming/Outgoing Messages
	 * ***********************************************************/
	
	public static ArrayList<Message> findIncomingMessage(Port port, String name, boolean fuzzy) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Message t : port.getReceives()) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Message> findOutgoingMessage(Port port, String name, boolean fuzzy) {
		ArrayList<Message> result = new ArrayList<Message>();
		for (Message t : port.getSends()) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	/* ***********************************************************
	 * Resolution for State Machines, States, Regions
	 * ***********************************************************/
	
	public static ArrayList<State> allContainingStates(State state) {
		ArrayList<State> result = new ArrayList<State>();
		EObject current = state;
		while(current != null) {
			if (current instanceof State) result.add((State)current);
			current = current.eContainer();
		}
		return result;
	}
	
	public static ArrayList<Region> allContainingRegions(EObject element) {
		ArrayList<Region> result = new ArrayList<Region>();
		EObject current = element;
		while(current != null) {
			if (current instanceof Region) result.add((Region)current);
			current = current.eContainer();
		}
		return result;
	}
	
	public static ArrayList<Property> allProperties(State state) {
		ArrayList<Property> result = new ArrayList<Property>();
		// Properties from the states
		for (State s : allContainingStates(state)) {
			result.addAll(s.getProperties());
		}
		// Properties from the thing
		result.addAll(allProperties(findContainingThing(state)));
		return result;
	}
	
	public static ArrayList<Session> allVisibleSessions (EObject context) {
		ArrayList<Session> result = new ArrayList<Session>();
		CompositeState container = AiotMLHelpers.findContainingCompositeState(context);
		
		if ( container != null ) {
			result.addAll(container.getSession());
		}
		return result;
	}
	public static ArrayList<Function> allFunctions (EObject container) {
		ArrayList<Function> result = new ArrayList<Function>();		
		
		Thing t = findContainingThing(container);
		if (t != null) {
			result.addAll(allFunctions(t));
		}		
		
		return result;
	}
	public static ArrayList<Agent> allActions (EObject container) {
		ArrayList<Agent> result = new ArrayList<Agent>();	
		StrategyAssignment sa =  (StrategyAssignment) container ;
		MultiAgent ma = (MultiAgent) (sa.getStrategy().getTypeRef().getType());
		if (ma != null) {
			result.addAll(ma.getAgents());
		}
		return result;
	}
	public static ArrayList<Variable> allVisibleVariables (EObject container) {
		ArrayList<Variable> result = new ArrayList<Variable>();		
		ForAction fa = findContainingForLoop(container);
		if (fa != null) {
			result.add(fa.getVariable());
			if (fa.getIndex() != null)
				result.add(fa.getIndex());
			result.addAll(allVisibleVariables(fa.eContainer()));
			//return result;
		}
		
		// Add the variables of the block if we are in a block
		ActionBlock b = findContainingActionBlock(container);
		if (b != null) {
			for (Action a : b.getActions()) {
				if (a == container || a.eContents().contains(container)) continue; // ignore variables defined after the current statement
				if (a instanceof Variable) {
					result.add((Variable)a);
				}
			}
			result.addAll(allVisibleVariables(b.eContainer()));
			//return result;
		}
		
		// Add the variables of the state if we are in a state
		State s = findContainingState(container);
		if (s != null) {
			result.addAll(allProperties(s));
			
			//return result;
		}
		
		// Add parameters of the function if we are in a function 
		Function f = findContainingFunction(container);
		if (f != null) {
			result.addAll(f.getParameters());
			result.addAll(allVisibleVariables(f.eContainer()));
			
		}
		

		
		// Only the variables of the thing if we are in a thing:
		Thing t = findContainingThing(container);
		if (t != null) {
			// Properties from the thing
			result.addAll(allProperties(t));
			result.addAll(allCpropertys(t));
			result.addAll(allStrategyPropertys(t));
			result.addAll(allMultiAgentPropertys(t));
			//return result;
//			result.get(0).getTypeRef().getCardinality();
		}		
		
		
//		Configuration conf = findContainingConfiguration(container);
//		if (conf != null) {
//			for(SubThing st : ConfigurationHelper.allSubThings(conf)) {
//				result.addAll(st.getProperties());
//			}
//		}
		
		
//		SubThing st = findContainingSubThing(container);
//		if (st != null) {
//			result.addAll(allProperties(st));
//		}
				
		return result;		
		
	}
	
	public static ArrayList<Property> rAllSubthingPropertys(EObject container) {
		ArrayList<Property> result = new ArrayList<Property>();		
		Thing t = findContainingThing(container);
		AiotMLModel tm = findContainingModel(t);
		CpropertyReference cr = (CpropertyReference) container;
		for (Configuration conf : tm.getConfigs()) {
			for(SubThing st : ConfigurationHelper.allSubThings(conf)) {
//				if(cr.getProperty()!=null)
//					if(st.getName().equals(cr.getProperty().getTypeRef().getType().getName()))
						result.addAll(st.getProperties());
			}
		}
		
//		Instance i =  findContainingInstance(tm);
//		Configuration conf = findContainingConfiguration(i);
//		if (conf != null) {
//			for(SubThing st : ConfigurationHelper.allSubThings(conf)) {
//				result.addAll(st.getProperties());
//			}
//		}
		
		return result;
	}

	public static ArrayList<Property> aAllSubthingPropertys(EObject container) {
		ArrayList<Property> result = new ArrayList<Property>();		
		Thing t = findContainingThing(container);
		AiotMLModel tm = findContainingModel(t);
		CpropertyAssignment ca = (CpropertyAssignment) container;
		for (Configuration conf : tm.getConfigs()) {
			for(SubThing st : ConfigurationHelper.allSubThings(conf)) {
//				if(ca.getProperty()!=null)
//					if(st.getName().equals(ca.getProperty().getTypeRef().getType().getName()))
						result.addAll(st.getProperties());
			}
		}
		
//		Instance i =  findContainingInstance(tm);
//		Configuration conf = findContainingConfiguration(i);
//		if (conf != null) {
//			for(SubThing st : ConfigurationHelper.allSubThings(conf)) {
//				result.addAll(st.getProperties());
//			}
//		}
		
		return result;
	}
	
	public static ArrayList<Variable> findVisibleVariables(EObject container, String name, boolean fuzzy) {
		ArrayList<Variable> result = new ArrayList<Variable>();
		for (Variable t : allVisibleVariables(container)) {
			if (AiotMLElementHelper.getName(t) != null && AiotMLElementHelper.getName(t).startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (AiotMLElementHelper.getName(t).equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	public static ArrayList<Property> findProperty(State state, String name, boolean fuzzy) {
		ArrayList<Property> result = new ArrayList<Property>();
		for (Property t : allProperties(state)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}

	public static ArrayList<State> allValidTargetStates(State state) {
		ArrayList<State> result = new ArrayList<State>();
		StateContainer parent = (StateContainer)state.eContainer();
		result.addAll(parent.getSubstate());
		return result;
	}
	
	public static ArrayList<State> findValidTargetState(State state, String name, boolean fuzzy) {
		ArrayList<State> result = new ArrayList<State>();
		for (State t : allValidTargetStates(state)) {
			if (t.getName().startsWith(name)) {
				if (fuzzy) result.add(t);
				else if (t.getName().equals(name)) result.add(t);
			}
		}
		return result;
	}
	
	/* ***********************************************************
	 * Resolution for Configurations, Instances and Connectors
	 * ***********************************************************/
	
	public static ArrayList<Configuration> allConfigurations(AiotMLModel model) {
		ArrayList<Configuration> result = new ArrayList<Configuration>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Configuration c : m.getConfigs()) {
				if (!result.contains(c)) result.add(c);
			}
		}
		return result;
	}
	
	public static ArrayList<Protocol> allProtocols(AiotMLModel model) {
		ArrayList<Protocol> result = new ArrayList<Protocol>();
		for (AiotMLModel m : allAiotMLModelModels(model)) {
			for (Protocol p : m.getProtocols()) {
				if (!result.contains(p)) result.add(p);
			}
		}
		return result;
	}
	
	public static ArrayList<Configuration> findConfiguration(AiotMLModel model, String name, boolean fuzzy) {
		ArrayList<Configuration> result = new ArrayList<Configuration>();
		for (Configuration c : allConfigurations(model)) {
			if (c.getName().startsWith(name)) {
				if (fuzzy) result.add(c);
				else if (c.getName().equals(name)) result.add(c);
			}
		}
		return result;
	}

	public static Expression findRootExpressions(Expression expression) {
		Expression result = expression;
		EObject parent = expression.eContainer();
		while(parent != null && parent instanceof Expression) {
			result = (Expression) parent;
			parent = parent.eContainer();
		}
		return result;
	}


	public static <T extends Expression> List<T> getAllExpressions(EObject self, Class<T> clazz) {
		List<T> result = new ArrayList<T>();				
		TreeIterator<EObject> it = self.eAllContents();
		while(it.hasNext()) {
			EObject o = it.next();
			if (clazz.isInstance(o)) result.add((T) o);
		}

        if (self instanceof Thing) {//We need this to get all the expressions defined in included Things, as they are not part of self.eAllContents. This should be the only case where we need a hack...
        	Thing t = (Thing) self;
        	for(Thing i : ThingHelper.allIncludedThings(t)) {
        		result.addAll(getAllExpressions(i, clazz));
        	}
        } else {
        	if (clazz.isInstance(self))result.add((T)self);
        }
		
		return result;
	}


	public static List<Expression> getAllExpressions(EObject self) {
		return getAllExpressions(self, Expression.class);
	}

	public Set<Message> allMessages(AiotMLModel self) {
		Set<Message> msg = new HashSet<Message>();
		for(Thing t : allThings(self)) {
			msg.addAll(AiotMLHelpers.allMessages(t));
		}
		return msg;
	}
	
	public static ArrayList<Variable> allVariables(Thing thing) { //TODO: Does this get absolutely all variables?
		ArrayList<Variable> result = new ArrayList<Variable>();
		for (Thing t : allThingFragments(thing)) {
			for (VariableAssignment assignment : ActionHelper.getAllActions(t, VariableAssignment.class)) {
			    result.add(assignment.getProperty());
			}
		}
		return result;
}


	

}
