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
package org.aiotml.annotations;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.aiotml.xtext.aiotML.AiotMLPackage;

public class AnnotationRegistry {

	public static Map<String, Annotation> annotations = new HashMap<>();
	
	static {
		
		final String compiler_name = "compiler";
		final String compiler_desc = "Specifies the compiler to be used by the auto compiler";
		final EClass compiler_scope[] = {AiotMLPackage.eINSTANCE.getConfiguration()};
		final Annotation compiler_annotation = new Annotation(compiler_name, compiler_desc, compiler_scope);
		annotations.put(compiler_name, compiler_annotation);
		
		/** MONITORING **/
		//@monitor
		final String monitor_name = "monitor";
		final String monitor_desc = "Generates monitoring instrumentation in a PIM way";
		final EClass monitor_scope[] = {AiotMLPackage.eINSTANCE.getAnnotatedElement()};
		final String monitor_values[] = {"not", "events", "functions", "properties"};
		final Annotation monitor_annotation = new EnumAnnotation(monitor_name, monitor_desc, monitor_scope, monitor_values);
		annotations.put(monitor_name, monitor_annotation);
		
		/** DEPLOYMENT **/
		//@docker
		final String docker_name = "docker";
		final String docker_desc = "Generates a Dockerfile for this configuration";
		final EClass docker_scope[] = {AiotMLPackage.eINSTANCE.getConfiguration()};
		final Annotation docker_annotation = new Annotation(docker_name, docker_desc, docker_scope);
		annotations.put(docker_name, docker_annotation);
		
		/** DEPS AND EXTERNS **/
		//@maven_dep
		final String maven_name = "maven_dep";
		final String maven_desc = "Adds a Maven dependency to the generated pom.xml file.";
		final EClass maven_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation maven_annotation = new Annotation(maven_name, maven_desc, maven_scope);
		annotations.put(maven_name, maven_annotation);
		
		//@java_interface
		final String jitf_name = "java_interface";
		final String jitf_desc = "Makes this Thing to implement that interface.";
		final EClass jitf_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation jitf_annotation = new Annotation(jitf_name, jitf_desc, jitf_scope);
		annotations.put(jitf_name, jitf_annotation);
		
		//@java_import
		final String jimp_name = "java_import";
		final String jimp_desc = "Adds an import to the generated code for this Thing.";
		final EClass jimp_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation jimp_annotation = new Annotation(jimp_name, jimp_desc, jimp_scope);
		annotations.put(jimp_name, jimp_annotation);
		
		//@java_features
		final String jfeat_name = "java_features";
		final String jfeat_desc = "Adds a standalone fragment of code into the generated code for this Thing.";
		final EClass jfeat_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation jfeat_annotation = new Annotation(jfeat_name, jfeat_desc, jfeat_scope);
		annotations.put(jfeat_name, jfeat_annotation);
		
		//@java_visibility
		final String jvis_name = "java_visibility";
		final String jvis_desc = "Changes the visibility of this function.";
		final EClass jvis_scope[] = {AiotMLPackage.eINSTANCE.getFunction()};
		final Annotation jvis_annotation = new Annotation(jvis_name, jvis_desc, jvis_scope);
		annotations.put(jvis_name, jvis_annotation);
		
		//@override
		final String over_name = "override";
		final String over_desc = "Marks this function as @Override.";
		final EClass over_scope[] = {AiotMLPackage.eINSTANCE.getFunction()};
		final Annotation over_annotation = new Annotation(over_name, over_desc, over_scope);
		annotations.put(over_name, over_annotation);
		
		//@go_import
		final String gimp_name = "go_import";
		final String gimp_desc = "Imports a Go package into the generated code for this Thing.";
		final EClass gimp_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation gimp_annotation = new Annotation(gimp_name, gimp_desc, gimp_scope);
		annotations.put(gimp_name, gimp_annotation);
		
		//@js_dep
		final String npm_name = "js_dep";
		final String npm_desc = "Adds an NPM dependecy to the generated package.json file.";
		final EClass npm_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation npm_annotation = new Annotation(npm_name, npm_desc, npm_scope);
		annotations.put(npm_name, npm_annotation);
		
		//@js_include
		final String jsinc_name = "js_include";
		final String jsinc_desc = "Includes a JS resource e.g. from a CDN or from a local file.";
		final EClass jsinc_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation jsinc_annotation = new Annotation(jsinc_name, jsinc_desc, jsinc_scope);
		annotations.put(jsinc_name, jsinc_annotation);
		
		//@c_header
		final String cheader_name = "c_header";
		final String cheader_desc = "Adds a header (.h) to the generated code for this Thing.";
		final EClass cheader_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation cheader_annotation = new Annotation(cheader_name, cheader_desc, cheader_scope);
		annotations.put(cheader_name, cheader_annotation);
		
		//@c_global
		final String cglobal_name = "c_global";
		final String cglobal_desc = "Adds a standalone fragment of code into the generated code for this Thing.";
		final EClass cglobal_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation cglobal_annotation = new Annotation(cglobal_name, cglobal_desc, cglobal_scope);
		annotations.put(cglobal_name, cglobal_annotation);
		
		//@fork_linux_thread
		final String cfork_name = "fork_linux_thread";
		final String cfork_desc = "Makes this function to run in a separate thread.";
		final EClass cfork_scope[] = {AiotMLPackage.eINSTANCE.getFunction()};
		final Annotation cfork_annotation = new Annotation(cfork_name, cfork_desc, cfork_scope);
		annotations.put(cfork_name, cfork_annotation);
		
		//@fork_thread
		final String fork_name = "fork_thread";
		final String fork_desc = "Makes this function to run in a separate thread.";
		final EClass fork_scope[] = {AiotMLPackage.eINSTANCE.getFunction()};
		final Annotation fork_annotation = new Annotation(fork_name, fork_desc, fork_scope);
		annotations.put(fork_name, fork_annotation);

		/** MESSAGES AND PORTS **/
		
		//@code
		final String code_name = "code";
		final String code_desc = "Sets a code to a given message. Used by serializers to identify messages.";
		final EClass code_scope[] = {AiotMLPackage.eINSTANCE.getMessage()};
		final Annotation code_annotation = new IntegerAnnotation(code_name, code_desc, code_scope, true);
		annotations.put(code_name, code_annotation);
		
		//@sync_send
		final String sync_name = "sync_send";
		final String sync_desc = "Makes a port syncrhonous";
		final EClass sync_scope[] = {AiotMLPackage.eINSTANCE.getPort()};
		final Annotation sync_annotation = new Annotation(sync_name, sync_desc, sync_scope);
		annotations.put(sync_name, sync_annotation);
		
		
		/** TYPES **/
		
		//@type_checker
		final String tc_name = "type_checker";
		final String tc_desc = "Specifies the abstract type of a AiotML-defined primitive type. Used by the type checker.";
		final EClass tc_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final String tc_values[] = {"Byte", "Integer", "Boolean", "Character", "String", "Real", "Void", "Object"};
		final Annotation tc_annotation = new EnumAnnotation(tc_name, tc_desc, tc_scope, tc_values);
		annotations.put(tc_name, tc_annotation);
		
		//@ignore
		final String ig_name = "ignore";
		final String ig_desc = "Ignores specific warnings raised by the checker";
		final EClass ig_scope[] = {AiotMLPackage.eINSTANCE.getAnnotatedElement()};
		final String ig_values[] = {"not-used", "sink", "type-warning"};
		final Annotation ig_annotation = new EnumAnnotation(ig_name, ig_desc, ig_scope, ig_values);
		annotations.put(ig_name, ig_annotation);
		
		//@c_type
		final String c_name = "c_type";
		final String c_desc = "Specifies the concrete C type of a AiotML-defined type.";
		final EClass c_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation c_annotation = new Annotation(c_name, c_desc, c_scope);
		annotations.put(c_name, c_annotation);
		
		//@go_type
		final String go_name = "go_type";
		final String go_desc = "Specifies the concrete Go type of a AiotML-defined type.";
		final EClass go_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation go_annotation = new Annotation(go_name, go_desc, go_scope);
		annotations.put(go_name, go_annotation);
		
		//@java_type
		final String java_name = "java_type";
		final String java_desc = "Specifies the concrete Java type of a AiotML-defined type.";
		final EClass java_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation java_annotation = new Annotation(java_name, java_desc, java_scope);
		annotations.put(java_name, java_annotation);
		
		//@js_type
		final String js_name = "js_type";
		final String js_desc = "Specifies the concrete JavaScript type of a AiotML-defined type.";
		final EClass js_scope[] = {AiotMLPackage.eINSTANCE.getType()};
		final Annotation js_annotation = new Annotation(js_name, js_desc, js_scope);
		annotations.put(js_name, js_annotation);
		
		/** DEBUG **/
		
		//@mock //FIXME: should actually be a flag...
		final String mock_name = "mock";
		final String mock_desc = "Generates a graphical mock-up for this thing.";
		final EClass mock_scope[] = {AiotMLPackage.eINSTANCE.getThing()};
		final Annotation mock_annotation = new Annotation(mock_name, mock_desc, mock_scope);
		annotations.put(mock_name, mock_annotation);
		
		final String html_body_name = "html_body";
		final String html_body_desc = "Content to be appended to HTML <body>, when using Browser compiler";
		final EClass html_body_scope[] = {AiotMLPackage.eINSTANCE.getConfiguration()};
		final Annotation html_body_annotation = new Annotation(html_body_name, html_body_desc, html_body_scope);
		annotations.put(html_body_name, html_body_annotation);

		final String html_head_name = "html_head";
		final String html_head_desc = "Content to be appended to HTML <head>, when using Browser compiler";
		final EClass html_head_scope[] = {AiotMLPackage.eINSTANCE.getConfiguration()};
		final Annotation html_head_annotation = new Annotation(html_head_name, html_head_desc, html_head_scope);
		annotations.put(html_head_name, html_head_annotation);
		
		final String stdout_sync_name = "stdout_sync";
		final String stdout_sync_desc = "Syncs prints to stdout";
		final EClass stdout_sync_scope[] = {AiotMLPackage.eINSTANCE.getConfiguration(), AiotMLPackage.eINSTANCE.getThing()};
		final Annotation stdout_sync_annotation = new Annotation(stdout_sync_name, stdout_sync_desc, stdout_sync_scope);
		annotations.put(stdout_sync_name, stdout_sync_annotation);
	}
	
	public static String toMD() {
		final StringBuilder builder = new StringBuilder();
		builder.append("# List of officially-supported annotations\n\n");
		
		annotations.values().stream().sorted(Comparator.comparing(Annotation::getName)).forEach(a -> {
			builder.append("## @" + a.name + "\n\n");
			builder.append("- *description*: " + a.description + "\n");
			builder.append("- *applies to*: " + ((a.scope == null || a.scope.length == 0)? "all" : a.scopeToString()) + "\n\n");
		});

		return builder.toString();
	}
	
	public static List<String> availableAnnotations(EObject o) {
		final List<String> result = new ArrayList<>();
		for(Annotation a : annotations.values()) {
			for(EClass clazz : a.scope) {
				if (clazz.isInstance(o)) {
					result.add(a.name);
					break;
				}
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		System.out.println(toMD());
	}
}
