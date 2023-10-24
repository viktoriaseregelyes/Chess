// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MoveParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, HIT=5, RIGHT=6, LEFT=7, BACKWARD=8, FORWARD=9, 
		AGAIN=10, MOVE=11, BECOME=12, INT=13, DIGIT=14, PAWN=15, KNIGHT=16, BISHOP=17, 
		KING=18, QUEEN=19, ROOK=20, WS=21;
	public static final int
		RULE_moves = 0, RULE_all_piece_rule = 1, RULE_piece_rule = 2, RULE_general_rule = 3, 
		RULE_move = 4, RULE_rule = 5, RULE_action = 6, RULE_event = 7, RULE_directions = 8, 
		RULE_move_again = 9, RULE_move_dir = 10, RULE_become_piece = 11, RULE_piece = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"moves", "all_piece_rule", "piece_rule", "general_rule", "move", "rule", 
			"action", "event", "directions", "move_again", "move_dir", "become_piece", 
			"piece"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'all piece rule:'", "' rule:'", "'general move:'", "'when'", "'hit'", 
			"'right'", "'left'", "'backward'", "'forward'", "'again'", "'move'", 
			"'become'", null, null, "'pawn'", "'knight'", "'bishop'", "'king'", "'queen'", 
			"'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "HIT", "RIGHT", "LEFT", "BACKWARD", "FORWARD", 
			"AGAIN", "MOVE", "BECOME", "INT", "DIGIT", "PAWN", "KNIGHT", "BISHOP", 
			"KING", "QUEEN", "ROOK", "WS"
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
		public Piece_ruleContext piece_rule() {
			return getRuleContext(Piece_ruleContext.class,0);
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitMoves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_moves);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			all_piece_rule();
			setState(27);
			piece_rule();
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitAll_piece_rule(this);
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
			setState(29);
			match(T__0);
			setState(30);
			rule_();
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MOVE || _la==BECOME) {
				{
				{
				setState(31);
				rule_();
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
	public static class Piece_ruleContext extends ParserRuleContext {
		public List<PieceContext> piece() {
			return getRuleContexts(PieceContext.class);
		}
		public PieceContext piece(int i) {
			return getRuleContext(PieceContext.class,i);
		}
		public List<General_ruleContext> general_rule() {
			return getRuleContexts(General_ruleContext.class);
		}
		public General_ruleContext general_rule(int i) {
			return getRuleContext(General_ruleContext.class,i);
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitPiece_rule(this);
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
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) {
				{
				{
				setState(37);
				piece();
				setState(38);
				match(T__1);
				setState(39);
				general_rule();
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MOVE || _la==BECOME) {
					{
					{
					setState(40);
					rule_();
					}
					}
					setState(45);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(50);
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
		public MoveContext move() {
			return getRuleContext(MoveContext.class,0);
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitGeneral_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final General_ruleContext general_rule() throws RecognitionException {
		General_ruleContext _localctx = new General_ruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_general_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(T__2);
			setState(52);
			move();
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
		enterRule(_localctx, 8, RULE_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(54);
				match(INT);
				setState(55);
				directions();
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) {
				{
				{
				setState(61);
				directions();
				}
				}
				setState(66);
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RuleContext rule_() throws RecognitionException {
		RuleContext _localctx = new RuleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			action();
			setState(68);
			match(T__3);
			setState(69);
			event();
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
		enterRule(_localctx, 12, RULE_action);
		try {
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				move_again();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				move_dir();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
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
			if ( visitor instanceof MoveVisitor ) return ((MoveVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
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
		enterRule(_localctx, 16, RULE_directions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 960L) != 0)) ) {
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
		enterRule(_localctx, 18, RULE_move_again);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(MOVE);
			setState(81);
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
		enterRule(_localctx, 20, RULE_move_dir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(MOVE);
			setState(84);
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
		enterRule(_localctx, 22, RULE_become_piece);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(BECOME);
			setState(87);
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
		enterRule(_localctx, 24, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2064384L) != 0)) ) {
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
		"\u0004\u0001\u0015\\\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002*\b\u0002\n\u0002\f\u0002"+
		"-\t\u0002\u0005\u0002/\b\u0002\n\u0002\f\u00022\t\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0005\u00049\b\u0004\n\u0004"+
		"\f\u0004<\t\u0004\u0001\u0004\u0005\u0004?\b\u0004\n\u0004\f\u0004B\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006K\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0002\u0001"+
		"\u0000\u0006\t\u0001\u0000\u000f\u0014U\u0000\u001a\u0001\u0000\u0000"+
		"\u0000\u0002\u001d\u0001\u0000\u0000\u0000\u00040\u0001\u0000\u0000\u0000"+
		"\u00063\u0001\u0000\u0000\u0000\b:\u0001\u0000\u0000\u0000\nC\u0001\u0000"+
		"\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000eL\u0001\u0000\u0000\u0000"+
		"\u0010N\u0001\u0000\u0000\u0000\u0012P\u0001\u0000\u0000\u0000\u0014S"+
		"\u0001\u0000\u0000\u0000\u0016V\u0001\u0000\u0000\u0000\u0018Y\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0003\u0002\u0001\u0000\u001b\u001c\u0003\u0004"+
		"\u0002\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001"+
		"\u0000\u0000\u001e\"\u0003\n\u0005\u0000\u001f!\u0003\n\u0005\u0000 \u001f"+
		"\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#\u0003\u0001\u0000\u0000\u0000$\"\u0001"+
		"\u0000\u0000\u0000%&\u0003\u0018\f\u0000&\'\u0005\u0002\u0000\u0000\'"+
		"+\u0003\u0006\u0003\u0000(*\u0003\n\u0005\u0000)(\u0001\u0000\u0000\u0000"+
		"*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,/\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.%\u0001\u0000"+
		"\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000001\u0001"+
		"\u0000\u0000\u00001\u0005\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000034\u0005\u0003\u0000\u000045\u0003\b\u0004\u00005\u0007\u0001\u0000"+
		"\u0000\u000067\u0005\r\u0000\u000079\u0003\u0010\b\u000086\u0001\u0000"+
		"\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001"+
		"\u0000\u0000\u0000;@\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"+
		"=?\u0003\u0010\b\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000"+
		"@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000A\t\u0001\u0000\u0000"+
		"\u0000B@\u0001\u0000\u0000\u0000CD\u0003\f\u0006\u0000DE\u0005\u0004\u0000"+
		"\u0000EF\u0003\u000e\u0007\u0000F\u000b\u0001\u0000\u0000\u0000GK\u0003"+
		"\u0012\t\u0000HK\u0003\u0014\n\u0000IK\u0003\u0016\u000b\u0000JG\u0001"+
		"\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JI\u0001\u0000\u0000\u0000"+
		"K\r\u0001\u0000\u0000\u0000LM\u0005\u0005\u0000\u0000M\u000f\u0001\u0000"+
		"\u0000\u0000NO\u0007\u0000\u0000\u0000O\u0011\u0001\u0000\u0000\u0000"+
		"PQ\u0005\u000b\u0000\u0000QR\u0005\n\u0000\u0000R\u0013\u0001\u0000\u0000"+
		"\u0000ST\u0005\u000b\u0000\u0000TU\u0003\u0010\b\u0000U\u0015\u0001\u0000"+
		"\u0000\u0000VW\u0005\f\u0000\u0000WX\u0003\u0018\f\u0000X\u0017\u0001"+
		"\u0000\u0000\u0000YZ\u0007\u0001\u0000\u0000Z\u0019\u0001\u0000\u0000"+
		"\u0000\u0006\"+0:@J";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}