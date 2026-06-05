public class problemArray{
public static void main(String[] args){
int numbers[] = {23,12,6,7,15,3,2,56};
int sum = 0;
for (int number : numbers){
sum += number;
}
System.out.println("Sum is "+sum);

// find minimum number among array
int min = 56;
for (int number : numbers){
if(number < min){
min = number;
}
}
System.out.println("minimum is "+min);

// find maximum number among array
int max = 0;
for (int number : numbers){
if (number > max){
max = number;
}
}
System.out.println("Maximum number is "+max);
}
}