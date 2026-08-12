public class DoWhileReverseNumberEdgeCase {

    public static void main(String[] args) {

        int number = 0;
        int reverse = 0;

        do {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        } while (number > 0);

        System.out.println(reverse);
    }
}
// With the condition (number > 0), for 0 and negative values,
// the do-while body executes exactly once.