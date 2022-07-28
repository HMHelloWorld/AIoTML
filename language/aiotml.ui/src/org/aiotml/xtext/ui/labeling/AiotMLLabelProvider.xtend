/*
 * generated by Xtext 2.10.0
 */
package org.aiotml.xtext.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.aiotml.xtext.aiotML.SubThing
import org.aiotml.xtext.aiotML.Cproperty
import org.aiotml.xtext.aiotML.Strategy
import org.aiotml.xtext.aiotML.StrategyProperty
import org.aiotml.xtext.aiotML.Thing
import org.aiotml.xtext.aiotML.Property
import org.aiotml.xtext.aiotML.Function
import org.aiotml.xtext.aiotML.TypeRef
import org.aiotml.xtext.aiotML.Variable
import org.eclipse.emf.common.util.EList
import org.aiotml.xtext.aiotML.Parameter
import org.aiotml.xtext.aiotML.Message
import org.aiotml.xtext.aiotML.Port
import org.aiotml.xtext.aiotML.StateContainer
import org.aiotml.xtext.aiotML.Session
import org.aiotml.xtext.aiotML.PlatformAnnotation
import org.aiotml.xtext.aiotML.PrimitiveType
import org.aiotml.xtext.aiotML.Type
import org.aiotml.xtext.aiotML.State
import org.aiotml.xtext.aiotML.FinalState
import org.aiotml.xtext.aiotML.CompositeState
import org.aiotml.xtext.aiotML.Protocol
import org.aiotml.xtext.aiotML.Configuration
import org.aiotml.xtext.aiotML.Instance
import org.aiotml.xtext.aiotML.Connector
import org.aiotml.xtext.aiotML.Action
import org.aiotml.xtext.aiotML.Expression
import org.aiotml.xtext.aiotML.Region
import org.aiotml.xtext.aiotML.Transition
import org.aiotml.xtext.aiotML.InternalTransition
import org.aiotml.xtext.aiotML.ReceiveMessage
import org.aiotml.xtext.aiotML.Handler
import org.aiotml.xtext.aiotML.IntegerLiteral

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
class AiotMLLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) { super(delegate); }

	def image(Action a) {
		'outline/open iconic/code-2x.png'
	}
	
	def image(Expression e) {
		'outline/open iconic/code-2x.png'
	}
	
	def image(Configuration cfg) {
		'outline/open iconic/spreadsheet-2x.png'
	}
	def image(Instance i) {
		'outline/open iconic/media-play-2x.png'
	}
	def image(Connector c) {
		'outline/open iconic/resize-width-2x.png'
	}		
	
	def text(Cproperty cproperty) {
		cproperty.name
	}
	def image(Cproperty cproperty) {
		'outline/open iconic/tag-2x.png'
	}
	def text(Strategy strategy) {
		strategy.name
	}
	def image(Strategy strategy) {
		'outline/open iconic/tag-2x.png'
	}
	def text(StrategyProperty strategyProperty) {
		strategyProperty.name
	}
	def image(StrategyProperty strategyProperty) {
		'outline/open iconic/tag-2x.png'
	}
	
	def text(SubThing subthing) {
		subthing.name
	}
	def image(SubThing subthing) {
		'heads.png'
	}
	
	def text(Thing thing) {
		thing.name + (if (thing.includes.empty) '' else ' : ' + thing.includes.map[include | include.name].join(', ')) 
	}
	def image(Thing thing) {
		'heads.png'
	}
	
	def image(PlatformAnnotation annotation) {
		'outline/open iconic/paperclip-2x.png'
	}	
	def text(PlatformAnnotation annotation) {
		if (annotation.value.length < 16)
			annotation.name + ': ' + annotation.value
		else 
			annotation.name + ': ' + annotation.value.substring(0, 16) + "..."
	}
	
	def image(Type datatype) {
		'outline/open iconic/document-2x.png'
	}
	
	def image(Protocol p) {
		'outline/open iconic/audio-2x.png'
	}		
	
	def text(Message message) {
		message.name + parametersString(message.parameters as EList<Parameter>)
	}
	def image(Message message) {
		'outline/open iconic/envelope-closed-2x.png'
	}
	
	
	
	def text(Function function) {
		function.name + parametersString(function.parameters as EList<Parameter>) + isTypeString(function.typeRef)
	}
	def image(Function function) {
		'outline/open iconic/cog-2x.png'
	}
	

	
	def text(Property property) {
		property.name + isTypeString(property.typeRef)
	}
	def image(Property property) {
		'outline/open iconic/tag-2x.png'
	}
	
	
	
	def image (Port port) {
		'outline/open iconic/transfer-2x.png'
	}
	
	
	def text(StateContainer container) {
		container.name + ' -> ' + container.initial.name + if (container.history) ' (keeps history)' else ''
	}
	def image(CompositeState c) {
		'outline/open iconic/aperture-2x.png'
	}	
	def image(Session session) {
		'outline/open iconic/fork-2x.png'
	}
	def image(Region r) {
		'outline/open iconic/pause-2x.png'
	}	
	def image(State state) {
		if (state.eContainer instanceof StateContainer) {
		var c = state.eContainer as StateContainer
		if (c.initial.equals(state))
			'outline/open iconic/power-standby-2x.png'
		else
			'outline/open iconic/target-2x.png'			
		} else
			'outline/open iconic/target-2x.png'
	}	
	def image(FinalState state) {
			'outline/open iconic/account-logout-2x.png'			
	}
	
	def image(Transition t) {
			'outline/open iconic/share-2x.png'			
	}
	def text(Handler t) {
		if (t.event !== null && t.event instanceof ReceiveMessage)
			'on ' + (t.event as ReceiveMessage).port.name + '?' + (t.event as ReceiveMessage).message.name
		else
			''			
	}
	def text(Transition t) {
		t.target.name + ' ' + text(t as Handler)			
	}
	
	def image(InternalTransition t) {
			'outline/open iconic/reload-2x.png'			
	}
	
	/* --- Helpers --- */
	def String parametersString(EList<Parameter> parameters) {
		'(' + parameters.map[typeString(it.typeRef)].join(', ') + ")"
	}
	
	def String isTypeString (TypeRef ref) {
		if (ref === null) ''
		else ' : ' + typeString(ref)
	}
	
	def String typeString (TypeRef ref) {
		if (ref === null) ''
		else ref.type.name + if (ref.isIsArray) '[' + (if(ref.cardinality instanceof IntegerLiteral) (ref.cardinality as IntegerLiteral).intValue else '') + ']' else '' 
	}
}
