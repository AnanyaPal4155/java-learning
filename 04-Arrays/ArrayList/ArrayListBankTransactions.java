import java.util.ArrayList;
public class ArrayListBankTransactions {
    public static void main(String[] args) {

        ArrayList<Integer> transactions = new ArrayList<>();

        transactions.add(1000);
        transactions.add(-500);
        transactions.add(2000);
        transactions.add(-300);
        transactions.add(1500);
         int sum = 0;

         for( int transaction : transactions ){

             sum = sum + transaction;

         }

//        for (int i = 0; i < transactions.size(); i++) {
//
//            sum = sum + transactions.get(i);
//        }
        System.out.println(sum);

    }
}