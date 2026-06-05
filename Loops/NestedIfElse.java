import java.util.*;
public class NestedIfElse {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of a :");
int a = sc.nextInt();
System.out.println("Enter the value of b :");
int b = sc.nextInt();
System.out.println("Enter the value of c :");
int c = sc.nextInt();
/*if (a > b){
System.out.println("a is greater than b");
if (a > c){
System.out.println("a is greater than c");
System.out.println("a is greatest among all");
}
else{
System.out.println("c is greater than a");
System.out.println("c is greatest among all");
}
}
else{
System.out.println("b is greater than a");
if (b > c){
System.out.println("b is greater than c");
System.out.println("b is greatest among all");
}
if (c > b){
System.out.println("c is greater than b");
System.out.println("c is greatest among all");
}
}
*/

int max;
max = (a>b)?(a>c)? a:c : (b>c)? b:c;
System.out.println("Value of max is "+max);
}
}