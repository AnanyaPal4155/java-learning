public  class ConstructorOverloading {
    String name;
    int age;

    // Constructor 1
    ConstructorOverloading(){
        name = "Unknown";
        age = 0;
    }
    // Constructor 2
    ConstructorOverloading(String name) {
        this.name = name;
        age = 0;
    }
    // Constructor 3
    ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
    }

     void display(){
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
     }

    public static void main(String[] args) {
        ConstructorOverloading s1 =
                new ConstructorOverloading();

        ConstructorOverloading s2 =
                new ConstructorOverloading("Ananya");

        ConstructorOverloading s3 =
                new ConstructorOverloading("Rahul", 22);

        s1.display();
        s2.display();
        s3.display();
    }

}