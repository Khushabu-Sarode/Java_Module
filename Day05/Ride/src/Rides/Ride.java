package Rides;

public class Ride {
    private int rideint;
    private String custname;
    
    public Ride() {
    	rideint = 0;
    	custname = "name";
    }
    
	public Ride(int rideint, String custname) {
		this.rideint = rideint;
		this.custname = custname;
	}
	
	public void display() {
		System.out.println("ride int :: " + rideint);
		System.out.println("customer name :: " + custname);
	}
    
}

