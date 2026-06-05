package QuestionPractice.Inheritence;
public class PS10Q2{
    public static void main(String[] args){
      Cuboid c = new Cuboid();
       c.showCuboid();
    
    }
}

 class Rectangle{
    double length = 4;
 double breadth = 8;
    public void showRectangle(){
        System.out.println("Length and Breadth of Rectangle = "+length+" , "+breadth);
    }
}
class Cuboid extends Rectangle{
    double height = 10;
    public void showCuboid(){
        System.out.println("Length, Breadth and Height of Cuboid = "+length+" , "+breadth+" , "+height);
    }
}
