package lesson8.phone;

/**
 * Класс Phone. (Задание с урока)
 * a) Создайте класс Phone, который содержит переменные number, model и weight.
 * б) Создайте три экземпляра этого класса.
 * в) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 * getPhoneNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
 * г) Добавить конструктор в класс Phone, который принимает на вход параметры для инициализации переменных класса.
 * д) Добавить конструктор без параметров.
 * е) Вызвать из конструктора с параметрами конструктор по умолчанию.
 * ж) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
 */

public class Phone {
    public int number;
    public String model;
    public double weight;
    public String name;
    public int incomingCall;

    public Phone() {
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall() {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, int incomingCall) {
        System.out.println("Звонит " + name + incomingCall);
    }

    public int getPhoneNumber() {
        return number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone that = (Phone) o;

        if (number != that.number) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        return model != null ? model.equals(that.model) : that.model == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = number;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}