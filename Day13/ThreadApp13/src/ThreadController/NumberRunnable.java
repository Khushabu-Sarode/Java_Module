package ThreadController;

public class NumberRunnable implements Runnable {

	Thread t;

	public NumberRunnable() {
		super();
		t = new Thread(this);
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
