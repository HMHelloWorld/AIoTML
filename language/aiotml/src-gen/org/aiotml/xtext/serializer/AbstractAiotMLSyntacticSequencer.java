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
package org.aiotml.xtext.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.aiotml.xtext.services.AiotMLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractAiotMLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AiotMLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Agent___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q;
	protected AbstractElementAlias match_Message_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_ObjectType_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_PrimitiveType_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_Protocol_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_Strategy___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a__a;
	protected AbstractElementAlias match_Strategy___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p__a;
	protected AbstractElementAlias match_Strategy___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p__a;
	protected AbstractElementAlias match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a;
	protected AbstractElementAlias match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a;
	protected AbstractElementAlias match_Strategy___RightCurlyBracketKeyword_3_2_4_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__p;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_4_6_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__p;
	protected AbstractElementAlias match_Strategy___RightParenthesisKeyword_3_5_6_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a;
	protected AbstractElementAlias match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p;
	protected AbstractElementAlias match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p;
	protected AbstractElementAlias match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p;
	protected AbstractElementAlias match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a;
	protected AbstractElementAlias match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p;
	protected AbstractElementAlias match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p;
	protected AbstractElementAlias match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p;
	protected AbstractElementAlias match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AiotMLGrammarAccess) access;
		match_Agent___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAgentAccess().getLeftSquareBracketKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAgentAccess().getRightSquareBracketKeyword_2_2()));
		match_Message_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getMessageAccess().getSemicolonKeyword_6());
		match_ObjectType_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getObjectTypeAccess().getSemicolonKeyword_3());
		match_PrimitiveType_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getPrimitiveTypeAccess().getSemicolonKeyword_6());
		match_Protocol_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getProtocolAccess().getSemicolonKeyword_3());
		match_Strategy___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()), new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))));
		match_Strategy___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))));
		match_Strategy___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()))));
		match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()), new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()));
		match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()));
		match_Strategy___RightCurlyBracketKeyword_3_2_4_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()));
		match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()));
		match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()));
		match_Strategy___RightParenthesisKeyword_3_4_6_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()));
		match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()));
		match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()));
		match_Strategy___RightParenthesisKeyword_3_5_6_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6()), new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4()))), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()));
		match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())));
		match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())));
		match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())));
		match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a = new AlternativeAlias(true, true, new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())));
		match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())));
		match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())));
		match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDeviceKeyword_3_2_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_2_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftCurlyBracketKeyword_3_2_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightCurlyBracketKeyword_3_2_4())));
		match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p = new GroupAlias(true, false, new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRewardsKeyword_3_4_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_4_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_4_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_4_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_4_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_4_6())), new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getStrategyAccess().getObservationKeyword_3_5_0()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getColonKeyword_3_5_1()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getDimKeyword_3_5_2()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getEqualsSignKeyword_3_5_3()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getLeftParenthesisKeyword_3_5_4()), new TokenAlias(false, false, grammarAccess.getStrategyAccess().getRightParenthesisKeyword_3_5_6())));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Agent___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q.equals(syntax))
				emit_Agent___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Message_SemicolonKeyword_6_q.equals(syntax))
				emit_Message_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ObjectType_SemicolonKeyword_3_q.equals(syntax))
				emit_ObjectType_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PrimitiveType_SemicolonKeyword_6_q.equals(syntax))
				emit_PrimitiveType_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Protocol_SemicolonKeyword_3_q.equals(syntax))
				emit_Protocol_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a__a.equals(syntax))
				emit_Strategy___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p__a.equals(syntax))
				emit_Strategy___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p__a.equals(syntax))
				emit_Strategy___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a.equals(syntax))
				emit_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a.equals(syntax))
				emit_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightCurlyBracketKeyword_3_2_4_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a.equals(syntax))
				emit_Strategy___RightCurlyBracketKeyword_3_2_4_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__p.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_4_6_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_4_6_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__p.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy___RightParenthesisKeyword_3_5_6_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a.equals(syntax))
				emit_Strategy___RightParenthesisKeyword_3_5_6_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p.equals(syntax))
				emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p.equals(syntax))
				emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p.equals(syntax))
				emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a.equals(syntax))
				emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p.equals(syntax))
				emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p.equals(syntax))
				emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p.equals(syntax))
				emit_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p.equals(syntax))
				emit_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('[' ']')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ID (ambiguity) amodel=StrategyProperty
	 */
	protected void emit_Agent___LeftSquareBracketKeyword_2_0_RightSquareBracketKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID '(' ')' (ambiguity) (rule end)
	 *     parameters+=Parameter ')' (ambiguity) (rule end)
	 */
	protected void emit_Message_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_ObjectType_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     ByteSize=INT '>' (ambiguity) (rule end)
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 */
	protected void emit_PrimitiveType_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annotations+=PlatformAnnotation (ambiguity) (rule end)
	 *     name=ID (ambiguity) (rule end)
	 */
	protected void emit_Protocol_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'device' 
	  *         ':' 
	  *         '{' 
	  *         '}' 
	  *         (
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             ) | 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )
	  *         )*
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'input' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'output' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) 'reward' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) '}' (rule end)
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* (ambiguity) '}' annotations+=PlatformAnnotation
	 */
	protected void emit_Strategy___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'observation' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '(' 
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'input' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'output' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'reward' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) '}' (rule end)
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ (ambiguity) '}' annotations+=PlatformAnnotation
	 */
	protected void emit_Strategy___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         'rewards' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '(' 
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'input' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'output' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) 'reward' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) '}' (rule end)
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ (ambiguity) '}' annotations+=PlatformAnnotation
	 */
	protected void emit_Strategy___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '}' 
	  *         (
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             ) | 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )
	  *         )* 
	  *         'device' 
	  *         ':' 
	  *         '{'
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* 'device' ':' '{' (ambiguity) devices+=Cproperty
	 *     devices+=Cproperty (ambiguity) devices+=Cproperty
	 *     name=ID '{' (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* 'device' ':' '{' (ambiguity) devices+=Cproperty
	 *     pmodel=ModelReference (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* 'device' ':' '{' (ambiguity) devices+=Cproperty
	 *     qmodel=ModelReference (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* 'device' ':' '{' (ambiguity) devices+=Cproperty
	 *     tensor=Tensor (('rewards' ':' 'dim' '=' '(' ')') | ('observation' ':' 'dim' '=' '(' ')'))* 'device' ':' '{' (ambiguity) devices+=Cproperty
	 */
	protected void emit_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '}' 
	  *         (
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )? 
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'device' 
	  *         ':' 
	  *         '{'
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     rewdims+=IntegerLiteral ')' (('observation' ':' 'dim' '=' '(' ')')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'device' ':' '{' (ambiguity) devices+=Cproperty
	 */
	protected void emit_Strategy___RightCurlyBracketKeyword_3_2_4_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         '}' 
	  *         (
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )? 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'device' 
	  *         ':' 
	  *         '{'
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     obsdims+=IntegerLiteral ')' (('rewards' ':' 'dim' '=' '(' ')')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'device' ':' '{' (ambiguity) devices+=Cproperty
	 */
	protected void emit_Strategy___RightCurlyBracketKeyword_3_2_4_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'rewards' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 *     name=ID '{' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 *     obsdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 *     pmodel=ModelReference (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 *     qmodel=ModelReference (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 *     tensor=Tensor (('device' ':' '{' '}')? ('observation' ':' 'dim' '=' '(' ')')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'rewards' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     rewdims+=IntegerLiteral (ambiguity) rewdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_4_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             (
	  *                 'observation' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )? 
	  *             ('device' ':' '{' '}')?
	  *         )+ 
	  *         'rewards' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     devices+=Cproperty '}' (('observation' ':' 'dim' '=' '(' ')')? ('device' ':' '{' '}')?)+ 'rewards' ':' 'dim' '=' '(' (ambiguity) rewdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_4_6_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'observation' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 *     name=ID '{' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 *     pmodel=ModelReference (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 *     qmodel=ModelReference (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 *     rewdims+=IntegerLiteral ')' (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 *     tensor=Tensor (('device' ':' '{' '}')? ('rewards' ':' 'dim' '=' '(' ')')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             ('device' ':' '{' '}')? 
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )?
	  *         )+ 
	  *         'observation' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     obsdims+=IntegerLiteral (ambiguity) obsdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_5_6_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ')' 
	  *         (
	  *             (
	  *                 'rewards' 
	  *                 ':' 
	  *                 'dim' 
	  *                 '=' 
	  *                 '(' 
	  *                 ')'
	  *             )? 
	  *             ('device' ':' '{' '}')?
	  *         )+ 
	  *         'observation' 
	  *         ':' 
	  *         'dim' 
	  *         '=' 
	  *         '('
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     devices+=Cproperty '}' (('rewards' ':' 'dim' '=' '(' ')')? ('device' ':' '{' '}')?)+ 'observation' ':' 'dim' '=' '(' (ambiguity) obsdims+=IntegerLiteral
	 */
	protected void emit_Strategy___RightParenthesisKeyword_3_5_6_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p_ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ('device' ':' '{' '}')? 
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )? 
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'input' ':' tensor=Tensor
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'output' ':' tensor=Tensor
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'reward' ':' tensor=Tensor
	 *     actiondims+=IntegerLiteral ')' (ambiguity) '}' (rule end)
	 *     actiondims+=IntegerLiteral ')' (ambiguity) '}' annotations+=PlatformAnnotation
	 *     name=ID '{' (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     name=ID '{' (ambiguity) 'input' ':' tensor=Tensor
	 *     name=ID '{' (ambiguity) 'output' ':' tensor=Tensor
	 *     name=ID '{' (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     name=ID '{' (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     name=ID '{' (ambiguity) 'reward' ':' tensor=Tensor
	 *     name=ID '{' (ambiguity) '}' (rule end)
	 *     name=ID '{' (ambiguity) '}' annotations+=PlatformAnnotation
	 *     pmodel=ModelReference (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     pmodel=ModelReference (ambiguity) 'input' ':' tensor=Tensor
	 *     pmodel=ModelReference (ambiguity) 'output' ':' tensor=Tensor
	 *     pmodel=ModelReference (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     pmodel=ModelReference (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     pmodel=ModelReference (ambiguity) 'reward' ':' tensor=Tensor
	 *     pmodel=ModelReference (ambiguity) '}' (rule end)
	 *     pmodel=ModelReference (ambiguity) '}' annotations+=PlatformAnnotation
	 *     qmodel=ModelReference (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     qmodel=ModelReference (ambiguity) 'input' ':' tensor=Tensor
	 *     qmodel=ModelReference (ambiguity) 'output' ':' tensor=Tensor
	 *     qmodel=ModelReference (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     qmodel=ModelReference (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     qmodel=ModelReference (ambiguity) 'reward' ':' tensor=Tensor
	 *     qmodel=ModelReference (ambiguity) '}' (rule end)
	 *     qmodel=ModelReference (ambiguity) '}' annotations+=PlatformAnnotation
	 *     tensor=Tensor (ambiguity) 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     tensor=Tensor (ambiguity) 'input' ':' tensor=Tensor
	 *     tensor=Tensor (ambiguity) 'output' ':' tensor=Tensor
	 *     tensor=Tensor (ambiguity) 'p_function' ':' pmodel=ModelReference
	 *     tensor=Tensor (ambiguity) 'q_function' ':' qmodel=ModelReference
	 *     tensor=Tensor (ambiguity) 'reward' ':' tensor=Tensor
	 *     tensor=Tensor (ambiguity) '}' (rule end)
	 *     tensor=Tensor (ambiguity) '}' annotations+=PlatformAnnotation
	 */
	protected void emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ('device' ':' '{' '}')? 
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 *     name=ID '{' (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 *     obsdims+=IntegerLiteral ')' (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 *     pmodel=ModelReference (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 *     qmodel=ModelReference (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'input' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'output' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'p_function' ':' pmodel=ModelReference
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'q_function' ':' qmodel=ModelReference
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* 'reward' ':' tensor=Tensor
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* '}' (rule end)
	 *     rewdims+=IntegerLiteral ')' (ambiguity) ('rewards' ':' 'dim' '=' '(' ')' (ambiguity))* '}' annotations+=PlatformAnnotation
	 *     tensor=Tensor (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 */
	protected void emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         ('device' ':' '{' '}')? 
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 *     name=ID '{' (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'input' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'output' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'p_function' ':' pmodel=ModelReference
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'q_function' ':' qmodel=ModelReference
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* 'reward' ':' tensor=Tensor
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* '}' (rule end)
	 *     obsdims+=IntegerLiteral ')' (ambiguity) ('observation' ':' 'dim' '=' '(' ')' (ambiguity))* '}' annotations+=PlatformAnnotation
	 *     pmodel=ModelReference (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 *     qmodel=ModelReference (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 *     rewdims+=IntegerLiteral ')' (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 *     tensor=Tensor (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 */
	protected void emit_Strategy_____DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         ) | 
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )
	  *     )*
	 *
	 * This ambiguous syntax occurs at:
	 *     actiondims+=IntegerLiteral ')' (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'action_space' ':' 'Discrete' '(' 'dim' '=' actiondims+=IntegerLiteral
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'input' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'output' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'p_function' ':' pmodel=ModelReference
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'q_function' ':' qmodel=ModelReference
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* 'reward' ':' tensor=Tensor
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* '}' (rule end)
	 *     devices+=Cproperty '}' (ambiguity) ('device' ':' '{' '}' (ambiguity))* '}' annotations+=PlatformAnnotation
	 *     name=ID '{' (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 *     pmodel=ModelReference (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 *     qmodel=ModelReference (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 *     tensor=Tensor (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 */
	protected void emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6___or___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6____a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )? 
	  *         ('device' ':' '{' '}')?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     devices+=Cproperty '}' (ambiguity) 'rewards' ':' 'dim' '=' '(' (')' (ambiguity) 'rewards' ':' 'dim' '=' '(')* rewdims+=IntegerLiteral
	 */
	protected void emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )? 
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     rewdims+=IntegerLiteral ')' (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 */
	protected void emit_Strategy_____ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q___RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )? 
	  *         ('device' ':' '{' '}')?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     devices+=Cproperty '}' (ambiguity) 'observation' ':' 'dim' '=' '(' (')' (ambiguity) 'observation' ':' 'dim' '=' '(')* obsdims+=IntegerLiteral
	 */
	protected void emit_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___DeviceKeyword_3_2_0_ColonKeyword_3_2_1_LeftCurlyBracketKeyword_3_2_2_RightCurlyBracketKeyword_3_2_4__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     (
	  *         (
	  *             'rewards' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )? 
	  *         (
	  *             'observation' 
	  *             ':' 
	  *             'dim' 
	  *             '=' 
	  *             '(' 
	  *             ')'
	  *         )?
	  *     )+
	 *
	 * This ambiguous syntax occurs at:
	 *     obsdims+=IntegerLiteral ')' (ambiguity) 'device' ':' '{' ('}' (ambiguity) 'device' ':' '{')* devices+=Cproperty
	 */
	protected void emit_Strategy_____RewardsKeyword_3_4_0_ColonKeyword_3_4_1_DimKeyword_3_4_2_EqualsSignKeyword_3_4_3_LeftParenthesisKeyword_3_4_4_RightParenthesisKeyword_3_4_6__q___ObservationKeyword_3_5_0_ColonKeyword_3_5_1_DimKeyword_3_5_2_EqualsSignKeyword_3_5_3_LeftParenthesisKeyword_3_5_4_RightParenthesisKeyword_3_5_6__q__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
