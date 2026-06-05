package QuestionPractice.ConstructorsAndAccessModifiers;
import java.util.*;
public class PS9Q2{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the radius = ");
     int r = sc.nextInt();
     System.out.print("Enter the height = ");
     int h = sc.nextInt();
     Cylinder1 c1 = new Cylinder1();
     c1.setRadius(r);
     c1.setHeight(h);
     System.out.println("Radius of Cylinder = "+c1.getRadius());
     System.out.println("Height of Cylinder = "+c1.getHeight());
     c1.calculateSurfaceArea();
     c1.calculateVolume();
    }
}
class Cylinder1{
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
    public void calculateSurfaceArea(){
        System.out.println("Surface Area = "+(2 * Math.PI * radius * (radius + height)));
    }
    public void calculateVolume(){
        System.out.println("Volume = "+(Math.PI * radius * radius * height));
    }
}