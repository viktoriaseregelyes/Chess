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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, HIT=6, RIGHT=7, LEFT=8, BACKWARD=9, 
		FORWARD=10, AGAIN=11, MOVE=12, BECOME=13, INT=14, DIGIT=15, PAWN=16, KNIGHT=17, 
		BISHOP=18, KING=19, QUEEN=20, ROOK=21, WS=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "HIT", "RIGHT", "LEFT", "BACKWARD", 
			"FORWARD", "AGAIN", "MOVE", "BECOME", "INT", "DIGIT", "PAWN", "KNIGHT", 
			"BISHOP", "KING", "QUEEN", "ROOK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'all piece rule:'", "' rule:'", "'general move:'", "', '", "'when'", 
			"'hit'", "'right'", "'left'", "'backward'", "'forward'", "'again'", "'move'", 
			"'become'", null, null, "'pawn'", "'knight'", "'bishop'", "'king'", "'queen'", 
			"'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "HIT", "RIGHT", "LEFT", "BACKWARD", 
			"FORWARD", "AGAIN", "MOVE", "BECOME", "INT", "DIGIT", "PAWN", "KNIGHT", 
			"BISHOP", "KING", "QUEEN", "ROOK", "WS"
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
		"\u0004\u0000\u0016\u00ba\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0004\r\u008e\b\r\u000b"+
		"\r\f\r\u008f\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0000\u0000\u0016\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015"+
		"+\u0016\u0001\u0000\u0002\u0001\u000009\u0003\u0000\t\n\r\r  \u00ba\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003="+
		"\u0001\u0000\u0000\u0000\u0005D\u0001\u0000\u0000\u0000\u0007R\u0001\u0000"+
		"\u0000\u0000\tU\u0001\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000"+
		"\r^\u0001\u0000\u0000\u0000\u000fd\u0001\u0000\u0000\u0000\u0011i\u0001"+
		"\u0000\u0000\u0000\u0013r\u0001\u0000\u0000\u0000\u0015z\u0001\u0000\u0000"+
		"\u0000\u0017\u0080\u0001\u0000\u0000\u0000\u0019\u0085\u0001\u0000\u0000"+
		"\u0000\u001b\u008d\u0001\u0000\u0000\u0000\u001d\u0091\u0001\u0000\u0000"+
		"\u0000\u001f\u0093\u0001\u0000\u0000\u0000!\u0098\u0001\u0000\u0000\u0000"+
		"#\u009f\u0001\u0000\u0000\u0000%\u00a6\u0001\u0000\u0000\u0000\'\u00ab"+
		"\u0001\u0000\u0000\u0000)\u00b1\u0001\u0000\u0000\u0000+\u00b6\u0001\u0000"+
		"\u0000\u0000-.\u0005a\u0000\u0000./\u0005l\u0000\u0000/0\u0005l\u0000"+
		"\u000001\u0005 \u0000\u000012\u0005p\u0000\u000023\u0005i\u0000\u0000"+
		"34\u0005e\u0000\u000045\u0005c\u0000\u000056\u0005e\u0000\u000067\u0005"+
		" \u0000\u000078\u0005r\u0000\u000089\u0005u\u0000\u00009:\u0005l\u0000"+
		"\u0000:;\u0005e\u0000\u0000;<\u0005:\u0000\u0000<\u0002\u0001\u0000\u0000"+
		"\u0000=>\u0005 \u0000\u0000>?\u0005r\u0000\u0000?@\u0005u\u0000\u0000"+
		"@A\u0005l\u0000\u0000AB\u0005e\u0000\u0000BC\u0005:\u0000\u0000C\u0004"+
		"\u0001\u0000\u0000\u0000DE\u0005g\u0000\u0000EF\u0005e\u0000\u0000FG\u0005"+
		"n\u0000\u0000GH\u0005e\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005a\u0000"+
		"\u0000JK\u0005l\u0000\u0000KL\u0005 \u0000\u0000LM\u0005m\u0000\u0000"+
		"MN\u0005o\u0000\u0000NO\u0005v\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005"+
		":\u0000\u0000Q\u0006\u0001\u0000\u0000\u0000RS\u0005,\u0000\u0000ST\u0005"+
		" \u0000\u0000T\b\u0001\u0000\u0000\u0000UV\u0005w\u0000\u0000VW\u0005"+
		"h\u0000\u0000WX\u0005e\u0000\u0000XY\u0005n\u0000\u0000Y\n\u0001\u0000"+
		"\u0000\u0000Z[\u0005h\u0000\u0000[\\\u0005i\u0000\u0000\\]\u0005t\u0000"+
		"\u0000]\f\u0001\u0000\u0000\u0000^_\u0005r\u0000\u0000_`\u0005i\u0000"+
		"\u0000`a\u0005g\u0000\u0000ab\u0005h\u0000\u0000bc\u0005t\u0000\u0000"+
		"c\u000e\u0001\u0000\u0000\u0000de\u0005l\u0000\u0000ef\u0005e\u0000\u0000"+
		"fg\u0005f\u0000\u0000gh\u0005t\u0000\u0000h\u0010\u0001\u0000\u0000\u0000"+
		"ij\u0005b\u0000\u0000jk\u0005a\u0000\u0000kl\u0005c\u0000\u0000lm\u0005"+
		"k\u0000\u0000mn\u0005w\u0000\u0000no\u0005a\u0000\u0000op\u0005r\u0000"+
		"\u0000pq\u0005d\u0000\u0000q\u0012\u0001\u0000\u0000\u0000rs\u0005f\u0000"+
		"\u0000st\u0005o\u0000\u0000tu\u0005r\u0000\u0000uv\u0005w\u0000\u0000"+
		"vw\u0005a\u0000\u0000wx\u0005r\u0000\u0000xy\u0005d\u0000\u0000y\u0014"+
		"\u0001\u0000\u0000\u0000z{\u0005a\u0000\u0000{|\u0005g\u0000\u0000|}\u0005"+
		"a\u0000\u0000}~\u0005i\u0000\u0000~\u007f\u0005n\u0000\u0000\u007f\u0016"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0005m\u0000\u0000\u0081\u0082\u0005"+
		"o\u0000\u0000\u0082\u0083\u0005v\u0000\u0000\u0083\u0084\u0005e\u0000"+
		"\u0000\u0084\u0018\u0001\u0000\u0000\u0000\u0085\u0086\u0005b\u0000\u0000"+
		"\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005c\u0000\u0000\u0088\u0089"+
		"\u0005o\u0000\u0000\u0089\u008a\u0005m\u0000\u0000\u008a\u008b\u0005e"+
		"\u0000\u0000\u008b\u001a\u0001\u0000\u0000\u0000\u008c\u008e\u0003\u001d"+
		"\u000e\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u001c\u0001\u0000\u0000\u0000\u0091\u0092\u0007\u0000"+
		"\u0000\u0000\u0092\u001e\u0001\u0000\u0000\u0000\u0093\u0094\u0005p\u0000"+
		"\u0000\u0094\u0095\u0005a\u0000\u0000\u0095\u0096\u0005w\u0000\u0000\u0096"+
		"\u0097\u0005n\u0000\u0000\u0097 \u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"k\u0000\u0000\u0099\u009a\u0005n\u0000\u0000\u009a\u009b\u0005i\u0000"+
		"\u0000\u009b\u009c\u0005g\u0000\u0000\u009c\u009d\u0005h\u0000\u0000\u009d"+
		"\u009e\u0005t\u0000\u0000\u009e\"\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005b\u0000\u0000\u00a0\u00a1\u0005i\u0000\u0000\u00a1\u00a2\u0005s"+
		"\u0000\u0000\u00a2\u00a3\u0005h\u0000\u0000\u00a3\u00a4\u0005o\u0000\u0000"+
		"\u00a4\u00a5\u0005p\u0000\u0000\u00a5$\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005k\u0000\u0000\u00a7\u00a8\u0005i\u0000\u0000\u00a8\u00a9\u0005n"+
		"\u0000\u0000\u00a9\u00aa\u0005g\u0000\u0000\u00aa&\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0005q\u0000\u0000\u00ac\u00ad\u0005u\u0000\u0000\u00ad\u00ae"+
		"\u0005e\u0000\u0000\u00ae\u00af\u0005e\u0000\u0000\u00af\u00b0\u0005n"+
		"\u0000\u0000\u00b0(\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005r\u0000\u0000"+
		"\u00b2\u00b3\u0005o\u0000\u0000\u00b3\u00b4\u0005o\u0000\u0000\u00b4\u00b5"+
		"\u0005k\u0000\u0000\u00b5*\u0001\u0000\u0000\u0000\u00b6\u00b7\u0007\u0001"+
		"\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b9\u0006\u0015"+
		"\u0000\u0000\u00b9,\u0001\u0000\u0000\u0000\u0002\u0000\u008f\u0001\u0006"+
		"\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}