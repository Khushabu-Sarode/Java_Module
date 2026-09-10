package app;

import Rides.BikeRide;
import Rides.CarRide;

public class RideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BikeRide b = new BikeRide(
            101,
            "Khushabu",
            "MH12AB1234",
            true
        );

        CarRide c = new CarRide(
            102,
            "Sarode",
            true,
            5,
            "MH14CD5678"
        );

        System.out.println("----- Bike Ride -----");
        b.display();

        System.out.println();

        System.out.println("----- Car Ride -----");
        c.display();
        
        
	}

}
