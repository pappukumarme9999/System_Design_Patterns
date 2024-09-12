package Flyweight_Pattern;

// Concrete Flyweight

public class Circle implements Shape {
    private final String shapeType;

    public Circle() {
        this.shapeType = "Circle";
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing " + shapeType + " with color " + color);
    }
}
