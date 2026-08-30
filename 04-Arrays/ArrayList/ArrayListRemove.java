import java.util.ArrayList;

public class ArrayListRemove {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Before: " + numbers);

        numbers.remove(1);

        System.out.println("After: " + numbers);
    }
}