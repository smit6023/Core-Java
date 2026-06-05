package Encapsulation;
public class ProtectedAccess{
    public static void main(String[] args){
    Students s1 = new Students();
    s1.showName();
    }
}
class People{
    protected String name = "Smit";
}
class Students extends People{
    void showName(){
        System.out.println(name);
    }
}