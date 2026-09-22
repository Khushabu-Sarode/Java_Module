package FindDivisor;

import java.util.Scanner;

public class finddivisorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int n1 = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int n2 = sc.nextInt();

	        System.out.print("Enter third number: ");
	        int n3 = sc.nextInt();

		finddivisor f1 = new finddivisor(n1);
		finddivisor f2 = new finddivisor(n2);
		finddivisor f3 = new finddivisor(n3);
		
		f1.start();
		f2.start();
		f3.start();
	}

}
