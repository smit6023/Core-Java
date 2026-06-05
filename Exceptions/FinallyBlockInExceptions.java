package Exceptions;
public class FinallyBlockInExceptions{
    public static void main(String[] args){
        int a[] = new int[5];
        System.out.println("Hello World");
        try{
            System.out.println(a[8]);
        } catch(Exception e){
            System.out.println("Exception Handled");
        } finally{
            System.out.println("I will print always");
        }
        System.out.println("Bye Guys");
    }
}