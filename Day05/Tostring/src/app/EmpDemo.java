package app;

import Base.Date;
import Emp.Administrator;
import Emp.Programmer;
import Emp.salesmanager;

public class EmpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      salesmanager s1 = new salesmanager();
//      s1.display();
//      
//      Programmer p1 = new Programmer();
//      p1.display();
//      
//      Administrator a1 = new Administrator();
//      a1.display();
	  Date dob =new Date(1,11,2003);
//      
      salesmanager s1 = new salesmanager("khushii",dob, 101, 400000.0 , 30000.0, 2000.0);
      //s1.display();

      System.out.print(s1);
      
      Date dob1 =new Date(1,12,2003);
      Programmer p1 = new Programmer("aditi",dob1, 101 , 30000.0, "Dac Project", 10,
  			20000.0);
//      p1.display();
      System.out.print("\n");
      System.out.println(p1);
      
      Date dob2 =new Date(6,11,2003);
      Administrator a1 = new Administrator("ABc",dob2, 101, 400000.0 , 30000.0);
      a1.display();
      
   
      
      
	}

}
