/*write a java program for binary search in a given sorted array the array 10,20,30,40,50,60,70,80. and targeted value is 60*/
package Demo;

public class Binary {
	public static void main (String[] args) {
		int[] arr = {10,20,30,40,50,60,70,80};
		int target = 60;
		int left= 0;
		int right = arr.length-1;
		while( left <= right) {
			 int mid = left + (right - left)/2;
			 if (arr[mid] == target) {
				 System.out.println("Element found at index:"+mid);
				 break;
			 }
			 if (arr[mid] < target) {
				 left = mid+1;
			 }else {
				 right=mid-1;
			 }
		}
		
	}
}

