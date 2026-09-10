package Emp;

public class Emp extends Person {
    private int empid;
    private double salary;
    
    public Emp() {
    	super();
    }

	public Emp(String name, Date dob, int empid, double salary) {
		super(name, dob);
		this.empid = empid;
		this.salary = salary;
	}
    
//    public Emp(String name,Date bdate,int empid,double salary) {
//    	super(name,bdate);
//    	this.empid = empid;
//    	this.salary = salary;
//    }
    
    
    
    public void display() {
    	super.display();
    	System.out.println("EMP :: " + empid);
    	System.out.println("Salary :: " + salary);
    }

}
