package lesson9.studentAspirant;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public int getScholarship() {
        return scholarship;
    }

    public Aspirant(int scholarship) {
        this.scholarship = scholarship + 200;
        System.out.println("Aspirant");

    }
}
