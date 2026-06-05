public class methodOverlaoding{
    public static void main(String[] args){
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Smit");

    }
}

class Greet{
    void greetings(){
        System.out.println("Hello, Good Morning");
    }
    void greetings(String name){
       System.out.println("Hello "+name+" , Good Morning"); 
    }

}