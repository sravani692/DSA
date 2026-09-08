/*it is step by step used to find particular element(called the target) a collection of array list or a data set
 * uses of searching algorithm
 * 1. finding the data quickly
 * 2.local files in computer system
 * 3.such information on website and search engine and retrieving data from  database
 * linear search element checks element one by one and it is used for small or unsorted data */
package Demo;

public class SearchingAlgorithm {
	static int linearSearch(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	 public static void main(String[] args) {
		 int[] arr= {10,25,7,42,18,30};
		 int target = 42;
		 int result = linearSearch(arr, target);
		 if (result != -1)
			 System.out.println("Found at index:" + result);
		 else
			 System.out.println("Not found");
	 }
}
