package QuestionPractice.ErrorsAndException;
import java.util.*;
public class Extra3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {2,4,6};
        int attempts = 0;
        while(attempts < 3){
        try{
            System.out.println("Enter the index = ");
            int index1 = sc.nextInt();
            System.out.println("Value = "+a[index1]);
            break;
        }
        catch(Exception e ){
            System.out.println("Wrong Index try again ");
            attempts++;
        }
    }
    }
}
