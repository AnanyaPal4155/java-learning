public class WhileLoopExtractDigits {

    public static void main(String[] args) {

        int number = 12345;

        while (number > 0) {
            int digit = number % 10;
            System.out.println(digit);
            number = number / 10;
        }
    }
}