public class Interfaces{
    public static void main(String[] args){
    Monkey m1 = new Monkey();
    m1.eats();
    m1.walks();
    m1.drinks();
    System.out.println(Animal.Legs);
    m1.sleep();
    }
}
interface Pet{
    void walks();
    void drinks();
    default void sleep(){
        System.out.println("Monkey is sleeping");
    }
}
interface Animal{
    int Legs = 4; // here int legs is bydefualt public static final and cannot be changed
    void eats();
    void drinks();
}
class Monkey implements Animal,Pet{
    public void eats(){
        System.out.println("Monkey is eating");
    }
    public void walks(){
        System.out.println("Monkey is walking");
    }
    public void drinks(){
        System.out.println("Monkey is drinking");
    }
}