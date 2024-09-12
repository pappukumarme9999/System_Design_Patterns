package Flyweight_Pattern;

// Client Code

public class Client {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getShape("Circle");
        circle1.draw("Red");

        Shape circle2 = ShapeFactory.getShape("Circle");
        circle2.draw("Green");

        Shape circle3 = ShapeFactory.getShape("Circle");
        circle3.draw("Blue");
    }
}