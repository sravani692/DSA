package Demo;
import java.util.Arrays;
public class Binarysearchlow {
	    public static int binarySearch(int[] arr, int key) {
	        int low = 0;
	        int high = arr.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (arr[mid] == key) {
	                return mid;
	            } else if (arr[mid] < key) {
	                low = mid + 1;
	            } else {
	                high = mid - 1;
	            }
	        }

	        return -1;
	    }

	    public static void main(String[] args) {

	        int[] arr = {50, 10, 40, 20, 70, 30, 60};
	        int key = 40;

	        Arrays.sort(arr);
	        int result = binarySearch(arr, key);

	        System.out.println("Sorted Array: " + Arrays.toString(arr));

	        if (result != -1) {
	            System.out.println("Element " + key + " found at index: " + result);
	        } else {
	            System.out.println("Element " + key + " not found");
	        }
	     }
}
