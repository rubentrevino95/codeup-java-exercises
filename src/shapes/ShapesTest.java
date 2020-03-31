package shapes;

import org.w3c.dom.ls.LSOutput;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;
        myShape = new Rectangle(4,5);
        System.out.printf("Perimeter: %f\tArea: %f\n", myShape.getPerimeter(), myShape.getArea());
        myShape = new Square(5);
        System.out.printf("Perimeter: %f\tArea: %f\n", myShape.getPerimeter(), myShape.getArea());
    }
}
