import sun.font.FontRunIterator;

import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);


        for (int i = 0; i < numbers.size(); i++) {
            numbers.remove(1);
            numbers.remove(Integer.valueOf(20));
            System.out.println(numbers.get(i));
        }

        for( int number : numbers){
            System.out.println(number);
        }
    }

}