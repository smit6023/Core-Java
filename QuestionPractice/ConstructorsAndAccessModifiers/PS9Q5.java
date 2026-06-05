package QuestionPractice.ConstructorsAndAccessModifiers;
import java.util.*;
public class PS9Q5{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the radius = ");
     double r = sc.nextDouble();
     Sphere s = new Sphere();
     s.setRadius(r);
     System.out.println("Radius of Sphere = "+s.getRadius());
    }
}
class Sphere{
    private double radius;
    public double getRadius(){
      return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}