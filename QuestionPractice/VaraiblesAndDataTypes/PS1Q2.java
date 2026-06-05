package QuestionPractice.VaraiblesAndDataTypes;
import java.util.*;

public class PS1Q2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();
        
        double cgpa = (m1 + m2 + m3) / 30;
        System.out.println("CGPA = " + cgpa);
    }
}