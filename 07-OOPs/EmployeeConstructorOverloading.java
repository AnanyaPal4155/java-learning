public class EmployeeConstructorOverloading {

    String name;
    int age;
    String department;
    int salary;

    // Constructor 1
    EmployeeConstructorOverloading() {
        this("Unknown", 0);
    }

    // Constructor 2
    EmployeeConstructorOverloading(String name) {
        this.name = name;
    }

    // Constructor 3
    EmployeeConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor 4
    EmployeeConstructorOverloading(
            String name,
            int age,
            String department,
            int salary) {

        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        EmployeeConstructorOverloading e1 =
                new EmployeeConstructorOverloading();

        EmployeeConstructorOverloading e2 =
                new EmployeeConstructorOverloading("Ananya");

        EmployeeConstructorOverloading e3 =
                new EmployeeConstructorOverloading("Aditi", 24);

        EmployeeConstructorOverloading e4 =
                new EmployeeConstructorOverloading(
                        "Rahul", 22, "Computer Science", 40000);

        e1.display();
        e2.display();
        e3.display();
        e4.display();
    }
}