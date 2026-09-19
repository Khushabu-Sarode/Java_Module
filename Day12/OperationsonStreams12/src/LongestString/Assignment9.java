package LongestString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //Stream<String> words = Stream.of("abcsdfghj","def","ghi","jkl"); /// here we need optional
		  List<String> names = Arrays.asList(
	                "Amit", "Rahul", "Priyanka", "Sneha"
	        );

		  
		  String longest = names.stream().max(Comparator.comparingInt(String :: length)).get();
		  System.out.println(longest);
		  
		  
	}

}
