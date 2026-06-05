public class compareString{
public static void main(String[] args){
String name = "Smit";
String sameName = "SMit";
String newname = new String("SMIT");
if (name.equals(sameName)){
System.out.println("Both are same");
}
else{
System.out.println("Both are not same");
}
if (name.equalsIgnoreCase(newname)){
System.out.println("Both are same");
}
else{
System.out.println("Both are not same");
}
}
}