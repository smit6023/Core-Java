package QuestionPractice.AbstractClassAndInterface;
abstract class Monkey{
   abstract void jump();
   abstract void bite();
}
interface basicAnimal{
    void sleep();
    void eat();
}
class Human extends Monkey implements basicAnimal{
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