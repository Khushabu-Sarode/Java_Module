package operationsonlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		ArrayList<String>list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter quit to stop");
	    String line = sc.nextLine();
	    while(!line.equals("quit")) {
	    	   list.add(line);
	    	   line = sc.nextLine();
	    }
	    
	    System.out.println("the size is : " + list.size());
	    
	    for(String s : list) {
	    	System.out.println(list);
	    }
	    
	    Iterator<String> it = list.iterator();
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    }
	    
	    for(int i=list.size()-1;i>=0;i--) {
	    	 System.out.println(list.get(i));
	    }
	    
	    list.forEach( t -> System.out.println(t) );
	    
	    Collections.sort(list);
        System.out.println(list);
        int index = Collections.binarySearch(list, "java");
        System.out.println("index" + index);
	    
	}

}
