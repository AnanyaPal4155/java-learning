public class Arrays_Swap2 {

    public static void main(String[] args) {

        int[] arr = { 4, 5, 5, 7, 8};

        System.out.println(arr[0] + " " + arr[1]);// 2 3
        swap(arr, 0 , 1);
        System.out.println(arr[0] + " " + arr[1]);
    }

    public static  void swap(int[] arr, int i, int  j){

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}