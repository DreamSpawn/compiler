// Generated from C:\Users\Dickow\Google Drive\3.Semester\CompilerTeknik\Grammatik\MiniJava_v1.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJava_v1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJava_v1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MiniJava_v1Parser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementAssign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementAssign(@NotNull MiniJava_v1Parser.StatementAssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(@NotNull MiniJava_v1Parser.MainClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementReturn(@NotNull MiniJava_v1Parser.StatementReturnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantFalse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantFalse(@NotNull MiniJava_v1Parser.ExpressionConstantFalseContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantString(@NotNull MiniJava_v1Parser.ExpressionConstantStringContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(@NotNull MiniJava_v1Parser.StatementBlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MiniJava_v1Parser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MiniJava_v1Parser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantInteger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantInteger(@NotNull MiniJava_v1Parser.ExpressionConstantIntegerContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#idThis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdThis(@NotNull MiniJava_v1Parser.IdThisContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MiniJava_v1Parser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MiniJava_v1Parser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionNewObject}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewObject(@NotNull MiniJava_v1Parser.ExpressionNewObjectContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MiniJava_v1Parser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(@NotNull MiniJava_v1Parser.IdContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementMethodCall(@NotNull MiniJava_v1Parser.StatementMethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#typeVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeVoid(@NotNull MiniJava_v1Parser.TypeVoidContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrint(@NotNull MiniJava_v1Parser.StatementPrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#level5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel5(@NotNull MiniJava_v1Parser.Level5Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#level4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel4(@NotNull MiniJava_v1Parser.Level4Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull MiniJava_v1Parser.IdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#idIDENT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdIDENT(@NotNull MiniJava_v1Parser.IdIDENTContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull MiniJava_v1Parser.ExpressionContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(@NotNull MiniJava_v1Parser.VarDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionIdentifier(@NotNull MiniJava_v1Parser.ExpressionIdentifierContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementPrintln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementPrintln(@NotNull MiniJava_v1Parser.StatementPrintlnContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionNegation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNegation(@NotNull MiniJava_v1Parser.ExpressionNegationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#typeInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeInt(@NotNull MiniJava_v1Parser.TypeIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionParentheses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentheses(@NotNull MiniJava_v1Parser.ExpressionParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionNewIntArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNewIntArray(@NotNull MiniJava_v1Parser.ExpressionNewIntArrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(@NotNull MiniJava_v1Parser.VariableContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#typeClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeClass(@NotNull MiniJava_v1Parser.TypeClassContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionArrayAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionArrayAccess(@NotNull MiniJava_v1Parser.ExpressionArrayAccessContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionUnaryMinus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionUnaryMinus(@NotNull MiniJava_v1Parser.ExpressionUnaryMinusContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#typeBoolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBoolean(@NotNull MiniJava_v1Parser.TypeBooleanContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#level1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel1(@NotNull MiniJava_v1Parser.Level1Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementWhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementWhile(@NotNull MiniJava_v1Parser.StatementWhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementIf(@NotNull MiniJava_v1Parser.StatementIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#statementArrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementArrayAssignment(@NotNull MiniJava_v1Parser.StatementArrayAssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#level3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel3(@NotNull MiniJava_v1Parser.Level3Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionMethodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethodCall(@NotNull MiniJava_v1Parser.ExpressionMethodCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#procType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcType(@NotNull MiniJava_v1Parser.ProcTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#level2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel2(@NotNull MiniJava_v1Parser.Level2Context ctx);

	/**
	 * Visit a parse tree produced by {@link MiniJava_v1Parser#expressionConstantTrue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionConstantTrue(@NotNull MiniJava_v1Parser.ExpressionConstantTrueContext ctx);
}