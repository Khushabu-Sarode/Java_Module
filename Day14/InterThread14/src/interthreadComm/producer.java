package interthreadComm;

public class producer implements Runnable {

	private Thread t;
	private source s;
	private boolean bRun;
	
	public producer (source s){
		this.s = s;
		this.bRun = true;
		this.t = new Thread(this);
	}
	
	public void run() {
		while(bRun) {
			s.produce();
		}
	}
	
	public Thread getT() {
		return t;
	}

	public void setbRun(boolean bRun) {
		this.bRun = bRun;
	}

	

}
