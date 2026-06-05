package Polymorphism;
class Students3{
    int marks;

    Students3(int marks){
        this.marks = marks;
    }

    public boolean equals(Object obj){
        Students3 s = (Students3)obj;
        return this.marks == s.marks;
    }
}
public class LearnEquals{
    public static void main(String[] args){
        Students3 s1 = new Students3(90);
        Students3 s2 = new Students3(90);
        System.out.println(s1.equals(s2));
        }
}