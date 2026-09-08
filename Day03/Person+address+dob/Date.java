public class Date {
    private int day;
    private int mon;
    private int year;

    Date(){
        day = mon = year = 0;
    }

    Date (int d,int m,int y){
        day = d;
        mon = m;
        year = y;
    }

    public void display(){
        System.out.println("Date-of-brith : "+day +"/" + mon + "/" + year);
        
    }
}
