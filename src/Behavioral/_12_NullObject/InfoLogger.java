package Behavioral._12_NullObject;

public class InfoLogger implements Logger{
// Concrete Logger - Info Logger

    @Override
    public void log(String message) {
        System.out.println("Info: " + message);
        // Additional info logging logic...
    }
}
