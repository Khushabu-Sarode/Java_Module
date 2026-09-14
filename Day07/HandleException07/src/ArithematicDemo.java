
public class ArithematicDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try {
    	  int a = Integer.parseInt(args[0]);
    	  int b = Integer.parseInt(args[1]);
    	  String op = args[2];
    	  if(op.equals("+")) {
    		  System.out.println("Result = " + (a+b));
    	  }
    	  else if(op.equals("-")) {
    		  System.out.println("Result = " + (a-b));
    	  }
    	  else if(op.equals("*")) {
    		  System.out.println("Result = " + (a*b));
    	  }
    	  else if(op.equals("/")) {
    		  System.out.println("Result = " + (a/b));
    	  }
    	  else {
    		  System.out.println("invalid operation");
    	  }
      }
      catch(ArrayIndexOutOfBoundsException e) {
    	     System.out.println("plz provide 3 arguments");
      }
      
      catch(NumberFormatException e) {
     	  System.out.println("first two arguments must be numbrs");
      }
      catch(ArithmeticException e) {
    	     System.out.println("Cannot divide by Zero");
      }
	}

}
