public class stringMethods{
public static void main(String[] args){
String name = "Smit Kapuriya";
String newName = "smit kapuriya";
int age = 25;
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.trim());
System.out.println("Carpet".startsWith("Car"));
System.out.println("Carpet".endsWith("Car"));
System.out.println(name.equals(newName));
System.out.println(name.equalsIgnoreCase(newName));
System.out.println(name.charAt(3));
System.out.println(name.replace("Smit","Mit"));
System.out.println(name.contains("Smit"));
System.out.println(name.substring(0,3));
System.out.println(name.split(" "));
System.out.println(name.isEmpty());
}
}