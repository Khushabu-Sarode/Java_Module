package Isprime2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import SourcetoDestination.SourceToDestination;

public class isprimenumdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		 try {
			 System.out.print("Enter num1 : ");
	            int num = Integer.parseInt(br.readLine());

	            System.out.print("Enter num2 : ");
	            int num2 = Integer.parseInt(br.readLine());

			 isprimenum task = new isprimenum(num,num2);
			 Thread thread = new Thread(task);
			  thread.start();
			  
		 } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
//		  try {
//			  System.out.print("Enter source file path : ");
//			  String sourcePath = br.readLine();
//			  
//			  System.out.print("Enter destination file path : ");
//			  String destPath = br.readLine();
//			  
//			  SourceToDestination task = new SourceToDestination(sourcePath,destPath);
//			  
//			  Thread thread = new Thread(task);
//			  thread.start();
//			  
//			  System.out.println("Background thread start execution : ");
//			  
//		  }catch(IOException e) {
//			  e.printStackTrace();
//		  }
		  
		
	}

}
