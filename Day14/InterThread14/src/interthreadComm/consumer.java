package interthreadComm;

public class consumer implements Runnable {

	private Thread t;
	private source s;
	private boolean bRun;
	public consumer(source s) {
		this.s = s;
		this.t = new Thread(this);
		this.bRun = true;
	}
	
	public void run() {
		while(bRun) {
			s.consumer();
		}
	}
	public Thread getT() {
		return t;
	}

	public void setbRun(boolean bRun) {
		this.bRun = bRun;
	}
	
	
	
	
}
