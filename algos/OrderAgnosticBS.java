package algos;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-26,-19,-15,-13,-9,-6,-2,0,2,3,4,15,16,18,22,45,87};
        int[] arr = {87, 45, 22, 18, 16, 15, 4, 3, 2, 0, -2, -6, -9, -13, -15, -19, -26};
        int target = 15;
        int ans = orderagnosticbs(arr,target);
        System.out.println(ans);

    }
    static int orderagnosticbs(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] <arr[end];
        while (start<=end) {
            int mid = start + (end - start)/2;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
    
                } else if (target > arr[mid]) {
                    start = mid +1;
    
                } else  {
                    return mid;
                }
            }
            else {
                if (target > arr[mid]) {
                    end = mid - 1;
    
                } else if (target < arr[mid]) {
                    start = mid +1;
    
                } else  {
                    return mid;
                }
            }

        }
        return -1;
    }

}