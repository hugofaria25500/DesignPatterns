package Behavioral._12_NullObject;

public class WarningLogger implements Logger{
// Concrete Logger - Warning Logger

    @Override
    public void log(String message) {
        System.out.println("Warning: " + message);
        // Additional warning logging logic...
    }
}
