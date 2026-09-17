package TreeSetEmp;

import java.util.Set;
import java.util.TreeSet;

public class Empset {	
		public static void main(String[] args) {
			Set<Emp> emps = new TreeSet<>();
			emps.add(new Emp(1001,"amit",567.89f));
			emps.add(new Emp(1004,"vaibhav",890.89f));
			emps.add(new Emp(1003,"snehal",785.89f));
			emps.add(new Emp(1006,"bakul",785.89f));
			emps.add(new Emp(1002,"deepa",970.89f));
			emps.add(new Emp(990,"priya",860.89f));
			emps.add(new Emp(999,"sujata",860.60f));
			for(Emp e: emps) {
				System.out.println(e);
			}

		}
		
		
}



