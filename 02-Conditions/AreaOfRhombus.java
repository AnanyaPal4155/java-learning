import java.util.Scanner;

public class AreaOfRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();

        if (d1 > 0 && d2 > 0) {
            double area = 0.5 * d1* d2;
            System.out.println(area);
        } else {

            System.out.println("Invalid d1 or d2");
        }


    }
}