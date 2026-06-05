public class Car extends Vehicle{
    String model;
    void start(){
        super.start();
        System.out.println(this.model+"car is starting");
    }
    Car(){
        super(2); // it is used to call constructor
        System.out.println("Car is being created");
    }
    public static void main(String[] args){
        Car obj = new Car();
        System.out.println(obj.wheelsCount);
        obj.wheelsCount = 4;
        obj.colour = "White";
        obj.model = "I20";
        obj.start();
        System.out.println(obj.wheelsCount);
    }
} 