package Behavioral._12_NullObject;

public class ErrorLogger implements Logger{
// Concrete Logger - Error Logger
    @Override
    public void log(String message) {
        System.out.println("Error: " + message);
        // Additional error logging logic...
    }
}
