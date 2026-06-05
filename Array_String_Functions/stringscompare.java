import java.util.*;
public class stringscompare{
    public static void main(String[] args){
    String name1 = "Smit";
    String name2 = "Kapurya";

    // case 1 : st1 > st2 = +ve value
    // case 2 : st1 = st2 = 0
    // case 3 : st1 < st2 = -ve value

    if(name1.compareTo(name2)==0){
        System.out.println("Both strings are equal");
    }
    else{
        System.out.println("Both strings are not equal");
    }
    }
}