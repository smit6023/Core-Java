import java.util.*;
public class whileLoop{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
boolean hasLearnt = false;
while (!hasLearnt){
System.out.println("Go to School, learn again");
System.out.println("Have you learnt?");
hasLearnt = sc.nextBoolean();
}
}
}

