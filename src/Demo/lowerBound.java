/* lower bound is search used to found first position where the element>=target*/
package Demo;

public class lowerBound {	
	static int lowerBound(int[] arr, int target) {
		int left = 0;
		int right = arr.length;
		
		while (left < right) {
			int mid = left + (right - left) / 2;
			
			if (arr[mid] >= target) {
				right = mid;
			}
			
			else {
				left = mid + 1;
			}
		}
		return left;
	}
	
	public static void main(String[] args) {
		int[] arr = {10, 20, 20, 20, 30, 40, 50};
		
		int target = 50;
		
		int index = lowerBound(arr, target);
		
		System.out.println("Lower Bound: " + index);
	}
}