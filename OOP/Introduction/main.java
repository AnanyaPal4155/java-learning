
import java.sql.Struct;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student Ananya
//        kunal = new Student();

        Students Ananya = new Students(13,"Ananya",88.5f  );
        Students rahul = new Students();

//        Ananya.rno = 13;
//        Ananya.name = "Ananya";
//        Ananya.marks = 88.5f;


//        kunal.changeName("Shoe lover");
             Ananya.changeName("shoe lover");
            Ananya.greeting();

//
        System.out.println(Ananya.rno);
        System.out.println(Ananya.name);
        System.out.println(Ananya.marks);

//        System.out.println(rahul.rno);
//        System.out.println(rahul.name);
//        System.out.println(rahul.marks);

//

    }
}

// create a class
// for every single student
class Students {

    int rno;
    String name;
    float marks = 90;


    void greeting(){
        System.out.println("Hello my name is " + name);
    }

    void changeName(String newName){
        name = newName;
    }

    // we need a way to add the value of the above
    // propeties object by object
    //we need one word to access every object

    Students (){
        // this how we call a constructor from another constructor
        // internally : new Student(13, "default person", 100.0f);
        this(13, "default person", 100.0f);
    }

    Students (int roll, String name, float marks ) {

        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }



}