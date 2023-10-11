// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Board.g4 by ANTLR 4.13.1
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
public class BoardParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, INT=16;
	public static final int
		RULE_board = 0, RULE_size = 1, RULE_piecePlacement = 2, RULE_rank = 3, 
		RULE_pieceOnBoard = 4, RULE_piece = 5, RULE_digit = 6, RULE_whitePiece = 7, 
		RULE_blackPiece = 8, RULE_nextPlayer = 9, RULE_line = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"board", "size", "piecePlacement", "rank", "pieceOnBoard", "piece", "digit", 
			"whitePiece", "blackPiece", "nextPlayer", "line"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "' '", "'P'", "'N'", "'B'", "'R'", "'Q'", "'K'", "'p'", "'n'", 
			"'b'", "'r'", "'q'", "'k'", "'w'", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "INT"
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
			setState(22);
			size();
			setState(23);
			match(T__0);
			setState(24);
			piecePlacement();
			setState(25);
			match(T__0);
			setState(26);
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
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
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
		public List<RankContext> rank() {
			return getRuleContexts(RankContext.class);
		}
		public RankContext rank(int i) {
			return getRuleContext(RankContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
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
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPiecePlacement(this);
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114684L) != 0)) {
				{
				{
				setState(30);
				rank();
				setState(31);
				line();
				}
				}
				setState(37);
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
	public static class RankContext extends ParserRuleContext {
		public List<PieceOnBoardContext> pieceOnBoard() {
			return getRuleContexts(PieceOnBoardContext.class);
		}
		public PieceOnBoardContext pieceOnBoard(int i) {
			return getRuleContext(PieceOnBoardContext.class,i);
		}
		public List<DigitContext> digit() {
			return getRuleContexts(DigitContext.class);
		}
		public DigitContext digit(int i) {
			return getRuleContext(DigitContext.class,i);
		}
		public RankContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rank; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterRank(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitRank(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitRank(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RankContext rank() throws RecognitionException {
		RankContext _localctx = new RankContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_rank);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(38);
					pieceOnBoard();
					}
					} 
				}
				setState(43);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(44);
				digit();
				}
				}
				setState(49);
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
		public DigitContext digit() {
			return getRuleContext(DigitContext.class,0);
		}
		public PieceContext piece() {
			return getRuleContext(PieceContext.class,0);
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
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPieceOnBoard(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceOnBoardContext pieceOnBoard() throws RecognitionException {
		PieceOnBoardContext _localctx = new PieceOnBoardContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pieceOnBoard);
		try {
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				digit();
				setState(51);
				piece();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				piece();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PieceContext extends ParserRuleContext {
		public WhitePieceContext whitePiece() {
			return getRuleContext(WhitePieceContext.class,0);
		}
		public BlackPieceContext blackPiece() {
			return getRuleContext(BlackPieceContext.class,0);
		}
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
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PieceContext piece() throws RecognitionException {
		PieceContext _localctx = new PieceContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_piece);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				whitePiece();
				}
				break;
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				blackPiece();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DigitContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(BoardParser.INT, 0); }
		public DigitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterDigit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitDigit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitDigit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigitContext digit() throws RecognitionException {
		DigitContext _localctx = new DigitContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_digit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
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
	public static class WhitePieceContext extends ParserRuleContext {
		public WhitePieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whitePiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterWhitePiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitWhitePiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitWhitePiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhitePieceContext whitePiece() throws RecognitionException {
		WhitePieceContext _localctx = new WhitePieceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whitePiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252L) != 0)) ) {
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
	public static class BlackPieceContext extends ParserRuleContext {
		public BlackPieceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blackPiece; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterBlackPiece(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitBlackPiece(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitBlackPiece(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackPieceContext blackPiece() throws RecognitionException {
		BlackPieceContext _localctx = new BlackPieceContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blackPiece);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16128L) != 0)) ) {
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
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitNextPlayer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NextPlayerContext nextPlayer() throws RecognitionException {
		NextPlayerContext _localctx = new NextPlayerContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nextPlayer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__13) ) {
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
	public static class LineContext extends ParserRuleContext {
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BoardListener ) ((BoardListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BoardVisitor ) return ((BoardVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__14);
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
		"\u0004\u0001\u0010G\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002\"\b\u0002\n\u0002\f\u0002%"+
		"\t\u0002\u0001\u0003\u0005\u0003(\b\u0003\n\u0003\f\u0003+\t\u0003\u0001"+
		"\u0003\u0005\u0003.\b\u0003\n\u0003\f\u00031\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u00047\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005;\b\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0003"+
		"\u0001\u0000\u0002\u0007\u0001\u0000\b\r\u0002\u0000\n\n\u000e\u000e@"+
		"\u0000\u0016\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000"+
		"\u0004#\u0001\u0000\u0000\u0000\u0006)\u0001\u0000\u0000\u0000\b6\u0001"+
		"\u0000\u0000\u0000\n:\u0001\u0000\u0000\u0000\f<\u0001\u0000\u0000\u0000"+
		"\u000e>\u0001\u0000\u0000\u0000\u0010@\u0001\u0000\u0000\u0000\u0012B"+
		"\u0001\u0000\u0000\u0000\u0014D\u0001\u0000\u0000\u0000\u0016\u0017\u0003"+
		"\u0002\u0001\u0000\u0017\u0018\u0005\u0001\u0000\u0000\u0018\u0019\u0003"+
		"\u0004\u0002\u0000\u0019\u001a\u0005\u0001\u0000\u0000\u001a\u001b\u0003"+
		"\u0012\t\u0000\u001b\u0001\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0010"+
		"\u0000\u0000\u001d\u0003\u0001\u0000\u0000\u0000\u001e\u001f\u0003\u0006"+
		"\u0003\u0000\u001f \u0003\u0014\n\u0000 \"\u0001\u0000\u0000\u0000!\u001e"+
		"\u0001\u0000\u0000\u0000\"%\u0001\u0000\u0000\u0000#!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$\u0005\u0001\u0000\u0000\u0000%#\u0001"+
		"\u0000\u0000\u0000&(\u0003\b\u0004\u0000\'&\u0001\u0000\u0000\u0000(+"+
		"\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000"+
		"\u0000*/\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0003\f\u0006"+
		"\u0000-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000"+
		"\u0000\u0000/0\u0001\u0000\u0000\u00000\u0007\u0001\u0000\u0000\u0000"+
		"1/\u0001\u0000\u0000\u000023\u0003\f\u0006\u000034\u0003\n\u0005\u0000"+
		"47\u0001\u0000\u0000\u000057\u0003\n\u0005\u000062\u0001\u0000\u0000\u0000"+
		"65\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u00008;\u0003\u000e\u0007"+
		"\u00009;\u0003\u0010\b\u0000:8\u0001\u0000\u0000\u0000:9\u0001\u0000\u0000"+
		"\u0000;\u000b\u0001\u0000\u0000\u0000<=\u0005\u0010\u0000\u0000=\r\u0001"+
		"\u0000\u0000\u0000>?\u0007\u0000\u0000\u0000?\u000f\u0001\u0000\u0000"+
		"\u0000@A\u0007\u0001\u0000\u0000A\u0011\u0001\u0000\u0000\u0000BC\u0007"+
		"\u0002\u0000\u0000C\u0013\u0001\u0000\u0000\u0000DE\u0005\u000f\u0000"+
		"\u0000E\u0015\u0001\u0000\u0000\u0000\u0005#)/6:";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}