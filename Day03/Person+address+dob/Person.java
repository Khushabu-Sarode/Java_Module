public class Person {

     private String name;
     Date dob;
     Address presentAddress;
     Address permanentAddreess;

   //   Person(){
   //      name = "name";
   //      dob = new Date();
   //      Address permanentAddreess = "enter present Address";

   //   }

     Person(String name,Date dob,Address presentAddress,Address permanentAddreess){
        this.name = name;
        this.dob = dob;
        this.presentAddress = presentAddress;
        this.permanentAddreess = permanentAddreess;
     }
    
     public void display(){
        System.out.println("name :: " + name);
        System.out.print("DOB :: ");
        dob.display();

        System.out.println("present address : ");
        presentAddress.display();

         System.out.println("permanant address : ");
        permanentAddreess.display();
     }
}
