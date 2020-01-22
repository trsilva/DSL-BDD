/*
 * generated by Xtext 2.18.0.M3
 */
package no.hal.bdd.parser.antlr;

import com.google.inject.Inject;
import no.hal.bdd.parser.antlr.internal.InternalBddDslParser;
import no.hal.bdd.services.BddDslGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class BddDslParser extends AbstractAntlrParser {

	@Inject
	private BddDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalBddDslParser createParser(XtextTokenStream stream) {
		return new InternalBddDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public BddDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(BddDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}