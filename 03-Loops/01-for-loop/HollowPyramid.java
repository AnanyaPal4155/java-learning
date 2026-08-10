public class HollowPyramid{
    public static void main(String[] args){
        int n = 10 ;
        for(int i= 1; i<=n; i++){

            // Print spaces
            for(int space = 1 ; space<=n-i; space++){
                System.out.print(" ");

            }

            // Print stars and spaces
            for (int j = 1; j <= i; j++) {

                if (i == n || j == 1 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}