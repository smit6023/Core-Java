package QuestionPractice.OperatorsAndExpressions;
import java.util.*;
public class PS2Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the grade = ");
        char grade = sc.next().charAt(0);
        char encrypted = (char)(grade + 8);
        System.out.println("The encrypted grade is = "+encrypted);
        char decrypted = (char)(encrypted - 8);
        System.out.println("The decrypted grade is "+decrypted);
    }
}