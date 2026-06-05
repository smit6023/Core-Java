package Encapsulation;
public class DefaultAccess{
    public static void main(String[] args){
    Teacher t1 = new Teacher();
    t1.studentMarks();
    }
}
class Student{
    int marks = 90;
}

class Teacher{
    void studentMarks(){
        Student s1 = new Student();
        System.out.println(s1.marks);
        
    }
}