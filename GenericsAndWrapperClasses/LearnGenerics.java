package GenericsAndWrapperClasses;
public class LearnGenerics{
    public static void main(String[] args){
    Dog<String> d1 = new Dog("abcd1234");
    Dog<Integer> d2 = new Dog(12);
    System.out.println(d2.getId());
    }
}
class Dog<E>{
    E id;
    public Dog(E id){
        this.id = id;
    }
    E getId(){
        return id;
    }
}