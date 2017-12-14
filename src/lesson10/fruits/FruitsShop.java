package lesson10.fruits;

/**
 * Урок 10, задание 5
 * Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его.
 * Класс Фрукт содержит
 * a) переменную вес,
 * б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
 * в) метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике.
 * Метод должен учитывать вес фрукта.
 * Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов.
 * А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */

public class FruitsShop {
    public static void main(String[] args) {
        double sum = 0;
        Fruit[] fruit = new Fruit[3];
        fruit[0] = new Pear(1.2, 20);
        fruit[1] = new Apple(0.5, 15);
        fruit[2] = new Apricot(0.8, 18);

        for (Fruit f : fruit) {
            f.printManufacturerInfo();
            f.getCost();
            f.getWeight();
            f.costOfFruit();
            System.out.println(" " + f);
            sum += (double) f.getCost();
            System.out.println("Общая сумма: " + sum);
            System.out.println();
        }
    }
}
