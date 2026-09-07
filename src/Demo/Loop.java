/*find the duplicate place given in a array print even pair elements whose sum is 10 input is 83755 output is 2+8=10,3+7=10,5+5=10*/
package Demo;

public class Loop {
	public static void main (String[] args) {
		int[] arr = {2, 8, 3, 7, 5, 5};
		
		for(int i = 0; i<arr.length;i++) {
			
			for( int j = i+1; j < arr.length; j++) {
				
				if(arr[i]  + arr[j] == 10) {
					System.out.println(arr[i] +" + " + arr[j] + "= 10");
				}
			}
		}
	}

}
	

