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
        PhoneClass myPhone = new PhoneClass();
        myPhone.number = 344565;
        myPhone.model = "samsung";
        myPhone.weight = 53.6;
        System.out.println("Данные первого телефона: " + "Номер " + myPhone.number + ", Модель " + myPhone.model + ", Вес " + myPhone.weight);

        PhoneClass SecondPhone = new PhoneClass();
        SecondPhone.number = 354515;
        SecondPhone.model = "lenovo";
        SecondPhone.weight = 34.3;
        System.out.println("Данные второго телефона: " + "Номер " + SecondPhone.number + ", Модель " + SecondPhone.model + ", Вес " + SecondPhone.weight);

        PhoneClass ThirdPhone = new PhoneClass();
        ThirdPhone.number = 453212;
        ThirdPhone.model = "meizu";
        ThirdPhone.weight = 43.2;
        System.out.println("Данные третьего телефона: " + "Номер " + ThirdPhone.number + ", Модель " + ThirdPhone.model + ", Вес " + ThirdPhone.weight);
    }
}
