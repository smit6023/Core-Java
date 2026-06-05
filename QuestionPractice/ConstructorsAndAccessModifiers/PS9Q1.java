package QuestionPractice.ConstructorsAndAccessModifiers;
import java.util.*;
public class PS9Q1{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the radius = ");
     int r = sc.nextInt();
     System.out.print("Enter the height = ");
     int h = sc.nextInt();
     Cylinder c1 = new Cylinder();
     c1.setRadius(r);
     c1.setHeight(h);
     System.out.println("Radius of Cylinder = "+c1.getRadius());
     System.out.println("Height of Cylinder = "+c1.getHeight());
    }
}
class Cylinder{
    private int radius;
    private int height;
    public int getRadius(){
      return radius;
    }
    public int getHeight(){
      return height;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void setHeight(int height){
        this.height = height;
    }
}