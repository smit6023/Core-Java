public class thisKeywoard{
    public static void main(String[] args){
        complex num1 = new complex(2,4);
        complex num2 = new complex(4,1);
        num1.Print();
        num2.Print();
        System.out.println("adding two numbers");
        complex result = num1.add(num2);
        result.Print();
    }
}
class complex{
    int a, b;
    public complex(int a , int b){
        this.a = a;
        this.b = b;
    }
    void Print(){
        System.out.println(a+" + "+b+"i");
    }
    complex add(complex num2){
        return new complex(a+num2.a, b+num2.b);
    }
}