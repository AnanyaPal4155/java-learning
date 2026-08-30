public class ConstructorBasics {

    String name;
    int age;


    ConstructorBasics(){
        System.out.println("Constructor called ");
    }

    public static void main(String[] args) {

        ConstructorBasics student1 = new ConstructorBasics();
    }
}