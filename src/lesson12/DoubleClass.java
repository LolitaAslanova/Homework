package lesson12;

/**
 * Урок 12, задание 3
 * Создайте объекты класса Double, используя все имеющиеся конструкторы.
 * Создайте объекты класса Double, используя методы valueOf().
 * Преобразовать значение типа String к типу double.
 * Используем метод Double.parseDouble().
 * Преобразовать объект класса Double ко всем примитивным типам.
 * Вывести значение объекта Double на консоль.
 * Преобразовать литерал типа double к строке String d = Double.toString(3.14);
 * Заменить конструктор на упаковку. (Замена в aDouble1).
 */

public class DoubleClass {
    public static void main(String[] args) {
        Double aDouble1 = 2.66;
        double aDouble2 = Double.parseDouble("23.46");
        Double aDouble3 = Double.valueOf(3.875);
        double aDouble4 = Double.parseDouble("2.975");
        String d = Double.toString(3.14);

        System.out.println("Первое значение " + aDouble1);
        System.out.println("Второе значение " + aDouble2);
        System.out.println("Третье значение " + aDouble3);
        System.out.println("Четвертое значение " + aDouble4);

        System.out.println("Метод value");
        System.out.println(aDouble1.byteValue());
        System.out.println(aDouble1.doubleValue());
        System.out.println(aDouble1.floatValue());
        System.out.println(aDouble1.shortValue());
        System.out.println(aDouble1.shortValue());
        System.out.println(aDouble1.intValue());

        System.out.println("Double.toString " + d);
    }
}

