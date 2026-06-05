package CollectionsAndLists;
import java.util.*;
public class LearnDequeue{
    public static void main(String[] args){
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        dq.offer(10);
        dq.offerLast(20);
        dq.offerFirst(30);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq.poll());
        System.out.println(dq.pollLast());

        // Stack using ArrayDeque

        dq.push(20);
        dq.push(30);
        System.out.println(dq);
        System.out.println(dq.pop());
        System.out.println(dq);

        // Queue operations using ArrayDeque

        dq.offer(30);
        dq.offer(40);
        System.out.println(dq);
        System.out.println(dq.poll());
        System.out.println(dq);
    }
}