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
package org.aiotml.xtext.helpers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.aiotML.ArrayInit;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.EnumLiteralRef;
import org.aiotml.xtext.aiotML.Expression;
import org.aiotml.xtext.aiotML.Function;
import org.aiotml.xtext.aiotML.IntegerLiteral;
import org.aiotml.xtext.aiotML.InternalTransition;
import org.aiotml.xtext.aiotML.Message;
import org.aiotml.xtext.aiotML.Parameter;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.PropertyAssign;
import org.aiotml.xtext.aiotML.PropertyReference;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLFactory;
import org.aiotml.xtext.aiotML.Transition;
import org.aiotml.xtext.aiotML.Type;
import org.aiotml.xtext.aiotML.Variable;
import org.aiotml.xtext.aiotML.VariableAssignment;

/**
 * Created by ffl on 10.05.2016.
 */
public class ThingHelper {

	public static Set<Thing> allIncludedThingsWithCheck(Thing self) throws IncludeCycle {//Exception is used by the checker, so it can be silenced everywhere else
		final HashSet<Thing> result = new HashSet<>();
		for(Thing t : self.getIncludes()) {
			if (EcoreUtil.equals(t, self)) throw new IncludeCycle("Thing " + t.getName() + " cannot include itself.");
			result.add(t);
			for(Thing i : t.getIncludes()) {
				if (EcoreUtil.equals(i, t) || EcoreUtil.equals(i, self))
					throw new IncludeCycle("Thing " + t.getName() + " cannot include itself, even indirecty. Check your include hierarchy.");
			}
			result.addAll(allIncludedThings(t));
		}
		return result;
	}

	public static Set<Thing> allIncludedThings(Thing self) {
		HashSet<Thing> result = new HashSet<>();
		try {
			result.addAll(allIncludedThingsWithCheck(self));
		} catch (IncludeCycle e) {
			e.printStackTrace();
		}
		return result;
	}

	public static List<Function> allConcreteFunctions(Thing self) {
		List<Function> result = new ArrayList<>();
		for(Function fn : AiotMLHelpers.allFunctions(self)) {
			if (!fn.isAbstract()) {
				result.add(fn);
			}
		}
		return result;
	}

	public static Function getConcreteFunction(Thing self, Function f) throws Exception {
		Function cf = null;
		int count = 0;
		for(Function fn : AiotMLHelpers.allFunctions(self)) {
			if (fn.getName().equals(f.getName()) && !fn.isAbstract()) {//Should be enough to check on names as we cannot have two functions with same name (though <> params)
				cf = fn;
				count++;
			}
		}		
		if (cf == null)
			throw new UnimplementedFunction("Cannot bind AiotML function " + f.getName() + " in thing " + self.getName());
		if (count > 1)
			throw new FunctionWithMultipleImplem("AiotML function " + f.getName() + " in thing " + self.getName() + " is bound to multiple concrete implementations");
		return cf;
	}

	public static boolean hasSession(Thing self) {
		for(CompositeState sm : AiotMLHelpers.allStateMachines(self)) {
			if(CompositeStateHelper.allContainedSessions(sm).size() > 0)
				return true;
		}
		return false;
	}

	public static boolean isSingleton(Thing self) {
		return AnnotatedElementHelper.isDefined(self, "singleton", "true");
	}

	public static List<Transition> allTransitionsWithAction(Thing self) {
		final List<Transition> result = new ArrayList<Transition>();
		if (self.getBehaviour() != null) {
			for(State s : StateHelper.allStates(self.getBehaviour())) {
				for(Transition o : s.getOutgoing()) {
					if (o.getAction() != null) {
						result.add(o);
					}
				}
			}
		}
		return result;
	}

	public static List<InternalTransition> allInternalTransitionsWithAction(Thing self) {
		final List<InternalTransition> result = new ArrayList<InternalTransition>();
		if (self.getBehaviour() != null) {
			for(State s : StateHelper.allStates(self.getBehaviour())) {
				for(InternalTransition o : s.getInternal()) {
					if (o.getAction() != null) {
						result.add(o);
					}
				}
			}
		}
		return result;
	}


	public static Set<Property> allPropertiesInDepth(Thing self) {
		Set<Property> result = new HashSet<Property>();
		result.addAll(AiotMLHelpers.allProperties(self));
		for(CompositeState sm : AiotMLHelpers.allStateMachines(self)) {
			result.addAll(CompositeStateHelper.allContainedProperties(sm));
		}
		return result;
	}
	
	public static Set<Property> allSessionsProperties(Thing self) {
		Set<Property> result = new HashSet<Property>();
		for(CompositeState sm : AiotMLHelpers.allStateMachines(self)) {
			result.addAll(CompositeStateHelper.allContainedSessionsProperties(sm));
		}
		return result;
	}


