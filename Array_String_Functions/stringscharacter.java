import java.util.*;
public class stringscharacter{
    public static void main(String[] args){
        String firstName = "Smit";
        String lastName = "Kapuriya";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName.length());

        // charAt
        for (int i=0; i<FullName.length(); i++){
            System.out.println(FullName.charAt(i));
        }
    }
}