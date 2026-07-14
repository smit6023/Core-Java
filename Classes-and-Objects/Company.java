public class Company{
    public static void main(String[] args){
    Employee E1 = new Employee(1, "Smit", "Devops", 10000);
    E1.TotalPay();
    Employee E2 = new Employee(2, "Abhishek", "Developer", 5000);
    E2.TotalPay();
    Employee E3 = new Employee(3, "Harshil", "CloudSupport", 8000);
    E3.TotalPay();
    }
}
class Employee{
    int code;
    String name;
    String designation;
    double basicPay;
    // constructor
    Employee(int c, String n, String d, double b){
        code = c;
        name = n;
        designation = d;
        basicPay = b;
    }
    void TotalPay(){
        double HRA = 0.10 * basicPay;
        double DA = 0.45 * basicPay;
        double total = basicPay + HRA + DA;
        System.out.println("Employee code = "+code);
        System.out.println("Employee name = "+name);
        System.out.println("Employee designation = "+designation);
        System.out.println("Employee basic salary = "+basicPay);
        System.out.println("HRA = "+HRA);
        System.out.println("DA = "+DA);
         System.out.println("Total salary = "+total);
    }
}