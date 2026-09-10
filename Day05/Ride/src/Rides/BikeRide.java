package Rides;

public class BikeRide extends Ride {
 
	private String bikenum;
	private boolean helmetprovided;
	public BikeRide() {
		super();
	    bikenum = "bikename";
		helmetprovided = false;
	}
	public BikeRide(int rideint, String custname, String bikenum, boolean helmetprovided) {
		super(rideint, custname);
		this.bikenum = bikenum;
		this.helmetprovided = helmetprovided;
	}
	 
	public void display() {
		super.display();
		System.out.println("bike num :: "+bikenum);
	   	System.out.println("helmet_provided ?? ::" + helmetprovided);
	}
	
	
	
	
}