	public static Expression initExpression(Thing self, Property p) {
		if (AiotMLHelpers.allProperties(self).contains(p)) {  // It is a property of the thing
			List<PropertyAssign> assigns = new ArrayList<PropertyAssign>();
			for (PropertyAssign e : self.getAssign()) {
				if (e.getProperty().equals(p))
					assigns.add(e);
			}

			// If the expression is defined locally return the init expression
			if (self.getProperties().contains(p)) {
				return p.getInit();
			}

			if (assigns.size() == 1) {
				return assigns.get(0).getInit();
			}

			List<Thing> imports = new ArrayList<Thing>();
			for (Thing t : self.getIncludes()) {
				if (AiotMLHelpers.allProperties(t).contains(p)) {
					imports.add(t);
				}
			}
			//  imports cannot be empty since the property must be defined in a imported thing
			if (imports.size() > 1)
				System.out.println("Warning: Thing " + self.getName() + " gets property " + p.getName() + " from several paths, it should define its initial value");


			return ThingHelper.initExpression(imports.get(0), p);
		} else { // It is a property of a state machine
			return p.getInit();
		}
	}


	public static List<PropertyAssign> initExpressionsForArray(Thing self, Property p) {

		List<PropertyAssign> result = new ArrayList<PropertyAssign>();

		if (AiotMLHelpers.allProperties(self).contains(p)) {  // It is a property of the thing

			// collect assignment in the imported things first:
			for (Thing t : self.getIncludes()) {
				if (AiotMLHelpers.allProperties(t).contains(p))
					result.addAll(ThingHelper.initExpressionsForArray(t,p));
			}
			// collect assignments in this thing
			if (p.getInit() != null && p.getInit() instanceof ArrayInit) {
				final ArrayInit ai = (ArrayInit)p.getInit();
				int index = 0;
				for(Expression e : ai.getValues()) {
					final PropertyAssign pa = AiotMLFactory.eINSTANCE.createPropertyAssign();
					pa.setInit(EcoreUtil.copy(e));
					pa.setProperty(p);
					final IntegerLiteral il = AiotMLFactory.eINSTANCE.createIntegerLiteral();
					il.setIntValue(index);
					pa.setIndex(il);
					self.getAssign().add(0, pa);//We insert ArrayInit at the beginning, so as it can be overridden by set
					index++;
				}
			}
			
			for(PropertyAssign pa : self.getAssign()) {
				if (pa.getProperty().equals(p)) {
					result.add(pa);
				}
			}						
		}
		else { // It is a property of a state machine
			// No way to initialize arrays in state machines (so far)
		}
		return result;
	}

	public static List<Property> allUsedProperties(Thing self) {
		List<Property> result = new ArrayList<>();
		List<Thing> things = new ArrayList<>();
		things.addAll(allIncludedThings(self));
		things.add(self);
		for(Thing t : things) {
			for(Property p : allPropertiesInDepth(t)) {
				for (VariableAssignment a : ActionHelper.getAllActions(t, VariableAssignment.class)) {
					if (EcoreUtil.equals(p, a.getProperty())) {
						boolean isPresent = false;
						for(Property pr : result) {
							if (EcoreUtil.equals(p, pr)) {
								isPresent = true;
								break;
							}
						}
						if (!isPresent)
							result.add(p);
						break;
					}
				}
				for (PropertyReference e : AiotMLHelpers.getAllExpressions(t, PropertyReference.class)) {
					if (EcoreUtil.equals(p, e.getProperty())) {
						boolean isPresent = false;
						for(Property pr : result) {
							if (EcoreUtil.equals(p, pr)) {
								isPresent = true;
								break;
							}
						}
						if (!isPresent)
							result.add(p);
						break;
					}
				}
				for (EnumLiteralRef e : AiotMLHelpers.getAllExpressions(t, EnumLiteralRef.class)) {
					boolean isPresent = false;
					if (EcoreUtil.equals(p.getTypeRef().getType(), e.getEnum())) {
						for(Property pr : result) {
							if (EcoreUtil.equals(p, pr)) {
								isPresent = true;
								break;
							}
						}
						break;
					}
					if (!isPresent)
						result.add(p);
				}            
			}
		}
		return result;
	}

	/**
	 * Returns a list of all the types that is used in a thing
	 * @param self
	 * @return
	 */
	public static Set<Type> allUsedTypes(Thing self) { //TODO: Optimise for only Types that are actually used
		List<Type> list = new ArrayList<Type>();
		// Types for all properties (things or state machines)
		for(Property p : ThingHelper.allPropertiesInDepth(self)) {
			list.add(p.getTypeRef().getType());
		}
		// Types for all messages
		for(Message m : AiotMLHelpers.allMessages(self)) {
			for(Parameter p : m.getParameters()) {
				list.add(p.getTypeRef().getType());
			}
		}
		// Types for all variables
		for (Variable v : AiotMLHelpers.allVariables(self)) {
			list.add(v.getTypeRef().getType());
		}
		// Types for all functions
		for (Function f : AiotMLHelpers.allFunctions(self)) {
			for (Parameter p : f.getParameters()) {
				list.add(p.getTypeRef().getType());
			}
		}

		// Make sure we only have one of each type in the resulting set
		Set<Type> result = new HashSet<Type>();
		for (Type tl : list) {
			boolean found = false;
			for (Type ts : result) {
				if (EcoreUtil.equals(tl,ts)) {
					found = true;
					break;
				}
			}
			if (!found) {
				result.add(tl);
			}
		}
		return result;
	}	
}
