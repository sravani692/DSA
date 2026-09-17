package Demo;
import java.util.*;
public class MinimumPlatform {
	
	
		
		static int findPlatforms (
			int[] arrival,
			int[] departure) {
			
			Arrays.sort(arrival);
			Arrays.sort(departure);
			
			int i = 0;
			int j = 0;
			
			int platform = 0;
			int maxPlatforms = 0;
			
			while (i < arrival.length &&
				   j < departure.length) {
				
				if (arrival[i] <= departure[j]) {
					
					platform++;maxPlatforms++;
					
					i++;
				}else {
					
					platform--;
					j++;
				}
			}
			return maxPlatforms;
			
		}
		
		public static void main(String[] args) {
			
			int[] arrival =
				{900, 940, 950, 1100, 1500, 1800}; 
			
			int[] departure =
				{900, 1200, 1120, 1130, 1900, 2000};
			
			System.out.println(
					"Minimum Platforms =" + 
			findPlatforms(arrival, departure)
					);
		}
	}
