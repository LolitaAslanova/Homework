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
package lesson8.phone;

public class PhoneData {

    public static void main(String args[]) {
        Phone myPhone = new Phone();
        myPhone.number = 344565;
        myPhone.model = "samsung";
        myPhone.weight = 153.6;
        myPhone.name = "Lola";
        System.out.println("Данные первого телефона: " + "Номер " + myPhone.number + ", Модель " + myPhone.model + ", Вес " + myPhone.weight);
        myPhone.receiveCall();

        Phone secondPhone = new Phone();
        secondPhone.number = 354515;
        secondPhone.model = "lenovo";
        secondPhone.weight = 134.3;
        secondPhone.name = "Mark";
        System.out.println("Данные второго телефона: " + "Номер " + secondPhone.number + ", Модель " + secondPhone.model + ", Вес " + secondPhone.weight);
        secondPhone.receiveCall();

        Phone thirdPhone = new Phone();
        thirdPhone.number = 453212;
        thirdPhone.model = "meizu";
        thirdPhone.weight = 143.2;
        thirdPhone.name = "Ira";
        System.out.println("Данные третьего телефона: " + "Номер " + thirdPhone.number + ", Модель " + thirdPhone.model + ", Вес " + thirdPhone.weight);
        thirdPhone.receiveCall();
    }
}
