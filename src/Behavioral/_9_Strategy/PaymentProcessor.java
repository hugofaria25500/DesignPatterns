package Behavioral._9_Strategy;

public class PaymentProcessor {
// Context (PaymentProcessor)
private PaymentStrategy paymentStrategy;

    // Setter to dynamically set the payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Method to trigger payment processing
    public void performPayment(double amount) {
        if (paymentStrategy != null) {
            paymentStrategy.processPayment(amount);
        } else {
            System.out.println("No payment strategy set.");
        }
    }
}
