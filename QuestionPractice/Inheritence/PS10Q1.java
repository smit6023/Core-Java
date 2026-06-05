package QuestionPractice.Inheritence;
public class PS10Q1{
    public static void main(String[] args){
      Cylinder c = new Cylinder();
       c.showCircle();
       c.showCylinder();
    
    }
}
class Circle{
    double radius = 4;
    public void showCircle(){
        System.out.println("Radius of circle = "+radius);
    }
}
 class Cylinder extends Circle{
 double height = 8;
    public void showCylinder(){
        System.out.println("Radius and Height of cylinder = "+radius+ ", "+height);
    }
}
