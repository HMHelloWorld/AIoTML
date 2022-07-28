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
package org.aiotml.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.aiotml.xtext.validation.checks.Annotations;
import org.aiotml.xtext.validation.checks.AutotransitionCycles;
import org.aiotml.xtext.validation.checks.ControlStructures;
import org.aiotml.xtext.validation.checks.Datatypes;
import org.aiotml.xtext.validation.checks.FunctionUsage;
import org.aiotml.xtext.validation.checks.Imports;
import org.aiotml.xtext.validation.checks.LostMessages;
import org.aiotml.xtext.validation.checks.MessageUsage;
import org.aiotml.xtext.validation.checks.PortsUsage;
import org.aiotml.xtext.validation.checks.PropertyInitialization;
import org.aiotml.xtext.validation.checks.StateUsage;
import org.aiotml.xtext.validation.checks.ThingsUsage;
import org.aiotml.xtext.validation.checks.TransitionUsage;
import org.aiotml.xtext.validation.checks.VariableUsage;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;
import org.eclipse.xtext.validation.ComposedChecks;

@ComposedChecks(validators = {FunctionUsage.class, VariableUsage.class, ThingsUsage.class, StateUsage.class, TransitionUsage.class, MessageUsage.class, AutotransitionCycles.class, PortsUsage.class, ControlStructures.class, LostMessages.class, PropertyInitialization.class, Imports.class, Datatypes.class, Annotations.class})
public abstract class AbstractAiotMLValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(org.aiotml.xtext.aiotML.AiotMLPackage.eINSTANCE);
		return result;
	}
}
