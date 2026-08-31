import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class BankWithdrawalAnalysis {
    public static void main(String[] args) {

        ArrayList<Integer> transactions  = new ArrayList<>();

        transactions.add(5000);
        transactions.add(-2000);
        transactions.add(-1500);
        transactions.add(3000);
        transactions.add(-700);
        transactions.add(1000);
        int depositSum = 0;
        int withdrawalSum =0;

        for (int transaction : transactions){

            if(transaction > 0){

                depositSum = depositSum + transaction;
            }


            if(transaction < 0){

                withdrawalSum = withdrawalSum + Math.abs(transaction);
            }

        }
        System.out.println("Total Deposits:"  + depositSum );
        System.out.println("Total Withdrawals:"  + withdrawalSum );

    }
}