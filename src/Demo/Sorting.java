/* write a java program to check whether the array is sorted  in ascending order input  example 10,20,30,40,50 and output need to be sorted*/
package Demo;

public class Sorting {
	public static void main (String[] args) {
		int[] arr= {10,20,30,40,50};
		boolean sorted = true;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
				
			}
		}
		if(sorted) {
			System.out.println("Sorted");
		}else {
			System.out.println("Not Sorted");
		}
	}

}
	

