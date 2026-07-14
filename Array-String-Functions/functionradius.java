import java.util.*;
public class functionradius{
    public static double calculateCircumference(int r){
        double circumference = 2*Math.PI*r;
        return circumference;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
      double result = calculateCircumference(r);
      System.out.println("Circumference" + result);
    }
}