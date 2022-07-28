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
package org.aiotml.compilers.uml;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.configuration.CfgBuildCompiler;
import org.aiotml.compilers.configuration.CfgMainGenerator;
import org.aiotml.compilers.thing.ThingActionCompiler;
import org.aiotml.compilers.thing.ThingApiCompiler;
import org.aiotml.compilers.thing.common.FSMBasedThingImplCompiler;
import org.aiotml.compilers.utils.OpaqueAiotMLCompiler;
import org.aiotml.compilers.utils.AiotMLPrettyPrinter;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.CompositeState;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Thing;
import org.aiotml.xtext.aiotML.AiotMLModel;

//FIXME: Should use the file writing method provided by the wonderful context class

public class PlantUMLCompiler extends OpaqueAiotMLCompiler {

    public PlantUMLCompiler() {
        super(new AiotMLPrettyPrinter(), new ThingApiCompiler(), new PlantUMLCfgMainGenerator(),
                new CfgBuildCompiler(), new PlantUMLThingImplCompiler());
    }

    public PlantUMLCompiler(ThingActionCompiler thingActionCompiler, ThingApiCompiler thingApiCompiler, CfgMainGenerator mainCompiler, CfgBuildCompiler cfgBuildCompiler, FSMBasedThingImplCompiler thingImplCompiler) {
        super(thingActionCompiler, thingApiCompiler, mainCompiler, cfgBuildCompiler, thingImplCompiler);
    }

    @Override
    public AiotMLCompiler clone() {
        return new PlantUMLCompiler();
    }

    @Override
    public String getID() {
        return "uml";
    }

    @Override
    public String getName() {
        return "Export to PlantUML";
    }

    public String getDescription() {
        return "Generates UML diagrams in PlantUML";
    }

    @Override
    public boolean do_call_compiler(final Configuration cfg, Logger log, String... options) {
        ctx.setCurrentConfiguration(cfg);
        compile(cfg, AiotMLHelpers.findContainingModel(cfg), true, ctx);
        ctx.writeGeneratedCodeToFiles();
        return true;
    }

    private void compile(Configuration t, AiotMLModel model, boolean isNode, Context ctx) {
    	final PlantUMLThingImplCompiler plantUMLcompiler = ((PlantUMLThingImplCompiler)ctx.getCompiler().getThingImplCompiler());
    	final AiotMLPrettyPrinter prettyPrinter = ((AiotMLPrettyPrinter)ctx.getCompiler().getThingActionCompiler());
    	
    	plantUMLcompiler.FACTORIZE_TRANSITIONS = false;
    	plantUMLcompiler.COMPACT = false;
    	prettyPrinter.USE_ELLIPSIS_FOR_PARAMS = false;
    	prettyPrinter.HIDE_BLOCKS = false;
    	prettyPrinter.MAX_BLOCK_SIZE = 5;
    	for (Thing th : ConfigurationHelper.allThings(t)) {
        	for (CompositeState sm : AiotMLHelpers.allStateMachines(th)) {
        		plantUMLcompiler.generateState(sm, ctx.getBuilder("detailed/" + th.getName() + "_" + sm.getName() + ".plantuml"), ctx);
            }            
        }
    	
    	plantUMLcompiler.FACTORIZE_TRANSITIONS = true;
    	plantUMLcompiler.COMPACT = true;
    	prettyPrinter.USE_ELLIPSIS_FOR_PARAMS = true;
    	prettyPrinter.HIDE_BLOCKS = true;
    	prettyPrinter.MAX_BLOCK_SIZE = 0;
    	for (Thing th : ConfigurationHelper.allThings(t)) {
            for (CompositeState sm : AiotMLHelpers.allStateMachines(th)) {
            	plantUMLcompiler.generateState(sm, ctx.getBuilder(th.getName() + "_" + sm.getName() + ".plantuml"), ctx);
            }
            
        }
    	
        getMainCompiler().generateMainAndInit(t, model, ctx);
    }
}
