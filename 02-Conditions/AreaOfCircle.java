import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         int  r = sc.nextInt();
         double pi = 3.14;

         if(r>0){
             double area = pi* Math.pow(r, 2);
             System.out.println(area);
         }
         else {
             System.out.println("Invalid radius");
         }

    }
}