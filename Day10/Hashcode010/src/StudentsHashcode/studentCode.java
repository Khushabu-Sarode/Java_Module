package StudentsHashcode;

import java.util.HashSet;
import java.util.Scanner;

public class studentCode {



	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);

	        HashSet<Student> students = new HashSet<>();

	        students.add(new Student(1, "Rahul", "Pune", 95));
	        students.add(new Student(2, "Amit", "Mumbai", 85));
	        students.add(new Student(3, "Sneha", "Pune", 75));
	        students.add(new Student(4, "Priya", "Nashik", 65));
	        students.add(new Student(5, "Rohan", "Mumbai", 45));
	        students.add(new Student(6, "Neha", "Pune", 92));
	        students.add(new Student(7, "Kiran", "Nashik", 55));
	        students.add(new Student(8, "Pooja", "Mumbai", 72));
	        students.add(new Student(9, "Akash", "Pune", 38));
	        students.add(new Student(10, "Anjali", "Nashik", 88));

	        System.out.println("All Students:");

	        for (Student s : students) {
	            System.out.println(s);
	        }
	        
	        sc.close();
	    
	}
}
