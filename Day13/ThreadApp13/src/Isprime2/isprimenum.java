package Isprime2;

public class isprimenum extends Thread {
    int start;
    int end;
	public isprimenum(int start, int end) {
//		super();
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		System.out.print(" print prime numbers :");
		
		for(int i=start;i<=end;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i =2;i<n;i++) {
			if(n%i ==0 ) {
				return false;
			}
		}
		return true;
	}
    
   
}
