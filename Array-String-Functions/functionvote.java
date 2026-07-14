import java.util.*;
public class functionvote{
    public static void printEligibleForVote(int n){
        if (n<=18){
            System.out.println("Not Eligible For The Vote");
        }
       else{
           System.out.println("Eligible For The Vote");
     }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEligibleForVote(n);
    }
}