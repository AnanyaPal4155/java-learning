import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double Length = sc.nextDouble();
        double Breadth = sc.nextDouble();

        if( Breadth > 0 && Length  >0){
            double Perimeter = 2 * ( Breadth + Length);
            System.out.println(Perimeter);
        }else {
            System.out.println("Invalid Breadth or Length");
        }

    }
}