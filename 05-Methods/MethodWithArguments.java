public class MethodWithArguments {

    public static void main(String[] args) {
        System.out.println("Hey");
        int a = 7;
        int b = 9;
        //		int ans=addition(a, b);
        //		System.out.println(ans);
        System.out.println(addition(a, b));
        System.out.println("Okay");

    }

    public static int addition(int a, int b){
        int c = a + b;
        return c + sub(c, a);
    }

    public static int sub(int a, int b){
        return a-b;
    }
}