package GetTop;

public class Student {
     private int id;
     private String name;
     private float percentage;
     

	 public Student() {
		super();
		id = 0;
		name = "name";
		percentage = 0;
	 }


	 public Student(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	 }


	 @Override
	 public String toString() {
		return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	 }


	 public int getId() {
		 return id;
	 }


	 public void setId(int id) {
		 this.id = id;
	 }


	 public String getName() {
		 return name;
	 }


	 public void setName(String name) {
		 this.name = name;
	 }


	 public float getPercentage() {
		 return percentage;
	 }


	 public void setPercentage(float percentage) {
		 this.percentage = percentage;
	 }
	 
	 
     
     
}
