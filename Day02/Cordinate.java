public class Cordinate {

    private int x;
    private int y;

    Cordinate(){
        x = y = 0;
    }

    Cordinate(int xx,int yy){
        x = xx;
        y = yy;
    }

    void display(){
        System.out.println("["+x +"," + y + "]");
    }
    
}
