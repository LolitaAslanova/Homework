package lesson10.animal;

public class Dog extends Animal {

    public Dog() {
    }

    public double makeNoise() {
        System.out.println("Гав. ");
        return makeNoise();
    }

    public double eat() {
        System.out.println("Мясо. ");
        return eat();
    }

    public double sleep() {
        System.out.println("Бегает во сне. ");
        return sleep();
    }
}
