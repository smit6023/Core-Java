package QuestionPractice.Inheritence;
public class PS10Q3{
    public static void main(String[] args){
      Cylinder2 c = new Cylinder2();
       c.areaCircle();
       c.volumeCylinder();
    
    }
}
class Circle2{
    double radius = 4;
    public void areaCircle(){
        System.out.println("Area of circle = "+(Math.PI * radius * radius));
    }
}
 class Cylinder2 extends Circle2{
 double height = 8;
    public void volumeCylinder(){
        System.out.println("Volume of cylinder = "+(Math.PI * radius * radius * height));
    }
}
