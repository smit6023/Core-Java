public class Victus{
    public static void main(String[] args){
    Laptop l1 = new Laptop("HP", 8);
    l1.print();
    }
}
class Laptop{
   String brand;
   int ram;
   Laptop(String brand, int ram){
    this.brand = brand;
    this.ram = ram;
   }
   void print(){
    System.out.println("The brand of laptop is "+brand);
    System.out.println("Total RAM in the laptop is "+ram+" Gb");
   }
}