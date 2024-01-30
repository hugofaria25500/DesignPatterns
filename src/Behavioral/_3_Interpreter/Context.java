package Behavioral._3_Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
// Context class

    private final Map<String, Integer> variableValues = new HashMap<>();

    public void setVariableValue(String variable, int value) {
        variableValues.put(variable, value);
    }

    public int getValue(String variable) {
        return variableValues.getOrDefault(variable, 0);
    }
}
