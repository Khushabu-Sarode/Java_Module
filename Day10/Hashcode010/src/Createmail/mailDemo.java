package Createmail;

import java.time.LocalDateTime;
import java.util.TreeSet;
public class mailDemo {


	

	    public static void main(String[] args) {

	        TreeSet<mail> mails = new TreeSet<>();

	        mails.add(new mail(
	                101,
	                "abc@gmail.com",
	                "Hello",
	                "Hello ABc",
	                LocalDateTime.of(2026, 9, 17, 11, 30)
	        ));

	        mails.add(new mail(
	                102,
	                "xyz@gmail.com",
	                "Meeting",
	                "Meeting at 2 PM",
	                LocalDateTime.of(2026, 9, 17, 10, 30)
	        ));

	        mails.add(new mail(
	                103,
	                "pqr@gmail.com",
	                "Assignment",
	                "Complete assignment",
	                LocalDateTime.of(2026, 9, 16, 15, 30)
	        ));

	        for (mail m : mails) {
	            System.out.println(m);
	        }
	    }
	

}
