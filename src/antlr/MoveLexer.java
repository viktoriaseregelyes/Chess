// Generated from C:/Users/Viki/IdeaProjects/Chess/src/antlr/Move.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class MoveLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, HIT=5, RIGHT=6, LEFT=7, BACKWARD=8, FORWARD=9, 
		AGAIN=10, MOVE=11, BECOME=12, INT=13, DIGIT=14, PAWN=15, KNIGHT=16, BISHOP=17, 
		KING=18, QUEEN=19, ROOK=20, WS=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "HIT", "RIGHT", "LEFT", "BACKWARD", "FORWARD", 
			"AGAIN", "MOVE", "BECOME", "INT", "DIGIT", "PAWN", "KNIGHT", "BISHOP", 
			"KING", "QUEEN", "ROOK", "WS"
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


	public MoveLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Move.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u00b5\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\f\u0004\f\u0089\b\f\u000b\f\f\f\u008a\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0002"+
		"\u0001\u000009\u0003\u0000\t\n\r\r  \u00b5\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000"+
		"\u0003;\u0001\u0000\u0000\u0000\u0005B\u0001\u0000\u0000\u0000\u0007P"+
		"\u0001\u0000\u0000\u0000\tU\u0001\u0000\u0000\u0000\u000bY\u0001\u0000"+
		"\u0000\u0000\r_\u0001\u0000\u0000\u0000\u000fd\u0001\u0000\u0000\u0000"+
		"\u0011m\u0001\u0000\u0000\u0000\u0013u\u0001\u0000\u0000\u0000\u0015{"+
		"\u0001\u0000\u0000\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0088"+
		"\u0001\u0000\u0000\u0000\u001b\u008c\u0001\u0000\u0000\u0000\u001d\u008e"+
		"\u0001\u0000\u0000\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\u009a\u0001"+
		"\u0000\u0000\u0000#\u00a1\u0001\u0000\u0000\u0000%\u00a6\u0001\u0000\u0000"+
		"\u0000\'\u00ac\u0001\u0000\u0000\u0000)\u00b1\u0001\u0000\u0000\u0000"+
		"+,\u0005a\u0000\u0000,-\u0005l\u0000\u0000-.\u0005l\u0000\u0000./\u0005"+
		" \u0000\u0000/0\u0005p\u0000\u000001\u0005i\u0000\u000012\u0005e\u0000"+
		"\u000023\u0005c\u0000\u000034\u0005e\u0000\u000045\u0005 \u0000\u0000"+
		"56\u0005r\u0000\u000067\u0005u\u0000\u000078\u0005l\u0000\u000089\u0005"+
		"e\u0000\u00009:\u0005:\u0000\u0000:\u0002\u0001\u0000\u0000\u0000;<\u0005"+
		" \u0000\u0000<=\u0005r\u0000\u0000=>\u0005u\u0000\u0000>?\u0005l\u0000"+
		"\u0000?@\u0005e\u0000\u0000@A\u0005:\u0000\u0000A\u0004\u0001\u0000\u0000"+
		"\u0000BC\u0005g\u0000\u0000CD\u0005e\u0000\u0000DE\u0005n\u0000\u0000"+
		"EF\u0005e\u0000\u0000FG\u0005r\u0000\u0000GH\u0005a\u0000\u0000HI\u0005"+
		"l\u0000\u0000IJ\u0005 \u0000\u0000JK\u0005m\u0000\u0000KL\u0005o\u0000"+
		"\u0000LM\u0005v\u0000\u0000MN\u0005e\u0000\u0000NO\u0005:\u0000\u0000"+
		"O\u0006\u0001\u0000\u0000\u0000PQ\u0005w\u0000\u0000QR\u0005h\u0000\u0000"+
		"RS\u0005e\u0000\u0000ST\u0005n\u0000\u0000T\b\u0001\u0000\u0000\u0000"+
		"UV\u0005h\u0000\u0000VW\u0005i\u0000\u0000WX\u0005t\u0000\u0000X\n\u0001"+
		"\u0000\u0000\u0000YZ\u0005r\u0000\u0000Z[\u0005i\u0000\u0000[\\\u0005"+
		"g\u0000\u0000\\]\u0005h\u0000\u0000]^\u0005t\u0000\u0000^\f\u0001\u0000"+
		"\u0000\u0000_`\u0005l\u0000\u0000`a\u0005e\u0000\u0000ab\u0005f\u0000"+
		"\u0000bc\u0005t\u0000\u0000c\u000e\u0001\u0000\u0000\u0000de\u0005b\u0000"+
		"\u0000ef\u0005a\u0000\u0000fg\u0005c\u0000\u0000gh\u0005k\u0000\u0000"+
		"hi\u0005w\u0000\u0000ij\u0005a\u0000\u0000jk\u0005r\u0000\u0000kl\u0005"+
		"d\u0000\u0000l\u0010\u0001\u0000\u0000\u0000mn\u0005f\u0000\u0000no\u0005"+
		"o\u0000\u0000op\u0005r\u0000\u0000pq\u0005w\u0000\u0000qr\u0005a\u0000"+
		"\u0000rs\u0005r\u0000\u0000st\u0005d\u0000\u0000t\u0012\u0001\u0000\u0000"+
		"\u0000uv\u0005a\u0000\u0000vw\u0005g\u0000\u0000wx\u0005a\u0000\u0000"+
		"xy\u0005i\u0000\u0000yz\u0005n\u0000\u0000z\u0014\u0001\u0000\u0000\u0000"+
		"{|\u0005m\u0000\u0000|}\u0005o\u0000\u0000}~\u0005v\u0000\u0000~\u007f"+
		"\u0005e\u0000\u0000\u007f\u0016\u0001\u0000\u0000\u0000\u0080\u0081\u0005"+
		"b\u0000\u0000\u0081\u0082\u0005e\u0000\u0000\u0082\u0083\u0005c\u0000"+
		"\u0000\u0083\u0084\u0005o\u0000\u0000\u0084\u0085\u0005m\u0000\u0000\u0085"+
		"\u0086\u0005e\u0000\u0000\u0086\u0018\u0001\u0000\u0000\u0000\u0087\u0089"+
		"\u0003\u001b\r\u0000\u0088\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001"+
		"\u0000\u0000\u0000\u008b\u001a\u0001\u0000\u0000\u0000\u008c\u008d\u0007"+
		"\u0000\u0000\u0000\u008d\u001c\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"p\u0000\u0000\u008f\u0090\u0005a\u0000\u0000\u0090\u0091\u0005w\u0000"+
		"\u0000\u0091\u0092\u0005n\u0000\u0000\u0092\u001e\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005k\u0000\u0000\u0094\u0095\u0005n\u0000\u0000\u0095\u0096"+
		"\u0005i\u0000\u0000\u0096\u0097\u0005g\u0000\u0000\u0097\u0098\u0005h"+
		"\u0000\u0000\u0098\u0099\u0005t\u0000\u0000\u0099 \u0001\u0000\u0000\u0000"+
		"\u009a\u009b\u0005b\u0000\u0000\u009b\u009c\u0005i\u0000\u0000\u009c\u009d"+
		"\u0005s\u0000\u0000\u009d\u009e\u0005h\u0000\u0000\u009e\u009f\u0005o"+
		"\u0000\u0000\u009f\u00a0\u0005p\u0000\u0000\u00a0\"\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0005k\u0000\u0000\u00a2\u00a3\u0005i\u0000\u0000\u00a3"+
		"\u00a4\u0005n\u0000\u0000\u00a4\u00a5\u0005g\u0000\u0000\u00a5$\u0001"+
		"\u0000\u0000\u0000\u00a6\u00a7\u0005q\u0000\u0000\u00a7\u00a8\u0005u\u0000"+
		"\u0000\u00a8\u00a9\u0005e\u0000\u0000\u00a9\u00aa\u0005e\u0000\u0000\u00aa"+
		"\u00ab\u0005n\u0000\u0000\u00ab&\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005"+
		"r\u0000\u0000\u00ad\u00ae\u0005o\u0000\u0000\u00ae\u00af\u0005o\u0000"+
		"\u0000\u00af\u00b0\u0005k\u0000\u0000\u00b0(\u0001\u0000\u0000\u0000\u00b1"+
		"\u00b2\u0007\u0001\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0006\u0014\u0000\u0000\u00b4*\u0001\u0000\u0000\u0000\u0002\u0000"+
		"\u008a\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}