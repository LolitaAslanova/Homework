package lesson9.car.vehicles;

/**
 * Урок 9, задание 3
 * Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver
 * в пакете com.company.professions. Класс Driver содержит поля - ФИО, стаж вождения.
 * Класс Engine содержит поля - мощность, производитель.
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, вес, водитель типа Driver, мотор типа Engine.
 * Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать:
 * "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево".
 * А также метод printInfo(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
 * Пусть класс Driver расширяет класс Person.
 */

public class Car {
    private String carClass;
    private String marka;

    private void start(){
        System.out.println("Поехали.");
    }
    private void stop(){
        System.out.println("Останавливаемся.");
    }
    private void turnRight(){
        System.out.println("Поворот направо");
    }
    private void turnLeft(){
        System.out.println("Поворот налево");
    }
}
