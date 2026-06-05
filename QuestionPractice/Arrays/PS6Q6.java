package QuestionPractice.Arrays;
public class PS6Q6{
    public static void main(String[] args){

        int arr[] = {10, 55, 23, 99, 45};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}