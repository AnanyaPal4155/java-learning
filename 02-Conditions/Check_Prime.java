public class Check_Prime {

    public static void main(String[] args) {

        int n = 9;
        int count = 0;

        for (int i = 2; i < n; i++) {

            if(n%2==0){
                count ++;
            }
        }
        if(count >=1){
            System.out.println("Prime number");
        }else {
            System.out.println("Not Prime number");}

    }
}