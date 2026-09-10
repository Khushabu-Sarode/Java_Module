package Rides;

public class CarRide extends Ride {
   private boolean acAvailable;
   private int seatingcap;
   private String carNum;
   
   public CarRide() {
	   super();
	   acAvailable = false;
	   seatingcap = 0;
	   carNum = "0000";
   }
   
   public CarRide(int rideint, String custname, boolean acAvailable, int seatingcap, String carNum) {
	super(rideint, custname);
	this.acAvailable = acAvailable;
	this.seatingcap = seatingcap;
	this.carNum = carNum;
   }
   
   public void display() {
	   System.out.println("AC Available ::"  + acAvailable);
	   System.out.println(" seating cap  :: " + seatingcap);
	   System.out.println( " Car number :: " + carNum);
   }
   
}
