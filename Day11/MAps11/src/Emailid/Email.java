package Emailid;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Email {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         BufferedReader br = new BufferedReader(new FileReader("emails.txt"));
         
         HashMap<String,Integer> map = new HashMap<>();
         
         String email;
         while((email = br.readLine()) != null) {
        	  String domain = email.substring(email.indexOf('@') + 1);
        	  if(map.containsKey(domain)) {
        		  map.put(domain, map.get(domain)+ 1);
        	  }else {
        		  map.put(domain, 1);
        	  }
         }
         
         br.close();
         
         for(String domain : map.keySet()) {
        	 System.out.println(domain + " -> " + map.get(domain));
         }
         
	}

}
