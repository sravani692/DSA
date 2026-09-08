/*The Fibonacci series is a sequence of numbers where each number is found by adding together the two numbers right before it.It always starts with 0 and 1.*/
package Demo;

public class FabonocciSeries {
	static int fibonacciSearch(int[] arr, int target) {
		int n = arr.length;
		
		int fib2 = 0;
		int fib1 = 1;
		int fib = fib1 + fib2;
		
		while(fib<n) {
			fib2 = fib1;
			fib1 = fib;
			fib = fib1 + fib2;
		}
		int offset = -1;
		while(fib>1) {
			int i = Math.min(offset + fib2, n-1);
			
			if(arr[i]<target) {
				fib = fib1;
				fib1 = fib2;
				fib2 = fib-fib1;
				offset = i;
			}
			else if(arr[i]>target) {
				fib = fib2; 
				fib1 = fib1 - fib2;
				fib2 = fib - fib1;
				
			}else {
				return i;
			}
		}
		if (fib1 == 1 && offset + 1 < n && arr[offset + 1] == target) { 
			return offset + 1; 
			}
		return -1;
	}
	public static void main(String[] args) { 
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90}; 
		int target = 80;
		System.out.println(fibonacciSearch(arr, target));
	}


}
