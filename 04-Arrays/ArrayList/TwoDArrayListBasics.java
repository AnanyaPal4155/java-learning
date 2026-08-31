import java.util.ArrayList;

public class TwoDArrayListBasics {

    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> numbers = new ArrayList<>();

        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(10);
        row1.add(20);
        row1.add(30);

        ArrayList<Integer> row2 = new ArrayList<>();
        row2.add(40);
        row2.add(50);
        row2.add(60);

        ArrayList<Integer> row3 = new ArrayList<>();
        row3.add(70);
        row3.add(80);
        row3.add(90);

        numbers.add(row1);
        numbers.add(row2);
        numbers.add(row3);

        System.out.println(numbers);
        // get Specific element --- numbers.get(row).get(column)
        System.out.println(numbers.get(1).get(2));

        //Number of rows
        System.out.println(numbers.size());

        //length of specific row
        System.out.println(numbers.get(1).size());

        // add element in ArrayList
        numbers.get(0).add(40);
        System.out.println(numbers);

        // Update
        numbers.get(1).set(1, 500);
        System.out.println(numbers);

        // REMOVE
//        numbers.get(0).remove(0);
//        System.out.println(numbers);

        for (int i = 0; i < numbers.size(); i++) {

            for (int j = 0; j < numbers.get(i).size(); j++) {

                System.out.print(numbers.get(i).get(j) + " ");
            }

            System.out.println();
        }
    }

}