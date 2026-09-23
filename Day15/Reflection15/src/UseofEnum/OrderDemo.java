package UseofEnum;

import java.util.HashSet;
import java.util.Set;

public class OrderDemo {

	public static void main(String[] args) {
		
		Set<Order> orders = new HashSet<>();
         
		orders.add(new Order(101, "Khushi", 50000, OrderdStatus.PLACED));
         
		for (Order o : orders) {
			System.out.println(o.display());
		}
         
	}
}
