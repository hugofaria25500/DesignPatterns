package Behavioral._3_Interpreter;

public class Main {
//Client Code

    public static void main(String[] args) {
        // Create expressions
        Expression expression = new AdditionExpression(
                new MultiplicationExpression(new Constant(5), new Variable("x")),
                new SubtractionExpression(new Variable("y"), new Constant(2))
        );

        // Create context and set variable values
        Context context = new Context();
        context.setVariableValue("x", 3);
        context.setVariableValue("y", 1);

        // Interpret the expression
        int result = expression.interpret(context);

        // Output the result
        System.out.println("Result: " + result);
    }
}
