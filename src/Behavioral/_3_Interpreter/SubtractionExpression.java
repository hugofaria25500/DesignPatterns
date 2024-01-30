package Behavioral._3_Interpreter;

public class SubtractionExpression implements Expression{
// Non-terminal expression - SubtractionExpression

    private Expression left;
    private Expression right;

    public SubtractionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        return left.interpret(context) - right.interpret(context);
    }
}
