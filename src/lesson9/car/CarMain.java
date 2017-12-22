package lesson9.car;

import lesson9.car.professions.Driver;
import lesson9.car.vehicles.Car;

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

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setCarClass("A");
        car1.setMarka("BMW");
        car1.start();
        Driver d1 = new Driver();
        d1.setFullName("Alexandr");
        d1.setAge(35);
        d1.setExperience(12);
        System.out.println("Водитель " + d1.getFullName() + " за машиной класса " + car1.getCarClass() + " марки " + car1.getMarka());
        car1.stop();
    }
}
