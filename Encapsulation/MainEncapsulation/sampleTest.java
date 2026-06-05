package Encapsulation.MainEncapsulation;
import Encapsulation.Person;
public class sampleTest{
    public static void main(String[] args){
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());
        Person p2 = new Person();
       
        System.out.println(Person.count);
    }
}