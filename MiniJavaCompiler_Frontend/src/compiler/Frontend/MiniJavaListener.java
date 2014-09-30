// Generated from C:\Users\Dickow\Google Drive\3.Semester\CompilerTeknik\Grammatik\MiniJava_v1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJava_v1Parser}.
 */
public interface MiniJava_v1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MiniJava_v1Parser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MiniJava_v1Parser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void enterStatementAssign(@NotNull MiniJava_v1Parser.StatementAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementAssign}.
	 * @param ctx the parse tree
	 */
	void exitStatementAssign(@NotNull MiniJava_v1Parser.StatementAssignContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(@NotNull MiniJava_v1Parser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(@NotNull MiniJava_v1Parser.MainClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void enterStatementReturn(@NotNull MiniJava_v1Parser.StatementReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementReturn}.
	 * @param ctx the parse tree
	 */
	void exitStatementReturn(@NotNull MiniJava_v1Parser.StatementReturnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantFalse(@NotNull MiniJava_v1Parser.ExpressionConstantFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantFalse(@NotNull MiniJava_v1Parser.ExpressionConstantFalseContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantString(@NotNull MiniJava_v1Parser.ExpressionConstantStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantString}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantString(@NotNull MiniJava_v1Parser.ExpressionConstantStringContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(@NotNull MiniJava_v1Parser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(@NotNull MiniJava_v1Parser.StatementBlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MiniJava_v1Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MiniJava_v1Parser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MiniJava_v1Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MiniJava_v1Parser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantInteger(@NotNull MiniJava_v1Parser.ExpressionConstantIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantInteger(@NotNull MiniJava_v1Parser.ExpressionConstantIntegerContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#idThis}.
	 * @param ctx the parse tree
	 */
	void enterIdThis(@NotNull MiniJava_v1Parser.IdThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#idThis}.
	 * @param ctx the parse tree
	 */
	void exitIdThis(@NotNull MiniJava_v1Parser.IdThisContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MiniJava_v1Parser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MiniJava_v1Parser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MiniJava_v1Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MiniJava_v1Parser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewObject(@NotNull MiniJava_v1Parser.ExpressionNewObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionNewObject}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewObject(@NotNull MiniJava_v1Parser.ExpressionNewObjectContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MiniJava_v1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MiniJava_v1Parser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull MiniJava_v1Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull MiniJava_v1Parser.IdContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterStatementMethodCall(@NotNull MiniJava_v1Parser.StatementMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitStatementMethodCall(@NotNull MiniJava_v1Parser.StatementMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeVoid(@NotNull MiniJava_v1Parser.TypeVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#typeVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeVoid(@NotNull MiniJava_v1Parser.TypeVoidContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementPrint}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrint(@NotNull MiniJava_v1Parser.StatementPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementPrint}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrint(@NotNull MiniJava_v1Parser.StatementPrintContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#level5}.
	 * @param ctx the parse tree
	 */
	void enterLevel5(@NotNull MiniJava_v1Parser.Level5Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#level5}.
	 * @param ctx the parse tree
	 */
	void exitLevel5(@NotNull MiniJava_v1Parser.Level5Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#level4}.
	 * @param ctx the parse tree
	 */
	void enterLevel4(@NotNull MiniJava_v1Parser.Level4Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#level4}.
	 * @param ctx the parse tree
	 */
	void exitLevel4(@NotNull MiniJava_v1Parser.Level4Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull MiniJava_v1Parser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull MiniJava_v1Parser.IdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void enterIdIDENT(@NotNull MiniJava_v1Parser.IdIDENTContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#idIDENT}.
	 * @param ctx the parse tree
	 */
	void exitIdIDENT(@NotNull MiniJava_v1Parser.IdIDENTContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull MiniJava_v1Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull MiniJava_v1Parser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(@NotNull MiniJava_v1Parser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(@NotNull MiniJava_v1Parser.VarDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterExpressionIdentifier(@NotNull MiniJava_v1Parser.ExpressionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitExpressionIdentifier(@NotNull MiniJava_v1Parser.ExpressionIdentifierContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void enterStatementPrintln(@NotNull MiniJava_v1Parser.StatementPrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementPrintln}.
	 * @param ctx the parse tree
	 */
	void exitStatementPrintln(@NotNull MiniJava_v1Parser.StatementPrintlnContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionNegation}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNegation(@NotNull MiniJava_v1Parser.ExpressionNegationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionNegation}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNegation(@NotNull MiniJava_v1Parser.ExpressionNegationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#typeInt}.
	 * @param ctx the parse tree
	 */
	void enterTypeInt(@NotNull MiniJava_v1Parser.TypeIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#typeInt}.
	 * @param ctx the parse tree
	 */
	void exitTypeInt(@NotNull MiniJava_v1Parser.TypeIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void enterExpressionParentheses(@NotNull MiniJava_v1Parser.ExpressionParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionParentheses}.
	 * @param ctx the parse tree
	 */
	void exitExpressionParentheses(@NotNull MiniJava_v1Parser.ExpressionParenthesesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionNewIntArray}.
	 * @param ctx the parse tree
	 */
	void enterExpressionNewIntArray(@NotNull MiniJava_v1Parser.ExpressionNewIntArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionNewIntArray}.
	 * @param ctx the parse tree
	 */
	void exitExpressionNewIntArray(@NotNull MiniJava_v1Parser.ExpressionNewIntArrayContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(@NotNull MiniJava_v1Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(@NotNull MiniJava_v1Parser.VariableContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#typeClass}.
	 * @param ctx the parse tree
	 */
	void enterTypeClass(@NotNull MiniJava_v1Parser.TypeClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#typeClass}.
	 * @param ctx the parse tree
	 */
	void exitTypeClass(@NotNull MiniJava_v1Parser.TypeClassContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 */
	void enterExpressionArrayAccess(@NotNull MiniJava_v1Parser.ExpressionArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 */
	void exitExpressionArrayAccess(@NotNull MiniJava_v1Parser.ExpressionArrayAccessContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void enterExpressionUnaryMinus(@NotNull MiniJava_v1Parser.ExpressionUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 */
	void exitExpressionUnaryMinus(@NotNull MiniJava_v1Parser.ExpressionUnaryMinusContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void enterTypeBoolean(@NotNull MiniJava_v1Parser.TypeBooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#typeBoolean}.
	 * @param ctx the parse tree
	 */
	void exitTypeBoolean(@NotNull MiniJava_v1Parser.TypeBooleanContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#level1}.
	 * @param ctx the parse tree
	 */
	void enterLevel1(@NotNull MiniJava_v1Parser.Level1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#level1}.
	 * @param ctx the parse tree
	 */
	void exitLevel1(@NotNull MiniJava_v1Parser.Level1Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void enterStatementWhile(@NotNull MiniJava_v1Parser.StatementWhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementWhile}.
	 * @param ctx the parse tree
	 */
	void exitStatementWhile(@NotNull MiniJava_v1Parser.StatementWhileContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementIf}.
	 * @param ctx the parse tree
	 */
	void enterStatementIf(@NotNull MiniJava_v1Parser.StatementIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementIf}.
	 * @param ctx the parse tree
	 */
	void exitStatementIf(@NotNull MiniJava_v1Parser.StatementIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#statementArrayAssignment}.
	 * @param ctx the parse tree
	 */
	void enterStatementArrayAssignment(@NotNull MiniJava_v1Parser.StatementArrayAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#statementArrayAssignment}.
	 * @param ctx the parse tree
	 */
	void exitStatementArrayAssignment(@NotNull MiniJava_v1Parser.StatementArrayAssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#level3}.
	 * @param ctx the parse tree
	 */
	void enterLevel3(@NotNull MiniJava_v1Parser.Level3Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#level3}.
	 * @param ctx the parse tree
	 */
	void exitLevel3(@NotNull MiniJava_v1Parser.Level3Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void enterExpressionMethodCall(@NotNull MiniJava_v1Parser.ExpressionMethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionMethodCall}.
	 * @param ctx the parse tree
	 */
	void exitExpressionMethodCall(@NotNull MiniJava_v1Parser.ExpressionMethodCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#procType}.
	 * @param ctx the parse tree
	 */
	void enterProcType(@NotNull MiniJava_v1Parser.ProcTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#procType}.
	 * @param ctx the parse tree
	 */
	void exitProcType(@NotNull MiniJava_v1Parser.ProcTypeContext ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#level2}.
	 * @param ctx the parse tree
	 */
	void enterLevel2(@NotNull MiniJava_v1Parser.Level2Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#level2}.
	 * @param ctx the parse tree
	 */
	void exitLevel2(@NotNull MiniJava_v1Parser.Level2Context ctx);

	/**
	 * Enter a parse tree produced by {@link MiniJava_v1Parser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void enterExpressionConstantTrue(@NotNull MiniJava_v1Parser.ExpressionConstantTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 */
	void exitExpressionConstantTrue(@NotNull MiniJava_v1Parser.ExpressionConstantTrueContext ctx);
}