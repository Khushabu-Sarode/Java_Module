public class fibonum {

    public static void main(String[] args) {
        int n = 10;
        int i = 1;
        int a = 1;
        int b = 1;

        while(i<=n){
         
            System.out.print(a +" ");

            int c = a + b;
            a = b;
            b = c;
            i++;
        }

    }
}
