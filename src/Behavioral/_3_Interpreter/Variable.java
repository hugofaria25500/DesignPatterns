package Behavioral._3_Interpreter;

public class Variable implements Expression{
// Terminal expression - Variable

    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Context context) {
        return context.getValue(name);
    }
}
