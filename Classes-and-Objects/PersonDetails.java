public class PersonDetails{
    public static void main(String[] args){
        Person p1 = new Person();
      p1.print();

    }
}
class Person{
    String name;
    int age;
    int salary;
    
    public Person(){
    name = "Smit";
    age = 21;
    salary = 20000;
    }
    void print(){
        System.out.println("The name of Person is "+name+" the age is "+age+" the salary is "+salary);
    }
}