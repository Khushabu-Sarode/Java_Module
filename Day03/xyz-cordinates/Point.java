public class Point {

    private int x;
    private int y;

    Point(){
        x = y = 0;
    }
    
    Point(int x1,int y1){
        x = x1;
        y = y1;
    }

    void display(){
        System.out.println("[" + x + "," + y + "]");
    }
    
}
