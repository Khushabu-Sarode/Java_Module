package app;

import Project.utility.Emp;
import Project.utility.Date;

public class DateDemo {
    public static void main(String [] args) {
    	Emp e = new Emp();
    	e.display();
    	
       Date d1 = new Date(1,11,2003);
    	Emp e1 = new Emp("ABC" ,d1, 121,1000000);
    	e1.display();
    }
}
