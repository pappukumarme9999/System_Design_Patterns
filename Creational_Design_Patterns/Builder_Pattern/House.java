package Creational_Design_Patterns.Builder_Pattern.House_Construction;

// House Product

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "House built with: " + String.join(", ", parts);
    }
}
