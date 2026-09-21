package threadCountd;

public class threadcountdown extends Thread {
    
	private Thread t;
	int num;
	String name;
	
	threadcountdown(int num,String name){
		this.num = num;
		this.name = name;
		this.t = new Thread(this);
	}
	
	public void run() {
		while(num>0) {
			System.out.print(num + " : Thread prints ");
			num --;
		}
	}
	
	public Thread getT() {
		return t;
	}
}
