public class stringBasic{
public static void main(String[] args){
String name = "Smit";
String sameName = "Smit";
String newName = new String("Smit");
System.out.println(name);
System.out.println(sameName);
System.out.println(newName);

// comparing strings
if (name == sameName){
System.out.println("Both are same");
}
if (name == newName){
System.out.println("Both are same");
}
else{
System.out.println("Both are not same");
}
}
}