import  Project.utility.Person;
import  Project.utility.Date;

public class Test {
    public static void main(String[] args) {
        Date d1 = new Date(1,11,2003);
        Person p1 = new Person("ABC" ,d1);

        p1.display();
    }
}
