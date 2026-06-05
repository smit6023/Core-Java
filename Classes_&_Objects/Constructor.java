public class Constructor{
    public static void main(String[] args){
        Complex c1 = new Complex(2,3);
        Complex c2 = new Complex(4,5);
        c1.print();
        c2.print();
    }
}
class Complex{
    int a, b;
    public Complex(int real, int imaginary){
        a = real;
        b = imaginary;
    }
    void print(){
        System.out.println(a+" +"+b+"i");
    }
}