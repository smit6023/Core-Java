public class Program2{
    public static void main(String[] args){
    User u1 = new User("Smit");
    u1.print();
    }
}
class User{
    String name;

  User(String name){
    this.name = name;
  }
  
  void print(){
    System.out.println("The name of user is "+name);
  }
}