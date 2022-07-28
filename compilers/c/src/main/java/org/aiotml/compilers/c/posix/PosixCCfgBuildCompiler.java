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

import java.io.File;
import java.util.Set;

import org.aiotml.compilers.Context;
import org.aiotml.compilers.c.CCompilerContext;
import org.aiotml.compilers.configuration.CfgBuildCompiler;
import org.aiotml.xtext.helpers.AnnotatedElementHelper;
import org.aiotml.xtext.helpers.ConfigurationHelper;
import org.aiotml.xtext.aiotML.AnnotatedElement;
import org.aiotml.xtext.aiotML.Configuration;
import org.aiotml.xtext.aiotML.Thing;

/**
 * Created by ffl on 17.06.15.
 */
public class PosixCCfgBuildCompiler extends CfgBuildCompiler {


    @Override
    public void generateBuildScript(Configuration cfg, Context ctx) {
        generateLinuxMakefile(cfg, (CCompilerContext) ctx);
    }
    
    @Override
    public String getDockerBaseImage(Configuration cfg, Context ctx) {
        return "debian:stable-slim";
    }
    
    public String getRunScriptRunCommand(Configuration cfg, Context ctx) {
    	return "./" + cfg.getName() + " &\n"
    			+ "PID=$!\n";
    }
    
    @Override
    public String getDockerCMD(Configuration cfg, Context ctx) {
        return "./" + cfg.getName(); 
    }
    
    @Override
    public String getDockerCfgRunPath(Configuration cfg, Context ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append("RUN apt-get update && apt-get install -y build-essential && rm -rf /var/lib/apt/lists/*\n");
        builder.append("COPY . .\n");
        builder.append("RUN make\n");        
        if(AnnotatedElementHelper.isDefined(cfg, "c_static_linking", "true") && !AnnotatedElementHelper.isDefined(cfg, "docker", "perf")) {
        	builder.append("FROM scratch\n");
        	builder.append("COPY --from=0 " + cfg.getName() + " " + cfg.getName());
        }                        
        return builder.toString();
    }

    protected String getSourceFileName(Thing thing) {
        return thing.getName() + ".c ";
    }

    protected String getObjectFileName(Thing thing) {
        return thing.getName() + ".o ";
    }

    protected String getThirdPartyLibraries(Thing thing) { return ""; }
  
    protected void includeExternalModules(AnnotatedElement element, StringBuilder sources, StringBuilder objects, CCompilerContext ctx) {
        for (String s : AnnotatedElementHelper.annotation(element, "add_c_modules")) {
            String[] mods = s.split(" ");
            for (int i = 0; i < mods.length; i++) {
                sources.append(mods[i].trim() + ".c ");
                objects.append(mods[i].trim() + ".o ");
              
                
                
                // If .c (and .h) files exist in the current input directory, copy them to the output
                // TODO: Jakob, paths within the output??
                File indir = ctx.getInputDirectory();
                File cfile = new File(indir, mods[i].trim() + ".c");              
                
                System.out.println(" ctx.getInputDirectory() = " + indir + "\n");
                
                if (cfile.exists()) {
                    ctx.addFileToCopy(mods[i].trim() + ".c", cfile);
                    File hfile = new File(indir, mods[i].trim() + ".h");
                    if (hfile.exists()) {
                        ctx.addFileToCopy(mods[i].trim() + ".h", hfile);
                    }
                }
            }
        }
    }

    protected void generateLinuxMakefile(Configuration cfg, CCompilerContext ctx) {

        //GENERATE THE MAKEFILE
        String mtemplate = ctx.getTemplateByID("ctemplates/Makefile");
        mtemplate = mtemplate.replace("/*NAME*/", cfg.getName());

        String compiler = "cc"; // default value
        if (AnnotatedElementHelper.hasAnnotation(cfg, "c_compiler")) {
        	compiler = AnnotatedElementHelper.annotation(cfg, "c_compiler").iterator().next();
        	mtemplate = mtemplate.replace("# CC = /*CC*/", "CC = " + compiler);
        }
        

        String flags;
        if (ctx.enableDebug()) flags = "CFLAGS = -DDEBUG";
        else flags = "CFLAGS = -O2 -w";
        for (String s : AnnotatedElementHelper.annotation(cfg, "add_c_flags")) {
            flags += " " + s;
        }
        mtemplate = mtemplate.replace("/*CFLAGS*/", flags);
      
        StringBuilder srcs = new StringBuilder();
        StringBuilder objs = new StringBuilder();

        // Add the modules for the Things
        for (Thing t : ConfigurationHelper.allThings(cfg)) {
        	srcs.append(getSourceFileName(t));
            objs.append(getObjectFileName(t));
            // Add any additional modules from the annotations
            includeExternalModules(t, srcs, objs, ctx);
        }

        // Add the module for the Configuration
        srcs.append(cfg.getName() + "_cfg.c ");
        objs.append(cfg.getName() + "_cfg.o ");

        // Add any additional modules from the annotations
        includeExternalModules(cfg, srcs, objs, ctx);
      

        String libs = "";
        for (String s : AnnotatedElementHelper.annotation(cfg, "add_c_libraries")) {
            String[] strs = s.split(" ");
            for (int i = 0; i < strs.length; i++) {
                libs += "-l " + strs[i].trim() + " ";
            }
        }
        for (String s : AnnotatedElementHelper.annotation(cfg, "add_c_libraries_rep")) {
            String[] strs = s.split(" ");
            for (int i = 0; i < strs.length; i++) {
                libs += "-L " + strs[i].trim() + " ";
            }
        }
        libs = libs.trim();

        String preproc = "";
        for (String s : AnnotatedElementHelper.annotation(cfg, "add_c_directives")) {
            String[] strs = s.split(" ");
            for (int i = 0; i < strs.length; i++) {
                preproc += "-D " + strs[i].trim() + " ";
            }
        }
        preproc = preproc.trim();
        
        if(AnnotatedElementHelper.isDefined(cfg, "c_static_linking", "true") || ctx.staticLinking) {
            mtemplate = mtemplate.replace("/*STATIC*/", "-static ");
        } else {
            mtemplate = mtemplate.replace("/*STATIC*/", "");
        }

        // Add network plugin generated source and object files
        Set<String> networkPluginFiles = ctx.getNetworkPluginFiles();
        for (String cfile : networkPluginFiles) {
            String ofile;
            if (cfile.endsWith(".c")) {
                ofile = cfile.substring(0, cfile.length()-2)+".o";
            } else {
                ofile = cfile+".o";
                cfile = cfile+".c";
            }
            srcs.append(cfile+" ");
            objs.append(ofile+" ");
        }

        mtemplate = mtemplate.replace("/*SOURCES*/", srcs.toString().trim());
        mtemplate = mtemplate.replace("/*OBJECTS*/", objs.toString().trim());
        mtemplate = mtemplate.replace("/*LIBS*/", libs);
        mtemplate = mtemplate.replace("/*PREPROC_DIRECTIVES*/", preproc);

        ctx.getBuilder("Makefile").append(mtemplate);
    }
}
