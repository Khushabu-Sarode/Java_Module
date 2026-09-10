package Base;

public class Person {

     private String name;
     Date dob;

     public Person(){
        name = "name";
        dob = new Date();
     }

      public Person(String name,Date dob){
        this.name = name;
        this.dob = dob;
     }
    
     public void display(){
        System.out.println("name :: " + name);
        System.out.print("DOB :: ");
        dob.display();
     }

	 @Override
	 public String toString() {
		return "Person [name=" + name + ", dob=" + dob + "]";
	 }
     
     
}
