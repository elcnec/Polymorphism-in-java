  

 
public class Shape {
    
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double getArea(){
        return -1;
    }

    @Override
    public String toString() {
        return "Shape{" + "color=" + color + '}';
    }
    
}
