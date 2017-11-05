package Figure;

public class Rectangle extends Shape {
    double firstDot;
    double secondDot;

    public Rectangle() {
    }

    public Rectangle(String color, double firstDot, double secondDot) {
        //super (color, firstDot,secondDot);
    }

    public double draw(){
        System.out.println("Рисуем прямоугольник. ");
        return firstDot-secondDot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Rectangle that = (Rectangle) o;

        if (Double.compare(that.firstDot, firstDot) != 0) return false;
        return Double.compare(that.secondDot, secondDot) == 0;

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(firstDot);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(secondDot);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "RectangleClass{" +
                "firstDot=" + firstDot +
                ", secondDot=" + secondDot +
                "} " + super.toString();
    }
}
