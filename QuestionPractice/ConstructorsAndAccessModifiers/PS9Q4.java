package QuestionPractice.ConstructorsAndAccessModifiers;
public class PS9Q4{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
       Rectangle r2 = new Rectangle(4,8);
       r1.display();
       r2.display();
    }
}
class Rectangle{
    private double length;
    private double breadth;
    Rectangle(){
        length = 4;
        breadth = 5;
    }
    Rectangle(double l, double b){
        length = l;
        breadth = b;
    }
   public void display(){
    System.out.println("Length = "+length);
    System.out.println("Breadth = "+breadth);
   }
}