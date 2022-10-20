import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 numbers:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        boolean ans = isPythagorean(a,b,c);
        if (ans) {
            System.out.println("This is a Pythagorean Triplet");
        }
        else {
            System.out.println("This is not a Pythagorean Triplet");
        }
    }
    static boolean isPythagorean(int a,int b, int c) {
        if ((c*c)==(a*a)+(b*b)) {
            return true;
        }
        else {
            return false;
        }

    }
}
