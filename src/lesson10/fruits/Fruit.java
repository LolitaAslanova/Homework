package lesson10.fruits;

abstract class Fruit {
    public double weight;
    double cost;

    public Fruit() {
    }

    public Fruit(double weight, double cost) {
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    final public void printManufacturerInfo() {
        System.out.print("Made in Ukraine ");
    }

    public void costOfFruit() {
        cost *= weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fruit fruit = (Fruit) o;

        if (Double.compare(fruit.weight, weight) != 0) return false;
        return Double.compare(fruit.cost, cost) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(cost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "weight=" + weight +
                ", cost=" + cost +
                '}';
    }
}
