package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        Rectangle rectangle = new Rectangle(4, 5);
        myShape = rectangle;
        System.out.println("Rectangle - Area: " + myShape.getArea());
        System.out.println("Rectangle - Perimeter: " + myShape.getPerimeter());

        Square square = new Square(5);
        myShape = square;
        System.out.println("Square - Area: " + myShape.getArea());
        System.out.println("Square - Perimeter: " + myShape.getPerimeter());
    }
}

