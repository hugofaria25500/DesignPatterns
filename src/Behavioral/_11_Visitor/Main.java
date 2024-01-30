package Behavioral._11_Visitor;

public class Main {
//Code Client

    public static void main(String[] args) {
        AstNode expressionNode = new AstExpression();
        AstNode statementNode = new AstStatement();

        Visitor codeGeneratorVisitor = new CodeGeneratorVisitor();
        Visitor typeCheckerVisitor = new TypeCheckerVisitor();

        expressionNode.accept(codeGeneratorVisitor);
        expressionNode.accept(typeCheckerVisitor);

        statementNode.accept(codeGeneratorVisitor);
        statementNode.accept(typeCheckerVisitor);
    }
}
