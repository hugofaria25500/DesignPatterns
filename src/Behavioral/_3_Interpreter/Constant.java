package Behavioral._3_Interpreter;

public class Constant implements Expression{
// Terminal expression - Constant

    private int value;

    public Constant(int value) {
        this.value = value;
    }

    @Override
    public int interpret(Context context) {
        return value;
    }
}
