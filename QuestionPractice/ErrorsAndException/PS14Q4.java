package QuestionPractice.ErrorsAndException;
import java.util.*;
class MyException extends Exception{
    public String toString(){
        return "Maximum limit reached";
    }
}
public class PS14Q4{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int arr[] = {10,20,30,40,50};
     int attempt = 0;
     while (attempt < 5){
        try{
            System.out.println("Enter the array index = ");
            int Index = sc.nextInt();
            System.out.println("The value is = "+arr[Index]);
            break;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index");
            attempt++;
        }
     }
     if (attempt == 5){
        try{
            throw new MyException();
        }
        catch(MyException e ){
            System.out.println(e);
        }
     }
    }
}