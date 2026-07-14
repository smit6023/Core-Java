import java.util.*;
public class functiongreater{
    public static void printGreaterNumber(int a, int b){
        if (a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.print("b is greater than a");
        }
    }
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    printGreaterNumber(a,b);
   }
}