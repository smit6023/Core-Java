public class InheritenceP1{
    public static void main(String[] args){
    WashingMachine w1 = new WashingMachine();
    w1.operate();
    }
}
class Appliance{
    void operate(){
        System.out.println("Appliances are operating");
    }
}

class WashingMachine extends Appliance{
    void operate(){
        System.out.println("Washing Machine is operating");
    }
}