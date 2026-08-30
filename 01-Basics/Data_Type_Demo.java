import java.util.*;

public  class Data_Type_Demo {

    public static void main(String[] args) {

        byte b = (byte)(478);
        System.out.println(b);
        byte c = (byte) (350);
        System.out.println(c);

        short s = 5;
        int i = 5;
        long l = 57456_4578;
        l = i;

        Scanner sc = new Scanner(System.in);
        b = sc.nextByte();
        s = sc.nextShort();
        l = sc.nextLong();
        i = sc.nextInt();
    }
}