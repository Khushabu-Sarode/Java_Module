package Project.utility;

public class Date {

    int day;
    int month;
    int year;

    static int count = 0;

    Date() {
        count++;

        System.out.println("Date objects created: " + count);
    }

    public  Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

        count++;

        System.out.println("Date objects created: " + count);
    }

    void display(){
        System.out.println(day + "/" + month + "/" + year);
       }
}

