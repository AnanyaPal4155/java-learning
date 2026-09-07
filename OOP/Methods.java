public class Methods {

    static void sayHello() {
        System.out.println("Hello Ananya");
    }
    static  void printWelcome() {
        System.out.println("Welcome to Java");
    }

    static int getNumber(){
        return 10;
    }
    static int add(int a, int b) {
        return a + b;
    }

    static double addBalance(double balance, double deposit) {
        return balance + deposit;
    }



    static boolean isEven(int number){
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }



        public static void main(String[] args) {
            BankAccount a1 = new BankAccount();
            BankAccount a2 = new BankAccount();

            a1.balance = 5000;
            a2.balance = 10000;

            a1.deposit(2000);
            a2.deposit(3000);
            a1.deposit(500);

            System.out.println(a1.balance);
            System.out.println(a2.balance);



        sayHello();
        sayHello();
        printWelcome();
        printWelcome();
        printWelcome();

        System.out.println(getNumber());

            int result = add(5, 3);
            double newBalance = addBalance(5000, 2000);
             boolean Answer = isEven(45);

            System.out.println(result);
            System.out.println(newBalance);
            System.out.println(Answer);

    }

}