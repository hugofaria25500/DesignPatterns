package Behavioral._9_Strategy;

public class GooglePayPaymentStrategy implements PaymentStrategy{
// Concrete Strategy - Google Pay Payment
    @Override
    public void processPayment(double amount) {
        // Google Pay payment processing logic
        System.out.println("Processing Google Pay payment: $" + amount);
    }
}
