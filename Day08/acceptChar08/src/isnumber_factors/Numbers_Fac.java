package isnumber_factors;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Numbers_Fac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter number 'quit' to stop");			
			String input;
              
			while(!((input = br.readLine()).equals("quit"))) {
				try {
					int num = Integer.parseInt(input);
					System.out.println("Factors ::");
					
					for(int i=1;i<=num;i++) {
						if(num % i == 0) {
							System.out.println(i + " ");
						}
					}
					System.out.println();
				}
				   catch (NumberFormatException e) {
	                    System.out.println("Not a number");
	                }
				
			}
			}
			
			catch (IOException e) {
	            e.printStackTrace();
	        }

	        finally {
	            try {
	                if (br != null)
	                    br.close();
	            }
	            catch (IOException e) {
	                e.printStackTrace();
	            }
	     	}
	  
	}
	
}
