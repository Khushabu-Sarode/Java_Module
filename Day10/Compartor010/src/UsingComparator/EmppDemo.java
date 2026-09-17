package UsingComparator;

import java.util.TreeSet;

public class EmppDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		TreeSet<Empp> empset = new TreeSet<>((e1,e2) -> Double.compare(e1.salary,e2.salary));
		
				empset.add(new Empp(101, "abc", 45000));
				empset.add(new Empp(102, "def", 55000));
				empset.add(new Empp(103, "ghi", 25000));
				empset.add(new Empp(104, "jkl", 41000));
		
				for(Empp e : empset) {
					System.out.println(e);
				}
		
	}

}
