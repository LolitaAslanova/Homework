package lesson8.phone;

public class PhoneClass {
    int number;
    String model;
    double weight;

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