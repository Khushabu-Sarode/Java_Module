package Printer;

class printer extends Thread{
	private printer print;
	private String data;
	public printer() {
		super();
	}
	public printer(printer print, String data) {
		super();
		this.print = print;
		this.data = data;
	}
	
	public void display(String data) {
		System.out.print("started printing :");
		try {
			Thread.sleep(200);
			
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.print(" " + data +  " ");
	}
	
	public void run() {
		synchronized (print) {
			print.display(data);
		}
	}
}



public class PrintThread {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		printer sharedprinter = new printer();
		
		printer t1 = new printer(sharedprinter,"Lemon");
		printer t2 = new printer(sharedprinter,"Tomato");
		printer t3 = new printer(sharedprinter,"Ginger");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
