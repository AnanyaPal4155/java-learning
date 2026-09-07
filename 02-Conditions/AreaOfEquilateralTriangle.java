import java.util.Scanner;

public class AreaOfEquilateralTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int side = sc.nextInt();

         if( side > 0){

             double  area = Math.sqrt(3)/4 * Math.pow(side, 2);
             System.out.println(area);
         }else {
             System.out.println("Invalid side");
         }
         sc.close();
    }
}