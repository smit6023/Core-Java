package CollectionsAndLists;
import java.util.*;
public class LearnStack{
    public static void main(String[] args){
        Stack<String> alpha = new Stack<>();
        alpha.push("A");
        alpha.push("B");
        alpha.push("C");
        alpha.push("D");
        System.out.println(alpha);
        System.out.println(alpha.pop());
        System.out.println(alpha.peek());
        System.out.println(alpha.empty());
        System.out.println(alpha);
    }
}