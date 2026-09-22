package FindDivisor;

import java.io.FileWriter;
import java.io.IOException;

public class finddivisor extends Thread {
     int number;
     
     finddivisor(int divisor){
    	    this.number = number;
     }
     
     synchronized void findDiv() {
    	 
    	   try {
    		   
    		   FileWriter fw = new FileWriter("divisor.txt",true);
    		   
    		   fw.write("Divisors of number " + number + "are :");
    		   for(int i=1;i<=number;i++) {
    			   if(number % i == 0) {
    				   fw.write(i + " ");
    			   }
    		   }
    		   fw.write("\n");
    		   fw.close();
    	   }
    	   catch(IOException e) {
    		   System.out.println(e);
    	   }
    	 
     }


     public void run() {
    	 findDiv();
     }
     
}
