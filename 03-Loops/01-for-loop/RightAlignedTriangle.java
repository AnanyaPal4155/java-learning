public class RightAlignedTriangle{
    public static void main(String[] args){
         int n= 5;
        for(int i = 1 ; i <=n ; i++){

            // Spaces
            for(int space = 1 ; space<=n-i ; space++){
                System.out.print(" ");
            }

            // Stars
            for(int j = 1 ; j<=i ; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

// Time Complexity  = O(n²) ✅
//Space Complexity = O(1)