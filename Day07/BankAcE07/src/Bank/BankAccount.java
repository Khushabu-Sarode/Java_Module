package Bank;

public class BankAccount {
        private int accountNumber;
        private String accountHolder;
        private double balance;
		public BankAccount(int accountNumber, String accountHolder, double balance) {
//			super();
			this.accountNumber = accountNumber;
			this.accountHolder = accountHolder;
			this.balance = balance;
		}
		
		void deposit(double amount) {
			if(amount <=0) {
				throw new IllegalArgumentException("invalid deposit amount");
			}
			
			balance =balance + amount;
			System.out.println("Amount withdraw successfully");
		}
		
		void withdraw(double amount) {
			if(amount <= 0) {
				throw new IllegalArgumentException("Invalid withdrawal amount");
			}
			
			if(amount > balance) {
				throw new ArithmeticException("insufficient balance");
			}
			
			balance = balance - amount;
			
			System.out.println("Amount withdraw successfully");
		}
		
		
		void displayBalance() {
			System.out.println("Account Number :: " + accountNumber);
			System.out.println("Account Holder :: " + accountHolder);
			System.out.println("Balance is :: " + balance);
		}
        
        
}
