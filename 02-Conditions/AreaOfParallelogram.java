import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        if (base > 0 && height > 0) {
            double area = base * height;
            System.out.println(area);
        } else {

            System.out.println("Invalid base or height");
        }
    }
}