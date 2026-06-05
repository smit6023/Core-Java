package Threads;

public class CustomerProduct {
    public static void main(String[] args){
        Customer c1 = new Customer("Smit", "Laptop");
        Customer c2 = new Customer("Rahul","Laptop");
        Customer c3 = new Customer("Jay", "Laptop");
        c1.start();
        c2.start();
        c3.start();
    }
}

class Customer extends Thread{
    String name , productName;
    static int productQuantity = 2;
    Customer(String name, String productName){
        this.name = name;
        this.productName = productName;
    }
    synchronized void buyProduct(){
        synchronized(Customer.class){
        if(productQuantity > 0){
            System.out.println(name +" is buying "+productName);
            productQuantity--;
            System.out.println("Remaining Prouct = "+productQuantity);
        }
         else {
            System.out.println("Product out of stock :" +name);
        }
    }
    }
    public void run(){
        buyProduct();
    }
}
