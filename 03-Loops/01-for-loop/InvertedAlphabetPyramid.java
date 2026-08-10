public class InvertedAlphabetPyramid{
    public static void main(String[] args){
        int n=5;
        for(int i = n; i>=1; i--){
            for(int space = 1; space <= n - i; space++){
                System.out.print(" ");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}