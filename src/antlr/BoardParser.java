// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Board.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BoardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, DIGIT=7, WHITE=8, BLACK=9, 
		PAWN=10, KNIGHT=11, BISHOP=12, KING=13, QUEEN=14, ROOK=15, WS=16;
	public static final int
		RULE_board = 0, RULE_size = 1, RULE_piecePlacement = 2, RULE_pieceOnBoard = 3, 
		RULE_piece = 4, RULE_nextPlayer = 5, RULE_player = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"board", "size", "piecePlacement", "pieceOnBoard", "piece", "nextPlayer", 
			"player"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'board size is:'", "'piece(s) on the board is:'", "'is at row'", 
			"'column'", "'next player is:'", null, null, "'white'", "'black'", "'pawn'", 
			"'knight'", "'bishop'", "'king'", "'queen'", "'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "DIGIT", "WHITE", "BLACK", 
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
	public String getGrammarFileName() { return "Board.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BoardParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoardContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public PiecePlacementContext piecePlacement() {
			return getRuleContext(PiecePlacementContext.class,0);
		}
		public NextPlayerContext nextPlayer() {
			return getRuleContext(NextPlayerContext.class,0);
		}
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_board);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			size();
			setState(15);
			piecePlacement();
			setState(16);
			nextPlayer();
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
	public static class SizeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BoardParser.INT, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitSize(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(T__0);
			setState(19);
			match(INT);
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
	public static class PiecePlacementContext extends ParserRuleContext {
		public List<PieceOnBoardContext> pieceOnBoard() {
			return getRuleContexts(PieceOnBoardContext.class);
		}
		public PieceOnBoardContext pieceOnBoard(int i) {
			return getRuleContext(PieceOnBoardContext.class,i);
		}
		public PiecePlacementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piecePlacement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPiecePlacement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPiecePlacement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitPiecePlacement(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PiecePlacementContext piecePlacement() throws RecognitionException {
		PiecePlacementContext _localctx = new PiecePlacementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_piecePlacement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			match(T__1);
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITE || _la==BLACK) {
				{
				{
				setState(22);
				pieceOnBoard();
				}
				}
				setState(27);
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
	public static class PieceOnBoardContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
		}
		public List<TerminalNode> INT() { return getTokens(BoardParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(BoardParser.INT, i);
		}
		public PieceOnBoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pieceOnBoard; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPieceOnBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPieceOnBoard(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitPieceOnBoard(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PieceOnBoardContext pieceOnBoard() throws RecognitionException {
		PieceOnBoardContext _localctx = new PieceOnBoardContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pieceOnBoard);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			player();
			setState(29);
			piece();
			setState(30);
			match(T__2);
			setState(31);
			match(INT);
			setState(32);
			match(T__3);
			setState(33);
			match(INT);
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
		public TerminalNode PAWN() { return getToken(BoardParser.PAWN, 0); }
		public TerminalNode KNIGHT() { return getToken(BoardParser.KNIGHT, 0); }
		public TerminalNode BISHOP() { return getToken(BoardParser.BISHOP, 0); }
		public TerminalNode ROOK() { return getToken(BoardParser.ROOK, 0); }
		public TerminalNode QUEEN() { return getToken(BoardParser.QUEEN, 0); }
		public TerminalNode KING() { return getToken(BoardParser.KING, 0); }
		public PieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_piece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitPiece(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_piece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
	public static class NextPlayerContext extends ParserRuleContext {
		public PlayerContext player() {
			return getRuleContext(PlayerContext.class,0);
		}
		public NextPlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nextPlayer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterNextPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitNextPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitNextPlayer(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final NextPlayerContext nextPlayer() throws RecognitionException {
		NextPlayerContext _localctx = new NextPlayerContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nextPlayer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(T__4);
			setState(38);
			player();
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
	public static class PlayerContext extends ParserRuleContext {
		public TerminalNode WHITE() { return getToken(BoardParser.WHITE, 0); }
		public TerminalNode BLACK() { return getToken(BoardParser.BLACK, 0); }
		public PlayerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_player; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterPlayer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitPlayer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) {
				try {
					return ((BoardVisitor<? extends T>)visitor).visitPlayer(this);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			else return visitor.visitChildren(this);
		}
	}

	public final PlayerContext player() throws RecognitionException {
		PlayerContext _localctx = new PlayerContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_player);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_la = _input.LA(1);
			if ( !(_la==WHITE || _la==BLACK) ) {
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
		"\u0004\u0001\u0010+\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u0018\b\u0002\n\u0002\f\u0002\u001b\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n"+
		"\f\u0000\u0002\u0001\u0000\n\u000f\u0001\u0000\b\t$\u0000\u000e\u0001"+
		"\u0000\u0000\u0000\u0002\u0012\u0001\u0000\u0000\u0000\u0004\u0015\u0001"+
		"\u0000\u0000\u0000\u0006\u001c\u0001\u0000\u0000\u0000\b#\u0001\u0000"+
		"\u0000\u0000\n%\u0001\u0000\u0000\u0000\f(\u0001\u0000\u0000\u0000\u000e"+
		"\u000f\u0003\u0002\u0001\u0000\u000f\u0010\u0003\u0004\u0002\u0000\u0010"+
		"\u0011\u0003\n\u0005\u0000\u0011\u0001\u0001\u0000\u0000\u0000\u0012\u0013"+
		"\u0005\u0001\u0000\u0000\u0013\u0014\u0005\u0006\u0000\u0000\u0014\u0003"+
		"\u0001\u0000\u0000\u0000\u0015\u0019\u0005\u0002\u0000\u0000\u0016\u0018"+
		"\u0003\u0006\u0003\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b"+
		"\u0001\u0000\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0001\u0000\u0000\u0000\u001a\u0005\u0001\u0000\u0000\u0000\u001b\u0019"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0003\f\u0006\u0000\u001d\u001e\u0003"+
		"\b\u0004\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f \u0005\u0006"+
		"\u0000\u0000 !\u0005\u0004\u0000\u0000!\"\u0005\u0006\u0000\u0000\"\u0007"+
		"\u0001\u0000\u0000\u0000#$\u0007\u0000\u0000\u0000$\t\u0001\u0000\u0000"+
		"\u0000%&\u0005\u0005\u0000\u0000&\'\u0003\f\u0006\u0000\'\u000b\u0001"+
		"\u0000\u0000\u0000()\u0007\u0001\u0000\u0000)\r\u0001\u0000\u0000\u0000"+
		"\u0001\u0019";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}