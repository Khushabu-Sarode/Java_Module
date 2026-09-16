package Emp;
import java.io.Serializable;

public class Course implements Serializable {

    int courseid;
    String coursename;
    double fees;

    public Course(int courseid, String coursename, double fees) {
        this.courseid = courseid;
        this.coursename = coursename;
        this.fees = fees;
    }

    public void display() {
        System.out.println("Course ID: " + courseid);
        System.out.println("Course Name: " + coursename);
        System.out.println("Fees: " + fees);
    }
}