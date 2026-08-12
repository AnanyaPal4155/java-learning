import java.util.Scanner;

public class FindMinimum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = sc.nextInt();  // 1st input

        for (int i = 1; i < n; i++) {
            int value = sc.nextInt();  // next n inputs
            if(value < min){
                min = value;
            }
        }
        System.out.println(min);
    }
}

