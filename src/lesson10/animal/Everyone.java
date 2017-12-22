package lesson10.animal;

/**
 * Урок 10, задание 4
 * Создать класс lesson10.animal и расширяющие его классы Dog, Cat, horse.
 * Класс lesson10.animal содержит переменные food, location и методы makeNoise, eat, sleep.
 * Dog, Cat, horse переопределяют методы makeNoise, eat.
 * Добавьте переменные в классы Dog, Cat, horse, характеризующие только этих животных.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает food и location пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару.
 */

public class Everyone {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Horse();
        animals[1] = new Cat();
        animals[2] = new Dog();
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}