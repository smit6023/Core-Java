package QuestionPractice.VaraiblesAndDataTypes;
import java.util.*;
public class PS1Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number = ");
        if(sc.hasNextInt()){
            System.out.println("The given number is integer");
        }
        else{
            System.out.println("The given number is not integer");
        }
    }
}