package lesson10.animal;

public class Cat extends Animal {
    public Cat() {
    }

    public double makeNoise() {
        System.out.println("Мяу. ");
        return makeNoise();
    }

    public double eat() {
        System.out.println("Молоко и рыба. ");
        return eat();
    }

    public double sleep() {
        System.out.println("Весь день. ");
        return sleep();
    }
}
