package Creational_Design_Patterns.Prototype_Pattern;

// Concrete Prototype


public class Car implements Prototype {
    private String model;
    private String engine;

    public Car(String model, String engine) {
        this.model = model;
        this.engine = engine;
    }

    // Copy constructor for cloning
    public Car(Car car) {
        this.model = car.model;
        this.engine = car.engine;
    }

    @Override
    public Car clone() {
        return new Car(this);  // Cloning the car object
    }

    public void showDetails() {
        System.out.println("Car Model: " + model + ", Engine: " + engine);
    }
}
