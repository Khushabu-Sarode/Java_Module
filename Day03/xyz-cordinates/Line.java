public class Line{
    
    Points p1;
    Points p2;
    
    Line(Points p1,Points p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    void display(){
        System.out.println( p1.display() + "to" + p2.display());
    }

}