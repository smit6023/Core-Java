package QuestionPractice.AbstractClassAndInterface;
abstract class Pen{
    abstract void write();
    abstract void refill();
 }
  class FountainPen extends Pen{
     void changeNib(){
      System.out.println("changing nib of pen");
     }
     void write(){
      System.out.println("Writing");
     }
     void refill(){
      System.out.println("Refilling");
     }
 }