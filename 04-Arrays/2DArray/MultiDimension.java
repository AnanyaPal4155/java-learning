import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        /*
         1 2 3
         4 5 6
         7 8 9 */


//    int[][] arr = new int[3][];// column is not mendontory to give
//
//    int[][] arr = {
//            {1, 2, 3}, //oth index
//            { 4, 5}, // Ist index
//            {4,5,6,7} //2nd index --> arr2D[2] = {5,7,8,9}   };
//
//    };

        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][2];
        System.out.println(arr.length); // no.of row

        // input
        for (int row = 0; row < arr.length; row++){

            // for each col in every row

            for(int col  = 0; col <arr[row].length; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        //output
        for (int row = 0; row < arr.length; row++){

            // for each col in every row

            for(int col  = 0; col <arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        //output
        for (int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }

        for(int[] a : arr){
            System.out.print(Arrays.toString(a));
        }

    }

}