package lesson10.fruits;

public class Apple extends Fruit {

    public void costOfFruit() {
        System.out.println("Цена яблок за " + weight + " кг: ");
        cost *= weight;
    }

    public Apple(double weight, double cost) {
        super(weight, cost);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", cost=" + cost +
                "} " + super.toString();
    }
}
