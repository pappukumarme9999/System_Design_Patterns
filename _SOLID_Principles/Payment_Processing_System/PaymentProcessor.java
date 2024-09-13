// PaymentProcessor Class (Handles payment processing using different payment methods) - SRP, DIP


public class PaymentProcessor {
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void process(double amount) {
        paymentMethod.processPayment(amount);
    }
}


// Explanation: The PaymentProcessor class has a single responsibility (processing payments) (SRP) and depends on an abstraction (PaymentMethod), following DIP. 
// This allows flexibility in adding new payment methods.

