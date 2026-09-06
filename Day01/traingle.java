public class traingle{
    public static void main(String[] args) {
        
        int n = 5;
        int i=1;
        while(i<=n){
            int spacec = n - i;
            int starc = 2 * i - 1;
            for(int is=0;is<spacec;is++){
                System.out.print(' ');
            }
            for(int j=0;j<starc;j++){
                System.out.print('*');
            }

            i++;
            System.out.println();

        }

    }
}