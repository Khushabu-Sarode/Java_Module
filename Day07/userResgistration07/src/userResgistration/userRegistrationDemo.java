package userResgistration;

public class userRegistrationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 UserRegistration u = new UserRegistration();

	        try {
	            u.registerUser("Khushabu", "India");
	        }
	        catch (InvalidCountryException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
