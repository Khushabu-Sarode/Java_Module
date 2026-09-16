package Emp;

import java.io.Serializable;

public class Person implements Serializable {

    String name;
    Date dob;

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    protected void display() {
        System.out.println("Name: " + name);
        System.out.println("DOB: " + dob.day + "/" + dob.month + "/" + dob.year);
    }
}