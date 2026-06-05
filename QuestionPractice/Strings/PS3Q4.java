package QuestionPractice.Strings;

public class PS3Q4{
    public static void main(String[] args){

        String text = "This  is   a string";

        System.out.println("Double space index = " + text.indexOf("  "));
        System.out.println("Triple space index = " + text.indexOf("   "));
    }
}