package Emp;

import java.io.Serializable;

public class Date implements Serializable {

    int day;
    int month;
    int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void display() {
        System.out.println(day + "/" + month + "/" + year);
    }
}