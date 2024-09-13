// PaymentMethod Interface (Handles payment processing) - LSP, OCP, DIP


public interface PaymentMethod {
    void processPayment(double amount);
}


// Explanation: This is an abstraction for payment methods. 
// It follows DIP and LSP since we will depend on this interface rather than on specific implementations, and each payment method can be replaced by any other.
