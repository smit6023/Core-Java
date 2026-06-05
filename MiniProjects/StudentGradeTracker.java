package MiniProjects;
import java.util.*;
public class StudentGradeTracker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Enter the number of Students");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter the Student Name");
            String name = sc.next();
            System.out.println("Enter the Student Marks ");
            double marks = sc.nextDouble();
            students.add(new Student(name, marks));
        }
        for(Student s : students){
            s.displayStudent();
        }

        double totalMarks = 0;
        for(Student s : students){
            totalMarks = totalMarks + s.marks;
        }
        double average = totalMarks / students.size();
        System.out.println("Average Marks = "+average);

        double highestMarks = students.get(0).marks;  // here which means make the first students marks as highest that will work for all types of marks in negative also
        for(Student s : students){
            if(s.marks > highestMarks){
                highestMarks = s.marks;
            }
        }
        System.out.println("Highest Marks = "+highestMarks);

        double lowestMarks = students.get(0).marks;
        for(Student s : students){
            if(s.marks < lowestMarks){
                lowestMarks = s.marks;
            }
        }
        System.out.println("Lowest Marks = "+lowestMarks);
    }
}

class Student{
    String studentName;
    double marks;

    Student(String studentName, double marks){
        this.studentName = studentName;
        this.marks = marks;
    }
     String calculateGrade(){
        if(marks >=90){
          return "A";
        }
        else if(marks >=80){
            return "B";
        }
        else if (marks >=70){
            return "C";
        }
        else{
            return "D";
        }

    }
     
    public void displayStudent(){
     System.out.println("\n********** Student Report **********");
     System.out.println("Student Name = "+studentName);
     System.out.println("Marks = "+marks);
     System.out.println("Grade = "+calculateGrade());
    }
    }
    