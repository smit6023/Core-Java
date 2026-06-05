public class Variables {
public static void main(String[] args){
byte a = 10;
int b = a;
// implict type conversion
System.out.println(b); 

int c = 10;
byte d = (byte)c;
// explicit type conversion
System.out.println(d);
}
}