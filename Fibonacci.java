import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter how many fibos to print: ");
        int choice = in.nextInt();
        printFibo(choice);


    }
    static void printFibo(int lim) {
        int count = 2;
        long a = 0;
        long b = 1;
        while (count <= lim) {
            System.out.println(a);
            long temp = b;
            b = b+a;
            a = temp;
            count++;
            
        }
    }
}
