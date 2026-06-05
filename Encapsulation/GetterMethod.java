package Encapsulation;
public class GetterMethod{
    public static void main(String[] args){
    Account a1 = new Account();
    System.out.println(a1.getAccountType());
    }
}
 class Account{
    private String type;

    public String getAccountType(){
        return "Savings";
    }
 }