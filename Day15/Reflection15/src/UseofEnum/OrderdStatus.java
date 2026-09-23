package UseofEnum;

public enum OrderdStatus {
     PLACED , CONFIRMED,SHIPPED,DELIVERED,CANCELLED;
}

class Order{
	int orederid;
	String custname;
	double amount;
	OrderdStatus status;
	

	public Order(int orederid, String custname, double amount, OrderdStatus status) {
		super();
		this.orederid = orederid;
		this.custname = custname;
		this.amount = amount;
		this.status = status;
	}


	public String display() {
		return "Order [orederid=" + orederid + ", custname=" + custname + ", amount=" + amount + ", status=" + status
				+ "]";
	}
	
	
}
