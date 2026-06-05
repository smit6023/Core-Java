package Encapsulation;
public class Person{
    public static int count = 0;

    // calling constructor
    public Person(){
        count++;
        // it means it will count how many times Person object is created 
    }
    private int age;
    private String name;
    boolean canBeChanged = true;
    public void setAge(int age){
        if (canBeChanged){
            if (age > 0){
        this.age = age;
        }
    }
    }
    public int getAge(){
        return age;
    }
}