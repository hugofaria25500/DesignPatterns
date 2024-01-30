package Behavioral._11_Visitor;

public interface AstNode {
// Element Interface

    void accept(Visitor visitor);
}
