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
package org.aiotml.compilers.c.posix;

import org.aiotml.compilers.AiotMLCompiler;
import org.aiotml.compilers.c.CCfgMainGenerator;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.compilers.c.CThingApiCompiler;
import org.aiotml.compilers.c.CThingImplCompiler;
import org.aiotml.compilers.c.posixmt.PosixMTCfgMainGenerator;
import org.aiotml.compilers.c.posixmt.PosixMTThingActionCompiler;
import org.aiotml.compilers.c.posixmt.PosixMTThingApiCompiler;
import org.aiotml.compilers.c.posixmt.PosixMTThingImplCompiler;
import org.aiotml.compilers.utils.OpaqueAiotMLCompiler;
import org.aiotml.utilities.logging.Logger;
import org.aiotml.xtext.constraints.AiotMLHelpers;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Thing;

/**
 * Created by ffl on 25.11.14.
 */
public class PosixCompiler extends OpaqueAiotMLCompiler {
	
	protected CCompilerContext ctx;

    public PosixCompiler() {
        super(new CThingActionCompilerPosix(), new CThingApiCompiler(),
                new CCfgMainGenerator(), new PosixCCfgBuildCompiler(),
                new CThingImplCompiler());        
    }

    public PosixCompiler(PosixMTThingActionCompiler posixMTThingActionCompiler,
			PosixMTThingApiCompiler posixMTThingApiCompiler, PosixMTCfgMainGenerator posixMTCfgMainGenerator,
			PosixCCfgBuildCompiler posixCCfgBuildCompiler, PosixMTThingImplCompiler posixMTThingImplCompiler) {
    	super(posixMTThingActionCompiler, posixMTThingApiCompiler,
    			posixMTCfgMainGenerator, posixCCfgBuildCompiler,
    			posixMTThingImplCompiler);
	}

	@Override
    public AiotMLCompiler clone() {
        return new PosixCompiler();
    }

    @Override
    public String getID() {
        return "posix";
    }

    @Override
    public String getName() {
        return "C/C++ for Linux / Posix";
    }

    public String getDescription() {
        return "Generates C/C++ code for Linux or other Posix runtime environments (GCC compiler).";
    }

    protected void setContext(Configuration cfg) {
    	ctx = new CCompilerContextPosix(this);        
    }
    
    @Override
    public boolean do_call_compiler(Configuration cfg, Logger log, String... options) {
    	setContext(cfg);
        ctx.setCurrentConfiguration(cfg);
        ctx.setInputDirectory(getInputDirectory());
                
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

        //GENERATE A DOCKERFILE IF ASKED
        ctx.getCompiler().getCfgBuildCompiler().generateDockerFile(cfg, ctx);
        
        // GENERATE A MAKEFILE
        getCfgBuildCompiler().generateBuildScript(cfg, ctx);

        // WRITE THE GENERATED CODE
        ctx.writeGeneratedCodeToFiles();
      
        // COPY OUTPUT FILES
        ctx.copyFilesToOutput();
        
        return true;
    }
    
}
