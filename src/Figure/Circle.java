package Figure;

public class Circle extends Shape {
    double rad;
    double cor;

    public Circle(double rad, double cor) {
        this.rad = rad;
        this.cor = cor;
    }

    public Circle(String color, double rad, double cor) {
    }

    public double draw() {
        System.out.println("Рисуем круг. ");
        return rad * cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Circle that = (Circle) o;

        if (Double.compare(that.rad, rad) != 0) return false;
        return Double.compare(that.cor, cor) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(rad);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cor);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "CircleClass{" +
                "rad=" + rad +
                ", cor=" + cor +
                "} " + super.toString();
    }
}
