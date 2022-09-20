 
 

 
public class Triangle extends Shape{
    
    private double base , height;

    public Triangle(double base, double height, String color) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea(){
        return (base * height)/2;
        
    }

    @Override
    public String toString() {
        return "Triangle{" +"Color = "+getColor()+ "base=" + base + ", height=" + height + '}';
    }
    
}
