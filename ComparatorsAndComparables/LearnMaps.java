package ComparatorsAndComparables;
import java.util.*;
public class LearnMaps{
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("in","India");
        map.put("us","United States");
         map.put("us","United States");
          map.put("usa","United States");
         System.out.println(map);
         map.remove("usa");
         System.out.println(map);
         System.out.println(map.containsKey("usa"));
         System.out.println(map.get("in"));
         System.out.println(map.getOrDefault("usa", "Others"));   // because here key usa is not present
         System.out.println(map.containsValue("India"));

         // if we want all the keys 
         Set<String> keys = map.keySet();
         System.out.println(keys);
    }
}