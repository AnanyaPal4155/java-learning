//Take name as input and print a greeting message for

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("greeting  " + name);

        if(name.equals("Ananya")){
            System.out.println("greeting  " + name);
        }

    }
}