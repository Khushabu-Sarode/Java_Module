package FindDuplicate;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<Integer> num = List.of(12,1,3,4,4);
		 num.stream().filter(n -> Collections.frequency(num, n) > 1).distinct().forEach(System.out::println);
		 
	}

}
