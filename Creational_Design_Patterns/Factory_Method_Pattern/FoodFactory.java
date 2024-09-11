// package Creational_Design_Patterns.Factory_Method_Pattern;

public class FoodFactory {
    public static Food getFood(String type) {
        switch (type.toLowerCase()) {
            case "pizza":               // careful with the lowercases
                return new Pizza();
            case "rotisabji":
                return new RotiSabji();
            default:
                throw new IllegalArgumentException("Unknown food type: " + type);
        }
    }
}
