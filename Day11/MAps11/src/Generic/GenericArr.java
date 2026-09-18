package Generic;

class Arrayoperation{
	 public static <T> void printarry( T [] arr) {
		 for(T x: arr) {
			 System.out.print(x + " ");
		 }
		 System.out.println();
	 }
	 public static <T> boolean search(T[] arr,T key) {
		 boolean flag = false;
		 for(T n:arr) {
			 if(n.equals(key)) {
				 flag = true;
			 }
		 }
		 return flag;
	 }
}

public class GenericArr {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Integer[] a = {1,2,3,4,6};
     Arrayoperation.printarry(a);
     System.out.println(Arrayoperation.search(a,3));
     
     String[] st = {"abc","def","ghi","jkl"};
     Arrayoperation.printarry(st);
     System.out.println( Arrayoperation.search(st,"def"));
     
     
	}

}
