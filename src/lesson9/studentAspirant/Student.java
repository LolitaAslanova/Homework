package lesson9.studentAspirant;

public class Student {
    String firstName;
    String lastName;
    String group;
    int scholarship;

    public Student() {
    }

    int getScholarship() {
        return scholarship;
    }

    public Student(int scholarship) {
        this.scholarship = scholarship;
        System.out.println("Student");
    }
}
