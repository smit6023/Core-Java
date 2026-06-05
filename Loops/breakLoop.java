public class breakLoop{
public static void main(String[] args){
for(int i=0; i<=20; i+=2){
System.out.println(i);
if(i>=10) break;
}

//similarly for while loop
int j = 1;
while(j<=5){
System.out.println(j);
j++;
if(j==3) break;
}
}
}