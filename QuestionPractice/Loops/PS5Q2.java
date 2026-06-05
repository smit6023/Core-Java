package QuestionPractice.Loops;
import java.util.*;
public class PS5Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while(i<=n){
            sum = sum + (2 * i);
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}