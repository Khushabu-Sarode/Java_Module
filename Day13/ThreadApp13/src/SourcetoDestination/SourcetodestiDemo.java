package SourcetoDestination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SourcetodestiDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
//		Scanner sc = new Scanner(System.in);
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  try {
		  System.out.print("Enter source file path : ");
		  String sourcePath = br.readLine();
		  
		  System.out.print("Enter destination file path : ");
		  String destPath = br.readLine();
		  
		  SourceToDestination task = new SourceToDestination(sourcePath,destPath);
		  
		  Thread thread = new Thread(task);
		  thread.start();
		  
		  System.out.println("Background thread start execution : ");
		  
	  }catch(IOException e) {
		  e.printStackTrace();
	  }
	  
		
	}

}
