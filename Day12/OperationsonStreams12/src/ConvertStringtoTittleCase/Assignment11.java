package ConvertStringtoTittleCase;

import java.util.stream.Stream;

public class Assignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Stream<String> words = Stream.of("abc","def","ghi","jkl");
		  
		  words.map(s->{
			  StringBuilder sb = new StringBuilder(s);
			  sb.replace(0, 1, Character.toString(s.charAt(0)).toUpperCase());
			  return new String(sb);
		  }).forEach(System.out::println);
	}

}
