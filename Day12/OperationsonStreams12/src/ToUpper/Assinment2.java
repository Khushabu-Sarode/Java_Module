package ToUpper;

import java.util.stream.Stream;

public class Assinment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Stream<String> words = Stream.of("abc","def","ghi","jkl");
        words.map(s-> s.toUpperCase()).forEach(System.out::println);
	}

}
