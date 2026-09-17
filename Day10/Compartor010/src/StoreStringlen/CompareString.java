package StoreStringlen;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CompareString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<String> set = new TreeSet<> ((o1,o2) -> {
			int diff = 0;
			diff = o1.length() - o2.length();
			if(diff == 0) {
				diff = o1.compareTo(o2);
			}
			return diff;
		});
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 strings : ");
		for(int i =0;i<5;i++) {
			String s = sc.next();
			set.add(s);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		sc.close();
	}

}
