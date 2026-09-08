import java.util.Scanner;

public class maximumNminimum {

    public static void main(String[] args ){
        
        int [] arr = new int[5];
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array ele : ");
        for(int i=0;i<arr.length;i++){
          arr[i] = sc.nextInt();
        }
        int maxx = arr[0];
        int minn = arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(maxx < arr[i]){
                maxx = arr[i];
            }
        }

        for(int i=0;i<arr.length;i++){
            if(minn > arr[i]){
                minn = arr[i];
            }
        }

        System.out.println("maximum number is :: "+maxx);

        System.out.println("minimum number is ::"+minn);

    
        sc.close();

    }


    
}
