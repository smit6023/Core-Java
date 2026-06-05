package QuestionPractice.ErrorsAndException;
public class PS14Q1{
    public static void main(String[] args){
       // int a = 10  here we had not use semicoumn so it is a syntax error
        int length = 0;
        int breadth = 0;
       int area =  length + breadth;
            // here it is logic error because if we want to find area of circle there will be no length or breadth which is incorrect formula
        int a[] = new int[5];
        System.out.println(a[8]);
        // here array is till 5 but i am printing array of 8 which is indexoutofbound which causes runtime error
    }
}