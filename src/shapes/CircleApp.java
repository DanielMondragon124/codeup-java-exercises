package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();
        double radius = input.getDouble("Enter the radius of the circle: ");
        Circle circle = new Circle(radius);

        System.out.println("Circumference: " + circle.getCircumference());
        System.out.println("Area: " + circle.getArea());
    }
}
