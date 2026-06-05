package QuestionPractice.ErrorsAndException;
public class PS14Q2{
    public static void main(String[] args){
        try{
            int a = 10 / 0; // Airthmetic exception
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
        try{
            throw new IllegalArgumentException(); // manual exception
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
    }
}