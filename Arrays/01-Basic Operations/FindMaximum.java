import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // first number  initially maximum
        int max = sc.nextInt();

        for (int i = 1; i < n; i++) {

            int value = sc.nextInt();

            if (value > max) {
                max = value;
            }
        }

        System.out.println(max);
    }
}