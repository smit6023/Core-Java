package QuestionPractice.Loops;
import java.util.*;
public class PS5Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n = ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= 10){
            sum = n * i;
            System.out.println(n +" * "+i+" = "+sum);
            i++;
        }
    }
}