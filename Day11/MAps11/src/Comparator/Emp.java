package Comparator;

public class Emp {
       int id;
       String name;
       double salary;
       String dept;
	   public Emp(int id, String name, double salary, String dept) {
//		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	   }
	   private int getId() {
		   return id;
	   }
	   private void setId(int id) {
		   this.id = id;
	   }
	   private String getName() {
		   return name;
	   }
	   private void setName(String name) {
		   this.name = name;
	   }
	   private double getSalary() {
		   return salary;
	   }
	   private void setSalary(double salary) {
		   this.salary = salary;
	   }
	   private String getDept() {
		   return dept;
	   }
	   private void setDept(String dept) {
		   this.dept = dept;
	   }
	   @Override
	   public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	   }
	   
	   
       
       
}
