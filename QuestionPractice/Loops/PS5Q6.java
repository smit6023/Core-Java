package QuestionPractice.Loops;
import java.util.*;
public class PS5Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = sc.nextInt();
        int fact = 1;
        int i = 1;
        while(i<=n){
            fact = fact * i;
            i++;
        }
        System.out.println(fact);
    }
}