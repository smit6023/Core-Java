import java.util.*;
public class transpose{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];

        // input

        for (int i=0; i<N; i++){
            for (int j=0; j<M; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
         System.out.println("The Transpose of Matrix is :");

        // output

        for (int j=0; j<M ;j++){
            for (int i=0; i<N; i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}