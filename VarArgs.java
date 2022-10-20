import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        f(1,2,5,5,5,8,85,47,2,5,635,59);
        multiple(12, 23, "Asda","asdf");

    }
    static void f(int ...v) {
        System.out.println(Arrays.toString(v));
        // use when you don't know how many inputs are going to be received
    }
    static void multiple(int a,int b, String ...v) {
        System.out.println(a+" "+b+Arrays.toString(v));
    }
}
