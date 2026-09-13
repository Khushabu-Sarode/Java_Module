package Emp;

import Base.Date;
import Base.Emp;

public class Programmer extends Emp {
     
	private String projecttittle;
	private int extrahours;
	private double chargeperextrahour;
	
	
	
	public Programmer() {
		super();
		projecttittle = "tittle";
		extrahours = 0;
		chargeperextrahour = 0;
	}



	public Programmer(String name, Date dob, int empid, double salary, String projecttittle, int extrahours,
			double chargeperextrahour) {
		super(name, dob, empid, salary);
		this.projecttittle = projecttittle;
		this.extrahours = extrahours;
		this.chargeperextrahour = chargeperextrahour;
	}
	
	
	public void display() {
		System.out.println("Project tittle : " + projecttittle);
		System.out.println("Extra hours " + extrahours);
		System.out.println("chargr per extra hour" + chargeperextrahour);
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "peoject tittle :" + projecttittle + "extra hours" + extrahours + "chargers extra hours :: " + chargeperextrahour;
	}



	
	
}
