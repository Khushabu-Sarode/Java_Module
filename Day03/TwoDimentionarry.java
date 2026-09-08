import java.util.Scanner;

public class TwoDimentionarry { 
     public static void main(String[] args){
        int [][] arr;
        arr = new int[3][3];
        int [] rowsum = new int[3];
        int [] colsum = new int[3];
       int sumofallele = 0;

       Scanner sc = new Scanner(System.in);
       System.out.println("enter elements : ");
       for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){

               arr[i][j] = sc.nextInt();
          }
       }

       for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             rowsum[i] += arr[i][j];
            }
       }

       System.out.println(" sum of the row :");
       for(int i=0;i<rowsum.length;i++){
          System.out.println(rowsum[i]);
       }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             colsum[i] += arr[j][i];
            }
         }

         System.out.println(" sum of the col :");
       for(int i=0;i<colsum.length;i++){
          System.out.println(colsum[i]);
       }

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
             sumofallele = sumofallele + arr[i][j];
            }
         }
           
         System.out.println("sum of all array :");
         System.out.print(sumofallele);
     }
} 

