package QuestionPractice;
import java.util.*;
public class PS8Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of side = ");
        int s = sc.nextInt();
     Square s1 = new Square();
     s1.setSide(s);
     s1.calculateArea();
     s1.perimeter();
    }
}
class Square{
    int side;
    public void setSide(int side){
        this.side = side;
    }
    public void calculateArea(){
        System.out.println("Area = "+(side * side));
    }
    public void perimeter(){
        System.out.println("Perimeter = "+(4 * side));
    }
}