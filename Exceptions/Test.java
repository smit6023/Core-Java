class BankAccount{
    void withdraw(int balance, int amount){
        try{
            if(balance < amount){
              throw new Exception("Insufficient Balance");
            }
            else{
                balance = balance - amount;
                System.out.println("Withdrawl Successfully");
                System.out.println("Remaining Balance : "+balance);
            }
        }
        catch(Exception e){
            System.out.println("Exception : "+e.getMessage());
        }
    }
}
public class Test{
    public static void main(String[] args){
        BankAccount b = new BankAccount();
        int balance = 1000;
        int withdrawAmount = 12000;
        b.withdraw(balance , withdrawAmount);
    }
}