package lesson10.animal;

abstract public class Animal {
    String food, location;

    public Animal() {
    }

    abstract public double makeNoise();
    abstract public double eat();
    abstract public double sleep();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (food != null ? !food.equals(animal.food) : animal.food != null) return false;
        return location != null ? location.equals(animal.location) : animal.location == null;
    }

    @Override
    public int hashCode() {
        int result = food != null ? food.hashCode() : 0;
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "lesson10.animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
