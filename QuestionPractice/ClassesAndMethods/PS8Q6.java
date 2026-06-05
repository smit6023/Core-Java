package QuestionPractice;
import java.util.*;
public class PS8Q6{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the radius = ");
      int r = sc.nextInt();
    Circle c1 = new Circle();
    c1.setRadius(r);
    c1.calculateArea();
    c1.perimeter();
    }
}
class Circle{
 int radius;
 public void setRadius(int radius){
   this.radius = radius;
 }
 public void calculateArea(){
    System.out.println("Area = "+(Math.PI * radius * radius));
 }
 public void perimeter(){
    System.out.println("Perimeter = "+(2 * Math.PI * radius));
 }
}