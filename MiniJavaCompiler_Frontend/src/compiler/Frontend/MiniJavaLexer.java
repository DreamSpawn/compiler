// Generated from C:\Users\Dickow\Google Drive\3.Semester\CompilerTeknik\Grammatik\MiniJava_v1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJava_v1Lexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__35=1, T__34=2, T__33=3, T__32=4, T__31=5, T__30=6, T__29=7, T__28=8, 
		T__27=9, T__26=10, T__25=11, T__24=12, T__23=13, T__22=14, T__21=15, T__20=16, 
		T__19=17, T__18=18, T__17=19, T__16=20, T__15=21, T__14=22, T__13=23, 
		T__12=24, T__11=25, T__10=26, T__9=27, T__8=28, T__7=29, T__6=30, T__5=31, 
		T__4=32, T__3=33, T__2=34, T__1=35, T__0=36, IDENT=37, INT=38, STRING=39, 
		COMMENT=40, WHITESPACE=41;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'main'", "'true'", "'new'", "'return'", "'class'", "'while'", "';'", 
		"'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", "'if'", "'int'", "'('", 
		"'System.out.print'", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'<'", "'=='", "'String'", "']'", "'public'", 
		"'!'", "'static'", "'else'", "')'", "'+'", "'-'", "IDENT", "INT", "STRING", 
		"COMMENT", "WHITESPACE"
	};
	public static final String[] ruleNames = {
		"T__35", "T__34", "T__33", "T__32", "T__31", "T__30", "T__29", "T__28", 
		"T__27", "T__26", "T__25", "T__24", "T__23", "T__22", "T__21", "T__20", 
		"T__19", "T__18", "T__17", "T__16", "T__15", "T__14", "T__13", "T__12", 
		"T__11", "T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", 
		"T__2", "T__1", "T__0", "LOWER", "UPPER", "NONNULL", "NUMBER", "IDENT", 
		"NEWLINE", "INT", "CHAR", "STRING", "COMMENT", "WHITESPACE"
	};


	public MiniJava_v1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MiniJava_v1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 46: WHITESPACE_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WHITESPACE_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2+\u016a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\""+
		"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\5)\u0114\n)\3"+
		"*\3*\5*\u0118\n*\3*\3*\3*\3*\7*\u011e\n*\f*\16*\u0121\13*\3+\5+\u0124"+
		"\n+\3+\3+\3,\3,\3,\7,\u012b\n,\f,\16,\u012e\13,\5,\u0130\n,\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\3-\5-\u013b\n-\3.\3.\7.\u013f\n.\f.\16.\u0142\13.\3.\3."+
		"\3/\3/\3/\3/\7/\u014a\n/\f/\16/\u014d\13/\3/\3/\3/\3/\3/\7/\u0154\n/\f"+
		"/\16/\u0157\13/\3/\3/\3/\3/\3/\3/\5/\u015f\n/\3/\3/\3\60\3\60\6\60\u0165"+
		"\n\60\r\60\16\60\u0166\3\60\3\60\4\u014b\u0155\61\3\3\1\5\4\1\7\5\1\t"+
		"\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1"+
		"\35\20\1\37\21\1!\22\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32"+
		"\1\63\33\1\65\34\1\67\35\19\36\1;\37\1= \1?!\1A\"\1C#\1E$\1G%\1I&\1K\2"+
		"\1M\2\1O\2\1Q\2\1S\'\1U\2\1W(\1Y\2\1[)\1]*\2_+\3\3\2\4\5\2\"#%]_\u0080"+
		"\4\2\13\13\"\"\u0177\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2"+
		"\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5f\3\2\2\2\7k\3\2\2\2\to\3\2\2\2\13v\3"+
		"\2\2\2\r|\3\2\2\2\17\u0082\3\2\2\2\21\u0084\3\2\2\2\23\u0089\3\2\2\2\25"+
		"\u008b\3\2\2\2\27\u008e\3\2\2\2\31\u0090\3\2\2\2\33\u0092\3\2\2\2\35\u009a"+
		"\3\2\2\2\37\u009d\3\2\2\2!\u00a1\3\2\2\2#\u00a3\3\2\2\2%\u00b4\3\2\2\2"+
		"\'\u00b6\3\2\2\2)\u00bb\3\2\2\2+\u00bd\3\2\2\2-\u00c3\3\2\2\2/\u00c5\3"+
		"\2\2\2\61\u00cd\3\2\2\2\63\u00e0\3\2\2\2\65\u00e2\3\2\2\2\67\u00e4\3\2"+
		"\2\29\u00e7\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f7\3\2\2\2A\u00f9"+
		"\3\2\2\2C\u0100\3\2\2\2E\u0105\3\2\2\2G\u0107\3\2\2\2I\u0109\3\2\2\2K"+
		"\u010b\3\2\2\2M\u010d\3\2\2\2O\u010f\3\2\2\2Q\u0113\3\2\2\2S\u0117\3\2"+
		"\2\2U\u0123\3\2\2\2W\u012f\3\2\2\2Y\u013a\3\2\2\2[\u013c\3\2\2\2]\u015e"+
		"\3\2\2\2_\u0164\3\2\2\2ab\7o\2\2bc\7c\2\2cd\7k\2\2de\7p\2\2e\4\3\2\2\2"+
		"fg\7v\2\2gh\7t\2\2hi\7w\2\2ij\7g\2\2j\6\3\2\2\2kl\7p\2\2lm\7g\2\2mn\7"+
		"y\2\2n\b\3\2\2\2op\7t\2\2pq\7g\2\2qr\7v\2\2rs\7w\2\2st\7t\2\2tu\7p\2\2"+
		"u\n\3\2\2\2vw\7e\2\2wx\7n\2\2xy\7c\2\2yz\7u\2\2z{\7u\2\2{\f\3\2\2\2|}"+
		"\7y\2\2}~\7j\2\2~\177\7k\2\2\177\u0080\7n\2\2\u0080\u0081\7g\2\2\u0081"+
		"\16\3\2\2\2\u0082\u0083\7=\2\2\u0083\20\3\2\2\2\u0084\u0085\7x\2\2\u0085"+
		"\u0086\7q\2\2\u0086\u0087\7k\2\2\u0087\u0088\7f\2\2\u0088\22\3\2\2\2\u0089"+
		"\u008a\7}\2\2\u008a\24\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d"+
		"\26\3\2\2\2\u008e\u008f\7?\2\2\u008f\30\3\2\2\2\u0090\u0091\7\177\2\2"+
		"\u0091\32\3\2\2\2\u0092\u0093\7g\2\2\u0093\u0094\7z\2\2\u0094\u0095\7"+
		"v\2\2\u0095\u0096\7g\2\2\u0096\u0097\7p\2\2\u0097\u0098\7f\2\2\u0098\u0099"+
		"\7u\2\2\u0099\34\3\2\2\2\u009a\u009b\7k\2\2\u009b\u009c\7h\2\2\u009c\36"+
		"\3\2\2\2\u009d\u009e\7k\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7v\2\2\u00a0"+
		" \3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\"\3\2\2\2\u00a3\u00a4\7U\2\2\u00a4"+
		"\u00a5\7{\2\2\u00a5\u00a6\7u\2\2\u00a6\u00a7\7v\2\2\u00a7\u00a8\7g\2\2"+
		"\u00a8\u00a9\7o\2\2\u00a9\u00aa\7\60\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\7r\2\2\u00af"+
		"\u00b0\7t\2\2\u00b0\u00b1\7k\2\2\u00b1\u00b2\7p\2\2\u00b2\u00b3\7v\2\2"+
		"\u00b3$\3\2\2\2\u00b4\u00b5\7,\2\2\u00b5&\3\2\2\2\u00b6\u00b7\7v\2\2\u00b7"+
		"\u00b8\7j\2\2\u00b8\u00b9\7k\2\2\u00b9\u00ba\7u\2\2\u00ba(\3\2\2\2\u00bb"+
		"\u00bc\7.\2\2\u00bc*\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7c\2\2\u00bf"+
		"\u00c0\7n\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7g\2\2\u00c2,\3\2\2\2\u00c3"+
		"\u00c4\7\60\2\2\u00c4.\3\2\2\2\u00c5\u00c6\7d\2\2\u00c6\u00c7\7q\2\2\u00c7"+
		"\u00c8\7q\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7g\2\2\u00ca\u00cb\7c\2\2"+
		"\u00cb\u00cc\7p\2\2\u00cc\60\3\2\2\2\u00cd\u00ce\7U\2\2\u00ce\u00cf\7"+
		"{\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7v\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3"+
		"\7o\2\2\u00d3\u00d4\7\60\2\2\u00d4\u00d5\7q\2\2\u00d5\u00d6\7w\2\2\u00d6"+
		"\u00d7\7v\2\2\u00d7\u00d8\7\60\2\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7t\2"+
		"\2\u00da\u00db\7k\2\2\u00db\u00dc\7p\2\2\u00dc\u00dd\7v\2\2\u00dd\u00de"+
		"\7n\2\2\u00de\u00df\7p\2\2\u00df\62\3\2\2\2\u00e0\u00e1\7]\2\2\u00e1\64"+
		"\3\2\2\2\u00e2\u00e3\7>\2\2\u00e3\66\3\2\2\2\u00e4\u00e5\7?\2\2\u00e5"+
		"\u00e6\7?\2\2\u00e68\3\2\2\2\u00e7\u00e8\7U\2\2\u00e8\u00e9\7v\2\2\u00e9"+
		"\u00ea\7t\2\2\u00ea\u00eb\7k\2\2\u00eb\u00ec\7p\2\2\u00ec\u00ed\7i\2\2"+
		"\u00ed:\3\2\2\2\u00ee\u00ef\7_\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7r\2\2\u00f1"+
		"\u00f2\7w\2\2\u00f2\u00f3\7d\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5\7k\2\2"+
		"\u00f5\u00f6\7e\2\2\u00f6>\3\2\2\2\u00f7\u00f8\7#\2\2\u00f8@\3\2\2\2\u00f9"+
		"\u00fa\7u\2\2\u00fa\u00fb\7v\2\2\u00fb\u00fc\7c\2\2\u00fc\u00fd\7v\2\2"+
		"\u00fd\u00fe\7k\2\2\u00fe\u00ff\7e\2\2\u00ffB\3\2\2\2\u0100\u0101\7g\2"+
		"\2\u0101\u0102\7n\2\2\u0102\u0103\7u\2\2\u0103\u0104\7g\2\2\u0104D\3\2"+
		"\2\2\u0105\u0106\7+\2\2\u0106F\3\2\2\2\u0107\u0108\7-\2\2\u0108H\3\2\2"+
		"\2\u0109\u010a\7/\2\2\u010aJ\3\2\2\2\u010b\u010c\4c|\2\u010cL\3\2\2\2"+
		"\u010d\u010e\4C\\\2\u010eN\3\2\2\2\u010f\u0110\4\63;\2\u0110P\3\2\2\2"+
		"\u0111\u0114\7\62\2\2\u0112\u0114\5O(\2\u0113\u0111\3\2\2\2\u0113\u0112"+
		"\3\2\2\2\u0114R\3\2\2\2\u0115\u0118\5K&\2\u0116\u0118\5M\'\2\u0117\u0115"+
		"\3\2\2\2\u0117\u0116\3\2\2\2\u0118\u011f\3\2\2\2\u0119\u011e\5K&\2\u011a"+
		"\u011e\5M\'\2\u011b\u011e\5Q)\2\u011c\u011e\7a\2\2\u011d\u0119\3\2\2\2"+
		"\u011d\u011a\3\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120T\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0124\7\17\2\2\u0123\u0122\3\2\2\2\u0123\u0124\3"+
		"\2\2\2\u0124\u0125\3\2\2\2\u0125\u0126\7\f\2\2\u0126V\3\2\2\2\u0127\u0130"+
		"\7\62\2\2\u0128\u012c\5O(\2\u0129\u012b\5Q)\2\u012a\u0129\3\2\2\2\u012b"+
		"\u012e\3\2\2\2\u012c\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012f\u0127\3\2\2\2\u012f\u0128\3\2\2\2\u0130"+
		"X\3\2\2\2\u0131\u013b\t\2\2\2\u0132\u0133\7^\2\2\u0133\u013b\7$\2\2\u0134"+
		"\u0135\7^\2\2\u0135\u013b\7^\2\2\u0136\u0137\7^\2\2\u0137\u013b\7v\2\2"+
		"\u0138\u0139\7^\2\2\u0139\u013b\7p\2\2\u013a\u0131\3\2\2\2\u013a\u0132"+
		"\3\2\2\2\u013a\u0134\3\2\2\2\u013a\u0136\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"Z\3\2\2\2\u013c\u0140\7$\2\2\u013d\u013f\5Y-\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0144\7$\2\2\u0144\\\3\2\2\2\u0145\u0146"+
		"\7\61\2\2\u0146\u0147\7\61\2\2\u0147\u014b\3\2\2\2\u0148\u014a\13\2\2"+
		"\2\u0149\u0148\3\2\2\2\u014a\u014d\3\2\2\2\u014b\u014c\3\2\2\2\u014b\u0149"+
		"\3\2\2\2\u014c\u014e\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u015f\5U+\2\u014f"+
		"\u0150\7\61\2\2\u0150\u0151\7,\2\2\u0151\u0155\3\2\2\2\u0152\u0154\13"+
		"\2\2\2\u0153\u0152\3\2\2\2\u0154\u0157\3\2\2\2\u0155\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u0158\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u015f\7*"+
		"\2\2\u0159\u015a\5U+\2\u015a\u015b\7+\2\2\u015b\u015c\7,\2\2\u015c\u015d"+
		"\7\61\2\2\u015d\u015f\3\2\2\2\u015e\u0145\3\2\2\2\u015e\u014f\3\2\2\2"+
		"\u015e\u0159\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b/\2\2\u0161^\3\2"+
		"\2\2\u0162\u0165\t\3\2\2\u0163\u0165\5U+\2\u0164\u0162\3\2\2\2\u0164\u0163"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\b\60\3\2\u0169`\3\2\2\2\21\2\u0113\u0117\u011d"+
		"\u011f\u0123\u012c\u012f\u013a\u0140\u014b\u0155\u015e\u0164\u0166";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}