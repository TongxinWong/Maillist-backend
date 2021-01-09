// Generated from E:/Dev/Compile-work/Maillist/Maillist-backend/src/main/java\Maillist.g4 by ANTLR 4.9
package com.lw.maillist.grammar;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MaillistParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, UCHARACTER=4, UATOM=5, SUBUDOMAIN=6, WS=7;
	public static final int
		RULE_maillist = 0, RULE_uMailBox = 1, RULE_uLocal_part = 2, RULE_uDot_string = 3, 
		RULE_uAtom = 4, RULE_uDomain = 5, RULE_sub_udomain = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"maillist", "uMailBox", "uLocal_part", "uDot_string", "uAtom", "uDomain", 
			"sub_udomain"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'@'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "UCHARACTER", "UATOM", "SUBUDOMAIN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Maillist.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MaillistParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class MaillistContext extends ParserRuleContext {
		public List<UMailBoxContext> uMailBox() {
			return getRuleContexts(UMailBoxContext.class);
		}
		public UMailBoxContext uMailBox(int i) {
			return getRuleContext(UMailBoxContext.class,i);
		}
		public MaillistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maillist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterMaillist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitMaillist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitMaillist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MaillistContext maillist() throws RecognitionException {
		MaillistContext _localctx = new MaillistContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_maillist);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			uMailBox();
			setState(19);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(15);
					match(T__0);
					setState(16);
					uMailBox();
					}
					} 
				}
				setState(21);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(22);
				match(T__0);
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

	public static class UMailBoxContext extends ParserRuleContext {
		public ULocal_partContext uLocal_part() {
			return getRuleContext(ULocal_partContext.class,0);
		}
		public UDomainContext uDomain() {
			return getRuleContext(UDomainContext.class,0);
		}
		public UMailBoxContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uMailBox; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterUMailBox(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitUMailBox(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitUMailBox(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UMailBoxContext uMailBox() throws RecognitionException {
		UMailBoxContext _localctx = new UMailBoxContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uMailBox);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			uLocal_part();
			setState(26);
			match(T__1);
			setState(27);
			uDomain();
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

	public static class ULocal_partContext extends ParserRuleContext {
		public UDot_stringContext uDot_string() {
			return getRuleContext(UDot_stringContext.class,0);
		}
		public ULocal_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uLocal_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterULocal_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitULocal_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitULocal_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ULocal_partContext uLocal_part() throws RecognitionException {
		ULocal_partContext _localctx = new ULocal_partContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_uLocal_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			uDot_string();
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

	public static class UDot_stringContext extends ParserRuleContext {
		public List<UAtomContext> uAtom() {
			return getRuleContexts(UAtomContext.class);
		}
		public UAtomContext uAtom(int i) {
			return getRuleContext(UAtomContext.class,i);
		}
		public UDot_stringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uDot_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterUDot_string(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitUDot_string(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitUDot_string(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UDot_stringContext uDot_string() throws RecognitionException {
		UDot_stringContext _localctx = new UDot_stringContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_uDot_string);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			uAtom();
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(32);
				match(T__2);
				setState(33);
				uAtom();
				}
				}
				setState(38);
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

	public static class UAtomContext extends ParserRuleContext {
		public TerminalNode UCHARACTER() { return getToken(MaillistParser.UCHARACTER, 0); }
		public TerminalNode UATOM() { return getToken(MaillistParser.UATOM, 0); }
		public UAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterUAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitUAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitUAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UAtomContext uAtom() throws RecognitionException {
		UAtomContext _localctx = new UAtomContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_uAtom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_la = _input.LA(1);
			if ( !(_la==UCHARACTER || _la==UATOM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class UDomainContext extends ParserRuleContext {
		public List<Sub_udomainContext> sub_udomain() {
			return getRuleContexts(Sub_udomainContext.class);
		}
		public Sub_udomainContext sub_udomain(int i) {
			return getRuleContext(Sub_udomainContext.class,i);
		}
		public UDomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uDomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterUDomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitUDomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitUDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UDomainContext uDomain() throws RecognitionException {
		UDomainContext _localctx = new UDomainContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_uDomain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			sub_udomain();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				match(T__2);
				setState(43);
				sub_udomain();
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__2 );
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

	public static class Sub_udomainContext extends ParserRuleContext {
		public TerminalNode UCHARACTER() { return getToken(MaillistParser.UCHARACTER, 0); }
		public TerminalNode SUBUDOMAIN() { return getToken(MaillistParser.SUBUDOMAIN, 0); }
		public Sub_udomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub_udomain; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).enterSub_udomain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MaillistListener ) ((MaillistListener)listener).exitSub_udomain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MaillistVisitor ) return ((MaillistVisitor<? extends T>)visitor).visitSub_udomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sub_udomainContext sub_udomain() throws RecognitionException {
		Sub_udomainContext _localctx = new Sub_udomainContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sub_udomain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==UCHARACTER || _la==SUBUDOMAIN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t\65\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\7\2\24\n\2\f"+
		"\2\16\2\27\13\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\7\5"+
		"%\n\5\f\5\16\5(\13\5\3\6\3\6\3\7\3\7\3\7\6\7/\n\7\r\7\16\7\60\3\b\3\b"+
		"\3\b\2\2\t\2\4\6\b\n\f\16\2\4\3\2\6\7\4\2\6\6\b\b\2\61\2\20\3\2\2\2\4"+
		"\33\3\2\2\2\6\37\3\2\2\2\b!\3\2\2\2\n)\3\2\2\2\f+\3\2\2\2\16\62\3\2\2"+
		"\2\20\25\5\4\3\2\21\22\7\3\2\2\22\24\5\4\3\2\23\21\3\2\2\2\24\27\3\2\2"+
		"\2\25\23\3\2\2\2\25\26\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\30\32\7\3\2"+
		"\2\31\30\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7\4\2"+
		"\2\35\36\5\f\7\2\36\5\3\2\2\2\37 \5\b\5\2 \7\3\2\2\2!&\5\n\6\2\"#\7\5"+
		"\2\2#%\5\n\6\2$\"\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\t\3\2\2\2("+
		"&\3\2\2\2)*\t\2\2\2*\13\3\2\2\2+.\5\16\b\2,-\7\5\2\2-/\5\16\b\2.,\3\2"+
		"\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\r\3\2\2\2\62\63\t\3\2\2"+
		"\63\17\3\2\2\2\6\25\31&\60";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}