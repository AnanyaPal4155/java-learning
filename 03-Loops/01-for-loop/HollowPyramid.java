public class HollowPyramid{
    public static void main(String[] args){
        int n = 5 ;
        for(int i= 1; i<=n; i++){

            for(int space = 1 ; space<=n-i;space++){
                System.out.print(" ");

            }

            for(int j= 1; j<=n; j++){
                if(i==1|| i==3 || i==4 ){
                    System.out.print("*");

                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}