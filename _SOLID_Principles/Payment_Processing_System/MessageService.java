// MessageService Interface (Handles user notifications) - LSP, OCP, DIP


public interface MessageService {
    void sendMessage(String user, String message);
}

// Explanation: This interface abstracts the message-sending behavior. We will extend it for Email and SMS services. 
// It follows DIP and LSP since new message services can replace others without breaking the system.
