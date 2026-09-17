package Demo;
import java.lang.reflect.Array;
import java.util.*;

class Item {
	int weight;
	int value;
	
	Item(int weight, int value) {
		this.weight = weight;
		this.value = value;
	}
}

public class FractionalnapSack {
	public static double solve(
			Item[] items,
			int capacity) {
		
		Arrays.sort(
				items,
				(a, b) -> Double.compare(
						(double)b.value / b.weight,
						(double)a.value / a.weight)
				);
		double totalValue = 0;
		
		for (Item item : items) {
			if(capacity >= item.weight) {
				
				capacity -= item.weight;
				totalValue += item.value;
			} else {
				totalValue +=
						((double)item.value / item.weight)
						* capacity;
				
				break;
			}
		}
		return totalValue;
	}
	public static void main(String[] args) {
		Item[] items = {
				new Item(10, 60),
				new Item(20, 100),
				new Item(30, 120),

		};
		int capacity = 50;
		
		System.out.println(
				solve(items, capacity)
				);
	}
	

}