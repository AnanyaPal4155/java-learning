public class checkPrime {

    public static void main(String[] args) {

        int number = 7;
        int c = 2;

        while(c<number){

            if(number% c == 0){
                System.out.println("not prime ");
                break;
            }

            c++;

        }

        if ( c == number){
            System.out.println(" prime ");
        }
    }
}