package Flyweight_Pattern;

// Flyweight Factory

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getShape(String shapeType) {
        Shape shape = shapeMap.get(shapeType);
        if (shape == null) {
            if (shapeType.equalsIgnoreCase("Circle")) {
                shape = new Circle();
                shapeMap.put("Circle", shape);
            }
            // You can add more shape types as needed.
        }
        return shape;
    }
}
