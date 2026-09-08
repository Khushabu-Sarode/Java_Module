public class ReactangleDemo {

    public static void main(String[] args) {

       
        Point p1 = new Point(0, 0);
        Point p2 = new Point(10, 0);
        Point p3 = new Point(10, 10);
        Point p4 = new Point(0, 10);

        
        Line l = new Line(p1, p2);

        
        Triangle t = new Triangle(p1, p2, p3);

        
        Rectangle r = new Rectangle(p1, p2, p3, p4);

  
        l.display();
        t.display();
        r.display();
    }

}
