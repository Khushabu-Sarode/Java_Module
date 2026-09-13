package app;

import Cal.SimpleCalculator;
import Cal.iCalculator;

public class iCalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator c1 = new SimpleCalculator();
		
		System.out.println(c1.add(10, 10)); 
		System.out.println(c1.subtract(10, 10)); 
		System.out.println(c1.multiply(10, 10)); 
		System.out.println(c1.divide(10, 10)); 
	}

}
