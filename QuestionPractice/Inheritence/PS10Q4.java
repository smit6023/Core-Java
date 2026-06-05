package QuestionPractice.Inheritence;
import java.util.*;
public class PS10Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        double l = sc.nextDouble();
         System.out.print("Enter the width = ");
        double w = sc.nextDouble();
         System.out.print("Enter the height = ");
        double h = sc.nextDouble();
        Cuboid2 c = new Cuboid2();
        c.setRectangle(l,w);
        c.setCuboid(h);
        System.out.println(c.getRectangle());
        System.out.println(c.getCuboid());
    
    }
}

 class Rectangle2{
    protected double length;
    protected double width;
    public void setRectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    public String getRectangle(){
        return ("Area of Rectangle = "+(length * width));
    }
}
class Cuboid2 extends Rectangle2{
    private double height;
    public void setCuboid(double height){
        this.height = height;
    }
    public String getCuboid(){
        return ("Volume of Cuboid = "+(length * width * height));
    }
}
