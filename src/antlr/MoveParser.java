// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MoveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, HIT=9, 
		RIGHT=10, LEFT=11, BACKWARD=12, FORWARD=13, AGAIN=14, MOVE=15, BECOME=16, 
		INT=17, DIGIT=18, PAWN=19, KNIGHT=20, BISHOP=21, KING=22, QUEEN=23, ROOK=24, 
		WS=25;
	public static final int
		RULE_moves = 0, RULE_all_piece_rule = 1, RULE_piece_rule = 2, RULE_general_rule = 3, 
		RULE_move_more = 4, RULE_move = 5, RULE_rule = 6, RULE_action = 7, RULE_event = 8, 
		RULE_directions = 9, RULE_move_again = 10, RULE_move_dir = 11, RULE_become_piece = 12, 
		RULE_move_anywhere = 13, RULE_piece = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"moves", "all_piece_rule", "piece_rule", "general_rule", "move_more", 
			"move", "rule", "action", "event", "directions", "move_again", "move_dir", 
			"become_piece", "move_anywhere", "piece"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'all piece rule:'", "' rule:'", "'general move:'", "', '", "'-'", 
			"'when'", "'anywhere '", "' times in the game'", "'hit'", "'right'", 
			"'left'", "'backward'", "'forward'", "'again'", "'move'", "'become'", 
			null, null, "'pawn'", "'knight'", "'bishop'", "'king'", "'queen'", "'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "HIT", "RIGHT", 
			"LEFT", "BACKWARD", "FORWARD", "AGAIN", "MOVE", "BECOME", "INT", "DIGIT", 
			"PAWN", "KNIGHT", "BISHOP", "KING", "QUEEN", "ROOK", "WS"
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
	public String getGrammarFileName() { return "Move.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MoveParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MovesContext extends ParserRuleContext {
		public All_piece_ruleContext all_piece_rule() {
			return getRuleContext(All_piece_ruleContext.class,0);
		}
		public List<Piece_ruleContext> piece_rule() {
			return getRuleContexts(Piece_ruleContext.class);
		}
		public Piece_ruleContext piece_rule(int i) {
			return getRuleContext(Piece_ruleContext.class,i);
		}
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMoves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMoves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitMoves(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_moves);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			all_piece_rule();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) {
				{
				{
				setState(31);
				piece_rule();
				}
				}
				setState(36);
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

	@SuppressWarnings("CheckReturnValue")
	public static class All_piece_ruleContext extends ParserRuleContext {
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public All_piece_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_all_piece_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterAll_piece_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitAll_piece_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitAll_piece_rule(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final All_piece_ruleContext all_piece_rule() throws RecognitionException {
		All_piece_ruleContext _localctx = new All_piece_ruleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_all_piece_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__0);
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(38);
				rule_();
				}
				}
				setState(43);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Piece_ruleContext extends ParserRuleContext {
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public General_ruleContext general_rule() {
			return getRuleContext(General_ruleContext.class,0);
		}
		public List<RuleContext> rule_() {
			return getRuleContexts(RuleContext.class);
		}
		public RuleContext rule_(int i) {
			return getRuleContext(RuleContext.class,i);
		}
		public Piece_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterPiece_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitPiece_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitPiece_rule(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final Piece_ruleContext piece_rule() throws RecognitionException {
		Piece_ruleContext _localctx = new Piece_ruleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_piece_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			piece();
			setState(45);
			match(T__1);
			setState(46);
			general_rule();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(47);
				rule_();
				}
				}
				setState(52);
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

	@SuppressWarnings("CheckReturnValue")
	public static class General_ruleContext extends ParserRuleContext {
		public Move_moreContext move_more() {
			return getRuleContext(Move_moreContext.class,0);
		}
		public General_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_general_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterGeneral_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitGeneral_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitGeneral_rule(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final General_ruleContext general_rule() throws RecognitionException {
		General_ruleContext _localctx = new General_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_general_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(T__2);
			setState(54);
			move_more();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_moreContext extends ParserRuleContext {
		public List<MoveContext> move() {
			return getRuleContexts(MoveContext.class);
		}
		public MoveContext move(int i) {
			return getRuleContext(MoveContext.class,i);
		}
		public Move_moreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_more; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove_more(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove_more(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMove_more(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_moreContext move_more() throws RecognitionException {
		Move_moreContext _localctx = new Move_moreContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_move_more);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			move();
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(57);
				match(T__3);
				setState(58);
				move();
				}
				}
				setState(63);
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

	@SuppressWarnings("CheckReturnValue")
	public static class MoveContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(MoveParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MoveParser.INT, i);
		}
		public List<DirectionsContext> directions() {
			return getRuleContexts(DirectionsContext.class);
		}
		public DirectionsContext directions(int i) {
			return getRuleContext(DirectionsContext.class,i);
		}
		public MoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MoveContext move() throws RecognitionException {
		MoveContext _localctx = new MoveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(64);
				match(INT);
				setState(65);
				directions();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) {
				{
				{
				setState(71);
				directions();
				}
				}
				setState(76);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RuleContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public Move_anywhereContext move_anywhere() {
			return getRuleContext(Move_anywhereContext.class,0);
		}
		public RuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitRule(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__4);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(78);
				action();
				setState(79);
				match(T__5);
				setState(80);
				event();
				}
				break;
			case 2:
				{
				setState(82);
				move_anywhere();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public Move_againContext move_again() {
			return getRuleContext(Move_againContext.class,0);
		}
		public Move_dirContext move_dir() {
			return getRuleContext(Move_dirContext.class,0);
		}
		public Become_pieceContext become_piece() {
			return getRuleContext(Become_pieceContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		try {
			setState(88);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				move_again();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				move_dir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(87);
				become_piece();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class EventContext extends ParserRuleContext {
		public TerminalNode HIT() { return getToken(MoveParser.HIT, 0); }
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) {
				try {
					return ((MoveVisitor<? extends T>)visitor).visitEvent(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(HIT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DirectionsContext extends ParserRuleContext {
		public TerminalNode RIGHT() { return getToken(MoveParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(MoveParser.LEFT, 0); }
		public TerminalNode BACKWARD() { return getToken(MoveParser.BACKWARD, 0); }
		public TerminalNode FORWARD() { return getToken(MoveParser.FORWARD, 0); }
		public DirectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterDirections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitDirections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitDirections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionsContext directions() throws RecognitionException {
		DirectionsContext _localctx = new DirectionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_directions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15360L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_againContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(MoveParser.MOVE, 0); }
		public TerminalNode AGAIN() { return getToken(MoveParser.AGAIN, 0); }
		public Move_againContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_again; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove_again(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove_again(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMove_again(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_againContext move_again() throws RecognitionException {
		Move_againContext _localctx = new Move_againContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_move_again);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(MOVE);
			setState(95);
			match(AGAIN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_dirContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(MoveParser.MOVE, 0); }
		public DirectionsContext directions() {
			return getRuleContext(DirectionsContext.class,0);
		}
		public Move_dirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_dir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove_dir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove_dir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMove_dir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_dirContext move_dir() throws RecognitionException {
		Move_dirContext _localctx = new Move_dirContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_move_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(MOVE);
			setState(98);
			directions();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Become_pieceContext extends ParserRuleContext {
		public TerminalNode BECOME() { return getToken(MoveParser.BECOME, 0); }
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public Become_pieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_become_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterBecome_piece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitBecome_piece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitBecome_piece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Become_pieceContext become_piece() throws RecognitionException {
		Become_pieceContext _localctx = new Become_pieceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_become_piece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(BECOME);
			setState(101);
			piece();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Move_anywhereContext extends ParserRuleContext {
		public TerminalNode MOVE() { return getToken(MoveParser.MOVE, 0); }
		public TerminalNode INT() { return getToken(MoveParser.INT, 0); }
		public Move_anywhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_anywhere; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterMove_anywhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitMove_anywhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMove_anywhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Move_anywhereContext move_anywhere() throws RecognitionException {
		Move_anywhereContext _localctx = new Move_anywhereContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_move_anywhere);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(MOVE);
			setState(104);
			match(T__6);
			setState(105);
			match(INT);
			setState(106);
			match(T__7);
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

	@SuppressWarnings("CheckReturnValue")
	public static class PieceContext extends ParserRuleContext {
		public TerminalNode PAWN() { return getToken(MoveParser.PAWN, 0); }
		public TerminalNode KNIGHT() { return getToken(MoveParser.KNIGHT, 0); }
		public TerminalNode BISHOP() { return getToken(MoveParser.BISHOP, 0); }
		public TerminalNode ROOK() { return getToken(MoveParser.ROOK, 0); }
		public TerminalNode QUEEN() { return getToken(MoveParser.QUEEN, 0); }
		public TerminalNode KING() { return getToken(MoveParser.KING, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MoveListener ) ((MoveListener)listener).exitPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 33030144L) != 0)) ) {
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
		"\u0004\u0001\u0019o\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0005\u0000!\b\u0000\n\u0000\f\u0000$\t\u0000\u0001\u0001\u0001\u0001"+
		"\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u00021\b\u0002\n\u0002\f\u00024\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004<\b\u0004\n\u0004\f\u0004?\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0005\u0005C\b\u0005\n\u0005\f\u0005F\t\u0005\u0001\u0005\u0005\u0005"+
		"I\b\u0005\n\u0005\f\u0005L\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006T\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007Y\b\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0002\u0001\u0000"+
		"\n\r\u0001\u0000\u0013\u0018h\u0000\u001e\u0001\u0000\u0000\u0000\u0002"+
		"%\u0001\u0000\u0000\u0000\u0004,\u0001\u0000\u0000\u0000\u00065\u0001"+
		"\u0000\u0000\u0000\b8\u0001\u0000\u0000\u0000\nD\u0001\u0000\u0000\u0000"+
		"\fM\u0001\u0000\u0000\u0000\u000eX\u0001\u0000\u0000\u0000\u0010Z\u0001"+
		"\u0000\u0000\u0000\u0012\\\u0001\u0000\u0000\u0000\u0014^\u0001\u0000"+
		"\u0000\u0000\u0016a\u0001\u0000\u0000\u0000\u0018d\u0001\u0000\u0000\u0000"+
		"\u001ag\u0001\u0000\u0000\u0000\u001cl\u0001\u0000\u0000\u0000\u001e\""+
		"\u0003\u0002\u0001\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000"+
		"\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001"+
		"\u0000\u0000\u0000#\u0001\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000%)\u0005\u0001\u0000\u0000&(\u0003\f\u0006\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*\u0003\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000"+
		"\u0000,-\u0003\u001c\u000e\u0000-.\u0005\u0002\u0000\u0000.2\u0003\u0006"+
		"\u0003\u0000/1\u0003\f\u0006\u00000/\u0001\u0000\u0000\u000014\u0001\u0000"+
		"\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u00003\u0005"+
		"\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000056\u0005\u0003\u0000"+
		"\u000067\u0003\b\u0004\u00007\u0007\u0001\u0000\u0000\u00008=\u0003\n"+
		"\u0005\u00009:\u0005\u0004\u0000\u0000:<\u0003\n\u0005\u0000;9\u0001\u0000"+
		"\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001"+
		"\u0000\u0000\u0000>\t\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0011\u0000\u0000AC\u0003\u0012\t\u0000B@\u0001\u0000\u0000\u0000"+
		"CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EJ\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GI\u0003\u0012"+
		"\t\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000K\u000b\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MS\u0005\u0005\u0000\u0000NO\u0003\u000e\u0007"+
		"\u0000OP\u0005\u0006\u0000\u0000PQ\u0003\u0010\b\u0000QT\u0001\u0000\u0000"+
		"\u0000RT\u0003\u001a\r\u0000SN\u0001\u0000\u0000\u0000SR\u0001\u0000\u0000"+
		"\u0000T\r\u0001\u0000\u0000\u0000UY\u0003\u0014\n\u0000VY\u0003\u0016"+
		"\u000b\u0000WY\u0003\u0018\f\u0000XU\u0001\u0000\u0000\u0000XV\u0001\u0000"+
		"\u0000\u0000XW\u0001\u0000\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000"+
		"Z[\u0005\t\u0000\u0000[\u0011\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000"+
		"\u0000]\u0013\u0001\u0000\u0000\u0000^_\u0005\u000f\u0000\u0000_`\u0005"+
		"\u000e\u0000\u0000`\u0015\u0001\u0000\u0000\u0000ab\u0005\u000f\u0000"+
		"\u0000bc\u0003\u0012\t\u0000c\u0017\u0001\u0000\u0000\u0000de\u0005\u0010"+
		"\u0000\u0000ef\u0003\u001c\u000e\u0000f\u0019\u0001\u0000\u0000\u0000"+
		"gh\u0005\u000f\u0000\u0000hi\u0005\u0007\u0000\u0000ij\u0005\u0011\u0000"+
		"\u0000jk\u0005\b\u0000\u0000k\u001b\u0001\u0000\u0000\u0000lm\u0007\u0001"+
		"\u0000\u0000m\u001d\u0001\u0000\u0000\u0000\b\")2=DJSX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}