package Creational_Design_Patterns.Builder_Pattern;

public class Meal {
    private final String burger; // final for immutability
    private final String drink;
    private final String fries;

    private Meal(MealBuilder builder) {
        this.burger = builder.burger;
        this.drink = builder.drink;
        this.fries = builder.fries;
    }

    @Override
    public String toString() {
        return "Meal [burger=" + burger + ", drink=" + drink + ", fries=" + fries + "]";
    }

    public static class MealBuilder {
        private String burger;
        private String drink;
        private String fries;

        public MealBuilder setBurger(String burger) {
            this.burger = burger;
            return this;
        }

        public MealBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public MealBuilder setFries(String fries) {
            this.fries = fries;
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }
    }
}

// Use immutable objects for robustness.
// Handle optional parameters in the builder.
// Immutability: Final fields make the Meal object immutable.
// Flexible Construction: Optional parts (like fries) can be excluded.
