public class Primeornot {
    public static void main(String[] args){
        int n = 3;
        boolean flag = true;
        for(int i=2;i<n;i++){
          if(n%i == 0){
             flag = false;
             break;
          }
        }


        if(flag == true){
            System.out.println("number is prime --> "  + n);
        }else{
            System.out.println("number is not prime --> " +n);
        }
    }  

}
