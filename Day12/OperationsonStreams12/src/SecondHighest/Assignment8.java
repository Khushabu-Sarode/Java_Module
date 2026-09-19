package SecondHighest;

import java.util.List;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> num = List.of(12,1,3,4);
		 int secondhigh = num.stream().sorted((a,b) -> b - a).skip(1).findFirst().get();
				 
		 System.out.println(secondhigh);
 
	}

}
