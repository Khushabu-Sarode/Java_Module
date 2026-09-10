package app;

import Project.utility.library;
import Project.utility.Date;


public class libraryDemo extends library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		library l1 = new library();
		l1.display();
		
		Date d1 = new Date(1,11,2003);
		
		library l2 = new library(12,"She don't need opinon", 543,214,d1);
		l2.display();
	}

}
