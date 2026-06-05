package QuestionPractice;
import java.util.*;

public class PS8Q1{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the salary = ");
     int s = sc.nextInt();
     System.out.print("Enter the name = ");
     String n = sc.next();
     Employee e1 = new Employee();
     e1.setSalary(s);
     e1.setName(n);
     System.out.println(e1.getSalary());
     System.out.println(e1.getName());
    }
}   
class Employee{
    int salary;
    String name;
    public int getSalary(){
        System.out.print("Salary = ");
        return salary;
    }
    public String getName(){
        return "Name = "+name;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public void setName(String name){
        this.name = name;
    }
}