// NotificationService Class (Handles sending notifications) - SRP, DIP


public class NotificationService {
    private MessageService messageService;

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String user, String message) {
        messageService.sendMessage(user, message);
    }
}

// Explanation: The NotificationService is only responsible for notifying users (SRP) and depends on MessageService, an abstraction (DIP).