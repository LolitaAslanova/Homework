package lesson9.car.vehicles;

public class Lorry extends Car {
    private int carrying;

    public Lorry(int carrying) {
        this.carrying = carrying;
    }

    public Lorry(String carClass, String marka, int carrying) {
        super(carClass, marka);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Lorry lorry = (Lorry) o;

        return carrying == lorry.carrying;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + carrying;
        return result;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
