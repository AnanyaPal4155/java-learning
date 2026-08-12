import java.util.Scanner;

public class CountEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
          int  value =sc.nextInt();
            if(value%2 == 0){
                count++;
            }

        }
        System.out.println(count);

    }
}
//Time = O(n)
//Space = O(n)  ← array
//Extra Space = O(1)