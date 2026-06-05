package QuestionPractice.Conditionals;
import java.util.*;

public class PS4Q2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        float m1 = sc.nextFloat();

        System.out.print("Enter marks of subject 2: ");
        float m2 = sc.nextFloat();

        System.out.print("Enter marks of subject 3: ");
        float m3 = sc.nextFloat();

        float percentage = (m1 + m2 + m3) / 3;

        if(percentage >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33){
            System.out.println("Student is PASS");
        }
        else{
            System.out.println("Student is FAIL");
        }
    }
}
