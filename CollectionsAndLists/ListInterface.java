package CollectionsAndLists;
import java.util.*;
public class ListInterface{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.set(1, 300));
        System.out.println(list);
        list.add(2, 45);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        System.out.println(list.indexOf(50));
        
    }
}