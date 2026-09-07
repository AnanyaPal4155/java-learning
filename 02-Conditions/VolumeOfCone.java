import java.util.Scanner;

public class VolumeOfCone {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double r = sc.nextDouble();
        double h = sc.nextDouble();
        double pi = 3.14;

        if (r > 0 && h > 0) {
            double volume = (1.0 / 3) * pi * Math.pow(r, 2) * h;
            System.out.println(volume);
        } else {
            System.out.println("Invalid radius or height");
        }

        sc.close();
    }
}