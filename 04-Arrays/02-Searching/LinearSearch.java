public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 20, 40, 20};
        int target = 90;

        // Q1: Target present or not
        boolean found = false;

        // Q2: Target ka index
        int index = -1;

        // Q3: First occurrence
        int first = -1;

        // Q4: Last occurrence
        int last = -1;

        // Q5: Count occurrences
        int count = 0;


        // ONE traversal
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {

                // Q1
                found = true;

                // Q2
                if (index == -1) {
                    index = i;
                }

                // Q3
                if (first == -1) {
                    first = i;
                }

                // Q4
                last = i;

                // Q5
                count++;
            }
        }


        // Results
        System.out.println("Present = " + found);
        System.out.println("Index = " + index);
        System.out.println("First occurrence = " + first);
        System.out.println("Last occurrence = " + last);
        System.out.println("Count = " + count);
    }
}

//Time complexity = O(n0