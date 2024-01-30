package Behavioral._11_Visitor;

public interface Visitor {
// Visitor Interface

    void visitExpression(AstExpression expression);
    void visitStatement(AstStatement statement);
    // Add more visit methods for other AST node types as needed...
}
