public class Person {

     private String name;
     Date dob;

     Person(){
        name = "name";
        dob = new Date();
     }

     Person(String name,Date dob){
        this.name = name;
        this.dob = dob;
     }
    
     public void display(){
        System.out.println("name :: " + name);
        System.out.print("DOB :: ");
        dob.display();
     }
}
