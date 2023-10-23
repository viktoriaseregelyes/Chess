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
		T__0=1, T__1=2, T__2=3, HIT=4, RIGHT=5, LEFT=6, BACK=7, FORWARD=8, AGAIN=9, 
		MOVE=10, MOVE_AGAIN=11, INT=12, DIGIT=13, PAWN=14, KNIGHT=15, BISHOP=16, 
		KING=17, QUEEN=18, ROOK=19, WS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "HIT", "RIGHT", "LEFT", "BACK", "FORWARD", "AGAIN", 
			"MOVE", "MOVE_AGAIN", "INT", "DIGIT", "PAWN", "KNIGHT", "BISHOP", "KING", 
			"QUEEN", "ROOK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'general rule: '", "' rule:'", "'when'", "'hit'", "'right'", "'left'", 
			"'back'", "'forward'", "'again'", "'move'", null, null, null, "'pawn'", 
			"'knight'", "'bishop'", "'king'", "'queen'", "'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "HIT", "RIGHT", "LEFT", "BACK", "FORWARD", "AGAIN", 
			"MOVE", "MOVE_AGAIN", "INT", "DIGIT", "PAWN", "KNIGHT", "BISHOP", "KING", 
			"QUEEN", "ROOK", "WS"
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
		"\u0004\u0000\u0014\u009d\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0004\u000bq\b\u000b\u000b"+
		"\u000b\f\u000br\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0002\u0001"+
		"\u000009\u0003\u0000\t\n\r\r  \u009d\u0000\u0001\u0001\u0000\u0000\u0000"+
		"\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000"+
		"\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000"+
		"\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f"+
		"\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013"+
		"\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017"+
		"\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b"+
		"\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f"+
		"\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000"+
		"\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000"+
		"\u0000\u0001)\u0001\u0000\u0000\u0000\u00038\u0001\u0000\u0000\u0000\u0005"+
		"?\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000\tH\u0001\u0000"+
		"\u0000\u0000\u000bN\u0001\u0000\u0000\u0000\rS\u0001\u0000\u0000\u0000"+
		"\u000fX\u0001\u0000\u0000\u0000\u0011`\u0001\u0000\u0000\u0000\u0013f"+
		"\u0001\u0000\u0000\u0000\u0015k\u0001\u0000\u0000\u0000\u0017p\u0001\u0000"+
		"\u0000\u0000\u0019t\u0001\u0000\u0000\u0000\u001bv\u0001\u0000\u0000\u0000"+
		"\u001d{\u0001\u0000\u0000\u0000\u001f\u0082\u0001\u0000\u0000\u0000!\u0089"+
		"\u0001\u0000\u0000\u0000#\u008e\u0001\u0000\u0000\u0000%\u0094\u0001\u0000"+
		"\u0000\u0000\'\u0099\u0001\u0000\u0000\u0000)*\u0005g\u0000\u0000*+\u0005"+
		"e\u0000\u0000+,\u0005n\u0000\u0000,-\u0005e\u0000\u0000-.\u0005r\u0000"+
		"\u0000./\u0005a\u0000\u0000/0\u0005l\u0000\u000001\u0005 \u0000\u0000"+
		"12\u0005r\u0000\u000023\u0005u\u0000\u000034\u0005l\u0000\u000045\u0005"+
		"e\u0000\u000056\u0005:\u0000\u000067\u0005 \u0000\u00007\u0002\u0001\u0000"+
		"\u0000\u000089\u0005 \u0000\u00009:\u0005r\u0000\u0000:;\u0005u\u0000"+
		"\u0000;<\u0005l\u0000\u0000<=\u0005e\u0000\u0000=>\u0005:\u0000\u0000"+
		">\u0004\u0001\u0000\u0000\u0000?@\u0005w\u0000\u0000@A\u0005h\u0000\u0000"+
		"AB\u0005e\u0000\u0000BC\u0005n\u0000\u0000C\u0006\u0001\u0000\u0000\u0000"+
		"DE\u0005h\u0000\u0000EF\u0005i\u0000\u0000FG\u0005t\u0000\u0000G\b\u0001"+
		"\u0000\u0000\u0000HI\u0005r\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005g"+
		"\u0000\u0000KL\u0005h\u0000\u0000LM\u0005t\u0000\u0000M\n\u0001\u0000"+
		"\u0000\u0000NO\u0005l\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005f\u0000"+
		"\u0000QR\u0005t\u0000\u0000R\f\u0001\u0000\u0000\u0000ST\u0005b\u0000"+
		"\u0000TU\u0005a\u0000\u0000UV\u0005c\u0000\u0000VW\u0005k\u0000\u0000"+
		"W\u000e\u0001\u0000\u0000\u0000XY\u0005f\u0000\u0000YZ\u0005o\u0000\u0000"+
		"Z[\u0005r\u0000\u0000[\\\u0005w\u0000\u0000\\]\u0005a\u0000\u0000]^\u0005"+
		"r\u0000\u0000^_\u0005d\u0000\u0000_\u0010\u0001\u0000\u0000\u0000`a\u0005"+
		"a\u0000\u0000ab\u0005g\u0000\u0000bc\u0005a\u0000\u0000cd\u0005i\u0000"+
		"\u0000de\u0005n\u0000\u0000e\u0012\u0001\u0000\u0000\u0000fg\u0005m\u0000"+
		"\u0000gh\u0005o\u0000\u0000hi\u0005v\u0000\u0000ij\u0005e\u0000\u0000"+
		"j\u0014\u0001\u0000\u0000\u0000kl\u0003\u0013\t\u0000lm\u0005 \u0000\u0000"+
		"mn\u0003\u0011\b\u0000n\u0016\u0001\u0000\u0000\u0000oq\u0003\u0019\f"+
		"\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000"+
		"\u0000\u0000rs\u0001\u0000\u0000\u0000s\u0018\u0001\u0000\u0000\u0000"+
		"tu\u0007\u0000\u0000\u0000u\u001a\u0001\u0000\u0000\u0000vw\u0005p\u0000"+
		"\u0000wx\u0005a\u0000\u0000xy\u0005w\u0000\u0000yz\u0005n\u0000\u0000"+
		"z\u001c\u0001\u0000\u0000\u0000{|\u0005k\u0000\u0000|}\u0005n\u0000\u0000"+
		"}~\u0005i\u0000\u0000~\u007f\u0005g\u0000\u0000\u007f\u0080\u0005h\u0000"+
		"\u0000\u0080\u0081\u0005t\u0000\u0000\u0081\u001e\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0005b\u0000\u0000\u0083\u0084\u0005i\u0000\u0000\u0084\u0085"+
		"\u0005s\u0000\u0000\u0085\u0086\u0005h\u0000\u0000\u0086\u0087\u0005o"+
		"\u0000\u0000\u0087\u0088\u0005p\u0000\u0000\u0088 \u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005k\u0000\u0000\u008a\u008b\u0005i\u0000\u0000\u008b\u008c"+
		"\u0005n\u0000\u0000\u008c\u008d\u0005g\u0000\u0000\u008d\"\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0005q\u0000\u0000\u008f\u0090\u0005u\u0000\u0000"+
		"\u0090\u0091\u0005e\u0000\u0000\u0091\u0092\u0005e\u0000\u0000\u0092\u0093"+
		"\u0005n\u0000\u0000\u0093$\u0001\u0000\u0000\u0000\u0094\u0095\u0005r"+
		"\u0000\u0000\u0095\u0096\u0005o\u0000\u0000\u0096\u0097\u0005o\u0000\u0000"+
		"\u0097\u0098\u0005k\u0000\u0000\u0098&\u0001\u0000\u0000\u0000\u0099\u009a"+
		"\u0007\u0001\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u009c"+
		"\u0006\u0013\u0000\u0000\u009c(\u0001\u0000\u0000\u0000\u0002\u0000r\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}