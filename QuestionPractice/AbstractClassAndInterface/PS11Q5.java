package QuestionPractice.AbstractClassAndInterface;
public class PS11Q5{
  public static void main(String[] args){
    Monkey1 m = new Human1();
    m.jump();
    m.bite();
  }
}
abstract class Monkey1{
   abstract void jump();
   abstract void bite();
}
interface basicAnimal1{
    void sleep();
    void eat();
}
class Human1 extends Monkey1 implements basicAnimal1{
  void jump(){
    System.out.println("Human can jump");
  }
  void bite(){
    System.out.println("Human can bite");
  }
  public void sleep(){
    System.out.println("Human can sleep");
  }
  public void eat(){
    System.out.println("Human can eat");
  }
}