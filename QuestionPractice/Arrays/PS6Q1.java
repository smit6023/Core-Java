package QuestionPractice.Arrays;
public class PS6Q1{
    public static void main(String[] args){
        float arr[] = {2.5f, 3.5f, 4.5f, 5.5f, 6.5f};
        float sum = 0;
         for(int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}