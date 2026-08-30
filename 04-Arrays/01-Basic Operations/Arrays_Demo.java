public class Arrays_Demo {
    public static void main(String[] args) {

        int[] arr = new int[5];
        // int arr[] = new int[5];

        System.out.println(arr);

        System.out.print(arr[2]);

        int[] other = arr; // both refer to the same array

        System.out.println(arr.length);

        arr[0] = 15;
        arr[1] = 2;
        arr[2] = 8;
        arr[3] = 6;


        System.out.println(other[0]);
        System.out.println(other[1]);
        System.out.println(other[2]);
        System.out.println(other[3]);
        System.out.println(other[4]);
    }
}