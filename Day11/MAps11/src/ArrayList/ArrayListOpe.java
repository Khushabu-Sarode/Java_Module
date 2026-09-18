package ArrayList;

import java.util.Arrays;

public class ArrayListOpe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int []arr2 = {11,22,33,44,55,66,77,88};
		System.out.println(Arrays.toString(arr2));
		
		
//		int []arr = new int[10];
		Arrays.fill(arr2,2,4,5);
		System.out.println(Arrays.toString(arr2));
		
		int[] clonedarr = arr2.clone();
		System.out.println(Arrays.toString(clonedarr));
		
	   boolean result = 	Arrays.equals(arr2,clonedarr);
	   System.out.print(result);
	   
	   Arrays.sort(arr2,1,5);
	   System.out.println(Arrays.toString(arr2));
	}

}
