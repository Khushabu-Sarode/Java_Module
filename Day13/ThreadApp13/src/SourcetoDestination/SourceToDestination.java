package SourcetoDestination;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SourceToDestination implements Runnable {
     String src,dest;

	 public SourceToDestination(String src, String dest) {
		super();
		this.src = src;
		this.dest = dest;
	 }
     
	 public void run() {
		 try {
			 FileReader fr = new FileReader(src);
			 FileWriter fw = new FileWriter(dest);
			 
			 int ch;
			 
			 while((ch = fr.read()) != -1) {
				 fw.write(ch);
			 }
			 
			 fr.close();
			 fw.close();
			 System.out.print("file copied successfully");
			 
		 }catch(IOException e) {
			 System.out.print(e);
		 }
	 }
}
