public class mainClass{
    public static void main(String[] args){

        // object

        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.age = 7;
        d1.colour = "White";
        d1.bark();
        d1.walk();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.age = 10;
        d2.colour = "Black";
        d2.walk();

        Complex num = new Complex();
        num.a = 3;
        num.b = 5;
        num.print();
    }
}

// class

class Dog{

    String name;
    int age;
    String colour;
    
    void walk(){
        System.out.println(name+" is Walking");
        System.out.println("Age and Colour of "+name+ "is"+ age + "and"+ colour);
    }

    void bark(){
        System.out.println(name+" is barking");
    }
}

class Complex{
    int a, b;
    void print(){
        System.out.println(a+" + "+b+" i ");
    }
}