public class Rotate_Array {

    public static void Reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void rotate(int[] arr, int k) {

        k = k % arr.length;

        // 1. Reverse complete array
        Reverse(arr, 0, arr.length - 1);

        // 2. Reverse first k elements
        Reverse(arr, 0, k - 1);

        // 3. Reverse remaining elements
        Reverse(arr, k, arr.length - 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

        rotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
