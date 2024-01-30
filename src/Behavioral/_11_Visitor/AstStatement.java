package Behavioral._11_Visitor;

public class AstStatement implements AstNode{
// Concrete Elements

    // AstStatement specific code...

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStatement(this);
    }
}
