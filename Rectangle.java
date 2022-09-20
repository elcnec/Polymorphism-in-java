 
package week3ex1;

 
public class Rectangle extends Shape {
    
    private double length,width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "Color = "+getColor()+"length=" + length + ", width=" + width + '}';
    }
    
}
