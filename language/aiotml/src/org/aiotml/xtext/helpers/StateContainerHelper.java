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

import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Property;
import org.aiotml.xtext.aiotML.Region;
import org.aiotml.xtext.aiotML.Session;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.StateContainer;
import org.aiotml.xtext.aiotML.Type;

/**
 * Created by ffl on 10.05.2016.
 */
public class StateContainerHelper {

    public static List<State> allContainedStates(StateContainer self) {
        return AiotMLHelpers.<State>allContainedElementsOfType(self, State.class);
    }
    
    
   public static List<StateContainer> allContainedRegions(StateContainer self) {
       final List<StateContainer> result = new ArrayList<StateContainer>();
       result.add(self);
       result.addAll(AiotMLHelpers.<StateContainer>allContainedElementsOfType(self, CompositeState.class));
       result.addAll(AiotMLHelpers.<StateContainer>allContainedElementsOfType(self, Region.class));
       return result;
    }
    
    public static List<StateContainer> allContainedRegionsAndSessions(StateContainer self) {
    	List<StateContainer> result = new ArrayList<StateContainer>();
        result.add(self);
        result.addAll(AiotMLHelpers.<StateContainer>allContainedElementsOfType(self, StateContainer.class));
        return result;
    }
    
    public static List<Session> allContainedSessions(StateContainer self) {
    	List<Session> result = new ArrayList<Session>();
        result.addAll(AiotMLHelpers.<Session>allContainedElementsOfType(self, Session.class));
        return result;
    }

    public static List<Property> allContainedProperties(StateContainer self) {
        final List<Property> result = new ArrayList<Property>();
        for(State s : allContainedStates(self)) {
            result.addAll(s.getProperties());
        }
        return result;
    }

    
    public static List<CompositeState> allContainedCompositeStates(StateContainer self) {
        final List<CompositeState> result = new ArrayList<CompositeState>();
        for(State s : allContainedStates(self)) {
            if (s instanceof CompositeState) {
                result.add((CompositeState)s);
            }
        }
        return result;
    }


    public static List<State> allContainedSimpleStates(StateContainer self) {
        final List<State> result = allContainedStates(self);
        result.removeAll(allContainedCompositeStates(self));
        return result;
    }


    public static Set<Type> allUsedTypes(StateContainer self) {
        Set<Type> result = new HashSet<Type>();
        for(Property p : allContainedProperties(self)) {
            result.add(p.getTypeRef().getType());
        }
        return result;
    }


}
