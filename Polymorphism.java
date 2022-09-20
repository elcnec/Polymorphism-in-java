 
 

 
public class Polymorphism {

   
    public static void main(String[] args) {
        
        Shape [] array = new Shape[5];
        
        array [0] = new Rectangle(5, 6, "Red");
        array [1] = new Triangle(6, 8, "Blue");
        array [2] = new Shape("Green");
        array [3] = new Rectangle(9, 4, "Black");
        array [4] = new Rectangle(7, 3, "White");
        
        for (int i = 0; i<array.length;i++){
            System.out.println(array[i].getArea())
                    ;
        }
     }
    
}
