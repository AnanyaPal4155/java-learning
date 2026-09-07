import java.util.Scanner;
public class VolumeOfPrism {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double baseArea = sc.nextDouble();
        double height = sc.nextDouble();

        if (baseArea > 0 && height > 0) {
            double volume = baseArea * height;
            System.out.println(volume);
        } else {
            System.out.println("Invalid base area or height");
        }

        sc.close();
    }

}