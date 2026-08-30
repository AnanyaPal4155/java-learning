public class Prefix_Suffix_Sum_Including_Index {

    public static void main(String[] args) {

        int[] arr = {3, 5, 6, 2, 4, 16, 7, 8, 9};

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Prefix_Suffix_Sum(arr);
    }

    public static void Prefix_Suffix_Sum(int[] arr) {

        int n = arr.length;

        // Prefix Sum
        int[] left = new int[n];

        left[0] = arr[0];

        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + arr[i];
        }

        System.out.print("Prefix Sum: ");
        for (int i = 0; i < n; i++) {
            System.out.print(left[i] + " ");
        }

        System.out.println();

        // Suffix Sum
        int[] right = new int[n];

        right[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + arr[i];
        }

        System.out.print("Suffix Sum: ");
        for (int i = 0; i < n; i++) {
            System.out.print(right[i] + " ");
        }
    }
}