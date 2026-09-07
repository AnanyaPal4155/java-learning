class Student {

    String name = "Ananya";
    int age = 20;

    void show() {
        System.out.println(name + " " + age);
    }
}

public class secondMethodClassAndObject {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();

        s2.name = "Rahul";
        s2.age = 22;

        s1.show();
        s2.show();
    }
}