import java.util.*;
public class findx{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] numbers = new int[rows][columns];

        // input

        for (int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
         // output

         for (int i=0; i<rows; i++){
            for (int j=0; j<columns; j++){
                if(numbers[i][j]==x){
                    System.out.print("x found at location:" + i+ " " + j + " ");
                }
            }
            System.out.println();
         }
    }
}