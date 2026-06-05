package CollectionsAndLists;
import java.util.*;
public class LearnSets{
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>();
        // in hash set element will be there in random ordered 
        set.add(10);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println(set);
        set.remove(10);
         System.out.println(set);

         Set<Integer> sets = new LinkedHashSet<>();
         // in LinkedHash Set element will be there in order wised 
          sets.add(10);
        sets.add(10);
        sets.add(30);
        sets.add(20);
        System.out.println(sets);

        Set<Integer> s = new TreeSet<>();
        // in TreeSet element will be there in sorted order
         s.add(10);
        s.add(10);
        s.add(30);
        s.add(20);
        System.out.println(s);
    }
}