import java.util.*;
public class UserInput {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your age :");
int age = sc.nextInt();
System.out.println("Your age is "+age);
System.out.println("Enter your first number :");
int  a = sc.nextInt();
System.out.println("Enter your second number :");
int b = sc.nextInt();
int result = a + b;
System.out.println("Your result is :"+result);
}
}