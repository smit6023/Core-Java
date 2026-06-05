package QuestionPractice.ErrorsAndException;
import java.util.*;
public class Extra1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number = ");
        int n = sc.nextInt();
        try{
            int result = 10 / n;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Exception handled");
        }
    }
}