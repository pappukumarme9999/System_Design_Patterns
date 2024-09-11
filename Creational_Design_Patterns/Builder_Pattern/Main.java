package Creational_Design_Patterns.Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal.MealBuilder()
            .setBurger("Cheeseburger")
            .setDrink("Coke")
            .setFries("Large Fries")
            .build();

        System.out.println(meal);  // Output: Meal [burger=Cheeseburger, drink=Coke, fries=Large Fries]
    }
}
