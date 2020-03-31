package shapes;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {

    }

    @Override
    public void setWidth(double side) {
        length = side;
        width = side;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
