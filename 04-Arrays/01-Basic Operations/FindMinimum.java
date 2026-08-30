import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {

        int[] arr = {4,6, 7, 4,9,1};

        int min = arr[0];

        for (int i = 1; i < arr.length ; i++) {

            if(arr[i]< min){
                min  = arr[i];
            }
        }
        System.out.println(min);
    }
}

