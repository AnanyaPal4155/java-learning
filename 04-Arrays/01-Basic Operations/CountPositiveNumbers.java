import java.util.Scanner;

public class CountPositiveNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
            if(arr[i]>0)
                count++;
        }
        System.out.println(count);
    }
}
//Time = O(n)
//Extra Space = O(1)