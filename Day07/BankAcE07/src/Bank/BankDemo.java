package Bank;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       BankAccount b = new BankAccount(101,"neha",200000);
       
       b.displayBalance();
		
       try {
    	    b.deposit(2000);
       }
       catch(IllegalArgumentException e) {
    	    System.out.println(e.getMessage());
       }
       catch(ArithmeticException e) {
    	   System.out.println(e.getMessage());
       }
       
       try {
    	   b.withdraw(0);
       }
       catch(IllegalArgumentException e) {
    	   System.out.println(e.getMessage());
       }
       catch(ArithmeticException e) {
    	   System.out.println(e.getMessage());
       }
       
       try {
    	   b.withdraw(1000);
       }
       catch(IllegalArgumentException e) {
    	   System.out.println(e.getMessage());
       }
       catch(ArithmeticException e) {
    	   System.out.println(e.getMessage());
       }
       
       b.displayBalance();
       
	}

}
