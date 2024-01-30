package Behavioral._9_Strategy;

public class Main {
//Code Client

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Set the credit card payment strategy
        paymentProcessor.setPaymentStrategy(new CreditCardPaymentStrategy());
        paymentProcessor.performPayment(100.0);
        // Output: Processing credit card payment: $100.0

        // Set the PayPal payment strategy
        paymentProcessor.setPaymentStrategy(new PayPalPaymentStrategy());
        paymentProcessor.performPayment(50.0);
        // Output: Processing PayPal payment: $50.0

        // Set the Google Pay payment strategy
        paymentProcessor.setPaymentStrategy(new GooglePayPaymentStrategy());
        paymentProcessor.performPayment(75.0);
        // Output: Processing Google Pay payment: $75.0
    }
}
