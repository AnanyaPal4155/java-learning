import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double r  = sc.nextInt();
        double pi = 3.14;

        if(r>0){
            double perimeter  = 2* pi* r;
            System.out.println(perimeter);
        }
        else {
            System.out.println("Invalid radius");
        }


    }
}