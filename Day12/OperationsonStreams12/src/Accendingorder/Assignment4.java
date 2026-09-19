package Accendingorder;

import java.util.List;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        List<Integer> num = List.of(12,1,3,4);
		
		num.stream().sorted().forEach(n -> System.out.println(n));
			
		

	}

}
