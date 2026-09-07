public class ParameterizedConstructor {

    String name;
    int age;

    ParameterizedConstructor(String name, int age){

        this.name = name;
        this.age = age ;


    }

    public static void main(String[] args) {
        ParameterizedConstructor Student1 = new ParameterizedConstructor("Ananya ", 20);
        ParameterizedConstructor Student2 = new ParameterizedConstructor("Rahul ", 22);
        ParameterizedConstructor Student3 = new ParameterizedConstructor("Neha ", 21);


        System.out.print(Student1.name);
        System.out.println(Student1.age);


        System.out.print(Student2.name);
        System.out.println(Student2.age);

    }
}
