import java.util.Scanner;

public class RupeesToUSD {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int Rupees = sc.nextInt();

        float USD = Rupees / 83.0f;

        System.out.println(USD);

    }
}