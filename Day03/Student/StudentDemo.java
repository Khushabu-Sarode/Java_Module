
public class StudentDemo {

    public static void main(String[] args) {

        Student[] s = new Student[5];

        s[0] = new Student(1, "nirva", new int[]{70, 80, 90});
        s[1] = new Student(2, "Riya", new int[]{80, 85, 90});
        s[2] = new Student(3, "Priya", new int[]{90, 95, 85});
        s[3] = new Student(4, "Neha", new int[]{60, 70, 80});

        Student highest = s[0];

        for (int i = 1; i < s.length; i++) {

            if (s[i].calAverage() > highest.calAverage()) {
                highest = s[i];
            }
        }

        System.out.println("Student with highest average:");
        highest.display();
    }
}