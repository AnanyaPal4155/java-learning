import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         double  base = sc.nextInt();
         double  height = sc.nextDouble();

         if (base > 0 && height > 0){

             double area = 0.5 * height * base;
             System.out.println(area);
         }
         else {
             System.out.println("Invalid  base or height");
         }
        sc.close();
    }
}
