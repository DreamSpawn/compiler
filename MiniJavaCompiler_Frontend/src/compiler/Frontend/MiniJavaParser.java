// Generated from C:\Users\Dickow\Google Drive\3.Semester\CompilerTeknik\Grammatik\MiniJava_v1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJava_v1Parser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'true'", "'new'", "'return'", "'class'", "'while'", 
		"';'", "'void'", "'{'", "'&&'", "'='", "'}'", "'extends'", "'if'", "'int'", 
		"'('", "'System.out.print'", "'*'", "'this'", "','", "'false'", "'.'", 
		"'boolean'", "'System.out.println'", "'['", "'<'", "'=='", "'String'", 
		"']'", "'public'", "'!'", "'static'", "'else'", "')'", "'+'", "'-'", "IDENT", 
		"INT", "STRING", "COMMENT", "WHITESPACE"
	};
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_mainClass = 2, RULE_block = 3, 
		RULE_varDeclaration = 4, RULE_variable = 5, RULE_type = 6, RULE_typeBoolean = 7, 
		RULE_typeInt = 8, RULE_typeClass = 9, RULE_methodDeclaration = 10, RULE_procType = 11, 
		RULE_typeVoid = 12, RULE_statement = 13, RULE_statementBlock = 14, RULE_statementIf = 15, 
		RULE_statementWhile = 16, RULE_statementAssign = 17, RULE_statementArrayAssignment = 18, 
		RULE_statementPrintln = 19, RULE_statementPrint = 20, RULE_statementMethodCall = 21, 
		RULE_statementReturn = 22, RULE_expression = 23, RULE_level1 = 24, RULE_level2 = 25, 
		RULE_level3 = 26, RULE_level4 = 27, RULE_level5 = 28, RULE_expressionUnaryMinus = 29, 
		RULE_expressionNegation = 30, RULE_expressionNewIntArray = 31, RULE_expressionNewObject = 32, 
		RULE_expressionIdentifier = 33, RULE_expressionArrayAccess = 34, RULE_expressionMethodCall = 35, 
		RULE_expressionParentheses = 36, RULE_expressionConstantTrue = 37, RULE_expressionConstantFalse = 38, 
		RULE_expressionConstantInteger = 39, RULE_expressionConstantString = 40, 
		RULE_identifier = 41, RULE_id = 42, RULE_idThis = 43, RULE_idIDENT = 44;
	public static final String[] ruleNames = {
		"program", "classDeclaration", "mainClass", "block", "varDeclaration", 
		"variable", "type", "typeBoolean", "typeInt", "typeClass", "methodDeclaration", 
		"procType", "typeVoid", "statement", "statementBlock", "statementIf", 
		"statementWhile", "statementAssign", "statementArrayAssignment", "statementPrintln", 
		"statementPrint", "statementMethodCall", "statementReturn", "expression", 
		"level1", "level2", "level3", "level4", "level5", "expressionUnaryMinus", 
		"expressionNegation", "expressionNewIntArray", "expressionNewObject", 
		"expressionIdentifier", "expressionArrayAccess", "expressionMethodCall", 
		"expressionParentheses", "expressionConstantTrue", "expressionConstantFalse", 
		"expressionConstantInteger", "expressionConstantString", "identifier", 
		"id", "idThis", "idIDENT"
	};

	@Override
	public String getGrammarFileName() { return "MiniJava_v1.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJava_v1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90); mainClass();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==5) {
				{
				{
				setState(91); classDeclaration();
				}
				}
				setState(96);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public Token className;
		public Token superClassName;
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public TerminalNode IDENT(int i) {
			return getToken(MiniJava_v1Parser.IDENT, i);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJava_v1Parser.IDENT); }
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97); match(5);
			setState(98); ((ClassDeclarationContext)_localctx).className = match(IDENT);
			setState(101);
			_la = _input.LA(1);
			if (_la==13) {
				{
				setState(99); match(13);
				setState(100); ((ClassDeclarationContext)_localctx).superClassName = match(IDENT);
				}
			}

			setState(103); match(9);
			setState(107);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(104); varDeclaration();
					}
					} 
				}
				setState(109);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 8) | (1L << 15) | (1L << 23) | (1L << 30) | (1L << 32) | (1L << IDENT))) != 0)) {
				{
				{
				setState(110); methodDeclaration();
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(116); match(12);
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

	public static class MainClassContext extends ParserRuleContext {
		public Token className;
		public Token parameterName;
		public TerminalNode IDENT(int i) {
			return getToken(MiniJava_v1Parser.IDENT, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJava_v1Parser.IDENT); }
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterMainClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitMainClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitMainClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); match(5);
			setState(119); ((MainClassContext)_localctx).className = match(IDENT);
			setState(120); match(9);
			setState(121); match(30);
			setState(122); match(32);
			setState(123); match(8);
			setState(124); match(1);
			setState(125); match(16);
			setState(126); match(28);
			setState(127); match(25);
			setState(128); match(29);
			setState(129); ((MainClassContext)_localctx).parameterName = match(IDENT);
			setState(130); match(34);
			setState(131); block();
			setState(132); match(12);
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

	public static class BlockContext extends ParserRuleContext {
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(134); match(9);
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(135); varDeclaration();
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 4) | (1L << 6) | (1L << 9) | (1L << 14) | (1L << 17) | (1L << 19) | (1L << 24) | (1L << IDENT))) != 0)) {
				{
				{
				setState(141); statement();
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147); match(12);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); variable();
			setState(150); match(7);
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

	public static class VariableContext extends ParserRuleContext {
		public Token variableName;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152); type();
			setState(153); ((VariableContext)_localctx).variableName = match(IDENT);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeIntContext typeInt() {
			return getRuleContext(TypeIntContext.class,0);
		}
		public TypeClassContext typeClass() {
			return getRuleContext(TypeClassContext.class,0);
		}
		public TypeBooleanContext typeBoolean() {
			return getRuleContext(TypeBooleanContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_type);
		try {
			setState(158);
			switch (_input.LA(1)) {
			case 23:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); typeBoolean();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); typeInt();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(157); typeClass();
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

	public static class TypeBooleanContext extends ParserRuleContext {
		public TypeBooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBoolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterTypeBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitTypeBoolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitTypeBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBooleanContext typeBoolean() throws RecognitionException {
		TypeBooleanContext _localctx = new TypeBooleanContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeBoolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160); match(23);
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

	public static class TypeIntContext extends ParserRuleContext {
		public TypeIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterTypeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitTypeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitTypeInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeIntContext typeInt() throws RecognitionException {
		TypeIntContext _localctx = new TypeIntContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeInt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(15);
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

	public static class TypeClassContext extends ParserRuleContext {
		public Token className;
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public TypeClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterTypeClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitTypeClass(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitTypeClass(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeClassContext typeClass() throws RecognitionException {
		TypeClassContext _localctx = new TypeClassContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); ((TypeClassContext)_localctx).className = match(IDENT);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public Token isPublic;
		public Token isStatic;
		public Token methodName;
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public ProcTypeContext procType() {
			return getRuleContext(ProcTypeContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if (_la==30) {
				{
				setState(166); ((MethodDeclarationContext)_localctx).isPublic = match(30);
				}
			}

			setState(170);
			_la = _input.LA(1);
			if (_la==32) {
				{
				setState(169); ((MethodDeclarationContext)_localctx).isStatic = match(32);
				}
			}

			setState(172); procType();
			setState(173); ((MethodDeclarationContext)_localctx).methodName = match(IDENT);
			setState(174); match(16);
			setState(183);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 15) | (1L << 23) | (1L << IDENT))) != 0)) {
				{
				setState(175); variable();
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(176); match(20);
					setState(177); variable();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(185); match(34);
			setState(186); match(9);
			setState(190);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(187); varDeclaration();
					}
					} 
				}
				setState(192);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(196);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(193); statement();
					}
					} 
				}
				setState(198);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(199); statementReturn();
			setState(200); match(12);
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

	public static class ProcTypeContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeVoidContext typeVoid() {
			return getRuleContext(TypeVoidContext.class,0);
		}
		public ProcTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterProcType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitProcType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitProcType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcTypeContext procType() throws RecognitionException {
		ProcTypeContext _localctx = new ProcTypeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procType);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case 8:
				enterOuterAlt(_localctx, 1);
				{
				setState(202); typeVoid();
				}
				break;
			case 15:
			case 23:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(203); type();
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

	public static class TypeVoidContext extends ParserRuleContext {
		public TypeVoidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeVoid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterTypeVoid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitTypeVoid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitTypeVoid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeVoidContext typeVoid() throws RecognitionException {
		TypeVoidContext _localctx = new TypeVoidContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeVoid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206); match(8);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementPrintlnContext statementPrintln() {
			return getRuleContext(StatementPrintlnContext.class,0);
		}
		public StatementAssignContext statementAssign() {
			return getRuleContext(StatementAssignContext.class,0);
		}
		public StatementArrayAssignmentContext statementArrayAssignment() {
			return getRuleContext(StatementArrayAssignmentContext.class,0);
		}
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public StatementPrintContext statementPrint() {
			return getRuleContext(StatementPrintContext.class,0);
		}
		public StatementWhileContext statementWhile() {
			return getRuleContext(StatementWhileContext.class,0);
		}
		public StatementReturnContext statementReturn() {
			return getRuleContext(StatementReturnContext.class,0);
		}
		public StatementMethodCallContext statementMethodCall() {
			return getRuleContext(StatementMethodCallContext.class,0);
		}
		public StatementIfContext statementIf() {
			return getRuleContext(StatementIfContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(217);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208); statementBlock();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209); statementIf();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210); statementWhile();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211); statementAssign();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212); statementArrayAssignment();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213); statementPrintln();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214); statementPrint();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215); statementMethodCall();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216); statementReturn();
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

	public static class StatementBlockContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statementBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219); block();
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

	public static class StatementIfContext extends ParserRuleContext {
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public StatementIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementIfContext statementIf() throws RecognitionException {
		StatementIfContext _localctx = new StatementIfContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_statementIf);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221); match(14);
			setState(222); match(16);
			setState(223); expression();
			setState(224); match(34);
			setState(225); block();
			setState(228);
			_la = _input.LA(1);
			if (_la==33) {
				{
				setState(226); match(33);
				setState(227); block();
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

	public static class StatementWhileContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementWhileContext statementWhile() throws RecognitionException {
		StatementWhileContext _localctx = new StatementWhileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statementWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230); match(6);
			setState(231); match(16);
			setState(232); expression();
			setState(233); match(34);
			setState(234); statement();
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

	public static class StatementAssignContext extends ParserRuleContext {
		public IdentifierContext lhs;
		public ExpressionContext rhs;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementAssign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementAssignContext statementAssign() throws RecognitionException {
		StatementAssignContext _localctx = new StatementAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statementAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236); ((StatementAssignContext)_localctx).lhs = identifier();
			setState(237); match(11);
			setState(238); ((StatementAssignContext)_localctx).rhs = expression();
			setState(239); match(7);
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

	public static class StatementArrayAssignmentContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementArrayAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementArrayAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementArrayAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementArrayAssignmentContext statementArrayAssignment() throws RecognitionException {
		StatementArrayAssignmentContext _localctx = new StatementArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_statementArrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241); identifier();
			setState(242); match(25);
			setState(243); expression();
			setState(244); match(29);
			setState(245); match(11);
			setState(246); expression();
			setState(247); match(7);
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

	public static class StatementPrintlnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrintln; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementPrintln(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementPrintln(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementPrintln(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintlnContext statementPrintln() throws RecognitionException {
		StatementPrintlnContext _localctx = new StatementPrintlnContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementPrintln);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249); match(24);
			setState(250); match(16);
			setState(251); ((StatementPrintlnContext)_localctx).argument = expression();
			setState(252); match(34);
			setState(253); match(7);
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

	public static class StatementPrintContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementPrintContext statementPrint() throws RecognitionException {
		StatementPrintContext _localctx = new StatementPrintContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_statementPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255); match(17);
			setState(256); match(16);
			setState(257); expression();
			setState(258); match(34);
			setState(259); match(7);
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

	public static class StatementMethodCallContext extends ParserRuleContext {
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public StatementMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementMethodCallContext statementMethodCall() throws RecognitionException {
		StatementMethodCallContext _localctx = new StatementMethodCallContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_statementMethodCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261); expressionMethodCall();
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

	public static class StatementReturnContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterStatementReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitStatementReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitStatementReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementReturnContext statementReturn() throws RecognitionException {
		StatementReturnContext _localctx = new StatementReturnContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263); match(4);
			setState(268);
			_la = _input.LA(1);
			if (_la==16) {
				{
				setState(264); match(16);
				setState(265); ((StatementReturnContext)_localctx).argument = expression();
				setState(266); match(34);
				}
			}

			setState(270); match(7);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Level1Context head;
		public Level1Context level1;
		public List<Level1Context> tail = new ArrayList<Level1Context>();
		public Level1Context level1(int i) {
			return getRuleContext(Level1Context.class,i);
		}
		public List<Level1Context> level1() {
			return getRuleContexts(Level1Context.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272); ((ExpressionContext)_localctx).head = level1();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==10) {
				{
				{
				setState(273); match(10);
				setState(274); ((ExpressionContext)_localctx).level1 = level1();
				((ExpressionContext)_localctx).tail.add(((ExpressionContext)_localctx).level1);
				}
				}
				setState(279);
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

	public static class Level1Context extends ParserRuleContext {
		public Level2Context head;
		public Level2Context level2;
		public List<Level2Context> tail = new ArrayList<Level2Context>();
		public Level2Context level2(int i) {
			return getRuleContext(Level2Context.class,i);
		}
		public List<Level2Context> level2() {
			return getRuleContexts(Level2Context.class);
		}
		public Level1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterLevel1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitLevel1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitLevel1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level1Context level1() throws RecognitionException {
		Level1Context _localctx = new Level1Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_level1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280); ((Level1Context)_localctx).head = level2();
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==27) {
				{
				{
				setState(281); match(27);
				setState(282); ((Level1Context)_localctx).level2 = level2();
				((Level1Context)_localctx).tail.add(((Level1Context)_localctx).level2);
				}
				}
				setState(287);
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

	public static class Level2Context extends ParserRuleContext {
		public Level3Context head;
		public Level3Context level3;
		public List<Level3Context> tail = new ArrayList<Level3Context>();
		public List<Level3Context> level3() {
			return getRuleContexts(Level3Context.class);
		}
		public Level3Context level3(int i) {
			return getRuleContext(Level3Context.class,i);
		}
		public Level2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterLevel2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitLevel2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitLevel2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level2Context level2() throws RecognitionException {
		Level2Context _localctx = new Level2Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_level2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288); ((Level2Context)_localctx).head = level3();
			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==26) {
				{
				{
				setState(289); match(26);
				setState(290); ((Level2Context)_localctx).level3 = level3();
				((Level2Context)_localctx).tail.add(((Level2Context)_localctx).level3);
				}
				}
				setState(295);
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

	public static class Level3Context extends ParserRuleContext {
		public Level4Context head;
		public Level4Context level4;
		public List<Level4Context> tail = new ArrayList<Level4Context>();
		public List<Level4Context> level4() {
			return getRuleContexts(Level4Context.class);
		}
		public Level4Context level4(int i) {
			return getRuleContext(Level4Context.class,i);
		}
		public Level3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterLevel3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitLevel3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitLevel3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level3Context level3() throws RecognitionException {
		Level3Context _localctx = new Level3Context(_ctx, getState());
		enterRule(_localctx, 52, RULE_level3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296); ((Level3Context)_localctx).head = level4();
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==35 || _la==36) {
				{
				{
				setState(297);
				_la = _input.LA(1);
				if ( !(_la==35 || _la==36) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(298); ((Level3Context)_localctx).level4 = level4();
				((Level3Context)_localctx).tail.add(((Level3Context)_localctx).level4);
				}
				}
				setState(303);
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

	public static class Level4Context extends ParserRuleContext {
		public Level5Context head;
		public Level5Context level5;
		public List<Level5Context> tail = new ArrayList<Level5Context>();
		public List<Level5Context> level5() {
			return getRuleContexts(Level5Context.class);
		}
		public Level5Context level5(int i) {
			return getRuleContext(Level5Context.class,i);
		}
		public Level4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterLevel4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitLevel4(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitLevel4(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level4Context level4() throws RecognitionException {
		Level4Context _localctx = new Level4Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_level4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304); ((Level4Context)_localctx).head = level5();
			setState(309);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==18) {
				{
				{
				setState(305); match(18);
				setState(306); ((Level4Context)_localctx).level5 = level5();
				((Level4Context)_localctx).tail.add(((Level4Context)_localctx).level5);
				}
				}
				setState(311);
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

	public static class Level5Context extends ParserRuleContext {
		public ExpressionConstantFalseContext expressionConstantFalse() {
			return getRuleContext(ExpressionConstantFalseContext.class,0);
		}
		public ExpressionConstantStringContext expressionConstantString() {
			return getRuleContext(ExpressionConstantStringContext.class,0);
		}
		public ExpressionConstantIntegerContext expressionConstantInteger() {
			return getRuleContext(ExpressionConstantIntegerContext.class,0);
		}
		public ExpressionParenthesesContext expressionParentheses() {
			return getRuleContext(ExpressionParenthesesContext.class,0);
		}
		public ExpressionNewIntArrayContext expressionNewIntArray() {
			return getRuleContext(ExpressionNewIntArrayContext.class,0);
		}
		public ExpressionArrayAccessContext expressionArrayAccess() {
			return getRuleContext(ExpressionArrayAccessContext.class,0);
		}
		public ExpressionNegationContext expressionNegation() {
			return getRuleContext(ExpressionNegationContext.class,0);
		}
		public ExpressionNewObjectContext expressionNewObject() {
			return getRuleContext(ExpressionNewObjectContext.class,0);
		}
		public ExpressionMethodCallContext expressionMethodCall() {
			return getRuleContext(ExpressionMethodCallContext.class,0);
		}
		public ExpressionUnaryMinusContext expressionUnaryMinus() {
			return getRuleContext(ExpressionUnaryMinusContext.class,0);
		}
		public ExpressionConstantTrueContext expressionConstantTrue() {
			return getRuleContext(ExpressionConstantTrueContext.class,0);
		}
		public ExpressionIdentifierContext expressionIdentifier() {
			return getRuleContext(ExpressionIdentifierContext.class,0);
		}
		public Level5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_level5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterLevel5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitLevel5(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitLevel5(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Level5Context level5() throws RecognitionException {
		Level5Context _localctx = new Level5Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_level5);
		try {
			setState(324);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(312); expressionUnaryMinus();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(313); expressionNegation();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314); expressionNewIntArray();
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(315); expressionNewObject();
				}
				break;

			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(316); expressionIdentifier();
				}
				break;

			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(317); expressionArrayAccess();
				}
				break;

			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(318); expressionMethodCall();
				}
				break;

			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(319); expressionParentheses();
				}
				break;

			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(320); expressionConstantTrue();
				}
				break;

			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(321); expressionConstantFalse();
				}
				break;

			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(322); expressionConstantInteger();
				}
				break;

			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(323); expressionConstantString();
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

	public static class ExpressionUnaryMinusContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionUnaryMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionUnaryMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionUnaryMinusContext expressionUnaryMinus() throws RecognitionException {
		ExpressionUnaryMinusContext _localctx = new ExpressionUnaryMinusContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_expressionUnaryMinus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326); match(36);
			setState(327); ((ExpressionUnaryMinusContext)_localctx).argument = level5();
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

	public static class ExpressionNegationContext extends ParserRuleContext {
		public Level5Context argument;
		public Level5Context level5() {
			return getRuleContext(Level5Context.class,0);
		}
		public ExpressionNegationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNegation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionNegation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNegationContext expressionNegation() throws RecognitionException {
		ExpressionNegationContext _localctx = new ExpressionNegationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_expressionNegation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(329); match(31);
			setState(330); ((ExpressionNegationContext)_localctx).argument = level5();
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

	public static class ExpressionNewIntArrayContext extends ParserRuleContext {
		public ExpressionContext size;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionNewIntArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewIntArray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionNewIntArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionNewIntArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionNewIntArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewIntArrayContext expressionNewIntArray() throws RecognitionException {
		ExpressionNewIntArrayContext _localctx = new ExpressionNewIntArrayContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_expressionNewIntArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332); match(3);
			setState(333); match(15);
			setState(334); match(25);
			setState(335); ((ExpressionNewIntArrayContext)_localctx).size = expression();
			setState(336); match(29);
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

	public static class ExpressionNewObjectContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public ExpressionNewObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionNewObject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionNewObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionNewObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionNewObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionNewObjectContext expressionNewObject() throws RecognitionException {
		ExpressionNewObjectContext _localctx = new ExpressionNewObjectContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expressionNewObject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338); match(3);
			setState(339); match(IDENT);
			setState(340); match(16);
			setState(341); match(34);
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

	public static class ExpressionIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionIdentifierContext expressionIdentifier() throws RecognitionException {
		ExpressionIdentifierContext _localctx = new ExpressionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343); identifier();
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

	public static class ExpressionArrayAccessContext extends ParserRuleContext {
		public ExpressionContext adress;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionArrayAccessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionArrayAccess; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionArrayAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionArrayAccess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionArrayAccess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionArrayAccessContext expressionArrayAccess() throws RecognitionException {
		ExpressionArrayAccessContext _localctx = new ExpressionArrayAccessContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_expressionArrayAccess);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345); identifier();
			setState(346); match(25);
			setState(347); ((ExpressionArrayAccessContext)_localctx).adress = expression();
			setState(348); match(29);
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

	public static class ExpressionMethodCallContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public ExpressionMethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionMethodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionMethodCallContext expressionMethodCall() throws RecognitionException {
		ExpressionMethodCallContext _localctx = new ExpressionMethodCallContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expressionMethodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(350); identifier();
				setState(351); match(22);
				}
				break;
			}
			setState(355); match(IDENT);
			setState(356); match(16);
			setState(365);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 3) | (1L << 16) | (1L << 19) | (1L << 21) | (1L << 31) | (1L << 36) | (1L << IDENT) | (1L << INT) | (1L << STRING))) != 0)) {
				{
				setState(357); expression();
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==20) {
					{
					{
					setState(358); match(20);
					setState(359); expression();
					}
					}
					setState(364);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(367); match(34);
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

	public static class ExpressionParenthesesContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionParentheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionParentheses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionParenthesesContext expressionParentheses() throws RecognitionException {
		ExpressionParenthesesContext _localctx = new ExpressionParenthesesContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_expressionParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369); match(16);
			setState(370); ((ExpressionParenthesesContext)_localctx).argument = expression();
			setState(371); match(34);
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

	public static class ExpressionConstantTrueContext extends ParserRuleContext {
		public ExpressionConstantTrueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantTrue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionConstantTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionConstantTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionConstantTrue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantTrueContext expressionConstantTrue() throws RecognitionException {
		ExpressionConstantTrueContext _localctx = new ExpressionConstantTrueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_expressionConstantTrue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373); match(2);
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

	public static class ExpressionConstantFalseContext extends ParserRuleContext {
		public ExpressionConstantFalseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantFalse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionConstantFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionConstantFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionConstantFalse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantFalseContext expressionConstantFalse() throws RecognitionException {
		ExpressionConstantFalseContext _localctx = new ExpressionConstantFalseContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_expressionConstantFalse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375); match(21);
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

	public static class ExpressionConstantIntegerContext extends ParserRuleContext {
		public Token value;
		public TerminalNode INT() { return getToken(MiniJava_v1Parser.INT, 0); }
		public ExpressionConstantIntegerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantInteger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionConstantInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionConstantInteger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionConstantInteger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantIntegerContext expressionConstantInteger() throws RecognitionException {
		ExpressionConstantIntegerContext _localctx = new ExpressionConstantIntegerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_expressionConstantInteger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377); ((ExpressionConstantIntegerContext)_localctx).value = match(INT);
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

	public static class ExpressionConstantStringContext extends ParserRuleContext {
		public Token value;
		public TerminalNode STRING() { return getToken(MiniJava_v1Parser.STRING, 0); }
		public ExpressionConstantStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionConstantString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterExpressionConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitExpressionConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitExpressionConstantString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionConstantStringContext expressionConstantString() throws RecognitionException {
		ExpressionConstantStringContext _localctx = new ExpressionConstantStringContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_expressionConstantString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379); ((ExpressionConstantStringContext)_localctx).value = match(STRING);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Token IDENT;
		public List<Token> selectors = new ArrayList<Token>();
		public TerminalNode IDENT(int i) {
			return getToken(MiniJava_v1Parser.IDENT, i);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(MiniJava_v1Parser.IDENT); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(381); id();
			setState(386);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(382); match(22);
					setState(383); ((IdentifierContext)_localctx).IDENT = match(IDENT);
					((IdentifierContext)_localctx).selectors.add(((IdentifierContext)_localctx).IDENT);
					}
					} 
				}
				setState(388);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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

	public static class IdContext extends ParserRuleContext {
		public IdIDENTContext idIDENT() {
			return getRuleContext(IdIDENTContext.class,0);
		}
		public IdThisContext idThis() {
			return getRuleContext(IdThisContext.class,0);
		}
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_id);
		try {
			setState(391);
			switch (_input.LA(1)) {
			case 19:
				enterOuterAlt(_localctx, 1);
				{
				setState(389); idThis();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(390); idIDENT();
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

	public static class IdThisContext extends ParserRuleContext {
		public IdThisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idThis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterIdThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitIdThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitIdThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdThisContext idThis() throws RecognitionException {
		IdThisContext _localctx = new IdThisContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_idThis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); match(19);
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

	public static class IdIDENTContext extends ParserRuleContext {
		public Token name;
		public TerminalNode IDENT() { return getToken(MiniJava_v1Parser.IDENT, 0); }
		public IdIDENTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idIDENT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).enterIdIDENT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniJava_v1Listener ) ((MiniJava_v1Listener)listener).exitIdIDENT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniJava_v1Visitor ) return ((MiniJava_v1Visitor<? extends T>)visitor).visitIdIDENT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdIDENTContext idIDENT() throws RecognitionException {
		IdIDENTContext _localctx = new IdIDENTContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_idIDENT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395); ((IdIDENTContext)_localctx).name = match(IDENT);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3+\u0190\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\7\2_\n\2\f\2\16\2b\13\2\3\3\3\3\3\3\3\3\5\3h"+
		"\n\3\3\3\3\3\7\3l\n\3\f\3\16\3o\13\3\3\3\7\3r\n\3\f\3\16\3u\13\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\7\5\u008b\n\5\f\5\16\5\u008e\13\5\3\5\7\5\u0091\n\5\f\5\16\5\u0094"+
		"\13\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\5\b\u00a1\n\b\3\t\3"+
		"\t\3\n\3\n\3\13\3\13\3\f\5\f\u00aa\n\f\3\f\5\f\u00ad\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\7\f\u00b5\n\f\f\f\16\f\u00b8\13\f\5\f\u00ba\n\f\3\f\3\f\3\f"+
		"\7\f\u00bf\n\f\f\f\16\f\u00c2\13\f\3\f\7\f\u00c5\n\f\f\f\16\f\u00c8\13"+
		"\f\3\f\3\f\3\f\3\r\3\r\5\r\u00cf\n\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u00dc\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00e7\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\5\30\u010f\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u0116\n\31\f\31\16"+
		"\31\u0119\13\31\3\32\3\32\3\32\7\32\u011e\n\32\f\32\16\32\u0121\13\32"+
		"\3\33\3\33\3\33\7\33\u0126\n\33\f\33\16\33\u0129\13\33\3\34\3\34\3\34"+
		"\7\34\u012e\n\34\f\34\16\34\u0131\13\34\3\35\3\35\3\35\7\35\u0136\n\35"+
		"\f\35\16\35\u0139\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u0147\n\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\5%\u0164\n%\3%\3%"+
		"\3%\3%\3%\7%\u016b\n%\f%\16%\u016e\13%\5%\u0170\n%\3%\3%\3&\3&\3&\3&\3"+
		"\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3+\7+\u0183\n+\f+\16+\u0186\13+\3,\3,\5"+
		",\u018a\n,\3-\3-\3.\3.\3.\2/\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\2\3\3\2%&\u0190\2\\\3\2\2\2\4c\3"+
		"\2\2\2\6x\3\2\2\2\b\u0088\3\2\2\2\n\u0097\3\2\2\2\f\u009a\3\2\2\2\16\u00a0"+
		"\3\2\2\2\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00a6\3\2\2\2\26\u00a9\3"+
		"\2\2\2\30\u00ce\3\2\2\2\32\u00d0\3\2\2\2\34\u00db\3\2\2\2\36\u00dd\3\2"+
		"\2\2 \u00df\3\2\2\2\"\u00e8\3\2\2\2$\u00ee\3\2\2\2&\u00f3\3\2\2\2(\u00fb"+
		"\3\2\2\2*\u0101\3\2\2\2,\u0107\3\2\2\2.\u0109\3\2\2\2\60\u0112\3\2\2\2"+
		"\62\u011a\3\2\2\2\64\u0122\3\2\2\2\66\u012a\3\2\2\28\u0132\3\2\2\2:\u0146"+
		"\3\2\2\2<\u0148\3\2\2\2>\u014b\3\2\2\2@\u014e\3\2\2\2B\u0154\3\2\2\2D"+
		"\u0159\3\2\2\2F\u015b\3\2\2\2H\u0163\3\2\2\2J\u0173\3\2\2\2L\u0177\3\2"+
		"\2\2N\u0179\3\2\2\2P\u017b\3\2\2\2R\u017d\3\2\2\2T\u017f\3\2\2\2V\u0189"+
		"\3\2\2\2X\u018b\3\2\2\2Z\u018d\3\2\2\2\\`\5\6\4\2]_\5\4\3\2^]\3\2\2\2"+
		"_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a\3\3\2\2\2b`\3\2\2\2cd\7\7\2\2dg\7\'\2"+
		"\2ef\7\17\2\2fh\7\'\2\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2im\7\13\2\2jl\5\n"+
		"\6\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2ns\3\2\2\2om\3\2\2\2pr\5\26"+
		"\f\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2us\3\2\2\2vw\7\16"+
		"\2\2w\5\3\2\2\2xy\7\7\2\2yz\7\'\2\2z{\7\13\2\2{|\7 \2\2|}\7\"\2\2}~\7"+
		"\n\2\2~\177\7\3\2\2\177\u0080\7\22\2\2\u0080\u0081\7\36\2\2\u0081\u0082"+
		"\7\33\2\2\u0082\u0083\7\37\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7$\2\2"+
		"\u0085\u0086\5\b\5\2\u0086\u0087\7\16\2\2\u0087\7\3\2\2\2\u0088\u008c"+
		"\7\13\2\2\u0089\u008b\5\n\6\2\u008a\u0089\3\2\2\2\u008b\u008e\3\2\2\2"+
		"\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0092\3\2\2\2\u008e\u008c"+
		"\3\2\2\2\u008f\u0091\5\34\17\2\u0090\u008f\3\2\2\2\u0091\u0094\3\2\2\2"+
		"\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0095\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0095\u0096\7\16\2\2\u0096\t\3\2\2\2\u0097\u0098\5\f\7\2\u0098"+
		"\u0099\7\t\2\2\u0099\13\3\2\2\2\u009a\u009b\5\16\b\2\u009b\u009c\7\'\2"+
		"\2\u009c\r\3\2\2\2\u009d\u00a1\5\20\t\2\u009e\u00a1\5\22\n\2\u009f\u00a1"+
		"\5\24\13\2\u00a0\u009d\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u009f\3\2\2\2"+
		"\u00a1\17\3\2\2\2\u00a2\u00a3\7\31\2\2\u00a3\21\3\2\2\2\u00a4\u00a5\7"+
		"\21\2\2\u00a5\23\3\2\2\2\u00a6\u00a7\7\'\2\2\u00a7\25\3\2\2\2\u00a8\u00aa"+
		"\7 \2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab"+
		"\u00ad\7\"\2\2\u00ac\u00ab\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2"+
		"\2\2\u00ae\u00af\5\30\r\2\u00af\u00b0\7\'\2\2\u00b0\u00b9\7\22\2\2\u00b1"+
		"\u00b6\5\f\7\2\u00b2\u00b3\7\26\2\2\u00b3\u00b5\5\f\7\2\u00b4\u00b2\3"+
		"\2\2\2\u00b5\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00ba\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7$\2\2\u00bc\u00c0\7\13\2\2\u00bd"+
		"\u00bf\5\n\6\2\u00be\u00bd\3\2\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c6\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c3"+
		"\u00c5\5\34\17\2\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\5.\30\2\u00ca\u00cb\7\16\2\2\u00cb\27\3\2\2\2\u00cc\u00cf\5\32"+
		"\16\2\u00cd\u00cf\5\16\b\2\u00ce\u00cc\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf"+
		"\31\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\33\3\2\2\2\u00d2\u00dc\5\36\20\2"+
		"\u00d3\u00dc\5 \21\2\u00d4\u00dc\5\"\22\2\u00d5\u00dc\5$\23\2\u00d6\u00dc"+
		"\5&\24\2\u00d7\u00dc\5(\25\2\u00d8\u00dc\5*\26\2\u00d9\u00dc\5,\27\2\u00da"+
		"\u00dc\5.\30\2\u00db\u00d2\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00d6\3\2\2\2\u00db\u00d7\3\2\2\2\u00db"+
		"\u00d8\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00da\3\2\2\2\u00dc\35\3\2\2"+
		"\2\u00dd\u00de\5\b\5\2\u00de\37\3\2\2\2\u00df\u00e0\7\20\2\2\u00e0\u00e1"+
		"\7\22\2\2\u00e1\u00e2\5\60\31\2\u00e2\u00e3\7$\2\2\u00e3\u00e6\5\b\5\2"+
		"\u00e4\u00e5\7#\2\2\u00e5\u00e7\5\b\5\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7"+
		"\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00e9\7\b\2\2\u00e9\u00ea\7\22\2\2\u00ea"+
		"\u00eb\5\60\31\2\u00eb\u00ec\7$\2\2\u00ec\u00ed\5\34\17\2\u00ed#\3\2\2"+
		"\2\u00ee\u00ef\5T+\2\u00ef\u00f0\7\r\2\2\u00f0\u00f1\5\60\31\2\u00f1\u00f2"+
		"\7\t\2\2\u00f2%\3\2\2\2\u00f3\u00f4\5T+\2\u00f4\u00f5\7\33\2\2\u00f5\u00f6"+
		"\5\60\31\2\u00f6\u00f7\7\37\2\2\u00f7\u00f8\7\r\2\2\u00f8\u00f9\5\60\31"+
		"\2\u00f9\u00fa\7\t\2\2\u00fa\'\3\2\2\2\u00fb\u00fc\7\32\2\2\u00fc\u00fd"+
		"\7\22\2\2\u00fd\u00fe\5\60\31\2\u00fe\u00ff\7$\2\2\u00ff\u0100\7\t\2\2"+
		"\u0100)\3\2\2\2\u0101\u0102\7\23\2\2\u0102\u0103\7\22\2\2\u0103\u0104"+
		"\5\60\31\2\u0104\u0105\7$\2\2\u0105\u0106\7\t\2\2\u0106+\3\2\2\2\u0107"+
		"\u0108\5H%\2\u0108-\3\2\2\2\u0109\u010e\7\6\2\2\u010a\u010b\7\22\2\2\u010b"+
		"\u010c\5\60\31\2\u010c\u010d\7$\2\2\u010d\u010f\3\2\2\2\u010e\u010a\3"+
		"\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\7\t\2\2\u0111"+
		"/\3\2\2\2\u0112\u0117\5\62\32\2\u0113\u0114\7\f\2\2\u0114\u0116\5\62\32"+
		"\2\u0115\u0113\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118\61\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011f\5\64\33\2\u011b"+
		"\u011c\7\35\2\2\u011c\u011e\5\64\33\2\u011d\u011b\3\2\2\2\u011e\u0121"+
		"\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\63\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0127\5\66\34\2\u0123\u0124\7\34\2\2\u0124\u0126"+
		"\5\66\34\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2"+
		"\u0127\u0128\3\2\2\2\u0128\65\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012f"+
		"\58\35\2\u012b\u012c\t\2\2\2\u012c\u012e\58\35\2\u012d\u012b\3\2\2\2\u012e"+
		"\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\67\3\2\2"+
		"\2\u0131\u012f\3\2\2\2\u0132\u0137\5:\36\2\u0133\u0134\7\24\2\2\u0134"+
		"\u0136\5:\36\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2"+
		"\2\2\u0137\u0138\3\2\2\2\u01389\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u0147"+
		"\5<\37\2\u013b\u0147\5> \2\u013c\u0147\5@!\2\u013d\u0147\5B\"\2\u013e"+
		"\u0147\5D#\2\u013f\u0147\5F$\2\u0140\u0147\5H%\2\u0141\u0147\5J&\2\u0142"+
		"\u0147\5L\'\2\u0143\u0147\5N(\2\u0144\u0147\5P)\2\u0145\u0147\5R*\2\u0146"+
		"\u013a\3\2\2\2\u0146\u013b\3\2\2\2\u0146\u013c\3\2\2\2\u0146\u013d\3\2"+
		"\2\2\u0146\u013e\3\2\2\2\u0146\u013f\3\2\2\2\u0146\u0140\3\2\2\2\u0146"+
		"\u0141\3\2\2\2\u0146\u0142\3\2\2\2\u0146\u0143\3\2\2\2\u0146\u0144\3\2"+
		"\2\2\u0146\u0145\3\2\2\2\u0147;\3\2\2\2\u0148\u0149\7&\2\2\u0149\u014a"+
		"\5:\36\2\u014a=\3\2\2\2\u014b\u014c\7!\2\2\u014c\u014d\5:\36\2\u014d?"+
		"\3\2\2\2\u014e\u014f\7\5\2\2\u014f\u0150\7\21\2\2\u0150\u0151\7\33\2\2"+
		"\u0151\u0152\5\60\31\2\u0152\u0153\7\37\2\2\u0153A\3\2\2\2\u0154\u0155"+
		"\7\5\2\2\u0155\u0156\7\'\2\2\u0156\u0157\7\22\2\2\u0157\u0158\7$\2\2\u0158"+
		"C\3\2\2\2\u0159\u015a\5T+\2\u015aE\3\2\2\2\u015b\u015c\5T+\2\u015c\u015d"+
		"\7\33\2\2\u015d\u015e\5\60\31\2\u015e\u015f\7\37\2\2\u015fG\3\2\2\2\u0160"+
		"\u0161\5T+\2\u0161\u0162\7\30\2\2\u0162\u0164\3\2\2\2\u0163\u0160\3\2"+
		"\2\2\u0163\u0164\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0166\7\'\2\2\u0166"+
		"\u016f\7\22\2\2\u0167\u016c\5\60\31\2\u0168\u0169\7\26\2\2\u0169\u016b"+
		"\5\60\31\2\u016a\u0168\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0167"+
		"\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\7$\2\2\u0172"+
		"I\3\2\2\2\u0173\u0174\7\22\2\2\u0174\u0175\5\60\31\2\u0175\u0176\7$\2"+
		"\2\u0176K\3\2\2\2\u0177\u0178\7\4\2\2\u0178M\3\2\2\2\u0179\u017a\7\27"+
		"\2\2\u017aO\3\2\2\2\u017b\u017c\7(\2\2\u017cQ\3\2\2\2\u017d\u017e\7)\2"+
		"\2\u017eS\3\2\2\2\u017f\u0184\5V,\2\u0180\u0181\7\30\2\2\u0181\u0183\7"+
		"\'\2\2\u0182\u0180\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185U\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u018a\5X-\2\u0188"+
		"\u018a\5Z.\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018aW\3\2\2\2\u018b"+
		"\u018c\7\25\2\2\u018cY\3\2\2\2\u018d\u018e\7\'\2\2\u018e[\3\2\2\2\36`"+
		"gms\u008c\u0092\u00a0\u00a9\u00ac\u00b6\u00b9\u00c0\u00c6\u00ce\u00db"+
		"\u00e6\u010e\u0117\u011f\u0127\u012f\u0137\u0146\u0163\u016c\u016f\u0184"+
		"\u0189";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}