package Encapsulation;
class BankAccount {
    
    // Step 1: Data hiding
    private int balance = 5000;

    // Step 2: Getter method
    public int getBalance() {
        return balance;
    }

    // Step 3: Setter method
    public void setBalance(int amount) {
        if(amount > 0) {
            balance = amount;
        }
    }
}

public class StandardEncapsulation {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // Direct access not allowed
        // acc.balance = 10000; ❌ Error

        // Controlled access
        acc.setBalance(10000);
        System.out.println("Balance: " + acc.getBalance());
    }
}
