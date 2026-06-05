package QuestionPractice.ErrorsAndException;
import java.util.*;

class MyException extends Exception{
    public String toString(){
        return "Maximum attempts reached";
    }
}

public class PS14Q5{

    static void checkIndex() throws MyException{

        Scanner sc = new Scanner(System.in);
        int arr[] = {10,20,30,40,50};
        int attempts = 0;

        while(attempts < 5){
            try{
                System.out.print("Enter index: ");
                int index = sc.nextInt();

                System.out.println("Value = " + arr[index]);
                return;   // correct input → exit method
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index");
                attempts++;
            }
        }

        if(attempts == 5){
            throw new MyException();   // ⭐ thrown from method
        }
    }

    public static void main(String[] args){

        try{
            checkIndex();   // method call
        }
        catch(MyException e){
            System.out.println(e);   // handled here
        }
    }
}