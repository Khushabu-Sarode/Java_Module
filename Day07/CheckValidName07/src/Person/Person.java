package Person;

public class Person {
     String name;
     int age;
     
     Person(String name,int age) throws Exception{
    	    if(name.length() > 0 && name.charAt(0) >= 'A' && name.charAt(0) <= 'Z') {
    	    	    boolean valid = true;
    	    	    
    	    	    for(int i=1 ;i<name.length(); i++) {
    	    	      	if (name.charAt(i) < 'a' || name.charAt(i) > 'z') {
    	    	    	      valid = false;
    	    	    	     break;
    	    	    	  }
    	    	    }
    	    	    
    	    	    if(valid) {
    	    	    	   this.name = name;
    	    	    	   this.age = age;
    	    	    }
    	    	    else {
    	    	    	throw new Exception("Invalid name");
    	    	    }
    	    }
    	    else {
                throw new Exception("Invalid name");
          }
     }
     
     
     void display() {
    	 System.out.println("Name :: " + name);
    	 System.out.println("Age :: " + age);
     }
     
}
