package Writeinfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Writeinfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("enter file name : ");
			String fileName = br.readLine();
			
			System.out.print("Enter data : ");
			String data = br.readLine();
			
			FileWriter fw = new FileWriter(fileName);
			fw.write(data);
			
			fw.close();
			System.out.println("File created successfully.");
			FileReader fr = new FileReader(fileName);
			BufferedReader fileReader = new BufferedReader(fr);
			
			System.out.println("Data from file :");
			
			String line;
			while((line = fileReader.readLine()) != null) {
				System.out.println(line);
			}
			fileReader.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(br != null) {
				  br.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
