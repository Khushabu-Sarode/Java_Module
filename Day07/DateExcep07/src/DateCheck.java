import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println(" Enter day ::");
			int day = sc.nextInt();
			
			System.out.print("Enter month  ::");
			int month = sc.nextInt();
			
			System.out.print("Enter Year :: ");
			int year = sc.nextInt();
			
			LocalDate dob = LocalDate.of(year, month, month);
			
			LocalDate currentDate = LocalDate.now();
			
			Period p = Period.between(dob,currentDate);
			
			int age = p.getYears();
			
			if(age >= 18) {
				System.out.println("valid");
				System.out.println("Age =  " + age);
			}else {
				throw new AgeException("Age is less than 18");
			}
			
		}
		catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
            System.out.println("Invalid date or input");
        }
		
	}

}
