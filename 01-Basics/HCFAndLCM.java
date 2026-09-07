import java.util.Scanner;

public class HCFAndLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int originalA = a;
        int originalB = b;

        while( b !=0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        int hcf = a;
        int lcm  = (originalA * originalB) / hcf;

        System.out.println("HCF = " + hcf);
        System.out.println("LCM = " + lcm);
    }
}