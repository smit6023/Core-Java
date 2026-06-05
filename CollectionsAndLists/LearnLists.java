package CollectionsAndLists;
import java.util.*;
public class LearnLists{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list2.add(10);
        list2.add(2);
        list2.add(3);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.remove(3);
        System.out.println(list);
        list.remove(Integer.valueOf(50));
        System.out.println(list);
        list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);       // here it will remove the common element from both the list
        System.out.println(list);
        list.retainAll(list2);
        System.out.println(list);  // here it will only give which are common elements and remove the elements of list1
    }
}