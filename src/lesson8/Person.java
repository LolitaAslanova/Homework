package lesson8;

/**
 * Урок 8, задание 2
 * Создать класс Person, который содержит:
 * a) поля fullName, age.
 * б) методы move() и talk().
 * в) Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса.
 * Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 */

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    private void move() {
    }

    private void talk() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person fullName %s, age %d", fullName, age);
    }

    public static void main(String[] args) {
        Person ira = new Person();
        Person kat = new Person("Ekaterina", 22);
        System.out.println(ira);
        System.out.println(kat);
    }
}