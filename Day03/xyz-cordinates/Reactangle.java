class Rectangle {

    Point p1;
    Point p2;
    Point p3;
    Point p4;

    Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    void display() {
        System.out.println("Rectangle: "
                + p1.display() + " "
                + p2.display() + " "
                + p3.display() + " "
                + p4.display());
    }
}