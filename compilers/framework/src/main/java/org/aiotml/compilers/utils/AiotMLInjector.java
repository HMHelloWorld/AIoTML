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
package org.aiotml.compilers.utils;

import java.io.StringReader;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.impl.ListBasedDiagnosticConsumer;
import org.eclipse.xtext.xtext.XtextLinker;
import org.aiotml.xtext.AiotMLStandaloneSetup;
import org.aiotml.xtext.parser.antlr.AiotMLParser;
import org.aiotml.xtext.services.AiotMLGrammarAccess;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class AiotMLInjector {
	@Inject
	private AiotMLParser parser;
	@Inject
	private XtextLinker linker;
	
	private AiotMLInjector() {
		Injector inj = new AiotMLStandaloneSetup().createInjectorAndDoEMFRegistration();
		inj.injectMembers(this);
	}
	
	private static AiotMLInjector instance = new AiotMLInjector();
	
	public static AiotMLGrammarAccess grammar() { return instance.parser.getGrammarAccess(); }
	
	@SuppressWarnings("unchecked")
	public static <T extends EObject> T parseString(ParserRule rule, String text) {
		IParseResult result = instance.parser.parse(rule, new StringReader(text));
		if (!result.hasSyntaxErrors())
			return (T)result.getRootASTElement();
		else {
			String msg = "";
			for (INode node : result.getSyntaxErrors())
				msg += node.getSyntaxErrorMessage()+"\n";
			throw new RuntimeException(msg);
		}
	}
	
	public static void linkFrom(EObject root) {
		ListBasedDiagnosticConsumer consumer = new ListBasedDiagnosticConsumer();
		instance.linker.linkModel(root, consumer);
		// I don't think we need a resolveAll() here...
		// TODO: Maybe we should throw an error here when it fails to link?
		List<Diagnostic> errors = consumer.getResult(Severity.ERROR);
		if (!errors.isEmpty()) {
			String msg = "";
			for (Diagnostic error : errors)
				msg += error.getMessage()+"\n";
			throw new RuntimeException(msg);
		}
	}
}
