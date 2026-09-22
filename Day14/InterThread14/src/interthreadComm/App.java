package interthreadComm;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        source s = new source();
        producer p = new producer(s);
        consumer c = new consumer(s);
        
        p.getT().start();
        c.getT().start();
        try {
        	Thread.sleep(500);        	
        }catch(InterruptedException e) {
        	 e.printStackTrace();
        }
        p.setbRun(false);
        c.setbRun(false);
        
        try {
        	 p.getT().join();
        	 c.getT().join();
        }catch(InterruptedException e) {
        	  e.printStackTrace();
        }
        
        System.out.println(p.getT().isAlive());
        System.out.println(p.getT().isAlive());
        
        System.out.print(s.getQtyproduced());
        System.out.println(s.getQtyconsumed());
        
	}

}
