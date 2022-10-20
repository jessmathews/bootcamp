package algos;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 34, 52, 46, 78, 89};
        int target = 46;
        linearSearch(arr, target);
        
    }
    static boolean linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i< arr.length;i++) {
            if (arr[i] == target) {
                System.out.println("Index: "+i);
                
            }
        }
        return false;
    }
}
