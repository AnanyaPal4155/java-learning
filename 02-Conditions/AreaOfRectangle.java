import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double length = sc.nextDouble();
        double breadth = sc.nextDouble();

        if (length > 0 && breadth > 0) {
            double area = length * breadth;
            System.out.println(area);
        } else {
            System.out.println("Invalid length or breadth");
        }

        sc.close();
    }
}
