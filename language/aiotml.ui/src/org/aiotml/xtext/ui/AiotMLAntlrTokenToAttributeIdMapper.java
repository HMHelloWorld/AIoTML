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
package org.aiotml.xtext.ui;

import java.util.HashSet;
import java.util.regex.Pattern;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.aiotml.xtext.ide.contentassist.antlr.internal.InternalAiotMLLexer;


public class AiotMLAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
	HashSet<String> otherNotes = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'dim'","'af'","'relu'", "'sigmoid'" ,  "'number'", "'Discrete'" }));
	
	HashSet<String> modelAndStrategy = new HashSet<String>(java.util.Arrays.asList(new String[]
			{ "'fully_connected'", "'observation'" , "'reward'", "'agent'"
					,"'action_space'", "'p_function'", "'q_function'", "'input'", "'output'"}));
	HashSet<String> typesAndMessages = new HashSet<String>(java.util.Arrays.asList(new String[]
					{"'mlp'","'strategy'","'thing'", "'subthing'","'model'", "'fragment'", "'readonly'", "'includes'", "'datatype'", "'object'", "'enumeration'"
							, "'sends'", "'receives'", "'port'", "'provided'", "'required'", "'protocol'"
							, "'optional'", "'message'", "'property'", "'cproperty'","'->>'"}));
	
	HashSet<String> statemachine = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'function'", "'abstract'", "'state'", "'final'", "'composite'", "'statechart'", "'event'", "'guard'"
					, "'action'", "'on'", "'entry'", "'exit'", "'region'"
					, "'init'", "'keeps'", "'history'", "'exit'", "'->'"
					, "'session'", "'internal'", "'transition'", "'?'"}));
	
	HashSet<String> action = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'bind'","'>>'","'using'", "'var'", "'return'", "'do'", "'end'", "'if'", "'else'", "'while'", "'for'", "'in'"
					, "'print'", "'println'", "'error'", "'errorln'", "'not'", "'and'", "'or'"
					, "'init'", "'keeps'", "'history'", "'exit'", "'->'"
					, "'fork'", "'set'", "'as'", "'!'"}));
	
	HashSet<String> configuration = new HashSet<String>(java.util.Arrays.asList(new String[]
			{"'configuration'", "'instance'", "'connector'", "'over'", "'=>'"}));
	//"'cproperty"
//	HashSet<String> cproperty = new HashSet<String>(java.util.Arrays.asList(new String[]
//			{"'cproperty'"}));
	
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		
		switch(tokenType) {
		case InternalAiotMLLexer.RULE_ANNOTATION_ID:
			return AiotMLHighlightingConfiguration.ANNOTATIONS_ID;
		case InternalAiotMLLexer.RULE_FLOAT:
		case InternalAiotMLLexer.RULE_INT:
		case InternalAiotMLLexer.RULE_CHAR:
		case InternalAiotMLLexer.RULE_BYTE:
		case InternalAiotMLLexer.RULE_STRING:
			return AiotMLHighlightingConfiguration.DEFAULT_LITERAL_ID;
		case InternalAiotMLLexer.RULE_ML_COMMENT:
		case InternalAiotMLLexer.RULE_SL_COMMENT:
			return AiotMLHighlightingConfiguration.COMMENTS_ID;
		case InternalAiotMLLexer.RULE_EXTERN:
			return AiotMLHighlightingConfiguration.EXTERN_ID;
		case InternalAiotMLLexer.RULE_ANY_OTHER: 
			return AiotMLHighlightingConfiguration.DEFAULT_TEXT_ID;
		default:
			break;
		}
		
		if (otherNotes.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.OTHER_NOTES_ID;
		
		if (modelAndStrategy.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.MODEL_AND_STRATEGY_ID;
		
		if (typesAndMessages.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.TYPES_AND_MESSAGES_ID;
		
		if (statemachine.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.STATEMACHINE_ID;
		
		if (action.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.ACTIONS_ID;
		
		if (configuration.contains(tokenName)) 
			return AiotMLHighlightingConfiguration.CONFIGURATION_ID;
		
		
		return AiotMLHighlightingConfiguration.DEFAULT_TEXT_ID;
	}

}
