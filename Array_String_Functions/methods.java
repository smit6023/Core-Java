public class methods{
public static void main(String[] args){
System.out.println(1);
System.out.println(2);
greet();
System.out.println(3);
average(4,6);
average(2,7);
}
static void greet(){
System.out.println(4);
System.out.println("Hello World");
}
public static void average(int a, int b){
int avg = (a+b)/2;
System.out.println("The average is :"+avg);
}
}