import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int j =1;
		while (j==1){
			System.out.print("Enter number:");
			int num = in.nextInt();
			int fac = factorial(num);
			System.out.println("Factorial of "+num+" is "+fac);
		}
		
	}
	static int factorial(int n) {
		int fac = 1;		
		for(int i=1;i<=n;i++) {
			fac = fac*i;

		}
		return fac;
	}
}
