import java.util.Scanner;

public class PerimeterOfParallelogram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        if( base > 0 && height >0){
            double Perimeter = 2 * ( base + height);
            System.out.println(Perimeter);
        }else {
            System.out.println("Invalid base or height");
        }

    }
}