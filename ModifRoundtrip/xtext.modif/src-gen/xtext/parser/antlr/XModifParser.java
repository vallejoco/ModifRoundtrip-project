/*
* generated by Xtext
*/
package xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import xtext.services.XModifGrammarAccess;

public class XModifParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XModifGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected xtext.parser.antlr.internal.InternalXModifParser createParser(XtextTokenStream stream) {
		return new xtext.parser.antlr.internal.InternalXModifParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Modifications";
	}
	
	public XModifGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XModifGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
