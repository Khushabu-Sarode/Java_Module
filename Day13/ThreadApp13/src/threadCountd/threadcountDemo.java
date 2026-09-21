package threadCountd;

public class threadcountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		threadcountdown j1 = new threadcountdown(890,"first");
		threadcountdown j2 = new threadcountdown(891,"second");
		threadcountdown j3 = new threadcountdown(892,"third");
		
		System.out.println("Counting down task :: ");
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("end task :: ");
		
	}

}
