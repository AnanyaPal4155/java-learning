import java.util.ArrayList;

public class ArrayListCart {

    public static void main(String[] args) {

        ArrayList<Integer> prices = new ArrayList<>();


        prices.add(500);
        prices.add(1200);
        prices.add(800);
        prices.add(2500);
        prices.add(300);

        int count = 0;

        for( int price : prices ){

           if (price > 1000){
               count++;
           }

        }
        System.out.println(count);
    }
}