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
		T__0=1, T__1=2, T__2=3, HIT=4, RIGHT=5, LEFT=6, BACK=7, FORWARD=8, INT=9, 
		DIGIT=10, PAWN=11, KNIGHT=12, BISHOP=13, KING=14, QUEEN=15, ROOK=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "HIT", "RIGHT", "LEFT", "BACK", "FORWARD", "INT", 
			"DIGIT", "PAWN", "KNIGHT", "BISHOP", "KING", "QUEEN", "ROOK", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'general role:'", "' role:'", "'if'", "'hit'", "'right'", "'left'", 
			"'back'", "'forward'", null, null, "'pawn'", "'knight'", "'bishop'", 
			"'king'", "'queen'", "'rook'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "HIT", "RIGHT", "LEFT", "BACK", "FORWARD", "INT", 
			"DIGIT", "PAWN", "KNIGHT", "BISHOP", "KING", "QUEEN", "ROOK", "WS"
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
		"\u0004\u0000\u0011\u0085\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0004\bY\b\b\u000b\b\f\bZ\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011\u0001\u0000\u0002\u0001\u000009\u0003\u0000"+
		"\t\n\r\r  \u0085\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		"1\u0001\u0000\u0000\u0000\u00058\u0001\u0000\u0000\u0000\u0007;\u0001"+
		"\u0000\u0000\u0000\t?\u0001\u0000\u0000\u0000\u000bE\u0001\u0000\u0000"+
		"\u0000\rJ\u0001\u0000\u0000\u0000\u000fO\u0001\u0000\u0000\u0000\u0011"+
		"X\u0001\u0000\u0000\u0000\u0013\\\u0001\u0000\u0000\u0000\u0015^\u0001"+
		"\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019j\u0001\u0000\u0000"+
		"\u0000\u001bq\u0001\u0000\u0000\u0000\u001dv\u0001\u0000\u0000\u0000\u001f"+
		"|\u0001\u0000\u0000\u0000!\u0081\u0001\u0000\u0000\u0000#$\u0005g\u0000"+
		"\u0000$%\u0005e\u0000\u0000%&\u0005n\u0000\u0000&\'\u0005e\u0000\u0000"+
		"\'(\u0005r\u0000\u0000()\u0005a\u0000\u0000)*\u0005l\u0000\u0000*+\u0005"+
		" \u0000\u0000+,\u0005r\u0000\u0000,-\u0005o\u0000\u0000-.\u0005l\u0000"+
		"\u0000./\u0005e\u0000\u0000/0\u0005:\u0000\u00000\u0002\u0001\u0000\u0000"+
		"\u000012\u0005 \u0000\u000023\u0005r\u0000\u000034\u0005o\u0000\u0000"+
		"45\u0005l\u0000\u000056\u0005e\u0000\u000067\u0005:\u0000\u00007\u0004"+
		"\u0001\u0000\u0000\u000089\u0005i\u0000\u00009:\u0005f\u0000\u0000:\u0006"+
		"\u0001\u0000\u0000\u0000;<\u0005h\u0000\u0000<=\u0005i\u0000\u0000=>\u0005"+
		"t\u0000\u0000>\b\u0001\u0000\u0000\u0000?@\u0005r\u0000\u0000@A\u0005"+
		"i\u0000\u0000AB\u0005g\u0000\u0000BC\u0005h\u0000\u0000CD\u0005t\u0000"+
		"\u0000D\n\u0001\u0000\u0000\u0000EF\u0005l\u0000\u0000FG\u0005e\u0000"+
		"\u0000GH\u0005f\u0000\u0000HI\u0005t\u0000\u0000I\f\u0001\u0000\u0000"+
		"\u0000JK\u0005b\u0000\u0000KL\u0005a\u0000\u0000LM\u0005c\u0000\u0000"+
		"MN\u0005k\u0000\u0000N\u000e\u0001\u0000\u0000\u0000OP\u0005f\u0000\u0000"+
		"PQ\u0005o\u0000\u0000QR\u0005r\u0000\u0000RS\u0005w\u0000\u0000ST\u0005"+
		"a\u0000\u0000TU\u0005r\u0000\u0000UV\u0005d\u0000\u0000V\u0010\u0001\u0000"+
		"\u0000\u0000WY\u0003\u0013\t\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000"+
		"\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\u0012"+
		"\u0001\u0000\u0000\u0000\\]\u0007\u0000\u0000\u0000]\u0014\u0001\u0000"+
		"\u0000\u0000^_\u0005p\u0000\u0000_`\u0005a\u0000\u0000`a\u0005w\u0000"+
		"\u0000ab\u0005n\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005k\u0000"+
		"\u0000de\u0005n\u0000\u0000ef\u0005i\u0000\u0000fg\u0005g\u0000\u0000"+
		"gh\u0005h\u0000\u0000hi\u0005t\u0000\u0000i\u0018\u0001\u0000\u0000\u0000"+
		"jk\u0005b\u0000\u0000kl\u0005i\u0000\u0000lm\u0005s\u0000\u0000mn\u0005"+
		"h\u0000\u0000no\u0005o\u0000\u0000op\u0005p\u0000\u0000p\u001a\u0001\u0000"+
		"\u0000\u0000qr\u0005k\u0000\u0000rs\u0005i\u0000\u0000st\u0005n\u0000"+
		"\u0000tu\u0005g\u0000\u0000u\u001c\u0001\u0000\u0000\u0000vw\u0005q\u0000"+
		"\u0000wx\u0005u\u0000\u0000xy\u0005e\u0000\u0000yz\u0005e\u0000\u0000"+
		"z{\u0005n\u0000\u0000{\u001e\u0001\u0000\u0000\u0000|}\u0005r\u0000\u0000"+
		"}~\u0005o\u0000\u0000~\u007f\u0005o\u0000\u0000\u007f\u0080\u0005k\u0000"+
		"\u0000\u0080 \u0001\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0084\u0006\u0010\u0000\u0000"+
		"\u0084\"\u0001\u0000\u0000\u0000\u0002\u0000Z\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}