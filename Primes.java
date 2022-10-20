import java.util.Scanner;

public class Primes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number range:");
        int upnum = in.nextInt();
        int downnum = in.nextInt();
        System.out.println("Primes:");
        findPrimes(upnum,downnum);        
    }
    static void findPrimes(int u, int d) {
        for(int i = u;i<=d;i++) {
            boolean check = isPrime(i);
            if (check) {
                System.out.println(i);
            }
        }
    }
    static boolean isPrime(int n) {
		if (n<=1) {
			return false;
		}
		int c = 2;
		while (c * c <= n) {
			if (n % c ==0) {
				return false;
			}
			c++;
		}
		return c * c > n;
	}
}
