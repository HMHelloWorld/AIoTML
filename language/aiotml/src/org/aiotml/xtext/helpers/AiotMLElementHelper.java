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

import org.eclipse.emf.ecore.EObject;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Handler;
import org.aiotml.xtext.aiotML.NamedElement;
import org.aiotml.xtext.aiotML.Region;
import org.aiotml.xtext.aiotML.State;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;

/**
 * Created by ffl on 10.05.2016.
 */
public class AiotMLElementHelper {


    public static AiotMLModel findContainingModel(EObject self) {
        return AiotMLHelpers.findContainingModel(self);
    }


    public static Thing findContainingThing(EObject self) {
        return AiotMLHelpers.findContainingThing(self);
    }


    public static Configuration findContainingConfiguration(EObject self) {
        return AiotMLHelpers.findContainingConfiguration(self);
    }

    public static State findContainingState(EObject self) {
        return AiotMLHelpers.findContainingState(self);
    }


    public static Region findContainingRegion(EObject self) {
        return AiotMLHelpers.findContainingRegion(self);
    }


    public static Handler findContainingHandler(EObject self) {
        return AiotMLHelpers.findContainingHandler(self);
    }


    public static String qname(NamedElement self, String separator) {
        if (separator == null) {
            separator = "::";
        }
        
        String result = null;
        NamedElement elem  = self;
        String name = null;
        while(elem != null) {
            name = elem.getName();
            if (result == null) result = name;
            else result = name + separator + result;
            if (elem.eContainer() != null && elem.eContainer() instanceof NamedElement)
                elem = (NamedElement) elem.eContainer();
            else elem = null;
        }
        return result;
    }
    
    public static String getName(EObject self) {
    	if (self instanceof NamedElement) return ((NamedElement)self).getName();
    	else return null;
    	
    }

}
