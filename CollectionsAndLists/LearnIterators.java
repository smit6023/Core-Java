package CollectionsAndLists;
import java.util.*;
public class LearnIterators{
    public static void main(String[] args){
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Orange");
         
// method 1

        Iterator<String> fr = fruits.iterator();
        while(fr.hasNext()){                                       
           System.out.println("iterator "+ fr.next());
        }
 

        // method 2

        for(String fruit : fruits){
            System.out.println("for each fruit "+fruit);
        }

        List<String> smallList = fruits.subList(0, 3);
        System.out.println(smallList);
    }
}