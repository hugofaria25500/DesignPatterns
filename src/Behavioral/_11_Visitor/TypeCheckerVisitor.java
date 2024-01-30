package Behavioral._11_Visitor;

public class TypeCheckerVisitor implements Visitor{
// Concrete Visitors

    @Override
    public void visitExpression(AstExpression expression) {
        // Type checking logic for expressions
        System.out.println("Type checking for expression");
    }

    @Override
    public void visitStatement(AstStatement statement) {
        // Type checking logic for statements
        System.out.println("Type checking for statement");
    }
}
