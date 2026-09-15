package copySourceToDestination;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class SourceToDestination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file");
		String source = sc.nextLine();
		
		System.out.println("Enter desti file");
		String desti = sc.nextLine();
		try {
			FileInputStream fis = new FileInputStream(source);
			FileOutputStream fos = new FileOutputStream(desti);
			
			int ch;
			
			while((ch = fis.read()) != -1) {
				fos.write(ch);
			}
			
			fis.close();
			fos.close();
			
			System.out.println("file copied successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		sc.close();
	}

}
