package Decendingorder;

import java.util.List;

public class assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> num = List.of(12,1,3,4);
		 
		 num.stream().sorted((a,b) -> b-a).forEach(n -> System.out.println(n));
		
	}

}
