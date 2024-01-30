package Behavioral._9_Strategy;

public class PayPalPaymentStrategy implements PaymentStrategy{
// Concrete Strategy - PayPal Payment
    @Override
    public void processPayment(double amount) {
        // PayPal payment processing logic
        System.out.println("Processing PayPal payment: $" + amount);
    }
}
