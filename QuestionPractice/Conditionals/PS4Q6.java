package QuestionPractice.Conditionals;
import java.util.*;
public class PS4Q6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter website URL: ");
        String url = sc.next();

        if(url.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Other type of website");
        }
    }
}