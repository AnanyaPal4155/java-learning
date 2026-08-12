public class DoWhileReverseNegative {

    public static void main(String[] args) {

        int number = -12345;
        int reverse = 0;

        int sign = number < 0 ? -1 : 1;
        number = Math.abs(number);

        do {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        } while (number > 0);

        reverse = reverse * sign;
        System.out.println(reverse);
    }
}