// Message Service Implementations (Follows OCP, LSP)


public class EmailService implements MessageService {
    @Override
    public void sendMessage(String user, String message) {
        System.out.println("Sending Email to " + user + ": " + message);
    }
}

// SMSService.java
public class SMSService implements MessageService {
    @Override
    public void sendMessage(String user, String message) {
        System.out.println("Sending SMS to " + user + ": " + message);
    }
}

// Explanation: By extending MessageService, we can send notifications using Email or SMS. 
// This follows OCP and LSP because we can easily add more message services without changing existing code.