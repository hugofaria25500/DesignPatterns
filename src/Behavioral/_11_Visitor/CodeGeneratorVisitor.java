package Behavioral._11_Visitor;

public class CodeGeneratorVisitor implements Visitor{
// Concrete Visitors

    @Override
    public void visitExpression(AstExpression expression) {
        // Code generation logic for expressions
        System.out.println("Generating code for expression");
    }

    @Override
    public void visitStatement(AstStatement statement) {
        // Code generation logic for statements
        System.out.println("Generating code for statement");
    }
}
