import java.util.*;
public class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Cube c1 = new Cube();
    System.out.println("Enter the height");
     c1.height = sc.nextFloat();
     System.out.println("Enter the width");
     c1.width = sc.nextFloat();
     System.out.println("Enter the depth");
     c1.depth = sc.nextFloat();
     c1.calArea();
    }
}
class Cube{
    float height;
    float width;
    float depth;
    public float calArea(){
        float area = height * width * depth;
        System.out.println("Area = "+area);
        return area;
    }
}