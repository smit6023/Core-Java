import java.util.*;
public class ifElseIf {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number :");
int number = sc.nextInt();
if (number > 0){
System.out.println("Number is positive");
}
else if (number < 0){
System.out.println("Number is negative");
}
else{
System.out.println("Number is equal to zero");
}
}
}