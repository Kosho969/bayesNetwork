// Generated from Bayes.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class BayesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, WS=5, PROBABILITY=6, NUM=7, ID=8, EQ=9, 
		LPARENT=10, RPARENT=11, PIPE=12, EXC=13, DOTCOMA=14;
	public static final String[] tokenNames = {
		"<INVALID>", "'0'", "'1'", "','", "'.'", "WS", "'P'", "NUM", "ID", "'='", 
		"'('", "')'", "'|'", "'!'", "';'"
	};
	public static final int
		RULE_program = 0, RULE_expressions = 1, RULE_expr1 = 2, RULE_literals = 3, 
		RULE_var2 = 4, RULE_var1 = 5, RULE_expr2 = 6;
	public static final String[] ruleNames = {
		"program", "expressions", "expr1", "literals", "var2", "var1", "expr2"
	};

	@Override
	public String getGrammarFileName() { return "Bayes.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BayesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROBABILITY) {
				{
				{
				setState(14); expressions();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public Expr1Context expr1() {
			return getRuleContext(Expr1Context.class,0);
		}
		public TerminalNode EQ() { return getToken(BayesParser.EQ, 0); }
		public Expr2Context expr2() {
			return getRuleContext(Expr2Context.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); expr1();
			setState(21); match(EQ);
			setState(22); expr2();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr1Context extends ParserRuleContext {
		public TerminalNode LPARENT() { return getToken(BayesParser.LPARENT, 0); }
		public TerminalNode RPARENT() { return getToken(BayesParser.RPARENT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public TerminalNode PROBABILITY() { return getToken(BayesParser.PROBABILITY, 0); }
		public Expr1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterExpr1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitExpr1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitExpr1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr1Context expr1() throws RecognitionException {
		Expr1Context _localctx = new Expr1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_expr1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); match(PROBABILITY);
			setState(25); match(LPARENT);
			{
			setState(26); literals();
			}
			setState(27); match(RPARENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralsContext extends ParserRuleContext {
		public List<Var2Context> var2() {
			return getRuleContexts(Var2Context.class);
		}
		public TerminalNode PIPE() { return getToken(BayesParser.PIPE, 0); }
		public Var2Context var2(int i) {
			return getRuleContext(Var2Context.class,i);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_literals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); var2();
			setState(32);
			_la = _input.LA(1);
			if (_la==PIPE) {
				{
				setState(30); match(PIPE);
				setState(31); var2();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var2Context extends ParserRuleContext {
		public Var1Context var1(int i) {
			return getRuleContext(Var1Context.class,i);
		}
		public List<Var1Context> var1() {
			return getRuleContexts(Var1Context.class);
		}
		public Var2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterVar2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitVar2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitVar2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var2Context var2() throws RecognitionException {
		Var2Context _localctx = new Var2Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_var2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34); var1();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(35); match(T__1);
				setState(36); var1();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var1Context extends ParserRuleContext {
		public TerminalNode ID() { return getToken(BayesParser.ID, 0); }
		public TerminalNode EXC() { return getToken(BayesParser.EXC, 0); }
		public Var1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterVar1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitVar1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitVar1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var1Context var1() throws RecognitionException {
		Var1Context _localctx = new Var1Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_var1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_la = _input.LA(1);
			if (_la==EXC) {
				{
				setState(42); match(EXC);
				}
			}

			setState(45); match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr2Context extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(BayesParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(BayesParser.NUM, i);
		}
		public Expr2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).enterExpr2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BayesListener ) ((BayesListener)listener).exitExpr2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BayesVisitor ) return ((BayesVisitor<? extends T>)visitor).visitExpr2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr2Context expr2() throws RecognitionException {
		Expr2Context _localctx = new Expr2Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr2);
		int _la;
		try {
			setState(55);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(47); match(T__3);
				setState(48); match(T__0);
				setState(50); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(49); match(NUM);
					}
					}
					setState(52); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54); match(T__2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\20<\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\7\2\22\n\2\f\2\16\2\25"+
		"\13\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\5\5#\n\5\3\6\3\6"+
		"\3\6\7\6(\n\6\f\6\16\6+\13\6\3\7\5\7.\n\7\3\7\3\7\3\b\3\b\3\b\6\b\65\n"+
		"\b\r\b\16\b\66\3\b\5\b:\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2:\2\23\3\2\2\2"+
		"\4\26\3\2\2\2\6\32\3\2\2\2\b\37\3\2\2\2\n$\3\2\2\2\f-\3\2\2\2\169\3\2"+
		"\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2"+
		"\2\2\24\3\3\2\2\2\25\23\3\2\2\2\26\27\5\6\4\2\27\30\7\13\2\2\30\31\5\16"+
		"\b\2\31\5\3\2\2\2\32\33\7\b\2\2\33\34\7\f\2\2\34\35\5\b\5\2\35\36\7\r"+
		"\2\2\36\7\3\2\2\2\37\"\5\n\6\2 !\7\16\2\2!#\5\n\6\2\" \3\2\2\2\"#\3\2"+
		"\2\2#\t\3\2\2\2$)\5\f\7\2%&\7\5\2\2&(\5\f\7\2\'%\3\2\2\2(+\3\2\2\2)\'"+
		"\3\2\2\2)*\3\2\2\2*\13\3\2\2\2+)\3\2\2\2,.\7\17\2\2-,\3\2\2\2-.\3\2\2"+
		"\2./\3\2\2\2/\60\7\n\2\2\60\r\3\2\2\2\61\62\7\3\2\2\62\64\7\6\2\2\63\65"+
		"\7\t\2\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67:\3"+
		"\2\2\28:\7\4\2\29\61\3\2\2\298\3\2\2\2:\17\3\2\2\2\b\23\")-\669";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}