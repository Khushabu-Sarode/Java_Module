package StartWithA;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("abc","def","ahi","jkl");
		 
		 long count =  names.stream().filter(name -> name.startsWith("a")).count();
		 
		 System.out.print(count);
	}

}
