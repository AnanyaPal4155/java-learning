import java.util.Scanner;

public class PerimeterOfRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        if( side > 0){

            int  perimeter = 4*side;
            System.out.println(perimeter);
        }else {
            System.out.println("Invalid side");
        }
        sc.close();
    }
}