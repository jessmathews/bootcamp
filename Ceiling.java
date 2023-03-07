public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {12,14,16,18,24,27,29};
        int num = 28;
        System.out.println("Ceiling of the number is:");
        int ceiling = findCeiling(arr,num);
        System.out.println(arr[ceiling]);


        
    }
    static int findCeiling(int[] arr,int target) {
        int s = 0;
        int e = arr.length -1;
        while (s < e) {
            int mid = (s + e)/2;
            if (target > arr[mid]) {
                s = mid +1;
            }
            else if  (target < arr[mid]) {
                e = mid -1;

            }
            else {
                return mid;
            }
            }
            return s;
        }
    }
