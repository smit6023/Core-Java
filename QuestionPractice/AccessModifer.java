package QuestionPractice;
import QuestionPractice.Packages.DefaultClass;
class ProtectedClass extends DefaultClass{
    public void Method(){
      // here it not allowed because it is default and can be accessed within the same package
      //   System.out.println("Name = "+name);
        System.out.println("Number = "+number);
    }
}