import java.util.Scanner;

public class Palindromenum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = in.nextInt();
		boolean ans = isPalindrome(num);
		if (ans) {
			System.out.println("Number is Palindrome");
		}
		else {
			System.out.println("Number is not Palindrome");
		}
	}
	static boolean isPalindrome(int n) {
		int original = n;
		int rev = 0;
		while (n>0) {
			int rem = n%10;
			// rev+=rem;
			rev = (rev*10)+rem;
			n = n/10;
		}
		return original==rev;

	}
}
