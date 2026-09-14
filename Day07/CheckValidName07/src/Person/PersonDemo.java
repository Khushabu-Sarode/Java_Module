package Person;

public class PersonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	 Person p = new Person("Khushi" , 22);
        	 p.display();
        }catch(Exception e) {
        	 System.out.println(e.getMessage());
        }
        
	}

}
