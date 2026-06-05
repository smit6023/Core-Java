 public class Abstraction{
    public static void main(String[] args){
    Bus b1 = new Bus();
    b1.accelerate();
    b1.brakes(4);
    }
}

abstract class Vehicles{
 abstract void accelerate();
    abstract int brakes(int wheels);
}
class Bus extends Vehicles{
    
    void accelerate(){
        System.out.println("Bus is accelerating");
    }
    
    int brakes(int wheels){
        System.out.println("Wheels are being stopped by brakes");
        return wheels;
    }
}
 