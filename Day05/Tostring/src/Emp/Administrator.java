package Emp;

import Base.Date;
import Base.Emp;

public class Administrator extends Emp {
     private double allowance;

     public Administrator() {
    	 super();
    	 allowance = 0;
     }
     
	 public Administrator(String name, Date dob, int empid, double salary, double allowance) {
		super(name, dob, empid, salary);
		this.allowance = allowance;
	 }
     
	 public void display() {
		 System.out.println("Allowance"  + allowance );
	 }

	 @Override
	 public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "allowamce :: " +allowance;
	 }

	
     
}
