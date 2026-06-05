package Polymorphism;
public class LeanrPolymorphism{
    public static void main(String[] args){
     Data d = new ChildData();
     Data D = new Data();
     d.printData(); // this is called runtime polymorphism aka method overriding
     D.printData(); // this is called runtime polymorphism aka method overriding
     Data D2 = new Data();
     D2.printData(5); //// this is called compile-time polymorphism aka method overloading
    }
}

class Data{
    int data = 10;

    public void printData(){
        System.out.println(data);
    }

    public void printData(int Times){
        for (int i=0; i<=Times; i++){
            System.out.println(data);
        }
    }
}

class ChildData extends Data{
    // this is called runtime polymorphism
    @Override
    public void printData(){
        System.out.println("Override "+data);
    }
}