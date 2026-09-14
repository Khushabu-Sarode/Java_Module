import java.util.Scanner;

public class ArrayExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        try {
        	System.out.print("Enter array size: ");
        	int size = sc.nextInt();
        	
        	int[] arr = new int[size];
        	
        	System.out.println("enter ele : ");
        	
        	for(int i=0;i<size;i++) {
        		arr[i] = sc.nextInt();
        	}
        	
        	System.out.println("enter index ::");
        	int index = sc.nextInt();
        	
        	System.out.println("Ele ::" + arr[index]);
        	
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	 System.out.print("Invalid index");
        }
        catch(NegativeArraySizeException e) {
        	 System.out.print("Array size cannot be negative");
        }
        catch(Exception e) {
        	System.out.print("invalid input");
        }
        
	}

}
