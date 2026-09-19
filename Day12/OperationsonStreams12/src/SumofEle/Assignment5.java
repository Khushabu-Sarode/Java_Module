package SumofEle;


import java.util.List;
import java.util.Optional;

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> num = List.of(12,1,3,4);
		 
		 Optional<Integer> sum = num.stream()
	                .reduce((a, b) -> a + b);


		 System.out.print(sum);
				
	}

}
