package Behavioral._11_Visitor;

public class AstExpression implements AstNode{
// Concrete Elements

    // AstExpression specific code...

    @Override
    public void accept(Visitor visitor) {
        visitor.visitExpression(this);
    }
}
