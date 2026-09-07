public class Calculator {

    private int n1;
    private int n2;

    Calculator(){
        n1 = n2 = 0;
    }

    Calculator(int n,int m){
         n1 = n;
         n2 = m;
    }
 
    void display(){
     System.out.println("Addition : " + n1+n2); 
     System.out.println("Substraction : " + (n1-n2)); 
     System.out.println("Multiplication :" + n1*n2); 
     System.out.println("Division :" + (n1/n2));
     
    }

    
}
