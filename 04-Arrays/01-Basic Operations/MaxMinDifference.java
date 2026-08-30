import java.util.Scanner;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int max = sc.nextInt();
        int min = max;

        for (int i = 1; i <n ; i++) {
            int value = sc.nextInt();
            if( value > max){
                max = value ;
            }
            if( value < min){
                min = value;
            }
        }
        int difference = max - min;
        System.out.println(difference);

    }
}