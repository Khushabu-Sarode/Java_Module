package printingnumbers;

public class mythreadd implements Runnable{
	Thread t;

//	private Thread getT() {
//		return t;
//	}
//
//	private void setT(Thread t) {
//		this.t = t;
//	}

	public mythreadd() {
		super();
		t = new Thread();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Child thread : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}
