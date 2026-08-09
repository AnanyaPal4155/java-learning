public class ForLoopSum{
    public static void main(String[] args){
         int sum = 0;
        for (int i=1 ; i<=5; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

//Time Complexity : O(n)
//Space Complexity : O(1)