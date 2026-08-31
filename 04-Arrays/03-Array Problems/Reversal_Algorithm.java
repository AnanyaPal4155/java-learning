public class Reversal_Algorithm {

    public static void Reverse(int[] arr, int i , int j ){
        while(i < j){
            int temp = arr[i];
             arr[i] = arr[j];
             arr[j] = temp;

             i++;
             j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        Reverse(arr, 0, arr.length - 1);
        Reverse(arr, 0, k-1);
        Reverse(arr, k, arr.length-1);

        for (int x : arr){
            System.out.print(x + " ");
        }
    }
}