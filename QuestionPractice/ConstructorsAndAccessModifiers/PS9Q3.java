package QuestionPractice.ConstructorsAndAccessModifiers;
public class PS9Q3{
    public static void main(String[] args){
        Cylinder3 c = new Cylinder3(4,8);
       c.display();
    }
}
class Cylinder3{
    private double radius;
    private double height;
    Cylinder3(double r, double h){
        radius = r;
        height = h;
    }
   public void display(){
    System.out.println("Radius = "+radius);
    System.out.println("Height = "+height);
   }
}