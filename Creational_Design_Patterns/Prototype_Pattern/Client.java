package Creational_Design_Patterns.Prototype_Pattern;

public class Client {
    public static void main(String[] args) {
        // Original Car Object
        Car originalCar = new Car("Tesla Model S", "Electric");
        originalCar.showDetails();

        // Clone the original Car object
        Car clonedCar = originalCar.clone();
        clonedCar.showDetails();
    }
}
