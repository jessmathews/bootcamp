import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Mode?:");
			System.out.println("1. Armstrong Checker");
			System.out.println("2. 3-digit Armstrong Numbers");
			int opt = in.nextInt();
			if (opt == 1) {
				checkArmstrong();
			}
			else if (opt == 2 ) {
				printArmstrong();
			}
		}
		
	}
	static void printArmstrong() {
		for (int i = 100; i<=999;i++) {
			if (isArmstrong(i)) {
				System.out.println(i);
			}
		}
	}
	static void checkArmstrong() {
		System.out.print("Enter a 3 digit number: ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean ans = isArmstrong(n);
		System.out.println(ans);

	}	
	static boolean isArmstrong(int n) {
		int sum=0;
		int original = n;
		int rem;
		while (n > 0) {
			rem = n %10;
			sum+=(rem*rem*rem);
			n = n/10;
		}
		return sum==original;
				
	}
}
