// package Creational_Design_Patterns.Factory_Method_Pattern;

public class Main {
    public static void main(String[] args) {
        try {
            Food food1 = FoodFactory.getFood("pizza");
            food1.prepare(); // Output: Preparing Pizza...

            Food food2 = FoodFactory.getFood("RotiSabji");
            food2.prepare(); // Output: Preparing RotiSabji...

            Food food3 = FoodFactory.getFood("burger");
            food3.prepare(); // Output: Preparing Burger...

        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
