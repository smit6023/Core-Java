package QuestionPractice.Arrays;
    public class PS6Q3{
      public static void main(String[] args){
        int marks[] = {60, 70, 80, 90};
        int sum = 0;

        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }

        double avg = (double) sum / marks.length;
        System.out.println("Average = " + avg);
    }
}