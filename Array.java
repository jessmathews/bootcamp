import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5]; //size is specified
		int[] nums = {2,5,8,45,6}; //directly given values
		int[] rrs; //declaring ref variable in stack
		rrs = new int[5]; //intialising in heap memory
		for (int i=0;i<rrs.length;i++) {
			rrs[i] = in.nextInt();
		}
		for (int num : rrs) {
			System.out.println(num); // this is a foreach loop, num refers to each element
		}
		System.out.println(Arrays.toString(rrs));
		// int[][] dar = new int[3][];
		
		int[][] dar = {
		{85,2,47},
		{23,75},
		{72,83,59}
	};
		for (int row=0 ; row < dar.length;row++) {
			for (int col=0;col<dar[row].length;col++) {
				// arr[row][col] = in.nextInt();
				System.out.print(dar[row][col]+" ");
			}
			System.out.println();
		}
		ArrayList<Integer> sizarr = new ArrayList<>(); //when you don't know what the size of the array is
		for (int i = 0; i<100;i++) {
			sizarr.add(i);
		}
		sizarr.set(2, 134);
	}
}
