package QuestionPractice.Conditionals;
import java.util.*;

public class PS4Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter income (in lakhs): ");
        double income = sc.nextDouble();

        double tax = 0;

        if(income <= 2.5){
            tax = 0;
        }
        else if(income > 2.5 && income <= 5){
            tax = income * 0.05;
        }
        else if(income > 5 && income <= 10){
            tax = income * 0.20;
        }
        else{
            tax = income * 0.30;
        }
        System.out.println("Tax = " + tax);
    }
}