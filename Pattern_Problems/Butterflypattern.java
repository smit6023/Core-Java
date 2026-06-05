    class Butterflypattern {
    public static void main(String[] args) {
        // upper half
        for (int i=1; i<=4; i++){
            // first part
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // for space 
            int spaces = 2*(4-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            // second part
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half 
        for (int i=4; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int spaces = 2*(4-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}