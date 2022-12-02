import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int[] arr = {1, 8, 97, 78, 45, 65,5};
        int[] arr = {-26,-19,-15,-13,-9,-6,-2,0,2,3,4,15,16,18,22,45,87};
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
        
    }
}
