public class Reactangle {
   
     private int len;
     private int bre;

     Reactangle(){
        len = bre = 0;
     }

     Reactangle(int l,int b){
        len = l;
        bre = b;
     }

    double calarea(){
        return len * bre;
    }

    void display(){
        System.out.println(calarea());
    }

}
