// Main Class (Tying everything together)
public class Main {
    public static void main(String[] args) {
        // Using CreditCard for payment
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentProcessor paymentProcessor = new PaymentProcessor(creditCardPayment);
        paymentProcessor.process(100.00);  // SRP, DIP, OCP

        // Send notification via Email
        MessageService emailService = new EmailService();
        NotificationService notificationService = new NotificationService(emailService);
        notificationService.notifyUser("user@example.com", "Your payment of $100.00 was successful.");  // SRP, DIP

        // Using PayPal for payment
        PaymentMethod payPalPayment = new PayPalPayment();
        paymentProcessor = new PaymentProcessor(payPalPayment);
        paymentProcessor.process(250.00);

        // Send notification via SMS
        MessageService smsService = new SMSService();
        notificationService = new NotificationService(smsService);
        notificationService.notifyUser("123-456-7890", "Your payment of $250.00 was successful.");
    }
}
