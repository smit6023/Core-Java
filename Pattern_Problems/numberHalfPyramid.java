public class numberHalfPyramid{
public static void main(String[] args){
for (int i=1; i<=4; i++){
for (int j=1; j<=4-i; j++){
System.out.print(" ");
}
int num =1;
for (int k=1; k<=i; k++){
System.out.print(k+" ");
num++;
}
System.out.println();
}
}
}