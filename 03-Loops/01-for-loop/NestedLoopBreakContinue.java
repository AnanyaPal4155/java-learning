public class NestedLoopBreakContinue {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 4; j++) {

                if (j == 2) {
                    continue;
                }

                if (i == 3 && j == 3) {
                    break;
                }

                System.out.println(i + " " + j);
            }
        }
    }
}

