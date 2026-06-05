import java.util.*;
public class builderstring{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Smit");
        System.out.println(sb);

        // set index at 0
        sb.setCharAt(0, 'A');
        System.out.println(sb);

        // if we want to insert or add something 

        sb.insert(0, 'R');
        System.out.println(sb);

        // if we want to delete something

        sb.delete(0, 1);
        System.out.println(sb);
    }
}