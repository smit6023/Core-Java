package QuestionPractice.ErrorsAndException;
import java.util.*;
public class Extra2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {5,10,15};
        try{
            System.out.println("Enter the index = ");
            int INDEX = sc.nextInt();
            System.out.println("Value = "+a[INDEX]);
        }
        catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Wrong Index");
        }
    }
}