package shapes;

public class Rectangle {
//  Attributes
    protected int length;
    protected int width;

//  Constructor
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

//  Methods
    public int getArea(int length, int width){
        return length * width;
    }
    public int getPerimeter(int length, int width){
        return (2 * length) + (2 * width);
    }
}
