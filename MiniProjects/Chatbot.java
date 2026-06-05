package MiniProjects;
import java.util.*;

public class Chatbot {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("***** AI CHATBOT *****");

      while(true){
        System.out.println("You : ");
        String message = sc.nextLine();
        if(message.equalsIgnoreCase("Hello")){
            System.out.println("Bot : Hi");
        }
        else if(message.equalsIgnoreCase("How are You")){
            System.out.println("Bot : I am Fine! How can i help you?");
        }
        else if(message.equalsIgnoreCase("What is Java")){
            System.out.println("Bot : Java is a Programming language");
        }
        else if (message.equalsIgnoreCase("Who are You")){
            System.out.println("Bot : I am the Java AI Chatbot.");
        }
        else if (message.equalsIgnoreCase("Bye")){
            System.out.println("Bot : GoodBye ! Have a Nice Day.");
        }
        else{
            System.out.println("Bot : Sorry ! I don't understand"); 
        }
      }
    }
}
