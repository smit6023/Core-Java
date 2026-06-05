package QuestionPractice.VaraiblesAndDataTypes;
import java.util.*;
public class PS1Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometers : ");
        double kilometers = sc.nextDouble();
        System.out.println("Converting Kilometers into miles.");
        double miles = kilometers * 0.621;
        System.out.print("Miles = "+miles);
    }
}