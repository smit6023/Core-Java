package QuestionPractice;
import java.util.*;
public class PS8Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length = ");
        int l = sc.nextInt();
        System.out.print("Enter the width = ");
        int w = sc.nextInt();
    Rectangle r1 = new Rectangle();
    r1.setLength(l);
    r1.setWidth(w);
    r1.calculateArea();
    r1.perimeter();
    }
}
class Rectangle{
    int length;
    int width;
    public void setLength(int length){
        this.length = length;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void calculateArea(){
        System.out.println("Area = "+(length * width));
    }
    public void perimeter(){
        System.out.println("Perimeter = "+(2 * (length + width)));
    }
}