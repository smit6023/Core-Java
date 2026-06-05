package Encapsulation;
public class PrivateAccess{
    public static void main(String[] args){
    BankAccount b1 = new BankAccount();
    // here it will not be accessible because it is private which is accessible within the same class not outside it
    // System.out.println(b1.balance);
    }
}
class BankAccount{
    private int balance = 5000;
    
    void showBalance(){
        System.out.println("Balance : "+balance);
    
    }
}