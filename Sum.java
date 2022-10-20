import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number:");
		int num = in.nextInt();
		sum(num);
	}
	static void sum(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum+=i;
		}
		System.out.println("Sum:"+sum);

	}
}
