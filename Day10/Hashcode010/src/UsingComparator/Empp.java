package UsingComparator;

public class Empp {

	   private int id;
	   private String name;
	   double salary;

	    Empp(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Emp{id=" + id + ", name='" + name + "', salary=" + salary + "}";
	    }
	
}
