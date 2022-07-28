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
package org.aiotml.compilers.c.teensy;

import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.c.CCfgMainGenerator;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.compilers.c.CThingActionCompiler;
import org.aiotml.compilers.c.CThingImplCompiler;
import org.aiotml.compilers.utils.OpaqueAiotMLCompiler;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Thing;

@Deprecated
public class TeensyCompiler extends OpaqueAiotMLCompiler{

	public TeensyCompiler() {
		super(new CThingActionCompiler(), new CThingApiCompilerTeensy(), new CCfgMainGenerator(),
                new TeensyCCfgBuildCompiler(), new CThingImplCompiler());
	}

	@Override
    public boolean do_call_compiler(Configuration cfg, Logger log, String... options) {

		CCompilerContext ctx = new CCompilerContextTeensy(this);
        ctx.setCurrentConfiguration(cfg);
        //ctx.setOutputDirectory(new File(ctx.getOutputDirectory(), cfg.getName()));

        // GENERATE A MODULE FOR EACH THING
        for (Thing thing : ConfigurationHelper.allThings(cfg)) {
            ctx.setConcreteThing(thing);

            // GENERATE HEADER
            ctx.getCompiler().getThingApiCompiler().generatePublicAPI(thing, ctx);

            // GENERATE IMPL
            ctx.getCompiler().getThingImplCompiler().generateImplementation(thing, ctx);
            ctx.clearConcreteThing();
        }

        // GENERATE A MODULE FOR THE CONFIGURATION (+ its dependencies)
        getMainCompiler().generateMainAndInit(cfg, AiotMLHelpers.findContainingModel(cfg), ctx);

        // GENERATE A MAKEFILE
        getCfgBuildCompiler().generateBuildScript(cfg, ctx);
        // WRITE THE GENERATED CODE
        ctx.writeGeneratedCodeToFiles();
		
        return true;
	}

	@Override
	public AiotMLCompiler clone() {
		return new TeensyCompiler();
	}

	@Override
	public String getID() {
		return "teensy";
	}

	@Override
	public String getName() {
		return "C++ for Teensy 3.X (ARM Microcontrollers)";
	}

	@Override
	public String getDescription() {
		return "Generates C++ code for Teensy 3.X microcontrollers (arm-none-eabi compiler).";
	}

}
