package TreeSetEmp;

public class Emp implements Comparable<Emp>{
    private int Empid;
    private String name;
    private float salary;
    private String dept;
    
	public Emp() {
		super();
	}
	public Emp(int empid, String name, float salary,String dept) {
		super();
		Empid = empid;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Emp [Empid=" + Empid + ", name=" + name + ", salary=" + salary + ", dept =" + dept + "]";
	}
	
	public int compareTo(Emp e) {
		int diff = this.dept.compareTo(e.dept) ;
		if(diff != 0) return diff;
		
		diff = Float.compare(e.salary, this.salary);
		if(diff != 0) return diff;
		
		diff = this.name.compareTo(e.name);
		if(diff != 0) return diff;
		
		return Integer.compare(this.Empid, e.Empid);
         
	}
	
	
    
    
}
