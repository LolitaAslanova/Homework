package lesson10.fruits;

public class Apricot extends Fruit {
    public void costOfFruit() {
        System.out.println("Цена абрикос за " + weight + " кг: ");
        cost *= weight;
    }

    public Apricot(double weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "weight=" + weight +
                ", cost=" + cost +
                "} " + super.toString();
    }
}
