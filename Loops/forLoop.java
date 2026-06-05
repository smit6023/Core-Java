import java.util.*;
public class forLoop {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter any number :");
int n = sc.nextInt();
/*for (int i=1; i<=10; i++){
System.out.println(n+ " * "+i+ " = "+i * n);
}*/

int sum = 0;
for (int i=1; i<=n; i++){
sum = sum + i;
}
System.out.println("Value of sum is ="+sum);
}
}