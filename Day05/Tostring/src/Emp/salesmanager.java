package Emp;

import Base.Date;
import Base.Emp;

public class salesmanager extends Emp {
    
	private double saleTarget;
	private double commision;
	
	
	
	public salesmanager() {
		super();
		saleTarget = 0;
		commision = 0;
	}



	public salesmanager(String name, Date dob, int empid, double salary, double saleTarget, double commision) {
		super(name, dob, empid, salary);
		this.saleTarget = saleTarget;
		this.commision = commision;
	}
	
	public void display() {
		
		System.out.println( "Sale target ::  " + saleTarget);
		System.out.println("Commision :: " + commision );
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"sales target = " + saleTarget + "Commision :  " + commision;
	}



	
}
