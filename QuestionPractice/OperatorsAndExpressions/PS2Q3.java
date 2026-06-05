package QuestionPractice.OperatorsAndExpressions;
import java.util.*;
public class PS2Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = sc.nextInt();
        int b = 10;
        if(a > b){
            System.out.println("The given number is not greater than user number");
        }
        else{
            System.out.println("The given number is greater than user number");
        }
    }
}