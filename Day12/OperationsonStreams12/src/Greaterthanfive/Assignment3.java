package Greaterthanfive;

import java.util.Arrays;
import java.util.List;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> list = List.of(2,3,1,34,5);
		list.stream().filter(n -> n > 5).findFirst().ifPresent(n -> System.out.println(n));

	}

}
