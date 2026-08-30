public class ClassAndObject {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is  " + age);
    }

    public static void main(String[] args) {

        ClassAndObject student1 = new ClassAndObject();
        ClassAndObject student2 = new ClassAndObject();
        ClassAndObject student3 = null;
        student1.name = "Ananya";
        student2.name = "Rahul";
        student1.age = 20;
        student2.age = 22;

        student2 = student1;

        student2.age = 30;



        student1.introduce();
        student2.introduce();

        System.out.println(student3);   //  null
        System.out.println(student3.name);   //  NullPointerException
        student3.introduce(); // NullPointerException

    }
}