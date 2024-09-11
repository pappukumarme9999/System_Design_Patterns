package Creational_Design_Patterns.Prototype_Pattern;

public class Car implements Cloneable {
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public Car clone() {
        try {
            return (Car) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", engine=" + engine + "]";
    }
}

// Handle deep cloning for nested objects.
// Implement defensive cloning to protect against mutations.
// Deep Cloning: Support for deep cloning can be added to handle nested objects.
// Exception Handling: Protect against cloning exceptions using AssertionError.
