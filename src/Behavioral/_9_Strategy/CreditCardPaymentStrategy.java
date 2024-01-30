package Behavioral._9_Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy{
// Concrete Strategy - Credit Card Payment
    @Override
    public void processPayment(double amount) {
        // Credit card payment processing logic
        System.out.println("Processing credit card payment: $" + amount);
    }
}
