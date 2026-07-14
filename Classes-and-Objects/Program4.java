public class Program4{
    public static void main(String[] args){
    Student s1 = new Student(1);
    Student s2 = new Student(2, "Smit");
    Student s3 = new Student(3, "Smit", 90);
      s3.print();
    }
}
class Student{
    int id;
    String name;
    int marks;

    Student(int id){
        this.id = id;
    }
    
    Student(int id, String name){
        this(id);
        this.name = name;
    }

    Student(int id, String name, int marks){
      this(id, name);
        this.marks = marks;
    }

    void print(){
        System.out.println(id+" "+name+" "+marks);
    }
}