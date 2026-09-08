class Student {

    int sid;
    String name;
    int[] marks;

    Student(int sid, String name, int[] marks) {
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    double calAverage() {

        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return (double) sum / marks.length;
    }

    void display() {

        System.out.println("ID: " + sid);
        System.out.println("Name: " + name);

        System.out.print("Marks: ");

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }

        System.out.println();
        System.out.println("Average: " + calAverage());
    }
}
