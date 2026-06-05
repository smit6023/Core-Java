public class Vehicle{
    int wheelsCount;
    String colour;

    Vehicle(){
        System.out.println("Vehicle instance is being created");
    }

    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicles with wheels");
    }
    void start(){
        System.out.println("Vehicle is starting");
        System.out.println("Total wheels are : "+wheelsCount);
        System.out.println("Colour = "+colour);
    }
}
