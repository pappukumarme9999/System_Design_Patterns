package Mediator_Pattern;

// Mediator Interface

public interface Mediator {
    void sendMessage(String message, Colleague colleague);
}
