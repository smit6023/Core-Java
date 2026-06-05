package GenericsAndWrapperClasses;
public class GenericMethods{
    public static void main(String[] args){
        printData("Hello");
        printData(123);
        GenericMethods obj = new GenericMethods();
        obj.doubleData("Java Programming");
        obj.doubleData(1234);
    }
    static <E> void printData(E data){
        System.out.println(data);
    }
    <E> void doubleData(E data){
        System.out.println(data);
    }
}