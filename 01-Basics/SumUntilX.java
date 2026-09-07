import  java.util.*;
public class SumUntilX {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true){

            String input = sc.next();
            if (input.equals("x")) {
                break;
            }

            int number = Integer.parseInt(input);
             sum = sum + number;
        }

        System.out.println(sum);
    }
}