package QuestionPractice.VaraiblesAndDataTypes;
import java.util.*;
public class PS1Q1{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the first number = ");
      int a = sc.nextInt();
       System.out.print("Enter the second number = ");
      int b = sc.nextInt();
       System.out.print("Enter the third number = ");
      int c = sc.nextInt();
      int sum = a + b + c;
      System.out.print("The sum of 3 numbers = "+sum);
    }
}