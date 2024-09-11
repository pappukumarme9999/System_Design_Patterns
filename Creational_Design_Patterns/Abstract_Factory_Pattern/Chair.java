package Creational_Design_Patterns.Abstract_Factory_Pattern;

public interface Chair {
    void create();
}

// Use interfaces to decouple factory creation and make the system easily extendable.
// Extensibility: Factories are modular, allowing for easy future expansion.
// Null Safety: Factories can be enhanced with null checks and default values.
