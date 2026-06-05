public class Program3{
    public static void main(String[] args){
    Account a1 = new Account(123456789, 20000);
    System.out.println("After Deositing : ");
    a1.deposit(10000);
    System.out.println("After Withdrawing : ");
    a1.withdraw(5000);
    }
}
class Account{
    int accNo;
    int balance;

    Account(int accNo, int balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    int deposit(int amount){
     balance = amount + balance;
     System.out.println("The total balance : "+balance);
     return amount;
    }

    int withdraw(int amount){
        balance = balance - amount;
    System.out.println("The total balance : "+balance);
    return amount;
    }
}