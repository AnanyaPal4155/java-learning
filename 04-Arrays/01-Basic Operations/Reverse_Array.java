public class Reverse_Array {

    public static void main(String[] args) {

        int [] arr = {2,4,4,5,6,7,8,3,9,1};
        System.out.println(arr);
        Reverse(arr);
        for (int start = 0; start< arr.length; start++) {
            System.out.print(arr[start] + " ");
        }

    }

    public static  void Reverse(int[] arr){
      int start = 0;
      int end = arr.length-1;
      while (start< end){
          int temp = arr[start];
              arr[start] = arr[end];
              arr[end] = temp;

              start++;
              end--;
      }
    }
}