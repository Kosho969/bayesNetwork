// Generated from Bayes.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BayesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, WS=5, PROBABILITY=6, NUM=7, ID=8, EQ=9, 
		LPARENT=10, RPARENT=11, PIPE=12, EXC=13, DOTCOMA=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "WS", "PROBABILITY", "LETTER", "DIGIT", 
		"NUM", "ID", "EQ", "LPARENT", "RPARENT", "PIPE", "EXC", "DOTCOMA"
	};


	public BayesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Bayes.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20P\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6-\n\6\r\6\16\6.\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\6\n:\n\n\r\n\16\n;\3\13\3\13\7\13@\n\13\f\13\16\13C\13\13"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\2\2\22\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\2\21\2\23\t\25\n\27\13\31\f\33\r\35\16\37\17!\20"+
		"\3\2\5\5\2\13\f\17\17\"\"\4\2C\\c|\3\2\62;P\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\23\3\2\2\2\2\25\3\2"+
		"\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2"+
		"\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2\2\2\13,\3\2\2\2\r"+
		"\62\3\2\2\2\17\64\3\2\2\2\21\66\3\2\2\2\239\3\2\2\2\25=\3\2\2\2\27D\3"+
		"\2\2\2\31F\3\2\2\2\33H\3\2\2\2\35J\3\2\2\2\37L\3\2\2\2!N\3\2\2\2#$\7\62"+
		"\2\2$\4\3\2\2\2%&\7\63\2\2&\6\3\2\2\2\'(\7.\2\2(\b\3\2\2\2)*\7\60\2\2"+
		"*\n\3\2\2\2+-\t\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2"+
		"\2\2\60\61\b\6\2\2\61\f\3\2\2\2\62\63\7R\2\2\63\16\3\2\2\2\64\65\t\3\2"+
		"\2\65\20\3\2\2\2\66\67\t\4\2\2\67\22\3\2\2\28:\5\21\t\298\3\2\2\2:;\3"+
		"\2\2\2;9\3\2\2\2;<\3\2\2\2<\24\3\2\2\2=A\5\17\b\2>@\5\17\b\2?>\3\2\2\2"+
		"@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\26\3\2\2\2CA\3\2\2\2DE\7?\2\2E\30\3\2"+
		"\2\2FG\7*\2\2G\32\3\2\2\2HI\7+\2\2I\34\3\2\2\2JK\7~\2\2K\36\3\2\2\2LM"+
		"\7#\2\2M \3\2\2\2NO\7=\2\2O\"\3\2\2\2\6\2.;A\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}