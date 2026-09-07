public class WrapperExample {

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

        // now convert int in object ingeter

        Integer a = 10;
        Integer b = 20;
         swap(a, b);


        swap(a, b);
        System.out.println(a + "    " + b);


        // when a non primitive is final you cannot resign;
        final A Ananya = new A(" Kunal Kushwaha");
        Ananya.name = "other name";
//        Ananya = new A("new object");
//
//        A rahul = new A("Rahul sharma");
//        Ananya = rahul;
    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
    final int num = 10;
    String name;

    public A (String name){
        this.name = name;
    }
}