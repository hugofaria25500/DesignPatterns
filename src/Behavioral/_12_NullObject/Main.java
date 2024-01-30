package Behavioral._12_NullObject;

public class Main {
//Code Client

    public static void main(String[] args) {
        // Enable or disable logging based on configuration
        boolean loggingEnabled = true;

        // Create appropriate logger based on log level
        Logger logger = loggingEnabled ? new ErrorLogger() : new NullLogger();

        // Log messages using the selected logger
        logger.log("This is an error message.");
        // Output: Error: This is an error message.

        // If logging is disabled, NullLogger is used, and no actual logging is performed
        Logger nullLogger = new NullLogger();
        nullLogger.log("This message won't be logged.");

        // No output, as NullLogger does nothing
    }
}
