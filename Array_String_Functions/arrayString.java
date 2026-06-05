public class arrayString{
public static void main(String[] args){
String names[] = {"Ram", "Harish", "Karan", "Mahesh"};
for (int i=0; i<names.length; i++){
System.out.println("name is "+names[i]);
}
// for - each loop

for (String name : names){
System.out.println("for each name is "+name);
}
}
}
