import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int value  =sc.nextInt();
            sum += value;
        }
        System.out.println("Sum of arr :" + ' ' + sum);

    }
}

//Time  = O(n)
//Space = O(n)  → array
//Extra space = O(1)