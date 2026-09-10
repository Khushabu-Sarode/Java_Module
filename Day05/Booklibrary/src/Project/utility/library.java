package Project.utility;

public class library extends Book {
     private int noofpages;
     Date dob;

	 public library(int bookid,  String title, float price,int noofpages, Date dob) {
		super(bookid, title, price);
		this.noofpages = noofpages;
		this.dob = dob;
	 }

	 public library() {
		super();
		noofpages = 0;
		 dob = new Date();
	}

	 public void display() {
		 super.display();
		 System.out.println("no of pages : " + noofpages);
		 System.out.println(" DOB :: ");
		 dob.display();
	 }
     


}


