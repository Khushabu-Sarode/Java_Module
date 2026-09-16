package Demo;
import Emp.Course;
import Emp.Date;
import Emp.Person;

public class Student extends Person {

    Course course;
    String PRN;
    transient int age;

    public Student(String name, Date dob,
                   Course course, String PRN, int age) {

        super(name, dob);

        this.course = course;
        this.PRN = PRN;
        this.age = age;
    }

    protected void display() {

        super.display();

        System.out.println("PRN: " + PRN);
        System.out.println("Age: " + age);

        course.display();
    }
}