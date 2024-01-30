package Behavioral._3_Interpreter;

public class DivisionExpression implements Expression{
// Non-terminal expression - DivisionExpression

    private Expression left;
    private Expression right;

    public DivisionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        int divisor = right.interpret(context);
        if (divisor != 0) {
            return left.interpret(context) / divisor;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}
