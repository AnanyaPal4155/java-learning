import java.util.Arrays;
import java.util.Scanner;

public class forEachloop {

    public static void main(String[] args) {


        // array of Primitive
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        // input using   for loops
        for (int i = 0; i < arr.length ; i++) {
               arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }

        // it Directly convert the array element  in String
        System.out.println(Arrays.toString(arr));
        //enhanced for loop

        for(int num : arr){ // for every element in array, print the elment
            System.out.print(num + " "); // here num represent elements of the array
        }

        // array of objects
        String[] str = new String[4];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Ananya";
        System.out.println(Arrays.toString(str));
    }
}