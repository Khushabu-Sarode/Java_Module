package Evennumber;

import java.util.List;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		List<Integer> num = List.of(12,1,3,4);
		
		num.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.println(n));
			
		}
	

}
