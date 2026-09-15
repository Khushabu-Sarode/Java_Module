package AcceptDataWriteInFile;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class AcceptDataWriteInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter file path: ");
       String path = sc.nextLine();
       
       System.out.print("Enter data");
       String data = sc.nextLine();
       
       try {
    	   FileWriter fw = new FileWriter(path);
    	   
    	   fw.write(data);
    	   fw.close();
    	   
    	   System.out.print("data written successfully : \n");
    	   FileReader fr = new FileReader(path);
    	   int ch;
    	   
    	   System.out.println("data from file");
    	   while((ch = fr.read()) != -1) {
    		   System.out.println((char)ch);
    	   }
    	   
    	   fr.close();
    	   
       }
       catch(Exception e) {
    	   System.out.println(e);
       }
       
       sc.close();
	}

}
