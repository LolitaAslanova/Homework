package lesson10.fruits;

public class Pear extends Fruit {
    public void costOfFruit() {
        System.out.println("Цена груш за " + weight + " кг: ");
        cost *= weight;
    }

    public Pear(double weight, double cost) {
        super(weight, cost);
    }
}
