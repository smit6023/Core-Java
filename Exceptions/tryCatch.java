package Exceptions;
public class tryCatch{
    public static void main(String[] args){
        int a[] = new int[5];
        System.out.println("Hello Guys");
        try{
               System.out.println(a[8]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Tried to accesss the out of bound element");
        }
        System.out.println("Bye Guys");
    }
}