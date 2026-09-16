package Demo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//import Emp.Course;
import Emp.Course;
import Emp.Date;

public class StudentDemo {

    public static void main(String[] args) {

        Course c1 = new Course(101, "Java", 50000);
        Course c2 = new Course(102, "C++", 45000);
        Course c3 = new Course(103, "Python", 40000);

        Student[] students = new Student[3];

        students[0] = new Student(
                "Rahul",
                new Date(10, 5, 2002),
                c1,
                "PRN101",
                22);

        students[1] = new Student(
                "Amit",
                new Date(15, 8, 2001),
                c2,
                "PRN102",
                23);

        students[2] = new Student(
                "Sneha",
                new Date(20, 2, 2003),
                c3,
                "PRN103",
                21);

        try {

            FileOutputStream fos =
                    new FileOutputStream("student.txt");

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(students);

            oos.close();
            fos.close();

            System.out.println("Students serialized successfully.");

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}