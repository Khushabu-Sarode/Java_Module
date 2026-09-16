package AcceptString;

import java.util.ArrayList;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter quit to stop");
	    String line = sc.nextLine();
	    while(!line.equals("quit")) {
	    	   list.add(line);
	    	   line = sc.nextLine();
	    }
	    
	    System.out.print("collection : " + list);
	    System.out.print("Enter index to remove : ");
	    int index = Integer.parseInt(sc.nextLine());
	    
	    if(index >= 0 && index < list.size()) {
	    	list.remove(index);
	    }else {
	    	System.out.println("invalid index !");
	    }
	    
	    System.out.println("Collection after removal : " + list);
	    
	}
}



























//package AcceptString;
//
//import java.io.*;
//import java.util.*;
//
//public class Assignment1 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        ArrayList<String> list = new ArrayList<String>();
//
//        System.out.println("Enter strings one by one. Type 'quit' to stop.");
//        String line;
//        while (!((line = br.readLine()).equals("quit"))) {
//            list.add(line);
//        }
//
//        System.out.println("Collection: " + list);
//
//        System.out.print("Enter index to remove: ");
//        int index = Integer.parseInt(br.readLine());
//
//        if (index >= 0 && index < list.size()) {
//            list.remove(index);
//        } else {
//            System.out.println("Invalid index!");
//        }
//
//        System.out.println("Collection after removal: " + list);
//    }
//}

