package Demo;
import java.util.*;
import java.util.stream.Collectors;
	/**
	 * Sales Report (Streams API)
	 *
	 * Use the Streams API for every task. Do NOT loop manually over the orders.
	 * Public class must be named SalesReport; Order is a helper class in this file.
	 */
	class Order {
	    private final String product;
	    private final String category;
	    private final double amount;
	    public Order(String product, String category, double amount) {
	        this.product = product;
	        this.category = category;
	        this.amount = amount;
	    }
	    public String getProduct()  { return product; }
	    public String getCategory() { return category; }
	    public double getAmount()   { return amount; }
	}
	public class Ecommerce {
	    // TODO: sum of all amounts using a stream.
	    public static double totalRevenue(List<Order> orders) {
	        return orders.stream()
	                .mapToDouble(Order::getAmount)
	                .sum();
	    }
	    // TODO: group by category, sum amounts; return a Map with categories in
	    //       alphabetical order (hint: groupingBy into a TreeMap, or copy into one).
	    public static Map<String, Double> revenueByCategory(List<Order> orders) {
	        return orders.stream()
	                .collect(Collectors.groupingBy(
	                        Order::getCategory,
	                        TreeMap::new,
	                        Collectors.summingDouble(Order::getAmount)
	                ));
	    }
	    // TODO: order with the largest amount via stream().max(...).
	    public static Order highestOrder(List<Order> orders) {
	        return orders.stream()
	                .max(Comparator.comparingDouble(Order::getAmount))
	                .orElse(null);
	    }
	    // TODO: product names for amounts strictly > threshold, sorted by amount desc.
	    public static List<String> ordersAbove(List<Order> orders, double threshold) {
	        return orders.stream()
	                .filter(o -> o.getAmount() > threshold)
	                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())
	                .map(Order::getProduct)
	                .collect(Collectors.toList());
	    }
	    public static void main(String[] args) {
	        List<Order> orders = Arrays.asList(
	            new Order("Laptop", "Electronics", 1200.0),
	            new Order("Phone", "Electronics", 800.0),
	            new Order("Desk", "Furniture", 300.0),
	            new Order("Chair", "Furniture", 150.0),
	            new Order("Monitor", "Electronics", 400.0),
	            new Order("Notebook", "Stationery", 50.0)
	        );
	        double threshold = 300.0;
	        System.out.println("Total revenue: " + totalRevenue(orders));
	        System.out.println("Revenue by category:");
	        for (Map.Entry<String, Double> e : revenueByCategory(orders).entrySet()) {
	            System.out.println(e.getKey() + " -> " + e.getValue());
	        }
	        Order top = highestOrder(orders);
	        System.out.println("Highest order: " + top.getProduct() + " (" + top.getAmount() + ")");
	        System.out.println("Orders above " + threshold + ": "
	                + String.join(", ", ordersAbove(orders, threshold)));
	    }
	}

