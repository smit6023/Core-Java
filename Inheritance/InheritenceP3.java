public class InheritenceP3{
    public static void main(String[] args){
     OnlineCourse o1 = new OnlineCourse("Devops", "TWS");
     o1.display();

    }
}
class Course{
    String CourseName;

    Course(String CourseName){
        this.CourseName = CourseName;
    }
}

class OnlineCourse extends Course{
    String Platform;

    OnlineCourse(String CourseName, String Platform){
        super(CourseName);
        this.Platform = Platform;
    }

    void display(){
        System.out.println("Course Name is "+CourseName);
        System.out.println("Platform Name is "+Platform);
    }
}
