package StudentsHashcode;

public class Student {
      private int studentid;
      private String name;
      private String city;
      private float percentage;
	  public Student() {
		super();
	  }
	  public Student(int studentid, String name, String city, float percentage) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	  }
	  
	  
	  @Override
	public int hashCode() {
		int code = 0;
		if(this.percentage > 90) {
			code= 65;
		}
		else if(this.percentage > 70 && this.percentage < 90) {
			code = 66;
		}
		else if(this.percentage > 50 && this.percentage < 70) {
			code = 67;
		}
		else {
			code = 68;
		}
		return code;
	}
	  	
	  @Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Student) {
			Student stud = (Student)obj;
			if(this.studentid == stud.studentid && this.name.equals(stud.name) && this.city.equals(stud.city)) {
				flag = true;
			}
		}
		return flag;
	}
	   
	  @Override
	  public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", city=" + city + ", percentage=" + percentage
				+ "]";
	  }
	
      
      
}
