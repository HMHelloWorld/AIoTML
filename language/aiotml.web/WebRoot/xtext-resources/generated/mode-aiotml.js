define(["ace/lib/oop", "ace/mode/text", "ace/mode/text_highlight_rules"], function(oop, mText, mTextHighlightRules) {
	var HighlightRules = function() {
		var keywords = "Discrete|None|abstract|action|action_space|af|agent|and|append|as|bind|composite|configuration|connector|cproperty|datatype|device|dim|do|else|end|entity|entry|enumerate|enumeration|error|errorln|event|exfor|exit|false|final|for|fork|fragment|from|fully_connected|function|guard|history|if|import|in|includes|init|input|instance|internal|keeps|message|mlp|model|not|object|observation|on|optional|or|output|over|p_function|port|print|println|property|protocol|provided|q_function|readonly|receives|region|relu|required|return|reward|rewards|sends|session|set|sigmoid|state|statechart|strategy|stream|subthing|template|tensor|thing|transition|true|using|var|while|zip";
		this.$rules = {
			"start": [
				{token: "lparen", regex: "[\\[({]"},
				{token: "rparen", regex: "[\\])}]"},
				{token: "keyword", regex: "\\b(?:" + keywords + ")\\b"}
			]
		};
	};
	oop.inherits(HighlightRules, mTextHighlightRules.TextHighlightRules);
	
	var Mode = function() {
		this.HighlightRules = HighlightRules;
	};
	oop.inherits(Mode, mText.Mode);
	Mode.prototype.$id = "xtext/aiotml";
	Mode.prototype.getCompletions = function(state, session, pos, prefix) {
		return [];
	}
	
	return {
		Mode: Mode
	};
});
