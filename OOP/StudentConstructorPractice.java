public class StudentConstructorPractice {
      String name;
      int age;
      String course;

      StudentConstructorPractice (String name , int age , String course){
            this.name = name;
            this.age = age;
            this.course =course;
      }
     void display() {
         System.out.print(name);
         System.out.print(age);
         System.out.println(course);

     }

    public static void main(String[] args) {

          StudentConstructorPractice s1 = new StudentConstructorPractice("Ananya ", 20 ," Java");
          StudentConstructorPractice s2 = new StudentConstructorPractice("Rahul ", 22," DSA");

          s1.display();
          s2.display();
    }
}