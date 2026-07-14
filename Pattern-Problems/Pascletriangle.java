class Pascletriangle {
    public static void main(String[] args){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            int num =1;
            for (int j=1; j<=i; j++ ){
                System.out.print(num + " ");
                num = num * (i-j)/j;
            }
            System.out.println();
        }
    }
}