package CollectionsAndLists;
import java.util.*;
public class LearnPriorityQueue{
    public static void main(String[] args){
        Queue<Integer> pq = new PriorityQueue<>();  // here by default it will sort in accending order
      pq.offer(30);
      pq.offer(40);
      pq.offer(20);
      pq.offer(10);
      System.out.println(pq);
      System.out.println(pq.poll());
      System.out.println(pq);

      // if there is a string then priority will go alphabetically by default
    }
}