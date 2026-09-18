package Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpDemo {

	public static void main(String[] args) {

		List<Emp> list = new ArrayList<>();

		list.add(new Emp(201, "Ravi", 5000, "IT"));
		list.add(new Emp(202, "Neha", 5000, "Hr"));
		list.add(new Emp(203, "swati", 5000, "Hr"));
		list.add(new Emp(204, "Neha", 5000, "Admin"));
		list.add(new Emp(205, "Ravi", 5000, "IT"));

		list.sort(Comparator.comparing(e -> e.name));
		System.out.println(list);

		list.sort(Comparator.comparingDouble((Emp e) -> e.salary).reversed());
		System.out.println(list);

		list.sort(Comparator.comparingDouble((Emp e) -> e.salary)
				.thenComparing(e -> e.name)
				.thenComparing(e -> e.id));
		System.out.println(list);
	}
}