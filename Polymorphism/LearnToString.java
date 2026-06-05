package Polymorphism;
class Students2{
   int marks = 90;

   public String toString(){
    return "Marks = "+marks;
   }
}
public class LearnToString{
    public static void main(String[] args){
        Students2 s1 = new Students2();
        System.out.println(s1);
    }
}