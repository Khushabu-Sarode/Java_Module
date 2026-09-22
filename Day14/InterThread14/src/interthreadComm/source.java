package interthreadComm;

public class source {
	private int qtyproduced;
	private int qtyconsumed;
	private volatile boolean bproduced;
	public source() {
		super();
	}

	protected int getQtyproduced() {
		return qtyproduced;
	}

	protected int getQtyconsumed() {
		return qtyconsumed;
	}

//	public void produce() {
//		while(bproduced) {
//			qtyproduced++;
//		    System.out.println(qtyproduced);
//		    bproduced = true;
//		}
//		
//	}

	public void produce() {
		try {
		if(bproduced) {
			this.wait();
		}
		qtyproduced++;
		System.out.println(qtyproduced);
		bproduced = true;
		notify();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void consume() {
		try {
		if(!bproduced) {
			this.wait();
		}
		qtyproduced++;
		System.out.println(qtyproduced);
		bproduced = false;
		notify();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

	
	public void consumer() {
		while(!bproduced) {
			qtyconsumed++;
		    System.out.println(qtyconsumed);
		    bproduced = false;
		}
		
	}
	
	

}
