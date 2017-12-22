package lesson9.studentAspirant;

public class Aspirant extends Student {
    private String scienceWork;

    public Aspirant(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public String getScienceWork() {
        return scienceWork;
    }

    public void setScienceWork(String scienceWork) {
        this.scienceWork = scienceWork;
    }

    public Aspirant(int scholarship) {
        this.scholarship = scholarship + 200;
        System.out.println("Aspirant");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Aspirant aspirant = (Aspirant) o;

        return scienceWork != null ? scienceWork.equals(aspirant.scienceWork) : aspirant.scienceWork == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (scienceWork != null ? scienceWork.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scienceWork='" + scienceWork + '\'' +
                "} " + super.toString();
    }
}
