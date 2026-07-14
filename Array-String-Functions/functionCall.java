public class functionCall{
public static void main(String[] args){
int avgFromFunction = average(4,6);
System.out.println("Hello World");
System.out.println(avgFromFunction);
}
public static int average(int a, int b){
int avg = (a+b)/2;
return avg;
}
}