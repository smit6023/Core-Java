package QuestionPractice.ErrorsAndException;
import java.util.*;
public class PS14Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int attempts = 0;
        while(attempts < 5){
          try{
            System.out.println("Enter the array index = ");
            int index = sc.nextInt();
            System.out.println("Value is = "+arr[index]);
            break;
          }
          catch(ArrayIndexOutOfBoundsException e ){
            System.out.println("Invalid index");
            attempts++;
          }
        }
        if (attempts == 5){
            System.out.println("Error");
        }
    }
}