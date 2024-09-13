// Payment Method Implementations (Follows OCP, LSP)


public class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// PayPalPayment.java
public class PayPalPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
    }
}

// GooglePayPayment.java
public class GooglePayPayment implements PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing GooglePay payment of $" + amount);
    }
}

// Explanation: We are following OCP by extending the PaymentMethod interface with new payment methods like CreditCardPayment, PayPalPayment, and GooglePayPayment. 
// These classes can be replaced with each other (LSP), adhering to DIP.