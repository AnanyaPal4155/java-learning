import java.util.ArrayList;
public class ArrayListOperations {
    public static void main(String[] args) {

       ArrayList<Integer> numbers = new ArrayList<>();


        // 1. ADD
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("After add: " + numbers);


        // 2. GET
        System.out.println("Get index 1: " + numbers.get(1));


        // 3. SET
        numbers.set(1, 100);

        System.out.println("After set: " + numbers);


        // 4. REMOVE
        numbers.remove(1);

        System.out.println("After remove index 1: " + numbers);

        //5 . Size

        System.out.println("Size of list: " + numbers.size());

        //6. Contains : value presentr or not

        System.out.println("Value present: " + numbers.contains(30));

        //7. Index

        System.out.println("Value present at index: " + numbers.indexOf(30));

        // 8. Empty check

        System.out.println("List is empty or not " + numbers.isEmpty());

        // 9.Clear : Remove all the element
        numbers.clear();
        System.out.println("Clear all the element" + numbers );

        //1n

    }
}