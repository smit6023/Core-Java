package QuestionPractice.Inheritence;
public class PS10Q5{
    public static void main(String[] args){
     Derived2 obj = new Derived2();
     
    }
}
class Base{
    Base(){
        System.out.println("Base Constructor is called ");
    }
}
class Derived1 extends Base{
    Derived1(){
        System.out.println("Derived1 Constructor is called");
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("Derived2 Constructor is called");
    }
}