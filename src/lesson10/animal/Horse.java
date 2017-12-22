package lesson10.animal;

public class Horse extends Animal {
    public Horse() {
    }
    public double makeNoise(){
        System.out.println("Игого. ");
        return makeNoise();
    }
    public double eat(){
        System.out.println("Сено. ");
        return eat();
    }
    public double sleep(){
        System.out.println("Стоя. ");
        return sleep();
    }

    @Override
    public String toString() {
        return "horse{} " + super.toString();
    }
}
