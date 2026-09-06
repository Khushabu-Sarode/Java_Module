public class Greatestthree {
    public static void main(String[] args) {
        int a = 22;
        int b = 43;
        int c = 12;

        int max = (a>b && a>c) ? a :
                  (b>c && b>a) ? b :
                  c;

       
        System.out.println("maximum number :: "+max);


        // if(a>b && a>c){
        //     System.out.print(a + " : is greater ");
        // }else if(b>c && b>a){
        //     System.out.print(b +" : is greater");
        // }else{
        //     System.out.print(c + " :is greater ");
        // }
    }
}
