import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiArraylist {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<ArrayList<Integer>> list = new ArrayList<>(); 
		for (int i = 0;i<3;i++) {
			list.add(new ArrayList<>());
		}
		for (int row=0;row<3;row++) {
			for (int col=0;col<3;col++) {
				list.get(row).add(in.nextInt());
			}
		}
		System.out.println(list);
	}
}
